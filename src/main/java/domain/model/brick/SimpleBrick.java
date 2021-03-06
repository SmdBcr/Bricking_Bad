package domain.model.brick;

import domain.model.SpecificType;
import domain.model.Type;
import domain.model.movement.MovementBehavior;
import domain.model.movement.NoMovement;
import domain.model.shape.MovableShape;
import org.apache.commons.lang3.SerializationUtils;
import utils.Position;

public class SimpleBrick extends Brick {

    public SimpleBrick(MovementBehavior movBeh, int length, int width) {
        super(movBeh, length, width);
    }

    public SimpleBrick(Position pos, int length, int width) {
        super(new NoMovement(pos), length, width);
    }

    public void collide(MovableShape obj) {
        if (obj.getType() == Type.Ball)
            super.destroy();
        //TODO if collide with another brick, change direction in order to move to the other way
    }

    @Override
    public SpecificType getSpecificType() {
        return SpecificType.SimpleBrick;
    }

    @Override
    public String toString() {
        return "Simple brick with " + super.getPosition();
    }

    @Override
    public MovableShape copy() {
        Brick copyBrick = SerializationUtils.clone(this);
        return copyBrick;
    }

}
