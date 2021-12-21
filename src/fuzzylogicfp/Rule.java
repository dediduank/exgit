/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fuzzylogicfp;
import Variabel.*;
/**
 *
 * @author Dedi Wardani
 */
public class Rule {
    private static double [] u_Produksi = new double[18];
    private static double [] z_Produksi = new double[18];
    private static double bobot;
    
    //rule fuzzy fikasi
    public static void hitung_u(){
        u_Produksi[0]=Math.min(Math.min(NilaiTugas.tinggi(), NilaiUas.tinggi()), Presensi.tidakcukup());
        u_Produksi[1]=Math.min(Math.min(NilaiTugas.tinggi(), NilaiUas.sedang()), Presensi.tidakcukup());
        u_Produksi[2]=Math.min(Math.min(NilaiTugas.tinggi(), NilaiUas.rendah()), Presensi.tidakcukup());
        u_Produksi[3]=Math.min(Math.min(NilaiTugas.tinggi(), NilaiUas.tinggi()), Presensi.cukup());
        u_Produksi[4]=Math.min(Math.min(NilaiTugas.tinggi(), NilaiUas.sedang()), Presensi.cukup());
        u_Produksi[5]=Math.min(Math.min(NilaiTugas.tinggi(), NilaiUas.rendah()), Presensi.cukup());
        u_Produksi[6]=Math.min(Math.min(NilaiTugas.sedang(), NilaiUas.tinggi()), Presensi.tidakcukup()); 
        u_Produksi[7]=Math.min(Math.min(NilaiTugas.sedang(), NilaiUas.sedang()), Presensi.tidakcukup());
        u_Produksi[8]=Math.min(Math.min(NilaiTugas.sedang(), NilaiUas.rendah()), Presensi.tidakcukup());
        u_Produksi[9]=Math.min(Math.min(NilaiTugas.sedang(), NilaiUas.tinggi()), Presensi.cukup());
        u_Produksi[10]=Math.min(Math.min(NilaiTugas.sedang(), NilaiUas.sedang()), Presensi.cukup());
        u_Produksi[11]=Math.min(Math.min(NilaiTugas.sedang(), NilaiUas.rendah()), Presensi.cukup());
        u_Produksi[12]=Math.min(Math.min(NilaiTugas.rendah(), NilaiUas.tinggi()), Presensi.tidakcukup());
        u_Produksi[13]=Math.min(Math.min(NilaiTugas.rendah(), NilaiUas.sedang()), Presensi.tidakcukup());
        u_Produksi[14]=Math.min(Math.min(NilaiTugas.rendah(), NilaiUas.rendah()), Presensi.tidakcukup());
        u_Produksi[15]=Math.min(Math.min(NilaiTugas.rendah(), NilaiUas.tinggi()), Presensi.cukup());
        u_Produksi[16]=Math.min(Math.min(NilaiTugas.rendah(), NilaiUas.sedang()), Presensi.cukup());
        u_Produksi[17]=Math.min(Math.min(NilaiTugas.rendah(), NilaiUas.rendah()), Presensi.cukup());
    }
    
    public static void hitung_z(){
        z_Produksi[0]=NilaiAkhir.tidaklulus(u_Produksi[0]);
        z_Produksi[1]=NilaiAkhir.tidaklulus(u_Produksi[1]);
        z_Produksi[2]=NilaiAkhir.tidaklulus(u_Produksi[2]);
        z_Produksi[3]=NilaiAkhir.lulus(u_Produksi[3]);
        z_Produksi[4]=NilaiAkhir.lulus(u_Produksi[4]);
        z_Produksi[5]=NilaiAkhir.tidaklulus(u_Produksi[5]);
        z_Produksi[6]=NilaiAkhir.tidaklulus(u_Produksi[6]);
        z_Produksi[7]=NilaiAkhir.tidaklulus(u_Produksi[7]);
        z_Produksi[8]=NilaiAkhir.tidaklulus(u_Produksi[8]);
        z_Produksi[9]=NilaiAkhir.lulus(u_Produksi[9]);
        z_Produksi[10]=NilaiAkhir.lulus(u_Produksi[10]);
        z_Produksi[11]=NilaiAkhir.tidaklulus(u_Produksi[11]);
        z_Produksi[12]=NilaiAkhir.tidaklulus(u_Produksi[12]);
        z_Produksi[13]=NilaiAkhir.tidaklulus(u_Produksi[13]);
        z_Produksi[14]=NilaiAkhir.tidaklulus(u_Produksi[14]);
        z_Produksi[15]=NilaiAkhir.lulus(u_Produksi[15]);
        z_Produksi[16]=NilaiAkhir.lulus(u_Produksi[16]);
        z_Produksi[17]=NilaiAkhir.tidaklulus(u_Produksi[17]);
    }
    //eend of rule
    
    //cari nilai bobot (tsukamoto)
    public static double bobot(){
        double atas=0,bawah=0;
        for(int i=0;i<18;i++){
            System.out.println("z_ke-"+i+ " : " +z_Produksi[i]);
            System.out.println("u_ke-"+i+ " : " +u_Produksi[i]);
            atas+=(u_Produksi[i]*z_Produksi[i]);
            bawah+=u_Produksi[i];
        }
        System.out.println("\n"+atas/bawah);
        
        System.out.println("\nAtas "+atas + " Bawah " + bawah);
        return (atas/bawah);
    }
}
