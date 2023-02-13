package org.sfx.task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author Felix
 * @description
 * @date 2023-2-10 15:10
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class CronUtilTest {

    @Test
    public void predict() throws Exception {
        String cron = "11 30 10 ? * FRI";
        CronUtil.predict(cron);
        System.out.println("测试开始...");
    }
}