public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir ta = new TransportasiAir(4, 5000);
        ta.informasi();
        ta.berlayar();
        ta.berlabuh();
        System.out.println("");

        Sampan sampan1 = new Sampan(20, 5000, 2);
        sampan1.informasi();
        sampan1.berlayar();
        sampan1.berlabuh();
        sampan1.berlabuh(0);
        System.out.println("");

        Kapal kapal1 = new Kapal(50, 5000, "Diesel");
        kapal1.informasi();
        kapal1.berlayar();
        kapal1.berlayar(0);
        kapal1.berlabuh();
        System.out.println("");
    }
}
