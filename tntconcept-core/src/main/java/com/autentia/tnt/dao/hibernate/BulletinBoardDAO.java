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
import com.autentia.tnt.dao.search.BulletinBoardSearch;
import com.autentia.tnt.util.SpringUtils;

import java.util.*;
import org.apache.commons.logging.*;

/**
 * DAO for BulletinBoard objects.
 * @author stajanov code generator
 */
public class BulletinBoardDAO extends HibernateManagerBase<BulletinBoard> 
{
/* bulletinBoard - generated by stajanov (do not edit/delete) */
  /** Logger */
  private static final Log log = LogFactory.getLog(BulletinBoardDAO.class);

  /**
   * Get default BulletinBoardDAO as defined in Spring's configuration file.
   * @return the default singleton BulletinBoardDAO
   */
  public static BulletinBoardDAO getDefault()
  {
    return (BulletinBoardDAO)SpringUtils.getSpringBean("daoBulletinBoard");
  }

 /** 
   * Constructor
   * @deprecated do not construct DAOs alone: use Spring's declared beans
   */
  public BulletinBoardDAO(){
    super(false);
  }

  /** 
   * Retrieve a BulletinBoard object from database given its id
   * @param id primary key of BulletinBoard object
   * @return the BulletinBoard object identified by the id
   * @throws DataAccException on error
   */
  public BulletinBoard getById( int id ) throws DataAccException {
    return super.getByPk(BulletinBoard.class,id);
  }

  /** 
   * Get all BulletinBoard objects from database sorted by the given criteria
   * @param crit the sorting criteria
   * @return a list with all existing BulletinBoard objects
   * @throws DataAccException on error
   */
  public List<BulletinBoard> search( SortCriteria crit ) throws DataAccException {
    return super.list(BulletinBoard.class,crit);
  }

  /** 
   * Get specified BulletinBoard objects from database sorted by the given criteria
   * @param search search criteria
   * @param sort the sorting criteria
   * @return a list with BulletinBoard objects matching the search criteria
   * @throws DataAccException on error
   */
  public List<BulletinBoard> search(SearchCriteria search, SortCriteria sort) throws DataAccException {
    return super.search(BulletinBoard.class,search,sort);
  }

  /** 
   * Insert a new BulletinBoard object in database
   * @param dao the BulletinBoard object to insert
   * @throws DataAccException on error
   */
  public void insert(BulletinBoard dao) throws DataAccException {
    super.insert(dao);
  }

  /** 
   * Update an existing BulletinBoard object in database
   * @param dao the BulletinBoard object to update
   * @throws DataAccException on error
   */
  public void update(BulletinBoard dao) throws DataAccException {
    super.update(dao,dao.getId());
  }

  /** 
   * Delete an existing BulletinBoard object in database
   * @param dao the BulletinBoard object to update
   * @throws DataAccException on error
   */
  public void delete(BulletinBoard dao) throws DataAccException {
    super.delete(dao,dao.getId());
  }
/* bulletinBoard - generated by stajanov (do not edit/delete) */

  public List<BulletinBoard> searchByCategory(BulletinBoardCategory cat, SortCriteria sort) throws DataAccException {
    BulletinBoardSearch search = new BulletinBoardSearch();
    search.setCategory(cat);
    return super.search(BulletinBoard.class,search,sort);
  }

  public List<BulletinBoard> searchByUser(User user, SortCriteria sort) throws DataAccException {
    BulletinBoardSearch search = new BulletinBoardSearch();
    search.setUser(user);
    return super.search(BulletinBoard.class,search,sort);
  }
}