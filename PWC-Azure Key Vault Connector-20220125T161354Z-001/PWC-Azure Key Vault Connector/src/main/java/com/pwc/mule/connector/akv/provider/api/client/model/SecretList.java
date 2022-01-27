package com.pwc.mule.connector.akv.provider.api.client.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class SecretList {
	
	@SerializedName(value = "secretList")
	  private List<Secret> secretList;

	public List<Secret> getSecretList() {
		return secretList;
	}

	public void setSecretList(List<Secret> secretList) {
		this.secretList = secretList;
	}

	
}