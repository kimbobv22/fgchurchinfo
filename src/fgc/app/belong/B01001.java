package fgc.app.belong;

import com.jg.action.JGAction;
import com.jg.action.handler.JGServiceBox;
import com.jg.db.vo.JGDBQuery;
import com.jg.db.xml.JGDBXMLQueryManager;
import com.jg.vo.JGDataset;

public class B01001 extends JGAction {
	
	protected static final String _querysetKey = "app.belong.B01001"; 

	@Override
	protected void initAction(JGServiceBox arg0){}
	
	public void getList(JGServiceBox serviceBox_) throws Exception{
		String upBelongId_ = serviceBox_.getParameter("upBelongId");
		String belongNm_ = serviceBox_.getParameter("belongNm");
		
		JGDBQuery query_ = JGDBXMLQueryManager.sharedManager().createQuery(_querysetKey, "getTree"
				,new Object[]{"upBelongId",upBelongId_,"belongNm",belongNm_});
		JGDataset result_ = getDBConnection().executeQuery(query_);
		serviceBox_.writer().append(result_.toJSON(true));
		serviceBox_.writer().print();
	}
	
	public void getTree(JGServiceBox serviceBox_) throws Exception{
		String belongId_ = serviceBox_.getParameter("belongId");
		
		JGDBQuery query_ = JGDBXMLQueryManager.sharedManager().createQuery(_querysetKey, "getTree"
				,new Object[]{"belongId",belongId_});
		JGDataset result_ = getDBConnection().executeQuery(query_);
		serviceBox_.writer().append(result_.toJSON(true));
		serviceBox_.writer().print();
	}

}
