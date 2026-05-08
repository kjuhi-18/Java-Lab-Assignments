public class DivisibiltyTest{
    public static void main(String[] args) {
        int n=1;
        while(n<=50){
            if(n%2==0){
                System.out.println(n+"Is divisible by 2");
            }
            if(n%3==0){
                System.out.println(n+"is divisible by 3");
            }
            if(n%5==0){
                System.out.println(n+"is divisible by 5");
            }
            n++;
        }
    }
}