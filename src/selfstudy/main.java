package selfstudy;

import java.util.*;
import java.util.stream.Stream;

public class main {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList(
                "서울", "부산", "광주", "대구", "부산", "서울", "대전", "서울", "경기", "대구");
        Iterator<String> it = cities.iterator();
        while(it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();

        Stream<String> st = cities.stream();
//        st.forEach((s) -> System.out.print(s + " "));
//        st.filter((s) -> s.contains("대")).forEach((s) -> System.out.print(s + " "));
        st.distinct().forEach(s -> System.out.print(s + " "));


    }
}
