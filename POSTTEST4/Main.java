package POSTTEST4;

import java.util.*;
import java.io.*;

public class Main {
    static ArrayList<Honda> honda = new ArrayList<>();
    static ArrayList<Yamaha> yamaha = new ArrayList<>();
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    
    public static void main(String[] args) throws IOException {
        
        int menu = 0;

        while(menu != 5){
            System.out.println("\n=========================");
            System.out.println("       < M E N U >       ");
            System.out.println("=========================");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.println("=========================");
            System.out.print("Masukkan Pilihan Anda : ");
            menu = Integer.parseInt(br.readLine());
            System.out.println("=========================\n");
            switch (menu) {
                case 1:
                    Create(0);
                    break;
                case 2:
                    int pil;
                    System.out.println("==============================");
                    System.out.println("       < Lihat Data >        ");
                    System.out.println("==============================");
                    System.out.println("1. Honda");
                    System.out.println("2. Yamaha");
                    System.out.println("==============================");
                    System.out.print("Masukkan Pilihan Anda : ");
                    pil = Integer.parseInt(br.readLine());
                    System.out.println("=========================");
                    if(pil == 1){
                        Read(1);
                        Press();
                    }
                    else if(pil == 2){
                        Read("2");
                        Press();
                    }
                    break;
                case 3:
                    Update(0);
                    break;
                case 4:
                    Delete(0);
                    break;
                case 5:
                    System.out.println("""
                                       Terimakasih pernah singgah lalu beranjak pergi.
                                       See You In The Next Posttest.
                                       """);
                    break;
                default:
                    System.out.println("Pilihan Tidak Ada!");
                    Press();
                    break;
            }
        }
    }
    
    public static void Create(int pilih) throws IOException {
        System.out.println("==============================");
        System.out.println("       < Tambah Data >        ");
        System.out.println("==============================");
        System.out.println("1. Honda");
        System.out.println("2. Yamaha");
        System.out.println("==============================");
        System.out.print("Masukkan Pilihan Anda : ");
        pilih = Integer.parseInt(br.readLine());
        System.out.println("=========================");
        if(pilih == 1){
            System.out.print("Masukkan Nama Sepeda Motor  : ");
            String nama = br.readLine();
            String merk = "Honda";
            System.out.print("Masukkan Jenis Sepeda Motor : ");
            String jenis = br.readLine();
            System.out.print("Masukkan Warna Sepeda Motor : ");
            String warna = br.readLine();
            System.out.print("Masukkan Harga Sepeda Motor : ");
            int harga = Integer.parseInt(br.readLine());
            Honda hnd = new Honda(nama,jenis,warna,harga,merk);
            hnd.suksesAdd();
            honda.add(hnd);
            Read(1);
            Press();
        }
        else if(pilih == 2){
            System.out.print("Masukkan Nama Sepeda Motor  : ");
            String nama = br.readLine();
            String merk = "Yamaha";
            System.out.print("Masukkan Jenis Sepeda Motor : ");
            String jenis = br.readLine();
            System.out.print("Masukkan Warna Sepeda Motor : ");
            String warna = br.readLine();
            System.out.print("Masukkan Harga Sepeda Motor : ");
            int harga = Integer.parseInt(br.readLine());
            Yamaha ymh = new Yamaha(nama,jenis,warna,harga,merk);
            ymh.suksesAdd();
            yamaha.add(ymh);
            Read("2");
            Press();
        }
        
    }
    
    public static void Read(int pilih) throws IOException{
        if(honda.isEmpty()){
            System.out.println("Belum Ada Data!");
            }
        else{
            System.out.println("==========================================================================================================");
            System.out.format("%1s %2s %1s %-20s %1s %-15s %1s %-15s %1s %-15s %1s %-20s %1s","|","No","|","Nama Motor","|","Merk","|","Jenis","|","Warna","|","Harga","|\n");
            System.out.println("==========================================================================================================");
            for (int i = 0;i<honda.size();i++) {
                System.out.format("%1s %2s %1s %-20s %1s %-15s %1s %-15s %1s %-15s %1s %-20s %1s","|",i+1,"|", honda.get(i).getNama(),"|", honda.get(i).getHonda(),"|", honda.get(i).getJenis(),"|", honda.get(i).getWarna(),"|", "Rp."+honda.get(i).getHarga(),"|\n");
            }
            System.out.println("==========================================================================================================");
        }
    }
    
