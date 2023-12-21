public class Employee {
    private String fio;
    private int department;
    private double salary;
    static int counter;
    private int id;
    public Employee(String fio, int department, double salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }
    public String getFio() {
        return this.fio;
    }
    public int getDepartment() {
        return this.department;
    }
    public double getSalary() {
        return this.salary;
    }
    public int getId() {
        return this.id;
    }
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "fio='" + fio + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Employee[] employee = new Employee[10];
        employee[0] = new Employee(" Иванов Сергей Иванович   ", 1, 15000);
        employee[1] = new Employee(" Смирнов Сергей Анатольевич   ", 2, 20000);
        employee[2] = new Employee(" Назарова Любовь Юрьевна   ", 3, 25000);
        employee[3] = new Employee(" Сидоров Константин Константинович   ", 4, 29000);
        employee[4] = new Employee(" Петров Сергей Николаевич   ", 5, 29900);
        employee[5] = new Employee(" Костин Андрей Сергеевич   ", 1, 16000);
        employee[6] = new Employee(" Емельянов Евгений Васильевич  ", 2, 18000);
        employee[7] = new Employee(" Сорокина Галина Серьгеевна  ", 3, 21000);
        employee[8] = new Employee(" Елисеева Светлана Викторовна   ", 3, 12000);
        employee[9] = new Employee(" Тарасова Раиса Михайловна   ", 5, 22000);
        for (Employee e : employee) {
            System.out.println(e);

            System.out.println(calculateTheAmountOfSalaryCostsPerMonth(employee));


        }

        findAnEmployeeWithTheMinimumWage(employee);

        findTheEmployeeWithTheHighestSalary(employee);
        calculateTheAverageSalary(employee);
        getTheFullNameOfAllEmployees(employee);



    }


    public static int calculateTheAmountOfSalaryCostsPerMonth(Employee[] employee) {
        int sum = 0;
        for (Employee e : employee) {
            sum += e.getSalary();
        }

        return sum;
    }


    public static void findAnEmployeeWithTheMinimumWage(Employee[] employee) {
        Employee result = new Employee(" ", 0, Integer.MAX_VALUE);
        for (Employee e : employee) {
            if (employee[0] != null && e.getSalary() < result.getSalary()) {
                result = e;


            }

        }
        System.out.println("Сотрудник с минимальной заработной платой -" + result.getFio());
    }


    public static void findTheEmployeeWithTheHighestSalary(Employee[] employee) {
        Employee result = new Employee("  ", 0, 0);
        for (Employee e : employee) {
            if (employee[0] != null && e.getSalary() > result.getSalary()) {
                result = e;


            }

        }
        System.out.println("Сотрудник с максимальной заработной платой -" + result.getFio());
    }

    public static void calculateTheAverageSalary(Employee[] employee) {
        double sum = 0;
        for (Employee e : employee) {
            sum += e.getSalary();
        }
        double averageSalary = sum / 10;

        System.out.println("Среднее значение зарплат " + averageSalary + " руб");
    }


    public static void getTheFullNameOfAllEmployees(Employee[] employee) {
        for (Employee e : employee) {
            System.out.println(e.getFio());
        }
    }



}

