package com.catpp.design_patterns.adapter_or_criteria_pattern.criteria.impl;

import com.catpp.design_patterns.adapter_or_criteria_pattern.criteria.Criteria;
import com.catpp.design_patterns.adapter_or_criteria_pattern.entity.Person;

import java.util.List;

/**
 * com.catpp.design_patterns.adapter_or_criteria_pattern.criteria.impl
 *
 * @Author cat_pp
 * @Date 2019/1/18
 * @Description
 */
public class OrCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if (!firstCriteriaItems.contains(person)) {
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}
