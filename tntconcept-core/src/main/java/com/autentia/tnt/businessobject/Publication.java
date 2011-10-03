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

package com.autentia.tnt.businessobject;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.autentia.tnt.dao.ITransferObject;

/**
 * Transfer object to store Publications
 * @author stajanov code generator
 */
public class Publication implements Serializable, ITransferObject 
{
  /** Serial version field */
  private static final long serialVersionUID = -1L;

/* publication - generated by stajanov (do not edit/delete) */







  // Fields
  
  
    
  private Integer id;

      
      
  private String name;

      
      
  private Date magazineDeliveryDate;

      
      
  private Date magazinePublicationDate;

      
      
  private Date ownPublicationDate;

      
      
  private boolean accepted;

      
      
  private Integer ownerId;

      
      
  private Integer departmentId;

      
      
  private Date insertDate;

      
      
  private Date updateDate;

        
  
    
  private Magazine magazine;

        	 	

  // Setters and getters
  
  
  
  public Integer getId() {
    return id;
  }
  private void setId( Integer id ) {
    this.id = id;
  }
      
  
  
  public String getName() {
    return name;
  }
  public void setName( String name ) {
    this.name = name;
  }
      
  
  
  public Date getMagazineDeliveryDate() {
    return magazineDeliveryDate;
  }
  public void setMagazineDeliveryDate( Date magazineDeliveryDate ) {
    this.magazineDeliveryDate = magazineDeliveryDate;
  }
      
  
  
  public Date getMagazinePublicationDate() {
    return magazinePublicationDate;
  }
  public void setMagazinePublicationDate( Date magazinePublicationDate ) {
    this.magazinePublicationDate = magazinePublicationDate;
  }
      
  
  
  public Date getOwnPublicationDate() {
    return ownPublicationDate;
  }
  public void setOwnPublicationDate( Date ownPublicationDate ) {
    this.ownPublicationDate = ownPublicationDate;
  }
      
  
  
  public boolean isAccepted() {
    return accepted;
  }
  public void setAccepted( boolean accepted ) {
    this.accepted = accepted;
  }
      
  
  
  public Integer getOwnerId() {
    return ownerId;
  }
  public void setOwnerId( Integer ownerId ) {
    this.ownerId = ownerId;
  }
      
  
  
  public Integer getDepartmentId() {
    return departmentId;
  }
  public void setDepartmentId( Integer departmentId ) {
    this.departmentId = departmentId;
  }
      
  
  
  public Date getInsertDate() {
    return insertDate;
  }
  public void setInsertDate( Date insertDate ) {
    this.insertDate = insertDate;
  }
      
  
  
  public Date getUpdateDate() {
    return updateDate;
  }
  public void setUpdateDate( Date updateDate ) {
    this.updateDate = updateDate;
  }
        
  
  
  public Magazine getMagazine() {
    return magazine;
  }
  public void setMagazine( Magazine magazine ) {
    this.magazine = magazine;
  }
        
    
    
    
  
  @Override
  public boolean equals( Object that )
  {
  	try {
  		if (that == null) 
  			return false;
  		else 
    		return this.getId().equals( ((Publication)that).getId() );
    } catch (Exception e) {
		return false;
	}
  }
  
  @Override
  public int hashCode() {
  	  if(this.getId()==null)
  	  	return super.hashCode();
  	  else	
	 	return this.getId().intValue();
	}

	public List<Integer> getOwnersId() {
		// TODO Auto-generated method stub
		return null;
	}

/* publication - generated by stajanov (do not edit/delete) */
}