/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;


// Importing all the required JFRAME components
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
        
        //Setting up the return value, If the conditions are met return the act AccountCreated is true, otherwise its false
        boolean AccountCreated = false;
        boolean LoginDetailsOKAY = AccountTaken(inputtedCodeName, inputtedPassword, Display, true);
        
        Scanner fileSC = new Scanner(new File("Data//AccountManegerDATA//Accounts.txt"));
        
        
        //Setting up file writers,required to save the account to permenant storage. (Accounts.txt)
        FileWriter writer = new FileWriter("Data//AccountManegerDATA//Accounts.txt", true);
        PrintWriter pw = new PrintWriter(writer);
        
        
        // Checking if the confirm password fields match.
        if(LoginDetailsOKAY == true){
            if(!ConfirmPassword.equals(inputtedPassword)){
                Display.setBackground(Color.red);
                Display.setText("Your passwords do not match please try again");
                return AccountCreated;
        }
        
        
        //This is the correct condition and the account will be created, The Print Writer writes the inputted username and password to the permenant storage aswell as returning True for the acocunted created boolean.
        else{
            String out = "\n" + inputtedCodeName + "#" + inputtedPassword + "#";
            pw.print(out);        
            pw.close();
            
            
            // The account is succesfully created and stored in permenant storage.
            Display.setBackground(Color.green);
            Display.setText("You have successfully created and account!");
            AccountCreated = true;
            return AccountCreated;
            
        }
            
    }   
        // Returns the AccountCreated boolean. True = Account is created and stored in permentant storage. False = The account is not created and the user is prompted with an error
        return AccountCreated;
}
    
    
    
        public static boolean AccountTaken(String inputtedUsername, String inputtedPassword, JTextArea Display, boolean LoginDetailsOKAY) throws FileNotFoundException, InterruptedException{
        
        // setting up return value. Boolean means that the account is not taken    
        LoginDetailsOKAY = false;
        
        Scanner fileSC = new Scanner(new File("Data\\AccountManegerDATA\\Accounts.txt"));
        
        
        // This loop checks every username entered to see if any are the same as the users one.
        while(fileSC.hasNextLine()){
            Scanner LineSC =  new Scanner(fileSC.nextLine()).useDelimiter("#");
            
            String savedusernames = LineSC.next();
            String savedPasswords = LineSC.next();
            
            // DEBUGG
            System.out.println(savedusernames);
            
            
            // Informs user that the username is invalid and throws a false condition.
            if(savedusernames.equals(inputtedUsername)){
                Display.setBackground(Color.red);
                Display.setText("The username is already taken");
                return false;
 
            }
            
            // Else condition indicates the username is not taken and LoginInDetailsOKay = true which allows the users account to be created.
            else{
                
                LoginDetailsOKAY = true;
            
            }
    }
     
        // Return the current state of LogInDetailsOkay. True = user can create account. False = prompts user to change their username and does not allow them to create an account.
     return LoginDetailsOKAY;   
        
        
}
        // A method to set the games current user
        public static void MakeCurrentUser(String currentUser) throws FileNotFoundException{
            
            // Creates Print Writer and then simply writes the currently logged in account (Once succesful) to a text file. ( CurrentUser.txt)
            PrintWriter pw = new PrintWriter(new File("Data//AccountManegerDATA//CurrentUser.txt"));
            
            pw.print(currentUser);
            
            pw.close();
            
        }
        
        // Gets the currently logged in user.
        public static String GetCurrentUser() throws FileNotFoundException{
            
            // Scanner to scan the file
            Scanner currentUserSC = new Scanner(new File("Data\\AccountManegerDATA\\CurrentUser.txt"));
            
            String currentUser = currentUserSC.next();
          
            // Returns the String of the current user.
            return currentUser;
        }
        
        
        // Method to check weather or not the users inputted details are correct and they can log in.
        public static boolean LogIn(String inputtedCodeName, String InputtedPassword, JTextArea Display) throws FileNotFoundException{
            
            
            //Setting up return value. Plus scanner.
            boolean LogIn = false;
            
            Scanner fileSC = new Scanner(new File("Data\\AccountManegerDATA\\Accounts.txt"));
            
        
            // Checks to see weather or not the users inputted password and user is correct which will allow them to log on.
        while(fileSC.hasNextLine()){
            
            // Scans all users passwords saved in the Accounts.txt file.
            Scanner LineSC =  new Scanner(fileSC.nextLine()).useDelimiter("#");
            
            
            String savedusernames = LineSC.next();
            String savedPasswords = LineSC.next();
            
            //if(!InputtedPassword.equals(savedPasswords) && !inputtedCodeName.equals(savedusernames)){
               // Display.setBackground(Color.red);
                //Display.setText("Both your password and username is incorrect");
            //}
            
            // Checks for the username/code name. If its correct or not.
            if(!(inputtedCodeName.equals(savedusernames))){
                System.out.println(inputtedCodeName + "\n" + savedusernames);
                Display.setBackground(Color.red);
                Display.setText("Your username is incorrect!");
            }
            
            // Checks for passwords.
            else if(!InputtedPassword.equals(savedPasswords)){
                System.out.println(InputtedPassword + "-----------------------------------------------\n" + savedPasswords);
                Display.setBackground(Color.red);
                Display.setText("Your Password is incorrect!");
            }
            
            
            
            else{
                // If no prior checks are met return True and allow the user to lonIn
                LogIn = true;
            }
            

            
            
        }
        //Returning the LogIn value, True = allows the user to LogIn, False = does not allow the user to logIn.
    return LogIn;    
}
        
        //Mehtod to save the current Level the accounts are on. Saves to permennant storage (AccountsWithLevels.txt)
        public static void LevelSaver(String currentLevel) throws FileNotFoundException, IOException{
            
            //Setting up Scanners
            Scanner CurrentUserSC = new Scanner(new File("Data\\AccountManegerDATA\\CurrentUser.txt"));
            Scanner fileSC = new Scanner(new File("Data\\AccountManegerDATA\\AccountsWithLevels.txt"));
            
            String currentUser = CurrentUserSC.next();
            
            
            
            String out = "";
            
            while(fileSC.hasNext()){
                
                Scanner LineSc = new Scanner(fileSC.nextLine()).useDelimiter("#");
                
                String accountName = LineSc.next();
                int Level = LineSc.nextInt();
                
                
                if(accountName.equals(currentUser)){
                    
                    
                    String toChange = "\n" + accountName +"#" + currentLevel +"#";
                    out = out + toChange;
                    
                
            }
                else{

                    out = out + accountName +"#" + Level + "#\n";
                    
                }
                
                
            }
            FileWriter writer = new FileWriter("Data//AccountManegerDATA//AccountsWithLevels.txt", false);
            PrintWriter pw = new PrintWriter(writer);
            
            pw.print(out);
            pw.close();

        }
        
        
        
        
        // A method to retrieve the level that is saved for the current account.
        public static void LevelLoader() throws FileNotFoundException{
            
            // Setting up scanners.
            Scanner currentUserSC = new Scanner(new File("Data\\AccountManegerDATA\\CurrentUser.txt"));
            Scanner FileSCAccountWithLevels = new Scanner(new File("Data\\AccountManegerDATA\\AccountsWithLevels.txt"));
           
            
            //Getting the current user from the text file.
            String currentuser = currentUserSC.next();
            
            //The level that wants to be loaded.
            int savedlevel;
            
            
            //Checking which accounts are where in the experience.
            while(FileSCAccountWithLevels.hasNext()){
                Scanner LineSCAccountWithLevels =  new Scanner(FileSCAccountWithLevels.nextLine()).useDelimiter("#");
            
                String savedusername = LineSCAccountWithLevels.next();
                savedlevel = LineSCAccountWithLevels.nextInt();
                
                System.out.println(savedusername);
                System.out.println(savedlevel);
                
                //once the current user is linked with their account in permenant storage and retrieves the level they are saved on.
                if(currentuser.equals(savedusername)){
                    
                    //Depending on what level is found.
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

