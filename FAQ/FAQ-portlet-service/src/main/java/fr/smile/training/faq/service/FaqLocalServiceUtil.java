package fr.smile.training.faq.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Faq. This utility wraps
 * {@link fr.smile.training.faq.service.impl.FaqLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Guillaume Lenoir
 * @see FaqLocalService
 * @see fr.smile.training.faq.service.base.FaqLocalServiceBaseImpl
 * @see fr.smile.training.faq.service.impl.FaqLocalServiceImpl
 * @generated
 */
public class FaqLocalServiceUtil {
    private static FaqLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fr.smile.training.faq.service.impl.FaqLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the faq to the database. Also notifies the appropriate model listeners.
    *
    * @param faq the faq
    * @return the faq that was added
    * @throws SystemException if a system exception occurred
    */
    public static fr.smile.training.faq.model.Faq addFaq(
        fr.smile.training.faq.model.Faq faq)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addFaq(faq);
    }

    /**
    * Creates a new faq with the primary key. Does not add the faq to the database.
    *
    * @param entryId the primary key for the new faq
    * @return the new faq
    */
    public static fr.smile.training.faq.model.Faq createFaq(long entryId) {
        return getService().createFaq(entryId);
    }

    /**
    * Deletes the faq with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entryId the primary key of the faq
    * @return the faq that was removed
    * @throws PortalException if a faq with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fr.smile.training.faq.model.Faq deleteFaq(long entryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteFaq(entryId);
    }

    /**
    * Deletes the faq from the database. Also notifies the appropriate model listeners.
    *
    * @param faq the faq
    * @return the faq that was removed
    * @throws SystemException if a system exception occurred
    */
    public static fr.smile.training.faq.model.Faq deleteFaq(
        fr.smile.training.faq.model.Faq faq)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteFaq(faq);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
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
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static fr.smile.training.faq.model.Faq fetchFaq(long entryId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchFaq(entryId);
    }

    /**
    * Returns the faq with the primary key.
    *
    * @param entryId the primary key of the faq
    * @return the faq
    * @throws PortalException if a faq with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fr.smile.training.faq.model.Faq getFaq(long entryId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getFaq(entryId);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
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
    public static java.util.List<fr.smile.training.faq.model.Faq> getFaqs(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFaqs(start, end);
    }

    /**
    * Returns the number of faqs.
    *
    * @return the number of faqs
    * @throws SystemException if a system exception occurred
    */
    public static int getFaqsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getFaqsCount();
    }

    /**
    * Updates the faq in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param faq the faq
    * @return the faq that was updated
    * @throws SystemException if a system exception occurred
    */
    public static fr.smile.training.faq.model.Faq updateFaq(
        fr.smile.training.faq.model.Faq faq)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateFaq(faq);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static void addFaq(long companyId, long groupId,
        java.lang.String question, java.lang.String answer)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().addFaq(companyId, groupId, question, answer);
    }

    public static void clearService() {
        _service = null;
    }

    public static FaqLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    FaqLocalService.class.getName());

            if (invokableLocalService instanceof FaqLocalService) {
                _service = (FaqLocalService) invokableLocalService;
            } else {
                _service = new FaqLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(FaqLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(FaqLocalService service) {
    }
}
