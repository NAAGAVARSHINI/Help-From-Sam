import java.util.Scanner;

public class HelpCount {
    static int count(int n){
        int helpCount=1;
        while(n>0){
            helpCount++;
            n-=helpCount;
        }
        return helpCount-1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }
}
