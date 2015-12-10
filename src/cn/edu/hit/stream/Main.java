package cn.edu.hit.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * basic use of stream
 * 
 * @author zhou.you
 */
public class Main {

	public static void main(String[] args) {
		List<Person> javaProgrammers = new ArrayList<Person>() {
			{
				add(new Person("Elsdon", "Jaycob", "Java programmer", "male",
						43, 2000));
				add(new Person("Tamsen", "Brittany", "Java programmer",
						"female", 23, 1500));
				add(new Person("Floyd", "Donny", "Java programmer", "male", 33,
						1800));
				add(new Person("Sindy", "Jonie", "Java programmer", "female",
						32, 1600));
				add(new Person("Vere", "Hervey", "Java programmer", "male", 22,
						1200));
				add(new Person("Maude", "Jaimie", "Java programmer", "female",
						27, 1900));
				add(new Person("Shawn", "Randall", "Java programmer", "male",
						30, 2300));
				add(new Person("Jayden", "Corrina", "Java programmer",
						"female", 35, 1700));
				add(new Person("Palmer", "Dene", "Java programmer", "male", 33,
						2000));
				add(new Person("Addison", "Pam", "Java programmer", "female",
						34, 1300));
			}
		};

		List<Person> phpProgrammers = new ArrayList<Person>() {
			{
				add(new Person("Jarrod", "Pace", "PHP programmer", "male", 34,
						1550));
				add(new Person("Clarette", "Cicely", "PHP programmer",
						"female", 23, 1200));
				add(new Person("Victor", "Channing", "PHP programmer", "male",
						32, 1600));
				add(new Person("Tori", "Sheryl", "PHP programmer", "female",
						21, 1000));
				add(new Person("Osborne", "Shad", "PHP programmer", "male", 32,
						1100));
				add(new Person("Rosalind", "Layla", "PHP programmer", "female",
						25, 1300));
				add(new Person("Fraser", "Hewie", "PHP programmer", "male", 36,
						1100));
				add(new Person("Quinn", "Tamara", "PHP programmer", "female",
						21, 1000));
				add(new Person("Alvin", "Lance", "PHP programmer", "male", 38,
						1600));
				add(new Person("Evonne", "Shari", "PHP programmer", "female",
						40, 1800));
			}
		};

		//example one add to filter 
//		System.out.println("���г���Ա������:");
//		javaProgrammers.forEach((p) -> System.out.printf("%s %s; ",
//				p.getFirstName(), p.getLastName()));
//		phpProgrammers.forEach((p) -> System.out.printf("%s %s; ",
//				p.getFirstName(), p.getLastName()));
		
		//example two use with for each
//		System.out.println("������Ա��н 5% :");  
//		Consumer<Person> giveRaise = e -> e.setSalary(e.getSalary() / 100 * 5 + e.getSalary());  
//		  
//		javaProgrammers.forEach(giveRaise);  
//		phpProgrammers.forEach(giveRaise);
//		javaProgrammers.forEach((p) -> System.out.printf("%s %s; ",
//				p.getFirstName(), p.getSalary()));
//		phpProgrammers.forEach((p) -> System.out.printf("%s %s; ",
//				p.getFirstName(), p.getSalary()));
		
		//example three use of stream
//		System.out.println("��������н���� $1,400 ��PHP����Ա:");
//		phpProgrammers.stream()  
//		          .filter((p) -> (p.getSalary() > 1400))  
//		          .forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getSalary()));
		
		//example four define filter
//		Predicate<Person> ageFilter = (p) -> (p.getAge() > 25);  
//		Predicate<Person> salaryFilter = (p) -> (p.getSalary() > 1400);  
//		Predicate<Person> genderFilter = (p) -> ("female".equals(p.getGender()));  
//		  
//		System.out.println("������������� 24������н��$1,400���ϵ�ŮPHP����Ա:");  
//		phpProgrammers.stream()  
//		          .filter(ageFilter)  
//		          .filter(salaryFilter)  
//		          .filter(genderFilter)  
//		          .forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));  
//		  
//		// ����filters  
//		System.out.println("������� 24���Ů�� Java programmers:");  
//		javaProgrammers.stream()  
//		          .filter(ageFilter)  
//		          .filter(genderFilter)  
//		          .forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));
		
		
		//example five use of limit
//		Predicate<Person> genderFilter = (p) -> ("female".equals(p.getGender()));
//		System.out.println("��ǰ���3�� Java programmers:");  
//		javaProgrammers.stream()  
//		          .limit(3)  
//		          .forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));  
//		  
//		  
//		System.out.println("��ǰ���3��Ů�� Java programmers:");  
//		javaProgrammers.stream()  
//		          .filter(genderFilter)  
//		          .limit(3)  
//		          .forEach((p) -> System.out.printf("%s %s; ", p.getFirstName(), p.getLastName()));
		
		//example six use of sort bug to fix----------------------------------------
		System.out.println("���� name ����,����ʾǰ5�� Java programmers:");  
		List<Person> sortedJavaProgrammers = javaProgrammers  
		          .stream()  
		          .sorted((p, p2) -> (p.getFirstName().compareTo(p2.getFirstName())))  
		          .limit(5)  
		          .collect(Collectors.toList());  
		  
		sortedJavaProgrammers.forEach((p) -> System.out.printf("%s %s; %n", p.getFirstName(), p.getLastName()));  
		   
		System.out.println("���� salary ���� Java programmers:");  
		sortedJavaProgrammers = javaProgrammers  
		          .stream()  
		          .sorted( (p, p2) -> (p.getSalary() - p2.getSalary()) )  
		          .collect( Collectors.toList() );  
		  
		sortedJavaProgrammers.forEach((p) -> System.out.printf("%s %s; %n", p.getFirstName(), p.getLastName()));
		
		//example seven min and max
//		System.out.println("������͵� Java programmer:");  
//		Person pers = javaProgrammers  
//		          .stream()  
//		          .min((p1, p2) -> (p1.getSalary() - p2.getSalary()))  
//		          .get() ;
//		  
//		System.out.printf("Name: %s %s; Salary: $%,d.", pers.getFirstName(), pers.getLastName(), pers.getSalary()) ;
//		  
//		System.out.println("������ߵ� Java programmer:");  
//		Person person = javaProgrammers  
//		          .stream()  
//		          .max((p, p2) -> (p.getSalary() - p2.getSalary()))  
//		          .get();  
//		  
//		System.out.printf("Name: %s %s; Salary: $%,d.", person.getFirstName(), person.getLastName(), person.getSalary());
		
		//example 8 gen collections bug to fix------------------------------------------
//		System.out.println("�� PHP programmers �� first name ƴ�ӳ��ַ���:");  
//		String phpDevelopers = phpProgrammers  
//		          .stream()  
//		          .map(Person::getFirstName)  
//		          .collect(joining(" ; ")); // �ڽ�һ���Ĳ����п�����Ϊ���(token)     
//		  
//		System.out.println("�� Java programmers �� first name ��ŵ� Set:");  
//		Set<String> javaDevFirstName = javaProgrammers  
//		          .stream()  
//		          .map(Person::getFirstName)  
//		          .collect(toSet());  
//		  
//		System.out.println("�� Java programmers �� first name ��ŵ� TreeSet:");  
//		TreeSet<String> javaDevLastName = javaProgrammers  
//		          .stream()  
//		          .map(Person::getLastName)  
//		          .collect(toCollection(TreeSet::new)); 
		
		//example 9 statistic
		//���� count, min, max, sum, and average for numbers  
//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);  
//		IntSummaryStatistics stats = numbers  
//		          .stream()  
//		          .mapToInt((x) -> x)  
//		          .summaryStatistics();  
//		  
//		System.out.println("List���������� : " + stats.getMax());  
//		System.out.println("List����С������ : " + stats.getMin());  
//		System.out.println("�������ֵ��ܺ�   : " + stats.getSum());  
//		System.out.println("�������ֵ�ƽ��ֵ : " + stats.getAverage());  
		
		//example 10 parallel
//		System.out.println("���㸶�� Java programmers ������money:");  
//		int totalSalary = javaProgrammers  
//		          .parallelStream()  
//		          .mapToInt(p -> p.getSalary())  
//		          .sum();
//		System.out.println(totalSalary);
	}
}
