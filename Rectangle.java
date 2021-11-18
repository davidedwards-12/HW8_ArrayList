/**
 * This class describes a Rectangle object
 */

public class Rectangle
{
    // FIELDS
    private double length;
    private double width;

    /**
     * Constructor (no-arg / default)
     */
    public Rectangle() {}

    /**
     * Constructor
     * @param len the length of the rectangle
     * @param w the width of the rectangle
     */
    public Rectangle(double len, double w)
    {
        length = len;
        width = w;
    }

    /**
     * Stores a value in the length field
     * @param len The value to store in length
     */
    public void setLength(double len)
    {
        length = len;
    }

    /**
     * Stores a value in the width field
     * @param w The value to store in width
     */
    public void setWidth(double w)
    {
        width = w;
    }

    /**
     * Returns the value in the length field
     * @return the value of length
     */
    public double getLength()
    {
        return length;
    }

    /**
     * Returns the value in the width field
     * @return the value of width
     */
    public double getWidth()
    {
        return width;
    }

    /**
     * Returns the area of the object
     * @return value of length * value of width
     */
    public double getArea()
    {
        double area = length * width;
        return area;

        // OR

       //return length * width;
    }
	
	/**
		toString method
		
		@return A string indicating length, width, and area
	*/
	public String toString()
	{
		// create a string describing the rectangle
		String str = "";
		str += "========================";
		str += "\nLength: " + length;
		str += "\nWidth: " + width;
		str += "\nArea: " + getArea();
		str +="\n========================";
		
		return str;
	}
}