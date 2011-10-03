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

package com.autentia.tnt.dao.hibernate;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.autentia.tnt.businessobject.FinancialRatio;
import com.autentia.tnt.businessobject.Frequency;
import com.autentia.tnt.dao.DataAccException;
import com.autentia.tnt.dao.IDataAccessObject;
import com.autentia.tnt.dao.SearchCriteria;
import com.autentia.tnt.dao.SortCriteria;
import com.autentia.tnt.util.SpringUtils;



public class FinancialRatioDAO extends HibernateManagerBase<FinancialRatio> { 

/* FinancialRatio - generated by stajanov (do not edit/delete) */



  /** Logger */
  private static final Log log = LogFactory.getLog(FinancialRatioDAO.class);

  /**
   * Get default FinancialRatioDAO as defined in Spring's configuration file.
   * @return the default singleton FinancialRatioDAO
   */
  public static FinancialRatioDAO getDefault()
  {
    return (FinancialRatioDAO)SpringUtils.getSpringBean("daoFinancialRatio");
  }

 /** 
   * Constructor
   * @deprecated do not construct DAOs alone: use Spring's declared beans
   */
  public FinancialRatioDAO(){
    super(false);
  }

  /** 
   * Retrieve a FinancialRatio object from database given its id
   * @param id primary key of FinancialRatio object
   * @return the FinancialRatio object identified by the id
   * @throws DataAccException on error
   */
  public FinancialRatio getById( int id ) throws DataAccException {
    return super.getByPk(FinancialRatio.class,id);
  }

  /** 
   * Get all FinancialRatio objects from database sorted by the given criteria
   * @param crit the sorting criteria
   * @return a list with all existing FinancialRatio objects
   * @throws DataAccException on error
   */
  public List<FinancialRatio> search( SortCriteria crit ) throws DataAccException {
    return super.list(FinancialRatio.class,crit);
  }

  /** 
   * Get specified FinancialRatio objects from database sorted by the given criteria
   * @param search search criteria
   * @param sort the sorting criteria
   * @return a list with FinancialRatio objects matching the search criteria
   * @throws DataAccException on error
   */
  public List<FinancialRatio> search(SearchCriteria search, SortCriteria sort) throws DataAccException {
    return super.search(FinancialRatio.class,search,sort);
  }

  /** 
   * Insert a new FinancialRatio object in database
   * @param dao the FinancialRatio object to insert
   * @throws DataAccException on error
   */
  public void insert(FinancialRatio dao) throws DataAccException {
    super.insert(dao);
  }

  /** 
   * Update an existing FinancialRatio object in database
   * @param dao the FinancialRatio object to update
   * @throws DataAccException on error
   */
  public void update(FinancialRatio dao) throws DataAccException {
    super.update(dao,dao.getId());
  }

  /** 
   * Delete an existing FinancialRatio object in database
   * @param dao the FinancialRatio object to update
   * @throws DataAccException on error
   */
  public void delete(FinancialRatio dao) throws DataAccException {
    super.delete(dao,dao.getId());
  }

/* FinancialRatio - generated by stajanov (do not edit/delete) */
}