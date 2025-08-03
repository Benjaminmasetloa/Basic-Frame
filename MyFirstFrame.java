/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;
import java.awt.Color;
import javax.swing.JFrame;
/**
 *
 * @author benja
 */
public class MyFirstFrame extends JFrame{
    public MyFirstFrame()
    {
        setTitle("My First ");
        setSize(200,350);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.red);
        setVisible(true);
    }
}
