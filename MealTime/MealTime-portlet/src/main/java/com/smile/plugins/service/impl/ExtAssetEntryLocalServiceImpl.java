package com.smile.plugins.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portlet.asset.model.AssetEntry;
import com.smile.plugins.service.base.ExtAssetEntryLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the ext asset entry local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.smile.plugins.service.ExtAssetEntryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author guillaume Lenoir
 * @see com.smile.plugins.service.base.ExtAssetEntryLocalServiceBaseImpl
 * @see com.smile.plugins.service.ExtAssetEntryLocalServiceUtil
 */
public class ExtAssetEntryLocalServiceImpl
    extends ExtAssetEntryLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.smile.plugins.service.ExtAssetEntryLocalServiceUtil} to access the ext asset entry local service.
     */
	
	public List<AssetEntry> getJournalArticleByGroupIdCategories(int start, int end,long[] categoryIds, long[] categoryTypeIdsList, long groupId) throws SystemException {
		return extAssetEntryFinder.findJournalArticleByGroupIdCategories(start, end, categoryIds, categoryTypeIdsList, groupId);
	}
	
	public int getJournalArticleCountByGroupIdCategories(long[] categoryIds, long[] categoryTypeIdsList, long groupId) throws SystemException {
		return extAssetEntryFinder.findJournalArticleCountByGroupIdCategories(categoryIds, categoryTypeIdsList, groupId);
	}
}
