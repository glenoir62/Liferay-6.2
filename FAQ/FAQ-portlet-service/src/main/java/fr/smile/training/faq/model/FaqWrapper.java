package fr.smile.training.faq.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Faq}.
 * </p>
 *
 * @author Guillaume Lenoir
 * @see Faq
 * @generated
 */
public class FaqWrapper implements Faq, ModelWrapper<Faq> {
    private Faq _faq;

    public FaqWrapper(Faq faq) {
        _faq = faq;
    }

    @Override
    public Class<?> getModelClass() {
        return Faq.class;
    }

    @Override
    public String getModelClassName() {
        return Faq.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("entryId", getEntryId());
        attributes.put("companyId", getCompanyId());
        attributes.put("groupId", getGroupId());
        attributes.put("question", getQuestion());
        attributes.put("answer", getAnswer());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long entryId = (Long) attributes.get("entryId");

        if (entryId != null) {
            setEntryId(entryId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        String question = (String) attributes.get("question");

        if (question != null) {
            setQuestion(question);
        }

        String answer = (String) attributes.get("answer");

        if (answer != null) {
            setAnswer(answer);
        }
    }

    /**
    * Returns the primary key of this faq.
    *
    * @return the primary key of this faq
    */
    @Override
    public long getPrimaryKey() {
        return _faq.getPrimaryKey();
    }

    /**
    * Sets the primary key of this faq.
    *
    * @param primaryKey the primary key of this faq
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _faq.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the entry ID of this faq.
    *
    * @return the entry ID of this faq
    */
    @Override
    public long getEntryId() {
        return _faq.getEntryId();
    }

    /**
    * Sets the entry ID of this faq.
    *
    * @param entryId the entry ID of this faq
    */
    @Override
    public void setEntryId(long entryId) {
        _faq.setEntryId(entryId);
    }

    /**
    * Returns the company ID of this faq.
    *
    * @return the company ID of this faq
    */
    @Override
    public long getCompanyId() {
        return _faq.getCompanyId();
    }

    /**
    * Sets the company ID of this faq.
    *
    * @param companyId the company ID of this faq
    */
    @Override
    public void setCompanyId(long companyId) {
        _faq.setCompanyId(companyId);
    }

    /**
    * Returns the group ID of this faq.
    *
    * @return the group ID of this faq
    */
    @Override
    public long getGroupId() {
        return _faq.getGroupId();
    }

    /**
    * Sets the group ID of this faq.
    *
    * @param groupId the group ID of this faq
    */
    @Override
    public void setGroupId(long groupId) {
        _faq.setGroupId(groupId);
    }

    /**
    * Returns the question of this faq.
    *
    * @return the question of this faq
    */
    @Override
    public java.lang.String getQuestion() {
        return _faq.getQuestion();
    }

    /**
    * Sets the question of this faq.
    *
    * @param question the question of this faq
    */
    @Override
    public void setQuestion(java.lang.String question) {
        _faq.setQuestion(question);
    }

    /**
    * Returns the answer of this faq.
    *
    * @return the answer of this faq
    */
    @Override
    public java.lang.String getAnswer() {
        return _faq.getAnswer();
    }

    /**
    * Sets the answer of this faq.
    *
    * @param answer the answer of this faq
    */
    @Override
    public void setAnswer(java.lang.String answer) {
        _faq.setAnswer(answer);
    }

    @Override
    public boolean isNew() {
        return _faq.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _faq.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _faq.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _faq.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _faq.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _faq.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _faq.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _faq.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _faq.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _faq.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _faq.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new FaqWrapper((Faq) _faq.clone());
    }

    @Override
    public int compareTo(fr.smile.training.faq.model.Faq faq) {
        return _faq.compareTo(faq);
    }

    @Override
    public int hashCode() {
        return _faq.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fr.smile.training.faq.model.Faq> toCacheModel() {
        return _faq.toCacheModel();
    }

    @Override
    public fr.smile.training.faq.model.Faq toEscapedModel() {
        return new FaqWrapper(_faq.toEscapedModel());
    }

    @Override
    public fr.smile.training.faq.model.Faq toUnescapedModel() {
        return new FaqWrapper(_faq.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _faq.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _faq.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _faq.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FaqWrapper)) {
            return false;
        }

        FaqWrapper faqWrapper = (FaqWrapper) obj;

        if (Validator.equals(_faq, faqWrapper._faq)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Faq getWrappedFaq() {
        return _faq;
    }

    @Override
    public Faq getWrappedModel() {
        return _faq;
    }

    @Override
    public void resetOriginalValues() {
        _faq.resetOriginalValues();
    }
}
