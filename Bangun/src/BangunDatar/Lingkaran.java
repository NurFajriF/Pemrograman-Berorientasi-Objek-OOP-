/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Asus
 */
public class Lingkaran extends BangunDatar {
    //atribut jari-jari lingkaran
    public double jariJari;
    
    // method untuk hitung luas lingkaran
    public double hitungLuas(){
        double luas = Math.PI * this.jariJari * this.jariJari;
        return luas;
    }
    
    // method untuk hitung keliling lingkaran
    public double hitungKeliling(){
 	  double keliling = 2 * Math.PI * this.jariJari;
          return keliling;
    }
    
    @Override
    public void tampilHasil(){
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
    }

}
