/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.41
 * Generated at: 2021-04-05 16:30:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dto.LoginDto;

public final class match_005fpet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1614137368486L));
    _jspx_dependants.put("/Form/header.jsp", Long.valueOf(1617545595814L));
    _jspx_dependants.put("jar:file:/C:/Users/kas78/Desktop/khkhkh/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Semi/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.dto.LoginDto");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <title>Insert title here</title>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("      body {\r\n");
      out.write("        font-family: sans-serif;\r\n");
      out.write("        background-color: #eeeeee;\r\n");
      out.write("      }\r\n");
      out.write("      \r\n");
      out.write("      .centering{\r\n");
      out.write("      \t\r\n");
      out.write("      \ttext-algin : center;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .file-upload {\r\n");
      out.write("        background-color: #ffffff;\r\n");
      out.write("        width: 600px;\r\n");
      out.write("        margin: 0 auto;\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .file-upload-btn {\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        color: #fff;\r\n");
      out.write("        background: #1fb264;\r\n");
      out.write("        border: none;\r\n");
      out.write("        padding: 10px;\r\n");
      out.write("        border-radius: 4px;\r\n");
      out.write("        border-bottom: 4px solid #15824b;\r\n");
      out.write("        transition: all 0.2s ease;\r\n");
      out.write("        outline: none;\r\n");
      out.write("        text-transform: uppercase;\r\n");
      out.write("        font-weight: 700;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .file-upload-btn:hover {\r\n");
      out.write("        background: #1aa059;\r\n");
      out.write("        color: #ffffff;\r\n");
      out.write("        transition: all 0.2s ease;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .file-upload-btn:active {\r\n");
      out.write("        border: 0;\r\n");
      out.write("        transition: all 0.2s ease;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .file-upload-content {\r\n");
      out.write("        display: none;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .file-upload-input {\r\n");
      out.write("        position: absolute;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        padding: 0;\r\n");
      out.write("        width: 100%;\r\n");
      out.write("        height: 100%;\r\n");
      out.write("        outline: none;\r\n");
      out.write("        opacity: 0;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .image-upload-wrap {\r\n");
      out.write("        margin-top: 20px;\r\n");
      out.write("        border: 4px dashed #1fb264;\r\n");
      out.write("        position: relative;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .image-dropping,\r\n");
      out.write("      .image-upload-wrap:hover {\r\n");
      out.write("        background-color: #1fb264;\r\n");
      out.write("        border: 4px dashed #ffffff;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .image-title-wrap {\r\n");
      out.write("        padding: 0 15px 15px 15px;\r\n");
      out.write("        color: #222;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .drag-text {\r\n");
      out.write("        text-align: center;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .drag-text h3 {\r\n");
      out.write("        font-weight: 100;\r\n");
      out.write("        text-transform: uppercase;\r\n");
      out.write("        color: #15824b;\r\n");
      out.write("        padding: 60px 0;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .file-upload-image {\r\n");
      out.write("        max-height: 200px;\r\n");
      out.write("        max-width: 200px;\r\n");
      out.write("        margin: auto;\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .remove-image {\r\n");
      out.write("        width: 200px;\r\n");
      out.write("        margin: 0;\r\n");
      out.write("        color: #fff;\r\n");
      out.write("        background: #cd4535;\r\n");
      out.write("        border: none;\r\n");
      out.write("        padding: 10px;\r\n");
      out.write("        border-radius: 4px;\r\n");
      out.write("        border-bottom: 4px solid #b02818;\r\n");
      out.write("        transition: all 0.2s ease;\r\n");
      out.write("        outline: none;\r\n");
      out.write("        text-transform: uppercase;\r\n");
      out.write("        font-weight: 700;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .remove-image:hover {\r\n");
      out.write("        background: #c13b2a;\r\n");
      out.write("        color: #ffffff;\r\n");
      out.write("        transition: all 0.2s ease;\r\n");
      out.write("        cursor: pointer;\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      .remove-image:active {\r\n");
      out.write("        border: 0;\r\n");
      out.write("        transition: all 0.2s ease;\r\n");
      out.write("      }\r\n");
      out.write("    </style>\r\n");
      out.write("    <script\r\n");
      out.write("      class=\"jsbin\"\r\n");
      out.write("      src=\"https://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js\"\r\n");
      out.write("    ></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@tensorflow/tfjs@1.3.1/dist/tf.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@teachablemachine/image@0.8/dist/teachablemachine-image.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("      function readURL(input) {\r\n");
      out.write("        if (input.files && input.files[0]) {\r\n");
      out.write("          var reader = new FileReader();\r\n");
      out.write("\r\n");
      out.write("          reader.onload = function (e) {\r\n");
      out.write("            $(\".image-upload-wrap\").hide();\r\n");
      out.write("\r\n");
      out.write("            $(\".file-upload-image\").attr(\"src\", e.target.result);\r\n");
      out.write("            $(\".file-upload-content\").show();\r\n");
      out.write("            $(\".result-message\").hide();\r\n");
      out.write("\r\n");
      out.write("            $(\".image-title\").html(input.files[0].name);\r\n");
      out.write("          };\r\n");
      out.write("          reader.readAsDataURL(input.files[0]);\r\n");
      out.write("          init().then(function () {\r\n");
      out.write("            predict();\r\n");
      out.write("          });\r\n");
      out.write("        } else {\r\n");
      out.write("          removeUpload();\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      function removeUpload() {\r\n");
      out.write("        $(\".file-upload-input\").replaceWith($(\".file-upload-input\").clone());\r\n");
      out.write("        $(\".file-upload-content\").hide();\r\n");
      out.write("        $(\".image-upload-wrap\").show();\r\n");
      out.write("      }\r\n");
      out.write("      $(\".image-upload-wrap\").bind(\"dragover\", function () {\r\n");
      out.write("        $(\".image-upload-wrap\").addClass(\"image-dropping\");\r\n");
      out.write("      });\r\n");
      out.write("      $(\".image-upload-wrap\").bind(\"dragleave\", function () {\r\n");
      out.write("        $(\".image-upload-wrap\").removeClass(\"image-dropping\");\r\n");
      out.write("      });\r\n");
      out.write("    </script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("      // More API functions here:\r\n");
      out.write("      // https://github.com/googlecreativelab/teachablemachine-community/tree/master/libraries/image\r\n");
      out.write("\r\n");
      out.write("      // the link to your model provided by Teachable Machine export panel\r\n");
      out.write("      const URL = \"https://teachablemachine.withgoogle.com/models/KUWrkiFhy/\";\r\n");
      out.write("\r\n");
      out.write("      let model, webcam, labelContainer, maxPredictions;\r\n");
      out.write("\r\n");
      out.write("      // Load the image model and setup the webcam\r\n");
      out.write("      async function init() {\r\n");
      out.write("        const modelURL = URL + \"model.json\";\r\n");
      out.write("        const metadataURL = URL + \"metadata.json\";\r\n");
      out.write("\r\n");
      out.write("        // load the model and metadata\r\n");
      out.write("        // Refer to tmImage.loadFromFiles() in the API to support files from a file picker\r\n");
      out.write("        // or files from your local hard drive\r\n");
      out.write("        // Note: the pose library adds \"tmImage\" object to your window (window.tmImage)\r\n");
      out.write("        model = await tmImage.load(modelURL, metadataURL);\r\n");
      out.write("        maxPredictions = model.getTotalClasses();\r\n");
      out.write("        labelContainer = document.getElementById(\"label-container\");\r\n");
      out.write("        for (let i = 0; i < maxPredictions; i++) {\r\n");
      out.write("          // and class labels\r\n");
      out.write("          labelContainer.appendChild(document.createElement(\"div\"));\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("\r\n");
      out.write("      // run the webcam image through the image model\r\n");
      out.write("      async function predict() {\r\n");
      out.write("        // predict can take in an image, video or canvas html element\r\n");
      out.write("        var image = document.getElementById(\"face-image\");\r\n");
      out.write("        const prediction = await model.predict(image, false);\r\n");
      out.write("        prediction.sort(\r\n");
      out.write("          (a, b) => parseFloat(b.probability) - parseFloat(a.probability)\r\n");
      out.write("        );\r\n");
      out.write("        console.log(prediction[0].className);\r\n");
      out.write("        var resultMessege;\r\n");
      out.write("        switch (prediction[0].className) {\r\n");
      out.write("          case \"강아지\":\r\n");
      out.write("            resultMessege = \"강아지상\";\r\n");
      out.write("            break;\r\n");
      out.write("          case \"고양이\":\r\n");
      out.write("            resultMessege = \"고양이상\";\r\n");
      out.write("            break;\r\n");
      out.write("          default:\r\n");
      out.write("            resultMessege = \"알수없음\";\r\n");
      out.write("            break;\r\n");
      out.write("        }\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("          $(\".result-message\").val(resultMessege);\r\n");
      out.write("          $(\".result-message\").show();\r\n");
      out.write("        });\r\n");
      out.write("        $(\".result-message\").html(resultMessege);\r\n");
      out.write("        for (let i = 0; i < maxPredictions; i++) {\r\n");
      out.write("          const classPrediction =\r\n");
      out.write("            prediction[i].className +\r\n");
      out.write("            \": \" +\r\n");
      out.write("            prediction[i].probability.toFixed(2);\r\n");
      out.write("          labelContainer.childNodes[i].innerHTML = classPrediction;\r\n");
      out.write("        }\r\n");
      out.write("      }\r\n");
      out.write("    </script>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  \t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write(" \r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"resources/css/header.css\">\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"resources/js/header.js\"></script>\r\n");
      out.write("\t<link\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css\"\r\n");
      out.write("\trel=\"stylesheet\"\r\n");
      out.write("\tintegrity=\"sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl\"\r\n");
      out.write("\tcrossorigin=\"anonymous\" />\r\n");
      out.write("\t<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.0/font/bootstrap-icons.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css\">\r\n");
      out.write("\t\r\n");
      out.write("\t<!--  <link href=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"resouces/bootstrap/js/bootstrap.js\"></script>-->\r\n");
      out.write("</head>\r\n");
      out.write("  <body>\r\n");
      out.write("  ");

  	LoginDto dto1 = (LoginDto)session.getAttribute("dto");
  
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      <header>\r\n");
      out.write("\t      <!-- 로고 부분 -->\r\n");
      out.write("\t      <a href=\"move.do?move=home\" class=\"brand\">\r\n");
      out.write("\t      \t<img src=\"resources/img/logo.png\" alt=\"\" width=\"200px\">\r\n");
      out.write("\t      </a>\r\n");
      out.write("\t      <!-- ? -->\r\n");
      out.write("\t      <div class=\"menu-btn\"></div>\r\n");
      out.write("\t      \r\n");
      out.write("\t      <!-- 항복 부분 -->\r\n");
      out.write("\t      <div class=\"navigation\">\r\n");
      out.write("\t      \t<a href=\"move.do?move=petboard\">펫보드</a>\r\n");
      out.write("\t        <a href=\"move.do?move=noticeboard\">공지사항</a>\r\n");
      out.write("\t        <a href=\"move.do?move=matchPet\">얼굴인식</a>\r\n");
      out.write("\t        <a href=\"move.do?move=donation\">기부페이지</a>\r\n");
      out.write("\t        <a href=\"move.do?move=map\">지도페이지이동</a>\r\n");
      out.write("\t        <a href=\"move.do?move=doctor\">펫닥터페이지</a>\r\n");
      out.write("\t        ");

			if( dto1 != null ){
				if(dto1.getMem_image() == null){			    	
			
      out.write("\r\n");
      out.write("\t\t\t<div style=\"display : inline;\">\r\n");
      out.write("\t\t\t\t<a href=\"mypage.jsp\">\r\n");
      out.write("\t        \t\t<img src=\"resources/img/profile.jpg\"  width=\"32px\" height=\"32px;\" style=\"border-radius: 50%; overflow: hidden;\" >\r\n");
      out.write("\t        \t</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t        \t\t\t\t\t    \t\t\r\n");
      out.write("\t\t\t");

			    }else{
			
      out.write("\r\n");
      out.write("\t       \t<a href=\"mypage.jsp\">\r\n");
      out.write("\t            <img src=\"./upload/");
      out.print(dto1.getMem_image() );
      out.write("\"  width=\"32px\" height=\"32px;\" style=\"border-radius: 50%; overflow: hidden;\">\r\n");
      out.write("\t        </a>\r\n");
      out.write("\t\t\t");

				}			
			
      out.write("\r\n");
      out.write("\t\t   \t<a href=\"login.do?command=logout\">\r\n");
      out.write("\t\t   \t\t<button>로그아웃</button>\r\n");
      out.write("\t\t   \t</a>\r\n");
      out.write("\t       \t");

	       	} else {
	      	
      out.write("\r\n");
      out.write("\t       \t<a href=\"move.do?move=loginpage\">\r\n");
      out.write("\t       \t\t<button>로그인</button> \r\n");
      out.write("\t       \t</a>\r\n");
      out.write("\t       \t");

	       	}
	       	
      out.write("\r\n");
      out.write("\t       \t</div> \r\n");
      out.write("    </header>\r\n");
      out.write("    <div class=\"upsite\"></div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("    <form action=\"donate.do\" method=\"POST\">\r\n");
      out.write("      <div class=\"file-upload\">\r\n");
      out.write("        <button\r\n");
      out.write("          class=\"file-upload-btn\"\r\n");
      out.write("          type=\"button\"\r\n");
      out.write("          onclick=\"$('.file-upload-input').trigger( 'click' )\"\r\n");
      out.write("        >\r\n");
      out.write("          Add Image\r\n");
      out.write("        </button>\r\n");
      out.write("        <div class=\"image-upload-wrap\">\r\n");
      out.write("          <input\r\n");
      out.write("            class=\"file-upload-input\"\r\n");
      out.write("            type=\"file\"\r\n");
      out.write("            onchange=\"readURL(this);\"\r\n");
      out.write("            accept=\"image/*\"\r\n");
      out.write("          />\r\n");
      out.write("          <div class=\"drag-text\">\r\n");
      out.write("            <h3>Drag and drop a file or select add Image</h3>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"file-upload-content\">\r\n");
      out.write("          <img\r\n");
      out.write("            class=\"file-upload-image\"\r\n");
      out.write("            id=\"face-image\"\r\n");
      out.write("            src=\"#\"\r\n");
      out.write("            alt=\"your image\"\r\n");
      out.write("          />\r\n");
      out.write("          <!-- <a name=\"command\" href=\"Servlet.do\"><p class=\"result-message\"></p></a> -->\r\n");
      out.write("          <!-- <button class=\"result-message\" name=\"kindoftype\" onclick=\"location.href='animal.do'\"></button> -->\r\n");
      out.write("          \r\n");
      out.write("          <!-- 메시지 부분  -->\r\n");
      out.write("          <div>\r\n");
      out.write("          \t<input type=\"submit\" class=\"result-message centering\" name=\"command\"/>\r\n");
      out.write("          </div>\r\n");
      out.write("          \r\n");
      out.write("          \r\n");
      out.write("          <div id=\"label-container\"></div>\r\n");
      out.write("          <div class=\"image-title-wrap\">\r\n");
      out.write("            <button\r\n");
      out.write("              type=\"button\"\r\n");
      out.write("              onclick=\"removeUpload();\"\r\n");
      out.write("              class=\"remove-image\"\r\n");
      out.write("            >\r\n");
      out.write("              Remove <span class=\"image-title\">Uploaded Image</span>\r\n");
      out.write("            </button>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div id=\"webcam-container\"></div>\r\n");
      out.write("    </form>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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