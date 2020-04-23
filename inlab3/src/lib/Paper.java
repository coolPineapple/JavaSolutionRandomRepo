package lib;

/* Add the Paper subclass as given in the class diagram. 
 * Override getInfo() method so that it returns a string representing pubNo, title, 
 * SubClassName and journal in the form (i.e. as comma separated values):
   12345,Properties of Concrete,Paper,Materials Journal*/
public class Paper extends Publication {
	private String journal;

	/**
	 * @param pubNo
	 * @param title
	 * @param journal
	 */
	public Paper(int pubNo, String title, String journal) {
		super(pubNo, title);
		this.journal = journal;
	}

	public String getJournal() {
		return journal;
	}

	public void setJournal(String journal) {
		this.journal = journal;
	}

	@Override
	public String getInfo() {
		
		return super.getInfo() + "," + getJournal();
	}

}
