import java.util.Objects;
public class Employee {
    private String employeeName;// конструкция для ввода данных сотрудника
    private String employeeSurname;
    private  int Department;
    private int Salary;

    public Employee (String employeeSurname, String employeeName, int Department, int Salary) {//Конструктор для заполнения всех полей
        this.employeeSurname = employeeSurname;
        this.employeeName = employeeName;
        this.Department = Department;
        this.Salary = Salary;
    }

    public static void Department (String[] args) {//количество отделов
        int[] department = new int [5];
        for (int id = 0; id < department.length; id++) {// счетчик id

        }
    }
    //Геттеры для всех полей
    public String getEmployeeSurname() {
        return this.employeeSurname;
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public int getDepartment() {
        return this.Department;
    }

    public int getSalary() {
        return this.Salary;
    }
//Сеттеры для отдела и ЗП
    public void setDepartment(int Department) {
        this.Department = Department;
    }
    public void setSalary(int Salary) {
        this.Salary = Salary;
    }
    //ту стринг
    @Override
    public String toString() {
        return "Employee name is - " + this.employeeSurname + " " + this.employeeName + "." +
                "\nEmployee department is " + this.Department + "\nEmployee salary is " + this.Salary + "\n===============\n";

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

