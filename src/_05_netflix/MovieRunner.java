package _05_netflix;

public class MovieRunner {
public static void main(String[] args) {
	Movie backToTheFuture = new Movie("Back to the Future", 5);
	Movie theGodfather = new Movie("The Godfather", 4);
	Movie theWizardOfOz = new Movie("The Wizard of Oz", 3);
	Movie citizenKane = new Movie("Citizen Kane", 2);
	Movie menInBlack = new Movie("Men in Black", 1);
	System.out.println(backToTheFuture.getTicketPrice());
	NetflixQueue netflix = new NetflixQueue();
	netflix.addMovie(backToTheFuture);
	netflix.addMovie(theGodfather);
	netflix.addMovie(citizenKane);
	netflix.addMovie(menInBlack);
	netflix.addMovie(theWizardOfOz);
	netflix.printMovies();
	netflix.sortMoviesByRating();
	System.out.println("The best movie is " + netflix.getBestMovie());
	System.out.println();netflix.movies.get(3);
	
}
}
