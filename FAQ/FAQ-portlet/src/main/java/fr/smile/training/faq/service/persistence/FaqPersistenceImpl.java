package fr.smile.training.faq.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import fr.smile.training.faq.NoSuchFaqException;
import fr.smile.training.faq.model.Faq;
import fr.smile.training.faq.model.impl.FaqImpl;
import fr.smile.training.faq.model.impl.FaqModelImpl;
import fr.smile.training.faq.service.persistence.FaqPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the faq service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Guillaume Lenoir
 * @see FaqPersistence
 * @see FaqUtil
 * @generated
 */
public class FaqPersistenceImpl extends BasePersistenceImpl<Faq>
    implements FaqPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link FaqUtil} to access the faq persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = FaqImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(FaqModelImpl.ENTITY_CACHE_ENABLED,
            FaqModelImpl.FINDER_CACHE_ENABLED, FaqImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(FaqModelImpl.ENTITY_CACHE_ENABLED,
            FaqModelImpl.FINDER_CACHE_ENABLED, FaqImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(FaqModelImpl.ENTITY_CACHE_ENABLED,
            FaqModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_FAQ = "SELECT faq FROM Faq faq";
    private static final String _SQL_COUNT_FAQ = "SELECT COUNT(faq) FROM Faq faq";
    private static final String _ORDER_BY_ENTITY_ALIAS = "faq.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Faq exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(FaqPersistenceImpl.class);
    private static Faq _nullFaq = new FaqImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Faq> toCacheModel() {
                return _nullFaqCacheModel;
            }
        };

    private static CacheModel<Faq> _nullFaqCacheModel = new CacheModel<Faq>() {
            @Override
            public Faq toEntityModel() {
                return _nullFaq;
            }
        };

    public FaqPersistenceImpl() {
        setModelClass(Faq.class);
    }

    /**
     * Caches the faq in the entity cache if it is enabled.
     *
     * @param faq the faq
     */
    @Override
    public void cacheResult(Faq faq) {
        EntityCacheUtil.putResult(FaqModelImpl.ENTITY_CACHE_ENABLED,
            FaqImpl.class, faq.getPrimaryKey(), faq);

        faq.resetOriginalValues();
    }

    /**
     * Caches the faqs in the entity cache if it is enabled.
     *
     * @param faqs the faqs
     */
    @Override
    public void cacheResult(List<Faq> faqs) {
        for (Faq faq : faqs) {
            if (EntityCacheUtil.getResult(FaqModelImpl.ENTITY_CACHE_ENABLED,
                        FaqImpl.class, faq.getPrimaryKey()) == null) {
                cacheResult(faq);
            } else {
                faq.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all faqs.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(FaqImpl.class.getName());
        }

        EntityCacheUtil.clearCache(FaqImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the faq.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Faq faq) {
        EntityCacheUtil.removeResult(FaqModelImpl.ENTITY_CACHE_ENABLED,
            FaqImpl.class, faq.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Faq> faqs) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Faq faq : faqs) {
            EntityCacheUtil.removeResult(FaqModelImpl.ENTITY_CACHE_ENABLED,
                FaqImpl.class, faq.getPrimaryKey());
        }
    }

    /**
     * Creates a new faq with the primary key. Does not add the faq to the database.
     *
     * @param entryId the primary key for the new faq
     * @return the new faq
     */
    @Override
    public Faq create(long entryId) {
        Faq faq = new FaqImpl();

        faq.setNew(true);
        faq.setPrimaryKey(entryId);

        return faq;
    }

    /**
     * Removes the faq with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param entryId the primary key of the faq
     * @return the faq that was removed
     * @throws fr.smile.training.faq.NoSuchFaqException if a faq with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Faq remove(long entryId) throws NoSuchFaqException, SystemException {
        return remove((Serializable) entryId);
    }

    /**
     * Removes the faq with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the faq
     * @return the faq that was removed
     * @throws fr.smile.training.faq.NoSuchFaqException if a faq with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Faq remove(Serializable primaryKey)
        throws NoSuchFaqException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Faq faq = (Faq) session.get(FaqImpl.class, primaryKey);

            if (faq == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchFaqException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(faq);
        } catch (NoSuchFaqException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Faq removeImpl(Faq faq) throws SystemException {
        faq = toUnwrappedModel(faq);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(faq)) {
                faq = (Faq) session.get(FaqImpl.class, faq.getPrimaryKeyObj());
            }

            if (faq != null) {
                session.delete(faq);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (faq != null) {
            clearCache(faq);
        }

        return faq;
    }

    @Override
    public Faq updateImpl(fr.smile.training.faq.model.Faq faq)
        throws SystemException {
        faq = toUnwrappedModel(faq);

        boolean isNew = faq.isNew();

        Session session = null;

        try {
            session = openSession();

            if (faq.isNew()) {
                session.save(faq);

                faq.setNew(false);
            } else {
                session.merge(faq);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(FaqModelImpl.ENTITY_CACHE_ENABLED,
            FaqImpl.class, faq.getPrimaryKey(), faq);

        return faq;
    }

    protected Faq toUnwrappedModel(Faq faq) {
        if (faq instanceof FaqImpl) {
            return faq;
        }

        FaqImpl faqImpl = new FaqImpl();

        faqImpl.setNew(faq.isNew());
        faqImpl.setPrimaryKey(faq.getPrimaryKey());

        faqImpl.setEntryId(faq.getEntryId());
        faqImpl.setCompanyId(faq.getCompanyId());
        faqImpl.setGroupId(faq.getGroupId());
        faqImpl.setQuestion(faq.getQuestion());
        faqImpl.setAnswer(faq.getAnswer());

        return faqImpl;
    }

    /**
     * Returns the faq with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the faq
     * @return the faq
     * @throws fr.smile.training.faq.NoSuchFaqException if a faq with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Faq findByPrimaryKey(Serializable primaryKey)
        throws NoSuchFaqException, SystemException {
        Faq faq = fetchByPrimaryKey(primaryKey);

        if (faq == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchFaqException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return faq;
    }

    /**
     * Returns the faq with the primary key or throws a {@link fr.smile.training.faq.NoSuchFaqException} if it could not be found.
     *
     * @param entryId the primary key of the faq
     * @return the faq
     * @throws fr.smile.training.faq.NoSuchFaqException if a faq with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Faq findByPrimaryKey(long entryId)
        throws NoSuchFaqException, SystemException {
        return findByPrimaryKey((Serializable) entryId);
    }

    /**
     * Returns the faq with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the faq
     * @return the faq, or <code>null</code> if a faq with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Faq fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Faq faq = (Faq) EntityCacheUtil.getResult(FaqModelImpl.ENTITY_CACHE_ENABLED,
                FaqImpl.class, primaryKey);

        if (faq == _nullFaq) {
            return null;
        }

        if (faq == null) {
            Session session = null;

            try {
                session = openSession();

                faq = (Faq) session.get(FaqImpl.class, primaryKey);

                if (faq != null) {
                    cacheResult(faq);
                } else {
                    EntityCacheUtil.putResult(FaqModelImpl.ENTITY_CACHE_ENABLED,
                        FaqImpl.class, primaryKey, _nullFaq);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(FaqModelImpl.ENTITY_CACHE_ENABLED,
                    FaqImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return faq;
    }

    /**
     * Returns the faq with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param entryId the primary key of the faq
     * @return the faq, or <code>null</code> if a faq with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Faq fetchByPrimaryKey(long entryId) throws SystemException {
        return fetchByPrimaryKey((Serializable) entryId);
    }

    /**
     * Returns all the faqs.
     *
     * @return the faqs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Faq> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Faq> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Faq> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Faq> list = (List<Faq>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_FAQ);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_FAQ;

                if (pagination) {
                    sql = sql.concat(FaqModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Faq>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Faq>(list);
                } else {
                    list = (List<Faq>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the faqs from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Faq faq : findAll()) {
            remove(faq);
        }
    }

    /**
     * Returns the number of faqs.
     *
     * @return the number of faqs
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_FAQ);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the faq persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fr.smile.training.faq.model.Faq")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Faq>> listenersList = new ArrayList<ModelListener<Faq>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Faq>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(FaqImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
