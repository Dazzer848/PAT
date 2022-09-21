/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import javax.swing.JButton;
import javax.swing.JCheckBox;

/**
 *
 * @author darrenl
 */
public class DisclaimerBoxThread implements Runnable{
    private JCheckBox NDA;
    private JCheckBox LossOrHarm;
    private JCheckBox Death;
    private JCheckBox PainAndMuder;
    private JCheckBox LossOfLimbs;
    private JCheckBox Censorship;
    private JCheckBox ToHaveAGoodTime;
    private JButton agree1;
    private JButton agree2;
    private JButton agree3;
    private JButton agree4;
    private JButton agree5;
    
    public DisclaimerBoxThread(JCheckBox NDA, JCheckBox LossOrHarm, JCheckBox Death, JCheckBox PainAndMurder, JCheckBox LossOfLimbs, JCheckBox Censorship, JCheckBox ToHaveAGoodTime, JButton agree1, JButton agree2, JButton agree3, JButton agree4, JButton agree5){
        this.NDA = NDA;
        this.LossOrHarm = LossOrHarm;
        this.Death = Death;
        this.PainAndMuder = PainAndMurder;
        this.LossOfLimbs = LossOfLimbs;
        this.Censorship = Censorship;
        this.ToHaveAGoodTime = ToHaveAGoodTime;
        this.agree1 = agree1;
        this.agree2 = agree2;
        this.agree3 = agree3;
        this.agree4 = agree4;
        this.agree5 = agree5;
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
        agree1.setVisible(false);
        agree2.setVisible(false);
        agree3.setVisible(false);
        agree4.setVisible(false);
        agree5.setVisible(false);
        
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
