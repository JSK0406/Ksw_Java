package selfstudy;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Collection<Double> list = Arrays.asList(1.23, 4.56, 7.89);
        Iterator<Double> it = list.iterator();

        while (it.hasNext())
            System.out.print(it.next() + " ");
        System.out.println();

        String[] soldiers1 = {"최일구123", "차병호12", "김상훈12345", "박민석123656"};

        List<String> soldiers2 = Arrays.asList(soldiers1);
        soldiers2.set(1, "성윤모");

        for(String s : soldiers2)
            System.out.print(s + " ");
        System.out.println();

        soldiers2.sort((s1,s2) -> s1.length() - s2.length());

        for(String s : soldiers2)
            System.out.print(s + " ");
        System.out.println();

        String[] soldiers3 = soldiers2.toArray(new String[0]);
        // 생성된 배열의 사이즈가 리스트의 사이즈보다 크면 배열의 사이즈로 아니면 리스트의 사이즈로 만들어짐 따라서 0이면 무조건 리스트의 사이즈
        for(int i = 0; i < soldiers3.length; i++)
            System.out.print(soldiers3[i] + " ");
        System.out.println();

        List<String> grades = List.of("이병", "일병", "상병", "병장");
        // of 메소드는 set으로 변경할 수 없다, 불변
        grades.forEach((s) -> System.out.println(s));
    }
}
