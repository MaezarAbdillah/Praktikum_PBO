package POSTTEST5;

public abstract class Motor {
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
    
    protected abstract void suksesAdd();
    protected abstract void suksesUpdate();
    protected abstract void suksesDelete();
    protected abstract void setNama(String nama);
    protected abstract String getNama();
    protected abstract void setJenis(String jenis);
    protected abstract String getJenis();
    protected abstract void setWarna(String warna);
    protected abstract String getWarna();
    protected abstract void setHarga(int harga);
    protected abstract int getHarga();    
}