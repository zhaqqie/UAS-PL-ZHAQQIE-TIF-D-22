import java.util.ArrayList;

public class nomor7 {
    public static void main(String[] args) {
        String[] arr = {"apel", "jeruk", "mangga", "anggur", "durian", "rambutan"};
        ArrayList<Integer> indeks = cariIndeksTeksPanjang(arr);

        if (!indeks.isEmpty()) {
            System.out.println("Teks dengan panjang 5 karakter ditemukan pada indeks: " + indeks);
        } else {
            System.out.println("Tidak ditemukan teks dengan panjang 5 karakter dalam array.");
        }
    }

    public static ArrayList<Integer> cariIndeksTeksPanjang(String[] arr) {
        ArrayList<Integer> indeks = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == 5) {
                indeks.add(i);
            }
        }

        return indeks;
    }
}
