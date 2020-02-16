import java.awt.Point;
import java.util.Random;

public class OceanMap {
	static int x,y;
	static Random r=new Random();
public boolean[][] myGrid=new boolean[10][10];

public boolean[][] getmap()
{
return myGrid;
}

public static Point getShipLocation() {
	// TODO Auto-generated method stub
	x=r.nextInt(10);
	y=r.nextInt(10);
	return new Point(x,y);
	
}

}