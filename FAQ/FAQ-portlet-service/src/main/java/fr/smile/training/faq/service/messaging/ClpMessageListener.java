package fr.smile.training.faq.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import fr.smile.training.faq.service.ClpSerializer;
import fr.smile.training.faq.service.FaqLocalServiceUtil;
import fr.smile.training.faq.service.FaqServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            FaqLocalServiceUtil.clearService();

            FaqServiceUtil.clearService();
        }
    }
}
