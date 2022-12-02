/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Asus
 */
//menggunakan konsep abstraksi
public abstract class BangunDatar {
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
    
    
    public void tampilHasil(){
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
    }
    
    public static void main(String[] args) {
        Persegi p1 = new Persegi(6);
        p1.tampilHasil();
        
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 7;
        pp1.lebar = 8;
        
        Lingkaran l1 = new Lingkaran();
        l1.jariJari = 14;
        
    }
}
