package lesson11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionMain {

    public static void main(String[] args) {
        // Listの作成
        List<String> list = Arrays.asList("青", "赤", "黄");

        // Streamの取得
        Stream<String> stream = list.stream();

        // メソッド参照を使わないラムダ式を使って以下のように記述することもできる
        stream.forEach(s -> System.out.println(s));

    }

}
