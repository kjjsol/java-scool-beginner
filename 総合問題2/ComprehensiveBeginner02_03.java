/*新規Java ファイル「ComprehensiveBeginner02_03.java」というファイルを作成し、
メインメソッドを書き、
下記の通りコーディングしてください。

以下の表示結果が表示されるよう、下記のクラスを使用してコーディングしてください。
buyDrink() メソッドを持つ、Coffee クラスを使用する
buyDrink() メソッドを持つ、Juice クラスを使用する
バヤリース の オレンジ 味です。130 円になります。
午後の紅茶 の レモンティー 味です。150 円になります。
ボス の甘さは 控え目、 ミルク 無しです。 110 円になります。
ジョージア の甘さは 甘め、ミルク 入りです。 120 円になります。 */

class Juice {
    String name = "バヤリース";
    String type = "nothing";

    public void buyDrink() {
        System.out.println(
                switch (type) {
                    case "オレンジ味" -> "130円になります。";
                    case "レモンティー味" -> "150円になります。";
                    default -> "特定できませんでした";

                });
    }
}

class Coffee {
    String name = "ボス";
    String type = "nothing";

    public void buyDrink() {
        System.out.println(
                switch (type) {
                    case "甘さは控え目、ミルクなし" -> "110円になります。";
                    case "甘さは甘め、ミルク入り" -> "120円になります。";
                    default -> "特定できませんでした";

                });
    }
}

class ComprehensiveBeginner02_03 {
    public static void main(String[] args) {
        Juice a001 = new Juice();
        a001.name = "バヤリース";
        System.out.print(a001.name + "の");
        a001.type = "オレンジ味";
        System.out.print(a001.type + "です。");
        a001.buyDrink();

        Juice a002 = new Juice();
        a002.name = "午後の紅茶";
        System.out.print(a002.name + "の");
        a002.type = "レモンティー味";
        System.out.print(a002.type + "です。");
        a002.buyDrink();

        Coffee a003 = new Coffee();
        a003.name = "ボス";
        System.out.print(a003.name + "の");
        a003.type = "甘さは控え目、ミルクなし";
        System.out.print(a003.type + "です。");
        a003.buyDrink();

        Coffee a004 = new Coffee();
        a004.name = "ジョージア";
        System.out.print(a004.name + "の");
        a004.type = "甘さは甘め、ミルク入り";
        System.out.print(a004.type + "です。");
        a004.buyDrink();

    }
}
