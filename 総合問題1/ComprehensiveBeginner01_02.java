/*新規Java ファイル「ComprehensiveBeginner01_02.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

整数値を3つ入力させ、それらの値が小さい順（等しくてもよい）に並んでいるか判定し、
小さい順に並んでいる場合はOK、そうなっていない場合はNGと表示するプログラムを作成してください。 */

import java.util.Scanner;

class ComprehensiveBeginner01_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("3つの整数を入してください>");

        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        int a3 = scanner.nextInt();

        if (a1 <= a2 && a2 <= a3) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }
        scanner.close();

    }

}
