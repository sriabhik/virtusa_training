package Interface_abs_Exception_Handling;
import java.util.Scanner;
interface Product{
    void ProductDetails();
    void show_Bill();
}
class Customer{
    Scanner sc = new Scanner(System.in);
    void getDetail(){
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int id = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            int item = sc.nextInt();
            int total = 0;
            while(item-- != 0){
                sc.nextLine();
                String i_n = sc.nextLine();
                int cost = sc.nextInt();
                total += cost;
            }
            showDetail(id,name,total);
        }

    }
    void showDetail(int id,String n,int Bill){
        System.out.println("ID:"+id);
        System.out.println("NAME:"+n);
        System.out.println("Bill:"+Bill);
    }
}
public class Product_Class_7 extends Customer implements Product{
    public void ProductDetails(){}
    public void show_Bill(){}
    public static void main(String[] args) {
        Customer c = new Customer();
        c.getDetail();
    }
}
