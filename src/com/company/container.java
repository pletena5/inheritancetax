package com.company;
import java.awt.*;
import java.awt.LayoutManager2;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class container {
    public container(String Text){
        GraphicsEnvironment graphics = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice device = graphics.getDefaultScreenDevice();

        JLabel label1 = new JLabel(Text, JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        label1.setHorizontalTextPosition(JLabel.CENTER);
        //label1.setFont("Courier New");

        JFrame frame = new JFrame("FrameDemo");
        device.setFullScreenWindow(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(label1 , BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
