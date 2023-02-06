public class Order {
    private long id;// уникальный номер
    private long customorId;// кому продали
    private long employeeId;// кто  продавец
    private long[] books; //  список номеров книги которые продали

    public Order(long id, long employeeId, long customorId, long[] books) {
        this.id = id;
        this.customorId = customorId;
        this.employeeId = employeeId;
        this.books = books;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCustomorId() {
        return customorId;
    }

    public void setCustomorId(long customorId) {
        this.customorId = customorId;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public long[] getBooks() {
        return books;
    }

    public void setBooks(long[] books) {
        this.books = books;
    }
}
