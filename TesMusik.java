class AlatMusik {
    void mainkan() {
        System.out.println("Memainkan alat musik.");
    }
}

public class TesMusik {
    public static void main(String[] args) {
        AlatMusik a1 = new Gitar();
        AlatMusik a2 = new Drum();

        a1.mainkan();
        a2.mainkan();
    }
}
