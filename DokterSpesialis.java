public class DokterSpesialis extends Dokter{
    String subBidang;
    DokterSpesialis(String name, String bidang, String subBidang){
        super(name, bidang);
        this.subBidang = subBidang;
        setID();
    }

    public void showInfo(){
        System.out.println("Nama \t \t \t : " + this.name);
        System.out.println("ID \t \t \t \t : " + this.id);
        System.out.println("Spesialisasi \t : " + this.bidang);
        System.out.println("Sub Bidang \t \t : " + this.subBidang);

    }
}
