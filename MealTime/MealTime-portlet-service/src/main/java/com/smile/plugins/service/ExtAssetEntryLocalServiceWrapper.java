package com.smile.plugins.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ExtAssetEntryLocalService}.
 *
 * @author guillaume Lenoir
 * @see ExtAssetEntryLocalService
 * @generated
 */
public class ExtAssetEntryLocalServiceWrapper
    implements ExtAssetEntryLocalService,
        ServiceWrapper<ExtAssetEntryLocalService> {
    private ExtAssetEntryLocalService _extAssetEntryLocalService;

    public ExtAssetEntryLocalServiceWrapper(
        ExtAssetEntryLocalService extAssetEntryLocalService) {
        _extAssetEntryLocalService = extAssetEntryLocalService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _extAssetEntryLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _extAssetEntryLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _extAssetEntryLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<com.liferay.portlet.asset.model.AssetEntry> getJournalArticleByGroupIdCategories(
        int start, int end, long[] categoryIds, long[] categoryTypeIdsList,
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _extAssetEntryLocalService.getJournalArticleByGroupIdCategories(start,
            end, categoryIds, categoryTypeIdsList, groupId);
    }

    @Override
    public int getJournalArticleCountByGroupIdCategories(long[] categoryIds,
        long[] categoryTypeIdsList, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _extAssetEntryLocalService.getJournalArticleCountByGroupIdCategories(categoryIds,
            categoryTypeIdsList, groupId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ExtAssetEntryLocalService getWrappedExtAssetEntryLocalService() {
        return _extAssetEntryLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedExtAssetEntryLocalService(
        ExtAssetEntryLocalService extAssetEntryLocalService) {
        _extAssetEntryLocalService = extAssetEntryLocalService;
    }

    @Override
    public ExtAssetEntryLocalService getWrappedService() {
        return _extAssetEntryLocalService;
    }

    @Override
    public void setWrappedService(
        ExtAssetEntryLocalService extAssetEntryLocalService) {
        _extAssetEntryLocalService = extAssetEntryLocalService;
    }
}
