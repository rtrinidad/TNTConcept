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

package com.autentia.tnt.manager.bulletin;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.autentia.tnt.businessobject.BulletinBoard;
import com.autentia.tnt.businessobject.BulletinBoardCategory;
import com.autentia.tnt.businessobject.User;
import com.autentia.tnt.dao.SortCriteria;
import com.autentia.tnt.dao.hibernate.BulletinBoardCategoryDAO;
import com.autentia.tnt.dao.hibernate.BulletinBoardDAO;
import com.autentia.tnt.dao.hibernate.UserDAO;
import com.autentia.tnt.dao.search.BulletinBoardSearch;
import com.autentia.tnt.util.SpringUtils;



public class BulletinBoardManager {


/* BulletinBoard - generated by stajanov (do not edit/delete) */


  /** Logger */
  private static final Log log = LogFactory.getLog(BulletinBoardManager.class);

  /** BulletinBoard DAO **/
  private BulletinBoardDAO bulletinBoardDAO;

  /**
   * Get default BulletinBoardManager as defined in Spring's configuration file.
   * @return the default singleton BulletinBoardManager
   */
  public static BulletinBoardManager getDefault()
  {
    return (BulletinBoardManager)SpringUtils.getSpringBean("managerBulletinBoard");
  }

  /** 
   * Empty constructor needed by CGLIB (Spring AOP)
   */
  protected BulletinBoardManager()
  {
  }
	
  /** 
   * Default constructor 
   * @deprecated do not construct managers alone: use Spring's declared beans
   */
  public BulletinBoardManager( BulletinBoardDAO bulletinBoardDAO )
  {
    this.bulletinBoardDAO = bulletinBoardDAO;
  }

  /**
   * List bulletinBoards. 
   * @param search search filter to apply
   * @param sort sorting criteria
   * @return the list of all bulletinBoards sorted by requested criterion
   */
  public List<BulletinBoard> getAllEntities(BulletinBoardSearch search, SortCriteria sort){
    return bulletinBoardDAO.search( search, sort );
  }
  
  /**
   * Get bulletinBoard by primary key.
   * @return bulletinBoard selected by id.
   */
  public BulletinBoard getEntityById(int id){
    return bulletinBoardDAO.getById(id);	    
  }
	
  /**
   * Insert bulletinBoard. 
   */
  public void insertEntity(BulletinBoard bulletinBoard) {
    bulletinBoardDAO.insert(bulletinBoard);
  }
	 
  /**
   * Update bulletinBoard. 
   */
  public void updateEntity(BulletinBoard bulletinBoard) {
    bulletinBoardDAO.update(bulletinBoard);
  }

  /**
   * Delete bulletinBoard. 
   */
  public void deleteEntity(BulletinBoard bulletinBoard) {
    bulletinBoardDAO.delete(bulletinBoard);
  }
/* BulletinBoard - generated by stajanov (do not edit/delete) */
	
	
	/**
	   * List public bulletinBoards sorted by creationDate inverse.
	   * @return a list of bulletinBoards
	   */
public List<BulletinBoard> getPublic( SortCriteria sort ){
	  BulletinBoardSearch search = new BulletinBoardSearch();
	  search.setCategory( BulletinBoardCategoryManager.getDefault().getPublicCategory() );
      return bulletinBoardDAO.search( search, sort );
 }


/**
 * Get bulletinBoard by primary key Public access
 * @return bulletinBoard selected by id.
 */
public BulletinBoard getEntityByIdPublic(int id){
  return bulletinBoardDAO.getById(id);	    
}


}