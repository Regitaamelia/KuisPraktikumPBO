/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author HP
 */
public class Manusia extends MahklukHidup {
    private String NIK;
    public String Nama = "Regita";
    
    public Manusia() {
        this.isNafas = true;
        System.out.println("Manusia Telah Dibuat");
    }
    
    public void setNIK(String NIK) {
        this.NIK = NIK;
    }
    
    public String getNIK() {
        return NIK; 
    }
}
