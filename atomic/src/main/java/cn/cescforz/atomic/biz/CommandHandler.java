package cn.cescforz.atomic.biz;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * <p>Description: </p>
 *
 * @author cesc
 * @version 1.00.00
 * @date Create in 2019/7/30 17:16
 */
@Slf4j
@Component
public class CommandHandler {

    public <T> Object dispatchSave(Command<T> cmd, T t) {
        return cmd.executeSave(t);
    }

    public <T> Object dispatchDelete(Command<T> cmd, T t) {
        return cmd.executeDelete(t);
    }

    public <T> Object dispatchUpdate(Command<T> cmd, T t) {
        return cmd.executeUpdate(t);
    }
}
