/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangun;

/**
 *
 * @author Asus
 */
import BangunDatar.Persegi;
import BangunDatar.PersegiPanjang;
import BangunDatar.Lingkaran;
import BangunRuang.Balok;
import BangunRuang.Bola;
import BangunRuang.Tabung;
public class Bangun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instansiasi bangun datar
        Persegi p1 = new Persegi(6);
        p1.tampilHasil();
        
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 7;
        pp1.lebar = 8;
        pp1.tampilHasil();
        
        Lingkaran l1 = new Lingkaran();
        l1.jariJari = 14;
        l1.tampilHasil();
        
        //instansiasi bangun ruang
        Balok ba1 = new Balok();
        ba1.panjang = 6;
        ba1.lebar = 7;
        ba1.tinggi = 8;
        ba1.tampilHasil();
        
        Bola bo1 = new Bola();
        bo1.jariJari = 21;
        bo1.tampilHasil();
        
        Tabung t1 = new Tabung();
        t1.jariJari = 14;
        t1.tinggi = 12;
        t1.tampilHasil();
        
        
    }
    
}
