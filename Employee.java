package hotelmanagement2;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    String name, email, password;

    public Employee(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", email=" + email + ", password=" + password + '}';
    }

    public static Comparator<Employee> compareName = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Employee> compareEmail = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getEmail().compareTo(o2.getEmail());
        }
    };
    public static Comparator<Employee> comparePassword = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getPassword().compareTo(o2.getPassword());
        }
    };

    public void callEmployees() {
        System.out.println(name + "\n");
    }

    public void hello() {
        System.out.println(name.equals("Kristian Saomi") && name.equals("Jennifer Saomi") && name.equals("Mikaela Ceylan"));
    }

    @Override
    public int compareTo(Employee o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
