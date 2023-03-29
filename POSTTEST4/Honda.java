package POSTTEST4;

public class Honda extends Motor{
    private String honda;
    
    public Honda(String Nama, String Jenis, String Warna,int Harga, String Honda){
        super(Nama,Jenis,Warna,Harga);
        this.honda = Honda;
    }

    public String getHonda() {
        return honda;
    }

    public void setHonda(String honda) {
        this.honda = honda;
    }
    @Override
    void suksesAdd(){
        System.out.println("Sepeda Motor "+ getHonda() +" Berhasil Ditambahkan!");
    }
}
