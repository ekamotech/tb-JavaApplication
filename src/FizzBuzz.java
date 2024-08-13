
public class FizzBuzz {
    public static void main(String[] args) {
        // コマンドライン引数がない場合は終了
        if (args.length == 0) {
            return;
        }
        // コマンドライン引数を数値に変換する
        int num = Integer.parseInt(args[0]);
        for (int i = 1; i <= num; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}
