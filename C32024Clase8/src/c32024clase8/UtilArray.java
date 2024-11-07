/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c32024clase8;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class UtilArray {
    public void llenaArreglo (int array[]){
        for (int i = 0; i < array.length; i++) {
            Random rand = new Random();
            array[i]=rand.nextInt(1000);;
        }
    }
    
      public void solicitaDataArreglo (int array[]){
        for (int i = 0; i < array.length; i++) {
            array[i]=Integer.parseInt(JOptionPane.showInputDialog("Dame números"));
        }
    }
    
    
    public void imprimeArreglo (int array[]){
        String result="";
        for (int i = 0; i < array.length; i++) {
            result=result + "Valor "+i + ":"+array[i]+"\n";
        }
        JOptionPane.showMessageDialog(null, result);
        
    }
}
