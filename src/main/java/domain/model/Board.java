package domain.model;

import domain.model.shape.MovableShape;
import utils.Position;

import java.util.List;
import java.util.ArrayList;

// Board contains all movables
public class Board {
  private List<MovableShape> movables;

  public Board() {
    movables = new ArrayList<>();
    movables.add(new Ball(new Position(50,50),10));
    Paddle paddle = new Paddle(new Position(500, 700));
    paddle.setAngle(45);
    movables.add(paddle);
  }

  public void animate() {
    for (MovableShape m : movables) {
      m.move();
    }
  }

  public List<MovableShape> getMovables() {
    // TODO: Do not return the original, return an immutable copy
    return movables;
  }
}
