<%@ page language="java" import="java.util.*"  contentType="text/html;charset=UTF-8" %>
<%@ include file="iframe/head.jsp" %>
<%
    String id=request.getParameter("id"); if(id==null)id=(String)request.getAttribute("id");
    List list=cb.get1Com("select * from zy where id='"+id+"'",7);
%>
<div class="main">
    <div class="narea"><div>
        <img height="326" src="<%=basePath %>images/zgm.jpg" width="1020">
    </div>
    </div>
    <div class="cmain">
        <div class="rmain">
            <div class="rdetail">
                <div class="rdtitle"><span><%=list.get(1).toString() %></span></div>
                <div class="rdmark">实验要求：<%=list.get(2).toString() %>  发布时间：<%=list.get(5).toString() %>  发布教师：<%=list.get(6).toString() %>
                    <a href="<%=basePath%>down.jsp?url=<%=list.get(3).toString()%>">下载附件</a>
                    <a href="<%=basePath%>sj/toSj?id=<%=id%>">上交实验</a>
                </div>
                <div class="rcontent"><%=list.get(4).toString() %></div>
                <div class="rdmark"></div>
            </div>
        </div>
    </div>
</div>
<%@ include file="iframe/foot.jsp"%>
