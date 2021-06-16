package com.filipski;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton buttonConvert;
    private JPanel panelMain;
    private JTextField celTemp;
    private JLabel farTemp;

    public App() {
        buttonConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double celTempVal = Double.parseDouble(celTemp.getText());
                double farTempVal = celTempVal * 9/5 + 32;
                farTemp.setText(String.valueOf(farTempVal));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Celsius to Fahrenheit");
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
