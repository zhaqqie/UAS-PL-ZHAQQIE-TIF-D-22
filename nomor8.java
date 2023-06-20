import java.util.ArrayList;

public class nomor8 {
    public static void main(String[] args) {
        String[] arr = {"apel", "jeruk", "mangga", "durian", "rambutan", "nanas"};
        int minPanjang = 4;
        int maxPanjang = 6;
        ArrayList<Integer> indeks = cariIndeksTeksRange(arr, minPanjang, maxPanjang);

        if (!indeks.isEmpty()) {
            System.out.println("Teks dengan panjang range " + minPanjang + " - " + maxPanjang + " ditemukan pada indeks: " + indeks);
        } else {
            System.out.println("Tidak ditemukan teks dengan panjang range " + minPanjang + " - " + maxPanjang + " dalam array.");
        }
    }

    public static ArrayList<Integer> cariIndeksTeksRange(String[] arr, int minPanjang, int maxPanjang) {
        ArrayList<Integer> indeks = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int panjangTeks = arr[i].length();

            if (panjangTeks >= minPanjang && panjangTeks <= maxPanjang) {
                indeks.add(i);
            }
        }

        return indeks;
    }
}

