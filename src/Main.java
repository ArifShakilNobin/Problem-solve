import java.io.BufferedReader;
import java.io.IOException;

//TODO: use -----> When a class doesn't know what sub-classes will be required to create
//TODO: use -----> When a class wants that its sub-classes specify the object to be created
//TODO: use -----> When the parent class is responsible for creating the objects of its sub-classes

public class Main {
    public static void main(String[] args) {
        GetPlanFactory getPlanFactory = new GetPlanFactory();

        System.out.print("Enter the name of plan for which the bill will be generated: ");
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        try {
            String planName = br.readLine();
            System.out.print("Enter the number of units for bill will be calculated: ");
            int units = Integer.parseInt(br.readLine());
            Plan plan = getPlanFactory.getPlan(planName);
            System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");
            plan.getRate();
            plan.calculateBill(units);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}