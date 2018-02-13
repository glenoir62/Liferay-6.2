package fr.smile.training.services;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserLocalServiceWrapper;

public class ExtUserLocalService extends UserLocalServiceWrapper {
	
	public ExtUserLocalService(UserLocalService userLocalService) {
		super(userLocalService);
	}

	/**
     * The Logger
     */
    private static Log LOGGER = LogFactoryUtil.getLog(ExtUserLocalService.class);

	@Override
	public User deleteUser(long userId) throws PortalException, SystemException {
		User user = getUser(userId);
		
		LOGGER.info("user =" + user);
		
		return super.deleteUser(userId);
	}
	
	

}