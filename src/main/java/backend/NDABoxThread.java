/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;


//Importing all dependancys.
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;

/**
 *
 * @author darrenl
 */
public class NDABoxThread implements Runnable{
    
    private JCheckBox NDA;
    private JCheckBox LossOrHarm;
    private JCheckBox Death;
    private JCheckBox PainAndMuder;
    private JCheckBox LossOfLimbs;
    private JCheckBox Censorship;
    private JCheckBox ToHaveAGoodTime;

    
    public NDABoxThread(JCheckBox NDA, JCheckBox LossOrHarm, JCheckBox Death, JCheckBox PainAndMurder, JCheckBox LossOfLimbs, JCheckBox Censorship, JCheckBox ToHaveAGoodTime){
        this.NDA = NDA;
        this.LossOrHarm = LossOrHarm;
        this.Death = Death;
        this.PainAndMuder = PainAndMurder;
        this.LossOfLimbs = LossOfLimbs;
        this.Censorship = Censorship;
        this.ToHaveAGoodTime = ToHaveAGoodTime;
    }
    
    
    

    @Override
    public void run() {
        NDA.setVisible(false);
        LossOrHarm.setVisible(false);
        Death.setVisible(false);
        PainAndMuder.setVisible(false);
        LossOfLimbs.setVisible(false);
        Censorship.setVisible(false);
        ToHaveAGoodTime.setVisible(false);

        
        try {
            Thread.sleep(10000);
            NDA.setVisible(true);
            boolean NDAt = NDA.isSelected();
            Thread.sleep(10000);
            LossOrHarm.setVisible(true);
            boolean LossOrHarmT= LossOfLimbs.isSelected();
            Thread.sleep(10000);
            Death.setVisible(true);
            boolean DeathT = Death.isSelected();
            Thread.sleep(10000);
            PainAndMuder.setVisible(true);
            boolean PainAndMurderT = PainAndMuder.isSelected();
            Thread.sleep(10000);
            LossOfLimbs.setVisible(true);
            boolean LossOfLimbsT = LossOfLimbs.isSelected();
            Thread.sleep(10000);
            Censorship.setVisible(true);
            boolean CensorshipT = Censorship.isSelected();
            Thread.sleep(10000);
            ToHaveAGoodTime.setVisible(true);
            boolean ToHaeAGoodTimeT = ToHaveAGoodTime.isSelected();
            Thread.sleep(10000);
            
            
            
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(NDABoxThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
       
    }
    
}
