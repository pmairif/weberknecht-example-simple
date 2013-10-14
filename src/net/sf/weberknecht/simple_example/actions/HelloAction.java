/*
 * HelloAction.java (weberknecht-example-simple)
 *
 * tabstop=4, charset=UTF-8
 */
package net.sf.weberknecht.simple_example.actions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import de.highbyte_le.weberknecht.request.ContentProcessingException;
import de.highbyte_le.weberknecht.request.View;
import de.highbyte_le.weberknecht.request.actions.ActionBase;
import de.highbyte_le.weberknecht.request.actions.ActionExecutionException;
import de.highbyte_le.weberknecht.request.actions.WebAction;

/**
 * Hello world action
 * 
 * @author pmairif
 */
public class HelloAction extends ActionBase implements WebAction {
	
	private String greetingsTo;

	/* (non-Javadoc)
	 * @see de.highbyte_le.weberknecht.request.actions.ActionBase#onGet(javax.servlet.http.HttpServletRequest, java.lang.String)
	 */
	@Override
	protected void onGet(HttpServletRequest request, String task) throws IOException, ActionExecutionException,
			ContentProcessingException {

		this.greetingsTo = "world";
	}

	/* (non-Javadoc)
	 * @see de.highbyte_le.weberknecht.request.actions.Action#getModels()
	 */
	@Override
	public Map<String, Object> getModels() {
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("greet", greetingsTo);
		
		return map;
	}

	/* (non-Javadoc)
	 * @see de.highbyte_le.weberknecht.request.actions.Action#getView()
	 */
	@Override
	public View getView() {
		return new View("hello.jsp");
	}
}
