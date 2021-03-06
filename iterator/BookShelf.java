package iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate{
	private List<Book> books;
	
	public BookShelf(int initSize) {
		this.books = new ArrayList<Book>(initSize);
	}
	
	public Book getBookAt(int index) {
		return books.get(index);
	}
	
	public void appendBook(Book book) {
		this.books.add(book);
	}
	
	public int getLength() {
		return this.books.size();
	}
	
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
