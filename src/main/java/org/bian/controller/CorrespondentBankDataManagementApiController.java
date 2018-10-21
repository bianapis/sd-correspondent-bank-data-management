/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Register;

@BianRestController
public class CorrespondentBankDataManagementApiController {

	@Autowired
	CorrespondentBankDataManagementApiService service;
	
	@Register.Record
	public BianResponse<CorrespondentBankDataManagementRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorrespondentBankDataManagementRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Register.RegisterAt
	public BianResponse<CorrespondentBank> register(@RequestBody BianRequest<CorrespondentBankWithoutId> bianRequest) {
		return BianResponse.forSuccess(service.register(bianRequest.getData()));
	}
	
	@Register.RequestPut
	public BianResponse<CorrespondentBank> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorrespondentBankWithoutId> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	
	@Register.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Register.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Register.Retrieve
	public BianResponse<CorrespondentBank> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	
	@Register.Update
	public BianResponse<CorrespondentBank> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CorrespondentBankWithoutId> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
