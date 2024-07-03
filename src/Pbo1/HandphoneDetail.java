package Pbo1;

// Inheritance
public class HandphoneDetail extends Handphone {
    // Overriding constructor
    public HandphoneDetail(String namapembeli, String kodepembeli, int harga) {
        super(namapembeli, kodepembeli, harga);
    }
public String getMerkHp(){
    String kodeMerk = getKodepembeli().substring(0,1);
        //Seleksi If
        return switch (kodeMerk) {
            case "5" -> "Vivo";
            case "6" -> "Iphone";
            case "7" -> "Samsung";
            case "8" -> "Oppo";
            default -> "Merk Tidak Ada";
        };
    }
public String getWarnaHp(){
    String kodewarna = getKodepembeli().substring(1,3);
        //Seleksi Switch
        return switch (kodewarna) {
            case "05" -> "Hitam";
            case "06" -> "Putih";
            case "07" -> "Silver";
            case "09" -> "Gold";
            case "08" -> "Blue";
            case "10" -> "Grey";
            default -> "Warna Tidak Ada";
        };
}

public String getMemo(){
    String kodememo = getKodepembeli().substring(3,6);
        return switch (kodememo) {
            case "005" -> "32 GB";
            case "006" -> "64 GB";
            case "007" -> "128 GB";
            case "008" -> "256 GB";
            default -> "Warna Tidak Ada";
        };
        
}
    // Polymorphism (Overriding)
    @Override
    public String info() {
        return super.info() +
                "\nMerk HP: " + getMerkHp() +
                "\nWarna HP: " + getWarnaHp() +
                "\nMemo HP: " + getMemo();
    }
}

    
        
