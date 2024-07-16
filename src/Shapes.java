public class Shapes {

    public static class Rectangle implements GeometricArea{
    }

    public static class Triangle implements GeometricArea{
        @Override
        public int getArea(int width, int height) {
            return width * height / 2;
        }
    }



}
