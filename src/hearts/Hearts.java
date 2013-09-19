package hearts;

import java.awt.GraphicsEnvironment;
import java.awt.Point;

import javax.swing.JFrame;

public class Hearts
{
    private static MainPanel mainPanel;
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Hearts");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mainPanel = new MainPanel(frame);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        
        frame.setResizable(false);
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        frame.setLocation(center.x - (frame.getWidth() / 2), center.y - (frame.getHeight() / 2));
        
        frame.setVisible(true);
    }
}