package net.codejava.javaee.bookstore;
 
/**
 * Book.java
 * This is a model class represents a book entity
 * @author www.codejava.net
 *
 */

public class Book {
    private int id;
    private String title;
    private String author;
    private float price;
    private boolean hardcover;
 
    public Book() {
    }
 
    public Book(int id) {
        this.id = id;
    }
 
    public Book(int id, String title, String author, float price, boolean hardcover) {
        this(title, author, price, hardcover);
        this.id = id;
    }
     
    public Book(String title, String author, float price, boolean hardcover) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.hardcover = hardcover;
    }
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public String getAuthor() {
        return author;
    }
 
    public void setAuthor(String author) {
        this.author = author;
    }
 
    public float getPrice() {
        return price;
    }
 
    public void setPrice(float price) {
        this.price = price;
    }
    public boolean getHardcover() {
        return hardcover;
    }
    public void setHardcover(boolean hardcover) {
        this.hardcover = hardcover;
    }

}