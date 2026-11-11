/*
 * Workshop 6 - Exercise 1 (Easy)
 * Store the names of 10 favorite songs and their artists in two arrays of strings,
 * then output a list of the songs and artists.
 */
public class Exercise1 {

    public static void main(String[] args) {

        // 10 favourite songs
        String[] songs = {
            "Bohemian Rhapsody",
            "Hotel California",
            "Imagine",
            "Shape of You",
            "Rolling in the Deep",
            "Take Me Home, Country Roads",
            "Blinding Lights",
            "Someone Like You",
            "Counting Stars",
            "See You Again"
        };

        // the artist of each song (same index as the song array)
        String[] artists = {
            "Queen",
            "Eagles",
            "John Lennon",
            "Ed Sheeran",
            "Adele",
            "John Denver",
            "The Weeknd",
            "Adele",
            "OneRepublic",
            "Wiz Khalifa ft. Charlie Puth"
        };

        System.out.println("My 10 Favourite Songs");
        System.out.println("=====================");
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i] + "  -  " + artists[i]);
        }
    }
}
