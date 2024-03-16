public class mobil {
    String merk = "Honda";
    String model = "X100";
    String spekMesin;
    int tahun;

    void menyalakanMesin() {
        System.out.println("Mesin mobil menyala");
    }

    String mengemudi(String arah) {
        return "Mobil bergerak ke arah" + arah;
    }

    String mengerem() {
        return "Berhenti";
    }

    int topSpeed(int topSpeed) {
        return topSpeed;
    }

    public static void main(String[] args) {
        mobil mobil = new mobil();
        System.out.println(mobil.mengerem());
        System.out.println("kecepatannya "+mobil.topSpeed(100)+"km");
        System.out.println(mobil.mengemudi(" selatan"));
        System.out.println("Merk mobil\t: "+mobil.merk);
        System.out.println("Model mobil\t: "+mobil.model);
    }
}
