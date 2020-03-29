<%@ page language="java" import="java.util.*"  contentType="text/html;charset=UTF-8" %>
<%@ include file="iframe/head.jsp" %>  
<div class="main">
    <div class="narea">
        <div>
            <img height="326" src="<%=basePath%>images/zgm.jpg" width="1020">
        </div>
    </div>
<div class="rmain">
    <div class="rlist">
        <table width="98%" border="0" align="left" cellpadding="4" cellspacing="0" class="rtable">
            <tbody>
            <tr class="tr1">
                <td class="rldate daslist">信息标题</td>
                <td class="rldate daslist">信息来源</td>
                <td class="rldate daslist">发布时间</td>
            </tr>
<%
	List pagelist3 = cb.getCom("select * from xw order by id desc limit 5 ",5);
    if(!pagelist3.isEmpty()){
    for(int i=0;i<pagelist3.size();i++){
        List pagelist2 =(ArrayList)pagelist3.get(i);
%>
            <tr class="tr<%=(i)%2%>">
                <td class="rltitle dotlist"><a href="<%=basePath %>xwinfo.jsp?id=<%=pagelist2.get(0).toString()%>"><%=pagelist2.get(1).toString() %></a></td>
                <td class="rldate daslist"><%=pagelist2.get(2).toString() %></td>
                <td class="rldate daslist"><%=pagelist2.get(4).toString() %></td>
            </tr>
<% }} %>
            </tbody>
        </table>
    </div>
    <div class="rlist">
        <table width="100%" height="260" align="center" border="0" cellpadding="0" cellspacing="0">
            <tbody>
            <tr>
                <%List kclist=cb.getCom("select * from kc order by id desc limit 4",4);
                    if(!kclist.isEmpty()){
                        for(int i=0;i<kclist.size();i++){
                            List list2 =(ArrayList)kclist.get(i);
                %>
                <td align="center" valign="top" class="listline-dot-4" style="padding:10px 0;">
                    <table width="100%" align="center" height="100" border="0" cellpadding="10" cellspacing="0">
                        <tbody>
                        <tr>
                            <td height="200" align="center">
                                <div style="text-align:center;">
                                    <div style="text-align:center;">
                                        <a href="<%=basePath %>kcinfo.jsp?id=<%=list2.get(0).toString()%>">
                                            <img src="<%=basePath+list2.get(3).toString()%>" width="240" height="200" border="0"></a>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td height="20" align="center">
                                <div style="text-align:center; padding:0 10px; line-height:18px;">
                                    <a href="<%=basePath %>kcinfo.jsp?id=<%=list2.get(0).toString()%>"><%=list2.get(1).toString()%></a>
                                </div>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </td>
                <%}} %>
            </tr>
            </tbody>
        </table>
        <table width="100%" height="260" align="center" border="0" cellpadding="0" cellspacing="0">
            <tbody>
            <tr>
                <%List kc2list=cb.getCom("select * from kc order by id desc limit 8",4);
                    if(!kc2list.isEmpty()){
                        for(int i=4;i<kc2list.size();i++){
                            List list2 =(ArrayList)kc2list.get(i);
                %>
                <td align="center" valign="top" class="listline-dot-4" style="padding:10px 0;">
                    <table width="100%" align="center" height="100" border="0" cellpadding="10" cellspacing="0">
                        <tbody>
                        <tr>
                            <td height="200" align="center">
                                <div style="text-align:center;">
                                    <div style="text-align:center;">
                                        <a href="<%=basePath %>kcinfo.jsp?id=<%=list2.get(0).toString()%>">
                                            <img src="<%=basePath+list2.get(3).toString()%>" width="240" height="200" border="0"></a>
                                    </div>
                                </div>
                            </td>
                        </tr>
                        <tr>
                            <td height="20" align="center">
                                <div style="text-align:center; padding:0 10px; line-height:18px;">
                                    <a href="<%=basePath %>kcinfo.jsp?id=<%=list2.get(0).toString()%>"><%=list2.get(1).toString()%></a>
                                </div>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </td>
                <%}} %>
            </tr>
            </tbody>
        </table>
    </div>
</div>
</div>
<%@ include file="iframe/foot.jsp"%>
