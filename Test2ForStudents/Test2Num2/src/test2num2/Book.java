/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2num2;


public class Book implements Comparable<Book> {
    //attributes
    private String author;
    private String title;
    private String price;

   //constructors
public Book() {
    author = "";
    title = "";
    price = "";
            
}

public Book(String a, String t, String p) {
    author = a;
    title = t;
    price = p;
}

    //accessors and mutators (refactor > encapsulate)
    public String getAuthor() {
        return author;
    }

    
    public void setAuthor(String author) {
        this.author = author;
    }

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }


    public String getPrice() {
        return price;
    }

    
    public void setPrice(String price) {
        this.price = price;
    }
   
    //compare titles alphabetically
    public int compareTo(Book b) {
      String b1 = this.title;
      String b2 = b.title;
        int minLen = Math.min(b1.length(), b2.length());

     for (int i = 0; i < minLen; i++) {
        if (b1.charAt(i) != b2.charAt(i)) {
            return b1.charAt(i) - b2.charAt(i);
        }
     }
    return b1.length() - b2.length();
    } 
    
    
    //output
   public String toString() {
       return "Author:" + author + " Title:" + title + " Price:" + price;
   }
   
   

   
    
} // end class




