package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CorrespondentBank
 */
public class CorrespondentBank   {
  private String correspondentBankDirectoryEntryReference = null;

  private String correspondentBankReference = null;

  private String clearingSortCodes = null;

  private String contactAddresses = null;

  private String legalEntityIdentifiers = null;

  private String bankHierarchy = null;

  private String holidayTimeZoneSchedule = null;

  private String vostroAccountReference = null;

  private String nostroMirrorAccountReference = null;

  private String corresponentBankAgreementReference = null;

  private String correspondentBankAgreement = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return correspondentBankDirectoryEntryReference
  **/

  public String getCorrespondentBankDirectoryEntryReference() {
    return correspondentBankDirectoryEntryReference;
  }

  public void setCorrespondentBankDirectoryEntryReference(String correspondentBankDirectoryEntryReference) {
    this.correspondentBankDirectoryEntryReference = correspondentBankDirectoryEntryReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return correspondentBankReference
  **/

  public String getCorrespondentBankReference() {
    return correspondentBankReference;
  }

  public void setCorrespondentBankReference(String correspondentBankReference) {
    this.correspondentBankReference = correspondentBankReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return clearingSortCodes
  **/

  public String getClearingSortCodes() {
    return clearingSortCodes;
  }

  public void setClearingSortCodes(String clearingSortCodes) {
    this.clearingSortCodes = clearingSortCodes;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return contactAddresses
  **/

  public String getContactAddresses() {
    return contactAddresses;
  }

  public void setContactAddresses(String contactAddresses) {
    this.contactAddresses = contactAddresses;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return legalEntityIdentifiers
  **/

  public String getLegalEntityIdentifiers() {
    return legalEntityIdentifiers;
  }

  public void setLegalEntityIdentifiers(String legalEntityIdentifiers) {
    this.legalEntityIdentifiers = legalEntityIdentifiers;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return bankHierarchy
  **/

  public String getBankHierarchy() {
    return bankHierarchy;
  }

  public void setBankHierarchy(String bankHierarchy) {
    this.bankHierarchy = bankHierarchy;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Duration       
   * @return holidayTimeZoneSchedule
  **/

  public String getHolidayTimeZoneSchedule() {
    return holidayTimeZoneSchedule;
  }

  public void setHolidayTimeZoneSchedule(String holidayTimeZoneSchedule) {
    this.holidayTimeZoneSchedule = holidayTimeZoneSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return vostroAccountReference
  **/

  public String getVostroAccountReference() {
    return vostroAccountReference;
  }

  public void setVostroAccountReference(String vostroAccountReference) {
    this.vostroAccountReference = vostroAccountReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return nostroMirrorAccountReference
  **/

  public String getNostroMirrorAccountReference() {
    return nostroMirrorAccountReference;
  }

  public void setNostroMirrorAccountReference(String nostroMirrorAccountReference) {
    this.nostroMirrorAccountReference = nostroMirrorAccountReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier       
   * @return corresponentBankAgreementReference
  **/

  public String getCorresponentBankAgreementReference() {
    return corresponentBankAgreementReference;
  }

  public void setCorresponentBankAgreementReference(String corresponentBankAgreementReference) {
    this.corresponentBankAgreementReference = corresponentBankAgreementReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return correspondentBankAgreement
  **/

  public String getCorrespondentBankAgreement() {
    return correspondentBankAgreement;
  }

  public void setCorrespondentBankAgreement(String correspondentBankAgreement) {
    this.correspondentBankAgreement = correspondentBankAgreement;
  }


}

