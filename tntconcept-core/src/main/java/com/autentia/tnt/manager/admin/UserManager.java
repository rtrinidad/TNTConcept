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



import java.util.Date;
import java.util.List;

import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.autentia.tnt.businessobject.DocumentCategory;
import com.autentia.tnt.businessobject.User;
import com.autentia.tnt.dao.SortCriteria;
import com.autentia.tnt.dao.hibernate.DocumentCategoryDAO;
import com.autentia.tnt.dao.hibernate.UserDAO;
import com.autentia.tnt.dao.search.UserSearch;
import com.autentia.tnt.manager.document.DocumentCategoryManager;
import com.autentia.tnt.util.ConfigurationUtil;
import com.autentia.tnt.util.SpringUtils;
import com.autentia.tnt.manager.security.AuthenticationManager;


public class UserManager
{
  
  
/* user - generated by stajanov (do not edit/delete) */



  /** Logger */
  private static final Log log = LogFactory.getLog(UserManager.class);

  /** User DAO **/
  private UserDAO userDAO;

  /**
   * Get default UserManager as defined in Spring's configuration file.
   * @return the default singleton UserManager
   */
  public static UserManager getDefault()
  {
    return (UserManager)SpringUtils.getSpringBean("managerUser");
  }

  /** 
   * Empty constructor needed by CGLIB (Spring AOP)
   */
  protected UserManager()
  {
  }
	
  /** 
   * Default constructor 
   * @deprecated do not construct managers alone: use Spring's declared beans
   */
  public UserManager( UserDAO userDAO )
  {
    this.userDAO = userDAO;
  }

  /**
   * List users. 
   * @param search search filter to apply
   * @param sort sorting criteria
   * @return the list of all users sorted by requested criterion
   */
  public List<User> getAllEntities(UserSearch search, SortCriteria sort){
    return userDAO.search( search, sort );
  }
  
  /**
   * Get user by primary key.
   * @return user selected by id.
   */
  public User getEntityById(int id){
    return userDAO.getById(id);	    
  }
	
  /**
   * Insert user. 
   */
  public void insertEntity(User user, boolean agreementYearDuration) {
	  this.doBeforeSave(user, agreementYearDuration);
    userDAO.insert(user);
  }
	 
  /**
   * Update user. 
   */
  public void updateEntity(User user, boolean agreementYearDuration) {
	  this.doBeforeSave(user, agreementYearDuration);
    userDAO.update(user);
  }

  /**
   * Delete user. 
   */
  public void deleteEntity(User user) {
    userDAO.delete(user);
  }

/* user - generated by stajanov (do not edit/delete) */

  private void doBeforeSave(User user, boolean agreementYearDuration) {

      if (user.getId() != null)
      {
        user.setDocumentCategory(DocumentCategoryDAO.getDefault().recoverDocumentCategoryFromUser(user));
        if (user.getDocumentCategory() != null) {
	        user.getDocumentCategory().setName(user.getName());
				user.getDocumentCategory().setDescription(user.getName());
        }
      }
      else
      {
		DocumentCategory padre = DocumentCategoryManager.getDefault().getDocumentCategoryParent();
		// User category
		DocumentCategory userDocCategory = new DocumentCategory();
		userDocCategory.setName(user.getName());
		userDocCategory.setDescription(user.getName());
		userDocCategory.setPadre(padre);
		user.setDocumentCategory(userDocCategory);
      }

		if (agreementYearDuration) {
			user.setAgreementYearDuration(null);
		}
  }
  
  /**
   * Recalculamos la fecha de expiración de la contraseña de un usuario al que le ha caducado la contraseña
   * @param user Usuario al que le ha caducado la contraseña
   * @param password Nueva contraseña
   
  public void changeExpiredPasswordExpired(User user, String password){
	  AuthenticationManager authHandler = AuthenticationManager.getDefault();
	  
	  if (authHandler.checkPassword(user, password)){
		  // result = null;
		  // FacesUtils.addErrorMessage(null, "error.newPasswordEqualsOldPassword");	// Las contraseñas no coinciden				  
	  } else {
		  Date					expireDate = calcNextExpireDate(user.getPasswordExpireDate());
		  
		  user.setPasswordExpireDate(expireDate);				 // Establecemos la nueva fecha de expiración
		  
		  authHandler.changePassword(user,password);
		  this.updateEntity(user, false);	  
	  }
  }
*/  

  /**
   * @return Devuelve la próxima fecha de expiración
  
  private Date calcNextExpireDate(Date expireDate){
	  int daysToExpirePassword = ConfigurationUtil.getDefault().getDaysToExpirePassword();
	  
	  if (expireDate == null){
		  expireDate = new Date();
	  }
	  
	  return DateUtils.addDays(expireDate, daysToExpirePassword);
  }  
   */
}