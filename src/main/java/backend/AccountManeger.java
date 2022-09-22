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
public class AccountManeger {

   
    public static void newUser(String inputtedCodeName, String inputtedPassword, String ConfirmPassword, JTextArea Display) throws IOException{
        FileWriter writer = new FileWriter("Data\\AccountManegerDATA\\Accounts.txt", true);
        PrintWriter pw = new PrintWriter(writer);
        
        if(!ConfirmPassword.equals(inputtedPassword)){
            Display.setBackground(Color.red);
            Display.setText("Your passwords do not match please try again");
        }
        
        else{
            String out = "\n" + inputtedCodeName + "#" + inputtedPassword;
            pw.print(out);        
            pw.close();


            Display.setBackground(Color.green);
            Display.setText("You have successfully created and account!");
            
        }
        
    
    }
        public static void LoginDetailsChecker(String inputtedUsername, String inputtedPassword, JTextArea Display) throws FileNotFoundException, InterruptedException{
        
        
        Scanner fileSC = new Scanner(new File("Data\\AccountManegerDATA\\Accounts.txt"));
        
        while(fileSC.hasNextLine()){
            Scanner LineSC =  new Scanner(fileSC.nextLine()).useDelimiter("#");
            
            String savedusernames = LineSC.next();
            String savedpassword = LineSC.next();
            
            if(savedusernames.equals(inputtedUsername)){
                if(savedpassword.equals(inputtedPassword)){
                    Display.setText("You have logged on");
                    Display.setBackground(Color.green);
                    break;
                    
                }
                
            }
            
            else{
                Display.setBackground(Color.red);
                Display.setText("Your username or password is incorrect.");
                
                
                
            }
            LineSC.close();
                    
                    
        }
}
}

      