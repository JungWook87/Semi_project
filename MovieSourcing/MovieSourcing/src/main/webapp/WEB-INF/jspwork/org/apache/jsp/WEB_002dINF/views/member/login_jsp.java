/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-14 05:40:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/MovieSourcing/MovieSourcing/MovieSourcing/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1681443963978L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    \r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name =\"google-signin-client_id\" \r\n");
      out.write("    content=\"935814438564-8ocf3d4e2vsp790u21l0vctt9qahq9bj.apps.googleusercontent.com\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../resources/css/member/login.css\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.js\" \r\n");
      out.write("    integrity=\"sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=\" \r\n");
      out.write("    crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/47910b9f42.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <title>로그인</title>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"movieSourcing\">\r\n");
      out.write("        <div id=\"layout\">\r\n");
      out.write("            <div id=\"root\">\r\n");
      out.write("                <header>\r\n");
      out.write("                    <div>\r\n");
      out.write("                        <a href=\"javascript:window.history.back();\"  class=\"backpage\">\r\n");
      out.write("                            <i class=\"fa-solid fa-chevron-left\" id=\"backpageimg\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </header>\r\n");
      out.write("                <main id=\"contents\">\r\n");
      out.write("                    <section class=\"logintop\">\r\n");
      out.write("                        <span class=\"top\">로그인</span>\r\n");
      out.write("\r\n");
      out.write("                    </section>\r\n");
      out.write("                    <section class=\"loginbox\">\r\n");
      out.write("                        <div class=\"login\">\r\n");
      out.write("                            <div class=\"loginwrap\">\r\n");
      out.write("                                <form action=\"login\" method=\"POST\" name=\"login-form\" onsubmit=\"return loginValidate()\">\r\n");
      out.write("                                 <fieldset id=\"id-pw-area\">\r\n");
      out.write("                                        <span>아이디</span>\r\n");
      out.write("                                        <div class=\"id\">\r\n");
      out.write("                                            <input type=\"text\" id=\"id\"   name=\"id\" placeholder=\"아이디를 입력해주세요\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cookie.keepLogin.value}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <span>비밀번호</span>\r\n");
      out.write("                                        <div class=\"password\">\r\n");
      out.write("                                            <input type=\"password\" id=\"password\"  name=\"password\" placeholder=\"비밀번호를 입력해주세요\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"keepLogin\">\r\n");
      out.write("                                            <input type=\"checkbox\" name=\"keepLogin\">\r\n");
      out.write("                                            <label for=\"keepLogin\"><span>로그인 상태 유지</span></label>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <button id=\"nomalLogin\">\r\n");
      out.write("                                            <span>로그인</span>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </fieldset>\r\n");
      out.write("                                </form>\r\n");
      out.write("                               \r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"btnwrap\">\r\n");
      out.write("                                \r\n");
      out.write("                                <div id=\"kakaoLoginBtn\">\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <i class=\"fa-solid fa-comment\" id=\"kakaoImg\"></i>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div><span>카카오 로그인</span></div>\r\n");
      out.write("                                    <div></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div id=\"googleLogin\">\r\n");
      out.write("                                    <div >\r\n");
      out.write("                                        <div class=\"googleBox\">\r\n");
      out.write("                                            <i class=\"fa-brands fa-google-plus-g\" id=\"googleImg\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div><span>구글 로그인</span></div>\r\n");
      out.write("                                    <div></div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"enderMenu\">\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/signUp1\"><span>회원가입</span></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <a href=\"searchId\"><span>아이디</span></a>\r\n");
      out.write("                                        <span> |</span>\r\n");
      out.write("                                        <a href=\"#\"><span>비밀번호찾기</span></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("                    <section class=\"under\">\r\n");
      out.write("\r\n");
      out.write("                    </section>\r\n");
      out.write("                    <button id=\"logout\">로그아웃</button>\r\n");
      out.write("                   \r\n");
      out.write("                </main>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"../resources/js/member/login.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://developers.kakao.com/sdk/js/kakao.js\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("   	Kakao.init('f72ad10408e611f4a24827bd881110dc');\r\n");
      out.write("   	console.log(Kakao.isInitialized());\r\n");
      out.write("   	\r\n");
      out.write("   	let email = null;\r\n");
      out.write("   	\r\n");
      out.write("   	//카카오로그인\r\n");
      out.write("   	document.getElementById(\"kakaoLoginBtn\")\r\n");
      out.write("   	.addEventListener(\"click\",function kakaoLogin() {\r\n");
      out.write("   		\r\n");
      out.write("   	    Kakao.Auth.login({\r\n");
      out.write("   	    	\r\n");
      out.write("   	    success: function (response) {\r\n");
      out.write("   	        Kakao.API.request({\r\n");
      out.write("   	        url: '/v2/user/me',\r\n");
      out.write("   	        success: function (response) {\r\n");
      out.write("   	            console.log(response.kakao_account.email);\r\n");
      out.write("   	        	 \r\n");
      out.write("   	            email = response.kakao_account.email;\r\n");
      out.write("   	            \r\n");
      out.write("   	            console.log(email);\r\n");
      out.write("   	            \r\n");
      out.write("\r\n");
      out.write("   	        },\r\n");
      out.write("   	        fail: function (error) {\r\n");
      out.write("   	            console.log(error)\r\n");
      out.write("   	        },\r\n");
      out.write("   	        })\r\n");
      out.write("   	    },\r\n");
      out.write("   	    fail: function (error) {\r\n");
      out.write("   	        console.log(error)\r\n");
      out.write("   	    },\r\n");
      out.write("   	    })\r\n");
      out.write("   	    \r\n");
      out.write("   	})\r\n");
      out.write("   	\r\n");
      out.write("\r\n");
      out.write("   	$.ajax({\r\n");
      out.write("         url : \"kakaoLogin\",\r\n");
      out.write("         data : { \"email\" : email },\r\n");
      out.write("         type : \"GET\",\r\n");
      out.write("         success : function(loginMember) {\r\n");
      out.write("             if(loginMember != null) {\r\n");
      out.write("                 alert(\"로그인 성공\");\r\n");
      out.write("               \r\n");
      out.write("             } else {\r\n");
      out.write("                 alert(\"등록된 회원 정보가 없습니다.\");\r\n");
      out.write("                    \r\n");
      out.write("             }},\r\n");
      out.write("         error : function(){\r\n");
      out.write("             console.log(\"안됨\");\r\n");
      out.write("         } \r\n");
      out.write("     })  \r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("   	\r\n");
      out.write("\r\n");
      out.write("   	\r\n");
      out.write("   	document.getElementById(\"logout\")\r\n");
      out.write("   	.addEventListener(\"click\", function kakaoLogout() {\r\n");
      out.write("   	    if (Kakao.Auth.getAccessToken()) {\r\n");
      out.write("   	    Kakao.API.request({\r\n");
      out.write("   	        url: '/v1/user/unlink',\r\n");
      out.write("   	        success: function (response) {\r\n");
      out.write("   	            console.log(response)\r\n");
      out.write("   	        },\r\n");
      out.write("   	        fail: function (error) {\r\n");
      out.write("   	        console.log(error)\r\n");
      out.write("   	        },\r\n");
      out.write("   	    })\r\n");
      out.write("   	    Kakao.Auth.setAccessToken(undefined)\r\n");
      out.write("   	    alert(\"로그아웃댐\")\r\n");
      out.write("   	    }\r\n");
      out.write("   	}  )\r\n");
      out.write("\r\n");
      out.write("   	document.getElementById(\"kakaoLoginBtn\")\r\n");
      out.write("   	.addEventListener(\"click\",function kakaoLogin() {\r\n");
      out.write("   	    if (Kakao.Auth.getAccessToken()){\r\n");
      out.write("   	        alert(\"이미 로그인된 아이디입니다.\")\r\n");
      out.write("   	    }\r\n");
      out.write("   	})\r\n");
      out.write("   	\r\n");
      out.write("   	\r\n");
      out.write("   	\r\n");
      out.write("   	\r\n");
      out.write("	      \r\n");
      out.write("    </script>\r\n");
      out.write("   	\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
