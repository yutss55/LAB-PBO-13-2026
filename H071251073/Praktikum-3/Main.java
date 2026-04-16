public class Main {
    public static void main(String[] args) {

        DompetDigital dompet = new DompetDigital("001", "123456A");

        System.out.println("ID Nasabah: " + dompet.getIdNasabah());
        System.out.println("Saldo: " + dompet.getSaldo());
        System.out.println("Status akun: "  +dompet.getStatusAkun());

        dompet.ubahPin("111111", "654321");

        dompet.ubahPin("123456", "654321"); 

        dompet.setor(50000);

        dompet.setor(-100);

        System.out.println("equals");
        dompet.tarik(20000, "123456A"); 

        dompet.tarik(20000, "654321"); 

        System.out.println("Saldo: " + dompet.getSaldo());

        dompet.investasi(10000, "123456A");
        dompet.investasi(10000, "654321");
        dompet.updateKeuntunganInvestasi();

        System.out.println("--- Total Investasi ---");
        System.out.println("Investasi: " + dompet.getInvestasi());
        
    }
}