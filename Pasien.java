import java.util.Random;

public class Pasien extends Person {
    String alamat;
    String notelp;
    String id;
    String obat;


    Pasien(String name, String alamat, String notelp){
        this.name = name;
        this.alamat = alamat;
        this.notelp = notelp;
        setID();
    }

    Pasien(String name, String alamat){
        this.name = name;
        this.alamat = alamat;
        setID();
    }
    Pasien(String name){
        this.name = name;
        setID();
    }

    public void setID(){
        Random rand = new Random();
        int randomNum = rand.nextInt(900) + 100;
        this.id = "P" + String.valueOf(randomNum);
    }

    public String getName(){
        return this.name;
    }

    public String getId(){
        return this.id;
    }


    public void showInfo(){
        System.out.println("Nama \t \t \t : " + this.name);
        System.out.println("ID \t \t \t \t : " + this.id);
        System.out.println("Nomor telepon \t : " + this.notelp);
        System.out.println("Alamat \t \t \t : " + this.alamat);
    }



    public void getPasienInfo(){
        getName();
        getId();
    }



}
