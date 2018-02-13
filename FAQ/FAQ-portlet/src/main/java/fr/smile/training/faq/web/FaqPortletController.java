package fr.smile.training.faq.web;

import java.io.IOException;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.dao.search.SearchContainer;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.util.bridges.mvc.MVCPortlet;

import fr.smile.training.faq.model.Faq;
import fr.smile.training.faq.service.FaqLocalServiceUtil;

public class FaqPortletController extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {
		
		SearchContainer<Faq> searchContainer = new SearchContainer<Faq>(renderRequest, renderResponse.createRenderURL(), null, "empty-results-faq");
		
		List<Faq> results = null;
		int total = 0;
		
		try {
			results = FaqLocalServiceUtil.getFaqs(searchContainer.getStart(), searchContainer.getEnd());
			total = FaqLocalServiceUtil.getFaqsCount();
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		searchContainer.setResults(results);
		searchContainer.setTotal(total);
		
		renderRequest.setAttribute("faqSearchContainer", searchContainer);
		
		
		super.doView(renderRequest, renderResponse);
	}
}
