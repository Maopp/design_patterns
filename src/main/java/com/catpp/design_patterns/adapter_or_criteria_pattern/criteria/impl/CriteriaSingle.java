package com.catpp.design_patterns.adapter_or_criteria_pattern.criteria.impl;

import com.catpp.design_patterns.adapter_or_criteria_pattern.criteria.Criteria;
import com.catpp.design_patterns.adapter_or_criteria_pattern.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * com.catpp.design_patterns.adapter_or_criteria_pattern.criteria.impl
 *
 * @Author cat_pp
 * @Date 2019/1/18
 * @Description
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
