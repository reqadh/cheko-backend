package sa.cheko.restaurant.common.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChekoApiResponse<T> {
    private boolean success;
    private String message;
    private T data;

    public static <T> ChekoApiResponse<T> success(T data) {
        return ChekoApiResponse.<T>builder()
            .success(true)
            .data(data)
            .build();
    }

    public static <T> ChekoApiResponse<T> success(String message, T data) {
        return ChekoApiResponse.<T>builder()
            .success(true)
            .message(message)
            .data(data)
            .build();
    }

    public static <T> ChekoApiResponse<T> error(String message) {
        return ChekoApiResponse.<T>builder()
            .success(false)
            .message(message)
            .build();
    }
}
