/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectadvancedoperasi;

/**
 *
 * @author Asus
 */
public class ProjectAdvancedOperasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Operasi o1 = new Operasi();
        
        System.out.println("Hasil penjumlahan tersebut adalah "+o1.jumlahkan(3,4));
        System.out.println("Hasil penjumlahan tersebut adalah "+o1.jumlahkan(4,7,(-9)));
        System.out.println("Hasil penjumlahan tersebut adalah "+o1.jumlahkan(3.4,(-0.002),0.12313));

        System.out.println("Hasil perkalian tersebut adalah "+o1.kalikan(3, 4));
        System.out.println("Hasil perkalian tersebut adalah "+o1.kalikan(4,7,(-9)));
        System.out.println("Hasil perkalian tersebut adalah "+o1.kalikan(3.4,(-0.002),0.12313));
        System.out.println("Hasil perkalian tersebut adalah "+o1.kalikan(4.5,7.6));
    }
    
}
