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
    private String nama;
    private String merk;
    private String jenis;
    private String warna;
    private int harga;
    
    public Motor(String Nama, String Merk, String Jenis,String Warna, int Harga){
        this.nama = Nama;
        this.merk = Merk;
        this.jenis = Jenis;
        this.warna = Warna;
        this.harga = Harga;
    }
    
    void suksesAdd(){
        System.out.println("Data " + getNama() +" Berhasil Ditambahkan!");
    }
    
    void suksesUpdate(){
        System.out.println("Data Berhasil Diubah!");
    }
    
    void suksesDelete(){
        System.out.println("Data "+ getNama() +" Berhasil Dihapus!");
    }
    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the merk
     */
    public String getMerk() {
        return merk;
    }

    /**
     * @param merk the merk to set
     */
    public void setMerk(String merk) {
        this.merk = merk;
    }

    /**
     * @return the jenis
     */
    public String getJenis() {
        return jenis;
    }

    /**
     * @param jenis the jenis to set
     */
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    /**
     * @return the warna
     */
    public String getWarna() {
        return warna;
    }

    /**
     * @param warna the warna to set
     */
    public void setWarna(String warna) {
        this.warna = warna;
    }

    /**
     * @return the harga
     */
    public int getHarga() {
        return harga;
    }

    /**
     * @param harga the harga to set
     */
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
}