    public static void Read(String pilih) throws IOException{
        if(yamaha.isEmpty()){
            System.out.println("Belum Ada Data!");
            }
        else{
            System.out.println("==========================================================================================================");
            System.out.format("%1s %2s %1s %-20s %1s %-15s %1s %-15s %1s %-15s %1s %-20s %1s","|","No","|","Nama Motor","|","Merk","|","Jenis","|","Warna","|","Harga","|\n");
            System.out.println("==========================================================================================================");
            for (int i = 0;i<yamaha.size();i++) {
                System.out.format("%1s %2s %1s %-20s %1s %-15s %1s %-15s %1s %-15s %1s %-20s %1s","|",i+1,"|", yamaha.get(i).getNama(),"|", yamaha.get(i).getYamaha(),"|", yamaha.get(i).getJenis(),"|", yamaha.get(i).getWarna(),"|", "Rp."+yamaha.get(i).getHarga(),"|\n");
            }
            System.out.println("==========================================================================================================");
        }
    }
    
    public static void Update(int pilih) throws IOException{
        System.out.println("==============================");
        System.out.println("       < Ubah Data >        ");
        System.out.println("==============================");
        System.out.println("1. Honda");
        System.out.println("2. Yamaha");
        System.out.println("==============================");
        System.out.print("Masukkan Pilihan Anda : ");
        pilih = Integer.parseInt(br.readLine());
        System.out.println("=========================");
        if(pilih == 1){
            if(!honda.isEmpty()){
            Read(1);
            System.out.print("Ingin Ganti Data Nomor Berapa : ");
            int index = Integer.parseInt(br.readLine());
            System.out.println("=============================");
            System.out.println("        < Ubah Data >        ");
            System.out.println("=============================");
            System.out.print("Masukkan Nama Sepeda Motor  : ");
            String upNama = br.readLine();
            String upMerk = "Honda";
            System.out.print("Masukkan Jenis Sepeda Motor : ");
            String upJenis = br.readLine();
            System.out.print("Masukkan Warna Sepeda Motor : ");
            String upWarna = br.readLine();
            System.out.print("Masukkan Harga Sepeda Motor : ");
            int upHarga = Integer.parseInt(br.readLine());
            honda.get(index-1).setNama(upNama);
            honda.get(index-1).setHonda(upMerk);
            honda.get(index-1).setJenis(upJenis);
            honda.get(index-1).setWarna(upWarna);
            honda.get(index-1).setHarga(upHarga);
            honda.get(index-1).suksesUpdate();
            Read(1);
            Press();
            }else{
                Read(1);
                Press();
            }
        }else if(pilih == 2){
            if(!yamaha.isEmpty()){
            Read("2");
            System.out.print("Ingin Ganti Data Nomor Berapa : ");
            int index = Integer.parseInt(br.readLine());
            System.out.println("=============================");
            System.out.println("        < Ubah Data >        ");
            System.out.println("=============================");
            System.out.print("Masukkan Nama Sepeda Motor  : ");
            String upNama = br.readLine();
            String upMerk = "Yamaha";
            System.out.print("Masukkan Jenis Sepeda Motor : ");
            String upJenis = br.readLine();
            System.out.print("Masukkan Warna Sepeda Motor : ");
            String upWarna = br.readLine();
            System.out.print("Masukkan Harga Sepeda Motor : ");
            int upHarga = Integer.parseInt(br.readLine());
            yamaha.get(index-1).setNama(upNama);
            yamaha.get(index-1).setYamaha(upMerk);
            yamaha.get(index-1).setJenis(upJenis);
            yamaha.get(index-1).setWarna(upWarna);
            yamaha.get(index-1).setHarga(upHarga);
            yamaha.get(index-1).suksesUpdate();
            Read("2");
            Press();
            }else{
                Read("2");
                Press();
            }
        }
        
    }
    
    public static void Delete(int pilih) throws IOException{
        System.out.println("=============================");
        System.out.println("        < Hapus Data >        ");
        System.out.println("=============================");
        System.out.println("1. Honda");
        System.out.println("2. Yamaha");
        System.out.println("==============================");
        System.out.print("Masukkan Pilihan Anda : ");
        pilih = Integer.parseInt(br.readLine());
        System.out.println("=========================");
        if(pilih == 1){
            if(!honda.isEmpty()){
            Read(1);
            System.out.print("Ingin Hapus Data Nomor Berapa : ");
            int index = Integer.parseInt(br.readLine());
            honda.remove(index-1).suksesDelete();
            Read(1);
            Press();
            }else{
                Read(1);
                Press();
            }
        }else if(pilih == 2){
            if(!yamaha.isEmpty()){
            Read("2");
            System.out.print("Ingin Hapus Data Nomor Berapa : ");
            int index = Integer.parseInt(br.readLine());
            yamaha.remove(index-1).suksesDelete();
            Read("2");
            Press();
            }else{
                Read("2");
                Press();
            }
        }
        
    }
    
    public static void Press()throws IOException{
        System.out.print("Tekan Enter Untuk Kembali....");
        br.readLine();
    }
}
