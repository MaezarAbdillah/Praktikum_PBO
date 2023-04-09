package POSTTEST6;

import java.util.*;
import java.io.*;

public class Main {
    

    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader br = new BufferedReader(isr);
    static formAdmin admin = new formAdmin("admin","admin123");
    static ArrayList<Yamaha> yamaha =  formAdmin.getlistyamaha();
    static ArrayList<Honda> honda = formAdmin.getlisthonda();
    
    public static void main(String[] args) throws IOException {
        
        int menu = 0;

        while(menu != 3){
            System.out.println("\n=========================");
            System.out.println("       < M E N U >       ");
            System.out.println("=========================");
            System.out.println("1. Admin");
            System.out.println("2. Pelanggan");
            System.out.println("3. Keluar");
            System.out.println("=========================");
            System.out.print("Masukkan Pilihan Anda : ");
            menu = Integer.parseInt(br.readLine());
            System.out.println("=========================\n");
            switch (menu) {
                case 1:
                    System.out.println("=================================");
                    System.out.println("           LOGIN ADMIN");
                    System.out.println("=================================");
                    int loginAttempt = 1;
                    boolean login = false;
                    do {
                        System.out.print("Masukkan Username : ");
                        String username = br.readLine();
                        System.out.print("Masukkan Password : ");
                        String password = br.readLine();
                        if(username.equals(admin.getUsername()) && password.equals(admin.getPassword())){
                            login = true;
                            admin.Menu();
                        }else{
                            System.out.println("Username atau password salah!");
                            if (loginAttempt == 3) {
                                System.out.println("Anda telah mencoba login sebanyak 3 kali, silakan coba lagi nanti.");
                                break;
                            }
                            loginAttempt++;
                        }
                    } while (!login);
                    break;
                case 2:
                    int pil = 0;
                    while(pil != 3){
                        System.out.println("=============================");
                        System.out.println("       MENU PELANGGAN");
                        System.out.println("=============================");
                        System.out.println("1. Lihat Motor Merk Honda");
                        System.out.println("2. Lihat Motor Merk Yamaha");
                        System.out.println("3. Keluar");
                        System.out.println("=============================");
                        System.out.print("Masukkan Pilihan Anda : ");
                        int pilih = Integer.parseInt(br.readLine());
                        System.out.println("=============================");
                        if(pilih == 1){
                            Read(1);
                            Press();
                        }else if(pilih == 2){
                            Read("2");
                            Press();
                        }else if(pilih == 3){
                            System.out.println("Terimakasih sudah berkunjung");
                            break;
                        }
                    }
                    break;
                case 3:
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
    
    
    public static final void Read(int pilih) throws IOException{
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
    
    public static final void Read(String pilih) throws IOException{
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
    
    public static void Press()throws IOException{
        System.out.print("Tekan Enter Untuk Kembali....");
        br.readLine();
    }
}
