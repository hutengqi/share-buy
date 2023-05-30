package cn.sincerity.sharebuy.infrastructure.http;

import lombok.Data;

/**
 * ResponseEntity
 *
 * @author Ht7_Sincerity
 * @date 2023/4/12
 */
@Data
public class CommonResponse<T> {

    private T data;

    private String message;

    private boolean success;

    public static CommonResponse<?> failure(String message) {
        CommonResponse<?> commonResponse = new CommonResponse<>();
        commonResponse.success = false;
        commonResponse.message = message;
        return commonResponse;
    }

    public static <T> CommonResponse<T> success(T data) {
        CommonResponse<T> commonResponse = new CommonResponse<>();
        commonResponse.success = true;
        commonResponse.data = data;
        return commonResponse;
    }
}
