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

/**
 *
 * @author user-pc
 */

// CANT FIGURE OUT HOW TO CALL IT IN THE OTHER PROGRAM

public class AccountManeger {
     private JTextArea display;
     
     public void AccountCreater(JTextArea in, String name, String surname, String password, String confirmPassword) throws IOException, InterruptedException{
        
        
        
        File accounts = new File("PAT\\Data\\Accounts.txt");
        FileWriter AccountWriter = new FileWriter(accounts);
        Scanner AccountChecker = new Scanner(accounts);
        
        if(!confirmPassword.equals(password)){
            display.setText("Your passwords do not match");
        }
        
        while(AccountChecker.hasNext()){
            if(AccountChecker.next().equals(name) || AccountChecker.next().equals(surname) || AccountChecker.next().equals(password)){
                display.setBackground(Color.red);
                printDisplayText("Data\\AccountManegerDATA\\AccountTaken.txt");
                wait(1000);
                display.setBackground(Color.white);
                display.setText("");
                
            }
            else{
                AccountWriter.write(name + "#" + surname + "#" + password);
                display.setBackground(Color.green);
                printDisplayText("Data\\AccountManegerDATA\\AccountCreated.txt");
                AccountWriter.close();
            }

        
        
    }
    
}
        private void printDisplayText(String File) {

        TextRenderer renderer = new TextRenderer(display, 10, File);

        Thread thread = new Thread(renderer);
        
        thread.start();
        

       
    }

}

