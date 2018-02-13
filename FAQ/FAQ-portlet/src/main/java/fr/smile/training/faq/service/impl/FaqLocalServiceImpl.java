/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package fr.smile.training.faq.service.impl;

import com.liferay.portal.kernel.exception.SystemException;

import fr.smile.training.faq.model.Faq;
import fr.smile.training.faq.service.base.FaqLocalServiceBaseImpl;

/**
 * The implementation of the faq local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fr.smile.training.faq.service.FaqLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Guillaume Lenoir
 * @see fr.smile.training.faq.service.base.FaqLocalServiceBaseImpl
 * @see fr.smile.training.faq.service.FaqLocalServiceUtil
 */
public class FaqLocalServiceImpl extends FaqLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link fr.smile.training.faq.service.FaqLocalServiceUtil} to access the faq local service.
	 */
	
	public void addFaq(long companyId, long groupId, String question, String answer) throws SystemException {
		
		long entryId = counterLocalService.increment();
		
		Faq faq = faqPersistence.create(entryId);
		faq.setGroupId(groupId);
		faq.setCompanyId(companyId);
		faq.setAnswer(answer);
		faq.setQuestion(question);
		
		faqPersistence.update(faq);
		
		
	}
	
	
}