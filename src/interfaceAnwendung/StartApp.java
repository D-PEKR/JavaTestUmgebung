package interfaceAnwendung;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartApp {
    static void main(String[] args) {
        // Hauptfenster
        JFrame frame = new JFrame("Mein erstes Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(new FlowLayout());
        frame.setBackground(Color.pink);
        frame.setLayout(new BorderLayout());

        // Komponenten
        JLabel label = new JLabel("Gib deinen Namen ein:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Klick mich!");
        JLabel output = new JLabel("");

        // Komponente 2
        JLabel label2 = new JLabel("Gib deinen Namen ein:");
        JTextField textField2 = new JTextField(15);
        JButton button2 = new JButton("Klick mich!");
        JLabel output2 = new JLabel("");

        // Button-Event
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                output.setText("Hallo, " + name + "!");
            }
        });

        // Komponenten ins Fenster
        frame.add(label);
        frame.add(label2);
        frame.add(textField);
        frame.add(button);
        frame.add(output);

        // Sichtbar machen
        frame.setVisible(true);




        JLabel oben = new JLabel("Text oben", SwingConstants.CENTER);
        JLabel unten = new JLabel("Text unten", SwingConstants.CENTER);
        JLabel mitte = new JLabel("Text in der Mitte", SwingConstants.CENTER);

        frame.add(oben, BorderLayout.NORTH);
        frame.add(unten, BorderLayout.SOUTH);
        frame.add(mitte, BorderLayout.CENTER);

    }
}
