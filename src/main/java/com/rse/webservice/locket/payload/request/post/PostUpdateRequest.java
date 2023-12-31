package com.rse.webservice.locket.payload.request.post;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class PostUpdateRequest {
    private Long id;

    private Integer state;

    private String content;

    private MultipartFile multipartFile;

}
