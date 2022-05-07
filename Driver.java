/**
 * <b>Purpose:</b> A driver that will run both part A and part B of the FRQ 
 * @author Fred Morrison
 *
 */
public class Driver
{
	public static void main(String[] args)
	{
		ReviewAnalysis ra = new ReviewAnalysis();
		ra.addReview(new Review(4, "Good! Thx"));
		ra.addReview(new Review(3, "OK site"));
		ra.addReview(new Review(5, "Great!"));
		ra.addReview(new Review(2, "Poor! Bad."));
		ra.addReview(new Review(3, ""));
		
		// Part A:
		System.out.format("The average rating = %.1f%n", ra.getAverageRating());
		
		// Part B:
		System.out.println("Collected comments:");
		System.out.println(ra.collectComments());
	}
}
