/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST4;

/**
 *
 * @author ASUS
 */
public class Motor {
    protected String nama;
    protected String jenis;
    protected String warna;
    protected int harga;
    
    public Motor(String Nama, String Jenis,String Warna, int Harga){
        this.nama = Nama;
        this.jenis = Jenis;
        this.warna = Warna;
        this.harga = Harga;
    }
    
    void suksesAdd(){
        System.out.println("Data Berhasil Ditambahkan!");
    }
    
    void suksesUpdate(){
        System.out.println("Data Berhasil Diubah!");
    }
    
    void suksesDelete(){
        System.out.println("Data "+ getNama() +" Berhasil Dihapus!");
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
}
