/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Variabel;

/**
 *
 * @author Dedi Wardani
 */
public class NilaiAkhir {
    private static double nilaiakhir;
    
    //baut variabel titik-titik range pada model fuzzy nya, agar mudah untuk mengganti nilai ketika ada perubahan
    private static double titik1=0;
    private static double nilaitidakcukup=0;
    private static double nilaicukup=75;
    private static double nilaimax=100;
    
    
    //buat method untuk mengakses nilai pada variabel Ketinggiandaerah
    public static double getNilaiakhir() {
        return nilaiakhir;
    }

    //buat method untuk memberikan nilai pada variabel ketinggian daerah
    public static void setNilaiakhir(double nilaiakhir) {
         NilaiAkhir.nilaiakhir = nilaiakhir;
    }
    
    //method fungsi tidaklulus
  
    public static double tidaklulus(double inpnilai){
        double result = nilaimax-(inpnilai*(nilaimax-0));
        return (result);
    }    
    public static double lulus(double inpnilai){
        //double result = nilaitidakcukup+(inpnilai*(nilaicukup-nilaitidakcukup));
        double result = 0+(inpnilai*(nilaimax-0));
        return (result);
    }
}
