/**
 * Created by Eurismar on 05/07/2014.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    JButton btnThread1 = new JButton("Thread 1");
    JButton btnThread2 = new JButton("Thread 2");
    static JProgressBar pb1 = new JProgressBar(0,1000);
    static JProgressBar pb2 = new JProgressBar(0,1000);
    SpringLayout springLayout = new SpringLayout();
    FlowLayout flowLayout = new FlowLayout();
    GridLayout gridLayout = new GridLayout(4,1);

    public Main() throws HeadlessException {
        Container container = getContentPane();

        container.setLayout(gridLayout);

        btnThread1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Thread1 myThread = new Thread1();
                Thread t = new Thread(myThread);
                t.start();
            }
        });
        btnThread2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Thread2 myThread2 = new Thread2();
                Thread t2 = new Thread(myThread2);
                t2.start();

            }
        });
        container.add(btnThread1);
        pb1.setSize(100,1000);
        container.add(pb1);
        container.add(btnThread2);
        container.add(pb2);
        pack();
        setSize(800, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Minha Tela");
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
