<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>


<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />

<liferay-ui:message key="fr.smile.traning.ok" />
<liferay-ui:error key="fr.smile.traning.not.ok" message="fr.smile.traning.not.ok"/>


<aui:form action="${configurationURL}" name="_fm">
	<aui:input name="question">
		<aui:validator name="required"/>
	</aui:input>
	<aui:input name="answer">
		<aui:validator name="required"/>
	</aui:input>
	<aui:button type="submit"/>
</aui:form>