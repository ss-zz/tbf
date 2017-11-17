package cn.com.sinosoft.tbf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 通用控制器
 *
 * @author lizhiyong
 *
 */
@Controller
public class TbfCommonController {

	@RequestMapping({ "/", "index", "index.html", "index.htm" })
	public String toIndex() {
		return "index";
	}

}
