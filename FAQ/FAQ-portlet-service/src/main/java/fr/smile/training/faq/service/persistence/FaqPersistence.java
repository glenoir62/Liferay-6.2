package fr.smile.training.faq.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fr.smile.training.faq.model.Faq;

/**
 * The persistence interface for the faq service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Guillaume Lenoir
 * @see FaqPersistenceImpl
 * @see FaqUtil
 * @generated
 */
public interface FaqPersistence extends BasePersistence<Faq> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link FaqUtil} to access the faq persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the faq in the entity cache if it is enabled.
    *
    * @param faq the faq
    */
    public void cacheResult(fr.smile.training.faq.model.Faq faq);

    /**
    * Caches the faqs in the entity cache if it is enabled.
    *
    * @param faqs the faqs
    */
    public void cacheResult(
        java.util.List<fr.smile.training.faq.model.Faq> faqs);

    /**
    * Creates a new faq with the primary key. Does not add the faq to the database.
    *
    * @param entryId the primary key for the new faq
    * @return the new faq
    */
    public fr.smile.training.faq.model.Faq create(long entryId);

    /**
    * Removes the faq with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param entryId the primary key of the faq
    * @return the faq that was removed
    * @throws fr.smile.training.faq.NoSuchFaqException if a faq with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fr.smile.training.faq.model.Faq remove(long entryId)
        throws com.liferay.portal.kernel.exception.SystemException,
            fr.smile.training.faq.NoSuchFaqException;

    public fr.smile.training.faq.model.Faq updateImpl(
        fr.smile.training.faq.model.Faq faq)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the faq with the primary key or throws a {@link fr.smile.training.faq.NoSuchFaqException} if it could not be found.
    *
    * @param entryId the primary key of the faq
    * @return the faq
    * @throws fr.smile.training.faq.NoSuchFaqException if a faq with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fr.smile.training.faq.model.Faq findByPrimaryKey(long entryId)
        throws com.liferay.portal.kernel.exception.SystemException,
            fr.smile.training.faq.NoSuchFaqException;

    /**
    * Returns the faq with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param entryId the primary key of the faq
    * @return the faq, or <code>null</code> if a faq with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fr.smile.training.faq.model.Faq fetchByPrimaryKey(long entryId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the faqs.
    *
    * @return the faqs
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fr.smile.training.faq.model.Faq> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fr.smile.training.faq.model.Faq> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fr.smile.training.faq.model.Faq> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the faqs from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of faqs.
    *
    * @return the number of faqs
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
