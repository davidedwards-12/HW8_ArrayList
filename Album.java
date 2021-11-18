public class Album
{
    // fields
    private String title;
    private int year;
    private String artist;

    public Album(String paramTitle, int paramYear, String paramArtist)
    {
        title = paramTitle;
        year = paramYear;
        artist = paramArtist;
    }

    public String getTitle()
    {
        return title;
    }

    public int getYear()
    {
        return year;
    }

    public String getArtist()
    {
        return artist;
    }

    public void setTitle(String paramTitle)
    {
        title = paramTitle;
    }

    public void setYear(int paramYear)
    {
        year = paramYear;
    }

    public void setArtist(String paramArtist)
    {
        artist = paramArtist;
    }

    public String toString()
    {
        String albumString = "";
        albumString += "===========================\n";
        albumString += "Title:\t" + title + "\n";
        albumString += "Year:\t" + year + "\n";
        albumString += "Artist:\t" + artist + "\n";
        albumString += "===========================";
        return albumString;
    }
}
