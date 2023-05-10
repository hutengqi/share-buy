package cn.sincerity.sharebuy.infrastructure.http;

/**
 * ResponseEntity
 *
 * @author Ht7_Sincerity
 * @date 2023/4/12
 */
public class ResponseEntity<T> {

    private T data;

    private String message;

    private boolean success;

    public static ResponseEntity<?> failure(String message) {
        ResponseEntity<?> responseEntity = new ResponseEntity<>();
        responseEntity.success = false;
        responseEntity.message = message;
        return responseEntity;
    }

    public static <T> ResponseEntity<T> success(T data) {
        ResponseEntity<T> responseEntity = new ResponseEntity<>();
        responseEntity.success = false;
        responseEntity.data = data;
        return responseEntity;
    }
}
