public class DivisibleByAndSum {

    public static void main(String[] args) {

        int num = 6;
        int sum = 0;

        for(int i=1; i<=num; i++){
            if (num%i == 0){
                System.out.print("i  here is " + i + "\n");
                sum += i;
            }
        }
        System.out.println("the sum is: " + sum + "\n");

        System.out.println("Yay!! Feels great On Gitty");
    }
}
