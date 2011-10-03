<%--

    TNTConcept Easy Enterprise Management by Autentia Real Bussiness Solution S.L.
    Copyright (C) 2007 Autentia Real Bussiness Solution S.L.

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

--%>

 <%@page language="java" contentType="text/html; charset=UTF-8"%>

<%@include file="/inc/tlibs.jsp" %>

<html>
  <head>
    <%@include file="/inc/uiCore.jsp" %>
  </head>
  <body>

    <!-- editContact.jsp: generated by stajanov code generator -->
    <f:loadBundle basename="com.autentia.tnt.resources.messages" var="msg" />
    <i:location place="editCollaborator" msg="${msg}"/>

    <f:view>
        <%@include file="/inc/header.jsp" %>
      <h:form id="contact" enctype="multipart/form-data">

        <%-- Header --%>
        <i:titleBar name="${collaboratorBean.name}" msg="${msg}">
          <h:commandLink rendered="#{collaboratorBean.id == null}" action="#{collaboratorBean.save}">
            <h:graphicImage value="/img/save.gif" styleClass="titleImg" />
          </h:commandLink>
          <h:commandLink rendered="#{collaboratorBean.id != null}" action="#{collaboratorBean.delete}" onclick="if( !confirm('#{msg['question.confirmDelete']}') ) return false;">
            <h:graphicImage value="/img/delete.gif" styleClass="titleImg" />
          </h:commandLink>
          <h:commandLink action="#{collaboratorBean.list}" immediate="true">
            <h:graphicImage value="/img/back.gif" styleClass="titleImg" />
          </h:commandLink>
        </i:titleBar>

        <%-- Edition form --%>
        <table class="editTable" cellpadding="0" cellspacing="0">
<%-- collaborator - generated by stajanov (do not edit/delete) --%>

                                              
  
      <%-- Field: user --%>
    <tr>
    	    		<td class="editLabelRW">${msg['collaborator.user']}:</td>
    	      
      <td class="editFieldCell">

                  <h:panelGroup>
            <h:message styleClass="error" showSummary="true" showDetail="false" for="user" />
            <h:selectOneMenu id="user" value="#{collaboratorBean.user}" >
              <f:selectItems value="#{collaboratorBean.users}" />
              <f:converter converterId="autentia.EntityConverter"/>
            </h:selectOneMenu>
          </h:panelGroup>

              </td>
    </tr>
                                  
  
      <%-- Field: contact --%>
    <tr>
    	    		<td class="editLabelRW">${msg['collaborator.contact']}:</td>
    	      
      <td class="editFieldCell">

                  <h:panelGroup>
            <h:message styleClass="error" showSummary="true" showDetail="false" for="contact" />
            <h:selectOneMenu id="contact" value="#{collaboratorBean.contact}" >
              <f:selectItems value="#{collaboratorBean.contacts}" />
              <f:converter converterId="autentia.EntityConverter"/>
            </h:selectOneMenu>
          </h:panelGroup>

              </td>
    </tr>
                                  
  
      <%-- Field: organization --%>
    <tr>
    	    		<td class="editLabelRW">${msg['collaborator.organization']}:</td>
    	      
      <td class="editFieldCell">

                  <h:panelGroup>
            <h:message styleClass="error" showSummary="true" showDetail="false" for="organization" />
            <h:selectOneMenu id="organization" value="#{collaboratorBean.organization}" >
              <f:selectItems value="#{collaboratorBean.organizations}" />
              <f:converter converterId="autentia.EntityConverter"/>
            </h:selectOneMenu>
          </h:panelGroup>

              </td>
    </tr>
                                      
<%-- collaborator - generated by stajanov (do not edit/delete) --%>

       </table>
       <h:messages styleClass="error" id="errorMessage" showSummary="true" showDetail="false" />
      </h:form>
    </f:view>

  </body>
</html>