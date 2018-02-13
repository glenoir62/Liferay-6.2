package com.smile.plugins.service.base;

import com.smile.plugins.service.RestaurantServiceUtil;

import java.util.Arrays;

/**
 * @author guillaume Lenoir
 * @generated
 */
public class RestaurantServiceClpInvoker {
    private String _methodName50;
    private String[] _methodParameterTypes50;
    private String _methodName51;
    private String[] _methodParameterTypes51;
    private String _methodName56;
    private String[] _methodParameterTypes56;
    private String _methodName57;
    private String[] _methodParameterTypes57;
    private String _methodName58;
    private String[] _methodParameterTypes58;

    public RestaurantServiceClpInvoker() {
        _methodName50 = "getBeanIdentifier";

        _methodParameterTypes50 = new String[] {  };

        _methodName51 = "setBeanIdentifier";

        _methodParameterTypes51 = new String[] { "java.lang.String" };

        _methodName56 = "addRestaurant";

        _methodParameterTypes56 = new String[] {
                "com.smile.plugins.model.Restaurant",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName57 = "updateRestaurant";

        _methodParameterTypes57 = new String[] {
                "com.smile.plugins.model.Restaurant",
                "com.liferay.portal.service.ServiceContext"
            };

        _methodName58 = "deleteRestaurant";

        _methodParameterTypes58 = new String[] { "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName50.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes50, parameterTypes)) {
            return RestaurantServiceUtil.getBeanIdentifier();
        }

        if (_methodName51.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes51, parameterTypes)) {
            RestaurantServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName56.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes56, parameterTypes)) {
            return RestaurantServiceUtil.addRestaurant((com.smile.plugins.model.Restaurant) arguments[0],
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName57.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes57, parameterTypes)) {
            return RestaurantServiceUtil.updateRestaurant((com.smile.plugins.model.Restaurant) arguments[0],
                (com.liferay.portal.service.ServiceContext) arguments[1]);
        }

        if (_methodName58.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes58, parameterTypes)) {
            return RestaurantServiceUtil.deleteRestaurant(((Long) arguments[0]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
