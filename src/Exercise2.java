/*
 * Workshop 6 - Exercise 2 (Hard)
 * Exercise 1 modified so the songs are output in alphabetical order.
 * Hint: bubble sort. The artist array is sorted together with the song array
 * so that each song keeps its own artist.
 */
public class Exercise2 {

    public static void main(String[] args) {

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

        // ---------- bubble sort ----------
        for (int pass = 0; pass < songs.length - 1; pass++) {
            for (int i = 0; i < songs.length - 1 - pass; i++) {
                // compareToIgnoreCase puts the song that comes first in the
                // dictionary in front (so upper/lower case does not matter)
                if (songs[i].compareToIgnoreCase(songs[i + 1]) > 0) {
                    String tempSong = songs[i];
                    songs[i] = songs[i + 1];
                    songs[i + 1] = tempSong;

                    String tempArtist = artists[i];
                    artists[i] = artists[i + 1];
                    artists[i + 1] = tempArtist;
                }
            }
        }

        System.out.println("Songs in Alphabetical Order");
        System.out.println("============================");
        for (int i = 0; i < songs.length; i++) {
            System.out.println((i + 1) + ". " + songs[i] + "  -  " + artists[i]);
        }
    }
}
