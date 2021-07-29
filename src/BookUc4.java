import java.util.Scanner;
class BookUc4 {
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

    //Removes an entry from the book
    public void remove(int entry) {
        if (entries > 0) {
            contents[entry] = new Entry();
            for (int i = 0; i < entries - entry; i++) {
                if (entry + 1 == entries) contents[entry] = new Entry();
                else {
                    Entry temp = contents[entry + i];
                    contents[entry + i] = contents[entry + i + 1]; //Removes an entry end moves each entry after it one backwards.
                    contents[entry + i + 1] = temp;
                }
            }
            entries--;
        } else System.out.println("Error: book is empty.");
    }
}

