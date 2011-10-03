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

    <!-- contacts.jsp: generated by stajanov code generator -->
    <f:loadBundle basename="com.autentia.tnt.resources.messages" var="msg" />
    <i:location place="contacts" msg="${msg}"/> 
    
    <f:view>
     <%@include file="/inc/header.jsp" %>
      <h:form id="contacts">
        
        <%-- Header --%>
        <i:titleBar msg="${msg}">
          <h:commandLink action="#{contactBean.advancedSearch}" rendered="#{contactBean.renderAdvancedSearch}">
            <h:graphicImage rendered="#{contactBean.renderAdvancedSearch}" title="#{msg.entityActions_exportAdvancedSearch}"  value="/img/page_excel.png" styleClass="titleImg" />
          </h:commandLink>
          <h:commandLink action="#{contactBean.search}">
            <h:graphicImage rendered="#{ contactBean.search.searchActive}" title="#{msg.entityActions_filtered}"  value="/img/search_applied.gif" styleClass="titleImg" />
            <h:graphicImage rendered="#{!contactBean.search.searchActive}" title="#{msg.entityActions_search}"    value="/img/search.gif"         styleClass="titleImg" />
          </h:commandLink>
          <h:commandLink action="#{contactBean.reset}">
            <h:graphicImage rendered="#{contactBean.search.searchActive}" title="#{msg.entityActions_reset}"  value="/img/eraser.png" styleClass="titleImg" />           
          </h:commandLink>
          <h:commandLink action="#{contactBean.create}" rendered="#{contactBean.createAvailable}">
            <h:graphicImage title="#{msg.entityActions_create}"  value="/img/new.gif" styleClass="titleImg" />
          </h:commandLink>
        </i:titleBar>
        
        
          <%-- ABC quick pager --%>
          <div class="abcPager">
            <h:outputText value="#{msg['abcPager.title']}" styleClass="abcPagerTitle"/>
            <a:abcPager styleClass="abcPagerLetter" selectedStyleClass="abcPagerSelectedLetter" 
                        value="#{contactBean.letter}" action="#{contactBean.letterClicked}"
                        allowUnselect="true" unselectImage="/img/no_funnel.png"/>
          </div>

        
        <%-- List of contacts --%>
        <t:dataTable id="list" var="contact" value="#{contactBean.all}" preserveDataModel="false" 
            cellpadding="0" cellspacing="0" styleClass="listTable" 
            headerClass="listHeaderCell" footerClass="listFooter" 
            rows="#{settingBean.mySettings.listSize}" rowClasses="listRowO,listRowE"
            columnClasses="listCmdCell,listCmdCell,listContactName,listContactEmail,listContactPhone,listContactMobile,listContactOrganization"
            sortColumn="#{contactBean.sortColumn}" sortAscending="#{contactBean.sortAscending}"
	    rowOnMouseOver="this.savedClassName=this.className;this.className='listRowSel';" 
	    rowOnMouseOut="this.className=this.savedClassName;">
          
          <%-- Commands --%>
          <h:column>
            <f:facet name="header">
              <f:verbatim>-</f:verbatim>
            </f:facet>
            <t:commandLink action="#{contactBean.detail}" immediate="true">
              <f:param name="rowid" value="#{contact.id}" />
              <h:graphicImage title="#{msg.entityActions_detail}"  value="/img/detail.gif" styleClass="cmdImg" />
            </t:commandLink>
          </h:column>

			<h:column rendered="#{contactBean.renderHistory}">
				<f:facet name="header">
					<f:verbatim>-</f:verbatim>
				</f:facet>
				<t:commandLink action="#{contactBean.showHistory}" immediate="true">
					<f:param name="rowid" value="#{contact.id}" />
					<h:graphicImage title="#{msg.entityActions_showHistory}"
						value="/img/history.png" styleClass="cmdImg" />
				</t:commandLink>
			</h:column>
    
    
      <%-- Field: name --%>
    <h:column>
      <f:facet name="header">
      	        <t:commandSortHeader styleClass="listHeader" columnName="name">
                 <f:facet name="ascending">
            <t:graphicImage value="/img/ascending-arrow.gif" border="0" />
          </f:facet>
          <f:facet name="descending">
            <t:graphicImage value="/img/descending-arrow.gif" border="0" />
          </f:facet>
          <f:verbatim>${msg['contact.name']}</f:verbatim>
        </t:commandSortHeader>
      </f:facet>

      <t:commandLink action="#{contactBean.detail}" immediate="true">
	<f:param name="rowid" value="#{contact.id}" />
		  <%-- String field --%>
	  <h:outputText value="#{contact.name}" />
	      </t:commandLink>

    </h:column>
  

      <%-- Field: email --%>
    <h:column>
      <f:facet name="header">
      	        <t:commandSortHeader styleClass="listHeader" columnName="email">
                 <f:facet name="ascending">
            <t:graphicImage value="/img/ascending-arrow.gif" border="0" />
          </f:facet>
          <f:facet name="descending">
            <t:graphicImage value="/img/descending-arrow.gif" border="0" />
          </f:facet>
          <f:verbatim>${msg['contact.email']}</f:verbatim>
        </t:commandSortHeader>
      </f:facet>

      <t:commandLink action="#{contactBean.detail}" immediate="true">
	<f:param name="rowid" value="#{contact.id}" />
		  <%-- String field --%>
	  <h:outputText value="#{contact.email}" />
	      </t:commandLink>

    </h:column>
  

      <%-- Field: phone --%>
    <h:column>
      <f:facet name="header">
      	        <t:commandSortHeader styleClass="listHeader" columnName="phone">
                 <f:facet name="ascending">
            <t:graphicImage value="/img/ascending-arrow.gif" border="0" />
          </f:facet>
          <f:facet name="descending">
            <t:graphicImage value="/img/descending-arrow.gif" border="0" />
          </f:facet>
          <f:verbatim>${msg['contact.phone']}</f:verbatim>
        </t:commandSortHeader>
      </f:facet>

      <t:commandLink action="#{contactBean.detail}" immediate="true">
	<f:param name="rowid" value="#{contact.id}" />
		  <%-- String field --%>
	  <h:outputText value="#{contact.phone}" />
	      </t:commandLink>

    </h:column>
  

      <%-- Field: mobile --%>
    <h:column>
      <f:facet name="header">
      	        <t:commandSortHeader styleClass="listHeader" columnName="mobile">
                 <f:facet name="ascending">
            <t:graphicImage value="/img/ascending-arrow.gif" border="0" />
          </f:facet>
          <f:facet name="descending">
            <t:graphicImage value="/img/descending-arrow.gif" border="0" />
          </f:facet>
          <f:verbatim>${msg['contact.mobile']}</f:verbatim>
        </t:commandSortHeader>
      </f:facet>

      <t:commandLink action="#{contactBean.detail}" immediate="true">
	<f:param name="rowid" value="#{contact.id}" />
		  <%-- String field --%>
	  <h:outputText value="#{contact.mobile}" />
	      </t:commandLink>

    </h:column>
  

      <%-- Ignored field: notified --%>
  

      <%-- Ignored field: position --%>
  

      <%-- Ignored field: ownerId --%>
  

      <%-- Ignored field: departmentId --%>
  

      <%-- Ignored field: insertDate --%>
  

      <%-- Ignored field: updateDate --%>
  

     
  
        </t:dataTable>
          
        <%-- Paginator control --%>
        <%@include file="/inc/paginator.jsp" %>
        
      </h:form>
    </f:view>
    
  </body>
</html>  		
