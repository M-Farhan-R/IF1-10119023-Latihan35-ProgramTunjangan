/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119023.latihan35.programtunjangan;

/**
 *
 * @author Muhammad Farhan R 
 */
import java.util.Scanner;
public class Tunjangan {
    public int gajiPokok;
    public String status;
    public int tunjangan;
    public int totalGaji;
    
    public void inputGaji(){
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Berapa gaji anda perbulan?   : Rp");
        gajiPokok = scan.nextInt();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        status = scan.next();
    }
    
    public void setTunjangan(){
        if(status.equalsIgnoreCase("menikah")){
            tunjangan = gajiPokok*35/100;
        } else {
            tunjangan = 0;
        }
    }
    
    public int hitungTotalGaji(){
        totalGaji = gajiPokok + tunjangan;
        System.out.printf("Gaji Pokok\t : %12.1f%n",(float)gajiPokok);
        System.out.printf("Tunjanga\t : %12.1f%n",(float)tunjangan);
        System.out.printf("Total Gaji\t : %12.1f%n",(float)totalGaji);
        System.out.println("");
        return totalGaji;
    }
}
