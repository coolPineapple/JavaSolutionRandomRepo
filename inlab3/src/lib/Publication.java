package lib;

public abstract class Publication {
	private int pubNo;
	private String title;
	// Constructor with parameters pubNo anmd title
	public Publication(int pubNo, String title) {
		this.pubNo = pubNo;
		this.title = title;
	}

	public int getPubNo() {
		return pubNo;
	}

	public void setPubNo(int pubNo) {
		this.pubNo = pubNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubClassName() {
		return getClass().getSimpleName();
	};

	public String getInfo() {
		return String.format("%d,%s,%s", pubNo, title, getSubClassName());
	}
}




