/*
 * HelloAction.java (weberknecht-example-simple)
 *
 * tabstop=4, charset=UTF-8
 */
package com.github.pmairif.weberknecht.simple_example.actions;

import com.github.pmairif.weberknecht.request.View;
import com.github.pmairif.weberknecht.request.actions.ActionBase;
import com.github.pmairif.weberknecht.request.actions.WebAction;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world action
 */
public class HelloAction extends ActionBase implements WebAction {
	
	private String greetingsTo;

	@Override
	protected void onGet(HttpServletRequest request, String task) {
		this.greetingsTo = "world";
	}

	@Override
	public Map<String, Object> getModels() {
		Map<String, Object> map = new HashMap<>();
		
		map.put("greet", greetingsTo);
		
		return map;
	}

	@Override
	public View getView() {
		return new View("hello.jsp");
	}
}
