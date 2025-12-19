package interfaceAnwendung;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartApp {
    public static void main(String[] args) {
        // Hauptfenster
        JFrame frame = new JFrame("Mein erstes Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLayout(new BorderLayout());

        // -------------------------
        // 1. Menüleiste oben
        // -------------------------
        JMenuBar menuBar = new JMenuBar();

        JMenu menuDatei = new JMenu("Datei");
        JMenuItem itemBeenden = new JMenuItem("Beenden");
        itemBeenden.addActionListener(e -> System.exit(0));
        menuDatei.add(itemBeenden);

        JMenu menuHilfe = new JMenu("Hilfe");
        JMenuItem itemInfo = new JMenuItem("Info");
        itemInfo.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Dies ist ein Beispiel-Interface."));
        menuHilfe.add(itemInfo);

        menuBar.add(menuDatei);
        menuBar.add(menuHilfe);

        frame.setJMenuBar(menuBar);

        // -------------------------
        // 2. Bild in der Mitte
        // -------------------------
        ImageIcon icon = new ImageIcon("bild.png"); // <-- eigenes Bild hier einfügen
        JLabel bildLabel = new JLabel(icon, SwingConstants.CENTER);

        frame.add(bildLabel, BorderLayout.CENTER);

        // -------------------------
        // 3. Unten Eingabebereich
        // -------------------------
        JPanel untenPanel = new JPanel();
        untenPanel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Gib deinen Namen ein:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Klick mich!");
        JLabel output = new JLabel("");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                output.setText("Hallo, " + name + "!");
            }
        });

        untenPanel.add(label);
        untenPanel.add(textField);
        untenPanel.add(button);
        untenPanel.add(output);

        frame.add(untenPanel, BorderLayout.SOUTH);

        // -------------------------
        // Fenster sichtbar machen
        // -------------------------
        frame.setVisible(true);
    }
}