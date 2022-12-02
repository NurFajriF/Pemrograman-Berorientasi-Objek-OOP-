/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunDatar;

/**
 *
 * @author Asus
 */
public class Persegi extends BangunDatar {
    public double sisi;
    
     public Persegi(double sisi){
        this.sisi = sisi;
    }
    
    public double hitungLuas(){
        double luas = this.sisi * this.sisi;
        return luas;
    }
    
    public double hitungKeliling(){
        double keliling = this.sisi * 4;
        return keliling;
    }
    
    @Override
    public void tampilHasil(){
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
    }
}

