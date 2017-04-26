
import java.util.Scanner;

public class MainPerusahaan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        KaryawanBiasa kb = new KaryawanBiasa(4);
        SoftwareEngineer se = new SoftwareEngineer(7);
        ProjectManager pm = new ProjectManager(12);
        System.out.println("Gaji Karyawan : " + kb.Gaji());
        System.out.println("Gaji Software Engineer : " + se.Gaji());
        System.out.println("Gaji Project Manager : " + pm.Gaji());
    }

}
