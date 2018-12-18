package org.skyfox.spring_boot_demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class RestController {
	
	
	@RequestMapping(value="api/city/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Object findOneCity(@PathVariable("id") Long id) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("name", "xxx");
		map.put("sex", "xxx");
		map.put("job", "xxx");
		map.put("country", "xxx");
		return map;
    }
 
}
