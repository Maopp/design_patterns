package com.catpp.design_patterns.structural_type_8.filter_or_criteria_pattern.criteria;

import com.catpp.design_patterns.structural_type_8.filter_or_criteria_pattern.entity.Person;

import java.util.List;

/**
 * com.catpp.design_patterns.structural_type_8.filter_or_criteria_pattern.criteria
 *
 * @Author cat_pp
 * @Date 2019/1/18
 * @Description “标准”接口
 */
public interface Criteria {

    List<Person> meetCriteria(List<Person> persons);
}
