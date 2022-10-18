/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar4;

/**
 *
 * @author Asus
 */
public class Persegi {
    double s;
    Persegi(double sisi){
        this.s = sisi;
    }
    
    void hitungLuas(){
        System.out.println("Luasnya persegi adalah "+ this.s * this.s);
    }
    
    void hitungKeliling(){
        System.out.println("Kelilingnya persegi adalah "+(4 * this.s));
    }
}
