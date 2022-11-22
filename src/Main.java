import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.layout.Background;





public class Main extends Application {


    Hero Naruto = new Hero(100);

    StaticThing left = new StaticThing(400, 600);
    StaticThing right = new StaticThing(400,600);


    @Override
    public void start(Stage primaryStage) throws Exception {

        //Setting title to the stage
        primaryStage.setTitle("NARUTOOOOO");

        //Creating a Group object
        Group root = new Group();
        Pane pane = new Pane(root);

        //Creating a scene object
        Scene scene = new GameScene(pane, 600, 400, true);

        //Adding scene to the stage
        primaryStage.setScene(scene);

        //Creating an image

        root.getChildren().add(left.getBackGround());
        root.getChildren().add(right.getBackGround());
        root.getChildren().add(Naruto.getHeroView());

        //Setting the position of the image
        Naruto.getHeroView().setX(200);
        Naruto.getHeroView().setY(300);

        //Displaying the contents of the stage
        primaryStage.show();

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                Naruto.update(l);
            }

        };
        timer.start();
    }

    public static void main(String[] args) {launch(args);}
}