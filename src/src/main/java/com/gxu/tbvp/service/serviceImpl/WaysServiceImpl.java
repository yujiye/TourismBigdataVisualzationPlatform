package com.gxu.tbvp.service.serviceImpl;

import com.gxu.tbvp.domain.Ways;
import com.gxu.tbvp.mapper.WaysMapper;
import com.gxu.tbvp.service.WaysService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class WaysServiceImpl implements WaysService {

    @Resource
    private WaysMapper waysMapper;

    @Override
    public int insertBach(List<Ways> waysList) {
        try{
            waysMapper.insertList(waysList);
            return 1;
        } catch (Exception e){
            return 0;
        }
    }
}
