package com.smile.plugins.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.InfrastructureUtil;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.liferay.portlet.asset.service.persistence.AssetEntryPersistence;

import com.smile.plugins.service.ExtAssetEntryLocalService;
import com.smile.plugins.service.persistence.ExtAssetEntryFinder;
import com.smile.plugins.service.persistence.RestaurantPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the ext asset entry local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.smile.plugins.service.impl.ExtAssetEntryLocalServiceImpl}.
 * </p>
 *
 * @author guillaume Lenoir
 * @see com.smile.plugins.service.impl.ExtAssetEntryLocalServiceImpl
 * @see com.smile.plugins.service.ExtAssetEntryLocalServiceUtil
 * @generated
 */
public abstract class ExtAssetEntryLocalServiceBaseImpl
    extends BaseLocalServiceImpl implements ExtAssetEntryLocalService,
        IdentifiableBean {
    @BeanReference(type = com.smile.plugins.service.ExtAssetEntryLocalService.class)
    protected com.smile.plugins.service.ExtAssetEntryLocalService extAssetEntryLocalService;
    @BeanReference(type = ExtAssetEntryFinder.class)
    protected ExtAssetEntryFinder extAssetEntryFinder;
    @BeanReference(type = com.smile.plugins.service.RestaurantLocalService.class)
    protected com.smile.plugins.service.RestaurantLocalService restaurantLocalService;
    @BeanReference(type = com.smile.plugins.service.RestaurantService.class)
    protected com.smile.plugins.service.RestaurantService restaurantService;
    @BeanReference(type = RestaurantPersistence.class)
    protected RestaurantPersistence restaurantPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    @BeanReference(type = com.liferay.portlet.asset.service.AssetEntryLocalService.class)
    protected com.liferay.portlet.asset.service.AssetEntryLocalService assetEntryLocalService;
    @BeanReference(type = com.liferay.portlet.asset.service.AssetEntryService.class)
    protected com.liferay.portlet.asset.service.AssetEntryService assetEntryService;
    @BeanReference(type = AssetEntryPersistence.class)
    protected AssetEntryPersistence assetEntryPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private ExtAssetEntryLocalServiceClpInvoker _clpInvoker = new ExtAssetEntryLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.smile.plugins.service.ExtAssetEntryLocalServiceUtil} to access the ext asset entry local service.
     */

    /**
     * Returns the ext asset entry local service.
     *
     * @return the ext asset entry local service
     */
    public com.smile.plugins.service.ExtAssetEntryLocalService getExtAssetEntryLocalService() {
        return extAssetEntryLocalService;
    }

    /**
     * Sets the ext asset entry local service.
     *
     * @param extAssetEntryLocalService the ext asset entry local service
     */
    public void setExtAssetEntryLocalService(
        com.smile.plugins.service.ExtAssetEntryLocalService extAssetEntryLocalService) {
        this.extAssetEntryLocalService = extAssetEntryLocalService;
    }

    /**
     * Returns the ext asset entry finder.
     *
     * @return the ext asset entry finder
     */
    public ExtAssetEntryFinder getExtAssetEntryFinder() {
        return extAssetEntryFinder;
    }

    /**
     * Sets the ext asset entry finder.
     *
     * @param extAssetEntryFinder the ext asset entry finder
     */
    public void setExtAssetEntryFinder(ExtAssetEntryFinder extAssetEntryFinder) {
        this.extAssetEntryFinder = extAssetEntryFinder;
    }

    /**
     * Returns the restaurant local service.
     *
     * @return the restaurant local service
     */
    public com.smile.plugins.service.RestaurantLocalService getRestaurantLocalService() {
        return restaurantLocalService;
    }

    /**
     * Sets the restaurant local service.
     *
     * @param restaurantLocalService the restaurant local service
     */
    public void setRestaurantLocalService(
        com.smile.plugins.service.RestaurantLocalService restaurantLocalService) {
        this.restaurantLocalService = restaurantLocalService;
    }

    /**
     * Returns the restaurant remote service.
     *
     * @return the restaurant remote service
     */
    public com.smile.plugins.service.RestaurantService getRestaurantService() {
        return restaurantService;
    }

    /**
     * Sets the restaurant remote service.
     *
     * @param restaurantService the restaurant remote service
     */
    public void setRestaurantService(
        com.smile.plugins.service.RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    /**
     * Returns the restaurant persistence.
     *
     * @return the restaurant persistence
     */
    public RestaurantPersistence getRestaurantPersistence() {
        return restaurantPersistence;
    }

    /**
     * Sets the restaurant persistence.
     *
     * @param restaurantPersistence the restaurant persistence
     */
    public void setRestaurantPersistence(
        RestaurantPersistence restaurantPersistence) {
        this.restaurantPersistence = restaurantPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    /**
     * Returns the asset entry local service.
     *
     * @return the asset entry local service
     */
    public com.liferay.portlet.asset.service.AssetEntryLocalService getAssetEntryLocalService() {
        return assetEntryLocalService;
    }

    /**
     * Sets the asset entry local service.
     *
     * @param assetEntryLocalService the asset entry local service
     */
    public void setAssetEntryLocalService(
        com.liferay.portlet.asset.service.AssetEntryLocalService assetEntryLocalService) {
        this.assetEntryLocalService = assetEntryLocalService;
    }

    /**
     * Returns the asset entry remote service.
     *
     * @return the asset entry remote service
     */
    public com.liferay.portlet.asset.service.AssetEntryService getAssetEntryService() {
        return assetEntryService;
    }

    /**
     * Sets the asset entry remote service.
     *
     * @param assetEntryService the asset entry remote service
     */
    public void setAssetEntryService(
        com.liferay.portlet.asset.service.AssetEntryService assetEntryService) {
        this.assetEntryService = assetEntryService;
    }

    /**
     * Returns the asset entry persistence.
     *
     * @return the asset entry persistence
     */
    public AssetEntryPersistence getAssetEntryPersistence() {
        return assetEntryPersistence;
    }

    /**
     * Sets the asset entry persistence.
     *
     * @param assetEntryPersistence the asset entry persistence
     */
    public void setAssetEntryPersistence(
        AssetEntryPersistence assetEntryPersistence) {
        this.assetEntryPersistence = assetEntryPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();
    }

    public void destroy() {
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = InfrastructureUtil.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}