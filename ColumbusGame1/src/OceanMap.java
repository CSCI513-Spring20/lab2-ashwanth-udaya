import java.awt.Point;
import java.util.Random;

public class OceanMap {
	static int x,y;
	static Random r=new Random();
	public static OceanMap oceanMap = null;
	static int Isx,Isy;
public boolean[][] myGrid=new boolean[10][10];

public boolean[][] getmap()
{
return myGrid;
}
public static OceanMap getInstance() {
if(oceanMap==null) {
oceanMap=new OceanMap();
}
return oceanMap;
}
public static Point getShipLocation() {
	// TODO Auto-generated method stub
	x=r.nextInt(10);
	y=r.nextInt(10);
	return new Point(x,y);
	
}
//done by ashwath
public static Point getislandslocation() {
	// TODO Auto-generated method stub
	Isx=r.nextInt(10);
	Isy=r.nextInt(10);
	if(x != Isx || y != Isy)
	{
	return new Point(Isx,Isy);
	}
	else
	{
	return new Point(0,0);
	}

	
	
}

}