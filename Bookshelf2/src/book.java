public class book
{
    private String ti_tle, aut_hor, publ_isher, copy_right;

    public book (String title, String author, String publisher, String copyright)
    {
        ti_tle = title;
        aut_hor = author;
        publ_isher = publisher;
        copy_right = copyright;

    }

    public String getTi_tle() { return ti_tle; }
    public String getAut_hor() { return aut_hor; }
    public String getPubl_isher() { return publ_isher; }
    public String getCopy_right() { return copy_right; }


    public void setTi_tle(String ti_tle) { this.ti_tle = ti_tle; }
    public void setAut_hor(String aut_hor) { this.aut_hor = aut_hor; }
    public void setPubl_isher(String publ_isher) { this.publ_isher = publ_isher; }
    public void setCopy_right(String copy_right) { this.copy_right = copy_right; }

    public String toString()
    {
        return "Book Title: " + ti_tle + "\n" + "Book Author: " + aut_hor + "\n"
                + "Book Publisher: " + publ_isher + "\n" + "Book Copyright: " + copy_right
                + "\n\n";
    }
    }


