package com.krupa;

import com.krupa.Person.Gender;

public interface CheckPerson {
	boolean test(Person p);
}


class checkMalePersonWithAgeRange implements CheckPerson{

	@Override
	public boolean test(Person p) {
		return p.getGender()==Gender.MALE && p.getAge()>=18 && p.getAge() <=35;
	}
	
}