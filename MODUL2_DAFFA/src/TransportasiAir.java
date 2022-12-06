public class TransportasiAir {
    protected int jumlahKursi;
    protected int biaya;

    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    public void informasi(){
        System.out.println("Transportasi air Jenis tidak diketahui dengan kursi berjumlah %d ditetapkan dengan biaya sebesar Rp. 5000");
            
    }

    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui sedang berlayar");
    }

    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis yang tidak diketahui berlabuh di pantai");
    }
    
}