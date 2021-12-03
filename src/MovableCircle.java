public class MovableCircle extends MovablePoint implements Movable {
    private int radius;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }


    public MovableCircle() {

    }


    @Override
    public MovablePoint center() {
        MovableCircle movablePoint = new MovableCircle();
        return movablePoint;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void moveUP() {
        super.moveUP();
    }

    @Override
    public void moveDown() {
        super.moveDown();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }

    @Override
    public void moveRight() {
        super.moveRight();
    }
}