/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan56.barangantik;

/**
 *
 * @author Freza
 */
public class BarangAntik {
 private int umur;

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = 234;
    }

    public BarangAntik(int umur) {
        this.umur = umur;
    }
 public void tampilUmur(){
     System.out.println(+umur+"tahun");
 }
}
