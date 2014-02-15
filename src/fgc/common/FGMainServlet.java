package fgc.common;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;

import actone.common.error.ATHttpServletErrorHandler;

import com.jg.main.JGHttpServlet;

public class FGMainServlet extends JGHttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	public void init(ServletConfig config_) throws ServletException{
		super.init(config_);
		setErrorHandler(new ATHttpServletErrorHandler());
	}
}
