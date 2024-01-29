package kopo.poly.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class UserInfoDTO{



    private String phoneNumber;
    private String password;
    private String addr1;
    private String addr2;


}
