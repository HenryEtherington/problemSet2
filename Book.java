public class Book {
    public static void main(String[] args) {

    String title;
    float price;
    int ISBN, numberOfPages;

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

    }
}
