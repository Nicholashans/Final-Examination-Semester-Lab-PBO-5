import java.util.ArrayList;
public class saveDokter {
    String nama;
    public static ArrayList<Dokter> listDokter = new ArrayList<Dokter>();
    public void setDokter(Dokter newDokter){
        listDokter.add(newDokter);
    }

    public int getTotalDokter(){
        return listDokter.size();
    }

    public String getDokterIndex(String id){
        return id;
    }

    public String isExist(String kode){
        for(int i = 0; i < listDokter.size();i++){
            if(kode.equals(listDokter.get(i).id)){
                return listDokter.get(i).id;
            }
        }
        return null;
    }

    public void showAllDokter(){
        for(int i = 0;i<listDokter.size();i++){
            listDokter.get(i).showInfo();
            System.out.println("---------------------");
        }
    }
}
