import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);

        System.out.println("1つ目の数字を入力");
        double num1 = scanner.nextDouble();

        System.out.println("2つ目の数字を入力");
        double num2 = scanner.nextDouble();     
        
        System.out.println("演算子を入力");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch(operator){
            case'+':
                result = num1 +num2;
                break;
            case'-':
                result = num1 - num2;
                break;
             case'*':
                result = num1 * num2;
                break;
            case'/':
                if(num2==0){
                    System.out.println("無効です");
                    break;
                }
                result = num1 /  num2;
                break;          

            default:
                System.out.println("無効な演算です");
                return;


        }
            System.out.println("結果: "+result);

            scanner.close();
    }
}