package Association;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        voli voli = new voli ("Voli Persib");
        
        // inisialisasi nama pegawai //
        Pemain e1 = new Pemain ("Agung");
        Pemain e2 = new Pemain ("Agim");
        Pemain e3 = new Pemain ("Rafli");
        Pemain e4 = new Pemain ("Agus");
        
        // tampil //
        System.out.println(e1.getNamePemain() + " adalah Pemain Club " + voli.getVoliName());
        System.out.println(e2.getNamePemain() + " adalah Pemain Club " + voli.getVoliName());
        System.out.println(e3.getNamePemain() + " adalah Pemain Club " + voli.getVoliName());
        System.out.println(e4.getNamePemain() + " adalah Pemain Club " + voli.getVoliName());
    }
    
}
