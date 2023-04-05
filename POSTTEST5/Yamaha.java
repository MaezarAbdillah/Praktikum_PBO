package POSTTEST5;

public class Yamaha extends Motor{
    final String yamaha = "Yamaha";
    
    public Yamaha(String Nama, String Jenis, String Warna,int Harga, String Yamaha){
        super(Nama,Jenis,Warna,Harga);
    }  
    @Override
    public String getNama(){
        return nama;
    }
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }
    @Override
    public String getJenis() {
        return jenis;
    }
    @Override
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    @Override
    public String getWarna() {
        return warna;
    }
    @Override
    public void setWarna(String warna) {
        this.warna = warna;
    }
    @Override
    public int getHarga() {
        return harga;
    }
    @Override
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public String getYamaha() {
        return yamaha;
    }
    
    @Override
    public void suksesAdd(){
        System.out.println("Sepeda Motor "+ getNama() +" Berhasil Ditambahkan!");
    }
    
    @Override
    public void suksesUpdate(){
        System.out.println("Data Berhasil Diubah!");
    }
    
    @Override
    public void suksesDelete(){
        System.out.println("Data "+ getNama() + " Berhasil Dihapus");
    }
}
