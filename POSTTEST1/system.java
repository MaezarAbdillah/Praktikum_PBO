package POSTTEST1;

import java.util.ArrayList;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class system{
    static ArrayList<Motor> motor = new ArrayList<>();
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
                    Create();
                    break;
                case 2:
                    Read();
                    Press();
                    break;
                case 3:
                    Update();
                    break;
                case 4:
                    Delete();
                    break;
                case 5:
                    System.out.println("""
                                       Manusia itu unik,
                                       ada yang meneduh karena takut jatuh sakit,
                                       dan ada juga yang mencari hujan untuk melepas rasa sakit.
                                       
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
    
    public static void Create() throws IOException {
        System.out.println("==============================");
        System.out.println("       < Tambah Data >        ");
        System.out.println("==============================");
        System.out.print("Masukkan Nama Sepeda Motor  : ");
        String nama = br.readLine();
        System.out.print("Masukkan Merk Sepeda Motor  : ");
        String merk = br.readLine();
        System.out.print("Masukkan Jenis Sepeda Motor : ");
        String jenis = br.readLine();
        System.out.print("Masukkan Warna Sepeda Motor : ");
        String warna = br.readLine();
        System.out.print("Masukkan Harga Sepeda Motor : ");
        int harga = Integer.parseInt(br.readLine());
        Motor mtr = new Motor(nama,merk,jenis,warna,harga);
        mtr.suksesAdd();
        motor.add(mtr);
        Read();
        Press();
    }
    
    public static void Read() throws IOException{
        if(motor.isEmpty()){
            System.out.println("Belum Ada Data!");
            }
        else{
            System.out.println("==========================================================================================================");
            System.out.format("%1s %2s %1s %-20s %1s %-15s %1s %-15s %1s %-15s %1s %-20s %1s","|","No","|","Nama Motor","|","Merk","|","Jenis","|","Warna","|","Harga","|\n");
            System.out.println("==========================================================================================================");
            for (int i = 0;i<motor.size();i++) {
                System.out.format("%1s %2s %1s %-20s %1s %-15s %1s %-15s %1s %-15s %1s %-20s %1s","|",i+1,"|",motor.get(i).nama,"|",motor.get(i).merk,"|",motor.get(i).jenis,"|",motor.get(i).warna,"|", "Rp."+motor.get(i).harga,"|\n");
            }
            System.out.println("==========================================================================================================");
        }
    }
    
    public static void Update() throws IOException{
        Read();
        Press();
        if(!motor.isEmpty()){
            System.out.print("Ingin Ganti Data Nomor Berapa : ");
            int index = Integer.parseInt(br.readLine());
            System.out.println("=============================");
            System.out.println("        < Ubah Data >        ");
            System.out.println("=============================");
            System.out.print("Masukkan Nama Sepeda Motor  : ");
            String upNama = br.readLine();
            System.out.print("Masukkan Merk Sepeda Motor  : ");
            String upMerk = br.readLine();
            System.out.print("Masukkan Jenis Sepeda Motor : ");
            String upJenis = br.readLine();
            System.out.print("Masukkan Warna Sepeda Motor : ");
            String upWarna = br.readLine();
            System.out.print("Masukkan Harga Sepeda Motor : ");
            int upHarga = Integer.parseInt(br.readLine());
            motor.get(index-1).nama = upNama;
            motor.get(index-1).merk = upMerk;
            motor.get(index-1).jenis = upJenis;
            motor.get(index-1).warna = upWarna;
            motor.get(index-1).harga = upHarga;
            motor.get(index-1).suksesUpdate();
            Read();
            Press();
        }
    }
    
    public static void Delete() throws IOException{
        Read();
        Press();
        if(!motor.isEmpty()){
            System.out.print("Ingin Hapus Data Nomor Berapa : ");
            int index = Integer.parseInt(br.readLine());
            motor.remove(index-1).suksesDelete();
            Read();
            Press();
        }
    }
    
    public static void Press()throws IOException{
        System.out.print("Tekan Enter Untuk Kembali....");
        br.readLine();
    }
}
