package learning.day23;

class One {
    private One() {
    }
    public static One produceOneInstance() {
        return new One();
    }
}

public class Day23 {
    public static void main(String[] args) {
        One o = One.produceOneInstance();

    }
}
