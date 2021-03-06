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

package com.autentia.tnt.dao.search;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.autentia.tnt.businessobject.Bill;
import com.autentia.tnt.businessobject.CreditTitleState;
import com.autentia.tnt.businessobject.CreditTitleType;
import com.autentia.tnt.businessobject.Organization;
import com.autentia.tnt.dao.ITransferObject;
import com.autentia.tnt.dao.SearchCriteria;
//import com.sun.org.apache.bcel.internal.generic.GETSTATIC;

/**
 * Class to search for CreditTitle objects
 * 
 * @author stajanov code generator
 */
public class CreditTitleSearch extends SearchCriteria {
	
/* generated by stajanov (do not edit/delete) */















  @Override
  public String getHQL() {
    StringBuilder ret = new StringBuilder();
    int iArgNum = 0;
            
    
  
        
    if( isNumberSet() ){
      ret.append( (ret.length()==0) ? "WHERE " : " AND " );
      if( getNumber()==null ){
	ret.append( "number is NULL" );
      } else {
	ret.append( "number = :arg"+(iArgNum++) );
      }
    }

              
    
  
        
    if( isConceptSet() ){
      ret.append( (ret.length()==0) ? "WHERE " : " AND " );
      if( getConcept()==null ){
	ret.append( "concept is NULL" );
      } else {
	ret.append( "concept = :arg"+(iArgNum++) );
      }
    }

              
    
  
        
    if( isCreditTitleStateSet() ){
      ret.append( (ret.length()==0) ? "WHERE " : " AND " );
      if( getCreditTitleState()==null ){
	ret.append( "state is NULL" );
      } else {
	ret.append( "state = :arg"+(iArgNum++) );
      }
    }

              
    
  
        
    if( isCreditTitleTypeSet() ){
      ret.append( (ret.length()==0) ? "WHERE " : " AND " );
      if( getCreditTitleType()==null ){
	ret.append( "type is NULL" );
      } else {
	ret.append( "type = :arg"+(iArgNum++) );
      }
    }

              
    
      if( isStartIssueDateSet() ){
      ret.append( (ret.length()==0) ? "WHERE " : " AND " );
      if( startIssueDate == null ){
        ret.append( "issueDate=:arg"+(iArgNum++) );
      } else {
        ret.append( "issueDate>=:arg"+(iArgNum++) );
      }
    }
    if( isEndIssueDateSet() ){
      ret.append( (ret.length()==0) ? "WHERE " : " AND " );
      if( endIssueDate == null ){
        ret.append( "issueDate=:arg"+(iArgNum++) );
      } else {
        ret.append( "issueDate<=:arg"+(iArgNum++) );
      }
    }

              
    
      if( isStartExpirationDateSet() ){
      ret.append( (ret.length()==0) ? "WHERE " : " AND " );
      if( startExpirationDate == null ){
        ret.append( "expirationDate=:arg"+(iArgNum++) );
      } else {
        ret.append( "expirationDate>=:arg"+(iArgNum++) );
      }
    }
    if( isEndExpirationDateSet() ){
      ret.append( (ret.length()==0) ? "WHERE " : " AND " );
      if( endExpirationDate == null ){
        ret.append( "expirationDate=:arg"+(iArgNum++) );
      } else {
        ret.append( "expirationDate<=:arg"+(iArgNum++) );
      }
    }

              
    
  
        
    if( isObservationsSet() ){
      ret.append( (ret.length()==0) ? "WHERE " : " AND " );
      if( getObservations()==null ){
	ret.append( "observations is NULL" );
      } else {
	ret.append( "observations = :arg"+(iArgNum++) );
      }
    }

              
    
  
        
    if( isOwnerIdSet() ){
      ret.append( (ret.length()==0) ? "WHERE " : " AND " );
      if( getOwnerId()==null ){
	ret.append( "ownerId is NULL" );
      } else {
	ret.append( "ownerId = :arg"+(iArgNum++) );
      }
    }

              
    
  
        
    if( isDepartmentIdSet() ){
      ret.append( (ret.length()==0) ? "WHERE " : " AND " );
      if( getDepartmentId()==null ){
	ret.append( "departmentId is NULL" );
      } else {
	ret.append( "departmentId = :arg"+(iArgNum++) );
      }
    }

              
    
      if( isStartInsertDateSet() ){
      ret.append( (ret.length()==0) ? "WHERE " : " AND " );
      if( startInsertDate == null ){
        ret.append( "insertDate=:arg"+(iArgNum++) );
      } else {
        ret.append( "insertDate>=:arg"+(iArgNum++) );
      }
    }
    if( isEndInsertDateSet() ){
      ret.append( (ret.length()==0) ? "WHERE " : " AND " );
      if( endInsertDate == null ){
        ret.append( "insertDate=:arg"+(iArgNum++) );
      } else {
        ret.append( "insertDate<=:arg"+(iArgNum++) );
      }
    }

              
    
      if( isStartUpdateDateSet() ){
      ret.append( (ret.length()==0) ? "WHERE " : " AND " );
      if( startUpdateDate == null ){
        ret.append( "updateDate=:arg"+(iArgNum++) );
      } else {
        ret.append( "updateDate>=:arg"+(iArgNum++) );
      }
    }
    if( isEndUpdateDateSet() ){
      ret.append( (ret.length()==0) ? "WHERE " : " AND " );
      if( endUpdateDate == null ){
        ret.append( "updateDate=:arg"+(iArgNum++) );
      } else {
        ret.append( "updateDate<=:arg"+(iArgNum++) );
      }
    }


    
    
    if( isStartAmountSet() ){
        ret.append( (ret.length()==0) ? "WHERE " : " AND " );
        if( startAmount == null ){
          ret.append( "amount=:arg"+(iArgNum++) );
        } else {
          ret.append( "amount>=:arg"+(iArgNum++) );
        }
      }
      if( isEndAmountSet() ){
        ret.append( (ret.length()==0) ? "WHERE " : " AND " );
        if( endAmount == null ){
          ret.append( "amount=:arg"+(iArgNum++) );
        } else {
          ret.append( "amount<=:arg"+(iArgNum++) );
        }
      }
    
    
  
        
    if( isOrganizationSet() ){
      ret.append( (ret.length()==0) ? "WHERE " : " AND " );
      if( getOrganization()==null ){
	ret.append( "organization is NULL" );
      } else {
	ret.append( "organization = :arg"+(iArgNum++) );
      }
    }

                      
    
      if( isBillsSet() ){
      ret.append( (ret.length()==0) ? "WHERE " : " AND " );
      ret.append( "bills.id IN (:arg"+(iArgNum++)+")" );
    }

          customGetHQL(ret,iArgNum);
    return ret.toString();
  }

