public class Main {

    public static void main(String[] args) {
	double Drone1x= 5;
	double Drone1y= 2;
	double Drone1z= -5;
	double Drone2x= 4;
	double Drone2y= 9;
	double Drone2z= 2;
	double Drone3x= -3;
	double Drone3y= 2;
	double Drone3z= 6;
	double distance12= Math.sqrt((Math.pow(Drone1y-Drone2y,2))+(Math.pow(Drone1x-Drone2x, 2))+(Math.pow(Drone1z-Drone2z, 2)));
		double distance13= Math.sqrt((Math.pow(Drone1y-Drone3y,2))+(Math.pow(Drone1x-Drone3x, 2))+(Math.pow(Drone1z-Drone3z, 2)));
		double distance23= Math.sqrt((Math.pow(Drone3y-Drone2y,2))+(Math.pow(Drone3x-Drone2x, 2))+(Math.pow(Drone3z-Drone2z, 2)));
		//System.out.println(distance12);
		//System.out.println(distance13);
		//System.out.println(distance23);
		double highest=Math.max(distance23,Math.max(distance12, distance13));
		double minimum= Math.min(distance23, Math.min(distance12, distance13));
		System.out.println("the greatest distance is "+ highest);
		System.out.println("the lowest distance is "+ minimum);







    }
}
