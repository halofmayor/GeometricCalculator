public class Calculator {
    GeometricArea geometricArea;
    public Calculator(GeometricArea geometricArea){
        this.geometricArea = geometricArea;
    }

    public int getArea(int width, int height) {
        return geometricArea.getArea(width, height);
    }

    public static void main(String[] args) {
        GeometricArea shape = new Shapes.Triangle();
        Calculator calculator = new Calculator(shape);
        System.out.println(calculator.getArea(5,10));
    }

}
