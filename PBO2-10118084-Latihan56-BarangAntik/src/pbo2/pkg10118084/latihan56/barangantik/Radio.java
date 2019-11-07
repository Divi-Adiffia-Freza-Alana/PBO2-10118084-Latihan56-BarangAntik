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
public class Radio extends BarangAntik {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Radio(String name, int umur) {
        super(umur);
        this.name = name;
    }

    @Override
    public void tampilUmur() {
       
    }
    
}
