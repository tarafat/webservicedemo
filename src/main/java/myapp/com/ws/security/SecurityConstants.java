package myapp.com.ws.security;

import myapp.com.ws.SpringApplicationContext;

public class SecurityConstants {
	public static final long EXPIRATION_TIME = 864000000 ;// 10 days ms
	public static final String TOKEN_PREFIX = "Bearer ";
	public static final String HEADER_STRING = "Authorization";
	public static final String SIGN_UP_URL = "/users";
	
	public static String getTokenSecret() {	
		AppPrpoerties appPrpperties =(AppPrpoerties) SpringApplicationContext.getBean("AppProperties");
		return appPrpperties.getTokenSecret();
	}
}