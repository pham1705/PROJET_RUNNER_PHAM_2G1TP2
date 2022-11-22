import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;



public class Hero {

    double x;
    double vitesse=0.3;

    final Image hero = new Image("file:img/heros.png");


    //Setting the image View
    private ImageView heroView = new ImageView(hero);

    public Hero(double x){
        this.x=x;
        heroView.setViewport(new Rectangle2D(20,0,65,100));

    }
    private long getPreviousL=0;

    public ImageView getHeroView(){
        return heroView;
    }

    private long previousL=0;

    public void update (long l){
        //Animation
        int index=(int) (l/10000000)%6;
        heroView.setViewport(new Rectangle2D(20+index*80,0,65,100));
        //Physique
        if(previousL !=0)x=x+(vitesse*(l-previousL)/1000000);
        previousL=l;
        heroView.setX(x);
    }
}
