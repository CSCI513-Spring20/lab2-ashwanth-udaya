import java.awt.Point;

import javafx.scene.layout.AnchorPane;

public class Ship {


	int Xvalue,Yvalue;
	Point currentLocation;
	AnchorPane root;	
	OceanMap oceanMap = OceanMap.getInstance();
public Ship(int x, int y) {

	Xvalue = x;
	Yvalue = y;

}

// written by ashwanth
public void goEast(int[] IslocX, int[] IslocY) {
	
	Boolean vacantcell = true;
	if ( Xvalue!= 9)
	{
	for(int i=0;i<IslocX.length;i++)
	{
	if(IslocX[i] != 0 && IslocY[i] != 0 && Xvalue+1 == IslocX[i] && Yvalue == IslocY[i])
	{
		vacantcell =false;
	break;
	}
	}
	if(vacantcell)
	Xvalue++;
	}
	
	



}


//written by harika
public void goWest(int[] positionX, int[] positionY) {
	Boolean vacantcell = true;
	if (Xvalue != 0)
	{
	for(int i=0;i<positionX.length;i++)
	{
	if(positionX[i] != 0 && positionY[i] != 0 && Xvalue-1 == positionX[i] && Yvalue == positionY[i])
	{
		vacantcell =false;
	break;
	}

	}
	if(vacantcell)
	Xvalue--;
	}

}

//written by ashwanth
public void goNorth(int[] positionX, int[] positionY) {
	
	Boolean vacantcell = true;
	if (Yvalue != 0)
	{
	for(int i=0;i<positionY.length;i++)
	{
	if(positionX[i] != 0 && positionY[i] != 0 && Xvalue == positionX[i] && Yvalue-1 == positionY[i])
	{
		vacantcell =false;
	break;
	}
	}
	if(vacantcell)
	Yvalue--;
	}

}

//written by harika
public void goSouth(int[] positionX, int[] positionY) {
	Boolean vacantcell = true;
	if (Yvalue != 9)
	{
	for(int i=0;i<positionY.length;i++)
	{
	if(positionX[i] != 0 && positionY[i] != 0 && Xvalue == positionX[i] && Yvalue+1 == positionY[i])
	{
		vacantcell =false;
	break;
	}
	}
	if(vacantcell)
	Yvalue++;
	}

}
public Point getShipLocation() {
	// TODO Auto-generated method stub
	return new Point(Xvalue,Yvalue);

	}


}


