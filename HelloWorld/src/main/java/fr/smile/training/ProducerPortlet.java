package fr.smile.training;

import java.io.IOException;
import java.util.Random;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.xml.namespace.QName;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * Portlet implementation class ProducerPortlet
 * 
 * @author guillaumelenoir
 */
public class ProducerPortlet extends GenericPortlet {

    public void init() {
        editTemplate = getInitParameter("edit-template");
        viewTemplate = getInitParameter("view-template");
    }

    public void doEdit(
            RenderRequest renderRequest, RenderResponse renderResponse)
        throws IOException, PortletException {

        include(editTemplate, renderRequest, renderResponse);
    }
    
	public void processAction(ActionRequest actionRequest,
			ActionResponse actionResponse) throws IOException, PortletException {
		QName qName = new javax.xml.namespace.QName("http://training.smile.fr/events", "ipc.producteur");
		actionResponse.setEvent(qName, "Hello " + new Random(System.currentTimeMillis()).nextInt());
	}

    public void doView(
            RenderRequest renderRequest, RenderResponse renderResponse)
        throws IOException, PortletException {

        include(viewTemplate, renderRequest, renderResponse);
    }

    protected void include(
            String path, RenderRequest renderRequest,
            RenderResponse renderResponse)
        throws IOException, PortletException {

        PortletRequestDispatcher portletRequestDispatcher =
            getPortletContext().getRequestDispatcher(path);

        if (portletRequestDispatcher == null) {
            _log.error(path + " is not a valid include");
        }
        else {
            portletRequestDispatcher.include(renderRequest, renderResponse);
        }
    }
 
    protected String editTemplate;
    protected String viewTemplate;

    private static Log _log = LogFactoryUtil.getLog(ProducerPortlet.class);

}
