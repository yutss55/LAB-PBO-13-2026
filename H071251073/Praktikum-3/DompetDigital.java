class DompetDigital {

    private String pin;
    private double saldo;
    protected String Id;

    String statusAkun;

    private double investasi = 0;

    public DompetDigital(String idNasabah, String pin) {
        this.Id = idNasabah;
        this.pin = pin;
        this.saldo = 0; 
        this.statusAkun = "Aktif";
    }

    
    public String getIdNasabah() {
        return Id;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getStatusAkun() {
        return statusAkun;
    }

    public double getInvestasi(){
        return investasi;
    }

    public void ubahPin(String pinLama, String pinBaru) {
        if (!this.pin.equals(pinLama)) {
            System.out.println("PIN lama salah!");
        } else if (pinBaru.length() != 6) {
            System.out.println("minimal 6 char");
        } else {
            this.pin = pinBaru;
            System.out.println("PIN berhasil diubah");
        }
    }

    public void setor(double jumlahSetor) {
        if (jumlahSetor <= 0) {
            System.out.println("Nominal setor tdk boleh kurang dan mines");
            logTransaksi("Setor gagal");
        } else {
            saldo += jumlahSetor;
            System.out.println("Setor berhasil: " + jumlahSetor);
            logTransaksi("Setor berhasil");
        }
    }

    public void tarik(double jumlahTarik, String inputPin) {
        if (!this.pin.equals(inputPin)) {
            System.out.println("PIN salah");
            logTransaksi("penarikan gagal, PIN salah");
        } else if (jumlahTarik > saldo) {
            System.out.println("Saldo tidak cukup!");
            logTransaksi("penarikan gagal, saldo kurang");
        } else if (jumlahTarik <= 0) {
            System.out.println("Nominal tidak valid!");
            logTransaksi("penarikan gagal, nominal salah");
        } else {
            saldo -= jumlahTarik;
            System.out.println("penarikan berhasil: " + jumlahTarik);
            logTransaksi("penarikan berhasil");
        }
    }

    private void logTransaksi(String pesan) {
        System.out.println("[LOG]: " + pesan);
    }

    public void investasi(double jumlahInvestasi, String inputPin) {
        if (!this.pin.equals(inputPin)) {
            System.out.println("PIN salah");
            logTransaksi("investasi gagal, PIN salah");
        } else if (jumlahInvestasi > saldo) {
            System.out.println("Saldo tidak cukup untuk investasi!");
            logTransaksi("investasi gagal, saldo kurang");
        } else if (jumlahInvestasi <= 0) {
            System.out.println("Nominal investasi tidak valid!");
            logTransaksi("investasi gagal, nominal salah");
        } else {
            saldo -= jumlahInvestasi;
            investasi += jumlahInvestasi;
            System.out.println("Investasi berhasil: " + jumlahInvestasi);
            logTransaksi("investasi berhasil");
        }
    }

    public void updateKeuntunganInvestasi() {
        double bunga = investasi * 0.05;
        investasi += bunga;
        System.out.println("Keuntungan investasi: " + bunga);
        logTransaksi("update keuntungan investasi");
    }
}

