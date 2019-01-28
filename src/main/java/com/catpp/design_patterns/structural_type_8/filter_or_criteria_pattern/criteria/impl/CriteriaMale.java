package com.catpp.design_patterns.structural_type_8.filter_or_criteria_pattern.criteria.impl;

import com.catpp.design_patterns.structural_type_8.filter_or_criteria_pattern.criteria.Criteria;
import com.catpp.design_patterns.structural_type_8.filter_or_criteria_pattern.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * com.catpp.design_patterns.structural_type_8.filter_or_criteria_pattern.criteria.impl
 *
 * @Author cat_pp
 * @Date 2019/1/18
 * @Description
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
