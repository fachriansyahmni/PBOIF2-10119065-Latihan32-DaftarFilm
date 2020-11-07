package pboif2.pkg10119065.latihan32.daftarfilm;

/*
 * @author
 * NAMA                 : Fachriansyah Muhammad Nur Ihsan
 * KELAS                : PBOIF2
 * NIM                  : 10119065
 * Deskripsi Program    : Program ini menampilkan program daftar film 
                          dengan objek
 */
public class PBOIF210119065Latihan32DaftarFilm {
    public static void main(String[] args) {
        
        Film detailsFilm = new Film();
        
        detailsFilm.filmName = "Venom";
        detailsFilm.filmGenre = "Action, Horror, Scifi";
        detailsFilm.filmRating = 8.5;
        detailsFilm.filmDuration = 120;
        detailsFilm.nowPlaying();
        
        detailsFilm.filmName = "Small foot";
        detailsFilm.filmGenre = "Animation";
        detailsFilm.filmRating = 9.0;
        detailsFilm.filmDuration = 96;
        detailsFilm.nowPlaying();
        
        detailsFilm.filmName = "Crazy Rich Asian";
        detailsFilm.filmGenre = "Comedy";
        detailsFilm.filmRating = 7.8;
        detailsFilm.filmDuration = 119;
        detailsFilm.nowPlaying();
        
        detailsFilm.filmName = "Asih";
        detailsFilm.filmGenre = "Horror";
        detailsFilm.filmRating = 6.0;
        detailsFilm.filmDuration = 100;
        detailsFilm.nowPlaying();
        
        System.out.println("Developed by : Fachriansyah Muhammad Nur Ihsan");
    }
    
}
