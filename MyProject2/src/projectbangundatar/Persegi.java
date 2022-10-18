/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar;

/**
 *
 * @author Asus
 */
public class Persegi {
    //atribut persegi
    int sisi;
    int luas;
    int keliling;
    
    //method menghitung luas persegi
    void hitungLuas(){
        this.luas = this.sisi * this.sisi;
        System.out.println("Luasnya adalah = " + this.luas);
    }
    
    //method menghitung keliling persegi
    void hitungKeliling(){
        this.keliling = this.sisi * 4;
        System.out.println("Kelilingnya adalah = " + this.keliling);
    }
    
    //instansiasi objek persegi
    public static void main(String[] args) {
        Persegi p1 = new Persegi();
        p1.sisi = 9;
        p1.hitungLuas();
        p1.hitungKeliling();
    }
}
