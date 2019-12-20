package lab22;

import javax.swing.JFrame;

public class MainApplication
{
    public static void main(String[]args)
    {
       /* JFrame frame = new JFrame();
        frame.setSize(500,500);
        JButton b1 = new JButton("НАЖМИ МЕНЯ");
        frame.add(b1);
        frame.setTitle(" Мое первое окошко :) ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);*/
        MainFrame1 frame = new MainFrame1();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
