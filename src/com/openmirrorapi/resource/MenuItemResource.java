package com.openmirrorapi.resource;

public class MenuItemResource {

	private String id;
	private String action;
	private MenuItemValuesResource[] values;
	private Boolean removeWhenSelected;
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public MenuItemValuesResource[] getValues() {
		return values;
	}
	
	public void setValues(MenuItemValuesResource[] values) {
		this.values = values;
	}
	
	public Boolean getRemoveWhenSelected() {
		return removeWhenSelected;
	}
	
	public void setRemoveWhenSelected(Boolean removeWhenSelected) {
		this.removeWhenSelected = removeWhenSelected;
	}
}
