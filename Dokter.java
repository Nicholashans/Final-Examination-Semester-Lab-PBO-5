import java.util.Random;
public class Dokter extends Person {

    String id;
    String bidang;


    Dokter(String name, String bidang){
        this.name = name;
        this.bidang = bidang;
        setID();
    }

    public void setID(){
        Random rand = new Random();
        int randomNum = rand.nextInt(900) + 100;
        this.id = "D" + String.valueOf(randomNum);
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
        System.out.println("Spesialisasi \t : " + this.bidang);

    }


    public void getDokterInfo(){
        getName();
        getId();
    }
}
