/*
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.schematics.v1;

import com.ibm.cloud.schematics.v1.model.Action;
import com.ibm.cloud.schematics.v1.model.ActionList;
import com.ibm.cloud.schematics.v1.model.ApplyWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.CreateActionOptions;
import com.ibm.cloud.schematics.v1.model.CreateInventoryOptions;
import com.ibm.cloud.schematics.v1.model.CreateJobOptions;
import com.ibm.cloud.schematics.v1.model.CreateResourceQueryOptions;
import com.ibm.cloud.schematics.v1.model.CreateWorkspaceDeletionJobOptions;
import com.ibm.cloud.schematics.v1.model.CreateWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.DeleteActionOptions;
import com.ibm.cloud.schematics.v1.model.DeleteInventoryOptions;
import com.ibm.cloud.schematics.v1.model.DeleteJobOptions;
import com.ibm.cloud.schematics.v1.model.DeleteResourcesQueryOptions;
import com.ibm.cloud.schematics.v1.model.DeleteWorkspaceActivityOptions;
import com.ibm.cloud.schematics.v1.model.DeleteWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.DestroyWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.ExecuteResourceQueryOptions;
import com.ibm.cloud.schematics.v1.model.ExternalSource;
import com.ibm.cloud.schematics.v1.model.GetActionOptions;
import com.ibm.cloud.schematics.v1.model.GetAllWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.GetInventoryOptions;
import com.ibm.cloud.schematics.v1.model.GetInventoryValueOptions;
import com.ibm.cloud.schematics.v1.model.GetJobOptions;
import com.ibm.cloud.schematics.v1.model.GetKmsSettingsOptions;
import com.ibm.cloud.schematics.v1.model.GetResourcesQueryOptions;
import com.ibm.cloud.schematics.v1.model.GetSchematicsVersionOptions;
import com.ibm.cloud.schematics.v1.model.GetTemplateActivityLogOptions;
import com.ibm.cloud.schematics.v1.model.GetTemplateLogsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceActivityLogsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceActivityOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceDeletionJobStatusOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceInputMetadataOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceLogUrlsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceOutputsOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceReadmeOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceResourcesOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceStateOptions;
import com.ibm.cloud.schematics.v1.model.GetWorkspaceTemplateStateOptions;
import com.ibm.cloud.schematics.v1.model.InventoryResourceRecord;
import com.ibm.cloud.schematics.v1.model.InventoryResourceRecordList;
import com.ibm.cloud.schematics.v1.model.Job;
import com.ibm.cloud.schematics.v1.model.JobList;
import com.ibm.cloud.schematics.v1.model.JobLog;
import com.ibm.cloud.schematics.v1.model.KMSDiscovery;
import com.ibm.cloud.schematics.v1.model.KMSSettings;
import com.ibm.cloud.schematics.v1.model.ListActionsOptions;
import com.ibm.cloud.schematics.v1.model.ListInventoriesOptions;
import com.ibm.cloud.schematics.v1.model.ListInventoryValuesOptions;
import com.ibm.cloud.schematics.v1.model.ListJobLogsOptions;
import com.ibm.cloud.schematics.v1.model.ListJobsOptions;
import com.ibm.cloud.schematics.v1.model.ListKmsOptions;
import com.ibm.cloud.schematics.v1.model.ListLocationsOptions;
import com.ibm.cloud.schematics.v1.model.ListResourceGroupOptions;
import com.ibm.cloud.schematics.v1.model.ListResourceQueryOptions;
import com.ibm.cloud.schematics.v1.model.ListSchematicsLocationOptions;
import com.ibm.cloud.schematics.v1.model.ListWorkspaceActivitiesOptions;
import com.ibm.cloud.schematics.v1.model.ListWorkspacesOptions;
import com.ibm.cloud.schematics.v1.model.LogStoreResponseList;
import com.ibm.cloud.schematics.v1.model.OutputValuesInner;
import com.ibm.cloud.schematics.v1.model.PlanWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.ProcessTemplateMetaDataOptions;
import com.ibm.cloud.schematics.v1.model.RefreshWorkspaceCommandOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceInventoryOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceResourcesQueryOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceWorkspaceInputsOptions;
import com.ibm.cloud.schematics.v1.model.ReplaceWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.ResourceGroupResponse;
import com.ibm.cloud.schematics.v1.model.ResourceQueryRecord;
import com.ibm.cloud.schematics.v1.model.ResourceQueryRecordList;
import com.ibm.cloud.schematics.v1.model.ResourceQueryResponseRecord;
import com.ibm.cloud.schematics.v1.model.RunWorkspaceCommandsOptions;
import com.ibm.cloud.schematics.v1.model.SchematicsLocations;
import com.ibm.cloud.schematics.v1.model.SchematicsLocationsList;
import com.ibm.cloud.schematics.v1.model.StateStoreResponseList;
import com.ibm.cloud.schematics.v1.model.TemplateMetaDataResponse;
import com.ibm.cloud.schematics.v1.model.TemplateReadme;
import com.ibm.cloud.schematics.v1.model.TemplateRepoTarUploadResponse;
import com.ibm.cloud.schematics.v1.model.TemplateRepoUploadOptions;
import com.ibm.cloud.schematics.v1.model.TemplateResources;
import com.ibm.cloud.schematics.v1.model.TemplateStateStore;
import com.ibm.cloud.schematics.v1.model.TemplateValues;
import com.ibm.cloud.schematics.v1.model.UpdateActionOptions;
import com.ibm.cloud.schematics.v1.model.UpdateInventoryOptions;
import com.ibm.cloud.schematics.v1.model.UpdateJobOptions;
import com.ibm.cloud.schematics.v1.model.UpdateKmsSettingsOptions;
import com.ibm.cloud.schematics.v1.model.UpdateWorkspaceOptions;
import com.ibm.cloud.schematics.v1.model.UploadTemplateTarActionOptions;
import com.ibm.cloud.schematics.v1.model.UserValues;
import com.ibm.cloud.schematics.v1.model.VersionResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivities;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivity;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityApplyResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityCommandResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityDestroyResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityLogs;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityPlanResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceActivityRefreshResult;
import com.ibm.cloud.schematics.v1.model.WorkspaceBulkDeleteResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceJobResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceResponse;
import com.ibm.cloud.schematics.v1.model.WorkspaceResponseList;
import com.ibm.cloud.schematics.v1.model.WorkspaceTemplateValuesResponse;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SchematicsExamples {
  private static final Logger logger = LoggerFactory.getLogger(SchematicsExamples.class);
  protected SchematicsExamples() { }

  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    Schematics service = Schematics.newInstance();

    // Load up our test-specific config properties.
    Map<String, String> config = CredentialUtils.getServiceProperties(Schematics.DEFAULT_SERVICE_NAME);

    try {
      // begin-list_schematics_location
      ListSchematicsLocationOptions listSchematicsLocationOptions = new ListSchematicsLocationOptions();

      Response<List<SchematicsLocations>> response = service.listSchematicsLocation(listSchematicsLocationOptions).execute();
      List<SchematicsLocations> listSchematicsLocations = response.getResult();

      System.out.println(listSchematicsLocations);
      // end-list_schematics_location
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_resource_group
      ListResourceGroupOptions listResourceGroupOptions = new ListResourceGroupOptions();

      Response<List<ResourceGroupResponse>> response = service.listResourceGroup(listResourceGroupOptions).execute();
      List<ResourceGroupResponse> listResourceGroupResponse = response.getResult();

      System.out.println(listResourceGroupResponse);
      // end-list_resource_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_schematics_version
      GetSchematicsVersionOptions getSchematicsVersionOptions = new GetSchematicsVersionOptions();

      Response<VersionResponse> response = service.getSchematicsVersion(getSchematicsVersionOptions).execute();
      VersionResponse versionResponse = response.getResult();

      System.out.println(versionResponse);
      // end-get_schematics_version
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_locations
      ListLocationsOptions listLocationsOptions = new ListLocationsOptions();

      Response<SchematicsLocationsList> response = service.listLocations(listLocationsOptions).execute();
      SchematicsLocationsList schematicsLocationsList = response.getResult();

      System.out.println(schematicsLocationsList);
      // end-list_locations
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-ProcessTemplateMetaData
      ExternalSource externalSourceModel = new ExternalSource.Builder()
        .sourceType("local")
        .build();
      ProcessTemplateMetaDataOptions processTemplateMetaDataOptions = new ProcessTemplateMetaDataOptions.Builder()
        .templateType("testString")
        .source(externalSourceModel)
        .build();

      Response<TemplateMetaDataResponse> response = service.processTemplateMetaData(processTemplateMetaDataOptions).execute();
      TemplateMetaDataResponse templateMetaDataResponse = response.getResult();

      System.out.println(templateMetaDataResponse);
      // end-ProcessTemplateMetaData
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_workspaces
      ListWorkspacesOptions listWorkspacesOptions = new ListWorkspacesOptions.Builder()
        .build();

      Response<WorkspaceResponseList> response = service.listWorkspaces(listWorkspacesOptions).execute();
      WorkspaceResponseList workspaceResponseList = response.getResult();

      System.out.println(workspaceResponseList);
      // end-list_workspaces
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_workspace
      CreateWorkspaceOptions createWorkspaceOptions = new CreateWorkspaceOptions.Builder()
        .build();

      Response<WorkspaceResponse> response = service.createWorkspace(createWorkspaceOptions).execute();
      WorkspaceResponse workspaceResponse = response.getResult();

      System.out.println(workspaceResponse);
      // end-create_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace
      GetWorkspaceOptions getWorkspaceOptions = new GetWorkspaceOptions.Builder()
        .wId("testString")
        .build();

      Response<WorkspaceResponse> response = service.getWorkspace(getWorkspaceOptions).execute();
      WorkspaceResponse workspaceResponse = response.getResult();

      System.out.println(workspaceResponse);
      // end-get_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_workspace
      ReplaceWorkspaceOptions replaceWorkspaceOptions = new ReplaceWorkspaceOptions.Builder()
        .wId("testString")
        .build();

      Response<WorkspaceResponse> response = service.replaceWorkspace(replaceWorkspaceOptions).execute();
      WorkspaceResponse workspaceResponse = response.getResult();

      System.out.println(workspaceResponse);
      // end-replace_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_workspace
      UpdateWorkspaceOptions updateWorkspaceOptions = new UpdateWorkspaceOptions.Builder()
        .wId("testString")
        .build();

      Response<WorkspaceResponse> response = service.updateWorkspace(updateWorkspaceOptions).execute();
      WorkspaceResponse workspaceResponse = response.getResult();

      System.out.println(workspaceResponse);
      // end-update_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace_readme
      GetWorkspaceReadmeOptions getWorkspaceReadmeOptions = new GetWorkspaceReadmeOptions.Builder()
        .wId("testString")
        .build();

      Response<TemplateReadme> response = service.getWorkspaceReadme(getWorkspaceReadmeOptions).execute();
      TemplateReadme templateReadme = response.getResult();

      System.out.println(templateReadme);
      // end-get_workspace_readme
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-template_repo_upload
      TemplateRepoUploadOptions templateRepoUploadOptions = new TemplateRepoUploadOptions.Builder()
        .wId("testString")
        .tId("testString")
        .build();

      Response<TemplateRepoTarUploadResponse> response = service.templateRepoUpload(templateRepoUploadOptions).execute();
      TemplateRepoTarUploadResponse templateRepoTarUploadResponse = response.getResult();

      System.out.println(templateRepoTarUploadResponse);
      // end-template_repo_upload
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace_inputs
      GetWorkspaceInputsOptions getWorkspaceInputsOptions = new GetWorkspaceInputsOptions.Builder()
        .wId("testString")
        .tId("testString")
        .build();

      Response<TemplateValues> response = service.getWorkspaceInputs(getWorkspaceInputsOptions).execute();
      TemplateValues templateValues = response.getResult();

      System.out.println(templateValues);
      // end-get_workspace_inputs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_workspace_inputs
      ReplaceWorkspaceInputsOptions replaceWorkspaceInputsOptions = new ReplaceWorkspaceInputsOptions.Builder()
        .wId("testString")
        .tId("testString")
        .build();

      Response<UserValues> response = service.replaceWorkspaceInputs(replaceWorkspaceInputsOptions).execute();
      UserValues userValues = response.getResult();

      System.out.println(userValues);
      // end-replace_workspace_inputs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_all_workspace_inputs
      GetAllWorkspaceInputsOptions getAllWorkspaceInputsOptions = new GetAllWorkspaceInputsOptions.Builder()
        .wId("testString")
        .build();

      Response<WorkspaceTemplateValuesResponse> response = service.getAllWorkspaceInputs(getAllWorkspaceInputsOptions).execute();
      WorkspaceTemplateValuesResponse workspaceTemplateValuesResponse = response.getResult();

      System.out.println(workspaceTemplateValuesResponse);
      // end-get_all_workspace_inputs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace_input_metadata
      GetWorkspaceInputMetadataOptions getWorkspaceInputMetadataOptions = new GetWorkspaceInputMetadataOptions.Builder()
        .wId("testString")
        .tId("testString")
        .build();

      Response<List<Object>> response = service.getWorkspaceInputMetadata(getWorkspaceInputMetadataOptions).execute();
      List<Object> result = response.getResult();

      System.out.println(result);
      // end-get_workspace_input_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace_outputs
      GetWorkspaceOutputsOptions getWorkspaceOutputsOptions = new GetWorkspaceOutputsOptions.Builder()
        .wId("testString")
        .build();

      Response<List<OutputValuesInner>> response = service.getWorkspaceOutputs(getWorkspaceOutputsOptions).execute();
      List<OutputValuesInner> listOutputValuesInner = response.getResult();

      System.out.println(listOutputValuesInner);
      // end-get_workspace_outputs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace_resources
      GetWorkspaceResourcesOptions getWorkspaceResourcesOptions = new GetWorkspaceResourcesOptions.Builder()
        .wId("testString")
        .build();

      Response<List<TemplateResources>> response = service.getWorkspaceResources(getWorkspaceResourcesOptions).execute();
      List<TemplateResources> listTemplateResources = response.getResult();

      System.out.println(listTemplateResources);
      // end-get_workspace_resources
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace_state
      GetWorkspaceStateOptions getWorkspaceStateOptions = new GetWorkspaceStateOptions.Builder()
        .wId("testString")
        .build();

      Response<StateStoreResponseList> response = service.getWorkspaceState(getWorkspaceStateOptions).execute();
      StateStoreResponseList stateStoreResponseList = response.getResult();

      System.out.println(stateStoreResponseList);
      // end-get_workspace_state
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace_template_state
      GetWorkspaceTemplateStateOptions getWorkspaceTemplateStateOptions = new GetWorkspaceTemplateStateOptions.Builder()
        .wId("testString")
        .tId("testString")
        .build();

      Response<TemplateStateStore> response = service.getWorkspaceTemplateState(getWorkspaceTemplateStateOptions).execute();
      TemplateStateStore templateStateStore = response.getResult();

      System.out.println(templateStateStore);
      // end-get_workspace_template_state
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace_activity_logs
      GetWorkspaceActivityLogsOptions getWorkspaceActivityLogsOptions = new GetWorkspaceActivityLogsOptions.Builder()
        .wId("testString")
        .activityId("testString")
        .build();

      Response<WorkspaceActivityLogs> response = service.getWorkspaceActivityLogs(getWorkspaceActivityLogsOptions).execute();
      WorkspaceActivityLogs workspaceActivityLogs = response.getResult();

      System.out.println(workspaceActivityLogs);
      // end-get_workspace_activity_logs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace_log_urls
      GetWorkspaceLogUrlsOptions getWorkspaceLogUrlsOptions = new GetWorkspaceLogUrlsOptions.Builder()
        .wId("testString")
        .build();

      Response<LogStoreResponseList> response = service.getWorkspaceLogUrls(getWorkspaceLogUrlsOptions).execute();
      LogStoreResponseList logStoreResponseList = response.getResult();

      System.out.println(logStoreResponseList);
      // end-get_workspace_log_urls
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_template_logs
      GetTemplateLogsOptions getTemplateLogsOptions = new GetTemplateLogsOptions.Builder()
        .wId("testString")
        .tId("testString")
        .build();

      Response<String> response = service.getTemplateLogs(getTemplateLogsOptions).execute();
      String templateLogStoreString = response.getResult();

      System.out.println(templateLogStoreString);
      // end-get_template_logs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_template_activity_log
      GetTemplateActivityLogOptions getTemplateActivityLogOptions = new GetTemplateActivityLogOptions.Builder()
        .wId("testString")
        .tId("testString")
        .activityId("testString")
        .build();

      Response<String> response = service.getTemplateActivityLog(getTemplateActivityLogOptions).execute();
      String workspaceActivityTemplateLogString = response.getResult();

      System.out.println(workspaceActivityTemplateLogString);
      // end-get_template_activity_log
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_actions
      ListActionsOptions listActionsOptions = new ListActionsOptions.Builder()
        .build();

      Response<ActionList> response = service.listActions(listActionsOptions).execute();
      ActionList actionList = response.getResult();

      System.out.println(actionList);
      // end-list_actions
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_action
      CreateActionOptions createActionOptions = new CreateActionOptions.Builder()
        .build();

      Response<ActionList> response = service.createAction(createActionOptions).execute();
      ActionList actionList = response.getResult();

      System.out.println(actionList);
      // end-create_action
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_action
      GetActionOptions getActionOptions = new GetActionOptions.Builder()
        .actionId("testString")
        .build();

      Response<Action> response = service.getAction(getActionOptions).execute();
      Action action = response.getResult();

      System.out.println(action);
      // end-get_action
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_action
      UpdateActionOptions updateActionOptions = new UpdateActionOptions.Builder()
        .actionId("testString")
        .build();

      Response<Action> response = service.updateAction(updateActionOptions).execute();
      Action action = response.getResult();

      System.out.println(action);
      // end-update_action
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-upload_template_tar_action
      UploadTemplateTarActionOptions uploadTemplateTarActionOptions = new UploadTemplateTarActionOptions.Builder()
        .actionId("testString")
        .build();

      Response<TemplateRepoTarUploadResponse> response = service.uploadTemplateTarAction(uploadTemplateTarActionOptions).execute();
      TemplateRepoTarUploadResponse templateRepoTarUploadResponse = response.getResult();

      System.out.println(templateRepoTarUploadResponse);
      // end-upload_template_tar_action
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_workspace_activities
      ListWorkspaceActivitiesOptions listWorkspaceActivitiesOptions = new ListWorkspaceActivitiesOptions.Builder()
        .wId("testString")
        .build();

      Response<WorkspaceActivities> response = service.listWorkspaceActivities(listWorkspaceActivitiesOptions).execute();
      WorkspaceActivities workspaceActivities = response.getResult();

      System.out.println(workspaceActivities);
      // end-list_workspace_activities
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace_activity
      GetWorkspaceActivityOptions getWorkspaceActivityOptions = new GetWorkspaceActivityOptions.Builder()
        .wId("testString")
        .activityId("testString")
        .build();

      Response<WorkspaceActivity> response = service.getWorkspaceActivity(getWorkspaceActivityOptions).execute();
      WorkspaceActivity workspaceActivity = response.getResult();

      System.out.println(workspaceActivity);
      // end-get_workspace_activity
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-run_workspace_commands
      RunWorkspaceCommandsOptions runWorkspaceCommandsOptions = new RunWorkspaceCommandsOptions.Builder()
        .wId("testString")
        .refreshToken("testString")
        .build();

      Response<WorkspaceActivityCommandResult> response = service.runWorkspaceCommands(runWorkspaceCommandsOptions).execute();
      WorkspaceActivityCommandResult workspaceActivityCommandResult = response.getResult();

      System.out.println(workspaceActivityCommandResult);
      // end-run_workspace_commands
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-apply_workspace_command
      ApplyWorkspaceCommandOptions applyWorkspaceCommandOptions = new ApplyWorkspaceCommandOptions.Builder()
        .wId("testString")
        .refreshToken("testString")
        .build();

      Response<WorkspaceActivityApplyResult> response = service.applyWorkspaceCommand(applyWorkspaceCommandOptions).execute();
      WorkspaceActivityApplyResult workspaceActivityApplyResult = response.getResult();

      System.out.println(workspaceActivityApplyResult);
      // end-apply_workspace_command
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-destroy_workspace_command
      DestroyWorkspaceCommandOptions destroyWorkspaceCommandOptions = new DestroyWorkspaceCommandOptions.Builder()
        .wId("testString")
        .refreshToken("testString")
        .build();

      Response<WorkspaceActivityDestroyResult> response = service.destroyWorkspaceCommand(destroyWorkspaceCommandOptions).execute();
      WorkspaceActivityDestroyResult workspaceActivityDestroyResult = response.getResult();

      System.out.println(workspaceActivityDestroyResult);
      // end-destroy_workspace_command
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-plan_workspace_command
      PlanWorkspaceCommandOptions planWorkspaceCommandOptions = new PlanWorkspaceCommandOptions.Builder()
        .wId("testString")
        .refreshToken("testString")
        .build();

      Response<WorkspaceActivityPlanResult> response = service.planWorkspaceCommand(planWorkspaceCommandOptions).execute();
      WorkspaceActivityPlanResult workspaceActivityPlanResult = response.getResult();

      System.out.println(workspaceActivityPlanResult);
      // end-plan_workspace_command
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-refresh_workspace_command
      RefreshWorkspaceCommandOptions refreshWorkspaceCommandOptions = new RefreshWorkspaceCommandOptions.Builder()
        .wId("testString")
        .refreshToken("testString")
        .build();

      Response<WorkspaceActivityRefreshResult> response = service.refreshWorkspaceCommand(refreshWorkspaceCommandOptions).execute();
      WorkspaceActivityRefreshResult workspaceActivityRefreshResult = response.getResult();

      System.out.println(workspaceActivityRefreshResult);
      // end-refresh_workspace_command
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_jobs
      ListJobsOptions listJobsOptions = new ListJobsOptions.Builder()
        .build();

      Response<JobList> response = service.listJobs(listJobsOptions).execute();
      JobList jobList = response.getResult();

      System.out.println(jobList);
      // end-list_jobs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_job
      CreateJobOptions createJobOptions = new CreateJobOptions.Builder()
        .refreshToken("testString")
        .build();

      Response<Job> response = service.createJob(createJobOptions).execute();
      Job job = response.getResult();

      System.out.println(job);
      // end-create_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_job
      GetJobOptions getJobOptions = new GetJobOptions.Builder()
        .jobId("testString")
        .build();

      Response<Job> response = service.getJob(getJobOptions).execute();
      Job job = response.getResult();

      System.out.println(job);
      // end-get_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_job
      UpdateJobOptions updateJobOptions = new UpdateJobOptions.Builder()
        .jobId("testString")
        .refreshToken("testString")
        .build();

      Response<Job> response = service.updateJob(updateJobOptions).execute();
      Job job = response.getResult();

      System.out.println(job);
      // end-update_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_job_logs
      ListJobLogsOptions listJobLogsOptions = new ListJobLogsOptions.Builder()
        .jobId("testString")
        .build();

      Response<JobLog> response = service.listJobLogs(listJobLogsOptions).execute();
      JobLog jobLog = response.getResult();

      System.out.println(jobLog);
      // end-list_job_logs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_workspace_deletion_job
      CreateWorkspaceDeletionJobOptions createWorkspaceDeletionJobOptions = new CreateWorkspaceDeletionJobOptions.Builder()
        .refreshToken("testString")
        .build();

      Response<WorkspaceBulkDeleteResponse> response = service.createWorkspaceDeletionJob(createWorkspaceDeletionJobOptions).execute();
      WorkspaceBulkDeleteResponse workspaceBulkDeleteResponse = response.getResult();

      System.out.println(workspaceBulkDeleteResponse);
      // end-create_workspace_deletion_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace_deletion_job_status
      GetWorkspaceDeletionJobStatusOptions getWorkspaceDeletionJobStatusOptions = new GetWorkspaceDeletionJobStatusOptions.Builder()
        .wjId("testString")
        .build();

      Response<WorkspaceJobResponse> response = service.getWorkspaceDeletionJobStatus(getWorkspaceDeletionJobStatusOptions).execute();
      WorkspaceJobResponse workspaceJobResponse = response.getResult();

      System.out.println(workspaceJobResponse);
      // end-get_workspace_deletion_job_status
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_inventories
      ListInventoriesOptions listInventoriesOptions = new ListInventoriesOptions.Builder()
        .build();

      Response<InventoryResourceRecordList> response = service.listInventories(listInventoriesOptions).execute();
      InventoryResourceRecordList inventoryResourceRecordList = response.getResult();

      System.out.println(inventoryResourceRecordList);
      // end-list_inventories
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_inventory
      CreateInventoryOptions createInventoryOptions = new CreateInventoryOptions.Builder()
        .build();

      Response<InventoryResourceRecord> response = service.createInventory(createInventoryOptions).execute();
      InventoryResourceRecord inventoryResourceRecord = response.getResult();

      System.out.println(inventoryResourceRecord);
      // end-create_inventory
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_inventory
      GetInventoryOptions getInventoryOptions = new GetInventoryOptions.Builder()
        .inventoryId("testString")
        .build();

      Response<InventoryResourceRecord> response = service.getInventory(getInventoryOptions).execute();
      InventoryResourceRecord inventoryResourceRecord = response.getResult();

      System.out.println(inventoryResourceRecord);
      // end-get_inventory
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_inventory
      ReplaceInventoryOptions replaceInventoryOptions = new ReplaceInventoryOptions.Builder()
        .inventoryId("testString")
        .build();

      Response<InventoryResourceRecord> response = service.replaceInventory(replaceInventoryOptions).execute();
      InventoryResourceRecord inventoryResourceRecord = response.getResult();

      System.out.println(inventoryResourceRecord);
      // end-replace_inventory
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_inventory
      UpdateInventoryOptions updateInventoryOptions = new UpdateInventoryOptions.Builder()
        .inventoryId("testString")
        .build();

      Response<InventoryResourceRecord> response = service.updateInventory(updateInventoryOptions).execute();
      InventoryResourceRecord inventoryResourceRecord = response.getResult();

      System.out.println(inventoryResourceRecord);
      // end-update_inventory
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_inventory_values
      ListInventoryValuesOptions listInventoryValuesOptions = new ListInventoryValuesOptions.Builder()
        .inventoryId("testString")
        .build();

      Response<InventoryResourceRecordList> response = service.listInventoryValues(listInventoryValuesOptions).execute();
      InventoryResourceRecordList inventoryResourceRecordList = response.getResult();

      System.out.println(inventoryResourceRecordList);
      // end-list_inventory_values
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_inventory_value
      GetInventoryValueOptions getInventoryValueOptions = new GetInventoryValueOptions.Builder()
        .inventoryId("testString")
        .varName("testString")
        .build();

      Response<InventoryResourceRecord> response = service.getInventoryValue(getInventoryValueOptions).execute();
      InventoryResourceRecord inventoryResourceRecord = response.getResult();

      System.out.println(inventoryResourceRecord);
      // end-get_inventory_value
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_resource_query
      ListResourceQueryOptions listResourceQueryOptions = new ListResourceQueryOptions.Builder()
        .build();

      Response<ResourceQueryRecordList> response = service.listResourceQuery(listResourceQueryOptions).execute();
      ResourceQueryRecordList resourceQueryRecordList = response.getResult();

      System.out.println(resourceQueryRecordList);
      // end-list_resource_query
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_resource_query
      CreateResourceQueryOptions createResourceQueryOptions = new CreateResourceQueryOptions.Builder()
        .build();

      Response<ResourceQueryRecord> response = service.createResourceQuery(createResourceQueryOptions).execute();
      ResourceQueryRecord resourceQueryRecord = response.getResult();

      System.out.println(resourceQueryRecord);
      // end-create_resource_query
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_resources_query
      GetResourcesQueryOptions getResourcesQueryOptions = new GetResourcesQueryOptions.Builder()
        .queryId("testString")
        .build();

      Response<ResourceQueryRecord> response = service.getResourcesQuery(getResourcesQueryOptions).execute();
      ResourceQueryRecord resourceQueryRecord = response.getResult();

      System.out.println(resourceQueryRecord);
      // end-get_resources_query
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_resources_query
      ReplaceResourcesQueryOptions replaceResourcesQueryOptions = new ReplaceResourcesQueryOptions.Builder()
        .queryId("testString")
        .build();

      Response<ResourceQueryRecord> response = service.replaceResourcesQuery(replaceResourcesQueryOptions).execute();
      ResourceQueryRecord resourceQueryRecord = response.getResult();

      System.out.println(resourceQueryRecord);
      // end-replace_resources_query
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-execute_resource_query
      ExecuteResourceQueryOptions executeResourceQueryOptions = new ExecuteResourceQueryOptions.Builder()
        .queryId("testString")
        .build();

      Response<ResourceQueryResponseRecord> response = service.executeResourceQuery(executeResourceQueryOptions).execute();
      ResourceQueryResponseRecord resourceQueryResponseRecord = response.getResult();

      System.out.println(resourceQueryResponseRecord);
      // end-execute_resource_query
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_kms_settings
      GetKmsSettingsOptions getKmsSettingsOptions = new GetKmsSettingsOptions.Builder()
        .location("testString")
        .build();

      Response<KMSSettings> response = service.getKmsSettings(getKmsSettingsOptions).execute();
      KMSSettings kmsSettings = response.getResult();

      System.out.println(kmsSettings);
      // end-get_kms_settings
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_kms_settings
      UpdateKmsSettingsOptions updateKmsSettingsOptions = new UpdateKmsSettingsOptions.Builder()
        .build();

      Response<KMSSettings> response = service.updateKmsSettings(updateKmsSettingsOptions).execute();
      KMSSettings kmsSettings = response.getResult();

      System.out.println(kmsSettings);
      // end-update_kms_settings
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_kms
      ListKmsOptions listKmsOptions = new ListKmsOptions.Builder()
        .encryptionScheme("testString")
        .location("testString")
        .build();

      Response<KMSDiscovery> response = service.listKms(listKmsOptions).execute();
      KMSDiscovery kmsDiscovery = response.getResult();

      System.out.println(kmsDiscovery);
      // end-list_kms
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_workspace_activity
      DeleteWorkspaceActivityOptions deleteWorkspaceActivityOptions = new DeleteWorkspaceActivityOptions.Builder()
        .wId("testString")
        .activityId("testString")
        .build();

      Response<WorkspaceActivityApplyResult> response = service.deleteWorkspaceActivity(deleteWorkspaceActivityOptions).execute();
      WorkspaceActivityApplyResult workspaceActivityApplyResult = response.getResult();

      System.out.println(workspaceActivityApplyResult);
      // end-delete_workspace_activity
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_workspace
      DeleteWorkspaceOptions deleteWorkspaceOptions = new DeleteWorkspaceOptions.Builder()
        .wId("testString")
        .build();

      Response<String> response = service.deleteWorkspace(deleteWorkspaceOptions).execute();
      String workspaceDeleteResponse = response.getResult();

      System.out.println(workspaceDeleteResponse);
      // end-delete_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_resources_query
      DeleteResourcesQueryOptions deleteResourcesQueryOptions = new DeleteResourcesQueryOptions.Builder()
        .queryId("testString")
        .build();

      service.deleteResourcesQuery(deleteResourcesQueryOptions).execute();
      // end-delete_resources_query
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_job
      DeleteJobOptions deleteJobOptions = new DeleteJobOptions.Builder()
        .jobId("testString")
        .refreshToken("testString")
        .build();

      service.deleteJob(deleteJobOptions).execute();
      // end-delete_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_inventory
      DeleteInventoryOptions deleteInventoryOptions = new DeleteInventoryOptions.Builder()
        .inventoryId("testString")
        .build();

      service.deleteInventory(deleteInventoryOptions).execute();
      // end-delete_inventory
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_action
      DeleteActionOptions deleteActionOptions = new DeleteActionOptions.Builder()
        .actionId("testString")
        .build();

      service.deleteAction(deleteActionOptions).execute();
      // end-delete_action
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

  }
}
