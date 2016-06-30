package com.here.account.auth;

import java.util.List;
import java.util.Map;

import com.here.account.http.HttpProvider;
import com.here.account.http.HttpProvider.HttpRequest;

/**
 * Appends the specified 
 * <a href="https://tools.ietf.org/html/rfc6750">OAuth2.0 Bearer Token</a>
 * the the HTTP request.
 * 
 * <p>
 * See also 
 * <a href="http://www.iana.org/assignments/http-authschemes/http-authschemes.xhtml#authschemes">
 * HTTP Authentication Scheme Registry</a> for a list of authschemes.
 * 
 * @author kmccrack
 *
 */
public class OAuth2Authorizer implements HttpProvider.HttpRequestAuthorizer {
    
    private static final String BEARER_SPACE = "Bearer ";
    
    private final String bearerSpaceAccessToken;
    
    /**
     * Construct the Bearer authorizer with the specified <tt>accessToken</tt>.
     * Access Token is as defined in 
     * <a href="https://tools.ietf.org/html/rfc6749#section-1.4">OAuth2.0 
     * Section 1.4</a>.
     * 
     * @param accessToken the OAuth2.0 Bearer Access Token value
     */
    public OAuth2Authorizer(String accessToken) {
        this.bearerSpaceAccessToken = BEARER_SPACE + accessToken;
    }

    @Override
    public void authorize(HttpRequest httpRequest, String method, String url, Map<String, List<String>> formParams) {
        httpRequest.addAuthorizationHeader(bearerSpaceAccessToken);
    }

}