/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan_kel.pkg10;

/**
 *
 * @author Asus
 */
public class Notifikasi {
    private String pesan;
    
    // Konstruktor
    public Notifikasi(String pesan) {
        this.pesan = pesan;
    }


    // Metode untuk mengirim notifikasi
    public void kirimNotifikasi() {
        // Implementasi logika untuk mengirim notifikasi, misalnya ke email atau pesan teks
        System.out.println("Notifikasi: " + pesan);
    }
     
}
