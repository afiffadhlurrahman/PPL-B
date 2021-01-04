/*
    laporan terdiri dari

*/

public class Main {

    public static void main(String[] args) {
        

        ReportBuilder reportBuilder = new ReportBuilder();

        Report laporanKaryawan = reportBuilder.buatLaporanKaryawan();

        laporanKaryawan.daftarIsi();

        Report laporanKeuangan = reportBuilder.buatLaporanKeuangan();

        laporanKeuangan.daftarIsi();

    }

}