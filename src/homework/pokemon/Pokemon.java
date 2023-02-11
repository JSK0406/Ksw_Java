package homework.pokemon;

import java.util.ArrayList;

public class Pokemon {
    private String owner;
    private ArrayList<String> skills;

    public Pokemon(String owner, ArrayList<String> skills) {
        this.owner = owner;
        this.skills = skills;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<String> skills) {
        this.skills = skills;
    }

    public void info() {
        System.out.println(this.owner + "의 포켓몬이 사용 가능한 스킬");
        for (int i = 0; i < skills.size(); i++) {
            System.out.print((i + 1) + " : " + skills.get(i));
            System.out.println();
        }
    }

    public void attack(int i) {
        System.out.print(skills.get(i) + "공격 시전!");
    }
}