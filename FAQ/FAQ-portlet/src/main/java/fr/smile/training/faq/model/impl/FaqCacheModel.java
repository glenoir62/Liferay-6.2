package fr.smile.training.faq.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fr.smile.training.faq.model.Faq;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Faq in entity cache.
 *
 * @author Guillaume Lenoir
 * @see Faq
 * @generated
 */
public class FaqCacheModel implements CacheModel<Faq>, Externalizable {
    public long entryId;
    public long companyId;
    public long groupId;
    public String question;
    public String answer;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{entryId=");
        sb.append(entryId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", question=");
        sb.append(question);
        sb.append(", answer=");
        sb.append(answer);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Faq toEntityModel() {
        FaqImpl faqImpl = new FaqImpl();

        faqImpl.setEntryId(entryId);
        faqImpl.setCompanyId(companyId);
        faqImpl.setGroupId(groupId);

        if (question == null) {
            faqImpl.setQuestion(StringPool.BLANK);
        } else {
            faqImpl.setQuestion(question);
        }

        if (answer == null) {
            faqImpl.setAnswer(StringPool.BLANK);
        } else {
            faqImpl.setAnswer(answer);
        }

        faqImpl.resetOriginalValues();

        return faqImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        entryId = objectInput.readLong();
        companyId = objectInput.readLong();
        groupId = objectInput.readLong();
        question = objectInput.readUTF();
        answer = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(entryId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(groupId);

        if (question == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(question);
        }

        if (answer == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(answer);
        }
    }
}
