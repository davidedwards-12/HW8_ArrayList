/**
 * This program demonstrates an ArrayList
 */

import java.util.ArrayList;

public class ArrayListDemo1
{
    public static void main(String[] args) 
    {
        // create an ArrayList object to hold some names
        ArrayList<String> nameList = new ArrayList<String>();

        // add some names to the ArrayList
        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Bill");
        nameList.add("William");

        // display the size of the ArrayList
        System.out.println("The ArrayList has " + nameList.size() + " objects stored in it.");

        // Now display the items in nameList
        for(int i = 0; i < nameList.size(); i++)
        {
            System.out.println(nameList.get(i));
        }
    }
}