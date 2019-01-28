package com.catpp.design_patterns.behaivor_type_12.iterator_pattern;

import com.catpp.design_patterns.behaivor_type_12.iterator_pattern.iterator.Iterator;
import com.catpp.design_patterns.behaivor_type_12.iterator_pattern.iterator.impl.NameRepository;

/**
 * com.catpp.design_patterns.behaivor_type_12.iterator_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description
 */
public class IteratorPatternDemo {

    public static void main(String[] args) {

        NameRepository nameRepository = new NameRepository();

        for (Iterator it = nameRepository.getIterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}
