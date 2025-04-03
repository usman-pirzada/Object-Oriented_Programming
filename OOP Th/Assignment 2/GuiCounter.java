import javax.swing.*;
import javax.swing.border.AbstractBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class GuiCounter {
    private int count = 0;
    // Maintain history of previous 10 counts on resetting
    private LinkedList<Integer> countHistory = new LinkedList<>();

    public GuiCounter() {
        JFrame frame = new JFrame("GUI Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);

        // Set a colorful background for the content pane
        frame.getContentPane().setBackground(new Color(173, 216, 230)); // light blue

        JLabel label = new JLabel("Count: " + count, SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        label.setForeground(Color.DARK_GRAY);

        JTextField startField = new JTextField(5); // Input field for starting number
        startField.setToolTipText("Enter a starting number and press Enter");
        startField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    count = Integer.parseInt(startField.getText());
                    label.setText("Count: " + count);
                } catch (NumberFormatException ex) {
                    startField.setText(""); // Clear invalid input
                    label.setText("Invalid number!");
                }
            }
        });

        // Before creating panels and buttons, set a custom font and background color
        JButton incrementButton = new JButton("Increment");
        JButton decrementButton = new JButton("Decrement");
        JButton resetButton = new JButton("Reset");
        JButton historyButton = new JButton("⋮");

        // Set button colors and custom rounded borders
        Color btnColor = new Color(135, 206, 250); // sky blue
        for (JButton btn : new JButton[]{incrementButton, decrementButton, resetButton, historyButton}) {
            btn.setBackground(btnColor);
            btn.setForeground(Color.DARK_GRAY);
            btn.setBorder(new RoundedBorder(10));
        }

        incrementButton.setMnemonic('I'); // Shortcut: Alt + I
        decrementButton.setMnemonic('D'); // Shortcut: Alt + D
        resetButton.setMnemonic('R');     // Shortcut: Alt + R

        incrementButton.setFocusable(true);
        decrementButton.setFocusable(true);
        resetButton.setFocusable(true);
        historyButton.setFocusable(true);

        // Key bindings for Enter triggering button click
        incrementButton.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("ENTER"), "click");
        incrementButton.getActionMap().put("click", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                incrementButton.doClick();
            }
        });
        decrementButton.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("ENTER"), "click");
        decrementButton.getActionMap().put("click", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                decrementButton.doClick();
            }
        });
        resetButton.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("ENTER"), "click");
        resetButton.getActionMap().put("click", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // On reset, add current count to history
                countHistory.add(count);
                if (countHistory.size() > 10) {
                    countHistory.removeFirst();
                }
                count = 0;
                label.setText("Count: " + count);
            }
        });
        historyButton.getInputMap(JComponent.WHEN_FOCUSED).put(KeyStroke.getKeyStroke("ENTER"), "click");
        historyButton.getActionMap().put("click", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                historyButton.doClick();
            }
        });

        // History button action: show popup menu with history items
        historyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPopupMenu popup = new JPopupMenu();
                // Add history items (using a copy so order remains unchanged)
                for (Integer h : countHistory) {
                    final int historyValue = h;
                    JMenuItem item = new JMenuItem(String.valueOf(historyValue));
                    item.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            count = historyValue;
                            label.setText("Count: " + count);
                        }
                    });
                    popup.add(item);
                }
                popup.show(historyButton, 0, historyButton.getHeight());
            }
        });

        // Allow focus traversal using keyboard
        frame.getContentPane().setFocusTraversalKeysEnabled(true);

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                label.setText("Count: " + count);
            }
        });
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                label.setText("Count: " + count);
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.setBackground(new Color(224, 255, 255)); // light cyan
        inputPanel.add(new JLabel("Start from:"));
        inputPanel.add(startField);
        inputPanel.add(historyButton);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(new Color(224, 255, 255)); // light cyan
        buttonPanel.add(incrementButton);
        buttonPanel.add(decrementButton);
        buttonPanel.add(resetButton);

        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.CENTER);
        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GuiCounter();
    }
}

class RoundedBorder extends AbstractBorder {
    private int radius;

    public RoundedBorder(int radius) {
        this.radius = radius;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(c.getForeground());
        g2d.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(radius, radius, radius, radius);
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.left = radius;
        insets.top = radius;
        insets.right = radius;
        insets.bottom = radius;
        return insets;
    }
}
