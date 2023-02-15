package homework.day23;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

enum Gender {남, 여};

class Member {
    String name;
    Gender gender;
    int age;

    public Member(String name, int age, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Member(" +
                name + "," +
                gender +
                "," + age +
                ")";
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
public class Day23 {
    public static void main(String[] args) {
        List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
        List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
        List<Gender> genders = List.of(Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);

        List<Member> memberList = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            memberList.add(new Member(names.get(i), ages.get(i), genders.get(i)));
        }

        memberList.stream().forEach(s -> System.out.print(s + " "));
        System.out.println();
        System.out.println(memberList.stream().collect(Collectors.groupingBy((Member::getGender))));

    }
}
