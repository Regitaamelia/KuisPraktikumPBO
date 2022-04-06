/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package karyawanpert2;

/**
 *
 * @author HP
 */
public class Polymorphism {
    public static void main(String[] args) {
        KaryawanPert2 K[] = new KaryawanPert2[3];
        K[0] = new Manager();
        K[1] = new Recepctionist();
        K[2] = new Manager();
        for (int i = 0; i < 3; i++) {
            System.out.println(" Gaji Karyawan " + i + " adalah " + K[1].gettotalgaji());
        }
        for (int i = 0; i < 3; i++) {
            K[1].naikgaji();
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(" Gaji Karyawan " + i + " sekarang adalah " + K[1].gettotalgaji());
        }
    }
            
}
