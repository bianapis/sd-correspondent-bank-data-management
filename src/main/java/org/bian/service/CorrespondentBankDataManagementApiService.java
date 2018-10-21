/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CorrespondentBankDataManagementApiService {

	CorrespondentBankDataManagementRecordResponse record(String crReferenceId, CorrespondentBankDataManagementRecordRequest request);
	
	CorrespondentBank register(CorrespondentBankWithoutId request);
	
	CorrespondentBank requestPut(String crReferenceId, CorrespondentBankWithoutId request);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	CorrespondentBank retrieve(String crReferenceId);
	
	CorrespondentBankDataManagementDirectory retrieveDirectories(String crReferenceId, String bqReferenceId);
	
	CorrespondentBank update(String crReferenceId, CorrespondentBankWithoutId request);
	
}
