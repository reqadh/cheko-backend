package sa.cheko.restaurant.common.util;

public class ValidationUtils {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
}
