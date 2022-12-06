public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah %d ditetapkan dengan biaya sebesar Rp. 5000");
    }
    
    public void berlayar(){
        System.out.println();
    }

    public void berlabuh(){
        System.out.println();
    }

    public void berlabuh(int jangkar){
        System.out.println();
    }

}
