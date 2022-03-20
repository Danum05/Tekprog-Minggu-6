package composition;


public class Main {
    public static void main(String args[]){
        
        //instansiasi
        Tas tas = new Tas(new Uang(900000),new Laptop("Asus Vivobook"));
        
        System.out.println("Isi tas : " + tas.getMoney().getJumlah()+" Rupiah dan "+tas.getmerk(). getJenisLaptop());
    }
}