package cn.com.sinosoft.tbf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 通用控制器-监控
 *
 * @author lizhiyong
 *
 */
@Controller
@RequestMapping("/tbf/monitor")
public class TbfCommonMonitorController {

	@RequestMapping("")
	public String toIndex() {
		return "tbf/monitor";
	}

}
