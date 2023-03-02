/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package nclock;
import javax.swing.*;
import java.awt.*;
import java.text.*;
import java.util.*;
import java.io.*;
import java.util.*;

public class App extends JFrame {
    Calendar calendar;
    SimpleDateFormat timeF;
    SimpleDateFormate dayF;
    SimpleDateFormat dateF;
    JLabel timeL;
    JLabel dayL;
    JLabel dateL;
    String time;
    String day;
    String date;

    App() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Digital Clock");
        this.setLayout(new FlowLayout());
        this.setSize(400, 250);
        timeF = new SimpleDateFormat("hh:mm:ss a");
        dayF = new SimpleDateFormat("EEE");
        dateF = new SimpleDateFormat("dd MMM, yyyy");

        timeL = new JLabel();
        timeL.setBackground(Color.BLACK);
        timeL.setForeground(Color.RED);
        timeL.setFont(new Font("Verdana", Font.PLAIN, 64));

        dayL = new JLabel();
        dayL.setFont(new Font("Ink Free", Font.PLAIN, 32));

        dateL = new JLabel();
        dateL.setFont(new Font("Ink Free", Font.PLAIN, 30));

        this.add(timeL);
        this.add(dayL);
        this.add(dateL);
        this.setVisible(true);
        
    }
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
