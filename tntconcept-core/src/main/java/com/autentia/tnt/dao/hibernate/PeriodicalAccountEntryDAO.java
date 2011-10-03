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

import com.autentia.tnt.businessobject.PeriodicalAccountEntry;
import com.autentia.tnt.dao.DataAccException;
import com.autentia.tnt.dao.IDataAccessObject;
import com.autentia.tnt.dao.SearchCriteria;
import com.autentia.tnt.dao.SortCriteria;
import com.autentia.tnt.util.SpringUtils;

public class PeriodicalAccountEntryDAO extends HibernateManagerBase<PeriodicalAccountEntry> { 



/* PeriodicalAccountEntry - generated by stajanov (do not edit/delete) */
  /** Logger */
  private static final Log log = LogFactory.getLog(PeriodicalAccountEntryDAO.class);

  /**
   * Get default PeriodicalAccountEntryDAO as defined in Spring's configuration file.
   * @return the default singleton PeriodicalAccountEntryDAO
   */
  public static PeriodicalAccountEntryDAO getDefault()
  {
    return (PeriodicalAccountEntryDAO)SpringUtils.getSpringBean("daoPeriodicalAccountEntry");
  }

 /** 
   * Constructor
   * @deprecated do not construct DAOs alone: use Spring's declared beans
   */
  public PeriodicalAccountEntryDAO(){
    super(false);
  }

  /** 
   * Retrieve a PeriodicalAccountEntry object from database given its id
   * @param id primary key of PeriodicalAccountEntry object
   * @return the PeriodicalAccountEntry object identified by the id
   * @throws DataAccException on error
   */
  public PeriodicalAccountEntry getById( int id ) throws DataAccException {
    return super.getByPk(PeriodicalAccountEntry.class,id);
  }

  /** 
   * Get all PeriodicalAccountEntry objects from database sorted by the given criteria
   * @param crit the sorting criteria
   * @return a list with all existing PeriodicalAccountEntry objects
   * @throws DataAccException on error
   */
  public List<PeriodicalAccountEntry> search( SortCriteria crit ) throws DataAccException {
    return super.list(PeriodicalAccountEntry.class,crit);
  }

  /** 
   * Get specified PeriodicalAccountEntry objects from database sorted by the given criteria
   * @param search search criteria
   * @param sort the sorting criteria
   * @return a list with PeriodicalAccountEntry objects matching the search criteria
   * @throws DataAccException on error
   */
  public List<PeriodicalAccountEntry> search(SearchCriteria search, SortCriteria sort) throws DataAccException {
    return super.search(PeriodicalAccountEntry.class,search,sort);
  }

  /** 
   * Insert a new PeriodicalAccountEntry object in database
   * @param dao the PeriodicalAccountEntry object to insert
   * @throws DataAccException on error
   */
  public void insert(PeriodicalAccountEntry dao) throws DataAccException {
    super.insert(dao);
  }

  /** 
   * Update an existing PeriodicalAccountEntry object in database
   * @param dao the PeriodicalAccountEntry object to update
   * @throws DataAccException on error
   */
  public void update(PeriodicalAccountEntry dao) throws DataAccException {
    super.update(dao,dao.getId());
  }

  /** 
   * Delete an existing PeriodicalAccountEntry object in database
   * @param dao the PeriodicalAccountEntry object to update
   * @throws DataAccException on error
   */
  public void delete(PeriodicalAccountEntry dao) throws DataAccException {
    super.delete(dao,dao.getId());
  }
/* PeriodicalAccountEntry - generated by stajanov (do not edit/delete) */

  
}