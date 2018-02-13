<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />

<liferay-ui:search-container searchContainer="${faqSearchContainer}">
	<liferay-ui:search-container-results results="${faqSearchContainer.results}" total="${faqSearchContainer.total}"/>
	
	<liferay-ui:search-container-row
		className="fr.smile.training.faq.model.Faq"
		keyProperty="entryId"
		modelVar="faq" escapedModel="true" 
	>

		<liferay-ui:search-container-column-text
			name="groupId"
			property="groupId"
		/>
		
		<liferay-ui:search-container-column-text
			name="companyId"
			property="companyId"
		/>
		
		<liferay-ui:search-container-column-text
			name="question"
			property="question"
		/>
		
				
		<liferay-ui:search-container-column-text
			name="answer"
			property="answer"
		/>
		
	</liferay-ui:search-container-row>

	<liferay-ui:search-iterator paginate="true" searchContainer="${searchRestaurantContainer}"/>

</liferay-ui:search-container>