package com.github.kim.boot.util;

/**
 * The type Number utils.
 *
 * @author duanledexianxianxian
 * @version 1.0.0
 */
public class NumberUtils {

    /**
     * 字符串转整形
     *
     * @param str the str
     * @return the long
     */
    public static Long toLongNull(final String str) {
        return toLong(str, null);
    }

    /**
     * 字符串转整形
     *
     * @param str          the str
     * @param defaultValue the default value
     * @return long long
     */
    public static Long toLong(final String str, final Long defaultValue) {
        if (str == null) {
            return defaultValue;
        }
        try {
            return Long.parseLong(str);
        } catch (final NumberFormatException nfe) {
            return defaultValue;
        }
    }
}
