package POSTTEST4;


public class Yamaha extends Motor{
  private String yamaha;
    
    public Yamaha(String Nama, String Jenis, String Warna,int Harga, String Yamaha){
        super(Nama,Jenis,Warna,Harga);
        this.yamaha = Yamaha;
    }  

    public String getYamaha() {
        return yamaha;
    }

    public void setYamaha(String yamaha) {
        this.yamaha = yamaha;
    }
    @Override
    void suksesAdd(){
        System.out.println("Sepeda Motor "+ getYamaha() +" Berhasil Ditambahkan!");
    }
}
