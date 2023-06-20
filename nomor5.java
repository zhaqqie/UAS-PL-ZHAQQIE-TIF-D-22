import java.util.ArrayList;

public class nomor5 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25, 30, 35, 20};
        int angkaCari = 20;
        ArrayList<Integer> indeks = cariIndeksAngka(arr, angkaCari);

        if (!indeks.isEmpty()) {
            System.out.println("Angka " + angkaCari + " ditemukan pada indeks: " + indeks);
        } else {
            System.out.println("Tidak ditemukan angka " + angkaCari + " dalam array");
        }
    }
    public static ArrayList<Integer> cariIndeksAngka(int[] arr, int angkaCari) {
        ArrayList<Integer> indeks = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == angkaCari) {
                indeks.add(i);
            }
        }
        return indeks;
    }
}
