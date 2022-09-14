/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author user-pc
 */

// CANT FIGURE OUT HOW TO CALL IT IN THE OTHER PROGRAM

public class AccountManeger {
     private JTextArea display;
     
     public void AccountCreater(JTextArea in, String name, String surname, String password, String confirmPassword) throws IOException{
        
        
        
        File accounts = new File("PAT\\Data\\Accounts.txt");
        FileWriter AccountWriter = new FileWriter(accounts);
        Scanner AccountChecker = new Scanner(accounts);
        
        if(!confirmPassword.equals(password)){
            display.setText("Your passwords do not match");
        }
        
        while(AccountChecker.hasNext()){
            if(AccountChecker.next().equals(name) || AccountChecker.next().equals(surname) || AccountChecker.next().equals(password)){
                display.setText("Your name, surname or password have already got an account linked to them");
            }
            else{
                AccountWriter.write(name + "#" + surname + "#" + password);
                display.setText("Your account has succesfully been created");
                AccountWriter.close();
            }

        
        
    }
    
}
}

