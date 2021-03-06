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

package com.autentia.tnt.manager.security;

import com.autentia.tnt.dao.ITransferObject;

import org.acegisecurity.acls.objectidentity.ObjectIdentity;
import org.acegisecurity.acls.objectidentity.ObjectIdentityRetrievalStrategy;

/**
 *
 * @author Ivan Zaera Avellon
 */
public class TransferObjectIdentityRetrievalStrategy implements ObjectIdentityRetrievalStrategy
{
	public ObjectIdentity getObjectIdentity(Object domainObject)
	{
		if( domainObject instanceof ITransferObject )
		{
			return new TransferObjectIdentity((ITransferObject)domainObject);
		}
		else
		{
			throw new IllegalArgumentException("TransferObjectIdentityRetrievalStrategy only supports ITransferObjects");
		}
	}
	
}
