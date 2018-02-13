package fr.smile.training.faq.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fr.smile.training.faq.model.Faq;

import java.util.List;

/**
 * The persistence utility for the faq service. This utility wraps {@link FaqPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Guillaume Lenoir
 * @see FaqPersistence
 * @see FaqPersistenceImpl
 * @generated
 */
public class FaqUtil {
    private static FaqPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Faq faq) {
        getPersistence().clearCache(faq);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Faq> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Faq> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Faq> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Faq update(Faq faq) throws SystemException {
        return getPersistence().update(faq);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Faq update(Faq faq, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(faq, serviceContext);
    }

    /**
    * Caches the faq in the entity cache if it is enabled.
    *
    * @param faq the faq
    */
    public static void cacheResult(fr.smile.training.faq.model.Faq faq) {
        getPersistence().cacheResult(faq);
    }

    /**
    * Caches the faqs in the entity cache if it is enabled.
    *
    * @param faqs the faqs
    */
    public static void cacheResult(
        java.util.List<fr.smile.training.faq.model.Faq> faqs) {
        getPersistence().cacheResult(faqs);
    }

    /**
    * Creates a new faq with the primary key. Does not add the faq to the database.
    *
    * @param entryId the primary key for the new faq
    * @return the new faq
    */
    public static fr.smile.training.faq.model.Faq create(long entryId) {
        return getPersistence().create(entryId);
    }

    /**
    * Removes the faq with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entryId the primary key of the faq
    * @return the faq that was removed
    * @throws fr.smile.training.faq.NoSuchFaqException if a faq with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fr.smile.training.faq.model.Faq remove(long entryId)
        throws com.liferay.portal.kernel.exception.SystemException,
            fr.smile.training.faq.NoSuchFaqException {
        return getPersistence().remove(entryId);
    }

    public static fr.smile.training.faq.model.Faq updateImpl(
        fr.smile.training.faq.model.Faq faq)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(faq);
    }

    /**
    * Returns the faq with the primary key or throws a {@link fr.smile.training.faq.NoSuchFaqException} if it could not be found.
    *
    * @param entryId the primary key of the faq
    * @return the faq
    * @throws fr.smile.training.faq.NoSuchFaqException if a faq with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fr.smile.training.faq.model.Faq findByPrimaryKey(long entryId)
        throws com.liferay.portal.kernel.exception.SystemException,
            fr.smile.training.faq.NoSuchFaqException {
        return getPersistence().findByPrimaryKey(entryId);
    }

    /**
    * Returns the faq with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entryId the primary key of the faq
    * @return the faq, or <code>null</code> if a faq with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fr.smile.training.faq.model.Faq fetchByPrimaryKey(
        long entryId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(entryId);
    }

    /**
    * Returns all the faqs.
    *
    * @return the faqs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fr.smile.training.faq.model.Faq> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<fr.smile.training.faq.model.Faq> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the faqs.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fr.smile.training.faq.model.impl.FaqModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of faqs
    * @param end the upper bound of the range of faqs (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of faqs
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fr.smile.training.faq.model.Faq> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the faqs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of faqs.
    *
    * @return the number of faqs
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static FaqPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (FaqPersistence) PortletBeanLocatorUtil.locate(fr.smile.training.faq.service.ClpSerializer.getServletContextName(),
                    FaqPersistence.class.getName());

            ReferenceRegistry.registerReference(FaqUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(FaqPersistence persistence) {
    }
}
