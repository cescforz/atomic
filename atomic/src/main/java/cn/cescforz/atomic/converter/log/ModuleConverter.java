package cn.cescforz.atomic.converter.log;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

/**
 * <p>Description: 自定义获取 moudle</p>
 *
 * @author cesc
 * @version 1.00.00
 * @date Create in 2019/7/30 15:25
 */
public class ModuleConverter extends ClassicConverter {

    private static final int MAX_LENGTH = 20;

    @Override
    public String convert(ILoggingEvent event) {
        if (event.getLoggerName().length() > MAX_LENGTH) {
            return "";
        } else {
            return event.getLoggerName();
        }
    }
}
