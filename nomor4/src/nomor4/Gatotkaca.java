/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor4;

/**
 *
 * @author HP
 */
public class Gatotkaca extends Burung implements Manusia, Mesin {
    private String nama, bantu;
    
    public Gatotkaca(String nama, String kerja, int jauh, String namaBurung) {
        super(jauh, namaBurung);
        this.nama = nama;
        this.bantu = bantu;
    }

    public String getBantu() {
        return bantu;
    }
    
    public void setBantu() {
        this.bantu = bantu;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void membantu() {
        System.out.println(this.nama + " melakukan " + this.bantu);
    }
    
    @Override
    public void melayang() {
        System.out.println(this.nama + " melayang sejauh " + super.jauh + " meter ");
    }

    @Override
    public void makan() {
        System.out.println(this.namaBurung + " makan biji-bijian");
    } 
    
    @Override
    public void perbaiki() {
        System.out.println(this.nama + " memperbaiki " + namaMesin);
    }
}
