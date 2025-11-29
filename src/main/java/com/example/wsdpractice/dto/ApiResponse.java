package com.example.wsdpractice.dto;

public class ApiResponse<T> {
    private String status;
    private T data;
    private String message;

    public ApiResponse(String status, T data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    // 성공 응답
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>("success", data, null);
    }

    // 에러 응답
    public static <T> ApiResponse<T> error(String message) {
        return new ApiResponse<>("error", null, message);
    }

    // Getter
    public String getStatus() { return status; }
    public T getData() { return data; }
    public String getMessage() { return message; }

    // Setter
    public void setStatus(String status) { this.status = status; }
    public void setData(T data) { this.data = data; }
    public void setMessage(String message) { this.message = message; }
}