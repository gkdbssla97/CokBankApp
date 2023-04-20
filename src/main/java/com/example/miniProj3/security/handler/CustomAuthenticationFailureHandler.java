package com.example.miniProj3.security.handler;

import com.example.miniProj3.domain.dto.ResponseDataDto;
import com.example.miniProj3.util.ResponseDataCode;
import com.example.miniProj3.util.ResponseDataStatus;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CustomAuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {

    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
                                        AuthenticationException exception) throws IOException, ServletException {

        ObjectMapper mapper = new ObjectMapper();	//JSON Parsing

        ResponseDataDto responseDataDto = new ResponseDataDto();
        responseDataDto.setCode(ResponseDataCode.ERROR);
        responseDataDto.setStatus(ResponseDataStatus.ERROR);
        responseDataDto.setMessage("아이디 혹은 비밀번호가 일치하지 않습니다.");

        response.setCharacterEncoding("UTF-8");
        response.setStatus(HttpServletResponse.SC_NOT_FOUND);
        response.getWriter().print(mapper.writeValueAsString(responseDataDto));
        response.getWriter().flush();

    }
}
