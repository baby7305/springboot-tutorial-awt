package com.example.awt.demo;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class StarterApplication extends Frame {
    public static void main(String args[]) {
        StarterApplication app =
                new StarterApplication("Starter Application");

        app.setSize(300, 100);
        app.show();
        System.out.println("StarterApplication::main()");
    }

    public StarterApplication(String frameTitle) {
        super(frameTitle);
        add(new Label("Starter", Label.CENTER), "Center");

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event) {
                dispose();
                System.exit(0);
            }
        });
    }
}
