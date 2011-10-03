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

import com.autentia.tnt.businessobject.*;
import com.autentia.tnt.dao.*;
import com.autentia.tnt.util.SpringUtils;

import java.util.*;
import org.apache.commons.logging.*;

/**
 * DAO for BulletinBoard objects.
 * @author stajanov code generator
 */
public class HolidayDAO extends HibernateManagerBase<Holiday> 
{
/* holiday - generated by stajanov (do not edit/delete) */
  /** Logger */
  private static final Log log = LogFactory.getLog(HolidayDAO.class);

  /**
   * Get default HolidayDAO as defined in Spring's configuration file.
   * @return the default singleton HolidayDAO
   */
  public static HolidayDAO getDefault()
  {
    return (HolidayDAO)SpringUtils.getSpringBean("daoHoliday");
  }

 /** 
   * Constructor
   * @deprecated do not construct DAOs alone: use Spring's declared beans
   */
  public HolidayDAO(){
    super(false);
  }

  /** 
   * Retrieve a Holiday object from database given its id
   * @param id primary key of Holiday object
   * @return the Holiday object identified by the id
   * @throws DataAccException on error
   */
  public Holiday getById( int id ) throws DataAccException {
    return super.getByPk(Holiday.class,id);
  }

  /** 
   * Get all Holiday objects from database sorted by the given criteria
   * @param crit the sorting criteria
   * @return a list with all existing Holiday objects
   * @throws DataAccException on error
   */
  public List<Holiday> search( SortCriteria crit ) throws DataAccException {
    return super.list(Holiday.class,crit);
  }

  /** 
   * Get specified Holiday objects from database sorted by the given criteria
   * @param search search criteria
   * @param sort the sorting criteria
   * @return a list with Holiday objects matching the search criteria
   * @throws DataAccException on error
   */
  public List<Holiday> search(SearchCriteria search, SortCriteria sort) throws DataAccException {
    return super.search(Holiday.class,search,sort);
  }

  /** 
   * Insert a new Holiday object in database
   * @param dao the Holiday object to insert
   * @throws DataAccException on error
   */
  public void insert(Holiday dao) throws DataAccException {
    super.insert(dao);
  }

  /** 
   * Update an existing Holiday object in database
   * @param dao the Holiday object to update
   * @throws DataAccException on error
   */
  public void update(Holiday dao) throws DataAccException {
    super.update(dao,dao.getId());
  }

  /** 
   * Delete an existing Holiday object in database
   * @param dao the Holiday object to update
   * @throws DataAccException on error
   */
  public void delete(Holiday dao) throws DataAccException {
    super.delete(dao,dao.getId());
  }
/* holiday - generated by stajanov (do not edit/delete) */
}