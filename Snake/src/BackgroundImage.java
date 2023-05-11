import javax.swing.*;
import java.awt.*;

public class BackgroundImage extends JPanel {
    Image Pic;

    public BackgroundImage() {
        ImageIcon icon = new ImageIcon("src/class.jpg");
        Pic = icon.getImage();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(Pic, 0, 0, null);
    }

    public static void main(String[] args)
    {
        JFrame f = new JFrame("Background Image");
        BackgroundImage Pic = new BackgroundImage();
        f.setSize(1000, 800);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(Pic);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

}