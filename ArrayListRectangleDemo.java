import java.util.ArrayList;

/**
 * This class demonstrates using a written class (Rectangle) to create
 * objects to be stored in an ArrayList
 */
public class ArrayListRectangleDemo 
{
    public static void main(String[] args) 
    {
        // create an ArrayList to hold Rectangle objects
        ArrayList<Rectangle> rectangleList = new ArrayList<Rectangle>();

        // add three new Rectangle objects to the ArrayList
        
        /*
        // Perfectly valid
        Rectangle rectangle1 = new Rectangle(12.2, 6.5);
        Rectangle rectangle2 = new Rectangle(1.1, 15.5);
        Rectangle rectangle3 = new Rectangle(0.2, 56.5);

        rectangleList.add(rectangle1);
        rectangleList.add(rectangle2);
        rectangleList.add(rectangle3);
        */

        rectangleList.add(new Rectangle(12.2, 6.5));
        rectangleList.add(new Rectangle(1.1, 15.5));
        rectangleList.add(new Rectangle(0.2, 56.5));

        // Display the area of each rectangle in rectangleList
        for(Rectangle rectangle : rectangleList)
        {
            System.out.println(rectangle.getArea());
        }
    }
}
