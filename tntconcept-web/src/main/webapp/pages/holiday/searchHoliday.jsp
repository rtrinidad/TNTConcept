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
    
    <!-- searchHoliday.jsp: generated by stajanov code generator -->
    <f:loadBundle basename="com.autentia.tnt.resources.messages" var="msg" />
    <i:location place="searchHoliday" msg="${msg}"/> 
    
    <f:view>
        <%@include file="/inc/header.jsp" %>
      <h:form id="search" enctype="multipart/form-data">
        
        <%-- Header --%>
        <i:titleBar msg="${msg}">
          <h:commandLink action="#{holidayBean.list}">
            <h:graphicImage title="#{msg.entityActions_run}"  value="/img/run.png" styleClass="titleImg" />
          </h:commandLink>
        </i:titleBar>
        
        <%-- Search form --%>
        <table class="searchTable" cellpadding="0" cellspacing="0">

          
      <%-- Ignored field: id --%>

                        
      <%-- Field: description --%>
    <tr>
      <td class="searchLabel">${msg['holiday.description']}:</td>
      <td class="searchFieldCell">

        
          
          <h:panelGroup>
            <h:message styleClass="error" showSummary="true" showDetail="false" for="description" />
            <h:selectBooleanCheckbox id="descriptionValid" value="#{holidayBean.searchDescriptionValid}" 
                                      onclick="setEnabled('search:description',this.checked)"/>
            <h:inputText id="description" value="#{holidayBean.searchDescription}" size="70"/>
          </h:panelGroup>
          <script>
            setEnabled( 'search:description', ${holidayBean.searchDescriptionValid} )
          </script>

        
      </td>
    </tr>
                        
      <%-- Field: date --%>
    <tr>
      <td class="searchLabel">${msg['holiday.date']}:</td>
      <td class="searchFieldCell">

        
                    
          <h:panelGroup>
            <h:message styleClass="error" showSummary="true" showDetail="false" for="startDate" />
            <h:selectBooleanCheckbox id="startDateValid" value="#{holidayBean.searchStartDateValid}" 
                                      onclick="setEnabled('search:startDate',this.checked)"/>
            <t:inputCalendar id="startDate" value="#{holidayBean.searchStartDate}"
                             renderAsPopup="true" popupDateFormat="d/MM/yyyy" renderPopupButtonAsImage="true" 
                             popupTodayString="#{msg['calendar.today']}" popupWeekString="#{msg['calendar.week']}"
                             onchange="setEnabled('search:startDate',true);setChecked('search:startDateValid',true);"
                             />
          </h:panelGroup>
          -
          <h:panelGroup>
            <h:message styleClass="error" showSummary="true" showDetail="false" for="endDate" />
            <h:selectBooleanCheckbox id="endDateValid" value="#{holidayBean.searchEndDateValid}" 
                                      onclick="setEnabled('search:endDate',this.checked)"/>
            <t:inputCalendar id="endDate" value="#{holidayBean.searchEndDate}"
                             renderAsPopup="true" popupDateFormat="d/MM/yyyy" renderPopupButtonAsImage="true" 
                             popupTodayString="#{msg['calendar.today']}" popupWeekString="#{msg['calendar.week']}"
                             onchange="setEnabled('search:endDate',true);setChecked('search:endDateValid',true);"
                             />
          </h:panelGroup>
          <script>
            setEnabled( 'search:startDate', ${holidayBean.searchStartDateValid} )
            setEnabled( 'search:endDate', ${holidayBean.searchEndDateValid} )
          </script>

        
      </td>
    </tr>
                        
      <%-- Ignored field: ownerId --%>

                        
      <%-- Ignored field: departmentId --%>

                        
      <%-- Ignored field: insertDate --%>

                        
      <%-- Ignored field: updateDate --%>

                                          
        </table>
        
      </h:form>
    </f:view>
    
  </body>
</html>  		