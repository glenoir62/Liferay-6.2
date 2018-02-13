package fr.smile.training.faq.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FaqLocalService}.
 *
 * @author Guillaume Lenoir
 * @see FaqLocalService
 * @generated
 */
public class FaqLocalServiceWrapper implements FaqLocalService,
    ServiceWrapper<FaqLocalService> {
    private FaqLocalService _faqLocalService;

    public FaqLocalServiceWrapper(FaqLocalService faqLocalService) {
        _faqLocalService = faqLocalService;
    }

    /**
    * Adds the faq to the database. Also notifies the appropriate model listeners.
    *
    * @param faq the faq
    * @return the faq that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fr.smile.training.faq.model.Faq addFaq(
        fr.smile.training.faq.model.Faq faq)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _faqLocalService.addFaq(faq);
    }

    /**
    * Creates a new faq with the primary key. Does not add the faq to the database.
    *
    * @param entryId the primary key for the new faq
    * @return the new faq
    */
    @Override
    public fr.smile.training.faq.model.Faq createFaq(long entryId) {
        return _faqLocalService.createFaq(entryId);
    }

    /**
    * Deletes the faq with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entryId the primary key of the faq
    * @return the faq that was removed
    * @throws PortalException if a faq with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fr.smile.training.faq.model.Faq deleteFaq(long entryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _faqLocalService.deleteFaq(entryId);
    }

    /**
    * Deletes the faq from the database. Also notifies the appropriate model listeners.
    *
    * @param faq the faq
    * @return the faq that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fr.smile.training.faq.model.Faq deleteFaq(
        fr.smile.training.faq.model.Faq faq)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _faqLocalService.deleteFaq(faq);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _faqLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _faqLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fr.smile.training.faq.model.impl.FaqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _faqLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fr.smile.training.faq.model.impl.FaqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _faqLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _faqLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _faqLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fr.smile.training.faq.model.Faq fetchFaq(long entryId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _faqLocalService.fetchFaq(entryId);
    }

    /**
    * Returns the faq with the primary key.
    *
    * @param entryId the primary key of the faq
    * @return the faq
    * @throws PortalException if a faq with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fr.smile.training.faq.model.Faq getFaq(long entryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _faqLocalService.getFaq(entryId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _faqLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the faqs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fr.smile.training.faq.model.impl.FaqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of faqs
    * @param end the upper bound of the range of faqs (not inclusive)
    * @return the range of faqs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fr.smile.training.faq.model.Faq> getFaqs(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _faqLocalService.getFaqs(start, end);
    }

    /**
    * Returns the number of faqs.
    *
    * @return the number of faqs
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getFaqsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _faqLocalService.getFaqsCount();
    }

    /**
    * Updates the faq in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param faq the faq
    * @return the faq that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fr.smile.training.faq.model.Faq updateFaq(
        fr.smile.training.faq.model.Faq faq)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _faqLocalService.updateFaq(faq);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _faqLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _faqLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _faqLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public void addFaq(long companyId, long groupId, java.lang.String question,
        java.lang.String answer)
        throws com.liferay.portal.kernel.exception.SystemException {
        _faqLocalService.addFaq(companyId, groupId, question, answer);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public FaqLocalService getWrappedFaqLocalService() {
        return _faqLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedFaqLocalService(FaqLocalService faqLocalService) {
        _faqLocalService = faqLocalService;
    }

    @Override
    public FaqLocalService getWrappedService() {
        return _faqLocalService;
    }

    @Override
    public void setWrappedService(FaqLocalService faqLocalService) {
        _faqLocalService = faqLocalService;
    }
}
