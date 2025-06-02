package com.atguigu._throw;

public class StudentIdBelowZeroException extends RuntimeException {
    private Long id;

    public StudentIdBelowZeroException() {}

    public StudentIdBelowZeroException(String message) {
        super(message);
    }

    public StudentIdBelowZeroException(Long id, String message) {
        super(message);
        this.id = id;
    }
}
