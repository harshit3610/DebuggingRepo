import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Employee> empList=new LinkedList<>();
        for(int i=0;i<3;i++){
            int id=sc.nextInt();
            double salary=sc.nextDouble();
            empList.add(new Employee(id));
        }
        empList.stream()
                .forEach(obj-> System.out.println(obj.calTax()));
    }

}