/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectluasbangunkompleks;

/**
 *
 * @author Asus
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //menghitung luas persegi
        Persegi p1 = new Persegi();
        p1.sisi = 42;
        
        //menghitung luas 4 seperempat lingkaran
        Lingkaran l1 = new Lingkaran();
        l1.jariJari = 21;
        
        //menghitung luas gabungan
        double luasTotal;
        luasTotal = p1.hitungLuas() + 2 * l1.hitungLuas();
        System.out.println("Luas bangun kompleks tersebut = " + luasTotal + " cm");
        
        
        //soal project 2
        //
        Lingkaran l2 = new Lingkaran();
        l2.jariJari = 14;
        Lingkaran l3 = new Lingkaran();
        l3.jariJari = 7;
        
        //menghitung luas yang diarsir
        double luasArsir;
        luasArsir = (l2.hitungLuas()/2) - (l3.hitungLuas());
        System.out.println("Luas bangun yang diarsir adalah = " + luasArsir + "cm");
        
    }
    
}
