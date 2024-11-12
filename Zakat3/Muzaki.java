package zakat3;

public class Muzaki {
    private String nama;
    private double harta;

    // Constructor berparameter
    public Muzaki(String nama, double harta) {
        this.nama = nama;
        this.harta = harta;
    }

    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan Setter untuk harta
    public double getHarta() {
        return harta;
    }

    public void setHarta(double harta) {
        this.harta = harta;
    }

    // Metode untuk menghitung zakat maal
    public double hitungZakat() {
        return harta * 2.5 / 100;
    }

    // Metode untuk mengecek apakah sudah mencapai nisab
    public boolean isWajibZakat(double nisab) {
        return harta >= nisab;
    }
}
