package com.travelstep.front.controller.member;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SignUpController {
	
	
	@RequestMapping(value="/sign",method=RequestMethod.GET)
	@ResponseBody
	public boolean signUp(String username,String password){
		if(StringUtils.isBlank(username))
			return true;
		return false;
	}

}
