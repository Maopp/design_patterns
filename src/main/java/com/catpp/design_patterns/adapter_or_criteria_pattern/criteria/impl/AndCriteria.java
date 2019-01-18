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
public class AndCriteria implements Criteria {

    private Criteria criteria;
    private Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
        return otherCriteria.meetCriteria(firstCriteriaPersons);
    }
}
