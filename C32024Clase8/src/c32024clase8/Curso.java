/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c32024clase8;

import java.util.Random;

/**
 *
 * @author viti
 */
public class Curso {

    private int notas[];
    private String data="1";
    private String data2="3";
    

    public Curso(int cantidadEstudiantes) {
        this.notas = new int[cantidadEstudiantes];
        setNotasRandom();

    }

    public void setNotasRandom() {
        for (int i = 0; i < notas.length; i++) {
            Random rand = new Random();
            notas[i] = rand.nextInt(100);;
        }

    }

    public void getTotal() {
        System.out.println("Cantidad total " + notas.length);
    }

    public void getAprobados() {
        int aprobados = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 70) {
                aprobados++;
            }
        }
        System.out.println("cantidad aprobados " + aprobados);
    }

    public void getReprobados() {
        int reprobados = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 70) {
                reprobados++;
            }
        }
        System.out.println("cantidad reprobados " + reprobados);
    }

    @Override
    public String toString() {
        return "Curso{" + "notas=" + notas + ", data=" + data + ", data2=" + data2 + '}';
    }
    
    

}
