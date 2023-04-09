/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POSTTEST6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class formAdmin implements Admin {
    
    static ArrayList<Honda> honda = new ArrayList<>();
    static ArrayList<Honda>getlisthonda(){
        return honda;
    }
    static ArrayList<Yamaha> yamaha = new ArrayList<>();
    static ArrayList<Yamaha>getlistyamaha(){
        return yamaha;
    }
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    
    private String username;
    private String password;
    public formAdmin(String username,String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }
    
    public void Create() throws IOException{
        int pilih;
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
            System.out.print("Masukkan Jenis Sepeda Motor : ");
            String jenis = br.readLine();
            System.out.print("Masukkan Warna Sepeda Motor : ");
            String warna = br.readLine();
            System.out.print("Masukkan Harga Sepeda Motor : ");
            int harga = Integer.parseInt(br.readLine());
            Honda hnd = new Honda(nama,jenis,warna,harga,"Honda");
            hnd.suksesAdd();
            honda.add(hnd);
            ReadHonda();
            Press();
        }
        else if(pilih == 2){
            System.out.print("Masukkan Nama Sepeda Motor  : ");
            String nama = br.readLine();
            System.out.print("Masukkan Jenis Sepeda Motor : ");
            String jenis = br.readLine();
            System.out.print("Masukkan Warna Sepeda Motor : ");
            String warna = br.readLine();
            System.out.print("Masukkan Harga Sepeda Motor : ");
            int harga = Integer.parseInt(br.readLine());
            Yamaha ymh = new Yamaha(nama,jenis,warna,harga,"Yamaha");
            ymh.suksesAdd();
            yamaha.add(ymh);
            ReadYamaha();
            Press();
        }
    }
    public void ReadHonda() throws IOException{
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
    public void ReadYamaha()throws IOException{
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
    public void Update() throws IOException{
        int pilih;
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
            ReadHonda();
            System.out.print("Ingin Ganti Data Nomor Berapa : ");
            int index = Integer.parseInt(br.readLine());
            System.out.println("=============================");
            System.out.println("        < Ubah Data >        ");
            System.out.println("=============================");
            System.out.print("Masukkan Nama Sepeda Motor  : ");
            String upNama = br.readLine();
            System.out.print("Masukkan Jenis Sepeda Motor : ");
            String upJenis = br.readLine();
            System.out.print("Masukkan Warna Sepeda Motor : ");
            String upWarna = br.readLine();
            System.out.print("Masukkan Harga Sepeda Motor : ");
            int upHarga = Integer.parseInt(br.readLine());
            honda.get(index-1).setNama(upNama);
            honda.get(index-1).setJenis(upJenis);
            honda.get(index-1).setWarna(upWarna);
            honda.get(index-1).setHarga(upHarga);
            honda.get(index-1).suksesUpdate();
            ReadHonda();
            Press();
            }else{
                ReadHonda();
                Press();
            }
        }else if(pilih == 2){
            if(!yamaha.isEmpty()){
            ReadYamaha();
            System.out.print("Ingin Ganti Data Nomor Berapa : ");
            int index = Integer.parseInt(br.readLine());
            System.out.println("=============================");
            System.out.println("        < Ubah Data >        ");
            System.out.println("=============================");
            System.out.print("Masukkan Nama Sepeda Motor  : ");
            String upNama = br.readLine();
            System.out.print("Masukkan Jenis Sepeda Motor : ");
            String upJenis = br.readLine();
            System.out.print("Masukkan Warna Sepeda Motor : ");
            String upWarna = br.readLine();
            System.out.print("Masukkan Harga Sepeda Motor : ");
            int upHarga = Integer.parseInt(br.readLine());
            yamaha.get(index-1).setNama(upNama);
            yamaha.get(index-1).setJenis(upJenis);
            yamaha.get(index-1).setWarna(upWarna);
            yamaha.get(index-1).setHarga(upHarga);
            yamaha.get(index-1).suksesUpdate();
            ReadYamaha();
            Press();
            }else{
                ReadYamaha();
                Press();
            }
        }
    }
    public void Delete() throws IOException{
        int pilih;
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
            ReadHonda();
            System.out.print("Ingin Hapus Data Nomor Berapa : ");
            int index = Integer.parseInt(br.readLine());
            honda.remove(index-1).suksesDelete();
            ReadHonda();
            Press();
            }else{
                ReadHonda();
                Press();
            }
        }else if(pilih == 2){
            if(!yamaha.isEmpty()){
            ReadYamaha();
            System.out.print("Ingin Hapus Data Nomor Berapa : ");
            int index = Integer.parseInt(br.readLine());
            yamaha.remove(index-1).suksesDelete();
            ReadYamaha();
            Press();
            }else{
                ReadYamaha();
                Press();
            }
        }
    }
    public void Press()throws IOException{
        System.out.print("Tekan Enter Untuk Kembali....");
        br.readLine();
    }
    
    public void Menu()throws IOException{
        System.out.println("\nSELAMAT DATANG ADMIN");

        int pilih = 0;
        while(pilih != 5){
            System.out.println("\n=========================");
            System.out.println("       < M E N U >       ");
            System.out.println("=========================");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Logout");
            System.out.println("=========================");
            System.out.print("Masukkan Pilihan Anda : ");
            pilih = Integer.parseInt(br.readLine());
            System.out.println("=========================\n");
            switch(pilih){
                case 1:
                    Create();
                    break;
                case 2:
                    int rd;
                    System.out.println("==============================");
                    System.out.println("       < Lihat Data >        ");
                    System.out.println("==============================");
                    System.out.println("1. Honda");
                    System.out.println("2. Yamaha");
                    System.out.println("==============================");
                    System.out.print("Masukkan Pilihan Anda : ");
                    rd = Integer.parseInt(br.readLine());
                    System.out.println("==============================");
                    if(rd == 1){
                        ReadHonda();
                        Press();
                    }else if(rd == 2){
                        ReadYamaha();
                        Press();
                    }
                    break;
                case 3 :
                    Update();
                    break;
                case 4 :
                    Delete();
                    break;
                case 5 :
                    System.out.println("Sampai jumpa lagi admin!");
                    return;
                default:
                    System.out.println("Pilihan Tidak Ada!");
                    Press();
                    break;
            }
        }
    }

    
}
