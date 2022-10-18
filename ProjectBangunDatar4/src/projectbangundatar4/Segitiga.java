/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar4;

/**
 *
 * @author Asus
 */
public class Segitiga {
    double a;
    double b;
    Segitiga(double alas, double tinggi){
        this.a = alas;
        this.b = tinggi;
    }
    
    void hitungLuas(){
        System.out.println("Luasnya segitiga adalah "+ 0.5 * this.a*this.b);
    }
}
