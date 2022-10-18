/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectcontrolstatement;

/**
 *
 * @author Asus
 */
 import java.util.Scanner;
public class ProjectControlStatement {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner bacaData = new Scanner(System.in);
        ProjectControlStatement cekBil = new ProjectControlStatement();
        double sum = 0;
        while (true){
            System.out.println("Masukkan bilangan bulat: ");
            int bil = bacaData.nextInt();
            sum += bil;
            System.out.println("Entri lagi? (y/n)");
            char lagi = bacaData.next().charAt(0);
            if(lagi == 'n'){
                System.out.println("Rata-ratanya adalah: "+ sum);
                break; 
            }    
        }
        
    }
    
}
