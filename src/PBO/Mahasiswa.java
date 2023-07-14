package PBO;

public class Mahasiswa {

    String nama;
    int nilai;

    void nilai(){
        System.out.println(nama + "Nilai Mahasiswa");
        System.out.println("nilai: "+ nilai);
    }

    boolean hasil(){
        if(nilai <=50) return true;
        return false;
    }
}
