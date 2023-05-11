public class bookshelf {
    public static void main(String[] args)
    {
        book bk1, bk2, bk3, bk4;

        bk1 = new book("Fire & Blood", "George R. R. Martin",
                "Bantam Books", "November 20, 2018");

        bk2 = new book("Kingdom of Ash", "Sarah J. Maas",
                "Bloomsbury Publishing", "October 08, 2019");

        bk3 = new book("Diary of a Wimpy Kid", "Jeff Kinney",
                "Amulet Books", "April 01, 2007");

        bk4 = new book("Twilight", "Stephenie Meyer",
                "Little, Brown and Company", "October 05, 2005");

        System.out.println(bk1);
        System.out.println(bk2);
        System.out.println(bk3);
        System.out.println(bk4);
    }
}
