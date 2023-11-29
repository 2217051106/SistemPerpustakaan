/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan_kel.pkg10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Perpustakaan_Kel10 {
    private static ArrayList<Buku> daftarBuku = new ArrayList<>();
//    private static ArrayList<AnggotaPerpustakaan> daftarAnggota = new ArrayList<>();
//    private static ArrayList<Admin> daftarAdmin = new ArrayList<>();


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inisialisasiDaftarBuku();
//        inisialisasiDaftarAdmin();
//        inisialisasiDaftarAnggota();


        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            tampilkanMenu();
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanDaftarBuku();
                    break;
                case 2:
                    pinjamBuku();
                    break;
                case 3:
                    kembalikanBuku();
                    break;
                case 4:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 4);
    }

    private static void tampilkanMenu() {
        System.out.println("==== Menu Perpustakaan ====");
        System.out.println("");
        System.out.println("1. Daftar Buku");
        System.out.println("2. Pinjam Buku");
        System.out.println("3. Kembalikan Buku");
        System.out.println("4. Exit");
        System.out.println("");
    }
    
     private static void tambahBuku(Scanner scanner) {
        System.out.print("Masukkan judul Buku: ");
        String judul = scanner.next();
        System.out.print("Masukkan pengarang Buku: ");
        String pengarang = scanner.next();
        System.out.print("Masukkan kode Buku: ");
        String kode = scanner.next();
        // Status buku set default to "Tersedia" when added
        daftarBuku.add(new Buku(judul, pengarang, kode, "Tersedia"));
        System.out.println("Buku baru berhasil ditambahkan.");
    }

    private static void inisialisasiDaftarBuku() {
        // Inisialisasi beberapa buku
        daftarBuku.add(new Buku("Effective Java", "Joshua Bloch", "2201", "Tersedia\n"));
        daftarBuku.add(new Buku("JavaScript", "Douglas Crockford", "2202", "Tersedia\n"));
        daftarBuku.add(new Buku("Programming Pearls", "Jon Bbentley", "2203", "Tersedia\n"));
        // Tambahkan lebih banyak buku sesuai kebutuhan
        System.out.println("");
    }

    private static void tampilkanDaftarBuku() {
        System.out.println("==== Daftar Buku ====");
        System.out.println("");
        for (int i = 0; i < daftarBuku.size(); i++) {
            System.out.println((i + 1) + ". " + daftarBuku.get(i).getDetail());
        }
        System.out.println("0. Kembali ke Menu");
        System.out.println("");
    }

    private static void pinjamBuku() {
        Scanner scanner = new Scanner(System.in);
        tampilkanDaftarBuku();
        System.out.print("Pilih nomor buku yang ingin dipinjam (0 untuk kembali ke Menu): ");
        int nomorBuku = scanner.nextInt();

        if (nomorBuku >= 1 && nomorBuku <= daftarBuku.size()) {
            Buku bukuDipinjam = daftarBuku.get(nomorBuku - 1);
            // Anda dapat melakukan lebih banyak logika peminjaman di sini
            System.out.println("Anda telah meminjam buku: " + bukuDipinjam.getDetail());
        } else if (nomorBuku != 0) {
            System.out.println("Nomor buku tidak valid.");
        }
        System.out.println("");
    }
    

    private static void kembalikanBuku() {
        Scanner scanner = new Scanner(System.in);
        // Logika pengembalian buku dapat ditambahkan di sini
        System.out.print("Masukkan nomor buku yang ingin dikembalikan (0 untuk kembali ke Menu): ");
        int nomorBuku = scanner.nextInt();

        if (nomorBuku >= 1 && nomorBuku <= daftarBuku.size()) {
            Buku bukuDikembalikan = daftarBuku.get(nomorBuku - 1);
            // Anda dapat melakukan lebih banyak logika pengembalian di sini
            System.out.println("Anda telah mengembalikan buku: " + bukuDikembalikan.getDetail());
        } else if (nomorBuku != 0) {
            System.out.println("Nomor buku tidak valid.");
        }
     
    
    }
    
}


