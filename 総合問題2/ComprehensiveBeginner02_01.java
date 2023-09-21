/*新規Java ファイル「ComprehensiveBeginner02_01.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

スロットマシーンプログラムを作成してください。
"ゾロ目で大当たり！チャンスは30回"と表示させる
"begin と入力してください> " と入力すると、開始するようにする
ランダムな3つの自然数を、"〇回目：xxx" というように表示させる
大当たり(ゾロ目)"〇回目で大当たりです。おめでとうございます！" と表示させる
30回のうちに大当たりが出なかった場合、"残念でした。終わります。" と表示させる */

import java.util.Scanner;
import java.util.Random;

class ComprehensiveBeginner02_01 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;
        int c = 0;
        boolean flg = false;

        System.out.println("ゾロ目で大当たり!チャンスは30回");
        while (true) {
            try {
                System.out.print("beginと入力してください>");

                String num = scanner.nextLine();

                if (num.equals("begin")) {

                    for (int i = 1; i <= 30; i++) {
                        a = random.nextInt(9) + 1;
                        b = random.nextInt(9) + 1;
                        c = random.nextInt(9) + 1;

                        if (a == b && a == c) {

                            System.out.println(i + "回目：" + a + b + c);
                            System.out.println("大当たりです。おめでとうございます！");

                            flg = true;
                            break;

                        } else {
                            System.out.println(i + "回目：" + a + b + c);
                        }

                    }
                    if (flg == false) {
                        System.out.println("残念でした");
                    }
                    break;
                }
            } catch (NumberFormatException e) {
            }

        }
        scanner.close();

    }
}
