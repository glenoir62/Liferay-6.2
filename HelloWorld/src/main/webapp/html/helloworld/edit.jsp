<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

<liferay-portlet:actionURL var="actionURL" />

<aui:form action="${actionURL}" method="post" name="_fm">

	<aui:input name="name" type="text" label="Name"/>
	<aui:button name="Save" type="submit"/>

</aui:form>



