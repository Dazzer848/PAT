/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author darrenl
 */
// Need help to get it to work
public class AnswerChecker {
    public boolean AnswerChecker(String InputtedAnswer, boolean currentStatus, boolean CapsSensitive, int currentLevel) throws FileNotFoundException, IOException{
        currentStatus = false;
        
        
        File Answers = new File("PAT\\Data\\Answers.txt");
        Scanner AnsC = new Scanner(Answers);
        Writer writer = new Writer("PAT\\Data\\LevelSaved.txt") {
           
            
            
            
            
            @Override
            public void write(char[] cbuf, int off, int len) throws IOException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void flush() throws IOException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void close() throws IOException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        
        
        while(AnsC.hasNext()){
            if(CapsSensitive = true){
                if(InputtedAnswer.equals(AnsC.next())){
                    writer.write(currentLevel);
                    currentStatus = true;
                    return currentStatus;
                    
                    
                    
                    
                }
                
                else{
                    currentStatus = false;
                    return currentStatus;
                }
            }
            
            if(CapsSensitive = false){
                if(InputtedAnswer.equalsIgnoreCase(AnsC.next))
            }
        }
        
    }
    
}
