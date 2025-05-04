// Method Overloading
public class Pesan {
    void tampil() {
        System.out.println("Halo!");
    }

    void tampil(String nama) {
        System.out.println("Halo, " + nama + "!");
    }

    public static void main(String[] args) {
        Pesan p = new Pesan();
        p.tampil();
        p.tampil("Afdal");
    }
}
