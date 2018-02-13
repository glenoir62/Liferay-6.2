package fr.smile.training.events.pre;

import com.liferay.portal.kernel.events.Action;
import com.liferay.portal.kernel.events.ActionException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SmileServicePreAction extends Action {

	private static Log log = LogFactoryUtil.getLog(SmileServicePreAction.class);
	
	@Override
	public void run(HttpServletRequest request, HttpServletResponse response) throws ActionException {

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long guestGroupId = themeDisplay.getScopeGroupId();
		
		log.info("SmileServicePreAction");
		
		Map<String, Object> vmVariables = getVmVariables(request);

		// IS is log in
		if (themeDisplay.isSignedIn()) {
			// Get HttpSession
			HttpSession session = request.getSession();

			// Get current user cart
			User user = themeDisplay.getUser();


			// Get user token
			String username = GetterUtil.getString(session.getAttribute("LIFERAY_SHARED_IZBERG_USERNAME"));

			boolean voiture = GetterUtil.getBoolean(user.getExpandoBridge().getAttribute("voiture"));


			// Send var to theme portal_normal.vm and web content
			vmVariables.put("smile", "smile test vm");
			vmVariables.put("voiture", voiture);
			boolean isHeaderShow = GetterUtil.getBoolean(themeDisplay.getThemeSetting("header-show"));
			vmVariables.put("header_show", isHeaderShow);

		}

		vmVariables.put("guest_group_id", guestGroupId);

	}
	
	/**
	 * @param request
	 * @return
	 */
	public static Map<String, Object> getVmVariables(HttpServletRequest request) {

		@SuppressWarnings("unchecked")
		Map<String, Object> vmVariables = (Map<String, Object>) request.getAttribute(WebKeys.VM_VARIABLES);

		if (vmVariables == null) {
			vmVariables = new HashMap<String, Object>();
			request.setAttribute(WebKeys.VM_VARIABLES, vmVariables);
		}

		return vmVariables;
	}
}
