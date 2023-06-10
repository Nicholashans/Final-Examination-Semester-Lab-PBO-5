// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Menu {
    String nama;
    public static Scanner input = new Scanner(System.in);
    public static Scanner inputAngka = new Scanner(System.in);
    public static Scanner inputKode = new Scanner(System.in);
    public static savePasien save = new savePasien();
    public static saveDokter saveD = new saveDokter();

    public static saveDokterSpesial saveDS = new saveDokterSpesial();

    public static saveAppointment saveApp = new saveAppointment();
    public static void main(String[] args) {
        showMenu();

    }

    public static void showMenu(){
        System.out.println("=============================");
        System.out.println("IKLC HOSPITAL MANAGEMENT MENU");
        System.out.println("=============================");
        System.out.println("WELCOME TO OUR MANAGEMENT SYSTEM");
        System.out.println("1. Pasien");
        System.out.println("2. Dokter");
        System.out.println("3. Dokter Spesialis");
        System.out.println("4. Appointment"); //masukin kodepasien, cek apakah ada ga, masukin kodedokter, cek apakah ada atau ga,
        System.out.println("5. Exit");
        System.out.print("Masukkan Pilihan = ");
        var inputUser = inputAngka.nextInt();

        if (inputUser == 1){
            showMenuPasien();
        } else if (inputUser == 2) {
            showMenuDokter();
        } else if(inputUser == 3){
            showMenuDokterSpesialis();
        }
        else if (inputUser == 4) {
            showMenuAppointment();
        } else {
            System.out.println("Thank You");
        }

    }

    //dokter
    public static void showMenuDokter(){
        System.out.println("===========");
        System.out.println("DOKTER PAGE");
        System.out.println("===========");
        System.out.println("1. Registration");
        System.out.println("2. Show Semua Dokter");
        System.out.println("3. Resep");
        System.out.println("4. Back to the Main Menu");
        System.out.print("Masukkan Pilihan :");
        var inputUser = inputAngka.nextInt();

        if (inputUser == 1){
            registrationDokter();
        }

        else if (inputUser == 2){
            showAllDokterHere();
        } else if (inputUser == 3){
            showMenuResep();
        } else if (inputUser == 4) {
            showMenu();
        }
    }


    public static void registrationDokter(){
        System.out.println("===================");
        System.out.println("DOCTOR REGISTRATION");
        System.out.println("===================");
        System.out.print("Masukkan Nama yang Mau di Register  : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Bidang Spesialisasi        : ");
        String spesialisasi = input.nextLine();
        Dokter dokter1 = new Dokter(nama,spesialisasi);

        saveD.setDokter(dokter1);
        System.out.println("DOKTER BARU TELAH DIBUAT!!!!");
        dokter1.showInfo();
        System.out.println("\n");
        showMenuDokter();
    }


    public static void checkIdDokter(){
        System.out.println("Masukkan Kode Yang Ingin Dicek");
        String kode = inputKode.nextLine();

        Pasien cekPasien = save.isExist(kode);

        if(cekPasien != null){
            System.out.println("DOKTER DITEMUKAN");
            System.out.println("================");
            showMenuDokter();

        }
        else{
            System.out.println("TIDAK ADA DATA, SILAKAN REGISTRASI DULU");
            showMenuDokter();
        }
    }
    public static void hapusDokter(){

    }

    public static void showAllDokterHere(){
        System.out.println("Dokter");
        for(int i = 0; i < saveDokter.listDokter.size() ;i++){
            String tes = saveDokter.listDokter.get(i).id;
            String tes2 = saveDokter.listDokter.get(i).name;
            String tes3 = saveDokter.listDokter.get(i).bidang;
            var no = i+1;

            if(tes!=null){
                if(tes!=null){
                    System.out.println(no + ". \t Kode : "+ tes );
                    System.out.println("\t Nama : "+tes2);
                    System.out.println("\t Bidang : " + tes3);
                }
            }
        }

        showMenuDokter();
    }


    //dokterspesialis

    public static void showMenuDokterSpesialis(){
        System.out.println("=====================");
        System.out.println("DOKTER SPESIALIS PAGE");
        System.out.println("=====================");
        System.out.println("1. Registration");
        System.out.println("2. Show Semua Dokter Spesialis");
        System.out.println("3. Resep");
        System.out.println("4. Back to the Main Menu");
        System.out.print("Masukkan Pilihan :");
        var inputUser = inputAngka.nextInt();

        if (inputUser == 1){
            registrationDokterSpesialis();
        }

        else if (inputUser == 2){
            showAllDokterSpesialisHere();
        } else if (inputUser == 3){
            showMenuResep();
        } else if (inputUser == 4) {
            showMenu();
        }
    }
    public static void registrationDokterSpesialis(){
        System.out.println("=========================");
        System.out.println("DOCTOR REGISTRATION PAGE");
        System.out.println("=========================");
        System.out.print("Masukkan Nama yang Mau di Register  : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Bidang Spesialisasi        : ");
        String spesialisasi = input.nextLine();
        System.out.print("Masukkan Sub Spesialisasi           :");
        String subspesial = input.nextLine();
        DokterSpesialis dokter1 = new DokterSpesialis(nama,spesialisasi,subspesial);

        saveDS.setDokterSpesial(dokter1);
        System.out.println("DOKTER BARU TELAH DIBUAT!!!!");
        dokter1.showInfo();
        showMenuDokterSpesialis();
    }

    public static void showAllDokterSpesialisHere(){
        System.out.println("=====================");
        System.out.println("List Dokter Spesialis");
        System.out.println("=====================");
        for(int i = 0; i < saveDokterSpesial.listDokterSpesialisasi.size() ;i++){
            String tes = saveDokterSpesial.listDokterSpesialisasi.get(i).id;
            String tes2 = saveDokterSpesial.listDokterSpesialisasi.get(i).name;
            String tes3 = saveDokterSpesial.listDokterSpesialisasi.get(i).bidang;
            String tes4 = saveDokterSpesial.listDokterSpesialisasi.get(i).subBidang;
            var no = i+1;

            if(tes!=null){
                System.out.println(no + ". \t Kode : "+ tes );
                System.out.println("\t Nama : "+tes2);
                System.out.println("\t Bidang : " + tes3);
                System.out.println("\t Sub Bidang : " + tes4);
            }
        }

        showMenuDokter();
    }



    //pasien
    public static void showMenuPasien(){
        System.out.println("===========");
        System.out.println("PASIEN PAGE");
        System.out.println("===========");
        System.out.println("1. Registration");
        System.out.println("2. Show Semua Pasien");
        System.out.println("3. Check ID Pasien");
        System.out.println("4. Back to Main Menu");
        System.out.print("Masukkan Pilihan :");
        var inputUser = inputAngka.nextInt();

        if (inputUser == 1){
            registration();
        }

        else if (inputUser == 2){
            showAllPasienHere();
        } else if (inputUser == 3) {
            checkId();
        } else if (inputUser == 4) {
            showMenu();
        }
    }

    public static void registration(){
        System.out.println("=========================");
        System.out.println("PATIENT REGISTRATION PAGE");
        System.out.println("=========================");
        System.out.print("Masukkan Nama yang Mau di Register : ");
        String nama = input.nextLine();
        System.out.print("Masukkan Alamat : ");
        String alamat = input.nextLine();
        System.out.print("Masukkan Nomor Telepon : ");
        String notelp = input.nextLine();
        Pasien pasien1 = new Pasien(nama,alamat,notelp);

        save.setPasien(pasien1);
        System.out.println("PASIEN BARU TELAH DIBUAT!!!!");
        pasien1.showInfo();
        showMenuPasien();
    }


    public static void checkId(){
        System.out.println("================");
        System.out.println("PATIENT ID CHECK");
        System.out.println("================");
        System.out.print("Masukkan Kode Pasien Yang Ingin Dicek =");
        String kode = inputKode.nextLine();
//        System.out.println(kode);

        Pasien cekPasien = save.isExist(kode);
//        System.out.println(cekPasien);
//        save.showAllPasien();

        if(cekPasien != null){
            System.out.println("PASIEN DITEMUKAN!!");
            System.out.println("==================");
            showMenuPasien();

        }
        else{
            System.out.println("TIDAK ADA DATA, SILAKAN REGISTRASI DULU");
            showMenuPasien();
        }
    }


    public static void showAllPasienHere(){
        System.out.println("Pasien");
        for(int i = 0; i < savePasien.listPasien.size() ;i++){
            String tes = savePasien.listPasien.get(i).id;
            String tes2 = savePasien.listPasien.get(i).name;
            var no = i+1;

            if(tes!=null){
                System.out.println(no + ". "+ " Kode : "+ tes + ", Nama : " + tes2);
            }
        }

        showMenuPasien();
    }



    //appointment
    public static void showMenuAppointment(){
        System.out.println("APPOINTMENT PAGE");
        System.out.println("================");
        System.out.println("1. Registration");
        System.out.println("2. Show Semua Appointment");
        System.out.println("3. Check ID Appointment");
        System.out.print("Masukkan Pilihan :");
        var inputUser = inputAngka.nextInt();

        if (inputUser == 1){
            registrationApp();
        }

        else if (inputUser == 2){
            saveApp.showAllAppointment();
            showMenuAppointment();
        } else if (inputUser == 3) {

        }
    }

    public static void registrationApp(){
        System.out.println("====================");
        System.out.println("REGISTER APPOINTMENT");
        System.out.println("====================");
        System.out.print("Masukkan Kode Pasien : ");
        String kodePasien = input.nextLine();
        save.isExist(kodePasien);

        if (save.isExist(kodePasien) != null){
            System.out.println("PASIEN BERHASIL DITEMUKAN");
        } else {
            System.out.println("TIDAK ADA DATA, SILAKAN REGISTRASI DULU");
            showMenuPasien();
        }

        System.out.print("Masukkan Kode Dokter : ");
        String kodeDokter = input.nextLine();
        saveD.isExist(kodeDokter);

        if (saveD.isExist(kodeDokter) != null){
            System.out.println("DOKTER BERHASIL DITEMUKAN");
        } else {
            System.out.println("TIDAK ADA DATA, SILAKAN REGISTRASI DULU");
            showMenuDokter();
        }

        System.out.print("Masukkan Tanggal Pertemuan: ");
        String tanggal = input.nextLine();

        Appointment app1 = new Appointment(kodePasien,kodeDokter,tanggal);

        System.out.println("APPOINTMENT BERHASIL DIBUAT!");
//        System.out.println("Dokter \t \t = " + app1.kodeDokter);
//        System.out.println("Pasien \t \t = " + app1.kodePasien);
//        System.out.println("Tanggal Pertemuan \t =" + app1.date);

        saveApp.setAppoinment(app1);
        app1.showInfo();

        showMenuAppointment();



    }

    public static void showMenuResep(){
        System.out.println("Resep");
        System.out.println("=====");
        System.out.println("1. Tambah Resep");
        System.out.println("2. Tampilkan Resep");
        System.out.println("3. Back to Main Menu");
        System.out.print("Masukkan Pilihan :");
        var inputUser = inputAngka.nextInt();

        if (inputUser == 1){
            tambahResep();
        } else if(inputUser == 2){
            save.showinfoObat();
            showMenuResep();
        } else if (inputUser == 3) {
            showMenu();
        }
    }

    public static void tambahResep(){
        System.out.print("Masukkan Kode Pasien :");
        var kodePasien = input.nextLine();

        save.isExist(kodePasien);

        if (save.isExist(kodePasien) != null){
            System.out.println("PASIEN BERHASIL DITEMUKAN");
        } else {
            System.out.println("TIDAK ADA DATA, SILAKAN REGISTRASI DULU");
            showMenuPasien();
        }

        System.out.print("Masukkan Kode Dokter :");
        var kodeDokter = input.nextLine();

        saveD.isExist(kodeDokter);
        saveDS.isExist(kodeDokter);

        if (saveD.isExist(kodeDokter) != null || saveDS.isExist(kodeDokter) != null){
            System.out.println("DOKTER BERHASIL DITEMUKAN");
        } else {
            System.out.println("TIDAK ADA DATA, SILAKAN REGISTRASI DULU");
            showMenuDokter();
        }

        System.out.print("Masukkan Nama Obat :");
        var namaObat = input.nextLine();



        Medication med1 = new Medication(kodePasien,namaObat,kodeDokter);
        save.setListObat(med1);
        med1.showInfo();

        showMenu();

    }



}