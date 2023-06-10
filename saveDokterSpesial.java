import java.util.ArrayList;

public class saveDokterSpesial {
    String nama;
    public static ArrayList<DokterSpesialis> listDokterSpesialisasi = new ArrayList<DokterSpesialis>();
    public void setDokterSpesial(DokterSpesialis newDokter){
        listDokterSpesialisasi.add(newDokter);
    }

    public int getTotalDokterSpesial(){
        return listDokterSpesialisasi.size();
    }

    public String getDokterIndex(String id){
        return id;
    }

    public String isExist(String kode){
        for(int i = 0; i < listDokterSpesialisasi.size();i++){
            if(kode.equals(listDokterSpesialisasi.get(i).id)){
                return listDokterSpesialisasi.get(i).id;
            }
        }
        return null;
    }

    public void showAllDokterSpesial(){
        for(int i = 0;i<listDokterSpesialisasi.size();i++){
            listDokterSpesialisasi.get(i).showInfo();
            System.out.println("---------------------");
        }
    }
}
