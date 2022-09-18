import java.util.Date;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    public  Employee(String name,double salary,double workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double tax(){
        if (this.salary<1000){
            return 0.00;

        }

        return  this.salary*0.03;
    }
    public double bonus(){
        if(this.workHours>=40){
            return (this.workHours-40)*30;
        }
        return 0.00;
    }

    public double riceSalary(){
        if ((2021-this.hireYear)<10){
            return  this.salary*0.05;
        }else if((2021-this.hireYear)>9 && (2021-this.hireYear)<20){
            return this.salary*0.1;
        } else if ((2021-this.hireYear)>19) {
           return this.salary*0.15;
        }return 0.00;
    }

    public void total(){
        System.out.println(this.salary-tax()+bonus()+riceSalary());
    }

    @Override
    public String toString() {
        return  "Name: " + name + '\n' +
                "Salary: " + salary +'\n' +
                "Work Hours: " + workHours +'\n' +
                "Hire Year: " + hireYear ;
    }
}
