package fr.smile.training.faq.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fr.smile.training.faq.service.ClpSerializer;
import fr.smile.training.faq.service.FaqLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class FaqClp extends BaseModelImpl<Faq> implements Faq {
    private long _entryId;
    private long _companyId;
    private long _groupId;
    private String _question;
    private String _answer;
    private BaseModel<?> _faqRemoteModel;
    private Class<?> _clpSerializerClass = fr.smile.training.faq.service.ClpSerializer.class;

    public FaqClp() {
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
    public long getPrimaryKey() {
        return _entryId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEntryId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _entryId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getEntryId() {
        return _entryId;
    }

    @Override
    public void setEntryId(long entryId) {
        _entryId = entryId;

        if (_faqRemoteModel != null) {
            try {
                Class<?> clazz = _faqRemoteModel.getClass();

                Method method = clazz.getMethod("setEntryId", long.class);

                method.invoke(_faqRemoteModel, entryId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_faqRemoteModel != null) {
            try {
                Class<?> clazz = _faqRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_faqRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_faqRemoteModel != null) {
            try {
                Class<?> clazz = _faqRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_faqRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getQuestion() {
        return _question;
    }

    @Override
    public void setQuestion(String question) {
        _question = question;

        if (_faqRemoteModel != null) {
            try {
                Class<?> clazz = _faqRemoteModel.getClass();

                Method method = clazz.getMethod("setQuestion", String.class);

                method.invoke(_faqRemoteModel, question);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAnswer() {
        return _answer;
    }

    @Override
    public void setAnswer(String answer) {
        _answer = answer;

        if (_faqRemoteModel != null) {
            try {
                Class<?> clazz = _faqRemoteModel.getClass();

                Method method = clazz.getMethod("setAnswer", String.class);

                method.invoke(_faqRemoteModel, answer);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getFaqRemoteModel() {
        return _faqRemoteModel;
    }

    public void setFaqRemoteModel(BaseModel<?> faqRemoteModel) {
        _faqRemoteModel = faqRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _faqRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_faqRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            FaqLocalServiceUtil.addFaq(this);
        } else {
            FaqLocalServiceUtil.updateFaq(this);
        }
    }

    @Override
    public Faq toEscapedModel() {
        return (Faq) ProxyUtil.newProxyInstance(Faq.class.getClassLoader(),
            new Class[] { Faq.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        FaqClp clone = new FaqClp();

        clone.setEntryId(getEntryId());
        clone.setCompanyId(getCompanyId());
        clone.setGroupId(getGroupId());
        clone.setQuestion(getQuestion());
        clone.setAnswer(getAnswer());

        return clone;
    }

    @Override
    public int compareTo(Faq faq) {
        long primaryKey = faq.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof FaqClp)) {
            return false;
        }

        FaqClp faq = (FaqClp) obj;

        long primaryKey = faq.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{entryId=");
        sb.append(getEntryId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", question=");
        sb.append(getQuestion());
        sb.append(", answer=");
        sb.append(getAnswer());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("fr.smile.training.faq.model.Faq");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>entryId</column-name><column-value><![CDATA[");
        sb.append(getEntryId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>question</column-name><column-value><![CDATA[");
        sb.append(getQuestion());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>answer</column-name><column-value><![CDATA[");
        sb.append(getAnswer());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
