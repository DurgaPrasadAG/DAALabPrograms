import java.util.*;

class CustomerInfo {
  String name, d_o_b; 

  CustomerInfo() {
    var s = new Scanner(System.in);
    System.out.print("Enter Customer Name : ");
    name = s.nextLine();
    System.out.print("Enter Date of birth in dd/mm/yyy format : ");
    d_o_b = s.nextLine();
  }

  void display() {
    var stk = new StringTokenizer(d_o_b, "/");
    System.out.println("\n<Customer details>");
    System.out.println("Customer Name : " + name);
    System.out.print("Date of birth in dd mm yyyy form : ");

    while (stk.hasMoreTokens()) {
      System.out.print(stk.nextToken() + " ");
    }
  }
}

class Customer {
  public static void main(String[] args) {
    var ci = new CustomerInfo();
    ci.display();
  }
}