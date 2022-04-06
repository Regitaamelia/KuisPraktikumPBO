/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor4;

/**
 *
 * @author HP
 */
public class Burung {
    int jauh;
    String namaBurung;

    public Burung(int jauh, String namaBurung) {
        this.jauh = jauh;
        this.namaBurung = namaBurung;
    }
    
    public void melayang(){
        System.out.println(this.namaBurung + " melayang sejauh " + jauh + " meter");
    }
    void makan(){
        System.out.println(this.namaBurung + " makan biji-bijian");
    }
    
    
}
