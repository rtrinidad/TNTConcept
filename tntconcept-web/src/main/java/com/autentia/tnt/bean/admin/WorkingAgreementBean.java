/**
 * TNTConcept Easy Enterprise Management by Autentia Real Bussiness Solution S.L.
 * Copyright (C) 2007 Autentia Real Bussiness Solution S.L.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.autentia.tnt.bean.admin;

import java.util.Date;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlDataTable;

import org.acegisecurity.acls.domain.BasePermission;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.autentia.tnt.bean.BaseBean;
import com.autentia.tnt.bean.NavigationResults;
import com.autentia.tnt.businessobject.WorkingAgreement;
import com.autentia.tnt.dao.SortCriteria;
import com.autentia.tnt.dao.search.WorkingAgreementSearch;
import com.autentia.tnt.manager.admin.WorkingAgreementManager;
import com.autentia.tnt.manager.security.Permission;
import com.autentia.tnt.upload.Uploader;
import com.autentia.tnt.upload.UploaderFactory;
import com.autentia.tnt.util.FacesUtils;
import com.autentia.tnt.util.SpringUtils;

public class WorkingAgreementBean extends BaseBean 
{

/* generated by stajanov (do not edit/delete) */


















  /** Logger */
  private static final Log log = LogFactory.getLog(WorkingAgreementBean.class);

 /** Active search object */
  private WorkingAgreementSearch search = new WorkingAgreementSearch();

  /** Manager */
  private static WorkingAgreementManager manager = WorkingAgreementManager.getDefault();
  
  /** Upload service */
  private static final Uploader uploader = UploaderFactory.getInstance("workingAgreement");
    
                                                          
  /** Active WorkingAgreement object */
  private WorkingAgreement workingAgreement;
  
  /** Default sort column */
  private String sortColumn = "name";
    
  /** Default sort order */
  private boolean sortAscending = true;

      /** Quick search letter for ABC pager control */
    private Character letter;
  
  /**
   * List workingAgreements. Order depends on Faces parameter sort.
   * @return the list of all workingAgreements sorted by requested criterion
   */
  public List<WorkingAgreement> getAll(){
    return manager.getAllEntities(search, new SortCriteria(sortColumn, sortAscending) );      
  }

  // Getters to list possible values of related entities
        
  // Getters to list possible values of enum fields
                                            

  // Methods to create/remove instances of one-to-many entities (slave entities)
  
  /**
   * Whether or not create button is available for user
   * @return true if user can create objects of type WorkingAgreement
   */
  public boolean isCreateAvailable()
  {
    return SpringUtils.isRolePermissionGranted(Permission.Entity_Create(WorkingAgreement.class));
  }

  /**
   * Whether or not edit button is available for user
   * @return true if user can edit current object
   */
  public boolean isEditAvailable()
  {
    return SpringUtils.isAclPermissionGranted(workingAgreement,BasePermission.WRITE);
  }

  /**
   * Whether or not delete button is available for user
   * @return true if user can delete current object
   */
  public boolean isDeleteAvailable()
  {
    return (workingAgreement.getId()!=null) &&
	   SpringUtils.isAclPermissionGranted(workingAgreement,BasePermission.DELETE);
  }

  /**
   * Go to create page
   * @return forward to CREATE page
   */
  public String create(){
    workingAgreement = new WorkingAgreement();
       
    return NavigationResults.CREATE;
  }

  /**
   * Go to detail page
   * @return forward to DETAIL page
   */
  public String detail(){
    Integer id = Integer.parseInt( FacesUtils.getRequestParameter(ROW_ID) );
    workingAgreement = manager.getEntityById(id);

    return SpringUtils.isAclPermissionGranted( workingAgreement, BasePermission.WRITE )
	    ? NavigationResults.EDIT
	    : NavigationResults.DETAIL;
  }

  /**
   * Save bean and stay on it
   * @return forward to list page
   */
  public String save(){
  
      doBeforeSave();
  
      if( workingAgreement.getId()==null ){
        manager.insertEntity(workingAgreement);
      } else {
        manager.updateEntity(workingAgreement);
      }
      

                                                                                                                      
      // Calls an after save action
      String result = doAfterSave(NavigationResults.LIST);

      // Unselect object
      workingAgreement = null;

      return result;
  }
    
  /**
   * Delete bean and go back to beans list
   * @return forward to LIST page
   */
  public String delete(){
    manager.deleteEntity(workingAgreement);
    workingAgreement = null;
    return NavigationResults.LIST;
  }

  /**
   * Go back to beans list
   * @return forward to LIST page
   */
  public String list(){
    return NavigationResults.LIST;
  }

  /**
   * Reset search criteria
   * @return forward to LIST page
   */
  public String reset(){
  	search.reset();
	return list();    
  }

  /**
   * Go to search page
   * @return forward to SEARCH page
   */
  public String search(){
    return NavigationResults.SEARCH;
  }

  /** 
   * Check if we have an active object.
   * @return true is an object is selected
   */
  public boolean isWorkingAgreementSelected(){
    return workingAgreement!=null;
  }

  // Getters and setters to manipulate sorting
  public boolean isSortAscending() {
    return sortAscending;
  }
  public void setSortAscending(boolean sortAscending) {
    this.sortAscending = sortAscending;
  }
  public String getSortColumn() {
    return sortColumn;
  }
  public void setSortColumn(String sortColumn) {
    this.sortColumn = sortColumn;
  }

  // Getters and setters to handle search
  public WorkingAgreementSearch getSearch(){
    return search;
  }
      
    
    
    
    
    public String getSearchName(){
        return search.getName();
    }
    public void setSearchName( String val ){
        if( search.isNameSet() ) {
          search.setName( val );
        }
    }
    public boolean isSearchNameValid(){
        return search.isNameSet();
    }
    public void setSearchNameValid( boolean val ){
        if( val ){
          search.setName( search.getName() );
        } else {
          search.unsetName();
        }
    }
        
    
    
    
    
    public String getSearchDescription(){
        return search.getDescription();
    }
    public void setSearchDescription( String val ){
        if( search.isDescriptionSet() ) {
          search.setDescription( val );
        }
    }
    public boolean isSearchDescriptionValid(){
        return search.isDescriptionSet();
    }
    public void setSearchDescriptionValid( boolean val ){
        if( val ){
          search.setDescription( search.getDescription() );
        } else {
          search.unsetDescription();
        }
    }
        
    
        
      
    public java.lang.Integer getSearchStartHolidays(){
        return search.getStartHolidays();
    }
    public void setSearchStartHolidays( java.lang.Integer val ){
        if( val!=null ){
          search.setStartHolidays( val );
        } else {
          search.unsetStartHolidays();
        }
    }
    public boolean isSearchStartHolidaysValid(){
        return search.isStartHolidaysSet();
    }
    public void setSearchStartHolidaysValid( boolean val ){
        if( val ){
          search.setStartHolidays( search.getStartHolidays() );
        } else {
          search.unsetStartHolidays();
        }
    }
    public java.lang.Integer getSearchEndHolidays(){
        return search.getEndHolidays();
    }
    public void setSearchEndHolidays( java.lang.Integer val ){
        if( val!=null ){
          search.setEndHolidays( val );
        } else {
          search.unsetEndHolidays();
        }
    }
    public boolean isSearchEndHolidaysValid(){
        return search.isEndHolidaysSet();
    }
    public void setSearchEndHolidaysValid( boolean val ){
        if( val ){
          search.setEndHolidays( search.getEndHolidays() );
        } else {
          search.unsetEndHolidays();
        }
    }

        
    
    
    
    
    public Integer getSearchOwnerId(){
        return search.getOwnerId();
    }
    public void setSearchOwnerId( Integer val ){
        if( search.isOwnerIdSet() ) {
          search.setOwnerId( val );
        }
    }
    public boolean isSearchOwnerIdValid(){
        return search.isOwnerIdSet();
    }
    public void setSearchOwnerIdValid( boolean val ){
        if( val ){
          search.setOwnerId( search.getOwnerId() );
        } else {
          search.unsetOwnerId();
        }
    }
        
    
    
    
    
    public Integer getSearchDepartmentId(){
        return search.getDepartmentId();
    }
    public void setSearchDepartmentId( Integer val ){
        if( search.isDepartmentIdSet() ) {
          search.setDepartmentId( val );
        }
    }
    public boolean isSearchDepartmentIdValid(){
        return search.isDepartmentIdSet();
    }
    public void setSearchDepartmentIdValid( boolean val ){
        if( val ){
          search.setDepartmentId( search.getDepartmentId() );
        } else {
          search.unsetDepartmentId();
        }
    }
        
    
        
      
    public Date getSearchStartInsertDate(){
        return search.getStartInsertDate();
    }
    public void setSearchStartInsertDate( Date val ){
        if( val!=null ){
          search.setStartInsertDate( val );
        } else {
          search.unsetStartInsertDate();
        }
    }
    public boolean isSearchStartInsertDateValid(){
        return search.isStartInsertDateSet();
    }
    public void setSearchStartInsertDateValid( boolean val ){
        if( val ){
          search.setStartInsertDate( search.getStartInsertDate() );
        } else {
          search.unsetStartInsertDate();
        }
    }
    public Date getSearchEndInsertDate(){
        return search.getEndInsertDate();
    }
    public void setSearchEndInsertDate( Date val ){
        if( val!=null ){
          search.setEndInsertDate( val );
        } else {
          search.unsetEndInsertDate();
        }
    }
    public boolean isSearchEndInsertDateValid(){
        return search.isEndInsertDateSet();
    }
    public void setSearchEndInsertDateValid( boolean val ){
        if( val ){
          search.setEndInsertDate( search.getEndInsertDate() );
        } else {
          search.unsetEndInsertDate();
        }
    }

        
    
        
      
    public Date getSearchStartUpdateDate(){
        return search.getStartUpdateDate();
    }
    public void setSearchStartUpdateDate( Date val ){
        if( val!=null ){
          search.setStartUpdateDate( val );
        } else {
          search.unsetStartUpdateDate();
        }
    }
    public boolean isSearchStartUpdateDateValid(){
        return search.isStartUpdateDateSet();
    }
    public void setSearchStartUpdateDateValid( boolean val ){
        if( val ){
          search.setStartUpdateDate( search.getStartUpdateDate() );
        } else {
          search.unsetStartUpdateDate();
        }
    }
    public Date getSearchEndUpdateDate(){
        return search.getEndUpdateDate();
    }
    public void setSearchEndUpdateDate( Date val ){
        if( val!=null ){
          search.setEndUpdateDate( val );
        } else {
          search.unsetEndUpdateDate();
        }
    }
    public boolean isSearchEndUpdateDateValid(){
        return search.isEndUpdateDateSet();
    }
    public void setSearchEndUpdateDateValid( boolean val ){
        if( val ){
          search.setEndUpdateDate( search.getEndUpdateDate() );
        } else {
          search.unsetEndUpdateDate();
        }
    }

          
      /** Handle an ABC pager letter click: filter objects by specified starting letter */
    public void letterClicked()
    {
      if( letter!=null ){
      	UIComponent comp = FacesUtils.getComponent("workingAgreements:list");
        HtmlDataTable tabla = (HtmlDataTable) comp;
        tabla.setFirst(0);
      	
        search.setName( letter+"%" );
      } else {
        search.unsetName();
      }
    }

    public Character getLetter()
    {
      return letter;
    }

    public void setLetter( Character letter )
    {
      this.letter = letter;
    }
  
  // Getters and setters to handle uploads
                                                          
  // Getters and setters to manipulate active WorkingAgreement object
  public java.lang.Integer getId() {
      return workingAgreement.getId();
  }
      
    
    
    public String getName() {
    return workingAgreement.getName();
  }
  public void setName( String name ) {
    workingAgreement.setName( name );
  }
        
    
    
    public String getDescription() {
    return workingAgreement.getDescription();
  }
  public void setDescription( String description ) {
    workingAgreement.setDescription( description );
  }
        
    
    
    public int getHolidays() {
    return workingAgreement.getHolidays();
  }
  public void setHolidays( int holidays ) {
    workingAgreement.setHolidays( holidays );
  }
        
    
    
    public Integer getOwnerId() {
    return workingAgreement.getOwnerId();
  }
  public void setOwnerId( Integer ownerId ) {
    workingAgreement.setOwnerId( ownerId );
  }
        
    
    
    public Integer getDepartmentId() {
    return workingAgreement.getDepartmentId();
  }
  public void setDepartmentId( Integer departmentId ) {
    workingAgreement.setDepartmentId( departmentId );
  }
        
    
    
    public Date getInsertDate() {
    return workingAgreement.getInsertDate();
  }
  public void setInsertDate( Date insertDate ) {
    workingAgreement.setInsertDate( insertDate );
  }
        
    
    
    public Date getUpdateDate() {
    return workingAgreement.getUpdateDate();
  }
  public void setUpdateDate( Date updateDate ) {
    workingAgreement.setUpdateDate( updateDate );
  }

/**
 * @return
 * @see com.autentia.tnt.businessobject.WorkingAgreement#getYearDuration()
 */
public int getYearDuration() {
	return workingAgreement.getYearDuration();
}

/**
 * @param yearDuration
 * @see com.autentia.tnt.businessobject.WorkingAgreement#setYearDuration(int)
 */
public void setYearDuration(int yearDuration) {
	workingAgreement.setYearDuration(yearDuration);
}
          
/* generated by stajanov (do not edit/delete) */
 
  
  
}