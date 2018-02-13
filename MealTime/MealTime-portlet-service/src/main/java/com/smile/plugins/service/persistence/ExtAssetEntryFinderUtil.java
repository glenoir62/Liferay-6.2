package com.smile.plugins.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class ExtAssetEntryFinderUtil {
    private static ExtAssetEntryFinder _finder;

    public static java.util.List<com.liferay.portlet.asset.model.AssetEntry> findJournalArticleByGroupIdCategories(
        int start, int end, long[] categoryIds, long[] categoryTypeIds,
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findJournalArticleByGroupIdCategories(start, end,
            categoryIds, categoryTypeIds, groupId);
    }

    public static int findJournalArticleCountByGroupIdCategories(
        long[] categoryIds, long[] categoryTypeIds, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getFinder()
                   .findJournalArticleCountByGroupIdCategories(categoryIds,
            categoryTypeIds, groupId);
    }

    public static ExtAssetEntryFinder getFinder() {
        if (_finder == null) {
            _finder = (ExtAssetEntryFinder) PortletBeanLocatorUtil.locate(com.smile.plugins.service.ClpSerializer.getServletContextName(),
                    ExtAssetEntryFinder.class.getName());

            ReferenceRegistry.registerReference(ExtAssetEntryFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(ExtAssetEntryFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(ExtAssetEntryFinderUtil.class,
            "_finder");
    }
}
