/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpengubinan;

/**
 *
 * @author Asus
 */
public class Ruang {
    // panjang ruang 	
    int panjang;
    int lebar;
    
    int hitungLuas(){
        // menghitung luas dengan memanfaatkan class persegi panjang
        persegiPanjang p = new persegiPanjang();
        
        // panjang dari persegi panjang diambil dari panjang ruang
        //p.panjang = panjang;
        // lebar dari persegi panjang diambil dari lebar ruang
        //p.lebar = lebar;
        
        // hitung luasnya
        return persegiPanjang.perkalian(this.panjang, this.lebar);
    }

}
