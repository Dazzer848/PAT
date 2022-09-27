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
import java.io.Writer;
import java.util.Scanner;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author darrenl
 */
public class AnswerChecker {
    public static boolean checkAnswer(String Inpuutedanswer, boolean cap,int level)throws FileNotFoundException{
        boolean result = false;
        boolean capResult = false;
        boolean nocapResult = false;

        String answer = "";

        Scanner scan = new Scanner(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\PAT\\Data\\Puzzles\\Answers\\Answers.txt"));
        PrintWriter writer = new PrintWriter(new File("Data\\LevelSaved.txt"));

        
      
        for(int i = 0; i < level;i++){
            if(scan.hasNextLine()){
                answer = scan.nextLine();
            }
        }
        
        if(cap && answer.equalsIgnoreCase(Inpuutedanswer)){
            writer.print(level);
            writer.flush();
            result  = true;
            return result;
        }
        else if(answer.equals(Inpuutedanswer)){
            writer.print(level);
            writer.flush();
            result = true;
            return result;
        }

        return result;
    }

}
  