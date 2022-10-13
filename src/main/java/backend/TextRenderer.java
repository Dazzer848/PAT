/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;


//Importing all dependancys

//NB THIS WAS A COLLABERATION BETWEEN MYSELF AND MR B.
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 * @author darrenl
 */

public class TextRenderer implements Runnable {
    private JTextArea jta;
    private int delay;
    private String filePath;

    public TextRenderer(JTextArea in, int delay, String inFilePath) {
        this.jta = in;
        this.delay = delay;
        this.filePath = inFilePath;
    }

    @Override
    public void run() {
        try {
            File bootText = new File(filePath);
            
            Scanner bootSC = new Scanner(bootText, "UTF-8");

            String out = "";

            while (bootSC.hasNextLine()) {
                out += bootSC.nextLine() + "\n";
            }

            for (int i = 0; i < out.length(); i++) {
                jta.setText(out.substring(0, i));//message.charAt(i);
                Thread.sleep(delay);
            }
            
            

        } catch (InterruptedException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