  @Override
  public Object[] getArguments(){
    ArrayList<Object> ret = new ArrayList<Object>();
            
  
      if( isNumberSet() && getNumber()!=null ){
        ret.add( number );
    }

              
  
      if( isConceptSet() && getConcept()!=null ){
        ret.add( concept );
    }

              
  
      if( isCreditTitleStateSet() && getCreditTitleState()!=null ){
        ret.add( creditTitleState );
    }

              
  
      if( isCreditTitleTypeSet() && getCreditTitleType()!=null ){
        ret.add( creditTitleType );
    }

              
  
      if( isStartIssueDateSet() ){
        ret.add( startIssueDate );
    }
    if( isEndIssueDateSet() ){
        ret.add( endIssueDate );
    }

              
  
      if( isStartExpirationDateSet() ){
        ret.add( startExpirationDate );
    }
    if( isEndExpirationDateSet() ){
        ret.add( endExpirationDate );
    }

              
  
      if( isObservationsSet() && getObservations()!=null ){
        ret.add( observations );
    }

              
  
      if( isOwnerIdSet() && getOwnerId()!=null ){
        ret.add( ownerId );
    }

              
  
      if( isDepartmentIdSet() && getDepartmentId()!=null ){
        ret.add( departmentId );
    }

              
  
      if( isStartInsertDateSet() ){
        ret.add( startInsertDate );
    }
    if( isEndInsertDateSet() ){
        ret.add( endInsertDate );
    }

              
  
      if( isStartUpdateDateSet() ){
        ret.add( startUpdateDate );
    }
    if( isEndUpdateDateSet() ){
        ret.add( endUpdateDate );
    }

                  
  
      if( isOrganizationSet() && getOrganization()!=null ){
        ret.add( organization );
    }

                      
  if (isStartAmountSet() && getStartAmount() != null) {
	  ret.add (startAmount); 
  }
      
  if (isEndAmountSet() && getEndAmount() != null) {
	  ret.add (endAmount); 
  }
      
            
    if( isBillsSet() ){
      List<Integer> params = new ArrayList<Integer>();
      for( ITransferObject to : bills )
      {
        params.add( to.getId() );
      }
      ret.add( params );
    }

          customGetArguments(ret);
    return ret.toArray();
  }

