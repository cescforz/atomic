package cn.cescforz.atomic;

import cn.cescforz.commons.encrypt.annotation.EnableEncryptBody;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>Description: </p>
 *
 * @author cesc
 * @version 1.00.00
 * @date Create in 2019/7/30 14:27
 */
@SpringBootApplication
@EnableEncryptBody
public class AtomicStart {

    public static void main(String[] args) {
        SpringApplication.run(AtomicStart.class, args);
    }
}
