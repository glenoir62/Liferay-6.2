package fr.smile.training.faq.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Faq service. Represents a row in the &quot;Faq&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link fr.smile.training.faq.model.impl.FaqModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link fr.smile.training.faq.model.impl.FaqImpl}.
 * </p>
 *
 * @author Guillaume Lenoir
 * @see Faq
 * @see fr.smile.training.faq.model.impl.FaqImpl
 * @see fr.smile.training.faq.model.impl.FaqModelImpl
 * @generated
 */
public interface FaqModel extends BaseModel<Faq> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a faq model instance should use the {@link Faq} interface instead.
     */

    /**
     * Returns the primary key of this faq.
     *
     * @return the primary key of this faq
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this faq.
     *
     * @param primaryKey the primary key of this faq
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the entry ID of this faq.
     *
     * @return the entry ID of this faq
     */
    public long getEntryId();

    /**
     * Sets the entry ID of this faq.
     *
     * @param entryId the entry ID of this faq
     */
    public void setEntryId(long entryId);

    /**
     * Returns the company ID of this faq.
     *
     * @return the company ID of this faq
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this faq.
     *
     * @param companyId the company ID of this faq
     */
    public void setCompanyId(long companyId);

    /**
     * Returns the group ID of this faq.
     *
     * @return the group ID of this faq
     */
    public long getGroupId();

    /**
     * Sets the group ID of this faq.
     *
     * @param groupId the group ID of this faq
     */
    public void setGroupId(long groupId);

    /**
     * Returns the question of this faq.
     *
     * @return the question of this faq
     */
    @AutoEscape
    public String getQuestion();

    /**
     * Sets the question of this faq.
     *
     * @param question the question of this faq
     */
    public void setQuestion(String question);

    /**
     * Returns the answer of this faq.
     *
     * @return the answer of this faq
     */
    @AutoEscape
    public String getAnswer();

    /**
     * Sets the answer of this faq.
     *
     * @param answer the answer of this faq
     */
    public void setAnswer(String answer);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(fr.smile.training.faq.model.Faq faq);

    @Override
    public int hashCode();

    @Override
    public CacheModel<fr.smile.training.faq.model.Faq> toCacheModel();

    @Override
    public fr.smile.training.faq.model.Faq toEscapedModel();

    @Override
    public fr.smile.training.faq.model.Faq toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
