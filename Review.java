
public class Review
{
	private int rating;
	private String comment;
	
	/**
	 * 
	 * @param r - the rating
	 * @param c - a comment
	 */
	public Review(int r, String c)
	{
		rating = r;
		comment = c;
	}
	
	@SuppressWarnings("unused")
	private Review() {/* prevent uninitialized instances */}
	
	public int getRating() { return rating; }
	public String getComment() { return comment; }
	
	
}
