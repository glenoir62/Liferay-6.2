package com.smile.plugins.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for ExtAssetEntry. This utility wraps
 * {@link com.smile.plugins.service.impl.ExtAssetEntryLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author guillaume Lenoir
 * @see ExtAssetEntryLocalService
 * @see com.smile.plugins.service.base.ExtAssetEntryLocalServiceBaseImpl
 * @see com.smile.plugins.service.impl.ExtAssetEntryLocalServiceImpl
 * @generated
 */
public class ExtAssetEntryLocalServiceUtil {
    private static ExtAssetEntryLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.smile.plugins.service.impl.ExtAssetEntryLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

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

    public static java.util.List<com.liferay.portlet.asset.model.AssetEntry> getJournalArticleByGroupIdCategories(
        int start, int end, long[] categoryIds, long[] categoryTypeIdsList,
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getJournalArticleByGroupIdCategories(start, end,
            categoryIds, categoryTypeIdsList, groupId);
    }

    public static int getJournalArticleCountByGroupIdCategories(
        long[] categoryIds, long[] categoryTypeIdsList, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getJournalArticleCountByGroupIdCategories(categoryIds,
            categoryTypeIdsList, groupId);
    }

    public static void clearService() {
        _service = null;
    }

    public static ExtAssetEntryLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    ExtAssetEntryLocalService.class.getName());

            if (invokableLocalService instanceof ExtAssetEntryLocalService) {
                _service = (ExtAssetEntryLocalService) invokableLocalService;
            } else {
                _service = new ExtAssetEntryLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(ExtAssetEntryLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(ExtAssetEntryLocalService service) {
    }
}
