package com.pwc.mule.connector.akv.provider.api.error;

import org.mule.runtime.extension.api.exception.ModuleException;

public class KeyNotFoundException extends ModuleException {

  public KeyNotFoundException(String message) {
    super(message, AzureKeyVaultErrorType.KEY_NOT_FOUND);
  }

}
