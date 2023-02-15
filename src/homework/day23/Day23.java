package homework.day23;

import java.util.List;
import java.util.Optional;

public class Day23 {
    public static void main(String[] args) {
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        names.stream().filter(s -> s.charAt(0) < '이').forEach(s -> System.out.print(s + " "));
        System.out.println();
        names.stream().sorted().forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println(names.stream().findFirst());
        System.out.println(names.stream().findFirst().get());
        System.out.println(names.stream().count());
    }
}
