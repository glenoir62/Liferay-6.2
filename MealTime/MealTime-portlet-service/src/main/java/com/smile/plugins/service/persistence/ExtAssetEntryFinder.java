package com.smile.plugins.service.persistence;

public interface ExtAssetEntryFinder {
    public java.util.List<com.liferay.portlet.asset.model.AssetEntry> findJournalArticleByGroupIdCategories(
        int start, int end, long[] categoryIds, long[] categoryTypeIds,
        long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int findJournalArticleCountByGroupIdCategories(long[] categoryIds,
        long[] categoryTypeIds, long groupId)
        throws com.liferay.portal.kernel.exception.SystemException;
}
