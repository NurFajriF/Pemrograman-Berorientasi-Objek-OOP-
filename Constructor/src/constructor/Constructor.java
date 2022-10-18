/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructor;

/**
 *
 * @author Asus
 */
public class Constructor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PersegiPanjang pp1 = new PersegiPanjang(10,6);
        PersegiPanjang pp2 = new PersegiPanjang(7,3);
        pp1.hitungLuas();
        pp2.hitungLuas();
        pp1.hitungKeliling();
        pp2.hitungKeliling();
        
    }
    
}
