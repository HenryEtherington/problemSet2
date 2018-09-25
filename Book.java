public class Book {
    public static void main(String[] args) {

    String title;
    float price;
    int ISBN, numberOfPages;
   
    }
    

   //Accessor methods

     public String getTitle () {
     return title;
     }

        public float getPrice () {
            return price;
        }

        public int getISBN() {
            return ISBN;
        }

        public float getNumberOfPages () {
            return numberOfPages;
        }

     //muatator methods

        public void setTitle (float price) {
        this.title = title;
     }

        public void setPrice (float price) {
            this.price = price;
        }

        public void setISBN  (int ISBN) {
            this.ISBN = ISBN;
        }

        public void setNumberOfPages (int numberOfpages) {
            this.numberOfPages = numberOfPages;
        }

        //constructor methods

        public Book(){
   this.title ="Lord of the Things";
   this.price ="10.00";
   this.ISBN = '110';
   this.numberOfPage = '10';
    }

    public String BooktoString() {
        return "Title" + title + "\nPrice" + price + "\nISBN" + ISBN + "\nNumber of pages" + numberOfPages ;
    }

    public Book(String title; float price; int ISBN, numberOfPages){
        setTitle(title);
        setPrice(price);
        setISBN(ISBN);
        setNumberOfPages(numberOfPages);
       }
    }

