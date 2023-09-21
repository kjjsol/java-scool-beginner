/*新規Java ファイル「ComprehensiveBeginner01_04.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

とある美術館の入場料金は、一人600円であるが、5人以上のグループなら一人550円、20人以上の団体なら一人500円である。
人数を入力し、入場料の合計を計算するプログラムを作成してください。 */

import java.util.Scanner;

class ComprehensiveBeginner01_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 入場料金合計を計算
        System.out.print("人数>");

        int inputNum = scanner.nextInt();

        if (inputNum <= 4) {
            System.out.println(inputNum * 600);
        } else if (inputNum >= 5 && inputNum <= 19) {
            System.out.println(inputNum * 550);
        } else {
            System.out.println(inputNum * 500);
        }
        scanner.close();
    }
}
