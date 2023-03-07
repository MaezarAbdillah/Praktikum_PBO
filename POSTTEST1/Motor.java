/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST1;

/**
 *
 * @author ASUS
 */
public class Motor {
    String nama;
    String merk;
    String jenis;
    String warna;
    int harga;
    
    public Motor(String Nama, String Merk, String Jenis,String Warna, int Harga){
        this.nama = Nama;
        this.merk = Merk;
        this.jenis = Jenis;
        this.warna = Warna;
        this.harga = Harga;
    }
    
    void suksesAdd(){
        System.out.println("Data " + nama +" Berhasil Ditambahkan!");
    }
    
    void suksesUpdate(){
        System.out.println("Data Berhasil Diubah!");
    }
    
    void suksesDelete(){
        System.out.println("Data "+ nama +" Berhasil Dihapus!");
    }
}
