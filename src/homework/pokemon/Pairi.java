package homework.pokemon;

import java.util.ArrayList;

public class Pairi extends Pokemon {
    String name = "파이리";
    public Pairi(String owner, String skills) {
        super(owner, skills);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attack(int idx) {
        System.out.println("[파읠파읠]" + getOwner() + "의" + this.name + "가" + getSkills().get(idx) + "공격 시전!");
    }

}
