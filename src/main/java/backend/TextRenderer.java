/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
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

            Scanner bootSC = new Scanner(bootText);

            String out = "";

            while (bootSC.hasNextLine()) {
                out += bootSC.nextLine() + "\n";
            }

            for (int i = 0; i < out.length(); i++) {
                jta.setText(out.substring(0, i));//message.charAt(i);
                Thread.sleep(delay);
            }
            
            

        } catch (InterruptedException e) {

        } catch (FileNotFoundException e) {

        }
    }

}
