/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import backend.TextRenderer;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user-pc
 */

// CANT FIGURE OUT HOW TO CALL IT IN THE OTHER PROGRAM

public class AccountManeger implements Runnable{
     private JTextArea display;
     private String name;
     private String surname;
     private String password;
     private String confirmPassword;
     private boolean Run;
     
     
     public AccountManeger(JTextArea in, String name, String surname, String password, String confirmPassword, boolean Run) throws IOException, InterruptedException{
         this.display = in;
         this.name = name;
         this.surname = surname;
         this.password = password;
         this.confirmPassword = confirmPassword;
         this.Run = Run;
        
        
        
        
}
        private void printDisplayText(String File) {

        TextRenderer renderer = new TextRenderer(display, 10, File);

        Thread thread = new Thread(renderer);
        
        thread.start();
        

       
    }

    @Override
    public void run() {
        
        
        
         try {
            File accounts = new File("C:\\Users\\darrenl\\Documents\\NetBeansProjects\\PAT\\Data\\AccountManegerDATA\\Accounts.txt");
            PrintWriter AccountWriter = new PrintWriter(accounts);
            Scanner AccountsSC = new Scanner(accounts);
            
            if(!confirmPassword.equals(password)){
                display.setBackground(Color.red);
                printDisplayText("C:\\Users\\darrenl\\Documents\\NetBeansProjects\\PAT\\Data\\AccountManegerDATA\\Responses\\PasswordIncorect.txt");
                Thread.sleep(10000);
                display.setBackground(Color.white);
                
                
                
        }
        
            if(AccountsSC.next().equals(name) || AccountsSC.next().equals(surname) || AccountsSC.next().equals(password)){
                display.setBackground(Color.red);
                printDisplayText("Data\\AccountManegerDATA\\AccountTaken.txt");
                
                Thread.sleep(100);

                
                display.setBackground(Color.white);
                display.setText("");
                
            }
        
        else{
               
                AccountWriter.write(name + "#" + surname + "#" + password);
                
                
                display.setBackground(Color.green);
                printDisplayText("Data\\AccountManegerDATA\\AccountCreated.txt");
                
                AccountWriter.close();
                
            }

        
        
         

        

        
    }    catch (InterruptedException ex) {
             Logger.getLogger(AccountManeger.class.getName()).log(Level.SEVERE, null, ex);
         } catch (FileNotFoundException ex) {
             Logger.getLogger(AccountManeger.class.getName()).log(Level.SEVERE, null, ex);
         }

}
         
    }


         


