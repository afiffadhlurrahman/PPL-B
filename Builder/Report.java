import java.util.ArrayList;
import java.util.List;

public class Report{

    private List<String> konten = new ArrayList<String>();
    private String bulan;
    private String tahun;

    public void addKonten(String konten_tambah) {
        konten.add(konten_tambah);
    }

    public void daftarIsi() {
        for (String isiKonten : konten) {
            System.out.println(isiKonten);
        }
        System.out.print("\n");
    }
}