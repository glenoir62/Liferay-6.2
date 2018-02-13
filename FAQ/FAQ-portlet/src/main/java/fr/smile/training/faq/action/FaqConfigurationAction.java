package fr.smile.training.faq.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;

import fr.smile.training.faq.service.FaqLocalServiceUtil;

public class FaqConfigurationAction extends DefaultConfigurationAction {

	@Override
	public void processAction(PortletConfig portletConfig,
			ActionRequest actionRequest, ActionResponse actionResponse)
			throws Exception {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		long groupId = themeDisplay.getScopeGroupId();
		long companyId = themeDisplay.getCompanyId();
		
		String question = ParamUtil.getString(actionRequest, "question");
		String answer = ParamUtil.getString(actionRequest, "answer");
		
		// Persistence
		
		for (int i = 0; i<= 200; i++) {
			FaqLocalServiceUtil.addFaq(companyId, groupId, question, answer);
		}
		
		super.processAction(portletConfig, actionRequest, actionResponse);	
		
	}

	@Override
	public String render(PortletConfig portletConfig,
			RenderRequest renderRequest, RenderResponse renderResponse)
			throws Exception {
		
		return super.render(portletConfig, renderRequest, renderResponse);
	}

}
