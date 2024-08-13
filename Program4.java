//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)



//Paste console output below:
/*


*/
import java.util.Scanner; //This imports the console scanner that reads user input
public class Program4{
    public static void main(String[] args){
        //Make a scanner
        Scanner myScanner = new Scanner(System.in);
        
        //Create my variables
        int varOne = 475;
        int varTwo = 821;
        int varThree = 369;
        int varFour = 562;
        int varFive = 0;
        double varSix = 0;
        
        //Ask for user input
        System.out.println("Please enter the first variable");
        //Get input
        varOne = myScanner.nextInt();
        
        System.out.println("Please enter the second variable");
        //Get input
        varTwo = myScanner.nextInt();
        
        System.out.println("Please enter the third variable");
        //Get input
        varThree = myScanner.nextInt();
        
        System.out.println("Please enter the fourth variable");
        //Get input
        varFour = myScanner.nextInt();
        
        //Calculate
        varFive = varOne + varTwo + varThree + varFour;
        varSix = varFive/5;
        
        
        //System.out.println("Please enter the second variable");
        //System.out.println("Please enter the third variable");
        //System.out.println("Please enter the fourth variable");
        //System.out.println("Please enter the fifth variable");
        

        
        
        System.out.println("The first variable is: " + varOne);
        System.out.println("The second variable is: " + varTwo);
        System.out.println("The third variable is: " + varThree);
        System.out.println("The fourth variable is: " + varFour);
        System.out.println("The fifth variable is: " + varFive);
        System.out.println("The sixth variable is: " + varSix);
    }
}
