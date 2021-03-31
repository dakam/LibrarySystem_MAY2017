package prob2;

public class Book extends LendingItem{

	private String isbn;
	private String title;
	private String authorFirstName;
	private String authorLastName;
	
	Book( String isbn, String title, String authorFirstName, String authorLastName ) {
	this.isbn = isbn;
	this.title=title;
	this.authorFirstName=authorFirstName;
	this.authorLastName=authorLastName;
		
	}
	
	@Override
	
	public String toString() {
		
		String str = "isbn= "+isbn+" title= "+title+" authorFirstName= "+authorFirstName+" authorLastName= "+authorLastName;
		return str;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this==obj) {
			return true;
		}
		else if(this.getClass().getName() != obj.getClass().getName()) {
			return false;
		}
		else
		{
			Book book = (Book) obj;
			if(isbn.equals(book.isbn) && title.equals(book.title) && authorFirstName.equals(book.authorFirstName) && authorLastName.equals(book.authorLastName)) {
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
	}
	
	
}
