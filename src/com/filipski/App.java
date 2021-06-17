package com.filipski;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class App {
    private JButton buttonConvert;
    private JPanel panelMain;
    private JTextField celTemp;
    private JLabel farTemp;
    private JSlider farSlider;
    private static ImageIcon img = new ImageIcon("Status-weather-clear-icon.png");

    public App() {
        buttonConvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double celTempVal = Double.parseDouble(celTemp.getText());
                double farTempVal = celTempVal * 9/5 + 32;
                farTemp.setText(String.valueOf(farTempVal));
                farSlider.setValue((int) farTempVal);
            }
        });
        farSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                farTemp.setText(String.valueOf(farSlider.getValue()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Celsius to Fahrenheit");
        frame.setIconImage(img.getImage());
        frame.setContentPane(new App().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
