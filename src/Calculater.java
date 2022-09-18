public class Calculater {
    public static void main(String[] args) {
        Employee emp=new Employee("Kemal", 2000.0,45,1985);

        System.out.println(emp.toString());
        if(emp.salary<1000){
            System.out.println("Your task: "+"You don't have to pay tax");
        }else {
            System.out.println("Your task: " + emp.tax());
        }

        System.out.println("Your bonus: "+emp.bonus());
        System.out.println("Your rice salary : "+ emp.riceSalary());
        System.out.print("Your total salary: ");
        emp.total();

    }
}
