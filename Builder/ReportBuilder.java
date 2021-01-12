public class ReportBuilder {

    public Report buatLaporanKaryawan() {

        Report laporan = new Report();

        laporan.addKonten("data karyawan");
        laporan.addKonten("data gaji");
        laporan.addKonten("data kinerja");

        System.out.println("Laporan karyawan berhasil dibuat");

        return laporan;
    };
    
    public Report buatLaporanKeuangan() {

        Report laporan = new Report();

        laporan.addKonten("data pemasukan");
        laporan.addKonten("data pengeluaran");

        System.out.println("Laporan keuangan berhasil dibuat");

        return laporan;
    }
}