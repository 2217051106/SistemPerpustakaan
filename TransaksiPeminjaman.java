/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan_kel.pkg10;


import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class TransaksiPeminjaman {
    private Buku buku;
    private AnggotaPerpustakaan anggota;    
    private Date tanggalPeminjaman;
    private String waktuPeminjaman;
    private int durasiPeminjaman;

    public TransaksiPeminjaman( Buku buku, AnggotaPerpustakaan anggota, Date tanggalPeminjaman, String waktuPeminjaman, int durasiPeminjaman) {
        this.buku = buku;
        this.anggota = anggota;   
        this.tanggalPeminjaman = tanggalPeminjaman;
        this.waktuPeminjaman = waktuPeminjaman;
        this.durasiPeminjaman = durasiPeminjaman;
    }
    
        // Method untuk mendapatkan detail transaksi peminjaman
    public String getDetails() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(tanggalPeminjaman);

        StringBuilder details = new StringBuilder();
        details.append("Buku: ").append(buku.getDetail()).append("\n");
        details.append("Anggota: ").append(anggota.getDetails()).append("\n");
        details.append("Tanggal Peminjaman: ").append(formattedDate).append("\n");
        details.append("Waktu Peminjaman: ").append(waktuPeminjaman).append("\n");
        details.append("Durasi Peminjaman: ").append(durasiPeminjaman).append(" hari\n");

        return details.toString();
    }
    
     // Method untuk mengirim notifikasi jika durasi peminjaman melebihi batas
    private void kirimNotifikasiPeminjaman(String pesan) {
        Notifikasi notifikasi = new Notifikasi(pesan);
        notifikasi.kirimNotifikasi();
    }
    
    // Method untuk menghitung durasi peminjaman
    public int calculateDurasiPeminjaman() {
        // ... (kode calculateDurasiPeminjaman tetap sama)

        // Cek dan kirim notifikasi jika durasi melebihi batas tertentu
        if (durasiPeminjaman > 14) {
            kirimNotifikasiPeminjaman("Peminjaman buku " + buku.getDetail() + " telah melewati batas waktu.");
        }

        return durasiPeminjaman;
    }
    
     public String getDetail() {
        return null;
     }
//     
//    @Override
//    public String toString() {
//        return "TransaksiPeminjaman{" +
//                "anggota=" + anggota +
//                ", buku=" + buku +
//                '}';
//    }

}

        
        
