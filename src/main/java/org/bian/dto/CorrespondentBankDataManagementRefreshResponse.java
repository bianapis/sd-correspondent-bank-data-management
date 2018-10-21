package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CorrespondentBankDataManagementRefreshResponse
 */
public class CorrespondentBankDataManagementRefreshResponse   {
  private String refreshStatus = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Text 
   * @return refreshStatus
  **/

  public String getRefreshStatus() {
    return refreshStatus;
  }

  public void setRefreshStatus(String refreshStatus) {
    this.refreshStatus = refreshStatus;
  }


}

