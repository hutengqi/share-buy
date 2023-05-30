package cn.sincerity.sharebuy.infrastructure.http;

import cn.sincerity.sharebuy.infrastructure.security.TokenProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TokenFilter
 *
 * @author Ht7_Sincerity
 * @date 2023/5/12
 */
@Slf4j
public class TokenFilter extends OncePerRequestFilter {

    @Resource
    private TokenProvider tokenProvider;


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {



        filterChain.doFilter(request, response);
    }
}