  @Override
  public void reset(){
            
  
      unsetNumber();
  
              
  
      unsetConcept();
  
              
  
      unsetCreditTitleState();
  
              
  
      unsetCreditTitleType();
  
              
  
      unsetStartIssueDate();
    unsetEndIssueDate();

              
  
      unsetStartExpirationDate();
    unsetEndExpirationDate();

              
  
      unsetObservations();
  
              
  
      unsetOwnerId();
  
              
  
      unsetDepartmentId();
  
              
  
      unsetStartInsertDate();
    unsetEndInsertDate();

              
  
      unsetStartUpdateDate();
    unsetEndUpdateDate();

                  
  
      unsetOrganization();
  
      unsetStartAmount();
      
      unsetEndAmount();
                      
  
      unsetBills();
  
          customReset();
  }
    
  @Override
  public String toString() {
    StringBuilder ret = new StringBuilder();
    ret.append("CreditTitleSearch{");
            
  
  
          if( isNumberSet() ){
          ret.append( "(number" );
          ret.append( "="+number );
          ret.append( ")" );
      }

    
              
  
  
          if( isConceptSet() ){
          ret.append( "(concept" );
          ret.append( "="+concept );
          ret.append( ")" );
      }

    
              
  
  
          if( isCreditTitleStateSet() ){
          ret.append( "(creditTitleState" );
          ret.append( "="+creditTitleState );
          ret.append( ")" );
      }

    
              
  
  
          if( isCreditTitleTypeSet() ){
          ret.append( "(creditTitleType" );
          ret.append( "="+creditTitleType );
          ret.append( ")" );
      }

    
              
  
  
    if( isStartIssueDateSet() ){
        ret.append( "(startIssueDate" );
        ret.append( "="+startIssueDate );
        ret.append( ")" );
    }
    if( isEndIssueDateSet() ){
        ret.append( "(endIssueDate" );
        ret.append( "="+endIssueDate );
        ret.append( ")" );
    }

              
  
  
    if( isStartExpirationDateSet() ){
        ret.append( "(startExpirationDate" );
        ret.append( "="+startExpirationDate );
        ret.append( ")" );
    }
    if( isEndExpirationDateSet() ){
        ret.append( "(endExpirationDate" );
        ret.append( "="+endExpirationDate );
        ret.append( ")" );
    }

              
  
  
          if( isObservationsSet() ){
          ret.append( "(observations" );
          ret.append( "="+observations );
          ret.append( ")" );
      }

    
              
  
  
          if( isOwnerIdSet() ){
          ret.append( "(ownerId" );
          ret.append( "="+ownerId );
          ret.append( ")" );
      }

    
              
  
  
          if( isDepartmentIdSet() ){
          ret.append( "(departmentId" );
          ret.append( "="+departmentId );
          ret.append( ")" );
      }

    
              
  
  
    if( isStartInsertDateSet() ){
        ret.append( "(startInsertDate" );
        ret.append( "="+startInsertDate );
        ret.append( ")" );
    }
    if( isEndInsertDateSet() ){
        ret.append( "(endInsertDate" );
        ret.append( "="+endInsertDate );
        ret.append( ")" );
    }

              
  
  
    if( isStartUpdateDateSet() ){
        ret.append( "(startUpdateDate" );
        ret.append( "="+startUpdateDate );
        ret.append( ")" );
    }
    if( isEndUpdateDateSet() ){
        ret.append( "(endUpdateDate" );
        ret.append( "="+endUpdateDate );
        ret.append( ")" );
    }

                  
  
  
          if( isOrganizationSet() ){
          ret.append( "(organization" );
          ret.append( "="+organization );
          ret.append( ")" );
      }

    
                      
  
  
          if( isBillsSet() ){
          ret.append( "(bills={" );
          for( Object o : bills.toArray() ){
            ret.append( ","+o );
          }
          ret.append( "})" );
      }

    
          customToString(ret);
    ret.append("}");
    return ret.toString();
  }

  // Getters and setters
        
  
  
    
    
    public boolean isNumberSet(){
        return numberSet;
    }
    public String getNumber(){
        return number;
    }
    public void setNumber( String number ){
        this.number = number;
        this.numberSet = true;
    }
    public void unsetNumber(){
        this.numberSet = false;
    }
          
  
  
    
    
    public boolean isConceptSet(){
        return conceptSet;
    }
    public String getConcept(){
        return concept;
    }
    public void setConcept( String concept ){
        this.concept = concept;
        this.conceptSet = true;
    }
    public void unsetConcept(){
        this.conceptSet = false;
    }
          
  
  
        
    
