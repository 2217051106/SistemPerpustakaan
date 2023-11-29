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
public class Buku {
    private String judul;
    private String pengarang;
    private String nomorISBN;
    private String statusKetersediaan;

    public Buku(String judul, String pengarang, String nomorISBN, String statusKetersediaan) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.nomorISBN = nomorISBN;
        this.statusKetersediaan = statusKetersediaan;
    }

     // Method untuk mendapatkan detail buku
    public String getDetail() {
        return "Judul: " + judul + "\n"
             + "Pengarang: " + pengarang + "\n"
             + "Nomor ISBN: " + nomorISBN + "\n"
             + "Status Ketersediaan: " + statusKetersediaan;
    }
    
}


    

