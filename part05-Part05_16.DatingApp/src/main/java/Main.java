
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate date1 = new SimpleDate(5, 5, 2020);
        SimpleDate date2 = new SimpleDate(30, 9, 2023);
        SimpleDate date3 = new SimpleDate(30, 12, 2025);
        
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println("");
        
        date1.advance();
        date2.advance(62);
        date3.advance(367);
        
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is " + date);
        
        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week = week + 1;
        }


        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
        System.out.println("Try " + date.afterNumberOfDays(790));
    }
}
