import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mudiw
 */
public class Manager 
{
    private LoginRegister logreg = new LoginRegister();
    private Login lg = new Login();
    private Register reg = new Register();
    private BuyRent brd = new BuyRent();
    private Buy b = new Buy();
    private Bombshell bs = new Bombshell();
    private Magenta m = new Magenta();
    private Rosy red = new Rosy();
    private ClasTux ct = new ClasTux();
    private GreyRock gr = new GreyRock();
    private JamesBond jb = new JamesBond();
    private Male mal = new Male();
    private Donate d = new Donate();
    private Help hl = new Help();
    private Checkout c = new Checkout();

    public Manager()
    {
       
    }
    
    //Display Login Screen
    public void DisplayLoginScreen()
    {
        
        lg.setVisible(true);
        logreg.setVisible(false);
        
    }
    
    //Display Register Screen
    public void DisplayRegisterScreen()
    {
        logreg.setVisible(false);
        reg.setVisible(true);
    }
    public void DisplayLoginRegister()
    {
        reg.setVisible(false);
        logreg.setVisible(true);
    }
    public void DisplayBuyScreen()
    {
        brd.setVisible(false);
        b.setVisible(true);
        logreg.setVisible(false);
    }
    
    public void DisplayBuyRent()
    {
        lg.setVisible(false);
        brd.setVisible(true);
        logreg.setVisible(false);
    }
    public void DisplayBs()
    {
        bs.setVisible(true);
        b.setVisible(false);
        logreg.setVisible(false);
    }
    
    public void DisplayMagenta()
    {
        m.setVisible(true);
        b.setVisible(false);
        logreg.setVisible(false);
        
    }
    public void DisplayRosy()
    {
        red.setVisible(true);
        b.setVisible(false);
        logreg.setVisible(false);
    }
    
    public void DisplayMale()
    {
        mal.setVisible(true);
        brd.setVisible(false);
        logreg.setVisible(false);
    }
    public void DisplayTux()
    {
        ct.setVisible(true);
        mal.setVisible(false);
        logreg.setVisible(false);
    }
    public void DisplayGreyRock()
    {
        gr.setVisible(true);
        mal.setVisible(false);
        logreg.setVisible(false);
    }
    public void DisplayJamesBond()
    {
        jb.setVisible(true);
        mal.setVisible(false);
        logreg.setVisible(false);
    }
    public void DisplayDonate()
    {
        d.setVisible(true);
        brd.setVisible(false);
        logreg.setVisible(false);
    }
    public void DisplayCheckout()
    {
        c.setVisible(true);
        logreg.setVisible(false);
    }
    
    
    public void viewBasket()
    {
       try
       {
         Scanner myfile = new Scanner (new File("Basket.json"));
         String line;
         while (myfile.hasNext())
         {
             line = myfile.nextLine();
             System.out.println(line + "\n");
         }
       }
       catch(FileNotFoundException f)
       {
         System.out.println("File not found" + f);          
       }
       logreg.setVisible(false);
    }
    
}
