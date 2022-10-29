package BookLibary;

public class Book {
    private Integer index;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String code;
    public String name;
    public String author;
    public String nxb;
    public String type;
    public Integer price;
    public Integer qty;


    public Book() {
    }

    public Book(String code, String name, String author, String nxb, String type, Integer price, Integer qty) {
        this.code = code;
        this.name = name;
        this.author = author;
        this.nxb = nxb;
        this.type = type;
        this.price = price;
        this.qty = qty;

    }





    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNxb() {
        return nxb;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "code='" +this.getCode() + '\'' +
                ", name='" +this.getName() + '\'' +
                ", author='" +this.getAuthor() + '\'' +
                ", nxb='" +this.nxb + '\'' +
                ", type='" +this.type + '\'' +
                ", price=" +this.getPrice() +
                ", qty=" +this.getQty() +
                '}';
    }
}
