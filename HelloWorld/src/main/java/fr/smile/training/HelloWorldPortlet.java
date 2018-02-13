package fr.smile.training;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletMode;
import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.StringPool;

/**
 * Portlet implementation class HelloWorldPortlet
 * 
 * @author guillaumelenoir
 *
 */
public class HelloWorldPortlet extends GenericPortlet {

	/**
	 * the logger
	 */
	private static Log LOGGER = LogFactoryUtil.getLog(HelloWorldPortlet.class);

	/**
	 * Init phase
	 */
	public void init() {
		editTemplate = getInitParameter("edit-template");
		viewTemplate = getInitParameter("view-template");

		LOGGER.info("init");
	}

	/**
	 * set NAME attribute as preference
	 * 
	 * @param actionRequest
	 * @param actionResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	public void processAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		String name = ParamUtil.getString(actionRequest, "name");

		PortletPreferences prefs = actionRequest.getPreferences();

		prefs.setValue("NAME", name);
		prefs.store();

		actionResponse.setPortletMode(PortletMode.VIEW);
		LOGGER.info("processAction");
	}

	/**
	 * Get do view for edit mode
	 * 
	 * @param renderRequest
	 * @param renderResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	public void doEdit(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {

		LOGGER.info("doEdit");
		include(editTemplate, renderRequest, renderResponse);
	}

	/**
	 * Get do view Get NAME attribute from portlet preferences
	 * 
	 * @param renderRequest
	 * @param renderResponse
	 * @throws IOException
	 * @throws PortletException
	 */
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {

		PortletPreferences prefs = renderRequest.getPreferences();
		String defaultName = StringPool.BLANK;

		String name = prefs.getValue("NAME", defaultName);

		renderRequest.setAttribute("DISPLAY_NAME", name);

		LOGGER.info("doView");
		include(viewTemplate, renderRequest, renderResponse);
	}

	protected void include(String path, RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {

		PortletRequestDispatcher portletRequestDispatcher = getPortletContext()
				.getRequestDispatcher(path);

		if (portletRequestDispatcher == null) {
			_log.error(path + " is not a valid include");
		} else {
			portletRequestDispatcher.include(renderRequest, renderResponse);
		}
	}

	@Override
	public void destroy() {
		LOGGER.info("destroy");
		super.destroy();
	}

	@Override
	public void render(RenderRequest request, RenderResponse response)
			throws PortletException, IOException {
		LOGGER.info("render");
		super.render(request, response);
	}

	protected String editTemplate;
	protected String viewTemplate;

	private static Log _log = LogFactoryUtil.getLog(HelloWorldPortlet.class);

}
