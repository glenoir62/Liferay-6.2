package fr.smile.training.events;

import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.events.SimpleAction;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;

import fr.smile.training.expando.user.UserExpandoModel;

public class ExpandoValuesStartUpAction extends SimpleAction {

	// Logger
		private static Log log = LogFactoryUtil.getLog(ExpandoValuesStartUpAction.class);

	/**
	 * @param ids
	 * @throws ActionException
	 */
	public void run(String[] ids) throws ActionException {
		long companyId = GetterUtil.getLong(ids[0]);

		log.info("ExpandoValuesStartUpAction for companyId " + companyId);
		this.initializeExpandos(companyId);
		
	}
	
	/**
	 * Custom attributes initialization
	 * 
	 * @param companyId
	 *            portal instance id
	 * @throws SystemException
	 * @throws PortalException
	 */
	private void initializeExpandos(long companyId) {
		log.info("Starting initialization of custom attributes");

		UserExpandoModel model;
		try {
			model = new UserExpandoModel(companyId);
			model.initModel();

			log.info("Initialization custom expandos : [OK]");

		} catch (Exception e) {
			log.error("Unable to initialize customs attributes ...");
			log.error("Initialization custom expandos : [KO]");

		}

	}

}