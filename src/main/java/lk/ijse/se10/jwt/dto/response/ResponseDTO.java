package lk.ijse.se10.jwt.dto.response;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Builder
public class ResponseDTO {
    private int code;
    private String message;
    private Object data;
}
