package fr.smile.training;

import java.io.IOException;

import javax.portlet.Event;
import javax.portlet.EventRequest;
import javax.portlet.EventResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.PortletException;
import javax.portlet.PortletRequestDispatcher;
import javax.portlet.ProcessEvent;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

/**
 * Portlet implementation class ConsumerPortlet
 * 
 * @author guillaumelenoir
 */
public class ConsumerPortlet extends GenericPortlet {

    public void init() {
        editTemplate = getInitParameter("edit-template");
        viewTemplate = getInitParameter("view-template");
    }

    public void doEdit(
            RenderRequest renderRequest, RenderResponse renderResponse)
        throws IOException, PortletException {

        include(editTemplate, renderRequest, renderResponse);
    }

    public void doView(
            RenderRequest renderRequest, RenderResponse renderResponse)
        throws IOException, PortletException {
    	
    	String message = renderRequest.getParameter("message");
    	if (message == null) {
    		message = "No message";
    	}
    	
    	renderRequest.setAttribute("message", message);
        include(viewTemplate, renderRequest, renderResponse);
    }
    
    @ProcessEvent(qname = "{http://training.smile.fr/events}ipc.producteur")
	public void reception(EventRequest request,
			EventResponse response) throws IOException, PortletException {
		Event event = request.getEvent();
		String msg = (String) event.getValue();
		
		response.setRenderParameter("message", msg);
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

    private static Log _log = LogFactoryUtil.getLog(ConsumerPortlet.class);

}
