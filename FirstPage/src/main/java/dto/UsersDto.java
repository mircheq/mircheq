package dto;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Builder
public class UsersDto{

    private Integer id;
    private String name;
    private String login;
    private String email;
}