/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan56.barangantik;

/**
 *
 *Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan BarangAntik

 */
public class PBO210118084Latihan56BarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Radio radio = new Radio("Radio AM",243);
        BarangAntik barang = new BarangAntik(243);
        System.out.println("Nama barang Antik :"+radio.getName());
        System.out.print("Umur barang antik ini adalah : ");barang.tampilUmur();
    }
    
}
