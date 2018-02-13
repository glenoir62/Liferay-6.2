package fr.smile.training.faq.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fr.smile.training.faq.model.Faq;
import fr.smile.training.faq.service.FaqLocalServiceUtil;

/**
 * @author Guillaume Lenoir
 * @generated
 */
public abstract class FaqActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public FaqActionableDynamicQuery() throws SystemException {
        setBaseLocalService(FaqLocalServiceUtil.getService());
        setClass(Faq.class);

        setClassLoader(fr.smile.training.faq.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("entryId");
    }
}
