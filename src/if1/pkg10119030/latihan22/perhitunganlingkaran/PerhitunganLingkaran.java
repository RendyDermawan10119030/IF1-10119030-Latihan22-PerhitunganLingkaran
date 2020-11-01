package if1.pkg10119030.latihan22.perhitunganlingkaran;
import java.util.Scanner;
import java.lang.Math;
/**
* Nama              :Rendy Dermawan
* NIM               :10119030
* Kelas             :IF1
* Deskripsi Program :
 */
public class PerhitunganLingkaran {
    static Scanner scan = new Scanner(System.in);
    static final double pi = Math.PI;
    double diameter;
    private void validasi(String diameter){
        if(!diameter.matches("^[0-9]*$")){
            System.out.println("====Perhitungan Lingkaran====");
            masukkanDiameterLingkaran();
        }else{
    this.diameter = Double.parseDouble(diameter);
        }
    }
    private void masukkanDiameterLingkaran() {
        System.out.println("====Perhitungan Lingkaran====");
        System.out.println("Masukkan nilai diameter lingkaran");
        validasi(scan.next());
    }
    private double hitungLuasLingkaran(){
        return pi* Math.pow(diameter, 2);
    }
    private double hitungJariJariLingkaran(double luas){
        return Math.sqrt(luas / pi);
    }
    private double kelilingLingkaran(double jariJari){
        return 2 * pi * jariJari;
    }
    private static void tampilHasil(double luas, double jariJari, double keliling){
            System.out.println("\n====Perhitungan Lingkaran====");
            System.out.println("Jari-jari Lingkaran = " + jariJari + " cm");
            System.out.println("Luas Lingkaran = "+ luas + "cm");
            System.out.println("Keliling Lingkaran = " + keliling + " cm");
    }
    public static void main(String[] args){
        PerhitunganLingkaran data = new PerhitunganLingkaran();
        data.masukkanDiameterLingkaran();
        double luas = data.hitungLuasLingkaran();
        double jariJari = data.hitungJariJariLingkaran(luas);
        double keliling = data.kelilingLingkaran(jariJari);
        tampilHasil(luas,jariJari,keliling);
        System.out.println("(Developed by : Rendy Dermawan)"); 
    }
}
