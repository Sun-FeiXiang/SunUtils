package org.sfx.task;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.quartz.CronExpression;

import java.text.ParseException;
import java.util.Date;

/**
 * @author Felix
 * @description
 * @date 2023-2-10 15:02
 **/
@Slf4j
public class CronUtil {
    public static void predict(String cron) throws Exception {
        try {
            CronExpression cronExpression = new CronExpression(cron);
            Date latestTime = new Date();
            for (int i = 0; i < 5; i++) {
                Date nextTime = cronExpression.getNextValidTimeAfter(latestTime);
                log.info("下一次执行时间:{}", DateFormatUtils.format(nextTime.getTime(), "yyyy 年 MM 月 dd 日 E HH 点 mm 分 ss 秒"));
                latestTime = nextTime;
            }
        } catch (ParseException e) {
            throw new Exception(e);
        }
    }
}
