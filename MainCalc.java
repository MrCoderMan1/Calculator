import java.util.Scanner;

class MainCalc{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************** CALCULATOR *******************");

        double answer = 0; 
        double num1 = 0;
        double num2 = 0;
        boolean Done = true;
        int doAgain;

        do{
            System.out.println("\nType 1 for Addition");
            System.out.println("Type 2 for Subtraction");
            System.out.println("Type 3 for Multiplacation");
            System.out.println("Type 4 for Divison");
            System.out.println("Type 5 for the Square of a number\n");

            System.out.print("Number: ");
        
            byte pref = scanner.nextByte();

            if(pref!=1 && pref!=2 && pref!=3 && pref!=4 && pref!=5){
                System.out.println("Invalid Answer");
                System.out.println("************************************************");
                answer=0;
                scanner.close();
                return;
            }
    
            else if(pref != 5){
                System.out.print("Enter number 1: ");
                num1 = scanner.nextDouble(); System.out.println();
                System.out.print("Enter number 2: ");
                num2 = scanner.nextDouble(); System.out.println();
            }
            else if(pref == 5){
                System.out.print("Enter your number: ");
                num1 = scanner.nextDouble();
            }
    
            switch (pref) {
                case 1:
                    //Addition
                    answer = num1 + num2;
                    break;
                case 2:
                    //Subtraction
                    answer = num1 - num2;
                    break;
                case 3:
                    //Multiplacation
                    answer = num1 * num2;
                    break;
                case 4:
                    //Divison
                    answer = num1 / num2;
                    break;
                case 5:
                    //Square
                    answer = num1 * num1;
                    break;
            }
    
            System.out.println("\nAnswer is: " + answer);
            
            System.out.println("\nWould you like to do it again?");
            System.out.println("Type '1' for yes and '2' for no");

            doAgain = scanner.nextInt();

            if(doAgain == 1){Done=false;}
            else if(doAgain == 2){Done=true;}
            else if(doAgain != 2 && doAgain != 1){
                System.out.println("Invalid response, bye!");
                System.out.println("************************************************");
                scanner.close();
                return;
            }
            pref=0;
        }while(Done==false);
        
        scanner.close();
        System.out.println("************************************************");
    }
}