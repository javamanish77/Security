package com.sathya.security.Entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Permissions {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer permissionId;
	private String permissionName;
	private String permissionDescription;
	private Integer roleId;
	public Integer getPermissionId() {
		return permissionId;
	}
	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}
	public String getPermissionName() {
		return permissionName;
	}
	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}
	public String getPermissionDescription() {
		return permissionDescription;
	}
	public void setPermissionDescription(String permissionDescription) {
		this.permissionDescription = permissionDescription;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	@Override
	public String toString() {
		return "Permissions [permissionId=" + permissionId + ", permissionName=" + permissionName
				+ ", permissionDescription=" + permissionDescription + ", roleId=" + roleId + "]";
	}
	
	

}
