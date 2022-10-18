/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datatype;

/**
 *
 * @author Asus
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String b = "6";
        
        Scanner bacaData = new Scanner(System.in);
        System.out.println("Masukkan data nama dan umur : ");
        // String input
        String name = bacaData.nextLine();

        // Numerical input
        int age = bacaData.nextInt();
        
        double dobel = bacaData.nextDouble();
        
        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        
        
    }
    
}
