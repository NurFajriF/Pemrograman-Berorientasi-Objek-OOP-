/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author Asus
 */
public class IniPersegi {
    private int sisi;
    private int luas;
    private int keliling;
    
    
    public void setSisi(int sisi){
        if(sisi > 0){
            this.sisi = sisi;
        }else {
            System.out.println("Nilai sisi tidak dapat negatif");
            System.exit(0);
        }
        
    }
    
    public int getSisi(){
        return this.sisi = sisi;
    }
    
    
    int hitungLuas(){
        System.out.println("Luasnya persegi adalah "+ getSisi()*getSisi());
        return luas;
    }
    
    int hitungKeliling(){
        System.out.println("Kelilingnya persegi adalah "+(4 * getSisi()));
        return keliling;
    }
    
}
