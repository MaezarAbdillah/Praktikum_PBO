package POSTTEST3;

/**
 *
 * @author Maezar Abdillah
 */
public class Motor {
    protected String nama;
    protected float harga;
    protected String warna;
    public Motor(String Nama, float Harga, String Warna){
        this.nama = Nama;
        this.harga = Harga;
        this.warna = Warna;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public float getHarga() {
        return harga;
    }

    public void setHarga(float harga) {
        this.harga = harga;
    }
    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
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
    
}
class Merk extends Motor{
        public String merk;
        public Merk(String Nama, float Harga,String Warna,String Merk){
            super(Nama,Harga,Warna);
            this.merk = Merk;
        }

        public String getMerk() {
            return merk;
        }


        public void setMerk(String merk) {
            this.merk = merk;
        }
}

class Jenis extends Merk{
        public String jenis;
        public Jenis(String Nama, float Harga,String Warna, String Merk, String Jenis){
            super(Nama,Harga,Warna,Merk);
            this.jenis = Jenis;
        }
        public String getJenis(){
            return jenis;
        }
        public void setJenis(String jenis){
            this.jenis = jenis;
        }
}
