/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor;

/**
 *
 * @author Asus
 */
public class PersegiPanjang {
    int a;
    int b;
    PersegiPanjang(int p, int l){
        this.a = p;
        this.b = l;
    }
    
    void hitungLuas(){
        System.out.println("Luasnya adalah "+ this.a*this.b);
    }
    
    void hitungKeliling(){
        System.out.println("Kelilingnya adalah "+(2*(this.a+this.b)));
    }
    
}
