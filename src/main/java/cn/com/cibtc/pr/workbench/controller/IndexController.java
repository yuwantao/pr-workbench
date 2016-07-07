package cn.com.cibtc.pr.workbench.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yuwt on 2016/7/6.
 */
@Controller
public class IndexController {

	@RequestMapping("/index")
	public String index(ModelMap model) {
		model.addAttribute("message", "Pr Workbench Application");
		return "index";
	}

}
