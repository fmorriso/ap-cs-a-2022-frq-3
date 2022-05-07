import java.util.*;

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
		double total = 0;
		for(int i = 0; i < numReviewsFilled; i++)
		{
			Review r = allReviews[i];
			total += r.getRating();
		}
		return total / allReviews.length;
	}
	
	/**
	 * <b>Purpose:</b> Collects a list of comments that have an asterisk in them.
	 * @return
	 */
	public ArrayList<String> collectComments()
	{
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 0; i < numReviewsFilled; i++)
		{			
			String comment = allReviews[i].getComment();
			if(comment.indexOf("!") > -1)
			{				
				int lth = comment.length();
				String last = comment.substring(lth-1);				
				if(!(last.equals("!") || last.equals(".")))
				{
					comment += ".";
				}					
				list.add(i + "-" + comment);
			}			
		}
		return list;
	}
}
