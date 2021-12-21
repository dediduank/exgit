/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzylogicfp;

import Variabel.NilaiTugas;
import Variabel.NilaiUas;
import Variabel.Presensi;
import java.util.Scanner;

/**
 *
 * @author Dedi Wardani
 */
public class FuzzyLogicFP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try{
            double nilai;
            
            Scanner scan = new Scanner(System.in);
            
            
            double nTugas, nUas, nPresensi;
             System.out.println("=======================");
            System.out.print("Masukkan Nilai Tugas : ");
            nTugas = scan.nextDouble();
            System.out.print("\nMasukkan Nilai UAS : ");
            nUas = scan.nextDouble();
            System.out.print("\nMasukkan Presensi (%) : ");
            nPresensi = scan.nextDouble();
            
            NilaiTugas.setNilaitugas(nTugas);
            NilaiUas.setNilaiuas(nUas);
            Presensi.setPresensi(nPresensi);
           
            Rule.hitung_u();
            Rule.hitung_z();
            
            nilai = Rule.bobot();
            
            System.out.println("\nCEK NILAI\n" );
            if(nilai>=75){
                System.out.println("Lulus");
            }
            else{
                System.out.println("Tidak Lulus");
            }
        }catch(NumberFormatException e){
            System.out.print(e.toString());
        }
    }
    
}
