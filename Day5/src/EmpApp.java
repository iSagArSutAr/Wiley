
public class EmpApp {
	public static void main(String[] args) {
		Employee[] emps = new Employee[] 
				{new Employee(1, "Sk Jaid", DeptType.JavaDeveloper.toString(), 10000),
				new Employee(2,"Naga Prasad",DeptType.JavaDeveloper.toString(),12000),
				new Employee(3,"Deepak",DeptType.ScrumDeveloper.toString(),12000),
				new Employee(4,"Mohit Jangit",DeptType.JavaDeveloper.toString(),14000),
				new Employee(5,"Sagar Sutar",DeptType.ScrumMaster.toString(),20000)};
		
		/*sortEmployees(emps);
		searchEmployees(DeptType.ScrumDeveloper, emps);
		UtilityClass ut = new UtilityClass();
		ut.sortEmployees(emps);
		ut.searchEmployees(DeptType.JavaDeveloper, emps);*/
		
		Employee.sortEmployees(emps);
		Employee.searchEmployees(DeptType.JavaDeveloper, emps);
		Employee emp1 = new Employee(1,"Sk Jaid",DeptType.ScrumMaster.toString(),20000);
		Employee emp2 = new Employee(1, "S Jaid", "JavaDeveloper", 15000);
		System.out.println(emp1.equals(emp2));
	}
}
