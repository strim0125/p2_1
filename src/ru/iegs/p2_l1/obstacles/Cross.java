package ru.iegs.p2_l1.obstacles;

import ru.iegs.p2_l1.competitors.Competitor;

public class Cross implements Obstacle{
    public int dist;

    public Cross(int dist){ this.dist = dist;}

    @Override
    public boolean doIt(Competitor c) { return c.run(dist); }
}
