package com.krupa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.krupa.Person.Gender;

public class LamdaExample {
	void printPersonGreaterthanAge(int age, List<Person> govEmp) {
		for (Person p : govEmp) {
			if(p.getAge()>=age) {
				p.displayPerson();
			}
		}
	}
	
	void printPersonsBetweenAgeRange(int lowAge, int highAge , List<Person> govEmp) {
		for (Person p : govEmp) {
			if(p.getAge()>=lowAge && p.getAge()<=highAge) {
				p.displayPerson();
			}
		}
	}
	
	/*void printMalePersonWithAgeRange(List<Person> govEmp) {
		for (Person p : govEmp) {
			if(p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge() <=35) {
				p.displayPerson();
			}
		}
	}*/
	
	void printMalePersonWithAgeRange(List<Person> govEmp, Predicate<Person> tester) {
		for (Person p : govEmp) {
			if(tester.test(p)) {
				p.displayPerson();
			}
		}
	}
	
	void printMalePersonWithAgeRangeConsume(List<Person> govEmp, 
			Predicate<Person> tester,
			Consumer<Person> cons) {
		for (Person p : govEmp) {
			if (tester.test(p)) {
				cons.accept(p);
			}
		}
	}

	void printMalePersonWithAgeRangeConsumeFunction(List<Person> govEmp, 
			Predicate<Person> tester, Function<Person, String> func,
			Consumer<String> cons) {
		for (Person p : govEmp) {
			if (tester.test(p)) {
				String name = func.apply(p);
				cons.accept(name);
			}
		}
	}
	
	<X,Y> void printMalePersonWithAgeRangeWithGenerics(Collection<X> govEmp, 
			Predicate<X> tester, Function<X, Y> func,
			Consumer<Y> cons) {
		for (X p : govEmp) {
			if (tester.test(p)) {
				Y name = func.apply(p);
				cons.accept(name);
			}
		}
	}
	
	public static void main(String[] args) {
		List<Person> empList = new ArrayList<>();
		
		empList.add(new Person("Krupa", 65, Gender.FEMALE));
		empList.add(new Person("Ganesh", 25, Gender.MALE));
		empList.add(new Person("Venkatesh", 60, Gender.MALE));
		empList.add(new Person("Lavanya", 24, Gender.FEMALE));
		
		LamdaExample eg= new LamdaExample();
		System.out.println("Print Person Greater than Age: ");
		eg.printPersonGreaterthanAge(60, empList);
		System.out.println("Print Person Between age Range: ");
		eg.printPersonsBetweenAgeRange(18, 35, empList);
		System.out.println("Print Male Person Between age Range: ");
		System.out.println("==================================================");
//		eg.printMalePersonWithAgeRange(empList);
//		eg.printMalePersonWithAgeRange(empList, new checkMalePersonWithAgeRange() );
		/*eg.printMalePersonWithAgeRange(empList, new CheckPerson() {
			@Override
			public boolean test(Person p) {
				return p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge() <=35;
			}
		});*/
		
		/*eg.printMalePersonWithAgeRange(empList, new Predicate<Person>() {
			@Override
			public boolean test(Person p) {
				return p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge() <=35;
			}
		});*/
		
//		eg.printMalePersonWithAgeRange(empList,
//				(Person p)->{ return p.getGender()==Gender.MALE 
//					&& p.getAge()>=18 
//					&& p.getAge() <=35; });
		eg.printMalePersonWithAgeRange(empList,
				p -> p.getGender() == Gender.MALE 
				&& p.getAge() >= 18 
				&& p.getAge() <= 35);
		
		System.out.println("==================================================");
		
		eg.printMalePersonWithAgeRangeConsume(empList, 
				p-> p.getGender() == Gender.MALE && p.getAge() >= 18 && p.getAge() <= 35,
				c-> c.displayPerson());
		
		System.out.println("==================================================");
		eg.printMalePersonWithAgeRangeConsumeFunction(empList, 
				p-> p.getGender() == Gender.MALE && p.getAge() >= 18 && p.getAge() <= 35,
				p-> p.getName(), 
				c-> System.out.println(c));
		
		System.out.println("==================================================");
		eg.printMalePersonWithAgeRangeWithGenerics(empList, 
				p-> p.getGender() == Gender.MALE && p.getAge() >= 18 && p.getAge() <= 35,
				p-> p.getName(), 
				c-> System.out.println(c));
	}
}
