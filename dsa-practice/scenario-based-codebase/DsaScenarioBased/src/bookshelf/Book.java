package bookshelf;

//represents a book in the library
class Book {

 String isbn; 
 String title;
 String author;

 // Constructor
 public Book(String isbn, String title, String author) 
 {
     this.isbn = isbn;
     this.title = title;
     this.author = author;
 }

 // used to avoid duplicate books
 @Override
 public boolean equals(Object obj) 
 {
     if (this == obj) 
     {
    	 return true;
     }
     if(!(obj instanceof Book)) 
     {
    	 return false;
     }
     Book other = (Book) obj;
     {
        return this.isbn.equals(other.isbn);
     }
 }

 @Override
 public int hashCode() 
 {
     return isbn.hashCode();
 }

 @Override
 public String toString() 
 {
     return title + " by " + author + " (ISBN: " + isbn + ")";
 }
}