//    private static void menuAdmin(Scanner scanner){
//        int pilihan;
//        
//        do {
//            tampilkanMenuAdmin();
//            System.out.print("Masukkan pilihan Anda: ");
//            pilihan = scanner.nextInt();
//
//            switch (pilihan) {
//                case 1:
//                    // Tambahkan logika untuk menu Tambah Anggota
//                    tambahAnggota(scanner);
//                    break;
//                case 2:
//                    // Tambahkan logika untuk menu Hapus Anggota
//                    hapusAnggota(scanner);
//                    break;
//                case 3:
//                    // Tambahkan logika untuk menu Tambah Buku
//                    tambahBuku(scanner);
//                    break;
//                case 4:
//                    // Tambahkan logika untuk menu Hapus Buku
//                    hapusBuku(scanner);
//                    break;
//                case 5:
//                    System.out.println("Terima kasih! Program selesai.");
//                    break;
//                default:
//                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
//            }
//
//        } while (pilihan != 5);
//    }
//
//    private static void tampilkanMenuAdmin() {
//        System.out.println("==== Menu Admin ====");
//        System.out.println("1. Tambah Anggota");
//        System.out.println("2. Hapus Anggota");
//        System.out.println("3. Tambah Buku");
//        System.out.println("4. Hapus Buku");
//        System.out.println("5. Exit");
//        System.out.println();
//    }
//    
//    private static void tambahAnggota(Scanner scanner) {
//        System.out.print("Masukkan nama Anggota: ");
//        String nama = scanner.next();
//        System.out.print("Masukkan alamat Anggota: ");
//        String alamat = scanner.next();
//
//        daftarAnggota.add(new AnggotaPerpustakaan(nama, alamat));
//        System.out.println("Anggota baru berhasil ditambahkan.");
//    }
//    
//    private static void hapusAnggota(Scanner scanner) {
////        tampilkanDaftarAnggota();
//        System.out.print("Masukkan nomor Anggota yang ingin dihapus: ");
//        int nomorAnggota = scanner.nextInt();
//
//        if (nomorAnggota >= 1 && nomorAnggota <= daftarAnggota.size()) {
//            daftarAnggota.remove(nomorAnggota - 1);
//            System.out.println("Anggota berhasil dihapus.");
//        } else {
//            System.out.println("Nomor Anggota tidak valid.");
//        }
//    }
//    
////    private static void tambahBuku(Scanner scanner) {
////        System.out.print("Masukkan judul Buku: ");
////        String judul = scanner.next();
////        System.out.print("Masukkan pengarang Buku: ");
////        String pengarang = scanner.next();
////        System.out.print("Masukkan kode Buku: ");
////        String kode = scanner.next();
////        // Status buku set default to "Tersedia" when added
////        daftarBuku.add(new Buku(judul, pengarang, kode, "Tersedia"));
////        System.out.println("Buku baru berhasil ditambahkan.");
////    }
//    
//    private static void hapusBuku(Scanner scanner) {
//        tampilkanDaftarBuku();
//        System.out.print("Masukkan nomor Buku yang ingin dihapus: ");
//        int nomorBuku = scanner.nextInt();
//
//        if (nomorBuku >= 1 && nomorBuku <= daftarBuku.size()) {
//            daftarBuku.remove(nomorBuku - 1);
//            System.out.println("Buku berhasil dihapus.");
//        } else {
//        
//                System.out.println("Nomor Buku tidak valid.");
//        }
//    }
//   
//
//    private static void inisialisasiDaftarAdmin() {
//        // Inisialisasi admin
//        daftarAdmin.add(new Admin("admin1", "password1"));
//        // Tambahkan lebih banyak admin jika diperlukan
//    }
//}