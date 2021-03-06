package br.com.nexfar.applicationtest.security;

import br.com.nexfar.applicationtest.payload.Login;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JWTLoginFilter extends AbstractAuthenticationProcessingFilter {

    protected JWTLoginFilter(String url, AuthenticationManager authManager) {
        super(new AntPathRequestMatcher(url));
        setAuthenticationManager(authManager);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException, IOException, ServletException {

        Login credentials = new ObjectMapper().readValue(request.getInputStream(), Login.class);

        UsernamePasswordAuthenticationToken a = new UsernamePasswordAuthenticationToken(
                credentials.getEmail().getValue(),
                credentials.getPassword().getValue()
        );

        return getAuthenticationManager().authenticate(a);
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain, Authentication auth) throws IOException, ServletException {
        TokenAuthenticationService.addAuthentication(response, auth.getName());
    }

}
