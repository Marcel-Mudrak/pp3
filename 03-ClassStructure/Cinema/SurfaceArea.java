public class SurfaceArea{
    double r;
    double a;
    double h;
    
    public static double circleArea(double r){
        return r * Math.PI;
    }
    
    public static double rectangleArea(double a, double h){
        return a * h;
    }
    
    public static double triangleArea(double a, double h){
        return (a * h)/2;
    }
    
    public static void main(String[] args) {
	System.out.println(SurfaceArea.circleArea(3));
	System.out.println(SurfaceArea.rectangleArea(5, 6));
	System.out.println(SurfaceArea.triangleArea(3, 6));
    }

}