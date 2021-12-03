public abstract class MovablePoint implements Movable {

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    public MovablePoint() {

    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public abstract MovablePoint center();
    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }

    @Override
    public void moveUP() {
        System.out.println("MovablePoint moveUP");
    }

    @Override
    public void moveDown() {
        System.out.println("MovablePoint moveDown");
    }

    @Override
    public void moveLeft() {
        System.out.println("MovablePoint moveLeft");
    }

    @Override
    public void moveRight() {
        System.out.println("MovablePoint moveRight");
    }
}