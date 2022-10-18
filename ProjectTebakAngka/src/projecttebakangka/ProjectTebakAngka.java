/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projecttebakangka;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class ProjectTebakAngka {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("“Hai.. nama saya Mr. Lappie, saya telah memilih sebuah bilangan bulat secara acak antara 1 s/d 100. Silakan tebak ya!!!”");
        int bil = 1 + (int)(10* Math.random());
        int skor = 100;
        while (true){
           int tebakan = input.nextInt();
           if(tebakan < bil){
               System.out.println("Hehehe...Bilangan tebakan anda terlalu kecil");
               skor -= 2;
           }else if(tebakan > bil){
               System.out.println("Hehehe...Bilangan tebakan anda terlalu besar");
               skor -= 2;
           }else if(tebakan == bil){
               System.out.println("Yatta..Tebakan anda BENAR :)");
               System.out.println("Skor Anda : " + skor);
               System.out.println("Entri lagi? (y/n)");
                char lagi = input.next().charAt(0);
                
                if(lagi == 'n'){
                    break; 
                }   
           }
           if(skor == 0){
               System.out.println("Yaah... Skor kamu udah habis");
           }
        }
    }
    
}
