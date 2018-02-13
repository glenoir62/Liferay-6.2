package fr.smile.training.events;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;

/**
 * @author Guillaume Lenoir
 * Run after login Action
 * Take a look at login.events.post property from the portal.properties
 * In a hook properties override the original portal.properties.
 * 
 * ex :
 * 
 * login.events.post = com.liferay.portal.events.ChannelLoginPostAction,com.liferay.portal.events.DefaultLandingPageAction,com.liferay.portal.events.LoginPostAction
 *
 * Then after your hook :
 * 
 * login.events.post = com.liferay.portal.events.ChannelLoginPostAction,com.liferay.portal.events.DefaultLandingPageAction,com.liferay.portal.events.LoginPostAction,fr.smile.training.events.LogUserLoginAction
 * 
 */
public class LogUserLoginAction extends Action {


    /**
     * The Logger
     */
    private static Log LOGGER = LogFactoryUtil.getLog(LogUserLoginAction.class);
    
	/**
	 * Run after the post login action
	 * Insert your code inside this method
	 * 
	 * @param request
	 * @param response
	 * @throws ActionException
	 */
	public void run(HttpServletRequest request, HttpServletResponse response)
			throws ActionException {
		
		// Get userId from request
		long userId = PortalUtil.getUserId(request);
		
		// add try catch
		try {
			// Search from BDD
			// User UserLocalServiceUtil => no permissions check !
			// User UserServiceUtil => with permissions check !!!
			User user = UserLocalServiceUtil.getUser(userId);
			
			// Insert your code belong here
			// *********************
			// ********************
			LOGGER.info(user);
			LOGGER.info("Hello Smile");
		} catch (PortalException e) {
			// Do PortalException process ...
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(e);
			}
			LOGGER.error("PortalException: unable to get user "+ e.getMessage());
		} catch (SystemException e) {
			// Do SystemException process ...
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(e);
			}
			LOGGER.error("SystemException: unable to get user "+ e.getMessage());
		}
	}
}