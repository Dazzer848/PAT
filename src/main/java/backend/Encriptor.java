package backend;

import static java.awt.SystemColor.text;
import java.io.File;
import java.io.FileNotFoundException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author darrenl
 */

// Doesnt work, cant call it and need help making it able to encript any answer.
public class Encriptor implements Runnable{
    
    private String AnswersFile;
    private boolean Todo;
    
    public Encriptor(String Answer1, boolean todo) {
        this.AnswersFile = Answer1;
        this.Todo = todo;
        
    }
    
    
    
    

    @Override
    public void run() {
        try {
            KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
            SecretKey myDesKey = keygenerator.generateKey();
            if(Todo == true){
                
            
            File Answer1 = new File(AnswersFile);
            
            Scanner AnsSC = new Scanner(Answer1);
            
            String ans = AnsSC.nextLine();
            
            
            Cipher desCipher;
            desCipher = Cipher.getInstance("DES");
            
            byte[] Answer = ans.getBytes("UTF8");
            
            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
            byte[] textEncrypted = desCipher.doFinal(Answer);

            String encriptedAns = new String(textEncrypted);
            
            FileWriter Writer = new FileWriter(Answer1);
            Writer.write(encriptedAns);
            Writer.close();
            
            System.out.println(encriptedAns);
            
            
            }
            
            if(Todo == false){
                                
            
            File Answer1 = new File(AnswersFile);
            
            Scanner AnsSC = new Scanner(Answer1);
            
            String ans = AnsSC.nextLine();
            
            
            Cipher desCipher;
            desCipher = Cipher.getInstance("DES");
            
            byte[] Answer = ans.getBytes("UTF8");
            
            desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
            byte[] textEncrypted = desCipher.doFinal(Answer);

            String encriptedAns = new String(textEncrypted);
            
            FileWriter Writer = new FileWriter(Answer1);
            Writer.write(encriptedAns);
            Writer.close();
            
            System.out.println(encriptedAns);
            
            
            
                
            }
            
            
            
            
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Encriptor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Encriptor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchPaddingException ex) {
            Logger.getLogger(Encriptor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Encriptor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvalidKeyException ex) {
            Logger.getLogger(Encriptor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalBlockSizeException ex) {
            Logger.getLogger(Encriptor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (BadPaddingException ex) {
            Logger.getLogger(Encriptor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Encriptor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
