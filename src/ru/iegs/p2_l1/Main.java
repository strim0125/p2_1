package ru.iegs.p2_l1;

import ru.iegs.p2_l1.competitors.Cat;
import ru.iegs.p2_l1.competitors.Competitor;
import ru.iegs.p2_l1.competitors.Human;
import ru.iegs.p2_l1.competitors.Robot;
import ru.iegs.p2_l1.obstacles.Cross;
import ru.iegs.p2_l1.obstacles.Obstacle;
import ru.iegs.p2_l1.obstacles.Wall;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {
                new Human(),
                new Robot(),
                new Cat()
        };
        Obstacle[] obstacles = {
                new Cross(750),
                new Wall(1)
        };

        for (Competitor c: competitors) {
            for (Obstacle o: obstacles) {
                if(!o.doIt(c)) {
                    break;
                };
            }
        }
    }
}
