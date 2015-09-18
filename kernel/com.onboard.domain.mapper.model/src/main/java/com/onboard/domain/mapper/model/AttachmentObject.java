/*******************************************************************************
 * Copyright [2015] [Onboard team of SERC, Peking University]
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.onboard.domain.mapper.model;

import com.onboard.domain.mapper.model.common.BaseItem;

import java.util.Date;

public class AttachmentObject implements BaseItem {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.projectId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer projectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.name
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.size
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Long size;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.contentType
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String contentType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.creatorId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.attachId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer attachId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.attachType
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String attachType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.created
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Date created;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.creatorName
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String creatorName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.targetType
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String targetType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.targetId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer targetId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.companyId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Integer companyId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.deleted
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private Boolean deleted;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column attachment.creatorAvatar
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    private String creatorAvatar;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.id
     *
     * @return the value of attachment.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.id
     *
     * @param id the value for attachment.id
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.projectId
     *
     * @return the value of attachment.projectId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.projectId
     *
     * @param projectId the value for attachment.projectId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.name
     *
     * @return the value of attachment.name
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.name
     *
     * @param name the value for attachment.name
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.size
     *
     * @return the value of attachment.size
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Long getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.size
     *
     * @param size the value for attachment.size
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.contentType
     *
     * @return the value of attachment.contentType
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.contentType
     *
     * @param contentType the value for attachment.contentType
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setContentType(String contentType) {
        this.contentType = contentType == null ? null : contentType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.creatorId
     *
     * @return the value of attachment.creatorId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.creatorId
     *
     * @param creatorId the value for attachment.creatorId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.attachId
     *
     * @return the value of attachment.attachId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getAttachId() {
        return attachId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.attachId
     *
     * @param attachId the value for attachment.attachId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setAttachId(Integer attachId) {
        this.attachId = attachId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.attachType
     *
     * @return the value of attachment.attachType
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getAttachType() {
        return attachType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.attachType
     *
     * @param attachType the value for attachment.attachType
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setAttachType(String attachType) {
        this.attachType = attachType == null ? null : attachType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.created
     *
     * @return the value of attachment.created
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Date getCreated() {
        return created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.created
     *
     * @param created the value for attachment.created
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.creatorName
     *
     * @return the value of attachment.creatorName
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.creatorName
     *
     * @param creatorName the value for attachment.creatorName
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.targetType
     *
     * @return the value of attachment.targetType
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getTargetType() {
        return targetType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.targetType
     *
     * @param targetType the value for attachment.targetType
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setTargetType(String targetType) {
        this.targetType = targetType == null ? null : targetType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.targetId
     *
     * @return the value of attachment.targetId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getTargetId() {
        return targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.targetId
     *
     * @param targetId the value for attachment.targetId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setTargetId(Integer targetId) {
        this.targetId = targetId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.companyId
     *
     * @return the value of attachment.companyId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Integer getCompanyId() {
        return companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.companyId
     *
     * @param companyId the value for attachment.companyId
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.deleted
     *
     * @return the value of attachment.deleted
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.deleted
     *
     * @param deleted the value for attachment.deleted
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column attachment.creatorAvatar
     *
     * @return the value of attachment.creatorAvatar
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public String getCreatorAvatar() {
        return creatorAvatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column attachment.creatorAvatar
     *
     * @param creatorAvatar the value for attachment.creatorAvatar
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public void setCreatorAvatar(String creatorAvatar) {
        this.creatorAvatar = creatorAvatar == null ? null : creatorAvatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public AttachmentObject(AttachmentObject parent) {
        this.id = parent.getId();
        this.projectId = parent.getProjectId();
        this.name = parent.getName();
        this.size = parent.getSize();
        this.contentType = parent.getContentType();
        this.creatorId = parent.getCreatorId();
        this.attachId = parent.getAttachId();
        this.attachType = parent.getAttachType();
        this.created = parent.getCreated();
        this.creatorName = parent.getCreatorName();
        this.targetType = parent.getTargetType();
        this.targetId = parent.getTargetId();
        this.companyId = parent.getCompanyId();
        this.deleted = parent.getDeleted();
        this.creatorAvatar = parent.getCreatorAvatar();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public AttachmentObject() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public AttachmentObject(int id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public AttachmentObject(boolean deleted) {
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    public AttachmentObject(int id, boolean deleted) {
        this.id = id;
        this.deleted = deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table attachment
     *
     * @mbggenerated Wed Aug 26 19:51:19 CST 2015
     */
    @Override
    public AttachmentObject copy() {
        return new AttachmentObject(this);
    }
}