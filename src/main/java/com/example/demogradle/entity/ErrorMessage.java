package com.example.demogradle.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
@Data
@NoArgsConstructor

public class ErrorMessage {

    private HttpStatus status;
    private String message;

    public ErrorMessage(HttpStatus notFound, String message) {
    }

//    public ErrorMessage(HttpStatus status, String message) {
//        this.status = status;
//        this.message = message;
//    }
//
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//

}
