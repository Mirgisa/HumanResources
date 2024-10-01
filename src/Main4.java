//Create Person class, it should have name, age, username, password.
//Override toString function to just print name and age in a good format.
//Override equals function to check username and password.

import java.util.Objects;

public class Main4 {
    public static void main(String[] args) {

        Person4 person1 = new Person4("Jack ", 24 , "JackMwisa", "1234");
        Person4 person2 = new Person4("Sam ", 21 , "SamNeema", "5678");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println("person1 equals person2: " + person1.equals(person2));

        // CUSTOMER OBJ
        Customer4 customer1 = new Customer4("AliceBahi", 23, "alice23", "2332", 1000.0);
        System.out.println(customer1);

        //Manager OBj
        Manager4 manager1 = new Manager4("mirgisa ",28,"mirgisakitata","001",333);
        Manager4 manager2 = new Manager4("Wafi ",27,"wafi@11","12345",643);
        System.out.println(manager1);
        System.out.println(manager2);
        System.out.println("manager1 equals manager2? " + manager1.equals(manager2));
    }

}
class Person4 {
    String name;
    int age;
    String userName;
    String password;

    public Person4(String name, int age, String userName, String password) {
        this.name = name;
        this.age = age;
        this.userName = userName;
        this.password = password;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "name: "+ name + "age: " +age;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person4 person4 = (Person4) o;
        return Objects.equals(userName, person4.userName) && Objects.equals(password, person4.password);
    }


    @Override
    public int hashCode() {
        return Objects.hash(userName, password);
    }

}
class Customer4 extends Person4 {
    final int customerID;
    private double balance;

    public Customer4(String name, int age, String userName, String password, double balance) {
        super(name, age, userName, password);
        this.balance = balance;
        this.customerID = (int) (1000000 * Math.random());
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getCustomerID() {
        return customerID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerID=" + customerID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Customer4 customer = (Customer4) o;
        return super.equals(o) ||
                (customerID == customer.customerID && password.equals(customer.password));
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), customerID);
    }
}
class Manager4 extends Person4{
    private final int managerId;
    private int actionNumber =0;


    public Manager4(String name, int age, String userName, String password, int actionNumber) {
        super(name, age, userName, password);
        this.actionNumber = actionNumber;
        this.managerId = (int) (1000000 * Math.random());

    }

    public int getActionNumber() {
        return actionNumber;
    }

    public void setActionNumber(int actionNumber) {
        this.actionNumber = actionNumber;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "Name = " + name+
                "managerId=" + managerId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager4 manager = (Manager4) o;
        //return managerId == manager.managerId;
        return super.equals(o) ||
                (managerId == manager.managerId && password.equals(manager.password));
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), managerId);
    }
}
//Create Manager class, it should extend Person, it should have extra managerId (auto generate) and actionNumber( set zero when you created the object so it should assign 0 in the constructor)
//
////        Required extra functions: getActionNumber, setActionNumber and getManagerID
//
////        Overide toString again and print extra managerID
//override equals function and check if username and password matchs or managerIDand password match.  IF any of cases are correct we will return true.







//Create Customer class, it should extend Person  class and it should have extra customerID(auto genarate we will not have it on constructor) and balance.
//
//Required extra functions: getBalance, setBalance and getCustomerID
//
//Overide toString again and print extra customerID
//override equals function and check if username and password matchs or customerID and password match.  IF any of cases are correct we will return true.