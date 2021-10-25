package iterator;

public class maintest {
	
	public static void main(String args[]) {
		
		BookShelf books = new BookShelf(8); 
		books.appendBook(new Book("test1"));
		books.appendBook(new Book("test2"));
		books.appendBook(new Book("test3"));
		books.appendBook(new Book("test4"));
		Iterator it = books.iterator();
		
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getBook());	
		}
		
		System.out.println(books.getLength());	
	}
	
}