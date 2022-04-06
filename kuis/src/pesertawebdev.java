/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import quis.web;
/**
 *
 * @author HP
 */
public class pesertawebdev implements web {
    String nikPeserta, namaPeserta ;
    double nilaiTulis, nilaiCoding, nilaiWawancara;
    pesertawebdev(String nikPeserta,String namaPeserta, double nilaiTulis, double nilaiCoding, double nilaiWawancara){
        this.nikPeserta = nikPeserta;
        this.namaPeserta = namaPeserta;
        this.nilaiTulis = nilaiTulis;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
    }
    
    @Override
    public double nilaiTulis() {
        // TODO Auto-generated method stub
        this.nilaiTulis = this.nilaiTulis * 0.40;
        return this.nilaiTulis;
    }
    @Override
    public double nilaiCoding() {
        // TODO Auto-generated method stub
        this.nilaiCoding = this.nilaiCoding * 0.35;
        return this.nilaiCoding;
    }
    @Override
    public double nilaiWawancara() {
        // TODO Auto-generated method stub
        this.nilaiWawancara = this.nilaiWawancara * 0.25;
        return this.nilaiWawancara;
    }

    public void setNilaiTulis(double nilai){
        nilaiTulis = nilai;
    }
    public void setNilaiCoding(double nilai){
        nilaiCoding = nilai;
    }
    public void setNilaiWawancara(double nilai){
        nilaiWawancara = nilai;
    }
    
    public double getHasil(){
        double nilaiAkhir = nilaiTulis() + nilaiCoding() + nilaiWawancara();
        return nilaiAkhir;
    }
}
