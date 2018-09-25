public class Book {


    String title;
    double price;
    int ISBN, numberOfPages;

    //Accessor methods

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getISBN() {
        return ISBN;
    }

    public float getNumberOfPages() {
        return numberOfPages;
    }

    //muatator methods

    public void setTitle(String price) {
        this.title = title;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setNumberOfPages(int numberOfpages) {
        this.numberOfPages = numberOfPages;
    }

    //constructor methods

    public Book() {
        this.title = "The Lime Machine";
        this.price = '8';
        this.ISBN = '1';
        this.numberOfPages = '5';
    }

    public String BooktoString() {
        return "Title" + title + "\nPrice" + price + "\nISBN" + ISBN + "\nNumber of pages" + numberOfPages;
    }

}



