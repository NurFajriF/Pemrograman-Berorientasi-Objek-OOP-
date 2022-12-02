/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation;

/**
 *
 * @author Asus
 */
public class KaryawanB extends KaryawanA {
    
    @Override
    public int hitungTunjangan(){
        if(this.masaKerja < 10){
            this.tunjangan = 3000000;
        }else{
            this.tunjangan = 4000000;
        }
        return this.tunjangan = tunjangan;
    }

    
    
}
