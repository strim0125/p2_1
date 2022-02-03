package ru.iegs.p2_l1.competitors;

public class Robot implements Competitor {
        private int maxRun;
        private int maxJump;

        public Robot(int maxRun, int maxJump) {
            this.maxRun = maxRun;
            this.maxJump = maxJump;
        }

        public Robot() {
            this(4000, 5);
        }

        @Override
        public boolean run(int dist) {
            if (dist <= maxRun) {
                System.out.printf("Робот пробежал " + dist + " м\n");
                return true;
            } else {
                System.out.printf("Робот не пробежал " + dist + " м\n");
                return false;
            }
        }

        @Override
        public boolean jump(int dist) {
            if (dist <= maxJump) {
                System.out.printf("Робот проплыл " + dist + " м\n");
                return true;
            } else {
                System.out.printf("Робот не проплыл " + dist + " м\n");
                return false;
            }
        }
}
