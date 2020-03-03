package bangundatar;

// Polymafishm
public class Main {
    public static void main(String[] args){

        // PERSEGI
        Persegi persegi = new Persegi();
        persegi.setSisi(10);
        System.out.println("Persegi");
        System.out.println(" ");
        System.out.println("Sisi\t\t: " + persegi.getSisi());
        System.out.println("Luas\t\t: " + persegi.Luas());
        System.out.println("Keliling\t: " + persegi.Keliling());
        System.out.println(" ");
        
        // LINGKARAN
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setR(14);
        System.out.println("Lingkaran");
        System.out.println(" ");
        System.out.println("Jari-jari\t: " + lingkaran.getR());
        System.out.println("Luas\t\t: " + lingkaran.Luas());
        System.out.println("Keliling\t: " + lingkaran.Keliling());
        System.out.println(" ");

        // PERSEGI PANJANG
        PersegiPanjang PP = new PersegiPanjang();
        PP.setLebar(10);
        PP.setPanjang(15);
        System.out.println("Persegi Panjang");
        System.out.println(" ");
        System.out.println("Lebar\t\t: " + PP.getLebar());
        System.out.println("Panjang\t\t: " + PP.getPanjang());
        System.out.println("Luas\t\t: " + PP.Luas());
        System.out.println("Keliling\t: " + PP.Keliling());
        System.out.println(" ");

        // SEGITIGA
        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(6);
        segitiga.setTinggi(4);
        System.out.println("Segitiga");
        System.out.println(" ");
        System.out.println("Alas\t\t: " + segitiga.getAlas());
        System.out.println("Tinggi\t\t: "+ segitiga.getTinggi());
        System.out.println("Luas\t\t: " + segitiga.Luas());
        System.out.println("Keliling\t: " + segitiga.Keliling());
        System.out.println(" ");

        // KUBUS
        Kubus kubus = new Kubus();
        kubus.setSisi(10);
        System.out.println("Kubus");
        System.out.println(" ");
        System.out.println("Sisi\t: " + kubus.getSisi());
        System.out.println("Volume\t: " + kubus.volume());
        System.out.println(" ");

        // SILINDER
        Silinder silinder = new Silinder();
        silinder.setR((float)15);
        silinder.setTinggi(50);
        System.out.println("Silinder");
        System.out.println(" ");
        System.out.println("Tinggi\t\t: " + silinder.getTinggi());
        System.out.println("Jari-jari\t: " + silinder.getR());
        System.out.println("Volume\t\t: " + silinder.volume());
        System.out.println(" ");
        
        // BALOK
        Balok balok = new Balok();
        balok.setPanjang(30);
        balok.setLebar(20);
        balok.setTinggi(25);
        System.out.println("Balok");
        System.out.println(" ");
        System.out.println("Panjang\t: " + balok.getPanjang());
        System.out.println("Lebar\t: " + balok.getLebar());
        System.out.println("Tinggi\t: " + balok.getTinggi());
        System.out.println("Volume\t: " + balok.volume());
    }
}
