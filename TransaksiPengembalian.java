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
public class TransaksiPengembalian {
    private Buku buku;
    private AnggotaPerpustakaan anggota;
    private Date tanggalPengembalian;
    private String waktuPengembalian;

    public TransaksiPengembalian(Buku buku, AnggotaPerpustakaan anggota, Date tanggalPengembalian, String waktuPengembalian) {
        this.buku = buku;
        this.anggota = anggota;
        this.tanggalPengembalian = tanggalPengembalian;
        this.waktuPengembalian = waktuPengembalian;
    }
    
      // Method untuk mengirim notifikasi jika pengembalian terlambat
    private void kirimNotifikasiPengembalian(String pesan) {
        Notifikasi notifikasi = new Notifikasi(pesan);
        notifikasi.kirimNotifikasi();
    }
    
     // Method untuk mendapatkan detail transaksi pengembalian
    public String getDetail() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = dateFormat.format(tanggalPengembalian);
        
         // Cek dan kirim notifikasi jika pengembalian tidak tepat waktu
        if (tanggalPengembalian.after(new Date())) {
            kirimNotifikasiPengembalian("Buku " + buku.getDetail() + " dikembalikan terlambat.");
        }

        return "Buku yang dikembalikan: " + buku.getDetail() + "\n"
             + "Anggota yang mengembalikan: " + anggota.getDetails() + "\n"
             + "Tanggal Pengembalian: " + formattedDate + "\n"
             + "Waktu Pengembalian: " + waktuPengembalian;
    }
    
//    @Override
//    public String toString() {
//        return "TransaksiPengembalian{" +
//                "anggota=" + anggota +
//                ", buku=" + buku +
//                '}';
//    }
}



