package ru.iegs.p2_l1.obstacles;

import ru.iegs.p2_l1.competitors.Competitor;

public class Wall implements Obstacle{
        public int heigth;

        public Wall(int heigth){ this.heigth = heigth;}

        @Override
        public boolean doIt(Competitor c) { return c.run(heigth); }

}
