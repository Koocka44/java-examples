package basics.impl;

import basics.util.BookProperties.Genre.*;
import basics.util.BookProperties.Form.*;

/*
 *
 * Usage example can be found in basics.impl.Main class.
 *
*/
public class Book {
	
	private String isbn;
	private String title = ""; // make sure this is not null when calling hashCode
	private String abs;
	private String author;
	private Genre genre;
	private Form form;
	
	public Book(String isbn){
		this.isbn = isbn;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAbs(String abs) {
		this.abs = abs;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	
	public void setForm(Form form) {
		this.form = form;
	}
	
	@Override
	public boolean equals(Book other){
		return isbn.equals(other.isbn) && title.equals(other.title);
	}
	
	@Override
    public int hashCode() {
        return isbn.hashCode() + title.hashCode();
    }
	
	@Override
    public String toString() {
        return "Book [ISBN=" + isbn + "," + "title=" + title + ", " + "abs=" + abs + "]";
    }
	
}