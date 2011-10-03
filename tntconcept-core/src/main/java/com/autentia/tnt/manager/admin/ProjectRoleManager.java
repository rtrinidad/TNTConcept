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

package com.autentia.tnt.manager.admin;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.autentia.tnt.businessobject.ProjectRole;
import com.autentia.tnt.dao.SortCriteria;
import com.autentia.tnt.dao.hibernate.ProjectRoleDAO;
import com.autentia.tnt.dao.search.ProjectRoleSearch;
import com.autentia.tnt.util.SpringUtils;



public class ProjectRoleManager 
{
/* generated by stajanov (do not edit/delete) */


  /** Logger */
  private static final Log log = LogFactory.getLog(ProjectRoleManager.class);

  /** ProjectRole DAO **/
  private ProjectRoleDAO projectRoleDAO;

  /**
   * Get default ProjectRoleManager as defined in Spring's configuration file.
   * @return the default singleton ProjectRoleManager
   */
  public static ProjectRoleManager getDefault()
  {
    return (ProjectRoleManager)SpringUtils.getSpringBean("managerProjectRole");
  }

  /** 
   * Empty constructor needed by CGLIB (Spring AOP)
   */
  protected ProjectRoleManager()
  {
  }
	
  /** 
   * Default constructor 
   * @deprecated do not construct managers alone: use Spring's declared beans
   */
  public ProjectRoleManager( ProjectRoleDAO projectRoleDAO )
  {
    this.projectRoleDAO = projectRoleDAO;
  }

  /**
   * List projectRoles. 
   * @param search search filter to apply
   * @param sort sorting criteria
   * @return the list of all projectRoles sorted by requested criterion
   */
  public List<ProjectRole> getAllEntities(ProjectRoleSearch search, SortCriteria sort){
    return projectRoleDAO.search( search, sort );
  }
  
  /**
   * Get projectRole by primary key.
   * @return projectRole selected by id.
   */
  public ProjectRole getEntityById(int id){
    return projectRoleDAO.getById(id);	    
  }
	
  /**
   * Insert projectRole. 
   */
  public void insertEntity(ProjectRole projectRole) {
    projectRoleDAO.insert(projectRole);
  }
	 
  /**
   * Update projectRole. 
   */
  public void updateEntity(ProjectRole projectRole) {
    projectRoleDAO.update(projectRole);
  }

  /**
   * Delete projectRole. 
   */
  public void deleteEntity(ProjectRole projectRole) {
    projectRoleDAO.delete(projectRole);
  }
/* generated by stajanov (do not edit/delete) */
}