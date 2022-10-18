/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar4;

/**
 *
 * @author Asus
 */
public class PersegiPanjang {
    double a;
    double b;
    PersegiPanjang(double p, double l){
        this.a = p;
        this.b = l;
    }
    
    void hitungLuas(){
        System.out.println("Luasnya persegi panjang adalah "+ this.a*this.b);
    }
    
    void hitungKeliling(){
        System.out.println("Kelilingnya persegi panjang adalah "+(2*(this.a+this.b)));
    }
    
}
