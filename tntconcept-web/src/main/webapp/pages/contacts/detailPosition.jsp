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
    
    <!-- editPosition.jsp: generated by stajanov code generator -->
    <f:loadBundle basename="com.autentia.tnt.resources.messages" var="msg" />
    <i:location place="detailPosition" msg="${msg}"/> 
    
    <f:view>
      <%@include file="/inc/header.jsp" %>
      <h:form id="position" enctype="multipart/form-data">
        
        <%-- Header --%>
        <i:titleBar name="${positionBean.${desc-props.getProperty("editTitleField")}}" msg="${msg}">
          <t:commandLink action="#{positionBean.edit}" immediate="true" rendered="#{positionBean.editAvailable}">
            <f:param name="id" value="#{positionBean.id}" />
            <h:graphicImage title="#{msg.entityActions_edit}"  value="/img/edit.gif" styleClass="cmdImg" />
          </t:commandLink>
          <h:commandLink action="#{positionBean.delete}" rendered="#{positionBean.deleteAvailable}" onclick="if( !confirm('#{msg['question.confirmDelete']}') ) return false;">
            <h:graphicImage title="#{msg.entityActions_delete}"  value="/img/delete.gif" styleClass="titleImg" />
          </h:commandLink>
          <h:commandLink action="#{positionBean.list}" immediate="true">
            <h:graphicImage title="#{msg.entityActions_back}"  value="/img/back.gif" styleClass="titleImg" />
          </h:commandLink>
        </i:titleBar>


        <%-- Detail form --%>
        <table class="detailTable" cellpadding="0" cellspacing="0">

            
    
  
  
      <%-- Field: id --%>
    <tr>
	<td class="detailLabelRW">${msg['position.id']}:</td>
	<td class="detailFieldCell">
         	       <h:outputText value="#{positionBean.id}" />
 	      </td>
    </tr>
                            
    
  
  
      <%-- Field: ownerId --%>
    <tr>
	<td class="detailLabelRW">${msg['position.ownerId']}:</td>
	<td class="detailFieldCell">
         	       <h:outputText value="#{positionBean.ownerId}" />
 	      </td>
    </tr>
                            
    
  
  
      <%-- Field: departmentId --%>
    <tr>
	<td class="detailLabelRW">${msg['position.departmentId']}:</td>
	<td class="detailFieldCell">
         	       <h:outputText value="#{positionBean.departmentId}" />
 	      </td>
    </tr>
                            
    
  
  
      <%-- Field: name --%>
    <tr>
	<td class="detailLabelRW">${msg['position.name']}:</td>
	<td class="detailFieldCell">
         	       <h:outputText value="#{positionBean.name}" />
 	      </td>
    </tr>
                            
    
  
  
      <%-- Field: description --%>
    <tr>
	<td class="detailLabelRW">${msg['position.description']}:</td>
	<td class="detailFieldCell">
         	       <h:outputText value="#{positionBean.description}" />
 	      </td>
    </tr>
                            
    
  
  
      <%-- Field: insertDate --%>
    <tr>
	<td class="detailLabelRW">${msg['position.insertDate']}:</td>
	<td class="detailFieldCell">
         	    	<h:outputText value="#{positionBean.insertDate}" converter="autentia.dateConverter" />
 	          </td>
    </tr>
                            
    
  
  
      <%-- Field: updateDate --%>
    <tr>
	<td class="detailLabelRW">${msg['position.updateDate']}:</td>
	<td class="detailFieldCell">
         	    	<h:outputText value="#{positionBean.updateDate}" converter="autentia.dateConverter" />
 	          </td>
    </tr>
                            
    
  
  
      <%-- Field: deleteDate --%>
    <tr>
	<td class="detailLabelRW">${msg['position.deleteDate']}:</td>
	<td class="detailFieldCell">
         	    	<h:outputText value="#{positionBean.deleteDate}" converter="autentia.dateConverter" />
 	          </td>
    </tr>
                                                  
        </table>

      </h:form>
    </f:view>
    
  </body>
</html>  		

<%-- Commissioning - generated by stajanov (do not edit/delete) --%>