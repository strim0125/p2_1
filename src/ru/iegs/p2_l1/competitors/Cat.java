package ru.iegs.p2_l1.competitors;

public class Cat implements Competitor {
    private int maxRun;
    private int maxJump;

    public Cat(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Cat() {
        this(250, 2);
    }

    @Override
    public boolean run(int dist) {
        if (dist <= maxRun) {
            System.out.printf("Кот пробежал " + dist + " м\n");
            return true;
        } else {
            System.out.printf("Кот не пробежал " + dist + " м\n");
            return false;
        }
    }

    @Override
    public boolean jump(int dist) {
        if (dist <= maxJump) {
            System.out.printf("Кот проплыл " + dist + " м\n");
            return true;
        } else {
            System.out.printf("Кот не проплыл " + dist + " м\n");
            return false;
        }
    }
}
