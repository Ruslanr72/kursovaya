import java.util.Objects;
public class Employee {
    private String employeeName;// конструкция для ввода данных сотрудника
    private String employeeSurname;

    private int department;
    private int Salary;

    public Employee (String employeeSurname, String employeeName, int department, int Salary) {//Конструктор для заполнения всех полей
        this.employeeSurname = employeeSurname;
        this.employeeName = employeeName;
        this.Salary = Salary;
        this.department = department;
    }

    public static void Department  (String[] args) {//количество отделов
        int[] Department = new int [5];
        for (int id = 0; id < Department.length; id++) {// счетчик id

        }
    }
    //Геттеры для всех полей
    public String getEmployeeSurname() {
        return this.employeeSurname;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public int getDepartment(){return department;}

    public int getSalary() {
        return this.Salary;
    }

//Сеттеры для отдела и ЗП
    public void setDepartment(int department) {
        this.department = department;
    }
    public void setSalary(int Salary) {
        this.Salary = Salary;
    }
    //ту стринг
    @Override
    public String toString() {
        return "Employee name is - " + this.employeeSurname + " " + this.employeeName + "." +
                "\nEmployee department is " + this.department + "\nEmployee salary is " + this.Salary + "\n===============\n";

    }
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass() || other == null) {
            return false;
        }

        Employee employee = (Employee) other;
        return this.employeeName.equals(employeeName) && this.employeeSurname.equals(employee.employeeSurname);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.employeeSurname, this.employeeName);}//проверка через хэш




    }

