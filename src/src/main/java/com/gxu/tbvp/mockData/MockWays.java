package com.gxu.tbvp.mockData;

import com.gxu.tbvp.domain.Ways;
import com.gxu.tbvp.exception.SelfJSONResult;
import com.gxu.tbvp.service.WaysService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
public class MockWays {

    @Resource
    private WaysService waysService;

    //随机生成start-end之间的数
    public static double getDoubleNum(int start, int end) {
        double f = (double)(Math.random()*(end - start +1)+start);
        BigDecimal b = new BigDecimal(f);
        return b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    public static int getNum(int start, int end) {
        return (int)(Math.random()*(end - start +1)+start);
    }

    @RequestMapping("/mockWays")
    public SelfJSONResult mockWays() {
        List<Ways> waysList = new ArrayList<>();
        for (int i = 0; i < 19920; i++) {
            Ways ways = new Ways();
            ways.setAmount(getDoubleNum(200, 3500));
            //0飞机 204165，1火车 178121，2汽车 31006，3自驾 86627，4其它 19920
            ways.setWay(4);
            waysList.add(ways);
        }
        int temp = waysService.insertBach(waysList);
        if (temp == 1){
            return SelfJSONResult.ok(waysList.get(1));
        } else {
            return SelfJSONResult.errorMsg("插入失败");
        }
    }
}
