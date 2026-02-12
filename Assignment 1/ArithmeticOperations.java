import java.util.Scanner;

public class ArithmeticOperations {
    public int n1,n2;
    public int addnums(int n1,int n2){
        return n1+n2;
    }
    public int subnums(int n1,int n2){
        return n1-n2;
    }
    public long mulnums(int n1,int n2){
        return n1*n2;
    }
    public float divnums(int n1,int n2){
        return n1/n2;
    } 
    public int modulus(int n1,int n2){
        return n1%n2;
    } 
    public static void main(String[] args) {
        ArithmeticOperations op = new ArithmeticOperations();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        op.n1=scan.nextInt();
        System.out.println("Enter second number:");
        op.n2=scan.nextInt();

        //int sum=op.addnums(op.n1, op.n2);
        int diff=op.subnums(op.n1, op.n2);
        long mul=op.mulnums(op.n1, op.n2);
        float div=op.divnums(op.n1, op.n2);
        int mod=op.modulus(op.n1, op.n2);
        System.out.println("Difference:"+diff+" "+"Product:"+mul+" "+"Division:"+div+" "+"Modulus:"+mod);
        System.out.println("Sum of the numbers:" + op.addnums(op.n1,op.n2));
        scan.close();




 

        




    }

}