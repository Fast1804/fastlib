package org.fast1804.utils;

/**
 * @author devzhou
 * @date 2020/04/20
 * @since 1.6
 * <p>
 *     String helper
 * </p>
 */
public class StringHelper {
    public static Boolean IsNullOrWhiteSpace(String str){
        return str == null || str.isEmpty() || str.trim().isEmpty();
    }
}
