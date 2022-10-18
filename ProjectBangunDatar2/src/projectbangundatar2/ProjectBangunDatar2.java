/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbangundatar2;

/**
 *
 * @author Asus
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang pp = new PersegiPanjang();
        Persegi p = new Persegi();
        Lingkaran l = new Lingkaran();
        Segitiga st = new Segitiga();
        
        //menghitung luas persegi panjang
        System.out.println("Luas persegi panjang 1 tersebut adalah "+ pp.hitungLuas(10,5));
        System.out.println("Luas persegi panjang 2 tersebut adalah "+ pp.hitungLuas(3.6,8));
        System.out.println("Luas persegi panjang 3 tersebut adalah "+ pp.hitungLuas(6,8.3));
        System.out.println("Luas persegi panjang 4 tersebut adalah "+ pp.hitungLuas(5.6,8.8));
        
        //menghitung keliling persegi panjang
        System.out.println("Keliling persegi panjang 1 tersebut adalah"+ pp.hitungKeliling(10,5));
        System.out.println("Keliling persegi panjang 2 tersebut adalah"+ pp.hitungKeliling(3.6,8));
        System.out.println("Keliling persegi panjang 3 tersebut adalah"+ pp.hitungKeliling(6,8.3));
        System.out.println("Keliling persegi panjang 4 tersebut adalah"+ pp.hitungKeliling(5.6,8.8));
        
        
       //menghitung luas persegi
       System.out.println("Luas persegi 1 tersebut adalah "+ p.hitungLuas(4.5));
       System.out.println("Luas persegi 2 tersebut adalah "+ p.hitungLuas(7));
       
       //menghitung keliling persegi
       System.out.println("Keliling persegi 1 tersebut adalah "+ p.hitungLuas(4.5));
       System.out.println("Keliling persegi 2 tersebut adalah "+ p.hitungKeliling(7));
       
       //menghitung luas lingkaran
       System.out.println("Luas lingkaran 1 tersebut adalah "+l.hitungLuas(5));
       System.out.println("Luas lingkaran 2 tersebut adalah "+l.hitungLuas(7.4));
    
       //menghitung keliling lingkaran 
       System.out.println("Keliling lingkaran 1 tersebut adalah "+l.hitungKeliling(5));
       System.out.println("Keliling lingkaran 2 tersebut adalah "+l.hitungKeliling(7.4));
       
       
       //menghitung luas segitiga
       System.out.println("Luas segitiga 1 tersebut adalah "+st.hitungLuas(8,10));
       System.out.println("Luas segitiga 2 tersebut adalah "+st.hitungLuas(8,11.5));
       System.out.println("Luas segitiga 3 tersebut adalah "+st.hitungLuas(12.2,9));
       System.out.println("Luas segitiga 4 tersebut adalah "+st.hitungLuas(13.9,20.7));
       
       
       
    }
    
}
