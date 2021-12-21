/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Variabel;

/**
 *
 * @author Dedi Wardani
 */
public class Presensi {
     private static double presensi;
    
    //baut variabel titik-titik range pada model fuzzy nya, agar mudah untuk mengganti nilai ketika ada perubahan
   // private static double titik1=0;
    private static double tidakCukup=50;
    private static double cukup=75;
    
    //buat method untuk mengakses nilai pada variabel Presensi
    public static double getPresensi() {
        return presensi;
    }

    //buat method untuk memberikan nilai pada variabel Presensi
    public static void setPresensi(double presensi) {
         Presensi.presensi = presensi;
    }
    
    //method fungsi tidak cukup
    public static double tidakcukup(){
        if(presensi<=tidakCukup) return 1;
        else if (presensi>tidakCukup && presensi<cukup) return (cukup-presensi)/(cukup-tidakCukup);
        else return 0;
    }
    
     //method fungsi cukup
    public static double cukup(){
        if (presensi>=cukup) return 1;
        else if (presensi>tidakCukup && presensi<cukup) return (presensi + tidakCukup)/(cukup-tidakCukup);
        else return 0;
    }
}
