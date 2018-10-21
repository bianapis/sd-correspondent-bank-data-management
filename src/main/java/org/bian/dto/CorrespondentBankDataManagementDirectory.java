package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CorrespondentBankDataManagementDirectory
 */
public class CorrespondentBankDataManagementDirectory   {
  private String correspondentBankDirectoryReference = null;

  private String correspondentBankDirectoryVersion = null;

  private String correspondentBankDirectoryConfiguration = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return correspondentBankDirectoryReference
  **/

  public String getCorrespondentBankDirectoryReference() {
    return correspondentBankDirectoryReference;
  }

  public void setCorrespondentBankDirectoryReference(String correspondentBankDirectoryReference) {
    this.correspondentBankDirectoryReference = correspondentBankDirectoryReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return correspondentBankDirectoryVersion
  **/

  public String getCorrespondentBankDirectoryVersion() {
    return correspondentBankDirectoryVersion;
  }

  public void setCorrespondentBankDirectoryVersion(String correspondentBankDirectoryVersion) {
    this.correspondentBankDirectoryVersion = correspondentBankDirectoryVersion;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return correspondentBankDirectoryConfiguration
  **/

  public String getCorrespondentBankDirectoryConfiguration() {
    return correspondentBankDirectoryConfiguration;
  }

  public void setCorrespondentBankDirectoryConfiguration(String correspondentBankDirectoryConfiguration) {
    this.correspondentBankDirectoryConfiguration = correspondentBankDirectoryConfiguration;
  }


}

