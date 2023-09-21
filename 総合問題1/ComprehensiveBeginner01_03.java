/*新規Java ファイル「ComprehensiveBeginner01_03.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

2次方程式 ax^2 + bx + c = 0 （x^2はxの2乗の意味）の係数a, b, cを入力し、
2次方程式の解が2つの実数解か、重解か、2つの虚数解かを判別するプログラムを作成してください。 */

import java.util.Scanner;

class ComprehensiveBeginner01_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a,b,cを入力>");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int D = b * b - 4 * a * c;

        if (D > 0) {
            System.out.println("2つの実数解");
        } else if (D == 0) {
            System.out.println("重解");
        } else {
            System.out.println("2つの虚数解");
        }
        scanner.close();
    }
}