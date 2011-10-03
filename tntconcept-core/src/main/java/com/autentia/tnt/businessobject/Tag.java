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

package com.autentia.tnt.businessobject;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.autentia.tnt.dao.ITransferObject;
import org.apache.commons.lang.SerializationUtils;

/**
 * Transfer object to store Roles
 * 
 * @author stajanov code generator
 */
public class Tag implements Serializable, ITransferObject {
	/* Tag - generated by stajanov (do not edit/delete) */

	// Fields

	private Integer id;

	private String name;

	private String description;

	private Integer ownerId;

	private Integer departmentId;

	private Date insertDate;

	private Date updateDate;
	
	private Set<Contact> contactTags = new HashSet<Contact>(0);

	private Set<Position> positionTags = new HashSet<Position>(0);

	private Set<Department> departmentTags = new HashSet<Department>(0);

	private Set<Organization> organizationTags = new HashSet<Organization>(0);

    private Tag changes;

	// Setters and getters

	public Integer getId() {
		return id;
	}

	private void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public Date getInsertDate() {
		return insertDate;
	}

	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Set<Contact> getContactTags() {
		return contactTags;
	}

	public void setContactTags(Set<Contact> contactTags) {
		this.contactTags = contactTags;
	}

	public Set<Position> getPositionTags() {
		return positionTags;
	}

	public void setPositionTags(Set<Position> positionTags) {
		this.positionTags = positionTags;
	}

	public Set<Department> getDepartmentTags() {
		return departmentTags;
	}

	public void setDepartmentTags(Set<Department> departmentTags) {
		this.departmentTags = departmentTags;
	}

	public Set<Organization> getOrganizationTags() {
		return organizationTags;
	}

	public void setOrganizationTags(Set<Organization> organizationTags) {
		this.organizationTags = organizationTags;
	}

	@Override
	public boolean equals(Object that) {
		try {
			if (that == null)
				return false;
			else
				return this.getId().equals(((Tag) that).getId());
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public int hashCode() {
		if (this.getId() == null)
			return super.hashCode();
		else
			return this.getId().intValue();
	}

	public List<Integer> getOwnersId() {
		// TODO Auto-generated method stub
		return null;
	}

    public Tag getChanges() {
        return changes;
    }

    public void setChanges(Tag changes) {
        this.changes = changes;
    }

    public void initChanges() {
        if (this.getContactTags() != null) {
            for (Contact contact : this.getContactTags()) {
                contact.getId();
                contact.getName();
//                for (ContactChange change: contact.getHistory()) {
//                    change.getId();
//                    change.getField();
//                }
            }
        }
		this.changes = (Tag)SerializationUtils.clone(this);
	}
}