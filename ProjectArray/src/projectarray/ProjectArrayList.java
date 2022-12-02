/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectarray;

/**
 *
 * @author Asus
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ProjectArrayList {
    
    int n;
    double iniArrayList(){
        ArrayList<Integer> iniArrayList = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan panjang arraylist: ");
        n = input.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Masukkan angka: ");
            iniArrayList.add(input.nextInt());
            
        }
        int sum = 0;
        
        for(int i=0;i<n;i++){
           sum += iniArrayList.get(i);
        }
        double rerata = sum / n;
        System.out.println("Rata-ratanya adalah = "+rerata);
        return rerata;
    }
    
}
