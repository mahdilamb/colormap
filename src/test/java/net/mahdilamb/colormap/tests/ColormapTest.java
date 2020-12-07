package net.mahdilamb.colormap.tests;

import net.mahdilamb.colormap.Colormap;
import net.mahdilamb.colormap.ColormapNode;
import net.mahdilamb.colormap.DynamicColormap;
import net.mahdilamb.colormap.color.ColorImpl;
import net.mahdilamb.colormap.sequential.perceptuallyuniform.Viridis;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

@SuppressWarnings("unchecked")
public class ColormapTest {
    static class ColorMapCellRenderer implements ListCellRenderer<Colormap> {
        private final DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();

        @Override
        public Component getListCellRendererComponent(JList<? extends Colormap> list, Colormap value, int index,
                                                      boolean isSelected, boolean cellHasFocus) {
            final JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value.toString().split("\\.").length == 3 ? value.toString().replace(".Reversed", "") : value.toString(), index, isSelected, cellHasFocus);
            renderer.setIcon(new ColorBar(list, value));
            return renderer;
        }

        static class ColorBar implements Icon {
            final Colormap colorMap;
            final JList<? extends Colormap> list;

            public ColorBar(JList<? extends Colormap> list, Colormap colorMap) {
                this.colorMap = colorMap;
                this.list = list;
            }

            @Override
            public void paintIcon(Component c, Graphics g, int x, int y) {
                for (int i = 0; i < getIconWidth(); i++) {
                    final double j = ((double) i) / getIconWidth();
                    g.setColor(new java.awt.Color(colorMap.colorAt(j).asDecimal()));
                    g.drawLine(i, 1, i, getIconHeight() - 1);
                }
            }

            @Override
            public int getIconWidth() {
                return 75;
            }

            @Override
            public int getIconHeight() {
                return 22;
            }
        }

    }

    static class ColorLabel extends JLabel {

        private static final long serialVersionUID = -5090637998127930769L;
        final ColormapNode color;

        ColorLabel(Double value, Colormap cmap) {
            setText(String.format("%.2f", value));
            setAlignmentX(SwingConstants.LEFT);
            color = cmap.getColorFromValue(value);

            color.getColor().addListener((net.mahdilamb.colormap.color.Color color) -> SwingUtilities.invokeLater(() -> {
                final Border border = BorderFactory.createCompoundBorder(
                        BorderFactory.createLineBorder(new java.awt.Color(color.asDecimal()), 0),
                        BorderFactory.createCompoundBorder(
                                BorderFactory.createLineBorder(UIManager.getColor("Panel.background"), 1),
                                BorderFactory.createLineBorder(new java.awt.Color(color.asDecimal()), 2)));
                ColorLabel.this.setBorder(border);
            }));

        }
    }

    public static void main(String... args) {
        final JFrame frame = new JFrame();

        final DynamicColormap cmap = new DynamicColormap(new Viridis());
        frame.getContentPane().setLayout(new GridBagLayout());
        final JPanel colors = new JPanel(new GridLayout(10, 10));
        colors.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                final ColorLabel selected = (ColorLabel) colors.getComponentAt(e.getX(), e.getY());

                if (e.getButton() == 3 && colors.getComponentAt(e.getX(), e.getY()) instanceof ColorLabel) {
                    selected.color.remove();
                    colors.remove(selected);
                    colors.repaint();

                } else if (e.getButton() == 1 && e.getClickCount() == 2) {
                    String inputValue = JOptionPane.showInputDialog("Please input a value");
                    try {
                        final Double newValue = Double.parseDouble(inputValue);
                        selected.color.setValue(newValue);
                        selected.setText(String.format("%.2f", newValue));
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                }
            }
        });
        final GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        frame.add(colors, gbc);
        final JPanel colorTools = new JPanel(new GridBagLayout());
        frame.add(colorTools, gbc);
        final DefaultComboBoxModel<Colormap> cbModel = new DefaultComboBoxModel<>();
        final JComboBox<Colormap> cb = new JComboBox<>(cbModel);
        cb.setRenderer(new ColorMapCellRenderer());

        colorTools.add(cb);
        Colormap.listDefaultColorMaps().forEach(cmapName -> {
            cbModel.addElement(Colormap.get(cmapName));
            if (cmapName.compareTo("SEQUENTIAL.Viridis") == 0) {
                cb.setSelectedIndex(cbModel.getSize() - 1);
            }
        });

        for (double i = 0; i <= 1; i += 0.005) {
            colors.add(new ColorLabel(i, cmap));
        }
        //FormInput<Double> valInput = new DoubleVariable(0).factory();

        //colorTools.add(valInput.getComponent());
				/*JButton btn = new JButton("Add");
				btn.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						MantisUtils.edtTaskInvokeLater(()->{
							colors.add(new net.mahdilamb.test.ColorLabel(valInput.getValidatedValue(),cmap));
							valInput.setValue("");
							frame.pack();
						});
					}
				});
				btn.setEnabled(false);
				colorTools.add(btn);*/
        final JCheckBox reversed = new JCheckBox("reverse?");
        reversed.addActionListener(e -> cmap.setReversed(((JCheckBox) e.getSource()).isSelected()));
        colorTools.add(reversed);
				/*valInput.addInputChangeListener(new MantisInputChangeListener<Double>() {
					@Override
					public void inputChanged(MantisInputChangeListener<Double> source, Object value, Double validatedValue, boolean isValid) {
						btn.setEnabled(isValid);
					}
				});*/

        cb.addActionListener(e -> {
            cmap.setColorMap((Colormap) ((JComboBox<Colormap>) e.getSource()).getSelectedItem());
            cmap.setReversed(reversed.isSelected());
        });
        frame.pack();
        frame.setVisible(true);

    }


}
