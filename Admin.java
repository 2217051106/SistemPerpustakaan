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
public class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
    

    // Method untuk generate laporan
    public void generateLaporan() {
        // Implementasi logika untuk generate laporan
        System.out.println("Laporan berhasil di-generate.");
    }

    // Method untuk mengelola buku
    public void kelolaBuku() {
        // Implementasi logika untuk mengelola buku
        System.out.println("Buku berhasil dikelola.");
    }

    // Method untuk mengelola anggota
    public void kelolaAnggota() {
        // Implementasi logika untuk mengelola anggota
        System.out.println("Anggota berhasil dikelola.");
    }


//    public boolean checkCredentials(String inputUsername, String inputPassword) {
//        return username.equals(inputUsername) && password.equals(inputPassword);
//    }
//    
    
}




//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//    
//    public void generateLaporan(){
//        System.out.println("Laporan Aktivitas telah di generate");
//        
//    }
//    
//    public void kelolaBuku(){
//        
//    }
//    
//    public void kelolaAnggota(){
//        
//    }
//}
