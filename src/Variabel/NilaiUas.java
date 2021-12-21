/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Variabel;

/**
 *
 * @author Dedi Wardani
 */
public class NilaiUas {
    //buat variabel permintaan yang nantinya menjadi nilai masukan 
   static double nilaiUas;
    
    //baut variabel titik-titik range pada model fuzzy nya, agar mudah untuk mengganti nilai ketika ada perubahan
    private static double titik1=0;
    private static double nilaiRendah=50;
    private static double NilaiSedang=75;
    private static double NilaiTinggi=100;
    
    //buat method untuk mengakses nilai pada variabel NilaiUas
    public static double getNilaiuas() {
        return nilaiUas;
    }

    //buat method untuk memberikan nilai pada variabel ketinggian daerah
    public static void setNilaiuas(double nilaiuas) {
         NilaiUas.nilaiUas = nilaiuas;
    }
    
    //method fungsi rendah
    public static double rendah(){
        if (nilaiUas<=nilaiRendah) return 1;
        else if (nilaiUas>nilaiRendah && nilaiUas<NilaiSedang) return (NilaiSedang-nilaiUas)/(NilaiSedang-nilaiRendah);
        else return 0;
    }
    
    //method fungsi sedang
    public static double sedang(){
        if (nilaiUas>nilaiRendah && nilaiUas<NilaiSedang) return (nilaiUas-nilaiRendah)/(NilaiSedang-nilaiRendah);
        else if (nilaiUas>NilaiSedang && nilaiUas<NilaiTinggi) return (NilaiTinggi-nilaiUas)/(NilaiTinggi-NilaiSedang);
        else if (NilaiSedang == nilaiUas) return 1;
        else return 0;
    }
     //method fungsi tinggi
    public static double tinggi(){
        if (nilaiUas>NilaiSedang && nilaiUas<NilaiTinggi) return (nilaiUas-NilaiSedang)/(NilaiTinggi-NilaiSedang);
        else if (nilaiUas>=NilaiTinggi) return 1;
        else return 0;
    }
}
