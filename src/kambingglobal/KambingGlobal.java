/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambingglobal;

/**
 *
 * @author 
 * NAMA : Irfan Faisal Hutama Tanjung.
 * KELAS : PBO2
 * NIM : 10117060
 * Deskripsi Program : Program ini berisi menampilkan fungsi ke layar.
 * contohnya dengan menggunakan fungsi get
 */
public class KambingGlobal {

    //variabel jumlahKambing menjadi variabel instance
    int jumlahKambing = 88;
    
    //Method untuk menampilkan Jumlah kambing
    public void getJumlahKambing() {
        System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
    public void tambahKambing() {
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah : " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada 
        kambingSusu.getJumlahKambing();
        
    }
    
}
