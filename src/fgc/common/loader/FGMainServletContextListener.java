package fgc.common.loader;

import javax.servlet.ServletContextEvent;

import actone.common.log.ATDBLogHandler;
import actone.common.log.ATLogHandler;

import com.jg.db.JGDBConnection;
import com.jg.log.JGLog;
import com.jg.main.loader.JGMainServletContextListener;

public class FGMainServletContextListener extends JGMainServletContextListener {
	
	@Override
	public void contextInitialized(ServletContextEvent contextEvent_){
		super.contextInitialized(contextEvent_);
		
		JGLog.setLogHandler(new ATLogHandler());
		JGDBConnection.setLoggingDef(new ATDBLogHandler());
	}
	
	
}
