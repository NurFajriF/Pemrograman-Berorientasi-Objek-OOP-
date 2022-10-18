/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectbangundatar4;

/**
 *
 * @author Asus
 */
 import java.util.Scanner;
public class ProjectBangunDatar4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //menghitung luas persegi panjang
        Scanner bacaData = new Scanner(System.in);
        System.out.println("Masukkan panjang dan lebar persegi panjang : ");
        //input panjang dan lebar persegi panjang
        Double p = bacaData.nextDouble();
        Double l = bacaData.nextDouble();
        PersegiPanjang pp1 = new PersegiPanjang(p, l);
        pp1.hitungLuas();
        pp1.hitungKeliling();
        
        System.out.println("Masukkan panjang sisi persegi : ");
        //input panjang sisi persegi
        Double s = bacaData.nextDouble();
        Persegi p1 = new Persegi(s);
        p1.hitungLuas();
        p1.hitungKeliling();
        
        System.out.println("Masukkan jari-jari lingkaran : ");
        //input jari-jari lingkaran
        double j = bacaData.nextDouble();
        Lingkaran l1 = new Lingkaran(j);
        l1.hitungLuas();
        l1.hitungKeliling();
        
        System.out.println("Masukkan alas dan tinggi segitiga : ");
        //input alas dan tinggi segitiga
        Double a = bacaData.nextDouble();
        Double t = bacaData.nextDouble();
        Segitiga s1 = new Segitiga(a, t);
        s1.hitungLuas();
    }
    
}
