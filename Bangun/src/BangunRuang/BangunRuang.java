/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BangunRuang;

/**
 *
 * @author Asus
 */
public abstract class BangunRuang {
    public abstract double hitungVolume();
    public abstract double hitungLuasPerm();
    
    
    public void tampilHasil(){
        System.out.println("Luasnya: " + this.hitungVolume());
        System.out.println("Kelilingnya: " + this.hitungLuasPerm());
    }
    
}
