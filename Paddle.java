import java.awt.*;

public interface Paddle {
    public void draw(Graphics g);
    public void move();
    public void moveEasy();
    public void moveHard();
    public int getY();
}
