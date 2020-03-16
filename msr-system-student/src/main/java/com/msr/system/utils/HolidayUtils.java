package com.msr.system.utils;

import java.util.ArrayList;
import java.util.List;

/**
 *  存储法定假期工具类
 */
public class HolidayUtils {
    public static List<String> getHoliday(){
        List<String> holidayList = new ArrayList<>();
        //添加法定假日日期(不包括周六和周日)
        holidayList.add("2020-03-20");
        holidayList.add("2020-04-29");
        holidayList.add("2020-05-04");
        holidayList.add("2020-05-05");
        holidayList.add("2020-05-06");
        holidayList.add("2020-07-23");
        holidayList.add("2020-07-24");
        holidayList.add("2020-08-10");
        holidayList.add("2020-09-21");
        holidayList.add("2020-09-22");
        holidayList.add("2020-11-03");
        holidayList.add("2020-11-23");
        return holidayList;
    }
}
