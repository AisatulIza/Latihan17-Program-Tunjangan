package pkgLatihan17;
import java.util.Scanner;
/**
* author
* Nama      :A`isatul Iza
* Nim       :22166008
* Deskripsi : Program ini adalah program yang menampilkan tunjangan bagi karyawan yang sudah menikah sebesar 35% dari gaji pokok
*/
public class SIRegPagi22166008Latihan17 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    // Variabel
	double gajipokok,tunjangan, totalgaji;
	String status;
	System.out.println("=====Program Tunjangan=====");
	//input gaji pokok 
	System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
	gajipokok = scanner.nextInt();
	//input status
	System.out.print("Status anda ? (Menikah/belum) : ");
	status = scanner.next();
	System.out.println("=====Hasil Perhitungan Gaji Anda=====");
	//output gaji pokok
	System.out.println("Gaji pokok : " + gajipokok);
	//menghitung tunjangan bagi yang sudah menikah 
	if (status.equalsIgnoreCase("Menikah")) {
	    tunjangan = 0.35 * gajipokok;
	} else {
	    tunjangan = 0;
	}
	System.out.println("Tunjangan : " + tunjangan);
	//menghitung total gaji yang di dapat
	totalgaji = (gajipokok + tunjangan);
	//output total gaji
	System.out.println("Total Gaji : " + totalgaji);
  }
}
