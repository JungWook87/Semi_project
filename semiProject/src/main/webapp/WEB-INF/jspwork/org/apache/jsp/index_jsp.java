/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-04-02 06:24:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1679887448000L));
    _jspx_dependants.put("jar:file:/Users/ijin/Documents/workspace/5_server/semiProject/src/main/webapp/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
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

      out.write("\n");
      out.write("          \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"resources/css/semi-main copy.css\">\n");
      out.write("    <script src=\"https://kit.fontawesome.com/0041fb1dcb.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <title>semi-main</title>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.js\" integrity=\"sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=\" crossorigin=\"anonymous\"></script>\n");
      out.write("    \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <main>\n");
      out.write("        <header id=\"head\">\n");
      out.write("\n");
      out.write("                <div class=\"main-image\">\n");
      out.write("                    <ul class=\"main-slides\">\n");
      out.write("                        <li><img src=\"resources/images/bg_1.jpg\" ></li>\n");
      out.write("                        <li><img src=\"resources/images/bg_1.jpg\" ></li>\n");
      out.write("                        <li><img src=\"resources/images/bg_1.jpg\" ></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <a href=\"#\"><img src=\"resources/images/LogoMakr-9dgAJM.png\" name=\"home-logo\"></a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    <ul class=\"home-nav\">\n");
      out.write("                        <li><a href=\"#\" id=\"homebutton\">홈</a></li>\n");
      out.write("                        <li><a href=\"#\" id=\"janrbutton\">장르 검색</a></li>\n");
      out.write("                        <li><a href=\"#\">커뮤니티</a></li>\n");
      out.write("                        <li><a href=\"#\">추천 시뮬레이션</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"head-right\">\n");
      out.write("\n");
      out.write("                    <div class=\"search-box\">\n");
      out.write("                \n");
      out.write("                    <input type=\"text\" class=\"search-txt\" placeholder=\"영화제목,감독,배우\" >\n");
      out.write("                    <a href=\"#\" class=\"search-btn\"><i class=\"fa-solid fa-magnifying-glass\" ></i></a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                 ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("			 \n");
      out.write("			 		");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <section class=\"main\">\n");
      out.write("\n");
      out.write("            <!-- 영화 정보 -->\n");
      out.write("            <div class=\"movie\">\n");
      out.write("                <div class=\"chart active\">\n");
      out.write("                    <span>넷플릭스 랭킹&nbsp\n");
      out.write("                        <a class=\"rotate\"><i class=\"fa-solid fa-rotate-right\"></i></a>\n");
      out.write("\n");
      out.write("                    </span>\n");
      out.write("                    <ul class=\"charts\">\n");
      out.write("                        <i class=\"fa-solid fa-1\"></i><li><img src=\"resources/images/어벤져스1 포스터.jpg\" width=\"200px\"></li>\n");
      out.write("                        <i class=\"fa-solid fa-2\"></i><li><img src=\"resources/images/어스파2 포스터.jpg\" width=\"200px\"></li>\n");
      out.write("                        <i class=\"fa-solid fa-3\"></i><li><img src=\"resources/images/최종병기 활 포스터.jpeg\" width=\"200px\"></li>\n");
      out.write("                        <i class=\"fa-solid fa-4\"></i><li><img src=\"resources/images/트랜스포머 포스터.jpg\" width=\"200px\"></li>\n");
      out.write("                        <i class=\"fa-solid fa-5\"></i><li><img src=\"resources/images/1987포스터.jpg\" width=\"200px\"></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"chart\">\n");
      out.write("                    <span>왓챠 랭킹\n");
      out.write("                        <a class=\"rotate\"><i class=\"fa-solid fa-rotate-right\"></i></a>\n");
      out.write("                    </span>\n");
      out.write("                    <ul class=\"charts\">\n");
      out.write("                        <i class=\"fa-solid fa-1\"></i><li><img src=\"resources/images/어스파1 포스터.jpg\" width=\"200px\"></li>\n");
      out.write("                        <i class=\"fa-solid fa-2\"></i><li><img src=\"resources/images/검사외전포스터.jpg\" width=\"200px\"></li>\n");
      out.write("                        <i class=\"fa-solid fa-3\"></i><li><img src=\"resources/images/수상한그녀 포스터.jpeg\" width=\"200px\"></li>\n");
      out.write("                        <i class=\"fa-solid fa-4\"></i><li><img src=\"resources/images/블랙위도우 포스터.jpg\" width=\"200px\"></li>\n");
      out.write("                        <i class=\"fa-solid fa-5\"></i><li><img src=\"resources/images/보헤미안 랩소디 포스터.jpg\" width=\"200px\"></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"chart\">\n");
      out.write("                    <span>디즈니+ 랭킹\n");
      out.write("                        <a class=\"rotate\"><i class=\"fa-solid fa-rotate-right\"></i></a>\n");
      out.write("                    </span>\n");
      out.write("                    <ul class=\"charts\">\n");
      out.write("                        <i class=\"fa-solid fa-1\"></i><li><img src=\"resources/images/백두산 포스터.jpg\" width=\"200px\"></li>\n");
      out.write("                        <i class=\"fa-solid fa-2\"></i><li><img src=\"resources/images/밀정 포스터.jpg\" width=\"200px\"></li>\n");
      out.write("                        <i class=\"fa-solid fa-3\"></i><li><img src=\"resources/images/명량 포스터.jpeg\" width=\"200px\"></li>\n");
      out.write("                        <i class=\"fa-solid fa-4\"></i><li><img src=\"resources/images/곡성 포스터.jpg\" width=\"200px\"></li>\n");
      out.write("                        <i class=\"fa-solid fa-5\"></i><li><img src=\"resources/images/기생충 포스터.jpg\" width=\"200px\"></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"m-recommend\">\n");
      out.write("                <span>\n");
      out.write("                    <p><i class=\"fa-solid fa-film\"></i>회원맞춤<br>&nbsp 영화추천</p> \n");
      out.write("                </span>\n");
      out.write("\n");
      out.write("                <div class=\"slide_wrapper\">\n");
      out.write("                    <ul class=\"slides\">\n");
      out.write("                        <li><img src=\"resources/images/1987포스터.jpg\"></li>\n");
      out.write("                        <li><img src=\"resources/images/검사외전포스터.jpg\"></li>\n");
      out.write("                        <li><img src=\"resources/images/겨울왕국1 포스터.jpg\"></li>\n");
      out.write("                        <li><img src=\"resources/images/곡성 포스터.jpg\"></li>\n");
      out.write("                        <li><img src=\"resources/images/공조 포스터.jpg\"></li>\n");
      out.write("                        <li><img src=\"resources/images/기생충 포스터.jpg\"></li>\n");
      out.write("                        <li><img src=\"resources/images/마스터 포스터.jpg\"></li>\n");
      out.write("                        <li><img src=\"resources/images/명량 포스터.jpeg\"></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                 </div>\n");
      out.write("                <p class=\"controls\">\n");
      out.write("                   \n");
      out.write("                    <span class=\"prev\">prev</span>\n");
      out.write("                    <span class=\"next\">next</span>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"m-contents\">\n");
      out.write("                <span >\n");
      out.write("                    <p><i class=\"fa-regular fa-bookmark\"></i>&nbsp새로운 <br>&nbsp컨텐츠</p>\n");
      out.write("                </span>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"slide_wrapper2\">\n");
      out.write("                    \n");
      out.write("                    <ul class=\"slides2\">\n");
      out.write("                        <li><img src=\"resources/images/밀정 포스터.jpg\" width=\"200px\" height=\"300px\"></li>\n");
      out.write("                        <li><img src=\"resources/images/백두산 포스터.jpg\" width=\"200px\" height=\"300px\"></li>\n");
      out.write("                        <li><img src=\"resources/images/범죄도시1 포스터.jpg\" width=\"200px\" height=\"300px\"></li>\n");
      out.write("                        <li><img src=\"resources/images/보헤미안 랩소디 포스터.jpg\" width=\"200px\" height=\"300px\"></li>\n");
      out.write("                        <li><img src=\"resources/images/블랙위도우 포스터.jpg\" width=\"200px\" height=\"300px\"></li>\n");
      out.write("                        <li><img src=\"resources/images/설국열차 포스터.jpg\" width=\"200px\" height=\"300px\"></li>\n");
      out.write("                        <li><img src=\"resources/images/수상한그녀 포스터.jpeg\" width=\"200px\" height=\"300px\"></li>\n");
      out.write("                        <li><img src=\"resources/images/어스파1 포스터.jpg\" width=\"200px\" height=\"300px\"></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("                <p class=\"controls2\">\n");
      out.write("                   \n");
      out.write("                    <span class=\"prev2\">prev</span>\n");
      out.write("                    <span class=\"next2\">next</span>\n");
      out.write("                </p>\n");
      out.write("\n");
      out.write("               \n");
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("              \n");
      out.write("                <div class=\"community\">\n");
      out.write("                    <span><p><i class=\"fa-regular fa-comments\"></i>&nbsp커뮤니티</p></span>\n");
      out.write("                    <a><i class=\"fa-solid fa-chevron-right\"></i></a>\n");
      out.write("                    <div>\n");
      out.write("                        <div><img src=\"resources/images/커뮤니티 글1.png\" width=\"800px\"></div>\n");
      out.write("                        <div><img src=\"resources/images/커뮤니티 글2.png\" width=\"800px\"></div>\n");
      out.write("                    </div>\n");
      out.write("        \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"review\">\n");
      out.write("\n");
      out.write("                    <span><i class=\"fa-regular fa-circle-user\"></i>회원들의 리뷰</span><i class=\"fa-solid fa-rotate\"></i>\n");
      out.write("                    <a><i class=\"fa-solid fa-rotate-right\"></i></a>\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        <div><img src=\"resources/images/리뷰 글1.png\" width=\"800px\"></div>\n");
      out.write("                        <div><img src=\"resources/images/리뷰 글2.png\" width=\"800px\"></div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("               <fieldset class=\"favorite\" style=\"border: 2px solid rgb(41, 39, 39);\">\n");
      out.write("                    <legend class=\"f-title\"><i class=\"fa-regular fa-star\"></i>인생영화관&nbsp&nbsp</legend>\n");
      out.write("                    <h4 style=\"color: white ; \">누누님의 인생영화</h4>\n");
      out.write("                    <div class=\"f-mlist1\">\n");
      out.write("                       \n");
      out.write("                        <div><img src=\"resources/images/블랙위도우 포스터.jpg\" width=\"130px\"></div>\n");
      out.write("                        <div><img src=\"resources/images/1987포스터.jpg\" width=\"130px\"></div>\n");
      out.write("                        <div><img src=\"resources/images/어스파2 포스터.jpg\" width=\"130px\"></div>\n");
      out.write("                        <div><img src=\"resources/images/보헤미안 랩소디 포스터.jpg\" width=\"130px\"></div>\n");
      out.write("                        <div><img src=\"resources/images/검사외전포스터.jpg\" width=\"130px\"></div>\n");
      out.write("                    </div>\n");
      out.write("                    <h4 style=\"color: white;\">나나님의 인생영화</h4>\n");
      out.write("                    <div class=\"f-mlist2\">\n");
      out.write("                        \n");
      out.write("                        <div><img src=\"resources/images/블랙위도우 포스터.jpg\" width=\"130px\"></div>\n");
      out.write("                        <div><img src=\"resources/images/1987포스터.jpg\" width=\"130px\"></div>\n");
      out.write("                        <div><img src=\"resources/images/어스파2 포스터.jpg\" width=\"130px\"></div>\n");
      out.write("                        <div><img src=\"resources/images/보헤미안 랩소디 포스터.jpg\" width=\"130px\"></div>\n");
      out.write("                        <div><img src=\"resources/images/검사외전포스터.jpg\" width=\"130px\"></div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("               </fieldset>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- 시뮬,인기검색어 -->\n");
      out.write("            <div class=\"side\">\n");
      out.write("                <div class=\"side-1\">\n");
      out.write("            \n");
      out.write("                    <div class=\"game\">\n");
      out.write("                        <a href=\"#\"><img src=\"resources/images/추천영화테스트.png\" width=\"200px\"></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div><a class=\"btn\" name=\"top\"><i class=\"fa-solid fa-up-long\"></i>top</a></div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("\n");
      out.write("            \n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        \n");
      out.write("    </main>\n");
      out.write("    <footer>\n");
      out.write("        <p><a href=\"#\">이용약관</a></p>\n");
      out.write("        <p><a href=\"#\">개인정보처리방침</a></p>\n");
      out.write("        <p><a href=\"#\">고객센터</a></p>\n");
      out.write("        <p><a href=\"#\">(주)KH</a></p>\n");
      out.write("\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <script src=\"resources/js/member/semi-main copy.js\"></script>\n");
      out.write("\n");
      out.write("  \n");
      out.write("</body>\n");
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
      // /index.jsp(50,17) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ loginMember.memberId== null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div>   <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/member/loginPgEnter\" ><i class=\"fa-solid fa-heart\"></i></a></div>\n");
          out.write("              \n");
          out.write("              \n");
          out.write("              \n");
          out.write("                    <div><a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/member/loginPgEnter\" ><i class=\"fa-solid fa-user\"></i></a></div>\n");
          out.write("\n");
          out.write("                </div>\n");
          out.write("					 ");
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
      // /index.jsp(60,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ loginMember.memberId!= null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                    <div> <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/member/MyPageEnter\" ><i class=\"fa-solid fa-heart\"></i></a></div>\n");
          out.write("              \n");
          out.write("              \n");
          out.write("              \n");
          out.write("                    <div> <a href=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("/member/MyPageEnter\" ><i class=\"fa-solid fa-user\"></i></a></div>\n");
          out.write("\n");
          out.write("                </div>\n");
          out.write("					 ");
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
}
