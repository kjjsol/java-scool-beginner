/*新規Java ファイル「ComprehensiveBeginner02_02.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

ジャンケンプログラムを作成してください。
"ジャンケン"と表示させる
"0:グー 1:チョキ 2: パー ＞数字を入力してください" 左記の数字が入力された場合、後続の処理に進み、
それ以外の数字が入力された場合、エラーとして説明した後に 1.  に戻るようにする
今までに作成してきたジャンケンプログラムを参考に、ジャンケン処理を実装する */

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class ComprehensiveBeginner02_02 {
    public static void main(String[] args) {
        System.out.println("ジャンケン");// 2人で（３＊３の９通り）

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("0:グー 1:チョキ 2: パー ＞数字を入力してください");

                int inputNum = scanner.nextInt();
                if (inputNum >= 0 && inputNum <= 2) {

                    int cpu = new Random().nextInt(3);

                    System.out.println("cpu=> " + cpu);

                    if (inputNum == 0) {
                        if (cpu == 0) {
                            System.out.println("あいこです");
                        } else if (cpu == 1) {
                            System.out.println("あなたの勝ちです");
                        } else {
                            System.out.println("cpuの勝ちです");
                        }
                    } else if (inputNum == 1) {
                        if (cpu == 0) {
                            System.out.println("cpuの勝ちです");
                        } else if (cpu == 1) {
                            System.out.println("あいこです");
                        } else {
                            System.out.println("あなたの勝ちです");
                        }
                    } else {
                        if (cpu == 0) {
                            System.out.println("あなたの勝ちです");
                        } else if (cpu == 1) {
                            System.out.println("cpuの勝ちです");
                        } else {
                            System.out.println("あいこです");
                        }
                    }
                    break;
                }
            } catch (InputMismatchException e) {
            }

        }
        scanner.close();
    }
}