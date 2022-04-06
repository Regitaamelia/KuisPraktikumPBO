/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Kuisprakpbo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input =  new Scanner(System.in);
        System.out.println("FORM PENDAFTARAN PT. UDIN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih Jenis Menu Form : ");
        int pilmenu = Integer.parseInt(input.nextLine());
        String nik, nama;
        double[] nilai = new double[4];
        int menu_utama;
        switch (pilmenu) {
            case 1:
                System.out.println("+++ Form Pendaftaran +++ ");
                System.out.print(" Input NIK : ");
                nik = input.nextLine();
                System.out.print(" Input Nama : ");
                nama = input.nextLine();
                
                System.out.print(" Input Nilai Tes Tulis : ");
                nilai[0] = input.nextDouble();
                System.out.print(" Input Nilai Tes Coding : ");
                nilai[1] = input.nextDouble();
                System.out.print(" Input Nilai Wawancara : ");
                nilai[2] = input.nextDouble();
                pesertaanimasi PesertaAnimasi = new pesertaanimasi(nik, nama, nilai[0], nilai[1], nilai[2]);
                do{
                    System.out.println(" Menu ");
                    System.out.println(" 1. Edit");
                    System.out.println(" 2. Tampil");
                    System.out.println(" 3. Exit");
                    System.out.print(" Pilih : ");
                    menu_utama  = input.nextInt();
                    switch(menu_utama) {
                        case 1:
                            System.out.println(" FORM EDIT ");
                            System.out.print(" Input Nilai Tes Tulis : ");
                            nilai[0] = input.nextDouble();
                            PesertaAnimasi.setNilaiTulis(nilai[0]);
                            System.out.print(" Input Nilai Tes Coding : ");
                            nilai[1] = input.nextDouble();
                            PesertaAnimasi.setNilaiCoding(nilai[1]);
                            System.out.print(" Input Nilai Tes Wawancara : ");
                            nilai[2] = input.nextDouble();
                            PesertaAnimasi.setNilaiWawancara(nilai[2]);
                            break;
                            
                        case 2: 
                            double hasil = PesertaAnimasi.getHasil();
                            System.out.println(" Nilai Akhir    : " + hasil);
                            System.out.println(" KETERANGAN     : " + PesertaAnimasi.keterangan()); 
                            if(hasil < 85){
                                System.out.println(" Mohon maaf, "+ PesertaAnimasi.namaPeserta + " dari " + PesertaAnimasi.asalSekolah + " tidak lolos seleksi lomba animasi");
                            }else {
                                System.out.println(" Selamat, "+ PesertaAnimasi.namaPeserta + " dari " + PesertaAnimasi.asalSekolah + " lolos seleksi lomba animasi");
                            }
                            break;
                           
                        case 3: 
                            System.exit(0);
                            break;
                        default: System.out.println("Opsi tidak ada, Mohon masukkan opsi dengan benar");
                            break;
                        }
                }while(menu_utama != 3);
                break;
            case 2: 
                System.out.println("+++ Form Pendaftaran +++ ");
                System.out.print(" Input NIK : ");
                nik = input.nextLine();
                System.out.print(" Input Nama : ");
                nama = input.nextLine();
               
                System.out.print(" Input Nilai Tes Tulis : ");
                nilai[0] = input.nextDouble();
                System.out.print(" Input Nilai Tes Coding : ");
                nilai[1] = input.nextDouble();
                System.out.print(" Input Nilai Tes Wawancara : ");
                nilai[2] = input.nextDouble();
                pesertasurat PesertaSurat = new pesertasurat(nik, nama, nilai[0], nilai[1], nilai[2], nilai[3]);
                do{
                    System.out.println(" Menu ");
                    System.out.println(" 1. Edit");
                    System.out.println(" 2. Tampil");
                    System.out.println(" 3. Exit");
                    System.out.print(" Pilih : ");
                    menu_utama  = input.nextInt();
                    switch (menu_utama) {
                        case 1:
                            System.out.println(" FORM EDIT ");
                            System.out.print(" Input Nilai Tes Tulis : ");
                            nilai[0] = input.nextDouble();
                            PesertaSurat.setNilaiTulis(nilai[0]);
                            System.out.print(" Input Nilai Tes Coding : ");
                            nilai[1] = input.nextDouble();
                            PesertaSurat.setNilaiCoding(nilai[1]);
                            System.out.print(" Input Nilai Tes Wawancara : ");
                            nilai[2] = input.nextDouble();
                            PesertaSurat.setNilaiWawancara(nilai[2]);
                            break;
                            
                        case 2: 
                            double hasil = PesertaSurat.getHasil();
                            System.out.println(" Nilai Akhir    : " + hasil);
                            System.out.println(" Keterangan     : " + PesertaSurat.keterangan()); 
                            if(hasil < 85){
                                System.out.println(" Mohon maaf, "+ PesertaSurat.namaPeserta + " dari " + PesertaSurat.asalSekolah + " tidak lolos seleksi lomba surat");
                            }else {
                                System.out.println(" Selamat, "+ PesertaSurat.namaPeserta + " dari " + PesertaSurat.asalSekolah + " lolos seleksi lomba surat");
                            }
                            break;
                            
                        case 3: 
                            System.exit(0);
                            break;
                        default: System.out.println(" Opsi tidak ada, Mohon masukkan opsi dengan benar");
                            break;
                    }
                   
                }while(utama != 3);
               
                break;
            default: System.out.println(" Opsi tidak ada, Mohon masukkan opsi dengan benar");
                break;
        }
        input.close();
    }
    
}
