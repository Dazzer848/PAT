/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

// Importing all dependancys.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 * @author darrenl
 */
public class NoteManager{
    
    //Method to load the users Saved notes.
    public static void ReturnNotes(JTextArea NotePad) throws FileNotFoundException, IOException{
        
        //Creating the scanner, If no file is found then it will create a file with the users username followed by Notes usernameNotes.txt This will stop the FileNotFound.Exception
        Scanner CurrentUserSC = new Scanner(new File("Data\\AccountManegerDATA\\CurrentUser.txt"));
        String currentUser = CurrentUserSC.next();
        File Notes = new File("Data\\Notes\\"+currentUser + "Notes.txt");
        Notes.createNewFile();
        
        //If the notes file does exist scan the file
        if(Notes.exists()){
            Scanner NoteSC = new Scanner(Notes);
            
            //Set the displays text to the saved notes in permenant storage.
            while(NoteSC.hasNext()){
                NotePad.setText(NoteSC.next());

            }
        }
    }
    
    
    
    //Method to save any notes made.
    public static void SaveNotes(JTextArea NotePad) throws FileNotFoundException, IOException{
        
        //Setting up scanners to scan the current user and the notes of that current user.
        Scanner CurrentUserSC = new Scanner(new File("Data\\AccountManegerDATA\\CurrentUser.txt"));
        String currentUser = CurrentUserSC.next();
        File Notes = new File("Data\\Notes\\" + currentUser + "Notes.txt");
        
        //If no File is found with the name a file is created with the username and Notes so usernameNotes.txt
        Notes.createNewFile();
        
        
        //Setting up Print Writer
        PrintWriter NoteWriter = new PrintWriter(Notes);
        
        //Getting text and saves it to the notepad
        String ToSave = NotePad.getText();
        
        NoteWriter.write(ToSave);
        NoteWriter.close();
        
    }

    

    
}
