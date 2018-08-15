import java.util.Scanner;
class Book_data_using_classes_objects {
      public static void main(String args[]){
          book b[]=new book[20];
          for (int i=0;i<1;i++){
              b[i]=new book();
              b[i].input_data();
          }
          for (int j=0;j<1;j++){
              System.out.println("The data of book:"+j);
              b[j].display_book_data();
              System.out.println("-----------------------");

          }
      }
}

class book{
    int book_no;
    String book_name,author_name,publication_name;
    double prize_of_book;
    Scanner s = new Scanner(System.in);
    public void input_data(){
        System.out.println("Enter the book_no:");
        this.book_no=s.nextInt();
        System.out.println("Enter the book_name:");
        this.book_name=s.next();
        System.out.println("Enter the Author_name:");
        this.author_name=s.next();
        System.out.println("Enter the Publication_name:");
        this.publication_name=s.next();
        System.out.println("Enter the prize of the book");
        this.prize_of_book=s.nextDouble();
    }

    public void display_book_data(){
        System.out.println("Book name:\n"+book_name+"\n Book_no:"+book_no+"\n Author name:"+author_name+"\n Publication name:"+publication_name+"\n Prize:"+prize_of_book);
    }


}
