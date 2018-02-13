package fr.smile.training.services;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceWrapper;
import com.liferay.portal.service.UserLocalService;

public class ExtUserLocalService extends UserLocalServiceWrapper {
	/* (non-Java-doc)
	 * @see com.liferay.portal.service.UserLocalServiceWrapper#UserLocalServiceWrapper(UserLocalService userLocalService)
	 */
	public ExtUserLocalService(UserLocalService userLocalService) {
		super(userLocalService);
	}

	@Override
	public User deleteUser(long userId) throws PortalException, SystemException {
		// TODO Auto-generated method stub
		User user = getUser(userId);
		
		System.out.println(user);
		
		return super.deleteUser(userId);
	}
	
	

}