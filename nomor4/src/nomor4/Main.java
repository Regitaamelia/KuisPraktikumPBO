/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomor4;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        SpiderMan spiderMan = new SpiderMan("Peter Parker", "Kalkun", "Jurnalis");

        spiderMan.berburu();
        spiderMan.makan();
        spiderMan.memanjat();


        System.out.println();

        System.out.println(spiderMan.namaHewan);
        System.out.println(spiderMan.makanan);
     
        System.out.println(spiderMan.getNamaOrang());
    }
}
