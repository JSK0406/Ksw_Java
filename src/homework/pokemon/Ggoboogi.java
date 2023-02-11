package homework.pokemon;

import java.util.ArrayList;

public class Ggoboogi extends Pokemon {
    String name = "꼬부기";
    public Ggoboogi(String owner, String skills) {
        super(owner, skills);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(int idx) {
        System.out.println("[꼬북꼬북]" + getOwner() + "의" + this.name + "가" + getSkills().get(idx) + "공격 시전!");
    }

    public void swim() {
        System.out.println(this.name + "가 수영을 합니다");
    }
}
