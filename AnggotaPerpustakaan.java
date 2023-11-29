/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan_kel.pkg10;

import java.util.List;

/**
 *
 * @author Asus
 */
public class AnggotaPerpustakaan {
    private String idAnggota;
    private String nama;
    private String alamat;
    private List<TransaksiPeminjaman> riwayatPeminjaman ;

    public AnggotaPerpustakaan(String idAnggota, String nama, String alamat, List<TransaksiPeminjaman>riwayatPeminjaman) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.alamat = alamat;
        this.riwayatPeminjaman = riwayatPeminjaman;
    }

    AnggotaPerpustakaan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    
       // Method untuk mendapatkan detail anggota perpustakaan
    public String getDetails() {
        StringBuilder details = new StringBuilder();
        details.append("ID Anggota: ").append(idAnggota).append("\n");
        details.append("Nama: ").append(nama).append("\n");
        details.append("Alamat: ").append(alamat).append("\n");
        details.append("Riwayat Peminjaman:\n");

        for (TransaksiPeminjaman peminjaman : riwayatPeminjaman) {
            details.append("- ").append(peminjaman.getDetails()).append("\n");
        }

        return details.toString();
    }
//    @Override
//    public String toString() {
//        return "AnggotaPerpustakaan{" +
//                "nama='" + nama + '\'' +
//                ", alamat='" + alamat + '\'' +
//                '}';
//    }

} 


