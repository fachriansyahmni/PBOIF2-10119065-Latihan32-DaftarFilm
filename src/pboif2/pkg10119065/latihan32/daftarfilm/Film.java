package pboif2.pkg10119065.latihan32.daftarfilm;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program daftar film 
                          dengan objek
 */
public class Film {
    String filmName, filmGenre;
    Double filmRating;
    int filmDuration;
    
    public void nowPlaying()
    {
        System.out.println("Judul Film : "+filmName);
        System.out.println("Genre Film : "+filmGenre);
        System.out.println("Rating Film : "+filmRating);
        System.out.println("Duration Film : "+filmDuration + " Menit\n");
    }
}
