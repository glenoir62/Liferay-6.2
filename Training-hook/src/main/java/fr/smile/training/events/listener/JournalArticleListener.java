package fr.smile.training.events.listener;

import com.liferay.portal.ModelListenerException;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.model.BaseModelListener;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portlet.asset.service.AssetTagLocalServiceUtil;
import com.liferay.portlet.journal.model.JournalArticle;

import java.util.Iterator;
import java.util.List;

public class JournalArticleListener extends BaseModelListener<JournalArticle> {

	/**
	 * The logger
	 */
	private static Log log = LogFactoryUtil.getLog(JournalArticleListener.class);

	@Override
	public void onBeforeUpdate(JournalArticle model)
			throws ModelListenerException {
		log.info("JournalArticleListener onBeforeUpdate");
		
		super.onBeforeUpdate(model);
	}
	
	@Override
	public void onAfterCreate(JournalArticle model)
			throws ModelListenerException {
		log.info("JournalArticleListener onAfterCreate");
		super.onAfterCreate(model);
	}
	
	@Override
	public void onAfterRemove(JournalArticle model)
			throws ModelListenerException {
		log.info("JournalArticleListener onAfterRemove");
		super.onAfterRemove(model);
	}

	@Override
	public void onAfterUpdate(JournalArticle journalArticle) throws ModelListenerException {
		
		log.info("JournalArticleListener onAfterUpdate");
		
		if (journalArticle != null && !journalArticle.isNew() && journalArticle.getStatus() == WorkflowConstants.STATUS_APPROVED) {

			String[] tags = null;

			try {
				tags = AssetTagLocalServiceUtil.getTagNames(JournalArticle.class.getName(),
						journalArticle.getResourcePrimKey());
			} catch (SystemException se) {
				log.error(se);
			}

			if (ArrayUtil.isNotEmpty(tags)) {

				boolean updateCGV = ArrayUtil.contains(tags, "cgv");
				boolean updateCGU = ArrayUtil.contains(tags, "cgu");

				try {
					List<User> users = UserLocalServiceUtil.getCompanyUsers(journalArticle.getCompanyId(),
							QueryUtil.ALL_POS, QueryUtil.ALL_POS);

					Iterator<User> iterator = users.iterator();

					while (iterator.hasNext()) {
						User user = (User) iterator.next();

						if (updateCGV) {
							user.getExpandoBridge().setAttribute("cgv", false);
						}

						if (updateCGU) {
							user.getExpandoBridge().setAttribute("cgu", false);
						}
					}
				} catch (SystemException e) {
					log.error(e);
				}
			}
		}
	}
}
