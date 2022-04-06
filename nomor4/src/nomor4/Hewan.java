/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor4;

/**
 *
 * @author HP
 */
public abstract class Hewan {
    String namaHewan;
    String makanan;

    public Hewan(String namaHewan, String makanan) {
        this.namaHewan = namaHewan;
        this.makanan = makanan;
    }

    public void makan(){
        System.out.println(this.namaHewan + " memakan " + this.makanan + ".");
        System.out.println(this.namaHewan + " kenyang.");
    }
}
