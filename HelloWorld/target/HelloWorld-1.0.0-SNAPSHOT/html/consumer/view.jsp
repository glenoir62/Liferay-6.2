<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />

Fetch message : ${message}

<div id='<portlet:namespace/>placeholder'>
placeholder
</div>

<aui:script use="aui-base">

Liferay.on(
		'LOAD_IPC',
		function(event) {
			var placeholder = A.one('#<portlet:namespace/>placeholder');
			placeholder.html(event.message);
			
			// REALOD portlet
			//Liferay.Portlet.refresh('#p_p_id<portlet:namespace/>');
	}
);

</aui:script>

