/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CorrespondentBankDataManagementApiServiceImpl implements CorrespondentBankDataManagementApiService {

	public CorrespondentBankDataManagementRecordResponse record(String crReferenceId, CorrespondentBankDataManagementRecordRequest request){
		return JsonReader.read("record-CorrespondentBankDataManagementRecordResponse.json",new TypeReference<CorrespondentBankDataManagementRecordResponse>(){});
	}
	
	public CorrespondentBank register(CorrespondentBankWithoutId request){
		return JsonReader.read("register-CorrespondentBank.json",new TypeReference<CorrespondentBank>(){});
	}
	
	public CorrespondentBank requestPut(String crReferenceId, CorrespondentBankWithoutId request){
		return JsonReader.read("requestPut-CorrespondentBank.json",new TypeReference<CorrespondentBank>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CorrespondentBank retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CorrespondentBank.json",new TypeReference<CorrespondentBank>(){});
	}
	
	public CorrespondentBankDataManagementDirectory retrieveDirectories(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CorrespondentBankDataManagementDirectory.json",new TypeReference<CorrespondentBankDataManagementDirectory>(){});
	}
	
	public CorrespondentBank update(String crReferenceId, CorrespondentBankWithoutId request){
		return JsonReader.read("update-CorrespondentBank.json",new TypeReference<CorrespondentBank>(){});
	}
	
}
