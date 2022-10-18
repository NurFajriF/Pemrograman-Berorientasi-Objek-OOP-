/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar;

/**
 *
 * @author Asus
 */
public class Lingkaran {
    //atribut lingkaran
    double jariJari;
    double luas;
    double keliling;
    
    //method untuk menghitung luas lingkaran
    void hitungLuas(){
        this.luas = 22/7 * this.jariJari * this.jariJari;
        System.out.println("Luasnya adalah = " + this.luas);
    }
    
    //method untuk menghitung keliling lingkaran
    void hitungKeliling(){
        this.keliling = 2 * 22/7 * this.jariJari;
        System.out.println("Kelilingnya adalah = " + this.keliling);
    }
    
    //instansiasi objek lingkaran
    public static void main(String[] args) {
        Lingkaran L1 = new Lingkaran();
        L1.jariJari = 6;
        L1.hitungLuas();
        L1.hitungKeliling();
        Lingkaran L2 = new Lingkaran();
        L2.jariJari = 12;
        L2.hitungLuas();
        L2.hitungKeliling();
    }
    
}
