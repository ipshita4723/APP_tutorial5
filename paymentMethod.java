import java.util.Scanner;
interface payment{
    void makepayment();
}
class UPI implements payment{
    public void makepayment(){
        System.out.println("payment made using UPI");
    }
}
class credit implements payment{
    public void makepayment(){
        System.out.println("payment made using credit card");
    }
}
class netbanking implements payment{
    public void makepayment(){
        System.out.println("payment made using netbanking");
    }
}
public class paymentMethod{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        payment mypayment=null;
        System.out.println("enter choice:\n 1.UPI\n2.credit card\n3.netbanking\n");
       int choice=sc.nextInt();
       if(choice==1){
        mypayment= new UPI();
       } 
       else if (choice==2){
        mypayment=new credit();
       }
       else if(choice==3){
        mypayment=new netbanking();
       }
       else{
        System.out.println("invalid");
       }
       mypayment.makepayment();
    }
}