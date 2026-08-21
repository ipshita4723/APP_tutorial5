class Employee{
     String name;
     int ID;
     double basic_salary;
    public double CalculateSalary(){
        return basic_salary;
    }
}
class professor extends Employee{
    public double CalculateSalary(){
        return basic_salary+10000;
    }
}
class admin extends Employee{
    public double CalculateSalary(){
        return basic_salary+3000;
    }
}
public class emp{
    public static void main(String[] arg){
        professor p=new professor();
        p.name="abc";
        p.ID=123;
        p.basic_salary=5000;
        admin a=new admin();
        a.name="def";
        a.ID=456;
        a.basic_salary=3000;
        System.out.println(p.name + " Salary: " + p.CalculateSalary());
        System.out.println(a.name + " Salary: " + a.CalculateSalary());
    }
}