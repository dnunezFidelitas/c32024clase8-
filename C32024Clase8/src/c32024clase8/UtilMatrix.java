/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c32024clase8;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class UtilMatrix {
    
    
    public void printMatrix (int matrix[][], int row, int col){
        
        String result=""; 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result=result + matrix[i][j] + "-";
            }
            result=result+"\n";
        }
        JOptionPane.showMessageDialog(null, result);
    
    }
    
    public void solData(int matrix[][], int row, int col){
        
        String result=""; 
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Get Numbers " ));
            }
        }
    }
    
}
