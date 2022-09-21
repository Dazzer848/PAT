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
        
    }
    
    

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
