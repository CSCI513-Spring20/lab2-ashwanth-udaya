
import java.awt.Point;

import javafx.application.Application;
import javafx.scene.Scene;

import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class OceanExplorer extends Application {
	Point startPoint;
	//ImageView shipImageView;
public static void main(String[] args)  {
launch(args);
}

@Override
public void start(Stage primaryStage) throws Exception {
// TODO Auto-generated method stub
AnchorPane root = new AnchorPane();
Scene scene = new Scene(root,500,500);
primaryStage.setScene(scene);
primaryStage.setTitle("ColumbusGame");
primaryStage.show();

final int dimension = 10; // We are creating 10X10 maps
final int scale = 50;
// oceanGrid = oceanMap.getMap();
for(int x = 0; x < dimension; x++){
for(int y = 0; y < dimension; y++){
Rectangle rect = new Rectangle(x*scale,y*scale,scale,scale);
rect.setStroke(Color.BLACK); 
rect.setFill(Color.PALETURQUOISE);
root.getChildren().add(rect); 
}
}

}
}





