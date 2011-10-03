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

package com.autentia.tnt.manager.contacts;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.autentia.tnt.businessobject.OfferCost;
import com.autentia.tnt.dao.SortCriteria;
import com.autentia.tnt.dao.hibernate.OfferCostDAO;
import com.autentia.tnt.dao.search.OfferCostSearch;
import com.autentia.tnt.util.SpringUtils;


public class OfferCostManager {

/* generated by stajanov (do not edit/delete) */


  /** Logger */
  private static final Log log = LogFactory.getLog(OfferCostManager.class);

  /** OfferCost DAO **/
  private OfferCostDAO offerCostDAO;

  /**
   * Get default OfferCostManager as defined in Spring's configuration file.
   * @return the default singleton OfferCostManager
   */
  public static OfferCostManager getDefault()
  {
    return (OfferCostManager)SpringUtils.getSpringBean("managerOfferCost");
  }

  /** 
   * Empty constructor needed by CGLIB (Spring AOP)
   */
  protected OfferCostManager()
  {
  }
	
  /** 
   * Default constructor 
   * @deprecated do not construct managers alone: use Spring's declared beans
   */
  public OfferCostManager( OfferCostDAO offerCostDAO )
  {
    this.offerCostDAO = offerCostDAO;
  }

  /**
   * List offerCosts. 
   * @param search search filter to apply
   * @param sort sorting criteria
   * @return the list of all offerCosts sorted by requested criterion
   */
  public List<OfferCost> getAllEntities(OfferCostSearch search, SortCriteria sort){
    return offerCostDAO.search( search, sort );
  }
  
  /**
   * Get offerCost by primary key.
   * @return offerCost selected by id.
   */
  public OfferCost getEntityById(int id){
    return offerCostDAO.getById(id);	    
  }
	
  /**
   * Insert offerCost. 
   */
  public void insertEntity(OfferCost offerCost) {
    offerCostDAO.insert(offerCost);
  }
	 
  /**
   * Update offerCost. 
   */
  public void updateEntity(OfferCost offerCost) {
    offerCostDAO.update(offerCost);
  }

  /**
   * Delete offerCost. 
   */
  public void deleteEntity(OfferCost offerCost) {
    offerCostDAO.delete(offerCost);
  }
/* generated by stajanov (do not edit/delete) */
}