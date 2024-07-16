public interface GeometricArea {

    //If it was not default the "default" should be public and not have a body
    //Only works with Polygons
    default int getArea(int width, int height){
        return width * height;
    };
}