    public boolean isCreditTitleStateSet(){
        return creditTitleStateSet;
    }
    public CreditTitleState getCreditTitleState(){
        return creditTitleState;
    }
    public void setCreditTitleState( CreditTitleState creditTitleState ){
        this.creditTitleState = creditTitleState;
        this.creditTitleStateSet = true;
    }
    public void unsetCreditTitleState(){
        this.creditTitleStateSet = false;
    }
          
  
  
        
    
    public boolean isCreditTitleTypeSet(){
        return creditTitleTypeSet;
    }
    public CreditTitleType getCreditTitleType(){
        return creditTitleType;
    }
    public void setCreditTitleType( CreditTitleType creditTitleType ){
        this.creditTitleType = creditTitleType;
        this.creditTitleTypeSet = true;
    }
    public void unsetCreditTitleType(){
        this.creditTitleTypeSet = false;
    }
          
  
  
    public boolean isStartIssueDateSet(){
        return startIssueDateSet;
    }
    public Date getStartIssueDate(){
        return startIssueDate;
    }
    public void setStartIssueDate( Date startIssueDate ){
        this.startIssueDate = startIssueDate;
        this.startIssueDateSet = true;
    }
    public void unsetStartIssueDate(){
        this.startIssueDateSet = false;
    }
    public boolean isEndIssueDateSet(){
        return endIssueDateSet;
    }
    public Date getEndIssueDate(){
        return endIssueDate;
    }
    public void setEndIssueDate( Date endIssueDate ){
        this.endIssueDate = endIssueDate;
        this.endIssueDateSet = true;
    }
    public void unsetEndIssueDate(){
        this.endIssueDateSet = false;
    }

          
  
  
    public boolean isStartExpirationDateSet(){
        return startExpirationDateSet;
    }
    public Date getStartExpirationDate(){
        return startExpirationDate;
    }
    public void setStartExpirationDate( Date startExpirationDate ){
        this.startExpirationDate = startExpirationDate;
        this.startExpirationDateSet = true;
    }
    public void unsetStartExpirationDate(){
        this.startExpirationDateSet = false;
    }
    public boolean isEndExpirationDateSet(){
        return endExpirationDateSet;
    }
    public Date getEndExpirationDate(){
        return endExpirationDate;
    }
    public void setEndExpirationDate( Date endExpirationDate ){
        this.endExpirationDate = endExpirationDate;
        this.endExpirationDateSet = true;
    }
    public void unsetEndExpirationDate(){
        this.endExpirationDateSet = false;
    }

          
  
  
    
    
    public boolean isObservationsSet(){
        return observationsSet;
    }
    public String getObservations(){
        return observations;
    }
    public void setObservations( String observations ){
        this.observations = observations;
        this.observationsSet = true;
    }
    public void unsetObservations(){
        this.observationsSet = false;
    }
          
  
  
    
    
    public boolean isOwnerIdSet(){
        return ownerIdSet;
    }
    public Integer getOwnerId(){
        return ownerId;
    }
    public void setOwnerId( Integer ownerId ){
        this.ownerId = ownerId;
        this.ownerIdSet = true;
    }
    public void unsetOwnerId(){
        this.ownerIdSet = false;
    }
          
  
  
    
    
    public boolean isDepartmentIdSet(){
        return departmentIdSet;
    }
    public Integer getDepartmentId(){
        return departmentId;
    }
    public void setDepartmentId( Integer departmentId ){
        this.departmentId = departmentId;
        this.departmentIdSet = true;
    }
    public void unsetDepartmentId(){
        this.departmentIdSet = false;
    }
          
  
  
