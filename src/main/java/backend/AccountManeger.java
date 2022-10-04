/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import UIBootScreens.Puzzle1;
import UIBootScreens.Puzzle2;
import UIBootScreens.Puzzle3;
import UIBootScreens.Puzzle4;
import UIBootScreens.Puzzle5;
import UIBootScreens.Puzzle6;
import UIBootScreens.Puzzle7;
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

public class AccountManeger {

   
    public static boolean newUser(String inputtedCodeName, String inputtedPassword, String ConfirmPassword, JTextArea Display) throws IOException, FileNotFoundException, InterruptedException{
        
        boolean AccountCreated = false;
        boolean LoginDetailsOKAY = AccountTaken(inputtedCodeName, inputtedPassword, Display, true);
        
        Scanner fileSC = new Scanner(new File("Data//AccountManegerDATA//Accounts.txt"));
        

        FileWriter writer = new FileWriter("Data//AccountManegerDATA//Accounts.txt", true);
        PrintWriter pw = new PrintWriter(writer);
        
        
        if(LoginDetailsOKAY == true){
            if(!ConfirmPassword.equals(inputtedPassword)){
                Display.setBackground(Color.red);
                Display.setText("Your passwords do not match please try again");
                return AccountCreated;
        }
        
        
        
        else{
            String out = inputtedCodeName + "#" + inputtedPassword + "#" + "\n";
            pw.print(out);        
            pw.close();

            Display.setBackground(Color.green);
            Display.setText("You have successfully created and account!");
            AccountCreated = true;
            return AccountCreated;
            
        }
            
    }
        return AccountCreated;
}
    
    
    
        public static boolean AccountTaken(String inputtedUsername, String inputtedPassword, JTextArea Display, boolean LoginDetailsOKAY) throws FileNotFoundException, InterruptedException{
        LoginDetailsOKAY = false;
        
        Scanner fileSC = new Scanner(new File("Data\\AccountManegerDATA\\Accounts.txt"));
        
        while(fileSC.hasNextLine()){
            Scanner LineSC =  new Scanner(fileSC.nextLine()).useDelimiter("#");
            
            String savedusernames = LineSC.next();
            String savedPasswords = LineSC.next();
            
            int i = 1;
            System.out.println("" + i);
            i += 1;
            
            System.out.println(savedusernames);
            
            
            if(savedusernames.equals(inputtedUsername)){
                Display.setBackground(Color.red);
                Display.setText("The username is already taken");
                return false;
 
            }
            
            else{
                
                LoginDetailsOKAY = true;
            
            }
    }
        
     return LoginDetailsOKAY;   
        
        
}
        
        public static void MakeCurrentUser(String currentUser) throws FileNotFoundException{
            PrintWriter pw = new PrintWriter(new File("Data//AccountManegerDATA//CurrentUser.txt"));
            
            pw.print(currentUser);
            
            pw.close();
            
        }
        
        public static String GetCurrentUser() throws FileNotFoundException{
            Scanner currentUserSC = new Scanner(new File("Data\\AccountManegerDATA\\CurrentUser.txt"));
            
            String currentUser = currentUserSC.next();
          
            return currentUser;
        }
        
        
        public static boolean LogIn(String inputtedCodeName, String InputtedPassword, JTextArea Display) throws FileNotFoundException{
            boolean LogIn = false;
            
            Scanner fileSC = new Scanner(new File("Data\\AccountManegerDATA\\Accounts.txt"));
            
        
        while(fileSC.hasNextLine()){
            Scanner LineSC =  new Scanner(fileSC.nextLine()).useDelimiter("#");
            
            
            String savedusernames = LineSC.next();
            String savedPasswords = LineSC.next();
            
            //if(!InputtedPassword.equals(savedPasswords) && !inputtedCodeName.equals(savedusernames)){
               // Display.setBackground(Color.red);
                //Display.setText("Both your password and username is incorrect");
            //}
            
            if(!(inputtedCodeName.equals(savedusernames))){
                System.out.println(inputtedCodeName + "\n" + savedusernames);
                Display.setBackground(Color.red);
                Display.setText("Your username is incorrect!");
            }
            
            else if(!InputtedPassword.equals(savedPasswords)){
                System.out.println(InputtedPassword + "-----------------------------------------------\n" + savedPasswords);
                Display.setBackground(Color.red);
                Display.setText("Your Password is incorrect!");
            }
            
            
            
            else{
                LogIn = true;
            }
            

            
            
        }
    return LogIn;    
}
        
        
        public static void LevelSaver(String currentLevel) throws FileNotFoundException, IOException{
            
            Scanner CurrentUserSC = new Scanner(new File("Data\\AccountManegerDATA\\CurrentUser.txt"));
            //Scanner fileSC = new Scanner(new File("Data\\AccountManegerDATA\\AccountsWithLevels.txt"));
            
            // GENERATES MULTIPL NAMES IN THE FILE NEED IT TO ONLY MAKE 1
            FileWriter writer = new FileWriter("Data//AccountManegerDATA//AccountsWithLevels.txt", true);
            PrintWriter pw = new PrintWriter(writer);
            
            String currentUser = CurrentUserSC.next();
            System.out.println(currentUser);
            
            
            String out = currentUser + "#" + currentLevel + "#\n";
            pw.print(out);
            pw.close();
        }
        
        
        
        public static void LevelLoader() throws FileNotFoundException{
            Scanner currentUserSC = new Scanner(new File("Data\\AccountManegerDATA\\CurrentUser.txt"));
            Scanner FileSCAccountWithLevels = new Scanner(new File("Data\\AccountManegerDATA\\AccountsWithLevels.txt"));
            
            String currentuser = currentUserSC.next();
            
            int savedlevel;
            while(FileSCAccountWithLevels.hasNext()){
                Scanner LineSCAccountWithLevels =  new Scanner(FileSCAccountWithLevels.nextLine()).useDelimiter("#");
            
                String savedusername = LineSCAccountWithLevels.next();
                savedlevel = Integer.parseInt(LineSCAccountWithLevels.next());
                
                if(currentuser.equals(savedusername)){
                    switch(savedlevel){
                        
                        case 2:
                            new Puzzle2().setVisible(true);
                        break;
                            
                        case 3:
                            new Puzzle3().setVisible(true);
                        break;
                        
                        case 4:
                            new Puzzle4().setVisible(true);
                        break;
                        
                        case 5:
                            new Puzzle5().setVisible(true);
                        break;
                        
                        case 6:
                            new Puzzle6().setVisible(true);
                        break;
                        
                        case 7:
                            new Puzzle7().setVisible(true);
                        break;
                        
                        default:
                            System.out.println("An Unexpected Error occured please contact Support");
                       
                    }
                    break;
                }
            
                
            }
            
            
            
            
        }

 
}

