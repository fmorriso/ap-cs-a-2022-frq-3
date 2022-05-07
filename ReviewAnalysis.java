
public class ReviewAnalysis
{
	private Review[] allReviews;
	private int numReviewsFilled;
	
	public ReviewAnalysis()
	{
		allReviews = new Review[5];
		numReviewsFilled = 0;
	}
	
	public void addReview(Review r)
	{
		if(numReviewsFilled < allReviews.length)
		{
			allReviews[numReviewsFilled++] = r;			
		}
		// else, we would normally throw an exception - not shown
	}
	
	/**
	 * <b>Purpose:</b> returns the average rating of all reviews.
	 * <p>
	 * <b>Preconditions:</b>
	 * <ul>
	 * <li><code>allReviews</code> contains at least one <code>Review</code>
	 * <li>No element of <code>allReviews</code> is null.
	 * </ul> 
	 * @return
	 */
	public double getAverageRating()
	{
		double total = 0, avg;
		for(int i = 0; i < numReviewsFilled; i++)
		{
			Review r = allReviews[i];
			total += r.getRating();
		}
		return total / allReviews.length;
	}
}
