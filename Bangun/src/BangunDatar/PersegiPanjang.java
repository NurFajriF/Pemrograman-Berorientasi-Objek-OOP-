/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Asus
 */
public class PersegiPanjang extends BangunDatar{
    public double panjang;
    public double lebar;
    
    // method untuk hitung luas lingkaran
    public double hitungLuas(){
        double luas = this.panjang * this.lebar;
        return luas;
    }
    
    // method untuk hitung keliling lingkaran
    public double hitungKeliling(){
 	  double keliling = 2 * (this.panjang + this.lebar);
          return keliling;
    }
    
    @Override
    public void tampilHasil(){
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
    }
}
