/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

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
    
    
    public static void ReturnNotes(JTextArea NotePad) throws FileNotFoundException, IOException{
        
        Scanner CurrentUserSC = new Scanner(new File("Data\\AccountManegerDATA\\CurrentUser.txt"));
        String currentUser = CurrentUserSC.next();
        File Notes = new File("Data\\Notes\\"+currentUser + "Notes.txt");
        Notes.createNewFile();
        
        if(Notes.exists()){
            Scanner NoteSC = new Scanner(Notes);

            while(NoteSC.hasNext()){
                NotePad.setText(NoteSC.next());

            }
        }
    }
    
    
    
    public static void SaveNotes(JTextArea NotePad) throws FileNotFoundException, IOException{
        Scanner CurrentUserSC = new Scanner(new File("Data\\AccountManegerDATA\\CurrentUser.txt"));
        String currentUser = CurrentUserSC.next();
        File Notes = new File("Data\\Notes\\" + currentUser + "Notes.txt");
        
        Notes.createNewFile();
        
        PrintWriter NoteWriter = new PrintWriter(Notes);
        
        String ToSave = NotePad.getText();
        
        NoteWriter.write(ToSave);
        NoteWriter.close();
        
    }

    

    
}
