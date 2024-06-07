package com.simbongsa.global.dto.request;

import com.simbongsa.global.constant.OauthProvider;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class OauthLoginReq {
    @NotNull
    private OauthProvider oauthProvider;
    @NotBlank
    private String code;
}