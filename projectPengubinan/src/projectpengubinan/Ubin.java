/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpengubinan;

/**
 *
 * @author Asus
 */
public class Ubin {
    // panjang ubin
    int panjang;
    // lebar ubin
    int lebar;
    
    // menghitung luas sebuah ubin
    int hitungLuas(){
        persegiPanjang ubin = new persegiPanjang();
        //ubin.panjang = this.panjang;
        //ubin.lebar = this.lebar;
        int luasUbin = ubin.hitungLuas(this.panjang, this.lebar);
        
        return luasUbin;
    }

}
