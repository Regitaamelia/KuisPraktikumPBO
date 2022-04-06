/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor4;

/**
 *
 * @author HP
 */
public class SpiderMan extends LabaLaba implements Parkour {
    private String namaOrang;

    public SpiderMan(String namaOrang, String namaHewan, String makanan) {
        super(namaHewan, makanan);
        this.namaOrang = namaOrang;
    }

    public String getNamaOrang() {
        return namaOrang;
    }

    public void setNamaOrang(String namaOrang) {
        this.namaOrang = namaOrang;
    }
    
    @Override
    public void memanjat() {
        System.out.println(this.namaOrang + " memanjat ");
    }
    
    @Override
    public void berburu() {
        super.berburu();
    }

}
