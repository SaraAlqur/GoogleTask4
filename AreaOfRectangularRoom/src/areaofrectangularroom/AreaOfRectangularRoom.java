package areaofrectangularroom;
import java.text.DecimalFormat;
import java.util.*;

public class AreaOfRectangularRoom {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat("#.##");
       System.out.print("What is the length of the room in meter? ");
       double length = in.nextDouble();
       
       System.out.print("What is the width of the room in meter? ");
        double width = in.nextDouble();
        
         System.out.printf("you have enterd dimensions of %sm by %sm ",df.format(length),df.format(width)); 
        double AreaInsquareMeter =length * width;
        double AreaInsquareFeet=AreaInsquareMeter/0.09290304;
         System.out.printf("the area is \n%s square meter \n%s square feet",df.format(AreaInsquareMeter),df.format(AreaInsquareFeet));
       
    }
    
}
