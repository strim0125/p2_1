package ru.iegs.p2_l1.competitors;

public class Human implements Competitor {
        private int maxRun;
        private int maxJump;

        public Human(int maxRun, int maxJump) {
            this.maxRun = maxRun;
            this.maxJump = maxJump;
        }

        public Human() {
            this(3550, 4);
        }

        @Override
        public boolean run(int dist) {
            if (dist <= maxRun) {
                System.out.printf("Человек пробежал " + dist + " м\n");
                return true;
            } else {
                System.out.printf("Человек не пробежал " + dist + " м\n");
                return false;
            }
        }

        @Override
        public boolean jump(int dist) {
            if (dist <= maxJump) {
                System.out.printf("Человек проплыл " + dist + " м\n");
                return true;
            } else {
                System.out.printf("Человек не проплыл " + dist + " м\n");
                return false;
            }
        }
}
