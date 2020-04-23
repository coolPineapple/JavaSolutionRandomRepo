package area;

public class Area {
	
	//double dis = Math.sqrt(((x1 - x2)*((x1 - x2)) + ((y1 - y2)*((y1 - y2)));
static double getArea() {
	
	Double r = 9d;
	Double R = 9d;
	Double d = 22d;
	
	if(R < r)
	{
		 r = 9d;
		 R = 9d; 
	}
	Double part1 = r*r*Math.acos((d*d + r*r - R*R)/(2*d*r));
	Double part2 = R*R*Math.acos((d*d + R*R - r*r)/(2*d*R));
	Double part3 = 0.5*Math.sqrt((-d+r+R)*(d+r-R)*(d-r+R)*(d+r+R));

	Double intersectionArea = part1 + part2 - part3;
	if(intersectionArea = NaN)
	return intersectionArea;
}

public static void main(String[] args) {
	System.out.println(Area.getArea());
	
}
}

