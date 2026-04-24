import java.util.ArrayList;
import java.util.Scanner;

// Superclass
class Produk {
    String merek, nomorSeri;
    double harga;

    Produk(String merek, String nomorSeri, double harga) {
        this.merek = merek;
        this.nomorSeri = nomorSeri;
        this.harga = harga;
    }

    void tampil() {
        System.out.println("Merek: " + merek);
        System.out.println("Nomor Seri: " + nomorSeri);
        System.out.println("Harga: " + harga);
    }
}

// Smartphone
class Smartphone extends Produk {
    String layar, storage;

    Smartphone(String merek, String nomorSeri, double harga, String layar, String storage) {
        super(merek, nomorSeri, harga);
        this.layar = layar;
        this.storage = storage;
    }

    void tampil() {
        super.tampil();
        System.out.println("Layar: " + layar);
        System.out.println("Storage: " + storage);
    }
}

// Laptop
class Laptop extends Produk {
    String ram, prosesor;

    Laptop(String merek, String nomorSeri, double harga, String ram, String prosesor) {
        super(merek, nomorSeri, harga);
        this.ram = ram;
        this.prosesor = prosesor;
    }

    void tampil() {
        super.tampil();
        System.out.println("RAM: " + ram);
        System.out.println("PROSESOR: " + prosesor);
    }
}

// Kamera
class Kamera extends Produk {
    String resolusi;
    String tipeLensa;

    Kamera(String merek, String nomorSeri, double harga, String resolusi, String tipeLensa) {
        super(merek, nomorSeri, harga);
        this.resolusi = resolusi;
        this.tipeLensa = tipeLensa;
    }

    void tampil() {
        super.tampil();
        System.out.println("Resolusi: " + resolusi);
        System.out.println("Tipe Lensa: " + tipeLensa);
    }
}

// Main
public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Produk> daftar = new ArrayList<>();

        int pilih;

        do {
            System.out.println("\n1. Tambah Produk");
            System.out.println("2. Tampilkan Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            if (pilih == 1) {
            

                System.out.print("Merek: ");
                String merek = input.nextLine();

                System.out.print("Nomor Seri: ");
                String seri = input.nextLine();

                System.out.print("Harga: ");
                double harga = input.nextDouble();
                input.nextLine();

                System.out.println("pilih tipe produk:");
                System.out.println("1. Smartphone 2. Laptop 3. Kamera");
                int jenis = input.nextInt();
                input.nextLine();

                if (jenis == 1) {
                    System.out.print("Layar: ");
                    String layar = input.nextLine();
                    System.out.print("Storage: ");
                    String storage = input.nextLine();
                    daftar.add(new Smartphone(merek, seri, harga, layar, storage));

                } else if (jenis == 2) {
                    System.out.print("RAM: ");
                    String ram = input.nextLine();
                    System.out.print("Prosesor: ");
                    String prosesor = input.nextLine();
                    daftar.add(new Laptop(merek, seri, harga, ram,prosesor));

                } else if (jenis == 3) {
                    System.out.print("Resolusi: ");
                    String resolusi = input.nextLine();
                    System.out.print("Tipe Lensa: ");
                    String tipeLensa = input.nextLine();
                    daftar.add(new Kamera(merek, seri, harga, resolusi,tipeLensa));
                }

                System.out.println("Produk berhasil ditambahkan!");

            } else if (pilih == 2) {
                for (Produk p : daftar) {
                    p.tampil();
                    System.out.println("----------------");
                }

            } else if (pilih == 3) {
                System.out.print("Masukkan Nomor Seri: ");
                String cari = input.nextLine();
                boolean ditemukan = false;

                for (Produk p : daftar) {
                    if (p.nomorSeri.equals(cari)) {
                        p.tampil();
                        System.out.println("Pembelian berhasil!");
                        ditemukan = true;
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Produk tidak ditemukan!");
                }
            }

        } while (pilih != 4);

        System.out.println("Keluar dari sistem...");
    }
}