
public class SoftwareEngineer extends KaryawanBiasa {

    private int bonuspb = 300000, tunjangan = 5500000;

    SoftwareEngineer(int masaKerja) {
        super(masaKerja);
    }

    @Override
    public double Gaji() {
        if (masakerja >= 5) {
            return gajipokok + bonusmk + bonuspb + tunjangan;

        } else {
            return gajipokok + bonuspb + tunjangan;
        }

    }
}
