package fr.smile.training.faq.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fr.smile.training.faq.service.http.FaqServiceSoap}.
 *
 * @author Guillaume Lenoir
 * @see fr.smile.training.faq.service.http.FaqServiceSoap
 * @generated
 */
public class FaqSoap implements Serializable {
    private long _entryId;
    private long _companyId;
    private long _groupId;
    private String _question;
    private String _answer;

    public FaqSoap() {
    }

    public static FaqSoap toSoapModel(Faq model) {
        FaqSoap soapModel = new FaqSoap();

        soapModel.setEntryId(model.getEntryId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setQuestion(model.getQuestion());
        soapModel.setAnswer(model.getAnswer());

        return soapModel;
    }

    public static FaqSoap[] toSoapModels(Faq[] models) {
        FaqSoap[] soapModels = new FaqSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static FaqSoap[][] toSoapModels(Faq[][] models) {
        FaqSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new FaqSoap[models.length][models[0].length];
        } else {
            soapModels = new FaqSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static FaqSoap[] toSoapModels(List<Faq> models) {
        List<FaqSoap> soapModels = new ArrayList<FaqSoap>(models.size());

        for (Faq model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new FaqSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _entryId;
    }

    public void setPrimaryKey(long pk) {
        setEntryId(pk);
    }

    public long getEntryId() {
        return _entryId;
    }

    public void setEntryId(long entryId) {
        _entryId = entryId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public String getQuestion() {
        return _question;
    }

    public void setQuestion(String question) {
        _question = question;
    }

    public String getAnswer() {
        return _answer;
    }

    public void setAnswer(String answer) {
        _answer = answer;
    }
}
