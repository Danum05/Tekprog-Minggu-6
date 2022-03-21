package Aggregation;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mahasiswa = new Mahasiswa("102918763", "Fadhil");
        Jurusan jurusan = new Jurusan ("pendidikan Kedokteran");
        
        jurusan.setMahasiswa(mahasiswa);
        
        // tampil //
        System.out.println ("NIM      : " + jurusan.getMahasiswa().getNim());
        System.out.println ("Nama Mahasiswa    : " + jurusan.getMahasiswa().getNama());
        System.out.println ("Jurusan        : " + jurusan.getNamaJurusan());
        System.out.println (jurusan.getMahasiswa().getNama() + " adalah mahasiswa "+ jurusan.getNamaJurusan() + " dengan NIM : " + jurusan.getMahasiswa().getNim());
    }
    
}
