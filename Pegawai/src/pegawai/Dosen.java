/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pegawai;

/**
 *
 * @author Asus
 */
import java.time.*;
public class Dosen extends Pegawai{
    String nidn;
    
    // constructor
    Dosen(String id, String nama, int gol, LocalDate tgllhr, String nidn){
        super(id, nama, gol, tgllhr);
        this.nidn = nidn;
    }
    
    // menghitung tunjangan pegawai dosen
    long hitungTunjPegawai(){
        long tunjPegawai = 1500000;
        return tunjPegawai;
    }
    
    // menghitung tunjangan fungsional dosen
    long hitungTunjFungsional(){
        long tunjFungsional;
        if (this.hitungUsia() < 40){
            tunjFungsional = 1700000;
        } else {
            tunjFungsional = 2000000;
        }
        
        return tunjFungsional;
    }
    
    // menghitung total gaji
    long hitungTotalGaji(){
        long total = this.hitungGapok() + this.hitungTunjPegawai() + this.hitungTunjFungsional();
        return total;
    }
    
    // cetak data pegawai, rincian gaji, total gaji
    void printPegawai(){
        System.out.println("ID Pegawai   : " + this.idPegawai);
        System.out.println("Nama Pegawai : " + this.nama);
        System.out.println("Golongan     : " + this.gol);
        System.out.println("Tgl Lahir    : " + this.tglLahir);
        System.out.println("NIDN         : " + this.nidn);
        System.out.println("Usia         : " + this.hitungUsia() + " tahun");
        System.out.println("Gaji Pokok   : Rp " + this.hitungGapok());
        System.out.println("Tunj Pegawai : Rp " + this.hitungTunjPegawai());
        System.out.println("Tunj Fungsi  : Rp " + this.hitungTunjFungsional());
        System.out.println("Total Gaji   : Rp " + this.hitungTotalGaji());
    }
}
