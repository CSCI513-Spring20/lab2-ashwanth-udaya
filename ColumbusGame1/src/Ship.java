import java.awt.Point;

import javafx.scene.layout.AnchorPane;

public class Ship {


	int X,Y;
	Point currentLocation;
	AnchorPane root;	
public Ship(int x, int y) {

X = x;
Y = y;

}

public Point getShipLocation() {
	// TODO Auto-generated method stub
	return new Point(X,Y);

	}
}

