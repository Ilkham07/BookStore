public class Book {
    public double getPrice;
    private  long id;
    private  String title;
    private  String auther ;
    private  double price;
    private BookGenre genre; //janor knigi
    public Book(long id, String title, String auther, double price, BookGenre genre) {
        this.id = id;
        this.title = title;
        this.auther = auther;
        this.price = price;
        this.genre = genre;
    }
    public  long getId (){
        return id;

    }
    public  void  setId(long id){
        this.id = id ;
    }
    public String getTitle(){
        return  title;
    }
    public  void setTitle( String title){
        this.title =title;
    }
    public  String getAuther(){
        return  auther;
    }
    public  void  setAuther(String auther){
        this.auther = auther;


    }
}
