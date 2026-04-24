
import java.util.Scanner;

// Superclass
class Bangun {
    void garis() {
        System.out.println("=====================================");
    }
}

// ===== BANGUN RUANG =====
class BangunRuang extends Bangun {
    double volume() { return 0; }
}

class Kubus extends BangunRuang {
    double s;
    Kubus(double s) { this.s = s; }
    double volume() { return s * s * s; }
}

class Balok extends BangunRuang {
    double p, l, t;
    Balok(double p, double l, double t) {
        this.p = p; this.l = l; this.t = t;
    }
    double volume() { return p * l * t; }
}

class Bola extends BangunRuang {
    double r;
    Bola(double r) { this.r = r; }
    double volume() { return (4.0/3.0) * Math.PI * r * r * r; }
}

class Tabung extends BangunRuang {
    double r, t;
    Tabung(double r, double t) {
        this.r = r; this.t = t;
    }
    double volume() { return Math.PI * r * r * t; }
}

// ===== BANGUN DATAR =====
class BangunDatar extends Bangun {
    double luas() { return 0; }
    double keliling() { return 0; }
}

class Persegi extends BangunDatar {
    double s;
    Persegi(double s) { this.s = s; }
    double luas() { return s * s; }
    double keliling() { return 4 * s; }
}

class PersegiPanjang extends BangunDatar {
    double p, l;
    PersegiPanjang(double p, double l) {
        this.p = p; this.l = l;
    }
    double luas() { return p * l; }
    double keliling() { return 2 * (p + l); }
}

class Lingkaran extends BangunDatar {
    double r;
    Lingkaran(double r) { this.r = r; }
    double luas() { return Math.PI * r * r; }
    double keliling() { return 2 * Math.PI * r; }
}

class Trapesium extends BangunDatar {
    double a, b, c, d, t;

    Trapesium(double a, double b, double c, double d, double t) {
        this.a = a; this.b = b; this.c = c; this.d = d; this.t = t;
    }

    double luas() {
        return 0.5 * (a + b) * t;
    }

    double keliling() {
        return a + b + c + d;
    }
}

// ===== MAIN =====
public class Tugas1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Bangun b = new Bangun();

        b.garis();
        System.out.println("        ===== BANGUN RUANG =====");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");

        System.out.println("\n        ===== BANGUN DATAR =====");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");
        b.garis();

        System.out.print("Pilihan: ");
        int pilih = input.nextInt();

        b.garis();

        switch (pilih) {

            case 1:
                System.out.print("Masukkan sisi: ");
                double s = input.nextDouble();
                Kubus k = new Kubus(s);
                System.out.println("Volume kubus: " + k.volume());
                break;

            case 2:
                System.out.print("Panjang: ");
                double p = input.nextDouble();
                System.out.print("Lebar: ");
                double l = input.nextDouble();
                System.out.print("Tinggi: ");
                double t = input.nextDouble();
                Balok balok = new Balok(p, l, t);
                System.out.println("Volume balok: " + balok.volume());
                break;

            case 3:
                System.out.print("Jari-jari: ");
                double r = input.nextDouble();
                Bola bola = new Bola(r);
                System.out.println("Volume bola: " + bola.volume());
                break;

            case 4:
                System.out.print("Jari-jari: ");
                double r2 = input.nextDouble();
                System.out.print("Tinggi: ");
                double t2 = input.nextDouble();
                Tabung tabung = new Tabung(r2, t2);
                System.out.println("Volume tabung: " + tabung.volume());
                break;

            case 5:
                System.out.print("Sisi: ");
                double s2 = input.nextDouble();
                Persegi ps = new Persegi(s2);
                System.out.println("Luas persegi: " + ps.luas());
                System.out.println("Keliling persegi: " + ps.keliling());
                break;

            case 6:
                System.out.print("Panjang: ");
                double p2 = input.nextDouble();
                System.out.print("Lebar: ");
                double l2 = input.nextDouble();
                PersegiPanjang pp = new PersegiPanjang(p2, l2);
                System.out.println("Luas: " + pp.luas());
                System.out.println("Keliling: " + pp.keliling());
                break;

            case 7:
                System.out.print("Jari-jari: ");
                double r3 = input.nextDouble();
                Lingkaran lg = new Lingkaran(r3);
                System.out.println("Luas: " + lg.luas());
                System.out.println("Keliling: " + lg.keliling());
                break;

            case 8:
                System.out.print("Sisi 1: ");
                double a = input.nextDouble();
                System.out.print("Sisi 2: ");
                double b1 = input.nextDouble();
                System.out.print("Sisi 3: ");
                double c = input.nextDouble();
                System.out.print("Sisi 4: ");
                double d = input.nextDouble();
                System.out.print("Tinggi: ");
                double t3 = input.nextDouble();

                Trapesium tr = new Trapesium(a, b1, c, d, t3);
                System.out.println("Luas trapesium: " + tr.luas());
                System.out.println("Keliling trapesium: " + tr.keliling());
                break;

            default:
                System.out.println("Pilihan tidak tersedia!");
        }

        b.garis();
    }
}