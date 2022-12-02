/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulation;

/**
 *
 * @author Asus
 */
public class Encapsulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Persegi
        IniPersegi p1 = new IniPersegi();
        p1.setSisi(6);
        p1.hitungLuas();
        p1.hitungKeliling();
        
        //Persegi Panjang
        //PersegiPanjang pp1 = new PersegiPanjang();
        //pp1.setPanjang(6);
        //pp1.setLebar(8);
        //pp1.hitungLuas();
        //pp1.hitungKeliling();
        
        //hitung gaji karyawan instansi X
        KaryawanA a1 = new KaryawanA();
        a1.printStrukGaji();
        
        KaryawanB b1 = new KaryawanB();
        b1.printStrukGaji();
    }
    
}
