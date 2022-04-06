/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor4;

/**
 *
 * @author HP
 */
public class LabaLaba extends Hewan  {
    public LabaLaba(String namaHewan, String makanan) {
        super(namaHewan, makanan);
    }

    public void berburu(){
        System.out.println(super.namaHewan + " sedang berburu " + super.makanan);
    }
}
