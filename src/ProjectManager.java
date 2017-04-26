
public class ProjectManager extends KaryawanBiasa {

    private int bonuspb = 450000, tunjangan = 6000000;

    ProjectManager(int masaKerja) {
        super(masaKerja);
    }

    @Override
    public double Gaji() {
        if (masakerja >= 10) {
            return gajipokok + bonusmk + bonuspb + tunjangan + 700000;
        } else if (masakerja > 5 && masakerja < 10) {
            return gajipokok + bonusmk + bonuspb + tunjangan + 225000;
        } else {
            return gajipokok + bonuspb + tunjangan;
        }
    }
}
