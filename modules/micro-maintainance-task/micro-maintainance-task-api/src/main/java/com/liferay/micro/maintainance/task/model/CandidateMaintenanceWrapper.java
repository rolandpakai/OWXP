/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.micro.maintainance.task.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link CandidateMaintenance}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CandidateMaintenance
 * @generated
 */
@ProviderType
public class CandidateMaintenanceWrapper implements CandidateMaintenance,
	ModelWrapper<CandidateMaintenance> {
	public CandidateMaintenanceWrapper(
		CandidateMaintenance candidateMaintenance) {
		_candidateMaintenance = candidateMaintenance;
	}

	@Override
	public Class<?> getModelClass() {
		return CandidateMaintenance.class;
	}

	@Override
	public String getModelClassName() {
		return CandidateMaintenance.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("candidateMaintenanceId", getCandidateMaintenanceId());
		attributes.put("candidateId", getCandidateId());
		attributes.put("taskId", getTaskId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long candidateMaintenanceId = (Long)attributes.get(
				"candidateMaintenanceId");

		if (candidateMaintenanceId != null) {
			setCandidateMaintenanceId(candidateMaintenanceId);
		}

		Long candidateId = (Long)attributes.get("candidateId");

		if (candidateId != null) {
			setCandidateId(candidateId);
		}

		Long taskId = (Long)attributes.get("taskId");

		if (taskId != null) {
			setTaskId(taskId);
		}
	}

	@Override
	public CandidateMaintenance toEscapedModel() {
		return new CandidateMaintenanceWrapper(_candidateMaintenance.toEscapedModel());
	}

	@Override
	public CandidateMaintenance toUnescapedModel() {
		return new CandidateMaintenanceWrapper(_candidateMaintenance.toUnescapedModel());
	}

	@Override
	public boolean isCachedModel() {
		return _candidateMaintenance.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _candidateMaintenance.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _candidateMaintenance.isNew();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _candidateMaintenance.getExpandoBridge();
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<CandidateMaintenance> toCacheModel() {
		return _candidateMaintenance.toCacheModel();
	}

	@Override
	public int compareTo(CandidateMaintenance candidateMaintenance) {
		return _candidateMaintenance.compareTo(candidateMaintenance);
	}

	@Override
	public int hashCode() {
		return _candidateMaintenance.hashCode();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _candidateMaintenance.getPrimaryKeyObj();
	}

	@Override
	public java.lang.Object clone() {
		return new CandidateMaintenanceWrapper((CandidateMaintenance)_candidateMaintenance.clone());
	}

	/**
	* Returns the uuid of this candidate maintenance.
	*
	* @return the uuid of this candidate maintenance
	*/
	@Override
	public java.lang.String getUuid() {
		return _candidateMaintenance.getUuid();
	}

	@Override
	public java.lang.String toString() {
		return _candidateMaintenance.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _candidateMaintenance.toXmlString();
	}

	/**
	* Returns the candidate ID of this candidate maintenance.
	*
	* @return the candidate ID of this candidate maintenance
	*/
	@Override
	public long getCandidateId() {
		return _candidateMaintenance.getCandidateId();
	}

	/**
	* Returns the candidate maintenance ID of this candidate maintenance.
	*
	* @return the candidate maintenance ID of this candidate maintenance
	*/
	@Override
	public long getCandidateMaintenanceId() {
		return _candidateMaintenance.getCandidateMaintenanceId();
	}

	/**
	* Returns the primary key of this candidate maintenance.
	*
	* @return the primary key of this candidate maintenance
	*/
	@Override
	public long getPrimaryKey() {
		return _candidateMaintenance.getPrimaryKey();
	}

	/**
	* Returns the task ID of this candidate maintenance.
	*
	* @return the task ID of this candidate maintenance
	*/
	@Override
	public long getTaskId() {
		return _candidateMaintenance.getTaskId();
	}

	@Override
	public void persist() {
		_candidateMaintenance.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_candidateMaintenance.setCachedModel(cachedModel);
	}

	/**
	* Sets the candidate ID of this candidate maintenance.
	*
	* @param candidateId the candidate ID of this candidate maintenance
	*/
	@Override
	public void setCandidateId(long candidateId) {
		_candidateMaintenance.setCandidateId(candidateId);
	}

	/**
	* Sets the candidate maintenance ID of this candidate maintenance.
	*
	* @param candidateMaintenanceId the candidate maintenance ID of this candidate maintenance
	*/
	@Override
	public void setCandidateMaintenanceId(long candidateMaintenanceId) {
		_candidateMaintenance.setCandidateMaintenanceId(candidateMaintenanceId);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_candidateMaintenance.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_candidateMaintenance.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_candidateMaintenance.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_candidateMaintenance.setNew(n);
	}

	/**
	* Sets the primary key of this candidate maintenance.
	*
	* @param primaryKey the primary key of this candidate maintenance
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_candidateMaintenance.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_candidateMaintenance.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the task ID of this candidate maintenance.
	*
	* @param taskId the task ID of this candidate maintenance
	*/
	@Override
	public void setTaskId(long taskId) {
		_candidateMaintenance.setTaskId(taskId);
	}

	/**
	* Sets the uuid of this candidate maintenance.
	*
	* @param uuid the uuid of this candidate maintenance
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_candidateMaintenance.setUuid(uuid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CandidateMaintenanceWrapper)) {
			return false;
		}

		CandidateMaintenanceWrapper candidateMaintenanceWrapper = (CandidateMaintenanceWrapper)obj;

		if (Objects.equals(_candidateMaintenance,
					candidateMaintenanceWrapper._candidateMaintenance)) {
			return true;
		}

		return false;
	}

	@Override
	public CandidateMaintenance getWrappedModel() {
		return _candidateMaintenance;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _candidateMaintenance.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _candidateMaintenance.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_candidateMaintenance.resetOriginalValues();
	}

	private final CandidateMaintenance _candidateMaintenance;
}