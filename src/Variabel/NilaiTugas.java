/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Variabel;

/**
 *
 * @author Dedi Wardani
 */
public class NilaiTugas {
    //buat variabel persediaan yang nantinya menjadi nilai masukan
   private static double nilaitugas;
    
    //buat variabel titik-titik range pada model fuzzy nya, agar mudah untuk mengganti nilai ketika ada perubahan
   
    private static double NilaiRendah=50;
    private static double NilaiSedang=75;
    private static double NilaiTinggi=100;
    //buat method untuk mengakses nilai pada variabel nilaitugas
    public static double getNilaitugas() {
        return nilaitugas;
    }

    //buat method untuk memberikan nilai pada variabel nilaitugas
     public static void setNilaitugas(double nilaiTugas) {
         NilaiTugas.nilaitugas = nilaiTugas;
    }
    
    //method fungsi rendah
    public static double rendah(){
        if (nilaitugas<=NilaiRendah) return 1;
        else if (nilaitugas>NilaiRendah && nilaitugas<NilaiSedang) return (NilaiSedang-nilaitugas)/(NilaiSedang-NilaiRendah);
        else return 0;
    }
    //method fungsi sedang
    public static double sedang(){
        if (nilaitugas>NilaiRendah && nilaitugas<NilaiSedang) return (nilaitugas-NilaiRendah)/(NilaiSedang-NilaiRendah);
        else if (nilaitugas>NilaiSedang && nilaitugas <NilaiTinggi) return (NilaiTinggi-nilaitugas)/(NilaiTinggi-NilaiSedang);
        else if (nilaitugas == NilaiSedang) return 1;
        else return 0;
    }
    //method fungsi tinggi
    public static double tinggi(){
        if (nilaitugas>=NilaiTinggi) return 1;
        else if (nilaitugas>NilaiSedang && nilaitugas<NilaiTinggi) return (nilaitugas-NilaiSedang)/(NilaiTinggi-NilaiSedang);
        else return 0;
    }

}
