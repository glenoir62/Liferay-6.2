package fr.smile.training.faq.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FaqService}.
 *
 * @author Guillaume Lenoir
 * @see FaqService
 * @generated
 */
public class FaqServiceWrapper implements FaqService,
    ServiceWrapper<FaqService> {
    private FaqService _faqService;

    public FaqServiceWrapper(FaqService faqService) {
        _faqService = faqService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _faqService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _faqService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _faqService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public FaqService getWrappedFaqService() {
        return _faqService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedFaqService(FaqService faqService) {
        _faqService = faqService;
    }

    @Override
    public FaqService getWrappedService() {
        return _faqService;
    }

    @Override
    public void setWrappedService(FaqService faqService) {
        _faqService = faqService;
    }
}
