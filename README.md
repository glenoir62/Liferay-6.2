# Formation6.2


DEMO PLUGIN

At first create and configure one Liferay profile from your settings.xml.
Then :

<pre>
  mvn liferay:build-service
  mvn clean install liferay:deploy
</pre>

Example :

```
  <profiles>
  <profile>
  	<id>Liferay-v6.2-EE-(Tomcat-7)</id>
  	<properties>
  		<liferay.version>6.2.10.8</liferay.version>
  		<liferay.maven.plugin.version>7.0.0-m2</liferay.maven.plugin.version>
  		<liferay.auto.deploy.dir>/Volumes/Guillaume Lenoir/Liferay/Liferay 6.2 EE/liferay-portal-6.2-ee-sp7/deploy</liferay.auto.deploy.dir>
  		<liferay.app.server.deploy.dir>/Volumes/Guillaume Lenoir/Liferay/Liferay 6.2 EE/liferay-portal-6.2-ee-sp7/tomcat-7.0.42/webapps</liferay.app.server.deploy.dir>
  		<liferay.app.server.lib.global.dir>/Volumes/Guillaume Lenoir/Liferay/Liferay 6.2 EE/liferay-portal-6.2-ee-sp7/tomcat-7.0.42/lib/ext</liferay.app.server.lib.global.dir>
  		<liferay.app.server.portal.dir>/Volumes/Guillaume Lenoir/Liferay/Liferay 6.2 EE/liferay-portal-6.2-ee-sp7/tomcat-7.0.42/webapps/ROOT</liferay.app.server.portal.dir>
  	</properties>
  	</profile>
  </profiles>
```

Then set your liferay portal in developer mode :

https://dev.liferay.com/develop/tutorials/-/knowledge_base/6-2/using-developer-mode-with-themes


For custom queries :
https://dev.liferay.com/develop/tutorials/-/knowledge_base/6-2/developing-custom-sql-queries

For Service builder :
https://dev.liferay.com/develop/tutorials/-/knowledge_base/6-2/service-builder

For deploying ext :
https://dev.liferay.com/develop/tutorials/-/knowledge_base/6-2/advanced-customization-with-ext-plugins

mvn clean install liferay:direct-deploy

For hook :
https://dev.liferay.com/develop/tutorials/-/knowledge_base/6-2/customizing-liferay-portal

For layout and themes :
https://dev.liferay.com/develop/tutorials/-/knowledge_base/6-2/themes-and-layout-templates

MVC portlet :

https://dev.liferay.com/develop/tutorials/-/knowledge_base/6-2/developing-jsp-portlets-using-liferay-mvc



