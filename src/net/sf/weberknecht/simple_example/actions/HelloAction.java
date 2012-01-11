/*
 * HelloAction.java (weberknecht-example-simple)
 *
 * tabstop=4, charset=UTF-8
 */
package net.sf.weberknecht.simple_example.actions;

import java.io.IOException;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.highbyte_le.weberknecht.request.ContentProcessingException;
import de.highbyte_le.weberknecht.request.View;
import de.highbyte_le.weberknecht.request.actions.Action;
import de.highbyte_le.weberknecht.request.actions.ActionExecutionException;

/**
 * Hello world action
 * 
 * @author pmairif
 */
public class HelloAction implements Action {
	
	private String greetingsTo;

	/* (non-Javadoc)
	 * @see de.highbyte_le.weberknecht.request.actions.ExecutableAction#execute(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ActionExecutionException,
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

	/* (non-Javadoc)
	 * @see de.highbyte_le.weberknecht.request.DatabaseCapable#needsDatabase()
	 */
	@Override
	public boolean needsDatabase() {
		return false;
	}

	/* (non-Javadoc)
	 * @see de.highbyte_le.weberknecht.request.DatabaseCapable#setDatabase(java.sql.Connection)
	 */
	@Override
	public void setDatabase(Connection con) {
		//
	}
}
