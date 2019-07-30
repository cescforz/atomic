package cn.cescforz.atomic.biz;

/**
 * <p>Description: </p>
 *
 * @author cesc
 * @version 1.00.00
 * @date Create in 2019/7/30 17:12
 */
public interface Command<T> {

    Object executeSave(T t);
    
    Object executeDelete(T t);

    Object executeUpdate(T t);
}
