

import java.awt.Point;
import javafx.application.*;
import javafx.scene.shape.Rectangle;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class OceanExplorer extends Application {
	final int dimension = 10; // We are creating 10X10 maps
	final int scale = 50;
	Point startPoint;
	Image shipImage;
	ImageView shipImageView;
	ImageView IslandImageView;
	 AnchorPane root;
	 Ship ship;
	 OceanMap oceanMap=new OceanMap();
	//ImageView shipImageView;
public static void main(String[] args)  {
launch(args);
}

@Override
public void start(Stage primaryStage) throws Exception {
// TODO Auto-generated method stub
 root = new AnchorPane();
Scene scene = new Scene(root,500,500);
primaryStage.setScene(scene);
primaryStage.setTitle("ColumbusGame");
primaryStage.show();



// oceanGrid = oceanMap.getMap();
for(int x = 0; x < dimension; x++){
for(int y = 0; y < dimension; y++){
Rectangle rect = new Rectangle(x*scale,y*scale,scale,scale);
rect.setStroke(Color.BLACK); 
rect.setFill(Color.PALETURQUOISE);
root.getChildren().add(rect); 
}
}
startPoint = OceanMap.getShipLocation();
ship = new Ship(startPoint.x,startPoint.y);
loadShipImage(root);

}
public void loadShipImage(AnchorPane root)
{

Image shipImage = new Image("ship.png",50,50,true,true);
shipImageView= new ImageView(shipImage);
shipImageView.setX(startPoint.x*scale);
shipImageView.setY(startPoint.y*scale);
root.getChildren().add(shipImageView);


}
}







