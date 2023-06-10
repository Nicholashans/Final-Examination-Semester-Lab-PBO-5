import java.util.ArrayList;

public class saveAppointment {
    String nama;
    public static ArrayList<Appointment> listAppointment = new ArrayList<Appointment>();
    public void setAppoinment(Appointment newAppointment){
        listAppointment.add(newAppointment);
    }

    public int getTotalAppointment(){
        return listAppointment.size();
    }

    public String getAppoinmentIndex(String id){
        return id;
    }

    public Appointment isExist(String kode1){
        for(int i = 0; i < listAppointment.size();i++){
            if(kode1.equals(listAppointment.get(i).kodeAppointment)){
                return listAppointment.get(i);
            }
        }
        return null;
    }

    public void showAllAppointment(){
        for(int i = 0;i<listAppointment.size();i++){
            System.out.println("---------------------");
            listAppointment.get(i).showInfo();
            System.out.println("---------------------");
        }
    }
}
