import java.time.LocalDate;
import java.util.Scanner;
import java.time.Period;

public class Main {
    public static void main (String[] args){
        String firstname;
        int tahun;
        int bulan;
        String JenisKelamin;
        String tanggalahir;
        Scanner objInput = new Scanner(System.in);

        System.out.print("masukkan nama anda : ");
        firstname = objInput.nextLine();

        System.out.print("masukkan jenis jenis kelamin L/P : ");
        JenisKelamin = objInput.nextLine();

        if (JenisKelamin.equalsIgnoreCase("P")){
            System.out.print("Perempuan");
        } else {
            System.out.print("Laki-Laki");
        }

        System.out.print("masukkan tanggal lahir (YYYY-MM-DD) : ");
        tanggalahir = (objInput.nextLine());

        LocalDate tanggallahirDate = LocalDate.parse(tanggalahir);
        LocalDate tanggalsekarang = LocalDate.now();
        Period tanggallahir = Period.between(tanggallahirDate, tanggalsekarang);
        tahun = tanggallahir.getYears();
        bulan = tanggallahir.getMonths();


        System.out.println("nama : " + firstname);
        System.out.println("jenis kelamin L/P : \n" + JenisKelamin);
        System.out.println("umur : " + tahun + " tahun" + bulan + " bulan");


    }
}