package domain.model.brick;

import domain.Movable;
import utils.Velocity;

public class WrapperBrick extends Brick {
    // TODO: Implement
    public WrapperBrick(int length, int width) {
        super(length, width);
    }

    @Override
    public void collide(Movable obj) {

    }

    @Override
    public void move() {

    }

    @Override
    public Velocity getVelocity() {
        return null;
    }

    @Override
    public void setVelocity(Velocity ps) {

    }

    @Override
    public Shape getShape() {
        return null;
    }
}
