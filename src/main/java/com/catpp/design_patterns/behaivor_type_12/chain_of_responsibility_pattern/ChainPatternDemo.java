package com.catpp.design_patterns.behaivor_type_12.chain_of_responsibility_pattern;

import com.catpp.design_patterns.behaivor_type_12.chain_of_responsibility_pattern.sub.ConsoleLogger;
import com.catpp.design_patterns.behaivor_type_12.chain_of_responsibility_pattern.sub.ErrorLogger;
import com.catpp.design_patterns.behaivor_type_12.chain_of_responsibility_pattern.sub.FileLogger;

/**
 * com.catpp.design_patterns.behaivor_type_12.chain_of_responsibility_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description
 */
public class ChainPatternDemo {

    /**
     * 创建不同类型的记录器。赋予它们不同的错误级别，并在每个记录器中设置下一个记录器。
     * 每个记录器中的下一个记录器代表的是链的一部分。
     * @return
     */
    private static AbstractLogger getChainOfLogger() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLogger();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }
}
