import java.util.ArrayList;
import java.util.Random;

public class Appointment {

    String kodePasien;
    String kodeDokter;
    String date;

    String kodeAppointment;

    String biaya;



    public Appointment (String kodePasien, String kodeDokter, String Date){
        this.kodePasien = kodePasien;
        this.kodeDokter = kodeDokter;
        this.date = Date;
        setID();
    }

    public void showInfo(){
        System.out.println("Kode Pasien \t \t   : " + this.kodePasien);
        System.out.println("Kode Dokter \t \t   : " + this.kodeDokter);
        System.out.println("Tanggal \t \t \t   : " + this.date);
    }

    public void setID(){
        Random rand = new Random();
        int randomNum = rand.nextInt(900) + 100;
        this.kodeAppointment = "A" + String.valueOf(randomNum);
    }

}
