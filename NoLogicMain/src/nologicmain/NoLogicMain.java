/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nologicmain;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class NoLogicMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SolData solData = new SolData();
        solData.calcularSalario();
        solData.recorrEmplados();
        
        metodoEnClaseMain();
        
    }
    
    public static String metodoEnClaseMain(){
        JOptionPane.showMessageDialog(null, "Solo soy un texto");
    }
    
}
