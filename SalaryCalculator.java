import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<Employee> empList=new LinkedList<>();
        for(int number=0;number<3;number++){
            int id=scanner.nextInt();
            double salary=scanner.nextDouble();
            empList.add(new Employee(id));
        }
        empList.stream()
                .forEach(object-> System.out.println(object.calTax()));
    }

}
