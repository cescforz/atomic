package cn.cescforz.atomic.controller;

import cn.cescforz.commons.encrypt.annotation.encrypt.EncryptBody;
import cn.cescforz.commons.encrypt.enums.EncryptBodyMethod;
import cn.cescforz.commons.lang.version.annotation.ApiVersion;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>Description: </p>
 *
 * @author cesc
 * @version 1.00.00
 * @date Create in 2019/7/30 15:28
 */
@RestController
@RequestMapping(value = "/portal")
@Slf4j(topic = "LogbackController")
public class LogbackController {

    @ApiVersion(1)
    @RequestMapping(value = "{version}/gohome")
    public void m1() {
        log.info("buddy,we go home~ version 1");
    }


    @ApiVersion(2)
    @EncryptBody(value = EncryptBodyMethod.AES)
    @RequestMapping(value = "{version}/gohome")
    public Object m2() {
        return "buddy,we go home~ version 2";
    }
}
