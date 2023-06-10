import java.util.ArrayList;
public class savePasien {
    String nama;
    public static ArrayList<Pasien> listPasien = new ArrayList<Pasien>();
    public static ArrayList<Medication> listObat = new ArrayList<Medication>();
    public void setPasien(Pasien newPasien){
        listPasien.add(newPasien);
    }

    public void setListObat(Medication newMedication){
        listObat.add(newMedication);
    }

    public int getTotalPasien(){
        return listPasien.size();
    }

    public String getPasienIndex(String id){
        return id;
    }

    public Pasien isExist(String kode1){
        for(int i = 0; i < listPasien.size();i++){
            if(kode1.equals(listPasien.get(i).id)){
                return listPasien.get(i);
            }
        }
        return null;
    }

    public void showAllPasien(){
        for(int i = 0;i<listPasien.size();i++){
            listPasien.get(i).showInfo();
            System.out.println("---------------------");
        }
    }

    public void showinfoObat(){
        for(int i = 0;i<listObat.size();i++){
            listObat.get(i).showInfo();
            System.out.println("---------------------");
        }
    }
}
