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
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.SerializationUtils;

import com.autentia.tnt.dao.ITransferObject;

/**
 * Transfer object to store BulletinBoards
 * 
 * @author stajanov code generator
 */
public class Commissioning implements Serializable, ITransferObject {
	/** Serial version field */
	private static final long serialVersionUID = -1L;

	/* Commissioning - generated by stajanov (do not edit/delete) */

	// Fields
	private Integer id;

	private Date requestDate;

	private String name;

	private String scope;

	private String content;

	private String products;

	private Date deliveryDate;

	private BigDecimal budget;

	private String notes;

	private boolean authorSignature;

	private boolean reviserSignature;

	private boolean adminSignature;

	private boolean justifyInformation;

	private String developedActivities;

	private String difficultiesAppeared;

	private String results;

	private String conclusions;

	private String evaluation;

	private CommissioningStatus status;

	private Date insertDate;

	private Date updateDate;

	private Date deleteDate;

	private Project project;

	private Set<CommissioningDelay> commissioningDelays = new HashSet<CommissioningDelay>();

	private Set<CommissioningPaymentData> collaboratorsPaymentData = new HashSet<CommissioningPaymentData>();

	private Set<Integer> collaboratorsId = new HashSet<Integer>(0);
	
	private Set<User> revisers;
	
	private Set<Integer> revisersId = new HashSet<Integer>(0);
	
	private Set<CommissioningFile> files = new HashSet<CommissioningFile>();

	private Integer ownerId;

	private Integer departmentId;

	private Commissioning changes;

	private Set<CommissioningChange> history = new HashSet<CommissioningChange>();

	// Setters and getters

	public Integer getId() {
		return id;
	}

	private void setId(Integer id) {
		this.id = id;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getProducts() {
		return products;
	}

	public void setProducts(String products) {
		this.products = products;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public BigDecimal getBudget() {
		return budget;
	}

	public void setBudget(BigDecimal budget) {
		this.budget = budget;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public boolean isAuthorSignature() {
		return authorSignature;
	}

	public void setAuthorSignature(boolean authorSignature) {
		this.authorSignature = authorSignature;
	}

	public boolean isReviserSignature() {
		return reviserSignature;
	}

	public void setReviserSignature(boolean reviserSignature) {
		this.reviserSignature = reviserSignature;
	}

	public boolean isAdminSignature() {
		return adminSignature;
	}

	public void setAdminSignature(boolean adminSignature) {
		this.adminSignature = adminSignature;
	}

	public boolean isJustifyInformation() {
		return justifyInformation;
	}

	public void setJustifyInformation(boolean justifyInformation) {
		this.justifyInformation = justifyInformation;
	}

	public String getDevelopedActivities() {
		return developedActivities;
	}

	public void setDevelopedActivities(String developedActivities) {
		this.developedActivities = developedActivities;
	}

	public String getDifficultiesAppeared() {
		return difficultiesAppeared;
	}

	public void setDifficultiesAppeared(String difficultiesAppeared) {
		this.difficultiesAppeared = difficultiesAppeared;
	}

	public String getResults() {
		return results;
	}

	public void setResults(String results) {
		this.results = results;
	}

	public String getConclusions() {
		return conclusions;
	}

	public void setConclusions(String conclusions) {
		this.conclusions = conclusions;
	}

	public String getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}

	public CommissioningStatus getStatus() {
		return status;
	}

	public void setStatus(CommissioningStatus status) {
		this.status = status;
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

	public Date getDeleteDate() {
		return deleteDate;
	}

	public void setDeleteDate(Date deleteDate) {
		this.deleteDate = deleteDate;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Set<CommissioningDelay> getCommissioningDelays() {
		return commissioningDelays;
	}

	public void setCommissioningDelays(
			Set<CommissioningDelay> commissioningDelays) {
		this.commissioningDelays = commissioningDelays;
	}

	public Set<CommissioningPaymentData> getCollaboratorsPaymentData() {
		return collaboratorsPaymentData;
	}

	public void setCollaboratorsPaymentData(Set<CommissioningPaymentData> collaboratorsPaymentData) {
		this.collaboratorsPaymentData = collaboratorsPaymentData;
	}

	public Set<User> getRevisers() {
		return revisers;
	}

	public void setRevisers(Set<User> revisers) {
		this.revisers = revisers;
	}

	@Override
	public boolean equals(Object that) {
		try {
			if (that == null)
				return false;
			else
				return this.getId().equals(((Commissioning) that).getId());
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

	public Integer getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}

	public void initChanges() {
		// solo inicializamos los cambios de las relaciones multiples si estamos en estado
		// aceptado o confirmado
		if (this.getStatus() != null
				&& (this.getStatus().equals(CommissioningStatus.ACCEPTED) || this.getStatus().equals(
						CommissioningStatus.CONFIRMED))) {
			// recorremos las relaciones múltiples para que se copien en el clon
			// los objetos y no los proxies de HB
			// accedemos a una propiedad de cada para segurarnos que se carga el obj
			if (this.getProject() != null) {
				this.getProject().getName();
			}
			if (this.getCommissioningDelays() != null) {
				for (CommissioningDelay delay : this.getCommissioningDelays()) {
					delay.getId();
				}
			}
			if (this.getCollaboratorsPaymentData() != null) {
				for (CommissioningPaymentData payment : this.getCollaboratorsPaymentData()) {
					// si no recojo el id no se inicializa y luego falla el contains al buscarlo en el manager
					payment.getCollaborator().getId();
					payment.getCollaborator().getName();
					payment.getCommissioning().getId();
				}
			}
			if (this.getRevisers() != null) {
				for (User revisor : this.getRevisers()) {
					revisor.getName();
				}
			}
			if (this.getFiles() != null) {
				for (CommissioningFile file : this.getFiles()) {
					file.getFile();
				}
			}
		}
		this.changes = (Commissioning)SerializationUtils.clone(this);
	}

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	/**
	 * @return the changes
	 */
	public Commissioning getChanges() {
		return changes;
	}

	/**
	 * @param changes
	 *            the changes to set
	 */
	public void setChanges(Commissioning changes) {
		this.changes = changes;
	}

	/**
	 * @return the history
	 */
	public Set<CommissioningChange> getHistory() {
		return history;
	}

	/**
	 * @param history
	 *            the history to set
	 */
	public void setHistory(Set<CommissioningChange> history) {
		this.history = history;
	}

	/**
	 * @return the files
	 */
	public Set<CommissioningFile> getFiles() {
		return files;
	}

	/**
	 * @param files the files to set
	 */
	public void setFiles(Set<CommissioningFile> files) {
		this.files = files;
	}

	public Set<Integer> getCollaboratorsId() {
		return collaboratorsId;
	}

	public void setCollaboratorsId(Set<Integer> collaboratorsId) {
		this.collaboratorsId = collaboratorsId;
	}

	public Set<Integer> getRevisersId() {
		return revisersId;
	}

	public void setRevisersId(Set<Integer> revisersId) {
		this.revisersId = revisersId;
	}

	public List<Integer> getOwnersId() {
		// TODO Auto-generated method stub
		return null;
	}
}