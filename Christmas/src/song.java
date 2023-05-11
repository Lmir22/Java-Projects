import java.util.Scanner;
public class song
{
    public static void main(String[] args)
    {
        final int MAX = 12;
        int day_song = 0;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.print("Which day does the user start with (From 1 to 12)? ");
            day_song = input.nextInt();
        }
        while (day_song < 1 || day_song > 12);
        int c = 1;
        while (c <= day_song)
        {
            String ot = "ON THE ";
            String tru_luv = " DAY OF CHRISTMAS MY TRUE LOVE GAVE TO ME";
            String fir = "ST";
            String seco = "ND";
            String thi = "RD";
            String nums = "TH";
            switch (c)
            {
                case 1:
                {
                    System.out.println(ot + c + fir + tru_luv);
                    break;
                }
                case 2:
                {
                    System.out.println(ot + c + seco + tru_luv);
                    break;
                }
                case 3:
                {
                    System.out.println(ot + c + thi + tru_luv);
                    break;
                }
                case 4:
                {
                    System.out.println(ot + c + nums + tru_luv);
                    break;
                }
                case 5:
                {
                    System.out.println(ot + c + nums + tru_luv);
                    break;
                }
                case 6:
                {
                    System.out.println(ot + c + nums + tru_luv);
                    break;
                }
                case 7:
                {
                    System.out.println(ot + c + nums + tru_luv);
                    break;
                }
                case 8:
                {
                    System.out.println(ot + c + nums + tru_luv);
                    break;
                }
                case 9:
                {
                    System.out.println(ot + c + nums + tru_luv);
                    break;
                }
                case 10:
                {
                    System.out.println(ot + c + nums + tru_luv);
                    break;
                }
                case 11:
                {
                    System.out.println(ot + c + nums + tru_luv);
                    break;
                }
                case 12:
                {
                    System.out.println(ot + c + nums + tru_luv);
                    break;
                }
            }
            switch (c)
            {
                case 12:
                {
                    System.out.println("TWELVE DRUMMERS DRUMMING,");
                }
                case 11:
                {
                    System.out.println("ELEVEN PIPERS PIPING,");
                }
                case 10:
                {
                    System.out.println("TEN LORDS A-LEAPING,");
                }
                case 9:
                {
                    System.out.println("NINE LADIES DANCING,");
                }
                case 8:
                {
                    System.out.println("EIGHT MAIDS A-MILKING,");
                }
                case 7:
                {
                    System.out.println("SEVEN SWANS A-SWIMMING,");
                }
                case 6:
                {
                    System.out.println("SIX GEESE A-LAYING,");
                }
                case 5:
                {
                    System.out.println("FIVE GOLDEN RINGS,");
                }
                case 4:
                {
                    System.out.println("FOUR CALLING BIRDS,");
                }
                case 3:
                {
                    System.out.println("THREE FRENCH HENS,");
                }
                case 2:
                {
                    System.out.println("TWO TURTLE DOVES, AND");
                }
                case 1:
                {
                    System.out.println("A PARTRIDGE IN A PEAR TREE.\n\n");
                    break;
                }
            }
            c++;
        }
    }
}