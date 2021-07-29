import java.util.Scanner;
class Book {
    public static void main(String[] args) {
        System.out.println( );
    }
    Scanner s = new Scanner(System.in);

    //Nested class for each entry
    class Entry {
        private String first;
        private String last;
        private String address;
        private String email;

        Entry(String first, String last, String address, String email) {
            this.first = first;
            this.last = last;
            this.address = address;
            this.email = email;
        }

        Entry() {
            first = "";
            last = "";
            address = "";
            email = "";
        }

        public void readEntry() {
            System.out.println("First Name:" + first);
            System.out.println("Last Name:" + last);
            System.out.println("Address:" + address);
            System.out.println("Email:" + email);
        }
    }


    //Keeps track of how many entries are in the book
    private int entries = 0;
    Entry[] contents;

    public void initEntries(int e) {
        contents = new Entry[e];
        for (int i = 0; i < contents.length; i++) {      //Initializes an array of entries, then loops through to initialize each individual entry
            contents[i] = new Entry();
        }
    }

    public int getEntries() {
        return contents.length;
    }

    //Adds an entry to the book
    public void add(String first, String last, String address, String email) {
        if (entries < contents.length) {
            contents[entries] = new Entry(first, last, address, email);
            entries++;
        } else System.out.println("Error: book is full");
    }
}


