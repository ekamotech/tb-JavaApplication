
public class ArgsLastPrinter {
    public static void main(String[] args) {
        if (args.length > 0) {
            // コマンドライン引数が渡された場合、最後の要素を出力
            System.out.println(args[args.length - 1]);
        } else {
            // コマンドライン引数が渡されなかった場合、「なし」を出力
            System.out.println("なし");
        }
    }
}
