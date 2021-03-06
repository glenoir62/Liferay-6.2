/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portlet.documentlibrary.action;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.repository.model.FileEntry;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ExtEditFileEntryAction extends EditFileEntryAction {

	/**
	 * The logger
	 */
	private static Log log = LogFactoryUtil.getLog(ExtEditFileEntryAction.class);
	
	
	@Override
	public ActionForward render(ActionMapping actionMapping,
			ActionForm actionForm, PortletConfig portletConfig,
			RenderRequest renderRequest, RenderResponse renderResponse)
			throws Exception {
		
		// SEE struts-config-ext.xml !!!
		log.info("log");
		System.out.println("render");
		return super.render(actionMapping, actionForm, portletConfig, renderRequest,
				renderResponse);
	}

	@Override
	public void processAction(ActionMapping actionMapping,
			ActionForm actionForm, PortletConfig portletConfig,
			ActionRequest actionRequest, ActionResponse actionResponse)
			throws Exception {
		System.out.println("processAction");
		super.processAction(actionMapping, actionForm, portletConfig, actionRequest,
				actionResponse);
	}
	@Override
	protected FileEntry updateFileEntry(PortletConfig portletConfig,
			ActionRequest actionRequest, ActionResponse actionResponse)
			throws Exception {
		System.out.println("updateFileEntry");
		return super.updateFileEntry(portletConfig, actionRequest, actionResponse);
	}
}