import java.util.ArrayList;

public class Medication {
    String pasien;
    String obat;
    String dokter;


    public Medication(String pasien, String obat, String dokter){
        this.pasien = pasien;
        this.obat = obat;
        this.dokter = dokter;
    }

    public String getObat(){
        return this.obat;
    }

    public void showInfo(){
        System.out.println("Kode Pasien \t \t \t : " + this.pasien);
        System.out.println("Nama Obat \t \t \t \t : " + this.obat);
        System.out.println("Kode Dokter \t \t : " + this.dokter);
    }
}
