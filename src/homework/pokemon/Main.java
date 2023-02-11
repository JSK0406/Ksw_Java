package homework.pokemon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("총" + Pokemon.getCnt() + "마리의 포켓몬이 생성되었습니다");
        Scanner sc = new Scanner(System.in);
        System.out.print("1) 포켓몬 생성  2) 프로그램 종료 : ");
        String menu = sc.next();
        while (true) {
            if (menu.equals("2")) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            else if (menu.equals("1")) {
                System.out.print("1) 피카츄  2) 꼬부기  3) 파이리 : ");
                String pokemon = sc.next();
                System.out.print("플레이어 이름 입력 : ");
                String n = sc.next();
                System.out.print("사용 가능한 기술 입력(/로 구분하여 입력) : ");
                String s = sc.next();
                if (pokemon.equals("1")) {
                    Pokemon P = new Pikachu(n, s);
                }
                else if (pokemon.equals("2")) {
                    Pokemon P = new Ggoboogi(n, s);
                }
                else if (pokemon.equals("3")) {
                    Pokemon P = new Pairi(n, s);
                }
                else {
                    System.out.println("메뉴에서 골라주세요");
                }
                P.info();
                System.out.print("공격 번호 선택 : ");
                int attackmenu = sc.nextInt();
                P.attack(attackmenu - 1);
                

            }
            else {
                System.out.println("메뉴에서 골라주세요");
            }

        }
    }
    
}
