import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {

    private double sizeX;
    private double sizeY;
    final public ImageView backGround;

    public StaticThing(double sizeX, double sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        backGround = new ImageView(new Image("file:img/desert.png"));
    }

    public ImageView getBackGround(){return backGround;}

}
