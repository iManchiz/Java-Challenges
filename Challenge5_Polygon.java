public class Challenge5_Polygon {
    public static void main(String[] args) {
        
        triangle(10, 5);
        square(10);
        rectagle(10,5);

    }

    public static void triangle(float base, float height){

        float triangleArea = (base*height)/2;
        System.out.println("The triangle area is: "+triangleArea);

    }

    public static void square(float value){

        float squareArea = value*value;
        System.out.println("The square area is: "+squareArea);

    }

    public static void rectagle(float base, float height){

        float rectangleArea = base*height;
        System.out.println("The rectangle area is: "+rectangleArea);

    }


}
