import javax.swing.*;

public class GMFR extends JFrame
{
    GMFR()
    {
        this.add(new GMPNL());
        this.setTitle("SNAKE");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}