package com.catpp.design_patterns.chain_of_responsibility_pattern;

/**
 * com.catpp.design_patterns.chain_of_responsibility_pattern
 *
 * @Author cat_pp
 * @Date 2019/1/22
 * @Description 打印日志抽象类
 */
public abstract class AbstractLogger {

    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected int level;

    /**
     * 责任链中的下一个元素
     */
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
//        if (this.level == level) {
        if (this.level <= level) {
            write(message);
        }
        if (null != nextLogger) {
            nextLogger.logMessage(level, message);
        }
    }

    /**
     * 打印日志信息
     *
     * @param message 日志内容
     */
    protected abstract void write(String message);
}
