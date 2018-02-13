package com.smile.plugins.service.base;

import com.smile.plugins.service.ExtAssetEntryLocalServiceUtil;

import java.util.Arrays;

/**
 * @author guillaume Lenoir
 * @generated
 */
public class ExtAssetEntryLocalServiceClpInvoker {
    private String _methodName28;
    private String[] _methodParameterTypes28;
    private String _methodName29;
    private String[] _methodParameterTypes29;
    private String _methodName32;
    private String[] _methodParameterTypes32;
    private String _methodName33;
    private String[] _methodParameterTypes33;

    public ExtAssetEntryLocalServiceClpInvoker() {
        _methodName28 = "getBeanIdentifier";

        _methodParameterTypes28 = new String[] {  };

        _methodName29 = "setBeanIdentifier";

        _methodParameterTypes29 = new String[] { "java.lang.String" };

        _methodName32 = "getJournalArticleByGroupIdCategories";

        _methodParameterTypes32 = new String[] {
                "int", "int", "long[][]", "long[][]", "long"
            };

        _methodName33 = "getJournalArticleCountByGroupIdCategories";

        _methodParameterTypes33 = new String[] { "long[][]", "long[][]", "long" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName28.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes28, parameterTypes)) {
            return ExtAssetEntryLocalServiceUtil.getBeanIdentifier();
        }

        if (_methodName29.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes29, parameterTypes)) {
            ExtAssetEntryLocalServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        if (_methodName32.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes32, parameterTypes)) {
            return ExtAssetEntryLocalServiceUtil.getJournalArticleByGroupIdCategories(((Integer) arguments[0]).intValue(),
                ((Integer) arguments[1]).intValue(), (long[]) arguments[2],
                (long[]) arguments[3], ((Long) arguments[4]).longValue());
        }

        if (_methodName33.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes33, parameterTypes)) {
            return ExtAssetEntryLocalServiceUtil.getJournalArticleCountByGroupIdCategories((long[]) arguments[0],
                (long[]) arguments[1], ((Long) arguments[2]).longValue());
        }

        throw new UnsupportedOperationException();
    }
}
