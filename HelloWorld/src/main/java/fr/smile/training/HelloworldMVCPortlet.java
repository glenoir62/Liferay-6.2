package fr.smile.training;

import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Layout;
import com.liferay.portal.model.User;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

/**
 * @author guillaumelenoir Portlet implementation class HelloworldMVCPortlet
 *
 */
public class HelloworldMVCPortlet extends MVCPortlet {

	/**
	 * the logger
	 */
	private static Log LOGGER = LogFactoryUtil.getLog(HelloWorldPortlet.class);

	/**
	 * Do view Get theme display. Convenient Object to get current context
	 * 
	 * @param renderRequest
	 * @param renderResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {

		
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest
				.getAttribute(WebKeys.THEME_DISPLAY);
		
		//Get locale
		Locale locale = themeDisplay.getLocale();

		// Get GroupId
		// Site in back office
		long groupId = themeDisplay.getScopeGroupId();

		// Get current user Id
		long userId = themeDisplay.getUserId();

		// Get company Id
		// Company in back office
		// A company can have several sites
		long companyId = themeDisplay.getCompanyId();

		// Get layout
		// It's a page
		// A site can have several pages
		Layout layout = themeDisplay.getLayout();

		// now read your parameters, e.g. like this:
		// long someParameter = ParamUtil.getLong(request, "someParameter");
		if(LOGGER.isDebugEnabled()) {
			LOGGER.debug("groupId " + groupId);
			LOGGER.debug("userId " + userId);
			LOGGER.debug("companyId " + companyId);
			LOGGER.debug("layout " + layout);
		}
		
		LOGGER.info("Set models from controller HelloworldMVCPortlet");
		
		// First model
		String model = "This is a test model";
		// Second model
		List<String> modelList = new ArrayList<String>(3);
		modelList.add("test 1");
		modelList.add("test 2");
		modelList.add("test 3");
		
		LOGGER.info("locale " + locale);
		
		// Third model
		String textTranslated = LanguageUtil.get(locale, "fr.smile.training.helloworldportlet.model");
		
		LOGGER.info("textTranslated " + textTranslated);
		
		renderRequest.setAttribute("model", model);
		renderRequest.setAttribute("textTranslated", textTranslated);
		renderRequest.setAttribute("modelList", modelList);
		
		// get user
		User user = themeDisplay.getUser();
		
		LOGGER.info("voiture " + user.getExpandoBridge().getAttribute("voiture"));
		
		
		
		LOGGER.info("redriect to view");

		super.doView(renderRequest, renderResponse);
	}

}
