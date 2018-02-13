package fr.smile.training.events;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.SimpleAction;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ClassNameLocalServiceUtil;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.expando.model.ExpandoColumn;
import com.liferay.portlet.expando.model.ExpandoTable;
import com.liferay.portlet.expando.model.ExpandoTableConstants;
import com.liferay.portlet.expando.model.ExpandoValue;
import com.liferay.portlet.expando.service.ExpandoColumnLocalServiceUtil;
import com.liferay.portlet.expando.service.ExpandoTableLocalServiceUtil;
import com.liferay.portlet.expando.service.ExpandoValueLocalServiceUtil;

public class ExpandoValuesStartUpAction extends SimpleAction {
	/* (non-Java-doc)
	 * @see com.liferay.portal.kernel.events.SimpleAction#SimpleAction()
	 */
	public ExpandoValuesStartUpAction() {
		
		super();
	}

	/* (non-Java-doc)
	 * @see com.liferay.portal.kernel.events.SimpleAction#run(String[] ids)
	 */
	public void run(String[] ids) throws ActionException {
		// TODO Auto-generated method stub
		
//		try {
//			User user = CompanyLocalServiceUtil.getCompany(PortalUtil.getDefaultCompanyId()).getDefaultUser();
//	
//			// Manière douce 
////			user.getExpandoBridge().getAttribute("user-type");
////			user.getExpandoBridge().setAttribute("user-type", "The Ugly");
//			
//			// Manière 
//		//	ExpandoTable table = ExpandoTableLocalServiceUtil.getTable(User.class.getCanonicalName(), );
//			ExpandoTable table = ExpandoTableLocalServiceUtil.getTable(PortalUtil.getDefaultCompanyId(), PortalUtil.getClassNameId(User.class), ExpandoTableConstants.DEFAULT_TABLE_NAME);
//			
//			ExpandoColumn column = ExpandoColumnLocalServiceUtil.getColumn(table.getTableId(), "user-type");
//			
//			ExpandoValue expandoValue = ExpandoValueLocalServiceUtil.getValue(table.getTableId(), column.getColumnId(), user.getUserId());
//			
//			if (Validator.isNull(expandoValue)) {
//				long classNameId = ClassNameLocalServiceUtil.getClassNameId(User.class);
//				
//				expandoValue = ExpandoValueLocalServiceUtil.addValue(classNameId, table.getTableId(), column.getColumnId(), user.getUserId(), "The Bad");
//			}
//			else {
//				expandoValue.setData("The Bad");
//			}
//			
//			
//			ExpandoValueLocalServiceUtil.updateExpandoValue(expandoValue);
//			
//			
//			
//		} catch (PortalException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SystemException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}