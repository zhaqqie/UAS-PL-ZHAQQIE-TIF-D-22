import java.util.Scanner;

public class nomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan 10 teks:");

        int countTeksPanjang = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Teks ke-" + (i + 1) + ": ");
            String teks = input.nextLine();

            if (teks.length() == 5) {
                countTeksPanjang++;
            }
        }

        System.out.println("Jumlah teks yang memiliki panjang 5 karakter: " + countTeksPanjang);
    }
}
