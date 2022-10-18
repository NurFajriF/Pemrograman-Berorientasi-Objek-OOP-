/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar3;

/**
 *
 * @author Asus
 */
public class Lingkaran {
    double j;
    Lingkaran(double jariJari){
        this.j = jariJari;
    }
    
    void hitungLuas(){
        System.out.println("Luasnya lingkaran adalah "+ (3.14 * this.j * this.j));
    }
    
    void hitungKeliling(){
        System.out.println("Kelilingnya lingkaran adalah "+(2 * 3.14 * this.j));
    }

}
