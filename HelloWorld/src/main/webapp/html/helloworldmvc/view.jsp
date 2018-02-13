<%@include file="/html/init.jsp" %>

<portlet:defineObjects />

<liferay-ui:message key="fr.smile.training.helloworldportlet.title"/>

<liferay-ui:message key="fr.smile.training.helloworld.message"/>

<h2>${model}</h2>

<h2>${textTranslated}</h2>

<div class="row">
	<div class="span1 offset5">
		<c:forEach items="${modelList}" var="entity">
			<p>
				${entity}
			</p>
		</c:forEach>
	</div>
</div>


