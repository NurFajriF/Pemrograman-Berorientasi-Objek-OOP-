/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectbangundatar;

/**
 *
 * @author Asus
 */
public class PersegiPanjang {
    //atribut persegi panjang
    int panjang;
    int lebar;
    int luas;
    int keliling;
    
    
    void hitungLuas(){
        this.luas = this.panjang * this.lebar ;
        System.out.println("Luasnya adalah = " + luas);
    }
    void hitungKeliling(){
        this.keliling = 2 * (this.panjang + this.lebar);
        System.out.println("Kelilingnya adalah = " + keliling);
    }
    public static void main(String[] args) {
        PersegiPanjang ppC = new PersegiPanjang();
        PersegiPanjang ppD = new PersegiPanjang();
        ppC.panjang = 17;
        ppC.lebar = 8;
        ppD.panjang =  26;
        ppD.lebar = 14;
        ppC.hitungLuas();
        ppC.hitungKeliling();
        ppD.hitungLuas();
        ppD.hitungKeliling();

    }
}
