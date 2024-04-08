import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
  class EmployeeList {
      private List<Employee> e;
      public EmployeeList() {
          this.e = new ArrayList<>();
          e.add(new Employee("Harry", "Potter", 007, LocalDate.of(1980, 7, 31), 300000, "IT"));
          e.add(new Employee("Ron", "Weasley", 12, LocalDate.of(1980, 3, 1), 1900, "IT"));
          e.add(new Employee("Harmoine", "Granger", 28, LocalDate.of(1979, 9, 19), 25000, "IT"));
          e.add(new Employee("Lord", "Voldemort ", 34, LocalDate.of(1926, 12, 31), 1800, "Sales"));
          e.add(new Employee("Severus", "Snape", 98, LocalDate.of(1960, 1, 9), 75000, "HR"));
          e.add(new Employee("Albus", "Dumbledore", 100, LocalDate.of(1881, 8, 30), 800000, "HR"));

      }
      public List<Employee> getE() {

          return e;
      }
     }

