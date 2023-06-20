import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan 10 angka:");

        int countKelipatanLima = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            int angka = input.nextInt();

            if (angka % 5 == 0) {
                countKelipatanLima++;
            }
        }
        System.out.println("Jumlah angka yang merupakan kelipatan 5: " + countKelipatanLima);
    }
}

