package EBebek;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) throws NameException {
        NameException.CustomPart.Validate(name);
        if (salary <= 0 || hireYear < 0 || workHours <= 0 || !name.matches("[A-Za-z]")) {

        }

        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    public double tax() {
        if (salary > 1000) {
            return salary * 0.03;
        }
        return 0;
    }


    public int bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }


    public double raiseSalary() {
        double netSalary = salary - tax() + bonus();

        if ((2021 - hireYear) < 10) {
            return netSalary * 0.05;
        } else if ((2021 - hireYear) > 9 && (2021 - hireYear) < 20) {
            return netSalary * 0.1;
        } else {
            return netSalary * 0.15;

        }
    }


    @Override
    public String toString() {
        return "Adı : " + name + "\n" +
                "Maaşı : " + salary + "\n" +
                "Çalışma Saati : " + workHours + "\n" +
                "Başlangıç Yılı : " + hireYear + "\n" +
                "Vergi :  " + tax() + "\n" +
                "Bonus : " + bonus() + "\n" +
                "Maaş Artışı : " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + (salary + bonus() - tax()) + "\n" +
                "Toplam Maaş : " + (salary + bonus() - tax() + raiseSalary());
    }

}