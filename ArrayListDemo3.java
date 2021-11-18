/**
 * This program demonstrates an ArrayList
 */

import java.util.ArrayList;

public class ArrayListDemo3
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

        // Now display the items in nameList and their indices
        for(int i = 0; i < nameList.size(); i++)
        {
            System.out.println("Index: " + i + " Name: " + nameList.get(i));
        }

        // now remove the item at index 1
        nameList.remove(1);

        System.out.println("The item at index 1 is removed. Here are the items now.");

        // Now display the items in nameList and their indices
        for(int i = 0; i < nameList.size(); i++)
        {
            System.out.println("Index: " + i + " Name: " + nameList.get(i));
        }
    }
}