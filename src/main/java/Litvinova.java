import javax.swing.*;

public class Litvinova {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo application");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }
    private static void placeComponents(JPanel panel) {

        panel.setLayout(null);
        String[] petStrings = { "+", "-", "/", "*" };

        final JTextField jTextField = new JTextField(10);
        jTextField.setBounds(10, 40, 80, 25);
        panel.add(jTextField);

        final JComboBox<String> method = new JComboBox<String>(petStrings);
        method.setBounds(125,40,50,25);
        panel.add(method);

        final JLabel jLabel = new JLabel();
        jLabel.setBounds(125,65,80,25);
        panel.add(jLabel);

        final JTextField jTextField1 = new JTextField(20);
        jTextField1.setBounds(200, 40, 80, 25);
        panel.add(jTextField1);

        JButton loginButton = new JButton("Calculate");
        loginButton.setBounds(115, 100, 100, 25);

        loginButton.addActionListener(e -> {
                    String value;
                    int fValue = Integer.parseInt(jTextField.getText());
                    int sValue = Integer.parseInt(jTextField1.getText());
                    value=method.getSelectedItem().toString();
                    switch (value) {
                        case "+":
                            jLabel.setText(Integer.toString(fValue + sValue));
                            break;
                        case "-":
                            jLabel.setText(Integer.toString(fValue - sValue));
                            break;
                        case "*":
                            jLabel.setText(Integer.toString(fValue * sValue));
                            break;
                        case "/":
                            jLabel.setText(Float.toString((float) fValue / (float) sValue));
                            break;
                    }
                }
        );
        panel.add(loginButton);

    }
}
