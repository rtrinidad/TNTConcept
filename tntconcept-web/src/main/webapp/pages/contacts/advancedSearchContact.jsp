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

<%-- 
 * TNTConcept Easy Enterprise Management by Autentia Real Bussiness Solution S.L.  
 *	Copyright (C) 2007 Autentia Real Bussiness Solution S.L.					   
 *	
 * 	This program is free software; you can redistribute it and/or
 * 	modify it under the terms of the GNU General Public License
 * 	as published by the Free Software Foundation; either version 2
 * 	of the License, or (at your option) any later version.
 *
 * 	This program is distributed in the hope that it will be useful,
 * 	but WITHOUT ANY WARRANTY; without even the implied warranty of
 * 	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * 	GNU General Public License for more details.
 *
 * 	You should have received a copy of the GNU General Public License
 * 	along with this program; if not, write to the Free Software
 * 	Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 * 	Autentia Real Bussiness Solution S.L.
 * 	Tlf: +34 91 675 33 06, +34 655 99 11 72
 * 	Fax: +34 91 656 65 04
 * 	info@autentia.com																
 *
 --%>
<%@page language="java" contentType="text/html; charset=UTF-8"%>

<%@include file="/inc/tlibs.jsp" %>

<html>
  <head>
    <%@include file="/inc/uiCore.jsp" %>
  </head>	
  <body>
    
    <!-- searchContact.jsp: generated by stajanov code generator -->
    <f:loadBundle basename="com.autentia.tnt.resources.messages" var="msg" />
    <i:location place="searchContact" msg="${msg}"/> 
    
    <f:view>
      <%@include file="/inc/header.jsp" %>
      <h:form id="search" enctype="multipart/form-data">
        
        <%-- Header --%>
        <i:titleBar msg="${msg}">
          <h:commandLink action="#{contactBean.list}" immediate="true">
            <h:graphicImage value="/img/back.gif" styleClass="titleImg" />
          </h:commandLink>
          <h:commandLink action="#{advancedSearchContactBean.search}">
            <h:graphicImage title="#{msg.entityActions_run}"  value="/img/run.png" styleClass="titleImg" />
                ${msg['contact.advancedSearch.justActives']}
          </h:commandLink>
          <h:commandLink action="#{advancedSearchContactBean.searchInChanges}">
            <h:graphicImage title="#{msg.entityActions_run}"  value="/img/run.png" styleClass="titleImg" />
                ${msg['contact.advancedSearch.activesAndChanges']}
          </h:commandLink>
        </i:titleBar>

        <%-- Search form --%>
        <table class="searchTable" cellpadding="0" cellspacing="0">

        <%-- Field: tags --%>
        <tr>
          <td class="searchLabel">${msg['contact.tags']}:</td>
          <td class="searchFieldCell">
              <h:panelGroup>
                <h:message styleClass="error" showSummary="true" showDetail="false" for="tags" />
                <h:selectBooleanCheckbox id="tagsValid" value="#{advancedSearchContactBean.searchTagsValid}"
                                          onclick="setEnabled('search:tags',this.checked)"/>
                <h:selectManyListbox id="tags" value="#{advancedSearchContactBean.searchTags}" onclick="setEnabled('search:tags',true)" size="4">
                  <f:selectItems value="#{contactBean.allTags}" />
                  <f:converter converterId="autentia.EntityConverter"/>
                  <f:attribute name="com.autentia.tnt.converter.EntityConverter.valueClass"
                               value="com.autentia.tnt.businessobject.Tag"/>
                </h:selectManyListbox>
              </h:panelGroup>
              <script>
                setEnabled( 'search:tags', ${advancedSearchContactBean.searchTagsValid} )
              </script>
          </td>
        </tr>

        <%-- Field: positions --%>
        <tr>
          <td class="searchLabel">${msg['contact.position']}:</td>
          <td class="searchFieldCell">
              <h:panelGroup>
                <h:message styleClass="error" showSummary="true" showDetail="false" for="positions" />
                <h:selectBooleanCheckbox id="positionsValid" value="#{advancedSearchContactBean.searchPositionsValid}"
                                          onclick="setEnabled('search:positions',this.checked)"/>

                <h:selectManyListbox id="positions" value="#{advancedSearchContactBean.searchPositions}" onclick="setEnabled('search:positions',true)" size="4">
                  <f:selectItems value="#{advancedSearchContactBean.allPositions}" />
                  <f:converter converterId="autentia.EntityConverter"/>
                  <f:attribute name="com.autentia.tnt.converter.EntityConverter.valueClass"
                               value="com.autentia.tnt.businessobject.Position"/>
                </h:selectManyListbox>
              </h:panelGroup>
              <script>
                setEnabled( 'search:positions', ${advancedSearchContactBean.searchPositionsValid} )
              </script>
          </td>
        </tr>

        <%-- Field: organizations --%>
        <tr>
          <td class="searchLabel">${msg['contact.organization']}:</td>
          <td class="searchFieldCell">
              <h:panelGroup>
                <h:message styleClass="error" showSummary="true" showDetail="false" for="organizations" />
                <h:selectBooleanCheckbox id="organizationsValid" value="#{advancedSearchContactBean.searchOrganizationsValid}"
                                          onclick="setEnabled('search:organizations',this.checked)"/>
                <h:selectManyListbox id="organizations" value="#{advancedSearchContactBean.searchOrganizations}" onclick="setEnabled('search:organizations',true)" size="4">
                  <f:selectItems value="#{advancedSearchContactBean.allOrganizations}" />
                  <f:converter converterId="autentia.EntityConverter"/>
                  <f:attribute name="com.autentia.tnt.converter.EntityConverter.valueClass"
                               value="com.autentia.tnt.businessobject.Organization"/>
                </h:selectManyListbox>
              </h:panelGroup>
              <script>
                setEnabled( 'search:organizations', ${advancedSearchContactBean.searchOrganizationsValid} )
              </script>
          </td>
        </tr>

        <%-- Field: country --%>
        <tr>
          <td class="searchLabel">${msg['contact.country']}:</td>
          <td class="searchFieldCell">
              <h:panelGroup>
                <h:message styleClass="error" showSummary="true" showDetail="false" for="country" />
                <h:selectBooleanCheckbox id="countryValid" value="#{advancedSearchContactBean.searchCountryValid}"
                                          onclick="setEnabled('search:country',this.checked)"/>
                <h:inputText id="country" value="#{advancedSearchContactBean.searchCountry}" size="70"/>
              </h:panelGroup>
              <script>
                setEnabled( 'search:country', ${advancedSearchContactBean.searchCountryValid} )
              </script>
          </td>
        </tr>

        <%-- Field: name --%>
        <tr>
          <td class="searchLabel">${msg['contact.name']}:</td>
          <td class="searchFieldCell">
              <h:panelGroup>
                <h:message styleClass="error" showSummary="true" showDetail="false" for="name" />
                <h:selectBooleanCheckbox id="nameValid" value="#{advancedSearchContactBean.searchNameValid}"
                                          onclick="setEnabled('search:name',this.checked)"/>
                <h:inputText id="name" value="#{advancedSearchContactBean.searchName}" size="70"/>
              </h:panelGroup>
              <script>
                setEnabled( 'search:name', ${advancedSearchContactBean.searchNameValid} )
              </script>
          </td>
        </tr>

        <%-- Field: departments --%>
        <tr>
          <td class="searchLabel">${msg['contact.department']}:</td>
          <td class="searchFieldCell">
              <h:panelGroup>
                <h:message styleClass="error" showSummary="true" showDetail="false" for="departments" />
                <h:selectBooleanCheckbox id="departmentsValid" value="#{advancedSearchContactBean.searchDepartmentsValid}"
                                          onclick="setEnabled('search:departments',this.checked)"/>
                <h:selectManyListbox id="departments" value="#{advancedSearchContactBean.searchDepartments}" onclick="setEnabled('search:departments',true)" size="4">
                  <f:selectItems value="#{advancedSearchContactBean.allDepartments}" />
                  <f:converter converterId="autentia.EntityConverter"/>
                  <f:attribute name="com.autentia.tnt.converter.EntityConverter.valueClass"
                               value="com.autentia.tnt.businessobject.Department"/>
                </h:selectManyListbox>
              </h:panelGroup>
              <script>
                setEnabled( 'search:departments', ${advancedSearchContactBean.searchDepartmentsValid} )
              </script>
          </td>
        </tr>

        </table>
        
      </h:form>
    </f:view>
    
  </body>
</html>  		
