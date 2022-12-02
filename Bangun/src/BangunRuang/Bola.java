/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author Asus
 */
public class Bola extends BangunRuang {
    public double jariJari;
    
    // method untuk hitung luas lingkaran
    public double hitungVolume(){
        double volume = 4.0/3 * Math.PI * this.jariJari * this.jariJari;
        return volume;
    }
    
    // method untuk hitung keliling lingkaran
    public double hitungLuasPerm(){
 	  double luasPerm = 4 * Math.PI * this.jariJari * this.jariJari;
          return luasPerm;
    }
    
    public void tampilHasil(){
        System.out.println("Volume bola: " + this.hitungVolume());
        System.out.println("Luas Permukaan bola: " + this.hitungLuasPerm());
    }
}
