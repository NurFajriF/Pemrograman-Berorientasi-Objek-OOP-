/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pegawai;

/**
 *

 * @author Asus
 */
import java.util.Scanner;
import java.time.*;
public class Pegawai {

    /**
     * @param args the command line arguments
     */
    String idPegawai;
    String nama;
    int gol;
    LocalDate tglLahir;
    
    // constructor
    Pegawai(String id, String nama, int gol, LocalDate tgllhr){
        this.idPegawai = id;
        this.nama = nama;
        this.gol = gol;
        this.tglLahir = tgllhr;
    }
    
    int hitungUsia(){
        // mendapatkan tanggal hari ini
        LocalDate today = LocalDate.now();
        // hitung selisih tgl lahir dan tgl hari ini
        Period selisih = Period.between(this.tglLahir, today);
        return selisih.getYears();
    }
    
    long hitungGapok(){
        long gapok = 0;
        if (this.gol == 1){
            if (this.hitungUsia() < 40){
               gapok = 3500000;
            } else {
               gapok = 4500000;
            }
        } else if (this.gol == 2){
            if (this.hitungUsia() < 40){
               gapok = 5000000;
            } else {
               gapok = 6000000;
            }
        }
        return gapok;
    }
    
    // mencetak data pegawai dan gaji pokoknya
    void printPegawai(){
        System.out.println("ID Pegawai   : " + this.idPegawai);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Golongan     : " + this.gol);
        System.out.println("Tgl Lahir    : " + this.tglLahir);
        System.out.println("Gaji Pokok   : Rp " + this.hitungGapok());
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        LocalDate tgllahir = LocalDate.parse("1982-02-10"); 
        NonDosen iniPegawai1 = new NonDosen("8", "Joko", 3, tgllahir);
        iniPegawai1.printPegawai();
    }
    
}
