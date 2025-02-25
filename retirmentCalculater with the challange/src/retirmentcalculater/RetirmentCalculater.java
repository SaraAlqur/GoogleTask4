package retirmentcalculater;
import java.util.Scanner;
import java.time.Year;
public class RetirmentCalculater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your current age? ");
        int age = in.nextInt();
        
        System.out.print("At what age would you like to retire? ");
        int RetirementAge = in.nextInt();
        if (age<0 || RetirementAge<age){
            System.out.println("you should already been retierd");
        } else {
        int yearsLeft = RetirementAge - age;
        int currentYear = Year.now().getValue();
        int RetirementYear = currentYear+yearsLeft;
        
        System.out.println("You have "+yearsLeft+" years left until you can retire \nIt's "+currentYear+", so you can retire in "+RetirementYear+".");
    } }
    
}
