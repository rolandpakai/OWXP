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

package com.liferay.micro.maintainance.decision.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DecisionEntry service. Represents a row in the &quot;Decision_DecisionEntry&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.micro.maintainance.decision.model.impl.DecisionEntryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.micro.maintainance.decision.model.impl.DecisionEntryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DecisionEntry
 * @see com.liferay.micro.maintainance.decision.model.impl.DecisionEntryImpl
 * @see com.liferay.micro.maintainance.decision.model.impl.DecisionEntryModelImpl
 * @generated
 */
@ProviderType
public interface DecisionEntryModel extends BaseModel<DecisionEntry>,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a decision entry model instance should use the {@link DecisionEntry} interface instead.
	 */

	/**
	 * Returns the primary key of this decision entry.
	 *
	 * @return the primary key of this decision entry
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this decision entry.
	 *
	 * @param primaryKey the primary key of this decision entry
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this decision entry.
	 *
	 * @return the uuid of this decision entry
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this decision entry.
	 *
	 * @param uuid the uuid of this decision entry
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the decision entry ID of this decision entry.
	 *
	 * @return the decision entry ID of this decision entry
	 */
	public long getDecisionEntryId();

	/**
	 * Sets the decision entry ID of this decision entry.
	 *
	 * @param decisionEntryId the decision entry ID of this decision entry
	 */
	public void setDecisionEntryId(long decisionEntryId);

	/**
	 * Returns the company ID of this decision entry.
	 *
	 * @return the company ID of this decision entry
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this decision entry.
	 *
	 * @param companyId the company ID of this decision entry
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this decision entry.
	 *
	 * @return the user ID of this decision entry
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this decision entry.
	 *
	 * @param userId the user ID of this decision entry
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this decision entry.
	 *
	 * @return the user uuid of this decision entry
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this decision entry.
	 *
	 * @param userUuid the user uuid of this decision entry
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this decision entry.
	 *
	 * @return the user name of this decision entry
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this decision entry.
	 *
	 * @param userName the user name of this decision entry
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this decision entry.
	 *
	 * @return the create date of this decision entry
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this decision entry.
	 *
	 * @param createDate the create date of this decision entry
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this decision entry.
	 *
	 * @return the modified date of this decision entry
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this decision entry.
	 *
	 * @param modifiedDate the modified date of this decision entry
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the analysis data of this decision entry.
	 *
	 * @return the analysis data of this decision entry
	 */
	@AutoEscape
	public String getAnalysisData();

	/**
	 * Sets the analysis data of this decision entry.
	 *
	 * @param analysisData the analysis data of this decision entry
	 */
	public void setAnalysisData(String analysisData);

	/**
	 * Returns the wiki page ID of this decision entry.
	 *
	 * @return the wiki page ID of this decision entry
	 */
	public long getWikiPageId();

	/**
	 * Sets the wiki page ID of this decision entry.
	 *
	 * @param wikiPageId the wiki page ID of this decision entry
	 */
	public void setWikiPageId(long wikiPageId);

	/**
	 * Returns the wiki page name of this decision entry.
	 *
	 * @return the wiki page name of this decision entry
	 */
	@AutoEscape
	public String getWikiPageName();

	/**
	 * Sets the wiki page name of this decision entry.
	 *
	 * @param wikiPageName the wiki page name of this decision entry
	 */
	public void setWikiPageName(String wikiPageName);

	/**
	 * Returns the outcome of this decision entry.
	 *
	 * @return the outcome of this decision entry
	 */
	@AutoEscape
	public String getOutcome();

	/**
	 * Sets the outcome of this decision entry.
	 *
	 * @param outcome the outcome of this decision entry
	 */
	public void setOutcome(String outcome);

	/**
	 * Returns the handled of this decision entry.
	 *
	 * @return the handled of this decision entry
	 */
	public boolean getHandled();

	/**
	 * Returns <code>true</code> if this decision entry is handled.
	 *
	 * @return <code>true</code> if this decision entry is handled; <code>false</code> otherwise
	 */
	public boolean isHandled();

	/**
	 * Sets whether this decision entry is handled.
	 *
	 * @param handled the handled of this decision entry
	 */
	public void setHandled(boolean handled);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(DecisionEntry decisionEntry);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DecisionEntry> toCacheModel();

	@Override
	public DecisionEntry toEscapedModel();

	@Override
	public DecisionEntry toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}