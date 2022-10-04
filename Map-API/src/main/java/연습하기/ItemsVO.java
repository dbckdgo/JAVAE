package 연습하기;

public class ItemsVO {

	private String title;
	private String dabom_url;

	@Override
	public String toString() {
		return "ItemsVO [title=" + title + ", dabom_url=" + dabom_url + "]";
	}

	public ItemsVO() {

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDabom_url() {
		return dabom_url;
	}

	public void setDabom_url(String dabom_url) {
		this.dabom_url = dabom_url;
	}

	public ItemsVO(String title, String dabom_url) {
		super();
		this.title = title;
		this.dabom_url = dabom_url;
	}
}
