import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Main {
    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Customer> customers = new ArrayList<>();
    static  ArrayList<Employee> employees = new ArrayList<>();
    static  ArrayList<Order>orders = new ArrayList<>();
    public static  void main(String[] args) {

   initData();
    String booksInfo ;
           booksInfo = String.format(" общее кол-во проданных книг %d на сумму %f",getCountofSoldBooks());
        System.out.println(booksInfo);
}
    public  static  double getAllPriceOfSoldBooks(){
        double price = 0 ;
        for (Order order : orders){
            price += getPriceOfSoldBooksInOrder(order);

        }
        return  price;
    }

    private static double getPriceOfSoldBooksInOrder(Order order) {

        return 0;
    }

    // получить общую стоимость одного заказа
    // заказ, по которому считоемся стоимость
    // return  общая стоимость для всех проданных книг в заказе
    public  static double getPriceOfSoldBooks(Order order){
        double price = 0;
        for (long bookId : order.getBooks()){
            Book book = getBookById(bookId);
            if (book != null){
                price += book.getPrice;
        }
        }
        return  price;
    }
    // получить общее количество проданных книг
    public static int getCountofSoldBooks() {
        int count = 0 ;
        for (Order order : orders){
            count += order.getBooks().length;
        }
     return count;
    }
    public static  Book getBookById( long id){// поиск книга по уник номер
        Book current = null ;
        for (Book book: books){
            if (book.getId() == id){
                current = book ;
                break;
            }
        }
        return  current;
    }
    public  static  void initData(){
        //  продавцы
        employees.add(new Employee(1,"Asimov Ilkham",18));
        employees.add(new Employee(2,"Ilyar ",17));
        employees.add(new Employee(3," Erasul",19));
        // покупатели
        customers.add(new Customer(1,"Jan",18));
        customers.add(new Customer(2,"Aitbek Abuev",18));
        customers.add(new Customer(3,"Tolegen Aiteni",18));
        customers.add(new Customer(4,"Erniyaz Ashuov",18));
        customers.add(new Customer(5,"Shugyla Assylbay",18));
        // книги
        //Art
        books.add(new Book(1, "THE SECRET LIVES OF COLOR","KASSIA ST. CLAIRE",2000,BookGenre.Art));
        books.add(new Book(2, "STREET PORTRAITS "," DAWOUD BEY", 4999, BookGenre.Art));
        books.add(new Book(3, "EVERYTHING IS BEAUTIFUL","ALMA W. THOMAS",4990,BookGenre.Art));
        // Programming
        books.add(new Book(4, "Clean Code","Robert C.Martin Laters",4990,BookGenre.Programming));
        books.add(new Book(5, " Introduction to Algorithms","Thomas H. Cormen, Charles E. Leiserson",4990,BookGenre.Programming));
        books.add(new Book(6, "Structure and Interpretation of Computer Programs (SICP)","Harold Abelson, Gerald Jay Sussman",4990,BookGenre.Programming));
        // business_literature
        books.add(new Book(7, " Lean In","Sheryl Sandberg",4990,BookGenre.business_literature));
        books.add(new Book(8, " Good to Great","Jim Collins",4990,BookGenre.business_literature));
        books.add(new Book(9, "Deep Work","Cal Newport",4990,BookGenre.business_literature));

        orders.add(new Order(1,1,1,new long[]{8,9,10,11}));
        orders.add(new Order(2,1,2,new long[]{1}));
        orders.add(new Order(3,2,3,new long[]{5,6,7}));
        orders.add(new Order(4,2,4,new long[]{1,2,3,4}));
        orders.add(new Order(5,3,5,new long[]{2,5,9}));











    }
}