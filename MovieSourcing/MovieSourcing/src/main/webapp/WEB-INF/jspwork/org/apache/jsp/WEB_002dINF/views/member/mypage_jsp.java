/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-13 05:07:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mypage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1681357416460L));
    _jspx_dependants.put("jar:file:/C:/Users/Admin/Desktop/MovieSourcing/MovieSourcing/MovieSourcing/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/member/basic.css\">\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/47910b9f42.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <title>마이페이지</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("    <div id=\"movieSourcing\">\r\n");
      out.write("        <div id=\"layout\">\r\n");
      out.write("            <div id=\"root\">\r\n");
      out.write("                <header class=\"backpageHeader\">\r\n");
      out.write("                    <div classs=\"backpageDiv\">\r\n");
      out.write("                        <a href=\"javascript:window.history.back();\" class=\"backpage\">\r\n");
      out.write("                            <i class=\"fa-solid fa-chevron-left\" id=\"backpageimg\"></i>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </header>\r\n");
      out.write("                <main id=\"contents\">\r\n");
      out.write("                    <section class=\"outer-wrap\">\r\n");
      out.write("                        <div class=\"inner-wrap\">\r\n");
      out.write("                            <div class=\"info-container\">\r\n");
      out.write("                                <div class=\"user-wrap\">\r\n");
      out.write("                                    <div id=\"userInfo\">\r\n");
      out.write("                                        <div class=\"avatar-wrap\">\r\n");
      out.write("                                        ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            \r\n");
      out.write("                                            ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"info-wrap\">\r\n");
      out.write("                                            <div class=\"user-name\">\r\n");
      out.write("                                                <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberNick}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("    \r\n");
      out.write("                                                <!-- 개인창을 벗어나면 display none 으로 제어 -->\r\n");
      out.write("                                               \r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"user-email\"><span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberEmail}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div id=\"userMenu\">\r\n");
      out.write("                                     \r\n");
      out.write("                                        <a class=\"fa-regular fa-pen-to-square\" href=\"myPagechangeEnter\"></a>\r\n");
      out.write("                                        <a class=\"fa-solid fa-right-to-bracket\" href=\"logout\"></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                   \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div id=\"introduceBox\">\r\n");
      out.write("                       ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                              ");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("\r\n");
      out.write("                    <!-- 카운트 -->\r\n");
      out.write("                    <section class=\"contents-wrap\">\r\n");
      out.write("                        <div class=\"profile-count-container\">\r\n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/movielist/wishList?memberNo=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" >\r\n");
      out.write("                                <span id=\"wannaseeCount\" class=\"countSpan\">0</span>\r\n");
      out.write("                                <span>찜</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/movielist/watchedList?memberNo=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberNo}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                                <span id=\"watchedCount\" class=\"countSpan\">0</span>\r\n");
      out.write("                                <span>본 영화</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <a href=\"#\" >\r\n");
      out.write("                                <span id=\"lifeMovieCount\" class=\"countSpan\">0</span>\r\n");
      out.write("                                <span>인생영화</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                           \r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"profile-container2\">\r\n");
      out.write("                            <div class=\"profile-container-box\">\r\n");
      out.write("                                <a href=\"#\">내가 쓴 리뷰</a>\r\n");
      out.write("                                <a href=\"#\"><span id=\"reviewCount\">0</span> <i class=\"fa-solid fa-chevron-right\" id=\"arrow\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <hr id=\"boxLine\" class=\"boxline\" color=\"gray\">\r\n");
      out.write("                            <div class=\"profile-container-box\">\r\n");
      out.write("                                <a href=\"#\">커뮤니티 작성글</a>\r\n");
      out.write("                                <a href=\"#\"><span id=\"communityCount\">0</span> <i class=\"fa-solid fa-chevron-right\" id=\"arrow\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                            <hr id=\"boxLine2\" class=\"boxline\" color=\"gray\">\r\n");
      out.write("                            \r\n");
      out.write("                            <!-- 개인창을 벗어나면 display none 으로 제어 -->\r\n");
      out.write("                            <div class=\"profile-container-box\" id=\"unlikeBox\">\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    <a href=\"#\">관심없어요</a>\r\n");
      out.write("                                    <a class=\"fa-solid fa-circle-info\" id=\"infoMark\" title=\"관심없는 장르를 제외해줍니다.\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <a href=\"#\" id=\"genreBox\">\r\n");
      out.write("                                    <div class=\"genreDiv\"><span class=\"genre\">액션</span></div>\r\n");
      out.write("                                    <div class=\"genreDiv\"><span class=\"genre\">외국영화</span></div>\r\n");
      out.write("                                    <div class=\"genreDiv\"><span class=\"genre\">독립영화</span></div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>  \r\n");
      out.write("                        </div>\r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"lifemovie-container\">\r\n");
      out.write("                            <div class=\"lifemovie-top\">\r\n");
      out.write("                                <span>인생영화</span>\r\n");
      out.write("\r\n");
      out.write("                                <!-- 개인창을 벗어나면 display none 으로 제어 -->\r\n");
      out.write("                                <a href=\"#\">관리</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"lifemovie-bottom\">\r\n");
      out.write("\r\n");
      out.write("                                <!-- 타인이 봤을때 없을 경우 -->\r\n");
      out.write("                                <div class=\"lifemovie-empty-foreign\">\r\n");
      out.write("                                    <span>등록된 인생 영화가 없습니다.</span>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <!-- 개인이 봤을때 등록된 인생영화가 없을 경우  -->\r\n");
      out.write("                                <div class=\"lifemovie-empty\"><span>인생영화를 등록해주세요</span></div>\r\n");
      out.write("                                <button class=\"lifemovie-button\">'인생영화' 등록</button>\r\n");
      out.write("                                \r\n");
      out.write("                                <!-- 인생영화 div -->\r\n");
      out.write("                                <!-- 등록된 인생영화 div append -->\r\n");
      out.write("                                <div class=\"lifemovie-Imgbox\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <hr color=\"gray\" border-width=\"0.5em\">\r\n");
      out.write("                        <div class=\"wanttosee-container\">\r\n");
      out.write("                            <div class=\"wanttosee-top\">\r\n");
      out.write("                                <span>찜한영화</span>\r\n");
      out.write("                                <a href=\"#\">관리</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"wanttosee-bottom\">\r\n");
      out.write("                                <div></div>\r\n");
      out.write("                                <div class=\"wanttosee-empty\"><span>찜한 영화목록이에요</span></div>\r\n");
      out.write("                                \r\n");
      out.write("                                \r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </section>\r\n");
      out.write("                </main>\r\n");
      out.write("                <header class=\"navHeader\">\r\n");
      out.write("                    <nav class=\"nav\">\r\n");
      out.write("                        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"home\">\r\n");
      out.write("                            <i class=\"fa-solid fa-house\"></i>\r\n");
      out.write("                            <span>홈</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a href=\"#\" class=\"community\">\r\n");
      out.write("                            <i class=\"fa-solid fa-comments\"></i>\r\n");
      out.write("                            <span>커뮤니티</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a href=\"#\" class=\"search\">\r\n");
      out.write("                            <i class=\"fa-solid fa-magnifying-glass\"></i>\r\n");
      out.write("                            <span>탐색</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                        <a href=\"MyPageEnter\" class=\"mypage\">\r\n");
      out.write("                            <i class=\"fa-solid fa-user\"></i>\r\n");
      out.write("                            <span>마이페이지</span>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </nav>\r\n");
      out.write("                </header>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/js/member/myPage.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/member/mypage.jsp(35,40) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty loginMember.memberImg}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                            <span>\r\n");
          out.write("                                           \r\n");
          out.write("                                                <i class=\"fa-solid fa-face-laugh-squint\" title=\"프로필수\">\r\n");
          out.write("                                                </i>\r\n");
          out.write("     										\r\n");
          out.write("                                            \r\n");
          out.write("                                            </span>\r\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/member/mypage.jsp(45,44) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty loginMember.memberImg}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                            <span>\r\n");
          out.write("                                           \r\n");
          out.write("                                                \r\n");
          out.write("     										\r\n");
          out.write("                                            \r\n");
          out.write("                                            </span>\r\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /WEB-INF/views/member/mypage.jsp(73,23) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty loginMember.memberIntro}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("             \r\n");
          out.write("                                    <span id=\"introduceSpan\">\r\n");
          out.write("         		                        \r\n");
          out.write("                                        default\r\n");
          out.write("                                   \r\n");
          out.write("                                    </span>\r\n");
          out.write("                                      ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f3_reused = false;
    try {
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent(null);
      // /WEB-INF/views/member/mypage.jsp(80,30) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty loginMember.memberIntro}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("             \r\n");
          out.write("                                    <span id=\"introduceSpan\">\r\n");
          out.write("         		                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginMember.memberIntro}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("\r\n");
          out.write("                                    </span>\r\n");
          out.write("                                      ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      _jspx_th_c_005fif_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f3_reused);
    }
    return false;
  }
}
