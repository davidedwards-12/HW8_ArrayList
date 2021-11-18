import java.util.Scanner;
import java.util.ArrayList;

public class AlbumDemo
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        String title1, title2;
        int year1, year2;
        String artist1, artist2;

        System.out.print("Title 1: ");
        title1 = kb.nextLine();
        System.out.print("Year 1: ");
        year1 = kb.nextInt();
        kb.nextLine();
        System.out.print("Artist 1: ");
        artist1 = kb.nextLine();

        System.out.print("Title 2: ");
        title2 = kb.nextLine();
        System.out.print("Year 2: ");
        year2 = kb.nextInt();
        kb.nextLine();
        System.out.print("Artist 2: ");
        artist2 = kb.nextLine();

        // Create new Album objects
        Album album1 = new Album(title1, year1, artist1);
        Album album2 = new Album(title2, year2, artist2);

        // Create new ArrayList and add Albums to it
        ArrayList<Album> albums = new ArrayList<Album>();
        albums.add(album1);
        albums.add(album2);

        System.out.println("There are " + albums.size() + " albums in the collection.");

        for(Album album : albums)
        {
            System.out.println(album.toString());
        }
    }
}
