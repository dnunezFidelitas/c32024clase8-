/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c32024clase8;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C32024Clase8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad[] = new int[5];
        System.out.println("edad[]" + edad[0]);
        
        String names[] = new String[5];
        System.out.println("names[]" + names[0]);
        
        edad[0]=18;
        edad[1]=40;
        edad[4]=99;
        System.out.println("edad[]" + edad[0]);
        System.out.println("edad[]" + edad[1]);
        //edad[5]=10; error
        int result = edad[0]+edad[1];
        System.out.println(result + " result");
        
        
        names[0]= "A";
        names[1]= "B";
        
        System.out.println(names[1] + names[0] + " Suma de string ");
        System.out.println("A"+"B" + " Suma de string ");
        int ultimo=edad.length-1;
        System.out.println("ultimo "+  ultimo); 
        System.out.println("ultimo " + edad[edad.length-1]);
        
        
        for (int i = 0; i < edad.length; i++) {
            System.out.println("Valor "+  i + " "+ edad[i]);
        }
        
        System.out.println("--------------------------");
        
        int libros[] = new int [20];
        
        UtilArray utilArray = new UtilArray();
        utilArray.llenaArreglo(edad);
        utilArray.imprimeArreglo(edad);
       
        utilArray.llenaArreglo(libros);
        utilArray.imprimeArreglo(libros);
        
        System.out.println("--------------------------");
        
        int calificaciones[][] = new int[2][3];
        UtilMatrix utilMatrix = new UtilMatrix();
        //utilMatrix.solData(calificaciones, 2, 3);
        //utilMatrix.printMatrix(calificaciones, 2, 3);
        
        System.out.println("--------------------------");
        Curso sc202 = new Curso(28);
        sc202.getTotal();
        sc202.getReprobados();
        sc202.getAprobados();
        
        System.out.println(sc202.toString()); ;
        
        Curso sc203 = new Curso(10);
        sc203.getTotal();
        sc203.getReprobados();
        sc203.getAprobados();
        
        
        
    }
    
    
    
    
}
