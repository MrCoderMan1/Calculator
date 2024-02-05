import java.util.*;

class MainCalc{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************** CALCULATOR *******************");

        final double PI = 3.141;
        String[] equations = new String[100];
        String equation;
        double answer = 0; 
        double num1 = 0;
        double num2 = 0;
        boolean Done = true;
        int doAgain;
        int index = -1;
        int eqHistory;
        byte pref;

        do{
            index++;
            System.out.println("\nType 1 for Addition");
            System.out.println("Type 2 for Subtraction");
            System.out.println("Type 3 for Multiplacation");
            System.out.println("Type 4 for Divison");
            System.out.println("Type 5 for the Square of a number\n");

            System.out.println("Type 6 to find area of a shape.\n");

            System.out.println("Type 7 to find area / circumference / diameter of a circle.\n");


            System.out.print("Number: ");
        
            byte firstPref = scanner.nextByte();
            System.out.println();

            if(firstPref!=1 && firstPref!=2 && firstPref!=3 && firstPref!=4 && 
            firstPref!=5 && firstPref!=6 && firstPref!=7){
                System.out.println("Invalid Answer");
            }
    
            else if(firstPref != 5 && firstPref!=6 && firstPref!=7){
                System.out.println("Enter your first number: ");
                num1 = scanner.nextDouble(); System.out.println();
                System.out.print("Enter your second number: ");
                num2 = scanner.nextDouble();
            }
            else if(firstPref == 5){
                System.out.print("Enter your number: ");
                num1 = scanner.nextDouble();
            }
    
            switch (firstPref) {
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
                    answer = Math.pow(num1, 2);
                    equation = num1 + " ^ 2 = " + answer;
                    equations[index] = equation;
                    break;
                case 6:
                    System.out.println("Enter 1 for triangle or type 2 for square");
                    pref = scanner.nextByte();

                    //Area
                    switch (pref) {
                        case 1:
                            System.out.println("Enter side 1: ");
                            num1 = scanner.nextDouble();
                            System.out.println("Enter side 2: ");
                            num2 = scanner.nextDouble();
                            
                            answer = (num1*num2)/2;
                            equation = num1 + " * " + num2 + " / 2 " + " = " + answer + 
                            " For triangle area";
                            equations[index] = equation;
                            break;
                        case 2:
                            System.out.println("Enter side 1: ");
                            num1 = scanner.nextDouble();
                            
                            answer = Math.pow(num1, 2);
                            equation = num1 + " ^ 2 = " + answer + " For area of square";
                            equations[index] = equation;
                            break;
                        
                        default:
                            System.out.println("Invalid number.");
                            break;
                    }
                    case 7:
                        //Circle circumference, diameter, and area
                        System.out.println("Type 1 for area, 2 for circumference, and 3 for diameter");

                        pref = scanner.nextByte();
                        switch (pref) {
                            case 1:
                                System.out.println("Enter radius of your circle: ");
                                num1 = scanner.nextDouble();

                                answer = Math.pow(num1, 2) * PI;
                                equation = num1 + " ^ 2 * PI(3.141) = " +  answer + " For area of circle";
                                equations[index] = equation;
                                break;
                            case 2:
                                System.out.println("Enter radius of your circle: ");
                                num1 = scanner.nextDouble();

                                answer = 2 * (PI * num1);
                                equation = "(" + num1 + " * PI) * 2 = " + answer + " For the circumference";
                                equations[index] = equation;
                                break;
                            case 3:
                                System.out.println("Enter radius of your circle: ");
                                num1 = scanner.nextDouble();

                                answer = num1 * 2;
                                equation = num1 + " * 2 = " + answer + " For the diameter";
                                equations[index] = equation;
                                break;
                        
                            default:
                                System.out.println("Invalid number");
                                break;
                }
            }
    
            System.out.println("\nAnswer is: " + answer + "\n");
            
            System.out.println("Do you want to view your equation history?");
            System.out.print("Type 1 for yes and 2 for no: ");

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
