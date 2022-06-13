import java.util.Objects;
public class Employee {
    private String employeeName;// конструкция для ввода данных сотрудника
    private String employeeSurname;

    private int id;
    private int department;
    private int Salary;
    private static int count = 0;

    public Employee(String employeeSurname, String employeeName, int department, int Salary) {//Конструктор для заполнения всех полей
        this.employeeSurname = employeeSurname;
        this.employeeName = employeeName;
        this.Salary = Salary;
         this.id = ++count;
         this.department = department;
    }




        //Геттеры для всех полей
        public String getEmployeeSurname () {
            return this.employeeSurname;
        }

        public String getEmployeeName () {
            return this.employeeName;
        }

        public int getDepartment () {
            return department;
        }

        public int getSalary () {
            return this.Salary;
        }

        public int getId () {
            return id;
        }

//Сеттеры для отдела и ЗП
        public void setDepartment ( int department){
            this.department = department;
        }
        public void setSalary ( int Salary){
            this.Salary = Salary;
        }
        //ту стринг
        @Override
        public String toString () {
            return "Employee name is - " + this.employeeSurname + " " + this.employeeName + "." +
                    "\nEmployee department is " + getId() + "\nEmployee salary is " + this.Salary + "$" + "\n===============\n";

        }

        @Override
        public boolean equals (Object other){
            if (this.getClass() != other.getClass() || other == null) {
                return false;
            }

            Employee employee = (Employee) other;
            return this.employeeName.equals(employeeName) && this.employeeSurname.equals(employee.employeeSurname);

        }

        @Override
        public int hashCode () {
            return Objects.hash(this.employeeSurname, this.employeeName);
        }//проверка через хэш


    }

