package Interface_program;

class kitab {
	private String Title;
	private String Author;

	public kitab(String Title, String Author) {
		this.Title = Title;
		this.Author = Author;
	}

	@Override
	public String toString() {
		return "kitab [Title=" + Title + ", Author=" + Author + "]";
	}

}

public class Book {
	public static void main(String[] args) {
		kitab k1 = new kitab("12 fail", "Anurag ");
		System.out.println(k1);
	}
}
