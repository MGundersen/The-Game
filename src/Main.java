import java.awt.EventQueue;
import javax.swing.JFrame;


public class Main extends JFrame {

    public static void main(String[] args) {

        // 80 symbols long
        System.out.println( "================================================================================" );
        System.out.println( "=========================== Welcome to - The Game - ============================" );
        System.out.println( "============================= Press Enter to start =============================" );
        System.out.println( "================================================================================" );




        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                Main ex = new Main();
                ex.setVisible(true);
            }
        });
    }

    public Main() {
        initUI();
    }

    private void initUI() {

        add(new Map());

        setSize(800, 600);
        setResizable(false);

        setTitle("The Game");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

