package com.paysera.sdk.wallet.helpers;

public class EnumHelper {
    public static String enumToString(Enum object) {
        if (object != null) {
             return object.name();
        }
        return null;
    }
}
