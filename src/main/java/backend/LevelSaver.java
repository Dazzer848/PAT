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
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author darrenl
 */
public class LevelSaver implements Runnable {
    private String filepath;
    private int level;
    
    public LevelSaver(String inFilepath, int level){
        this.filepath = inFilepath;
        this.level = level;
    }

    @Override
    public void run() {
        
        try {
            File LevelSaved = new File(filepath);
            
            Scanner LevelSc = new Scanner(LevelSaved);
            
            FileWriter Writer = new FileWriter("Data//LevelSaved.txt");
            PrintWriter pw = new PrintWriter(Writer);
            
            pw.write(level);
            
            
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LevelSaver.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LevelSaver.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        
}
