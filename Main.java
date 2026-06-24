public class Main{
   public static void main(String[] args){
    int[] numbers={3,4,9};
    System.out.println("一行目を入力してください");
    int input=new java.util.Scanner(System.in).nextInt();
    for(int value:numbers){
        if(value==input){
            System.out.println("あたり");
            break;

        }
        else
            System.out.println("はずれ");

    }

    }
        
}

