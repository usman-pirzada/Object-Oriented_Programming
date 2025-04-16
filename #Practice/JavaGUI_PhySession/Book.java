package JavaGUI_PhySession;

class Book extends Item  {
    private int pubYear;

    public Book(String title, String author, String isbn, int pubYear) {
        super(title, author, isbn);
        this.pubYear = pubYear;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + ", Author: " + getAuthor() + ", ISBN: " + getIsbn() + ", Publication Year:" + pubYear;
    }
}
