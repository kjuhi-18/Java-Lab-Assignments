public class DivisibiltyTest2{
    public static void main(String[] args) {
        int n=1;
        while(n<=100){
            if((n%2==0) & (n%3==0) & (n%5==0)){
                System.out.println(n+" is divisible by 2,3,5");
            }
            
            n++;
        }
    }
}