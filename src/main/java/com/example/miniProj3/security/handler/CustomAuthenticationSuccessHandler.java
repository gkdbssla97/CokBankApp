package com.example.miniProj3.security.handler;

import com.example.miniProj3.domain.dto.ResponseDataDto;
import com.example.miniProj3.util.ResponseDataCode;
import com.example.miniProj3.util.ResponseDataStatus;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Component
public class CustomAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {
        ObjectMapper mapper = new ObjectMapper(); // JSON Parsing

        ResponseDataDto responseDataDto = new ResponseDataDto();
        responseDataDto.setCode(ResponseDataCode.SUCCESS);
        responseDataDto.setStatus(ResponseDataStatus.SUCCESS);

        String loginSuccessPage = request.getSession().getAttribute("loginSuccessPage").toString();

        Map<String, String> items = new HashMap<String, String>();
        items.put("url", loginSuccessPage);
        responseDataDto.setItem(items);

        response.setCharacterEncoding("UTF-8");
        response.setStatus(HttpServletResponse.SC_OK);
        response.getWriter().print(mapper.writeValueAsString(responseDataDto));
        response.getWriter().flush();

    }
}
