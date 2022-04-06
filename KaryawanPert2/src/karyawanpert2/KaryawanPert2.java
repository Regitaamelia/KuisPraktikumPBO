/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package karyawanpert2;

/**
 *
 * @author HP
 */
public class KaryawanPert2 {
    double gaji;
    private double bonus;
    
    KaryawanPert2() {
        gaji = 1000000;
        bonus = 200000;
        System.out.println(" Gaji mula-mula " + gaji + " dan bonus standar " + bonus);
    }
    
    private double hitunggaji(double gaji, double bonus) {
        return gaji + bonus;
    }
    
    void naikgaji() {
        System.out.println(" Beda profesi Beda Gaji ");
    }
    
    void setbonus(double bonus) {
        this.bonus = bonus;
    }
    
    double gettotalgaji() {
        return hitunggaji(gaji, bonus);
    }  
}
