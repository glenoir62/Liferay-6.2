package fr.smile.training.expando.user;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ClassNameLocalServiceUtil;
import com.liferay.portlet.expando.model.ExpandoColumn;
import com.liferay.portlet.expando.service.ExpandoColumnLocalServiceUtil;

import fr.smile.training.expando.ExpandoModelBuilder;

/**
 * @author guillaumelenoir
 *
 */
public class UserExpandoModel extends ExpandoModelBuilder {
	private static Log log = LogFactoryUtil.getLog(UserExpandoModel.class);
	
	
	public UserExpandoModel(long companyId) throws PortalException, SystemException {
		super(companyId);
	}

	public void initModel() {
		
		long classNameId = ClassNameLocalServiceUtil.getClassNameId(User.class.getName());
		//Here we are adding expando table with name MyUser
		try {
			long tableId = createOrGetCustomTable(classNameId);
			
			log.info("Start - Adding customs fields for Liferay User ...");
			for(UserExpandoEnum cf : UserExpandoEnum.values()){
				Long exanpandoId = createCustomFieldTable(tableId, cf);
				if(exanpandoId != null){
					if(exanpandoId != null){
						  assignGuestPermissionsToExpando(exanpandoId);
					}
				}
			}
			log.info("End - Adding customs fields for Liferay User ...");
			
		} catch (Exception e) {
			e.printStackTrace();
			log.error("Unable to createOrGetCustomTable : " + e.getMessage());
		}
	}
	
	
	/**
	 * 
	 * @param tableId tableId 
	 * @param ue {@link UserExpandoEnum} modeling customs attributes
	 * @return new ExpendoColum id
	 * @throws SystemException
	 */
	private Long createCustomFieldTable(long tableId, UserExpandoEnum ue) throws SystemException{
		
			ExpandoColumn existingEc = ExpandoColumnLocalServiceUtil.getColumn(tableId, ue.getName());
			
			if(existingEc == null){
			try{
				return createCustomField(tableId, ue.getName(), ue.getType(), ue.getSettings());
			} catch (SystemException e) {
				log.error(e);
			}
		}
			return existingEc.getColumnId();
	}

}
