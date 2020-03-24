package sample;

//import javafx.event.ActionEvent;

//import javafx.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;

import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class ControlPanel extends JPanel {
    final MainFrame frame;
    JButton saveBtn = new JButton("Save");
    JButton loadBtn = new JButton("Load");
    JButton resetBtn = new JButton("Reset");
    JButton exitBtn = new JButton("Exit");
    //create all buttons (Load, Reset, Exit)

    //...TODO
    public ControlPanel(MainFrame frame) {
        this.frame = frame; init();
    }
    private void init() {
        //change the default layout manager (just for fun)
        setLayout(new GridLayout(1, 4));
        add(saveBtn);
        add(loadBtn);
        add(resetBtn);
        add(exitBtn);
        //add all buttons ...TODO
        //configure listeners for all buttons
        saveBtn.addActionListener(this::save);
        loadBtn.addActionListener(this::load);
        saveBtn.addActionListener(this::reset);
        exitBtn.addActionListener(this::exit);
    }
    private void save(ActionEvent e) {
        try {
            ImageIO.write(frame.canvas.image, "PNG", new File("D://test.png"));
        } catch (IOException ex) { System.err.println(ex); }
    }
    // added load reset and exit
    private void load(ActionEvent e)
    {
        try {
            frame.canvas.image=ImageIO.read(new File("D://test.png"));
        } catch (IOException e1) {
            System.err.println(e1);
        }
    }
    private void reset(ActionEvent e)
    {

            frame.canvas.reset();

    }
    private void exit(ActionEvent e)
    {
        try {
            //exit
            if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit", "Want to exit?",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
                System.exit(0);
        }catch (Exception e2) {System.err.println(e2);}
    }

}


