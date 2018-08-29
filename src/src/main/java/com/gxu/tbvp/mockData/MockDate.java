package com.gxu.tbvp.mockData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MockDate {

    public Date RondomDate() throws ParseException{
        Date date = randomDate("2018-06-01", "2018-09-01");
        String str = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(date);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        return sdf.parse(str);
    }

    /**
     * 获取随机日期
     * @param beginDate 起始日期，格式为：yyyy-MM-dd
     * @param endDate 结束日期，格式为：yyyy-MM-dd
     * @return
     */
    private static Date randomDate(String beginDate, String endDate){
        try{
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date start = format.parse(beginDate);
            Date end = format.parse(endDate);

            if (start.getTime() >= end.getTime()) {
                return null;
            }

            long date = random(start.getTime(), end.getTime());
            return new Date(date);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static long random(long begin, long end) {
        long rtn = begin + (long)(Math.random()* (end - begin)) ;
        if (rtn == begin || rtn == end) {
            return random(begin, end);
        }
        return rtn;
    }

    public static void main(String args[]) throws ParseException {
        MockDate mockDate = new MockDate();
        System.out.println(mockDate.RondomDate());
    }
}
