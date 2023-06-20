public class nomor9 {
    public static void main(String[] args) {
        int[] arr = {10, 25, 7, 30, 15, 12, 18};
        int indeks = cariIndeksAngkaTerbesarKelipatanLima(arr);

        if (indeks != -1) {
            System.out.println("Angka terbesar yang juga merupakan kelipatan 5 berada pada indeks: " + indeks);
        } else {
            System.out.println("Tidak ditemukan angka terbesar yang juga merupakan kelipatan 5 dalam array.");
        }
    }

    public static int cariIndeksAngkaTerbesarKelipatanLima(int[] arr) {
        int angkaTerbesar = Integer.MIN_VALUE;
        int indeks = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 0 && arr[i] > angkaTerbesar) {
                angkaTerbesar = arr[i];
                indeks = i;
            }
        }

        return indeks;
    }
}

