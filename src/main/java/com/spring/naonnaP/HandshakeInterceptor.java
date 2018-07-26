package com.spring.naonnaP;

import java.util.Map;

import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.http.server.ServletServerHttpRequest;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

public class HandshakeInterceptor extends HttpSessionHandshakeInterceptor {

	@Override
	public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Map<String, Object> map) throws Exception{
		
		//위의 파라미터 중, attributes 에 값을 저장하면 웹소켓 핸들러 클래스의 websocketsession 에 전달된다
		System.out.println("Before HandShake");
		ServletServerHttpRequest req = (ServletServerHttpRequest)request;
		System.out.print("URI : " + request.getURI());
		//String id = (String) req.getParameter("id");
		//HttpSession 에 저장된 이용자의 아이디를 추출하는 경우
		//String id = (String)req.getSession().getAttribute("id");
		String id = "admin";
		map.put("userId", id);
		System.out.println("HTTPSession에 저장된 ID : "+ id);

		return super.beforeHandshake(request, response, wsHandler, map);
	}
	
	@Override
	public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler wsHandler, Exception ex) {
		System.out.println("After HandShake");
		
		super.afterHandshake(request, response, wsHandler, ex);
	}

}
