package unnathi.assignment.assignment4;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;
import java.text.SimpleDateFormat;
public class KYC {
    public static void printRange(String date1,String date2){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate signUpDate = LocalDate.parse(date1, df);
        LocalDate currentDate = LocalDate.parse(date2, df);
        LocalDate currentAnniversary = signUpDate;
        currentAnniversary = currentAnniversary.withYear(currentDate.getYear());
        LocalDate startDate = currentAnniversary.minusDays(30);
        LocalDate endDate = currentAnniversary.plusDays(30);
        if (endDate.isAfter(currentDate)) {
            endDate = currentDate;
        }
        if (currentDate.getYear() <= signUpDate.getYear()) {
            System.out.println("No Range");
        } else {
            System.out.println(startDate + " " + endDate);
        }
    }
    public static void main(String[] args)throws Exception{
        //Date signUpDate=new SimpleDateFormat("dd-MM-yyyy").parse(date1);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no. of queries:");
        int t=scanner.nextInt();
        scanner.nextLine();
        while (t > 0) {
            System.out.println("Enter SignUp date :");
            String date1 = scanner.nextLine();
            System.out.println("Enter Current date :");
            String date2 = scanner.nextLine();
            printRange(date1,date2);
            t--;
        }
    }
}
