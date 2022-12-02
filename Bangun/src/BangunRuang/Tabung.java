/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author Asus
 */
public class Tabung extends BangunRuang{
    public double jariJari;
    public double tinggi;
    
    // method untuk hitung luas lingkaran
    public double hitungVolume(){
        double volume = Math.PI * this.jariJari * this.jariJari * this.tinggi;
        return volume;
    }
    
    // method untuk hitung keliling lingkaran
    public double hitungLuasPerm(){
 	  double luasPerm = (2 * Math.PI * this.jariJari * this.jariJari) +(2 * Math.PI * this.jariJari) ;
          return luasPerm;
    }
    
    public void tampilHasil(){
        System.out.println("Volume tabung: " + this.hitungVolume());
        System.out.println("Luas Permukaan tabung: " + this.hitungLuasPerm());
    }
}
