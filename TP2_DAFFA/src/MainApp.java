public class MainApp {
    public static void main(String[] args) throws Exception{
        Perangkat perangkat1 = new Perangkat("A", 2, 1.8f);
        perangkat1.informasi();
        System.out.println("");
    
        Laptop laptop1 = new Laptop("Seagate", 8, 2.40f, true);
        laptop1.informasi();
        laptop1.bukaGame("Valorant");
        laptop1.kirimEmail("daffaabdillahsyah1@gmail.com");
        laptop1.kirimEmail("daffaganteng2@gmail.com", "daffaganteng3@gmail.com");
        System.out.println("");

        Handphone handphone1 = new Handphone("Sandisk", 3, 2.20f, false);
        handphone1.informasi();
        handphone1.telfon(628122122);
        handphone1.kirimSMS(62852112);
        handphone1.kirimSMS(628121212, 628929221);
    }
}
