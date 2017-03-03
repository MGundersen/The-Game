/**
 * Created by Mathias on 01-03-2017.
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Map extends JPanel implements ActionListener {

        private Timer timer;
        private Player player1;
        private final int DELAY = 10;

        public Map() {

            initMap();
        }

        private void initMap() {

            addKeyListener(new TAdapter());
            setFocusable(true);
            setBackground(Color.BLACK);

            player1 = new Player();

            timer = new Timer(DELAY, this);
            timer.start();
        }


        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            doDrawing(g);

            Toolkit.getDefaultToolkit().sync();
        }

        private void doDrawing(Graphics g) {

            Graphics2D g2d = (Graphics2D) g;
            g2d.drawImage(player1.getImage(), player1.getX(), player1.getY(), this);
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            player1.move();
            repaint();
        }

        private class TAdapter extends KeyAdapter {

            @Override
            public void keyReleased(KeyEvent e) {
                player1.keyReleased(e);
            }

            @Override
            public void keyPressed(KeyEvent e) {
                player1.keyPressed(e);
            }
        }

}
