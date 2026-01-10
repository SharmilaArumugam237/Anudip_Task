import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;




public class Calculator{

    int boardwidth = 360;
    int boardheight = 540;

    JFrame frame = new JFrame("Calculator");

    Calculator(){
        frame.setVisible(true);
        frame.setSize(boardwidth, boardheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
    }
}