class Library_item{
    private int id;
    String title;
    int year;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;

    }
}
class Book extends Library_item{
    String author;

}
class Magazine extends Library_item{
    int issue;
}
class Main{
    public static void main(String[] args) {

        Book book=new Book();
        Magazine magazine=new Magazine();

        magazine.setId(100);
        magazine.title="Harry potter";
        magazine.year=1997;
        magazine.issue=1;

        book.author="J.K.Rowling";

        System.out.println(magazine.getId());
        System.out.println(magazine.title);
        System.out.println(magazine.year);
        System.out.println(magazine.issue);

        System.out.println(book.author);
    }
}