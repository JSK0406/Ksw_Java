package homework.pokemon;

import java.util.ArrayList;

public class Pikachu extends Pokemon {
    String name = "피카츄";
    public Pikachu(String owner, String skills) {
        super(owner, skills);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(int idx) {
        System.out.println("[삐까삐까]" + getOwner() + "의" + this.name + "가" + getSkills().get(idx) + "공격 시전!");
    }

}