    public boolean isStartInsertDateSet(){
        return startInsertDateSet;
    }
    public Date getStartInsertDate(){
        return startInsertDate;
    }
    public void setStartInsertDate( Date startInsertDate ){
        this.startInsertDate = startInsertDate;
        this.startInsertDateSet = true;
    }
    public void unsetStartInsertDate(){
        this.startInsertDateSet = false;
    }
    public boolean isEndInsertDateSet(){
        return endInsertDateSet;
    }
    public Date getEndInsertDate(){
        return endInsertDate;
    }
    public void setEndInsertDate( Date endInsertDate ){
        this.endInsertDate = endInsertDate;
        this.endInsertDateSet = true;
    }
    public void unsetEndInsertDate(){
        this.endInsertDateSet = false;
    }

          
  
  
    public boolean isStartUpdateDateSet(){
        return startUpdateDateSet;
    }
    public Date getStartUpdateDate(){
        return startUpdateDate;
    }
    public void setStartUpdateDate( Date startUpdateDate ){
        this.startUpdateDate = startUpdateDate;
        this.startUpdateDateSet = true;
    }
    public void unsetStartUpdateDate(){
        this.startUpdateDateSet = false;
    }
    public boolean isEndUpdateDateSet(){
        return endUpdateDateSet;
    }
    public Date getEndUpdateDate(){
        return endUpdateDate;
    }
    public void setEndUpdateDate( Date endUpdateDate ){
        this.endUpdateDate = endUpdateDate;
        this.endUpdateDateSet = true;
    }
    public void unsetEndUpdateDate(){
        this.endUpdateDateSet = false;
    }
    
    public boolean isStartAmountSet() {
		return startAmountSet;
	}
    
	public void unsetStartAmount() {
		this.startAmountSet = false;
	}
    
    
	public BigDecimal getStartAmount() {
		return startAmount;
	}

	public void setStartAmount(BigDecimal startAmount) {
		this.startAmount = startAmount;
		this.startAmountSet = true;
	}

	public boolean isEndAmountSet() {
		return endAmountSet;
	}
	
	public void unsetEndAmount() {
		this.endAmountSet = false;
	}

	public BigDecimal getEndAmount() {
		return endAmount;
	}

	public void setEndAmount(BigDecimal endAmount) {
		this.endAmount = endAmount;
		this.endAmountSet = true;
	}

	public boolean isOrganizationSet(){
        return organizationSet;
    }
    public Organization getOrganization(){
        return organization;
    }
    public void setOrganization( Organization organization ){
        this.organization = organization;
        this.organizationSet = true;
    }
    public void unsetOrganization(){
        this.organizationSet = false;
    }
              
  
  
    	    	        
    
    public boolean isBillsSet(){
        return billsSet;
    }
    public List<Bill> getBills(){
        return bills;
    }
    public void setBills( List<Bill> bills ){
        this.bills = bills;
        this.billsSet = true;
    }
    public void unsetBills(){
        this.billsSet = false;
    }
    
  // Fields
        
  
      private boolean numberSet;
        private String number;

          
  
      private boolean conceptSet;
        private String concept;

          
  
      private boolean creditTitleStateSet;
        private CreditTitleState creditTitleState;

        private boolean startAmountSet;
        private BigDecimal startAmount;
          
        private boolean endAmountSet;
        private BigDecimal endAmount;
  
      private boolean creditTitleTypeSet;
        private CreditTitleType creditTitleType;

          
  
      private boolean startIssueDateSet;
        private Date startIssueDate;
    private boolean endIssueDateSet;
        private Date endIssueDate;

          
  
      private boolean startExpirationDateSet;
        private Date startExpirationDate;
    private boolean endExpirationDateSet;
        private Date endExpirationDate;

          
  
      private boolean observationsSet;
        private String observations;

          
  
      private boolean ownerIdSet;
        private Integer ownerId;

          
  
      private boolean departmentIdSet;
        private Integer departmentId;

          
  
      private boolean startInsertDateSet;
        private Date startInsertDate;
    private boolean endInsertDateSet;
        private Date endInsertDate;

          
  
      private boolean startUpdateDateSet;
        private Date startUpdateDate;
    private boolean endUpdateDateSet;
        private Date endUpdateDate;

            
  
      private boolean organizationSet;
        private Organization organization;
  
              
  
      private boolean billsSet;
            	private List<Bill> bills;
      
    
  // Returns if there are a search condition active
  public boolean isSearchActive() {
    return customIsSearchActive()||numberSet||conceptSet||creditTitleStateSet||creditTitleTypeSet||startIssueDateSet||endIssueDateSet||startExpirationDateSet||endExpirationDateSet||observationsSet||ownerIdSet||departmentIdSet||startInsertDateSet||endInsertDateSet||startUpdateDateSet||endUpdateDateSet||organizationSet||startAmountSet||endAmountSet;
  }


/* generated by stajanov (do not edit/delete) */
  
	private void customGetHQL(StringBuilder ret, int iArgNum)
	{
	}

	private boolean customIsSearchActive()
	{
		return false;
	}

	private void customToString(StringBuilder ret)
	{
	}

	private void customReset()
	{
	}

	private void customGetArguments(ArrayList ret)
	{
	}
}
