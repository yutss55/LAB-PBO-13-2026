
class Habitat {
    String namaHabitat;
    String jenisLingkungan;

    Habitat(String namaHabitat, String jenisLingkungan) {
        this.namaHabitat = namaHabitat;
        this.jenisLingkungan = jenisLingkungan;
    }

    void tampilHabitat() {
        System.out.println("Habitat: " + namaHabitat + " (" + jenisLingkungan + ")");
    }
}


class Hewan {
    String nama;
    int energi;
    String makanan;
    Habitat habitat;

    Hewan() {
        nama = "Hewan Liar";
        energi = 50;
        habitat = new Habitat("Hutan", "Darat");
    }

    Hewan(String nama, int energi, Habitat habitat) {
        this.nama = nama;
        this.energi = energi;
        this.habitat = habitat;
    }

    void berburu(Hewan target) {
        System.out.println(nama + " berburu " + target.nama);
        target.energi -= 10;

        if (target.energi < 0) {
            target.energi = 0;
        }

        System.out.println("Energi " + target.nama + " sekarang: " + target.energi);
    }

    void istirahat() {
        energi += 5;
        System.out.println(nama + " sedang istirahat.");
        System.out.println("Energi sekarang: " + energi);
    }

    void infoHewan() {
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Energi     : " + energi);
        System.out.println("Makanan    : " + makanan);
        habitat.tampilHabitat();
        System.out.println("----------------------");
    }
}


public class ekosistemAlam {
    public static void main(String[] args) {

        // Membuat objek habitat
        Habitat hutan = new Habitat("Hutan", "Darat");
        Habitat laut = new Habitat("Laut", "Air");

        Hewan harimau = new Hewan("Harimau", 80, hutan);
        Hewan rusa = new Hewan("Rusa", 60, hutan);
        Hewan ikan = new Hewan("Ikan", 40, laut);
        Hewan burung = new Hewan(); 

        harimau.makanan = "Daging";
        rusa.makanan = "Daun-daunan";
        ikan.makanan = "Plankton";
        burung.makanan = "Serangga";    

        System.out.println("=== DATA HEWAN ===");
        harimau.infoHewan();
        rusa.infoHewan();
        ikan.infoHewan();
        burung.infoHewan();

        System.out.println("=== PROSES BERBURU ===");
        harimau.berburu(rusa);

        System.out.println("\n=== ISTIRAHAT ===");
        rusa.istirahat();
        ikan.istirahat();

        System.out.println("\n=== DATA SETELAH AKSI ===");
        harimau.infoHewan();
        rusa.infoHewan();
        ikan.infoHewan();
    }
}