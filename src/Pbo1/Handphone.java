package Pbo1;

public class Handphone {
    // Atribut dan Encapsulation
    private String namapembeli;
    private String kodepembeli;
    private int harga;

    // Constructor
    public Handphone(String namapembeli, String kodepembeli, int harga) {
        this.namapembeli = namapembeli;
        this.kodepembeli = kodepembeli;
        this.harga = harga;
    }

    // Mutator (Setter)
    public void setNamapembeli(String namapembeli) {
        this.namapembeli = namapembeli;
    }

    public void setKodepembeli(String kodepembeli) {
        this.kodepembeli = kodepembeli;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Accessor (Getter)
    public String getNamapembeli() {
        return namapembeli;
    }

    public String getKodepembeli() {
        return kodepembeli;
    }

    public int getHarga() {
        return harga;
    }

    public String info() {
        return "Nama Pembeli: " + getNamapembeli() +
                "\nKode Pembeli: " + getKodepembeli() +
                "\nHarga: " + getHarga();
    }

    // Polymorphism (Overloading)
    public String info(String ram) {
        return info() + "\nRam: " + ram;
    }
}

