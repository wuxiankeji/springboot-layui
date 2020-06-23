package com.haiyu.manager.controller.system;

import com.haiyu.manager.dto.UserSearchDTO;
import com.haiyu.manager.response.PageDataResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("dataAnalysis")
public class DataAnalysisController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 跳转到数据分析管理
     * @return
     */
    @RequestMapping("/dataAnalysisManager")
    public String toPage() {
        logger.info("进入角色管理");
        return "/dataAnalysis/dataAnalysisManager";
    }

    /**
     *
     * 功能描述:
     *
     * @param:
     * @return:
     * @auther: youqing
     * @date: 2018/11/21 11:10
     */
    @RequestMapping(value = "/dataList", method = RequestMethod.POST)
    @ResponseBody
    public PageDataResult getUserList(@RequestParam("pageNum") Integer pageNum,
                                      @RequestParam("pageSize") Integer pageSize,/*@Valid PageRequest page,*/ UserSearchDTO userSearch) {
        PageDataResult pageInfo = new PageDataResult();
        return pageInfo;
    }


}
