
import javax.swing.*;

public class GUI {
    public GUI() {
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JLabel label = new JLabel("Hello, World!");
        frame.getContentPane().add(label);

        JButton button = new JButton("Click me!");
        button.addActionListener(e -> label.setText("Button clicked!"));
        frame.getContentPane().add(button);

        frame.setVisible(true);
    }
}
