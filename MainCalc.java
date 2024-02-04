import java.util.*;

class MainCalc{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************** CALCULATOR *******************");

        String[] equations = new String[100];
        String equation;
        double answer = 0; 
        double num1 = 0;
        double num2 = 0;
        boolean Done = true;
        int doAgain;
        int index = -1;
        int eqHistory;

        do{
            index++;
            System.out.println("\nType 1 for Addition");
            System.out.println("Type 2 for Subtraction");
            System.out.println("Type 3 for Multiplacation");
            System.out.println("Type 4 for Divison");
            System.out.println("Type 5 for the Square of a number\n");

            System.out.print("Number: ");
        
            byte pref = scanner.nextByte();
            System.out.println();

            if(pref!=1 && pref!=2 && pref!=3 && pref!=4 && pref!=5){
                System.out.println("Invalid Answer");
                System.out.println("************************************************");
                answer=0;
                scanner.close();
                return;
            }
    
            else if(pref != 5){
                System.out.print("Enter your first number: ");
                num1 = scanner.nextDouble(); System.out.println();
                System.out.print("Enter your second number: ");
                num2 = scanner.nextDouble();
            }
            else if(pref == 5){
                System.out.print("Enter your number: ");
                num1 = scanner.nextDouble();
            }
    
            switch (pref) {
                case 1:
                    //Addition
                    answer = num1 + num2;
                    equation = num1 + " + " + num2 + " = " + answer;
                    equations[index] = equation;
                    break;
                case 2:
                    //Subtraction
                    answer = num1 - num2;
                    equation = num1 + " - " + num2 + " = " + answer;
                    equations[index] = equation;
                    break;
                case 3:
                    //Multiplacation
                    answer = num1 * num2;
                    equation = num1 + " * " + num2 + " = " + answer;
                    equations[index] = equation;
                    break;
                case 4:
                    //Divison
                    answer = num1 / num2;
                    equation = num1 + " / " + num2 + " = " + answer;
                    equations[index] = equation;
                    break;
                case 5:
                    //Square
                    answer = num1 * num1;
                    equation = num1 + " * " + num1 + " = " + answer;
                    equations[index] = equation;
                    break;
            }
    
            System.out.println("\nAnswer is: " + answer + "\n");
            
            System.out.println("Do you want to view your equation history?");
            System.out.print("Press 1 for yes and 2 for no: ");

            eqHistory = scanner.nextInt();

            System.out.println();
            
            switch (eqHistory) {
                case 1:
                    System.out.println("Equations: ");
                    for(String e : equations){
                        if(e != null){
                            System.out.println("\t" + e);
                        }
                    }
                    break;
                case 2:
                    break;
                default:
                System.out.println("Invalid Number (if invalid answer is no)");
                    break;
            }

            System.out.println("\nWould you like to do it again?");
            System.out.print("Type '1' for yes and '2' for no: ");

            doAgain = scanner.nextInt();

            if(doAgain == 1){
                Done=false;
                System.out.print("\33c");
                System.out.println("************************************************");
            }
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
