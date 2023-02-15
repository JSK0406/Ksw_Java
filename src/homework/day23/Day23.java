package homework.day23;

import java.util.List;
import java.util.Optional;

enum Gender {남, 여};

public class Day23 {
    public static void main(String[] args) {
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Enum> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);
        System.out.println(ages.stream().reduce((x, y) -> x+y).get());
        System.out.println(ages.stream().mapToInt(age -> age).max().getAsInt());
        System.out.println(ages.stream().mapToInt(age -> age).average().getAsDouble());
    }
}
