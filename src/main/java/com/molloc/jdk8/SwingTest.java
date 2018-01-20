package com.molloc.jdk8;

import javax.swing.*;

/**
 * @author yanleichang
 */
public class SwingTest {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("my jframe");
        JButton jButton = new JButton("my jbuttom");

        jButton.addActionListener(e -> System.out.println("Button Pressed!"));

        jFrame.add(jButton);
        jFrame.pack();
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
