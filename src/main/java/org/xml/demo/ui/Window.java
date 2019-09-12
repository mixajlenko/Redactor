package org.xml.demo.ui;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public static void main(String[] args) {
        Window window = new Window();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setTitle("Graphic editor v.1");
        window.add(new GraphicArea());

        window.save();
        window.setSize(700, 700);

        window.setVisible(true);
    }

    public  void save(){
        JPanel buttonPanel = new JPanel();
        JToggleButton save = new JToggleButton("Save");
        save.addActionListener((e) -> {
            //
        });
        buttonPanel.add(save);
        add(buttonPanel, BorderLayout.PAGE_START);
    }


}
