import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;


public class GMPNL extends JPanel implements ActionListener
{
    static final int ScrWidth = 700;
    static final int ScrHeight = 700;
    static final int EleSIZE = 40;
    static final int GMELE = (ScrWidth * ScrHeight) / EleSIZE;
    static final int SLOW = 75;
    final int[] t = new int[GMELE];
    final int[] q = new int[GMELE];
    int snakeBodyP = 3, dotFUN, dotT, dotQ;
    char Movement = 'r';
    boolean Managing = false;
    Timer clock;
    Random rdom;

    GMPNL()
    {
        rdom = new Random();
        this.setPreferredSize(new Dimension(ScrWidth, ScrHeight));
        this.setBackground(new Color(246,215,176));
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startG();
    }

    public void startG()
    {

        replaceDots();
        Managing = true;
        clock = new Timer(SLOW, this);
        clock.start();

    }


    public void paintComponent(Graphics g)
    {

        super.paintComponent(g);
        design(g);

    }

    public void design(Graphics g)
    {
        if (Managing) {
            g.setColor(Color.red);
            g.fillOval(dotT, dotQ, EleSIZE, EleSIZE);

            for (int b = 0; b < snakeBodyP; b++) {
                if (b == 0) {
                    g.setColor(Color.cyan);
                    g.fillRect(t[b], q[b], EleSIZE, EleSIZE);
                } else {
                    g.setColor(new Color(51, 153, 255));
                    g.setColor(new Color(rdom.nextInt(255), rdom.nextInt(255), rdom.nextInt(255)));
                    g.fillRect(t[b], q[b], EleSIZE, EleSIZE);
                }
            }
            g.setColor(Color.black);
            g.setFont(new Font("Impact", Font.PLAIN, 35));
            FontMetrics MTRIC = getFontMetrics(g.getFont());
            g.drawString("SCORE: " + dotFUN, (ScrWidth - MTRIC.stringWidth("SCORE: " + dotFUN)) / 2, g.getFont().getSize());
        } else {
            WASTED(g);
        }
    }

    public void replaceDots()
    {

        dotT = rdom.nextInt(ScrWidth / EleSIZE) * EleSIZE;
        dotQ = rdom.nextInt(ScrHeight / EleSIZE) * EleSIZE;

    }

    public void motion()
    {
        for (int b = snakeBodyP; b > 0; b--) {
            t[b] = t[b - 1];
            q[b] = q[b - 1];
        }
        switch (Movement) {
            case 'u' -> q[0] = q[0] - EleSIZE;
            case 'd' -> q[0] = q[0] + EleSIZE;
            case 'l' -> t[0] = t[0] - EleSIZE;
            case 'r' -> t[0] = t[0] + EleSIZE;
        }
    }

    public void searchDots()
    {

        if ((t[0] == dotT) && (q[0] == dotQ)) {
            snakeBodyP++;
            dotFUN++;
            replaceDots();
        }

    }

    public void restartG()
    {
        setVisible(false);
        new GMFR();
    }

    public void exitG()
    {
        setVisible(false);
        System.exit(0);
    }
    public void searchClash()
    {
        //see if head crashes into the body

        for (int b = snakeBodyP; b > 0; b--) {
            if ((t[0] == t[b]) && (q[0] == q[b])) {
                Managing = false;
                break;
            }
        }
        //see if head crashes into the left border
        if (t[0] < 0) {
            Managing = false;
        }
        //see if head crashes into the right border
        if (t[0] > ScrWidth) {
            Managing = false;
        }
        //see if head crashes into top border
        if (q[0] < 0) {
            Managing = false;
        }
        //see if head crashes into bottom border
        if (q[0] > ScrHeight) {
            Managing = false;
        }
        if (!Managing) {
            clock.stop();
        }

    }

    public void WASTED(Graphics g)
    {

        g.setColor(Color.black);
        g.setFont(new Font("Impact", Font.PLAIN, 35));
        FontMetrics MTRICONE = getFontMetrics(g.getFont());
        g.drawString("SCORE: " + dotFUN, (ScrWidth - MTRICONE.stringWidth("SCORE: " + dotFUN)) / 2, g.getFont().getSize());
        //WASTED Text
        g.setColor(Color.red);
        g.setFont(new Font("Impact", Font.BOLD, 125));
        FontMetrics MTRICTWO = getFontMetrics(g.getFont());
        g.drawString("WASTED", (ScrWidth - MTRICTWO.stringWidth("WASTED")) / 2, ScrHeight / 2);

        g.setFont(new Font("Times New Roman", Font.BOLD, 40));
        g.drawString("Press Space to Restart",150, 450 );

        g.setFont(new Font("Arial", Font.ITALIC, 35));
        g.drawString("Press Enter to Exit Game", 150, 550);

    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

        if (Managing) {
            motion();
            searchDots();
            searchClash();
        }
        repaint();

    }

    public class MyKeyAdapter extends KeyAdapter
    {
        @Override
        public void keyPressed(KeyEvent e)
        {
            if(e.getKeyCode() == KeyEvent.VK_SPACE)
            {
                Movement = 0;
                dotFUN = 0;
                snakeBodyP = 3;
                repaint();

            }
            switch(e.getKeyCode())
            {
                case KeyEvent.VK_LEFT:
                    if(Movement != 'r')
                    {
                        Movement = 'l';
                    }
                    break;

                case KeyEvent.VK_RIGHT:
                    if(Movement != 'l')
                    {
                        Movement = 'r';
                    }
                    break;

                case KeyEvent.VK_UP:
                    if(Movement != 'd')
                    {
                        Movement = 'u';
                    }
                    break;

                case KeyEvent.VK_DOWN:
                    if(Movement != 'u')
                    {
                        Movement = 'd';
                    }
                    break;

                case KeyEvent.VK_SPACE:
                    restartG();
                    break;

                case KeyEvent.VK_ENTER:
                    exitG();
                    break;

            }
        }
    }
}

