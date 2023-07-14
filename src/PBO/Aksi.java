package PBO;

public class Aksi {
    public static void main(String[] args) {

        Mahasiswa siswa1 = new Mahasiswa();

        siswa1.nama = "Penny ";
        siswa1.nilai = 90;

        siswa1.nilai();

        if(siswa1.hasil()){
            System.out.println("Belajar Lebih Giat....");
        }
    }
}
