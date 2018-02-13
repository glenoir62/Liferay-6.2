package com.smile.plugins.service.persistence;

import com.liferay.portal.kernel.bean.PortalBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.asset.model.AssetEntry;
import com.liferay.portlet.journal.model.JournalArticle;
import com.liferay.util.dao.orm.CustomSQLUtil;

import java.util.Iterator;
import java.util.List;

public class ExtAssetEntryFinderImpl extends BasePersistenceImpl<AssetEntry> implements ExtAssetEntryFinder {

	public static final String FIND_BY_AND_CATEGORY_IDS = ExtAssetEntryFinder.class.getName() + ".findByAndCategoryIds";

	private static SessionFactory sessionFactory = (SessionFactory) PortalBeanLocatorUtil.locate("liferaySessionFactory");

	public static Class<?> assetEntryImplClass = null;

	private static Log log = LogFactoryUtil.getLog(ExtAssetEntryFinderImpl.class);

	static {
		try {
			assetEntryImplClass = PortalClassLoaderUtil.getClassLoader().loadClass("com.liferay.portlet.asset.model.impl.AssetEntryImpl");
		}
		catch (ClassNotFoundException e) {
			log.error(e);
		}
	}

	protected SQLQuery buildAssetQuerySQL(Session session, boolean count, long[] categoryIds, long[] categoryTypeIds, long groupId) {

		StringBundler sb = new StringBundler();

		long classNameId = PortalUtil.getClassNameId(JournalArticle.class);

		if (count) {
			sb.append("SELECT COUNT(DISTINCT AssetEntry.entryId) AS COUNT_VALUE ");
		}
		else {
			sb.append("SELECT DISTINCT {AssetEntry.*} ");
		}

		sb.append("FROM AssetEntry WHERE (visible = true) ");

		// Category conditions
		buildAllCategoriesSQL(categoryIds, sb);
		buildAllCategoriesSQL(categoryTypeIds, sb);

		// Other conditions

		sb.append(" AND (AssetEntry.groupId = ?)");
		sb.append(" AND (AssetEntry.classNameId = ?)");

		if (!count) {
			sb.append(" ORDER BY AssetEntry.createDate DESC");
		}
		
		SQLQuery q = session.createSQLQuery(sb.toString());

		if (log.isDebugEnabled()) {
			log.debug("SQLQuerysb = " + sb.toString());
			log.debug("groupId = " + groupId);
			log.debug("classNameId = " + classNameId);
		}

		if (count) {
			q.addScalar(COUNT_COLUMN_NAME, Type.LONG);
		}
		else {
			q.addEntity("AssetEntry", assetEntryImplClass);
		}

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);
		qPos.add(classNameId);

		return q;
	}

	private void buildAllCategoriesSQL(long[] categoryIds, StringBundler sb) {

		if (categoryIds != null && categoryIds.length > 0) {
			String sql = CustomSQLUtil.get(FIND_BY_AND_CATEGORY_IDS);
			String categoryIdsString = StringUtil.merge(categoryIds);
			sb.append(" AND (");
			sb.append(StringUtil.replace(sql, "[$CATEGORY_ID$]", categoryIdsString));
			sb.append(StringPool.CLOSE_PARENTHESIS);
		}
	}

	@SuppressWarnings("unchecked")
	public List<AssetEntry> findJournalArticleByGroupIdCategories(int start, int end, long[] categoryIds, long[] categoryTypeIds, long groupId)
		throws SystemException {

		Session session = null;

		try {
			session = sessionFactory.openSession();

			SQLQuery q = buildAssetQuerySQL(session, false, categoryIds, categoryTypeIds, groupId);

			return (List<AssetEntry>) QueryUtil.list(q, getDialect(), start, end);
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
		finally {
			closeSession(session);
		}
	}
	
	@SuppressWarnings("unchecked")
	public int findJournalArticleCountByGroupIdCategories(long[] categoryIds, long[] categoryTypeIds, long groupId) throws SystemException {
		Session session = null;

		try {
			session = openSession();

			SQLQuery q = buildAssetQuerySQL(session, true, categoryIds, categoryTypeIds, groupId);

			Iterator<Long> itr = q.iterate();

			if (itr.hasNext()) {
				Long count = itr.next();

				if (count != null) {
					return count.intValue();
				}
			}

			return 0;
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
		finally {
			closeSession(session);
		}
	}

}
