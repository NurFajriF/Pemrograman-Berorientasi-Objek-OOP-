/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author Asus
 */
public class Balok extends BangunRuang {
    public double panjang;
    public double lebar;
    public double tinggi;
    
    // method untuk hitung luas lingkaran
    public double hitungVolume(){
        double volume = this.panjang * this.lebar * this.tinggi;
        return volume;
    }
    
    // method untuk hitung keliling lingkaran
    public double hitungLuasPerm(){
 	  double luasPerm = 2 * (this.panjang*this.lebar + this.panjang*this.tinggi + this.lebar*this.tinggi);
          return luasPerm;
    }
    
    public void tampilHasil(){
        System.out.println("Volume balok: " + this.hitungVolume());
        System.out.println("Luas Permukaaan balok: " + this.hitungLuasPerm());
    }
}
