/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author Asus
 */
public class PersegiPanjang {
    private int panjang;
    private int lebar;
    private int luas;
    private int keliling;
    
    public void setPanjang(int panjang){
        if(panjang > 0){
            this.panjang = panjang;
        }else {
            System.out.println("Nilai panjang tidak dapat negatif");
            System.exit(0);
        }
        
    }
    
    public void setLebar(int lebar){
        if(lebar > 0){
            this.lebar = lebar;
        }else {
            System.out.println("Nilai lebar tidak dapat negatif");
            System.exit(0);
        }
        
    }
    
    public int getPanjang(){
        return this.panjang = panjang;
    }
    
    public int getLebar(){
        return this.lebar = lebar;
    }
    
    int hitungLuas(){
        System.out.println("Luasnya persegi adalah "+ getPanjang()*getLebar());
        return luas;
    }
    
    int hitungKeliling(){
        System.out.println("Kelilingnya persegi adalah "+(2 * (getPanjang()+getLebar())));
        return keliling;
    }
}
