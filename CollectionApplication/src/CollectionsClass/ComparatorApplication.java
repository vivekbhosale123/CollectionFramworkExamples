package CollectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Customer{

    private int custId;

    private String custName;

    private int custAge;

    public Customer(int custId, String custName, int custAge) {
        this.custId = custId;
        this.custName = custName;
        this.custAge = custAge;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public int getCustAge() {
        return custAge;
    }

    public void setCustAge(int custAge) {
        this.custAge = custAge;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custAge='" + custAge + '\'' +
                '}';
    }
}

class NameComparator implements Comparator<Customer>
{
    @Override
    public int compare(Customer o1, Customer o2) {
        return o1.getCustName().compareTo(o2.getCustName());
    }
}

class AgeComparator implements Comparator<Customer>
{

    @Override
    public int compare(Customer o1, Customer o2) {
      if(o1.getCustAge()==o2.getCustAge())
      {
          return 0;
      } else if (o1.getCustAge() > o2.getCustAge()) {
          return 1;
      }else {
          return -1;
      }
    }
}

public class ComparatorApplication {

    static void main(String[] args) {

        List<Customer> list=new ArrayList<>();

        list.add(new Customer(1,"ram",18));
        list.add(new Customer(2,"ganesh",15));
        list.add(new Customer(3,"ajay",19));
        list.add(new Customer(4,"ramesh",17));

        System.out.println("####### NAME COMPARATOR ##################");
        Collections.sort(list,new NameComparator());
        list.forEach(System.out::println);



        System.out.println("####### Age COMPARATOR ##################");
        Collections.sort(list,new AgeComparator());
        list.forEach(System.out::println);
    }

}
