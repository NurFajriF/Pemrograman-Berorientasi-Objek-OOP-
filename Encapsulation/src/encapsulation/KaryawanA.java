/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class KaryawanA {
    String nama;
    String nik;
    protected int masaKerja;
    private int gapok = 3000000;
    protected int tunjangan;
    private int gajiTotal;
    
    public void setMasaKerja(int masaKerja){
       if(masaKerja > 0){
           this.masaKerja = masaKerja;
           
       }else{
           System.out.println("Masa kerja tidak dapat negatif");
           System.exit(0);
       }
    }
    
    public int getMasaKerja(){
        return this.masaKerja = masaKerja;
    }
    
    
    
    
    protected int hitungTunjangan(){
        if(this.masaKerja < 10){
            this.tunjangan = 2000000;
        }else{
            this.tunjangan = 3000000;
        }
        return this.tunjangan = tunjangan;
    }
    
    private int hitungGajiTotal(){
        return this.gajiTotal = this.gapok + this.tunjangan;
    }
    
    void printStrukGaji(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nama: ");
        this.nama = input.nextLine();
        System.out.println("NIK: ");
        this.nik = input.nextLine();
        System.out.println("Masa Kerja: ");
        this.setMasaKerja(input.nextInt());
        System.out.println("------------Struk Gaji--------------");
        System.out.println("Nama: "+ this.nama);
        System.out.println("NIK: " + this.nik);
        System.out.println("Masa Kerja: " + this.masaKerja);
        System.out.println("Gaji Pokok: " + this.gapok);
        this.hitungTunjangan();
        System.out.println("Tunjangan: " + this.tunjangan);
        System.out.println("------------------------------------");
        this.hitungGajiTotal();
        System.out.println("Gaji Total: " + this.gajiTotal);
    }
    
    
}
