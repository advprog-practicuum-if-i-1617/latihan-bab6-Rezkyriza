
public class KaryawanBiasa {

    protected int masakerja;
    protected int gajipokok = 2500000;
    protected int bonusmk = 250000;

    public KaryawanBiasa(int masaKerja) {
        this.masakerja = masaKerja;
    }

    public int getMasakerja() {
        return masakerja;
    }

    public double Gaji() {
        if (masakerja >= 5) {
            return gajipokok + bonusmk;
        } else {
            return gajipokok;
        }
    }
}
