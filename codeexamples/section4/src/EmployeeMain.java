public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
//        employee.firstName = "John";
//        employee.lastName = "Doe";
//        employee.age = 30;
//        employee.gender = 'M';

        System.out.println(employee1.getAge());
        System.out.println(employee1.getGender());

        System.out.println(employee2.getAge());
        System.out.println(employee2.getGender());

    }

}
