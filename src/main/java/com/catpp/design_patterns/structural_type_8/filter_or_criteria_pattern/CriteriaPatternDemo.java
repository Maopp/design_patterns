package com.catpp.design_patterns.structural_type_8.filter_or_criteria_pattern;

import com.catpp.design_patterns.structural_type_8.filter_or_criteria_pattern.criteria.Criteria;
import com.catpp.design_patterns.structural_type_8.filter_or_criteria_pattern.criteria.impl.*;
import com.catpp.design_patterns.structural_type_8.filter_or_criteria_pattern.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * com.catpp.design_patterns.structural_type_8.filter_or_criteria_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/18
 * @Description
 */
public class CriteriaPatternDemo {

    public static void main(String[] args) {

        // 使用不同的标准（Criteria）和它们的结合来过滤 Person 对象的列表。
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleAndMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males:");
        printPerson(male.meetCriteria(persons));

        System.out.println(System.getProperty("line.separator") + "Female:");
        printPerson(female.meetCriteria(persons));

        System.out.println(System.getProperty("line.separator") + "Single:");
        printPerson(single.meetCriteria(persons));

        System.out.println(System.getProperty("line.separator") + "SingleAndMale:");
        printPerson(singleAndMale.meetCriteria(persons));

        System.out.println(System.getProperty("line.separator") + "SingleOrFemale:");
        printPerson(singleOrFemale.meetCriteria(persons));
    }

    private static void printPerson(List<Person> persons) {
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
