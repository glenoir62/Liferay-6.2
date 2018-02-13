<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>


<portlet:defineObjects />


<br/>

<a href="<portlet:actionURL/>"> Send a message</a>

<div id='<portlet:namespace/>load'>Load EVENT IPC JS</div>

<aui:script use="aui-base">
	A.one("#<portlet:namespace/>load").on('click', function() {
		Liferay.fire(
				'LOAD_IPC',
				{
					message: 'Liferay_training'
				}
			);
	});
</aui:script>
