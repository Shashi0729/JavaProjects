package com.xworkz.task.runner;

		import java.util.ArrayList;

		import java.util.Collections;
		import java.util.Comparator;
		import java.util.List;

		import com.xworkz.comparator.test.Car;
		import com.xworkz.comparator.test.Employee;
		import com.xworkz.comparator.test.Person;
		import com.xworkz.comparator.test.Product;
		import com.xworkz.comparator.test.Student;
		import com.xworkz.comparator.test.Task;

		public class ComparatorRunner {

			public static void main(String[] args) {

				List<Double> doublenumber = new ArrayList<Double>();
				doublenumber.add(0.1235);
				doublenumber.add(0.7895);
				doublenumber.add(0.8952);
				doublenumber.add(0.7895);
				doublenumber.add(0.7862);
				doublenumber.add(0.45885);
				doublenumber.add(0.7984);
				doublenumber.add(0.1562);
				doublenumber.add(0.5642);
				doublenumber.add(0.10256);
				System.out.println("descending");
				Comparator<Double> comp = (Double s3, Double s4) -> s4.compareTo(s3);
				Collections.sort(doublenumber, comp);
				System.out.println("Sort:::" + doublenumber);
				System.out.println("ascending");
				Comparator<Double> comp11 = (Double s3, Double s4) -> s3.compareTo(s4);
				Collections.sort(doublenumber, comp11);
				System.out.println("Sort:::" + doublenumber);
				System.out.println("==================================");

				List<Integer> numbers = new ArrayList<Integer>();
				numbers.add(1);
				numbers.add(2);
				numbers.add(3);
				numbers.add(4);
				numbers.add(5);
				numbers.add(6);
				numbers.add(7);
				numbers.add(8);
				numbers.add(9);
				numbers.add(10);
				numbers.add(11);
				numbers.add(12);
				numbers.add(13);
				numbers.add(14);
				numbers.add(15);

				Comparator<Integer> comp1 = (Integer s3, Integer s4) -> s4.compareTo(s3);
				Collections.sort(numbers, comp1);
				System.out.println("Sort:::" + numbers);
				System.out.println("==================================");

				List<String> numbersOfNames = new ArrayList<String>();
				numbersOfNames.add("karnataka");
				numbersOfNames.add("Andhrapradesh");
				numbersOfNames.add("Arunachal Pradesh");
				numbersOfNames.add("Assam");
				numbersOfNames.add("Bihar");
				numbersOfNames.add("Jammu&Kashmir");
				numbersOfNames.add("Maharastra");
				numbersOfNames.add("Goa");
				numbersOfNames.add("Kerala");
				numbersOfNames.add("Chennai");
				numbersOfNames.add("Gujarat");
				numbersOfNames.add("Haryana");
				numbersOfNames.add("HimachalPradesh");
				numbersOfNames.add("Jharkhand");
				numbersOfNames.add("Meghalaya");

				Comparator<String> comparator = (String s1, String s2) -> s2.compareToIgnoreCase(s1);
				Collections.sort(numbersOfNames, comparator);
				System.out.println("Sort:");
				System.out.println(numbersOfNames);
				System.out.println("=====================");

				List<String> numbersOfNames1 = new ArrayList<String>();
				numbersOfNames1.add("karnataka");
				numbersOfNames1.add("Andhrapradesh");
				numbersOfNames1.add("Arunachal Pradesh");
				numbersOfNames1.add("Assam");
				numbersOfNames1.add("Bihar");
				numbersOfNames1.add("Jammu&Kashmir");
				numbersOfNames1.add("Maharastra");
				numbersOfNames1.add("Goa");
				numbersOfNames1.add("Kerala");
				numbersOfNames1.add("Chennai");
				numbersOfNames1.add("Gujarat");
				numbersOfNames1.add("Haryana");
				numbersOfNames1.add("HimachalPradesh");
				numbersOfNames1.add(null);
				numbersOfNames1.add(null);
				Comparator<String> comparator1 = (String s1, String s2) -> {

					if (s1 == null)
						return 0;
					else if (s2 == null)
						return 0;
					else
						return s2.compareToIgnoreCase(s1);

				};

				Collections.sort(numbersOfNames1, comparator1);
				System.out.println("Sorted list with Null");
				System.out.println(numbersOfNames1);
				System.out.println("----------------------------------------------------------------------------------------");
				List<Person> persons = new ArrayList<Person>();
				persons.add(new Person("Alice", 25));
				persons.add(new Person("Bob", 30));
				persons.add(new Person("Charlie", 25));
				persons.add(new Person("Dave", 30));
				persons.add(new Person("Eve", 22));

				Comparator<Person> personComparator = new Comparator<Person>() {
					@Override
					public int compare(Person p1, Person p2) {
						int ageComparison = Integer.compare(p1.getAge(), p2.getAge());
						if (ageComparison == 0)
							return p1.getName().compareToIgnoreCase(p2.getName());
						else
							return ageComparison;

					}
				};

				Collections.sort(persons, personComparator);
				System.out.println(persons);
				System.out.println("----------------------------------------------------------------------------------------");
				List<Product> prd = new ArrayList<Product>();
				prd.add(new Product("Laptop", 1000.0, 3));
				prd.add(new Product("Smartphone", 500.0, 10));
				prd.add(new Product("Tablet", 1000.0, 5));
				prd.add(new Product("Headphones", 200.0, 15));

				Comparator<Product> prdcomp = new Comparator<Product>() {

					@Override
					public int compare(Product o1, Product o2) {
						int pricecomp = Double.compare(o1.getPrice(), o2.getPrice());
						if (pricecomp == 0)
							return Integer.compare(o1.getQuantity(), o2.getQuantity());
						else
							return pricecomp;
					}
				};
				Collections.sort(prd, prdcomp);
				System.out.println(prd);

				System.out.println("----------------------------------------------------------------------------------------");
				List<Employee> emp=new ArrayList<Employee>();
				emp.add(new Employee(1,"Ganesh",10000));
				emp.add(new Employee(2,"Rajesh",50000));
				emp.add(new Employee(3,"Mallikarjuna",10000));
				emp.add(new Employee(4,"Taseer",50000));
				emp.add(new Employee(5,"Nithin",60000));
				emp.add(new Employee(6,"Prajwal",60000));
				emp.add(new Employee(6,"Sashi",60000));
				Comparator<Employee>employeecomp=new Comparator<Employee>() {

					@Override
					public int compare(Employee o1, Employee o2) {
						
						return Double.compare(o1.getSalary(), o2.getSalary());
					}
				};
				Collections.sort(emp, employeecomp);
				System.out.println(emp);
				System.out.println("----------------------------------------------------------------------------------------");
				List<Student>student=new ArrayList<Student>();
				student.add(new Student("Ganesh", 3, 22));
				student.add(new Student("Sashi", 2, 22));
				student.add(new Student("Rajesh",1, 20));
				student.add(new Student("Mallikarjun", 3, 24));
				student.add(new Student("Taseer", 1, 21));
				student.add(new Student("Nithin", 2, 21));
				student.add(new Student("Prajwal", 3, 22));
				
				Comparator<Student>studentcomp=new Comparator<Student>() {

					@Override
					public int compare(Student o1, Student o2) {
						int gradeComparison = Integer.compare(o1.getGrade(), o2.getGrade());
			            if (gradeComparison == 0) 
			                
			                return Integer.compare(o2.getAge(), o1.getAge());
			            else
			            return gradeComparison;
					
					}
		            
				};
				Collections.sort(student, studentcomp);
				System.out.println(student);
				System.out.println("----------------------------------------------------------------------------------------");
		        List<Car> cars = new ArrayList<Car>();
		        cars.add(new Car("Toyota", "Camry"));
		        cars.add(new Car("Honda", "Civic"));
		        cars.add(new Car("Ford", "Focus"));
		        cars.add(new Car("Toyota", "Corolla"));
		        cars.add(new Car("Honda", "Accord"));
		        cars.add(new Car("BMW", "X3"));
		        
		        Comparator<Car>carcomp=new Comparator<Car>() {

					@Override
					public int compare(Car o1, Car o2) {
						 int brandComparison = o1.getBrand().compareToIgnoreCase(o2.getBrand());
			                if (brandComparison == 0) 
			                    return o1.getModel().compareToIgnoreCase(o2.getModel());
			                
			                return brandComparison;
					}
				};
				Collections.sort(cars, carcomp);
				System.out.println("Sorted:"+cars);
				System.out.println("----------------------------------------------------------------------------------------");

				  List<Task> tasks = new ArrayList<Task>();
			        tasks.add(new Task("Task A", 3));
			        tasks.add(new Task("Task B", 1));
			        tasks.add(new Task("Task C", 4));
			        tasks.add(new Task("Task D", 2));
			        tasks.add(new Task("Task E", 5));
			        Comparator<Task> priorityComparator = new Comparator<Task>() {
			            @Override
			            public int compare(Task t1, Task t2) {
			                return Integer.compare(t1.getAge(), t2.getAge());
			            }
			        };
			        Collections.sort(tasks, priorityComparator);
			        System.out.println(tasks);
					System.out.println("----------------------------------------------------------------------------------------");

					
			}

		}


