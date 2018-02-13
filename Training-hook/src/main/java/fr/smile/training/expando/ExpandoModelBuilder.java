package fr.smile.training.expando;

import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ArrayUtil;
import com.liferay.portal.kernel.util.UnicodeProperties;
import com.liferay.portal.model.ResourceConstants;
import com.liferay.portal.model.Role;
import com.liferay.portal.model.RoleConstants;
import com.liferay.portal.model.User;
import com.liferay.portal.security.permission.ActionKeys;
import com.liferay.portal.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.service.RoleLocalServiceUtil;
import com.liferay.portlet.expando.model.ExpandoColumn;
import com.liferay.portlet.expando.model.ExpandoTable;
import com.liferay.portlet.expando.service.ExpandoColumnLocalServiceUtil;
import com.liferay.portlet.expando.service.ExpandoTableLocalServiceUtil;

public class ExpandoModelBuilder {
	
	private final static Log log = LogFactoryUtil.getLog(ExpandoModelBuilder.class);
	
	private final static String EXPANDO_TABLE_NAME = "CUSTOM_FIELDS";

	protected long companyId;

	String[] actionIds = new String[] { ActionKeys.VIEW, ActionKeys.UPDATE };
	final Role guestRole, ownerRole, pwerUser;

	public ExpandoModelBuilder(long companyId) throws PortalException,
			SystemException {
		this.companyId = companyId;
		guestRole = RoleLocalServiceUtil
				.getRole(companyId, RoleConstants.GUEST);
		ownerRole = RoleLocalServiceUtil
				.getRole(companyId, RoleConstants.OWNER);
		pwerUser = RoleLocalServiceUtil.getRole(companyId,
				RoleConstants.POWER_USER);

	}

	/**
	 * Create a CUSTOM_FIELDS table in Expando
	 * 
	 * @param classNameId
	 *            classNameId to associated with like {@link User}
	 *            .class.getName()
	 * @return new tableId
	 * @throws PortalException
	 * @throws SystemException
	 */
	protected Long createOrGetCustomTable(long classNameId)
			throws PortalException, SystemException {
		try {
			ExpandoTable et = ExpandoTableLocalServiceUtil.getTable(companyId,
					classNameId, EXPANDO_TABLE_NAME);
			return et.getTableId();
		} catch (PortalException e) {
			log.info(e.getMessage());
			ExpandoTable newTable = ExpandoTableLocalServiceUtil.addTable(
					companyId, classNameId, EXPANDO_TABLE_NAME);
			log.info("Creating UserExpandoTable " + EXPANDO_TABLE_NAME);

			return newTable.getTableId();
		} catch (SystemException e) {
			log.error(e);
		}
		return null;
	}

	protected Long createCustomField(long tableId, String cfName, int cfType,
			String[] cfSettings) throws SystemException {
		ExpandoColumn ec = ExpandoColumnLocalServiceUtil
				.createExpandoColumn(CounterLocalServiceUtil.increment());
		ec.setTableId(tableId);
		ec.setName(cfName);
		ec.setType(cfType);

		UnicodeProperties settingsProperties = new UnicodeProperties();
		if (ArrayUtil.isNotEmpty(cfSettings)) {
			for (String p : cfSettings) {
				settingsProperties.put(p);
			}
			ec.setTypeSettingsProperties(settingsProperties);
		}
		log.info("Adding custom attribute for tableId " + tableId);
		ec.persist();

		return ec.getColumnId();
	}

	/**
	 * Settings permissions on custom-attributs Guest users need access to
	 * Expando values and update
	 * 
	 * @param expandoColumnId
	 * @throws PortalException
	 * @throws SystemException
	 */
	protected void assignGuestPermissionsToExpando(long expandoColumnId)
			throws PortalException, SystemException {
		ResourcePermissionLocalServiceUtil.setResourcePermissions(companyId,
				ExpandoColumn.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL,
				String.valueOf(expandoColumnId), guestRole.getRoleId(),
				actionIds);

		ResourcePermissionLocalServiceUtil.setResourcePermissions(companyId,
				ExpandoColumn.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL,
				String.valueOf(expandoColumnId), ownerRole.getRoleId(),
				actionIds);
		ResourcePermissionLocalServiceUtil.setResourcePermissions(companyId,
				ExpandoColumn.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL,
				String.valueOf(expandoColumnId), pwerUser.getRoleId(),
				actionIds);

	}

}
