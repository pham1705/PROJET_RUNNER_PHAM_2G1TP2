import java.awt.*;

public class Camera {
    private int X;
    private int Y;

    public int getY() {return Y;}
    public int getX() {return X;}

    public Camera(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    @Override
    public String toString(){return "Camera{" + "X=" + X + ", Y=" + Y +'}';}

}
