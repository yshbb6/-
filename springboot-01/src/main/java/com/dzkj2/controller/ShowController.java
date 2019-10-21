package com.dzkj2.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dzkj2.pojo.User;

@Controller
public class ShowController {

	@RequestMapping("/show")
	public String show(Model model) {
		User user1 = new User("张三", "123456");
		User user2 = new User("李四", "123456");
		User user3 = new User("王麻子", "123456");
		
		List<User> data = new ArrayList<User>();
		data.add(user1);
		data.add(user2);
		data.add(user3);
		model.addAttribute("data", data);
		return "list";
	}
	
	@RequestMapping("/show2")
	public String show2(Model model) {
		System.out.println("控制访问");
		model.addAttribute("msg", "hello world");
		return "index";
	}
	
	@RequestMapping("/show3")
	public String show3(Model model) {
		User user1 = new User("张三", "123456");
		User user2 = new User("李四", "123456");
		User user3 = new User("王麻子", "123456");
		Map<String,Object> map = new HashMap<String, Object>();
		
		map.put("u1", user1);
		map.put("u2", user2);
		map.put("u3", user3);
		
		model.addAttribute("map", map);
		return "list2";
	}
	
	@RequestMapping("/show4")
	public String show4(Model model) {
		return "person/index2";
	}
}
