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

package com.ibm.cloud.schematics_2_0_api.v2;

import com.ibm.cloud.schematics_2_0_api.v2.model.Action;
import com.ibm.cloud.schematics_2_0_api.v2.model.ActionList;
import com.ibm.cloud.schematics_2_0_api.v2.model.Adapter;
import com.ibm.cloud.schematics_2_0_api.v2.model.AdapterList;
import com.ibm.cloud.schematics_2_0_api.v2.model.AddFlowToWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.AddTemplatesToWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.Capsule;
import com.ibm.cloud.schematics_2_0_api.v2.model.CapsuleList;
import com.ibm.cloud.schematics_2_0_api.v2.model.CartOrder;
import com.ibm.cloud.schematics_2_0_api.v2.model.CartOrderList;
import com.ibm.cloud.schematics_2_0_api.v2.model.CloudResourceList;
import com.ibm.cloud.schematics_2_0_api.v2.model.CommandList;
import com.ibm.cloud.schematics_2_0_api.v2.model.Connection;
import com.ibm.cloud.schematics_2_0_api.v2.model.ConnectionList;
import com.ibm.cloud.schematics_2_0_api.v2.model.Controls;
import com.ibm.cloud.schematics_2_0_api.v2.model.ControlsList;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateActionOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateAdapterOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateCapsuleOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateCartOrderOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateConnectionOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateControlsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateCredentialOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateDatasetOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateDatasourceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateEnvironmentOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateInventoryOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateJobOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreatePrivateClusterOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateResourceQueryOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateTriggerOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateWebhookOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.CreateWorkspaceTemplatesOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.CredentialList;
import com.ibm.cloud.schematics_2_0_api.v2.model.Credentialset;
import com.ibm.cloud.schematics_2_0_api.v2.model.Dataset;
import com.ibm.cloud.schematics_2_0_api.v2.model.DatasetList;
import com.ibm.cloud.schematics_2_0_api.v2.model.Datasource;
import com.ibm.cloud.schematics_2_0_api.v2.model.DatasourceList;
import com.ibm.cloud.schematics_2_0_api.v2.model.DeleteActionOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.DeleteAdapterOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.DeleteCapsuleOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.DeleteCartOrderOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.DeleteControlsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.DeleteCredentialOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.DeleteDatasetOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.DeleteEnvironmentOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.DeleteFlowFromWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.DeleteInventoryOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.DeleteJobOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.DeletePrivateClusterOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.DeleteResourcesQueryOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.DeleteTemplateFromWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.DeleteTriggerOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.DeleteWebhookOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.DeleteWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.Environment;
import com.ibm.cloud.schematics_2_0_api.v2.model.EnvironmentCatalogOfferingItem;
import com.ibm.cloud.schematics_2_0_api.v2.model.EnvironmentList;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExecuteResourceQueryOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSource;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetActionOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetAdapterOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetCapsuleOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetCartMetadataOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetCartOrderJobLogOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetCartOrderJobOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetCartOrderJobResourcesOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetCartOrderOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetControlsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetCredentialOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetCredentialValueOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetCredentialVariableValueOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetDatasetOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetDatasetVariableOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetDatasetVariableValueOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetEnvironmentDefinitionOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetEnvironmentOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetFlowInWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetInventoryOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetInventoryVariableValueOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetJobOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetJobWorkspaceInputValueOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetJobWorkspaceOutputValueOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetJobWorkspaceSettingValueOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetKmsSettingsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetPrivateClusterOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetResourcesQueryOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetSchematicsAccessRulesForResourceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetSchematicsCommandNamesOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetSchematicsInfoOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetTemplateInWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetTemplateReadmeOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetTemplateSourceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetTriggerOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetWebhookOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetWorkspaceInputValueOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetWorkspaceOutputValueOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetWorkspaceSettingsValueOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetWorkspaceTemplateInputValueOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetWorkspaceTemplateOutputValueOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.GetWorkspaceTemplateSettingValueOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.InputVariableDataList;
import com.ibm.cloud.schematics_2_0_api.v2.model.InventoryResourceDefinition;
import com.ibm.cloud.schematics_2_0_api.v2.model.InventoryResourceRecord;
import com.ibm.cloud.schematics_2_0_api.v2.model.InventoryResourceRecordList;
import com.ibm.cloud.schematics_2_0_api.v2.model.ItemMetadata;
import com.ibm.cloud.schematics_2_0_api.v2.model.Job;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobList;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLite;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLog;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStateData;
import com.ibm.cloud.schematics_2_0_api.v2.model.KMSDiscovery;
import com.ibm.cloud.schematics_2_0_api.v2.model.KMSSettings;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListActionsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListAdapterOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListCapsulesOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListCartOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListCartOrderJobsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListCartResourcesOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListConnectionOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListControlsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListCredentialValuesOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListCredentialsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListDatasetVariablesOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListDatasetsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListDatasourcesOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListEnvironmentDefinitionsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListEnvironmentOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListEnvironmentResourcesOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListEnvironmentWorkspacesOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListFlowsInWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListInventoriesOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListJobLogsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListJobStatesOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListJobsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListKmsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListLocationsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListResourceQueryOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListSchematicsAccessRulesOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListTemplateInputsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListTemplateOutputsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListTemplatesInWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListTriggersOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListWebhookOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListWorkspaceInputsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListWorkspaceOutputsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ListWorkspacesOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.OutputVariableDataList;
import com.ibm.cloud.schematics_2_0_api.v2.model.PrivateCluster;
import com.ibm.cloud.schematics_2_0_api.v2.model.PrivateClusterList;
import com.ibm.cloud.schematics_2_0_api.v2.model.ProcessTemplateMetaDataOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ReplaceAdapterOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ReplaceCartOrderOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ReplaceCredentialOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ReplaceDatasetOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ReplaceEnvironmentOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ReplaceFlowInWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ReplaceInventoryOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ReplaceResourcesQueryOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ReplaceTemplateInWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ReplaceTriggerOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ReplaceWebhookOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ReplaceWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ResourceQueryDefinition;
import com.ibm.cloud.schematics_2_0_api.v2.model.ResourceQueryRecord;
import com.ibm.cloud.schematics_2_0_api.v2.model.ResourceQueryRecordList;
import com.ibm.cloud.schematics_2_0_api.v2.model.ResourceQueryResponseRecord;
import com.ibm.cloud.schematics_2_0_api.v2.model.RunFulfilmentOperationOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.SchematicsAccessRuleList;
import com.ibm.cloud.schematics_2_0_api.v2.model.SchematicsInfo;
import com.ibm.cloud.schematics_2_0_api.v2.model.SchematicsLocationsList;
import com.ibm.cloud.schematics_2_0_api.v2.model.Template;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlow;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlowList;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateList;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateListRequest;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateMetaDataRequest;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateMetaDataResponse;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateRepoTarUploadResponse;
import com.ibm.cloud.schematics_2_0_api.v2.model.Trigger;
import com.ibm.cloud.schematics_2_0_api.v2.model.TriggerList;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateActionOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateAtasetOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateCapsuleOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateCartOrder;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateCartOrderOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateControlsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateCredentialOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateEnvironmentOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateFlowInWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateInventoryOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateJobOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateKmsSettingsOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateTemplateInWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UploadTemplateTarActionOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UploadTemplateTarInWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ValueListResponse;
import com.ibm.cloud.schematics_2_0_api.v2.model.ValueResponse;
import com.ibm.cloud.schematics_2_0_api.v2.model.VariableData;
import com.ibm.cloud.schematics_2_0_api.v2.model.VariableDataList;
import com.ibm.cloud.schematics_2_0_api.v2.model.WebHook;
import com.ibm.cloud.schematics_2_0_api.v2.model.WebHookList;
import com.ibm.cloud.schematics_2_0_api.v2.model.Workspace;
import com.ibm.cloud.schematics_2_0_api.v2.model.WorkspaceList;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Schematics20ApiExamples {
  private static final Logger logger = LoggerFactory.getLogger(Schematics20ApiExamples.class);
  protected Schematics20ApiExamples() { }

  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    Schematics20Api service = Schematics20Api.newInstance();

    // Load up our test-specific config properties.
    Map<String, String> config = CredentialUtils.getServiceProperties(Schematics20Api.DEFAULT_SERVICE_NAME);

    try {
      // begin-get_schematics_info
      GetSchematicsInfoOptions getSchematicsInfoOptions = new GetSchematicsInfoOptions();

      Response<SchematicsInfo> response = service.getSchematicsInfo(getSchematicsInfoOptions).execute();
      SchematicsInfo schematicsInfo = response.getResult();

      System.out.println(schematicsInfo);
      // end-get_schematics_info
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_schematics_access_rules
      ListSchematicsAccessRulesOptions listSchematicsAccessRulesOptions = new ListSchematicsAccessRulesOptions();

      Response<SchematicsAccessRuleList> response = service.listSchematicsAccessRules(listSchematicsAccessRulesOptions).execute();
      SchematicsAccessRuleList schematicsAccessRuleList = response.getResult();

      System.out.println(schematicsAccessRuleList);
      // end-list_schematics_access_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_schematics_access_rules_for_resource
      GetSchematicsAccessRulesForResourceOptions getSchematicsAccessRulesForResourceOptions = new GetSchematicsAccessRulesForResourceOptions.Builder()
        .resourceName("testString")
        .build();

      Response<SchematicsAccessRuleList> response = service.getSchematicsAccessRulesForResource(getSchematicsAccessRulesForResourceOptions).execute();
      SchematicsAccessRuleList schematicsAccessRuleList = response.getResult();

      System.out.println(schematicsAccessRuleList);
      // end-get_schematics_access_rules_for_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_schematics_command_names
      GetSchematicsCommandNamesOptions getSchematicsCommandNamesOptions = new GetSchematicsCommandNamesOptions.Builder()
        .resourceName("testString")
        .build();

      Response<CommandList> response = service.getSchematicsCommandNames(getSchematicsCommandNamesOptions).execute();
      CommandList commandList = response.getResult();

      System.out.println(commandList);
      // end-get_schematics_command_names
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_workspaces
      ListWorkspacesOptions listWorkspacesOptions = new ListWorkspacesOptions.Builder()
        .build();

      Response<WorkspaceList> response = service.listWorkspaces(listWorkspacesOptions).execute();
      WorkspaceList workspaceList = response.getResult();

      System.out.println(workspaceList);
      // end-list_workspaces
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_workspace
      Workspace workspaceModel = new Workspace.Builder()
        .name("My Workspace")
        .resourceGroup("testString")
        .location("us-south")
        .add("foo", "testString")
        .build();
      CreateWorkspaceOptions createWorkspaceOptions = new CreateWorkspaceOptions.Builder()
        .workspace(workspaceModel)
        .build();

      Response<Workspace> response = service.createWorkspace(createWorkspaceOptions).execute();
      Workspace workspace = response.getResult();

      System.out.println(workspace);
      // end-create_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace
      GetWorkspaceOptions getWorkspaceOptions = new GetWorkspaceOptions.Builder()
        .workspaceId("testString")
        .build();

      Response<Workspace> response = service.getWorkspace(getWorkspaceOptions).execute();
      Workspace workspace = response.getResult();

      System.out.println(workspace);
      // end-get_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_workspace
      Workspace workspaceModel = new Workspace.Builder()
        .name("My Workspace")
        .resourceGroup("testString")
        .location("us-south")
        .add("foo", "testString")
        .build();
      ReplaceWorkspaceOptions replaceWorkspaceOptions = new ReplaceWorkspaceOptions.Builder()
        .workspaceId("testString")
        .workspace(workspaceModel)
        .build();

      Response<Workspace> response = service.replaceWorkspace(replaceWorkspaceOptions).execute();
      Workspace workspace = response.getResult();

      System.out.println(workspace);
      // end-replace_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_workspace
      Workspace workspaceModel = new Workspace.Builder()
        .name("My Workspace")
        .resourceGroup("testString")
        .location("us-south")
        .add("foo", "testString")
        .build();
      UpdateWorkspaceOptions updateWorkspaceOptions = new UpdateWorkspaceOptions.Builder()
        .workspaceId("testString")
        .workspace(workspaceModel)
        .build();

      Response<Workspace> response = service.updateWorkspace(updateWorkspaceOptions).execute();
      Workspace workspace = response.getResult();

      System.out.println(workspace);
      // end-update_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_workspace_inputs
      ListWorkspaceInputsOptions listWorkspaceInputsOptions = new ListWorkspaceInputsOptions.Builder()
        .workspaceId("testString")
        .build();

      Response<InputVariableDataList> response = service.listWorkspaceInputs(listWorkspaceInputsOptions).execute();
      InputVariableDataList inputVariableDataList = response.getResult();

      System.out.println(inputVariableDataList);
      // end-list_workspace_inputs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_workspace_outputs
      ListWorkspaceOutputsOptions listWorkspaceOutputsOptions = new ListWorkspaceOutputsOptions.Builder()
        .workspaceId("testString")
        .build();

      Response<OutputVariableDataList> response = service.listWorkspaceOutputs(listWorkspaceOutputsOptions).execute();
      OutputVariableDataList outputVariableDataList = response.getResult();

      System.out.println(outputVariableDataList);
      // end-list_workspace_outputs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_workspace_templates
      TemplateListRequest templateListRequestModel = new TemplateListRequest.Builder()
        .add("foo", "testString")
        .build();
      CreateWorkspaceTemplatesOptions createWorkspaceTemplatesOptions = new CreateWorkspaceTemplatesOptions.Builder()
        .templateListRequest(templateListRequestModel)
        .build();

      Response<Workspace> response = service.createWorkspaceTemplates(createWorkspaceTemplatesOptions).execute();
      Workspace workspace = response.getResult();

      System.out.println(workspace);
      // end-create_workspace_templates
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_templates_in_workspace
      ListTemplatesInWorkspaceOptions listTemplatesInWorkspaceOptions = new ListTemplatesInWorkspaceOptions.Builder()
        .workspaceId("testString")
        .build();

      Response<TemplateList> response = service.listTemplatesInWorkspace(listTemplatesInWorkspaceOptions).execute();
      TemplateList templateList = response.getResult();

      System.out.println(templateList);
      // end-list_templates_in_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-add_templates_to_workspace
      Template templateModel = new Template.Builder()
        .add("foo", "testString")
        .build();
      AddTemplatesToWorkspaceOptions addTemplatesToWorkspaceOptions = new AddTemplatesToWorkspaceOptions.Builder()
        .workspaceId("testString")
        .template(templateModel)
        .build();

      Response<Template> response = service.addTemplatesToWorkspace(addTemplatesToWorkspaceOptions).execute();
      Template template = response.getResult();

      System.out.println(template);
      // end-add_templates_to_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_template_in_workspace
      GetTemplateInWorkspaceOptions getTemplateInWorkspaceOptions = new GetTemplateInWorkspaceOptions.Builder()
        .workspaceId("testString")
        .templateId("testString")
        .build();

      Response<Template> response = service.getTemplateInWorkspace(getTemplateInWorkspaceOptions).execute();
      Template template = response.getResult();

      System.out.println(template);
      // end-get_template_in_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_template_in_workspace
      ReplaceTemplateInWorkspaceOptions replaceTemplateInWorkspaceOptions = new ReplaceTemplateInWorkspaceOptions.Builder()
        .workspaceId("testString")
        .templateId("testString")
        .build();

      Response<Template> response = service.replaceTemplateInWorkspace(replaceTemplateInWorkspaceOptions).execute();
      Template template = response.getResult();

      System.out.println(template);
      // end-replace_template_in_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_template_in_workspace
      UpdateTemplateInWorkspaceOptions updateTemplateInWorkspaceOptions = new UpdateTemplateInWorkspaceOptions.Builder()
        .workspaceId("testString")
        .templateId("testString")
        .build();

      Response<Template> response = service.updateTemplateInWorkspace(updateTemplateInWorkspaceOptions).execute();
      Template template = response.getResult();

      System.out.println(template);
      // end-update_template_in_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-upload_template_tar_in_workspace
      UploadTemplateTarInWorkspaceOptions uploadTemplateTarInWorkspaceOptions = new UploadTemplateTarInWorkspaceOptions.Builder()
        .workspaceId("testString")
        .templateId("testString")
        .build();

      Response<Template> response = service.uploadTemplateTarInWorkspace(uploadTemplateTarInWorkspaceOptions).execute();
      Template template = response.getResult();

      System.out.println(template);
      // end-upload_template_tar_in_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_template_readme
      GetTemplateReadmeOptions getTemplateReadmeOptions = new GetTemplateReadmeOptions.Builder()
        .workspaceId("testString")
        .templateId("testString")
        .build();

      Response<String> response = service.getTemplateReadme(getTemplateReadmeOptions).execute();
      String result = response.getResult();

      System.out.println(result);
      // end-get_template_readme
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_template_source
      GetTemplateSourceOptions getTemplateSourceOptions = new GetTemplateSourceOptions.Builder()
        .workspaceId("testString")
        .templateId("testString")
        .build();

      Response<ExternalSource> response = service.getTemplateSource(getTemplateSourceOptions).execute();
      ExternalSource externalSource = response.getResult();

      System.out.println(externalSource);
      // end-get_template_source
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_template_inputs
      ListTemplateInputsOptions listTemplateInputsOptions = new ListTemplateInputsOptions.Builder()
        .workspaceId("testString")
        .templateId("testString")
        .build();

      Response<VariableDataList> response = service.listTemplateInputs(listTemplateInputsOptions).execute();
      VariableDataList variableDataList = response.getResult();

      System.out.println(variableDataList);
      // end-list_template_inputs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_template_outputs
      ListTemplateOutputsOptions listTemplateOutputsOptions = new ListTemplateOutputsOptions.Builder()
        .workspaceId("testString")
        .templateId("testString")
        .build();

      Response<VariableDataList> response = service.listTemplateOutputs(listTemplateOutputsOptions).execute();
      VariableDataList variableDataList = response.getResult();

      System.out.println(variableDataList);
      // end-list_template_outputs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_flows_in_workspace
      ListFlowsInWorkspaceOptions listFlowsInWorkspaceOptions = new ListFlowsInWorkspaceOptions.Builder()
        .workspaceId("testString")
        .build();

      Response<TemplateFlowList> response = service.listFlowsInWorkspace(listFlowsInWorkspaceOptions).execute();
      TemplateFlowList templateFlowList = response.getResult();

      System.out.println(templateFlowList);
      // end-list_flows_in_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-add_flow_to_workspace
      TemplateFlow templateFlowModel = new TemplateFlow.Builder()
        .add("foo", "testString")
        .build();
      AddFlowToWorkspaceOptions addFlowToWorkspaceOptions = new AddFlowToWorkspaceOptions.Builder()
        .workspaceId("testString")
        .templateFlow(templateFlowModel)
        .build();

      Response<TemplateFlow> response = service.addFlowToWorkspace(addFlowToWorkspaceOptions).execute();
      TemplateFlow templateFlow = response.getResult();

      System.out.println(templateFlow);
      // end-add_flow_to_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_flow_in_workspace
      GetFlowInWorkspaceOptions getFlowInWorkspaceOptions = new GetFlowInWorkspaceOptions.Builder()
        .workspaceId("testString")
        .flowId("testString")
        .build();

      Response<TemplateFlow> response = service.getFlowInWorkspace(getFlowInWorkspaceOptions).execute();
      TemplateFlow templateFlow = response.getResult();

      System.out.println(templateFlow);
      // end-get_flow_in_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_flow_in_workspace
      ReplaceFlowInWorkspaceOptions replaceFlowInWorkspaceOptions = new ReplaceFlowInWorkspaceOptions.Builder()
        .workspaceId("testString")
        .flowId("testString")
        .build();

      Response<TemplateFlow> response = service.replaceFlowInWorkspace(replaceFlowInWorkspaceOptions).execute();
      TemplateFlow templateFlow = response.getResult();

      System.out.println(templateFlow);
      // end-replace_flow_in_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_flow_in_workspace
      UpdateFlowInWorkspaceOptions updateFlowInWorkspaceOptions = new UpdateFlowInWorkspaceOptions.Builder()
        .workspaceId("testString")
        .flowId("testString")
        .build();

      Response<TemplateFlow> response = service.updateFlowInWorkspace(updateFlowInWorkspaceOptions).execute();
      TemplateFlow templateFlow = response.getResult();

      System.out.println(templateFlow);
      // end-update_flow_in_workspace
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
      Action actionModel = new Action.Builder()
        .add("foo", "testString")
        .build();
      CreateActionOptions createActionOptions = new CreateActionOptions.Builder()
        .action(actionModel)
        .build();

      Response<Action> response = service.createAction(createActionOptions).execute();
      Action action = response.getResult();

      System.out.println(action);
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
      Action actionModel = new Action.Builder()
        .add("foo", "testString")
        .build();
      UpdateActionOptions updateActionOptions = new UpdateActionOptions.Builder()
        .actionId("testString")
        .action(actionModel)
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
      Job jobModel = new Job.Builder()
        .add("foo", "testString")
        .build();
      CreateJobOptions createJobOptions = new CreateJobOptions.Builder()
        .refreshToken("testString")
        .job(jobModel)
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
      Job jobModel = new Job.Builder()
        .add("foo", "testString")
        .build();
      UpdateJobOptions updateJobOptions = new UpdateJobOptions.Builder()
        .jobId("testString")
        .refreshToken("testString")
        .job(jobModel)
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
      // begin-list_job_states
      ListJobStatesOptions listJobStatesOptions = new ListJobStatesOptions.Builder()
        .jobId("testString")
        .build();

      Response<JobStateData> response = service.listJobStates(listJobStatesOptions).execute();
      JobStateData jobStateData = response.getResult();

      System.out.println(jobStateData);
      // end-list_job_states
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_controls
      ListControlsOptions listControlsOptions = new ListControlsOptions.Builder()
        .build();

      Response<ControlsList> response = service.listControls(listControlsOptions).execute();
      ControlsList controlsList = response.getResult();

      System.out.println(controlsList);
      // end-list_controls
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_controls
      Controls controlsModel = new Controls.Builder()
        .add("foo", "testString")
        .build();
      CreateControlsOptions createControlsOptions = new CreateControlsOptions.Builder()
        .controls(controlsModel)
        .build();

      Response<Controls> response = service.createControls(createControlsOptions).execute();
      Controls controls = response.getResult();

      System.out.println(controls);
      // end-create_controls
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_controls
      GetControlsOptions getControlsOptions = new GetControlsOptions.Builder()
        .controlsId("testString")
        .build();

      Response<Controls> response = service.getControls(getControlsOptions).execute();
      Controls controls = response.getResult();

      System.out.println(controls);
      // end-get_controls
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_controls
      Controls controlsModel = new Controls.Builder()
        .add("foo", "testString")
        .build();
      UpdateControlsOptions updateControlsOptions = new UpdateControlsOptions.Builder()
        .controlsId("testString")
        .controls(controlsModel)
        .build();

      Response<Controls> response = service.updateControls(updateControlsOptions).execute();
      Controls controls = response.getResult();

      System.out.println(controls);
      // end-update_controls
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_capsules
      ListCapsulesOptions listCapsulesOptions = new ListCapsulesOptions.Builder()
        .controlsId("testString")
        .build();

      Response<CapsuleList> response = service.listCapsules(listCapsulesOptions).execute();
      CapsuleList capsuleList = response.getResult();

      System.out.println(capsuleList);
      // end-list_capsules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_capsule
      Capsule capsuleModel = new Capsule.Builder()
        .add("foo", "testString")
        .build();
      CreateCapsuleOptions createCapsuleOptions = new CreateCapsuleOptions.Builder()
        .controlsId("testString")
        .capsule(capsuleModel)
        .build();

      Response<CapsuleList> response = service.createCapsule(createCapsuleOptions).execute();
      CapsuleList capsuleList = response.getResult();

      System.out.println(capsuleList);
      // end-create_capsule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_capsule
      GetCapsuleOptions getCapsuleOptions = new GetCapsuleOptions.Builder()
        .controlsId("testString")
        .capsuleId("testString")
        .build();

      Response<Capsule> response = service.getCapsule(getCapsuleOptions).execute();
      Capsule capsule = response.getResult();

      System.out.println(capsule);
      // end-get_capsule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_capsule
      Capsule capsuleModel = new Capsule.Builder()
        .add("foo", "testString")
        .build();
      UpdateCapsuleOptions updateCapsuleOptions = new UpdateCapsuleOptions.Builder()
        .controlsId("testString")
        .capsuleId("testString")
        .capsule(capsuleModel)
        .build();

      Response<Capsule> response = service.updateCapsule(updateCapsuleOptions).execute();
      Capsule capsule = response.getResult();

      System.out.println(capsule);
      // end-update_capsule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_datasets
      ListDatasetsOptions listDatasetsOptions = new ListDatasetsOptions.Builder()
        .build();

      Response<DatasetList> response = service.listDatasets(listDatasetsOptions).execute();
      DatasetList datasetList = response.getResult();

      System.out.println(datasetList);
      // end-list_datasets
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_dataset
      Dataset datasetModel = new Dataset.Builder()
        .add("foo", "testString")
        .build();
      CreateDatasetOptions createDatasetOptions = new CreateDatasetOptions.Builder()
        .dataset(datasetModel)
        .build();

      Response<Dataset> response = service.createDataset(createDatasetOptions).execute();
      Dataset dataset = response.getResult();

      System.out.println(dataset);
      // end-create_dataset
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_dataset
      GetDatasetOptions getDatasetOptions = new GetDatasetOptions.Builder()
        .datasetId("testString")
        .build();

      Response<Dataset> response = service.getDataset(getDatasetOptions).execute();
      Dataset dataset = response.getResult();

      System.out.println(dataset);
      // end-get_dataset
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_dataset
      Dataset datasetModel = new Dataset.Builder()
        .add("foo", "testString")
        .build();
      ReplaceDatasetOptions replaceDatasetOptions = new ReplaceDatasetOptions.Builder()
        .datasetId("testString")
        .dataset(datasetModel)
        .build();

      Response<Dataset> response = service.replaceDataset(replaceDatasetOptions).execute();
      Dataset dataset = response.getResult();

      System.out.println(dataset);
      // end-replace_dataset
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_ataset
      Dataset datasetModel = new Dataset.Builder()
        .add("foo", "testString")
        .build();
      UpdateAtasetOptions updateAtasetOptions = new UpdateAtasetOptions.Builder()
        .datasetId("testString")
        .dataset(datasetModel)
        .build();

      Response<Dataset> response = service.updateAtaset(updateAtasetOptions).execute();
      Dataset dataset = response.getResult();

      System.out.println(dataset);
      // end-update_ataset
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_dataset_variables
      ListDatasetVariablesOptions listDatasetVariablesOptions = new ListDatasetVariablesOptions.Builder()
        .datasetId("testString")
        .build();

      Response<VariableDataList> response = service.listDatasetVariables(listDatasetVariablesOptions).execute();
      VariableDataList variableDataList = response.getResult();

      System.out.println(variableDataList);
      // end-list_dataset_variables
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_dataset_variable
      GetDatasetVariableOptions getDatasetVariableOptions = new GetDatasetVariableOptions.Builder()
        .datasetId("testString")
        .varName("testString")
        .build();

      Response<VariableData> response = service.getDatasetVariable(getDatasetVariableOptions).execute();
      VariableData variableData = response.getResult();

      System.out.println(variableData);
      // end-get_dataset_variable
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_credentials
      ListCredentialsOptions listCredentialsOptions = new ListCredentialsOptions.Builder()
        .build();

      Response<CredentialList> response = service.listCredentials(listCredentialsOptions).execute();
      CredentialList credentialList = response.getResult();

      System.out.println(credentialList);
      // end-list_credentials
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_credential
      Credentialset credentialsetModel = new Credentialset.Builder()
        .add("foo", "testString")
        .build();
      CreateCredentialOptions createCredentialOptions = new CreateCredentialOptions.Builder()
        .credentialset(credentialsetModel)
        .build();

      Response<Credentialset> response = service.createCredential(createCredentialOptions).execute();
      Credentialset credentialset = response.getResult();

      System.out.println(credentialset);
      // end-create_credential
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_credential
      GetCredentialOptions getCredentialOptions = new GetCredentialOptions.Builder()
        .credsId("testString")
        .build();

      Response<Credentialset> response = service.getCredential(getCredentialOptions).execute();
      Credentialset credentialset = response.getResult();

      System.out.println(credentialset);
      // end-get_credential
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_credential
      Credentialset credentialsetModel = new Credentialset.Builder()
        .add("foo", "testString")
        .build();
      ReplaceCredentialOptions replaceCredentialOptions = new ReplaceCredentialOptions.Builder()
        .credsId("testString")
        .credentialset(credentialsetModel)
        .build();

      Response<Credentialset> response = service.replaceCredential(replaceCredentialOptions).execute();
      Credentialset credentialset = response.getResult();

      System.out.println(credentialset);
      // end-replace_credential
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_credential
      Credentialset credentialsetModel = new Credentialset.Builder()
        .add("foo", "testString")
        .build();
      UpdateCredentialOptions updateCredentialOptions = new UpdateCredentialOptions.Builder()
        .credsId("testString")
        .credentialset(credentialsetModel)
        .build();

      Response<Credentialset> response = service.updateCredential(updateCredentialOptions).execute();
      Credentialset credentialset = response.getResult();

      System.out.println(credentialset);
      // end-update_credential
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_credential_values
      ListCredentialValuesOptions listCredentialValuesOptions = new ListCredentialValuesOptions.Builder()
        .credsId("testString")
        .build();

      Response<VariableDataList> response = service.listCredentialValues(listCredentialValuesOptions).execute();
      VariableDataList variableDataList = response.getResult();

      System.out.println(variableDataList);
      // end-list_credential_values
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_credential_value
      GetCredentialValueOptions getCredentialValueOptions = new GetCredentialValueOptions.Builder()
        .credsId("testString")
        .varName("testString")
        .build();

      Response<VariableData> response = service.getCredentialValue(getCredentialValueOptions).execute();
      VariableData variableData = response.getResult();

      System.out.println(variableData);
      // end-get_credential_value
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
      InventoryResourceDefinition inventoryResourceDefinitionModel = new InventoryResourceDefinition.Builder()
        .add("foo", "testString")
        .build();
      CreateInventoryOptions createInventoryOptions = new CreateInventoryOptions.Builder()
        .inventoryResourceDefinition(inventoryResourceDefinitionModel)
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
      InventoryResourceDefinition inventoryResourceDefinitionModel = new InventoryResourceDefinition.Builder()
        .add("foo", "testString")
        .build();
      ReplaceInventoryOptions replaceInventoryOptions = new ReplaceInventoryOptions.Builder()
        .inventoryId("testString")
        .inventoryResourceDefinition(inventoryResourceDefinitionModel)
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
      InventoryResourceDefinition inventoryResourceDefinitionModel = new InventoryResourceDefinition.Builder()
        .add("foo", "testString")
        .build();
      UpdateInventoryOptions updateInventoryOptions = new UpdateInventoryOptions.Builder()
        .inventoryId("testString")
        .inventoryResourceDefinition(inventoryResourceDefinitionModel)
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
      ResourceQueryDefinition resourceQueryDefinitionModel = new ResourceQueryDefinition.Builder()
        .add("foo", "testString")
        .build();
      CreateResourceQueryOptions createResourceQueryOptions = new CreateResourceQueryOptions.Builder()
        .resourceQueryDefinition(resourceQueryDefinitionModel)
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
      ResourceQueryDefinition resourceQueryDefinitionModel = new ResourceQueryDefinition.Builder()
        .add("foo", "testString")
        .build();
      ReplaceResourcesQueryOptions replaceResourcesQueryOptions = new ReplaceResourcesQueryOptions.Builder()
        .queryId("testString")
        .resourceQueryDefinition(resourceQueryDefinitionModel)
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
      // begin-get_dataset_variable_value
      GetDatasetVariableValueOptions getDatasetVariableValueOptions = new GetDatasetVariableValueOptions.Builder()
        .datasetId("testString")
        .varName("testString")
        .build();

      Response<ValueResponse> response = service.getDatasetVariableValue(getDatasetVariableValueOptions).execute();
      ValueResponse valueResponse = response.getResult();

      System.out.println(valueResponse);
      // end-get_dataset_variable_value
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_credential_variable_value
      GetCredentialVariableValueOptions getCredentialVariableValueOptions = new GetCredentialVariableValueOptions.Builder()
        .credsId("testString")
        .varName("testString")
        .build();

      Response<ValueResponse> response = service.getCredentialVariableValue(getCredentialVariableValueOptions).execute();
      ValueResponse valueResponse = response.getResult();

      System.out.println(valueResponse);
      // end-get_credential_variable_value
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_inventory_variable_value
      GetInventoryVariableValueOptions getInventoryVariableValueOptions = new GetInventoryVariableValueOptions.Builder()
        .inventoryId("testString")
        .varName("testString")
        .build();

      Response<ValueListResponse> response = service.getInventoryVariableValue(getInventoryVariableValueOptions).execute();
      ValueListResponse valueListResponse = response.getResult();

      System.out.println(valueListResponse);
      // end-get_inventory_variable_value
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace_input_value
      GetWorkspaceInputValueOptions getWorkspaceInputValueOptions = new GetWorkspaceInputValueOptions.Builder()
        .workspaceId("testString")
        .varName("testString")
        .build();

      Response<ValueResponse> response = service.getWorkspaceInputValue(getWorkspaceInputValueOptions).execute();
      ValueResponse valueResponse = response.getResult();

      System.out.println(valueResponse);
      // end-get_workspace_input_value
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace_output_value
      GetWorkspaceOutputValueOptions getWorkspaceOutputValueOptions = new GetWorkspaceOutputValueOptions.Builder()
        .workspaceId("testString")
        .varName("testString")
        .build();

      Response<ValueResponse> response = service.getWorkspaceOutputValue(getWorkspaceOutputValueOptions).execute();
      ValueResponse valueResponse = response.getResult();

      System.out.println(valueResponse);
      // end-get_workspace_output_value
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace_settings_value
      GetWorkspaceSettingsValueOptions getWorkspaceSettingsValueOptions = new GetWorkspaceSettingsValueOptions.Builder()
        .workspaceId("testString")
        .varName("testString")
        .build();

      Response<ValueResponse> response = service.getWorkspaceSettingsValue(getWorkspaceSettingsValueOptions).execute();
      ValueResponse valueResponse = response.getResult();

      System.out.println(valueResponse);
      // end-get_workspace_settings_value
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace_template_input_value
      GetWorkspaceTemplateInputValueOptions getWorkspaceTemplateInputValueOptions = new GetWorkspaceTemplateInputValueOptions.Builder()
        .workspaceId("testString")
        .templateId("testString")
        .varName("testString")
        .build();

      Response<ValueResponse> response = service.getWorkspaceTemplateInputValue(getWorkspaceTemplateInputValueOptions).execute();
      ValueResponse valueResponse = response.getResult();

      System.out.println(valueResponse);
      // end-get_workspace_template_input_value
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace_template_output_value
      GetWorkspaceTemplateOutputValueOptions getWorkspaceTemplateOutputValueOptions = new GetWorkspaceTemplateOutputValueOptions.Builder()
        .workspaceId("testString")
        .templateId("testString")
        .varName("testString")
        .build();

      Response<ValueResponse> response = service.getWorkspaceTemplateOutputValue(getWorkspaceTemplateOutputValueOptions).execute();
      ValueResponse valueResponse = response.getResult();

      System.out.println(valueResponse);
      // end-get_workspace_template_output_value
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_workspace_template_setting_value
      GetWorkspaceTemplateSettingValueOptions getWorkspaceTemplateSettingValueOptions = new GetWorkspaceTemplateSettingValueOptions.Builder()
        .workspaceId("testString")
        .templateId("testString")
        .varName("testString")
        .build();

      Response<ValueResponse> response = service.getWorkspaceTemplateSettingValue(getWorkspaceTemplateSettingValueOptions).execute();
      ValueResponse valueResponse = response.getResult();

      System.out.println(valueResponse);
      // end-get_workspace_template_setting_value
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_job_workspace_input_value
      GetJobWorkspaceInputValueOptions getJobWorkspaceInputValueOptions = new GetJobWorkspaceInputValueOptions.Builder()
        .jobId("testString")
        .workspaceId("testString")
        .varName("testString")
        .build();

      Response<ValueResponse> response = service.getJobWorkspaceInputValue(getJobWorkspaceInputValueOptions).execute();
      ValueResponse valueResponse = response.getResult();

      System.out.println(valueResponse);
      // end-get_job_workspace_input_value
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_job_workspace_output_value
      GetJobWorkspaceOutputValueOptions getJobWorkspaceOutputValueOptions = new GetJobWorkspaceOutputValueOptions.Builder()
        .jobId("testString")
        .workspaceId("testString")
        .varName("testString")
        .build();

      Response<ValueResponse> response = service.getJobWorkspaceOutputValue(getJobWorkspaceOutputValueOptions).execute();
      ValueResponse valueResponse = response.getResult();

      System.out.println(valueResponse);
      // end-get_job_workspace_output_value
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_job_workspace_setting_value
      GetJobWorkspaceSettingValueOptions getJobWorkspaceSettingValueOptions = new GetJobWorkspaceSettingValueOptions.Builder()
        .jobId("testString")
        .workspaceId("testString")
        .varName("testString")
        .build();

      Response<ValueResponse> response = service.getJobWorkspaceSettingValue(getJobWorkspaceSettingValueOptions).execute();
      ValueResponse valueResponse = response.getResult();

      System.out.println(valueResponse);
      // end-get_job_workspace_setting_value
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_triggers
      ListTriggersOptions listTriggersOptions = new ListTriggersOptions.Builder()
        .build();

      Response<TriggerList> response = service.listTriggers(listTriggersOptions).execute();
      TriggerList triggerList = response.getResult();

      System.out.println(triggerList);
      // end-list_triggers
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_trigger
      Trigger triggerModel = new Trigger.Builder()
        .add("foo", "testString")
        .build();
      CreateTriggerOptions createTriggerOptions = new CreateTriggerOptions.Builder()
        .trigger(triggerModel)
        .build();

      Response<Trigger> response = service.createTrigger(createTriggerOptions).execute();
      Trigger trigger = response.getResult();

      System.out.println(trigger);
      // end-create_trigger
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_trigger
      GetTriggerOptions getTriggerOptions = new GetTriggerOptions.Builder()
        .triggerId("testString")
        .build();

      Response<Trigger> response = service.getTrigger(getTriggerOptions).execute();
      Trigger trigger = response.getResult();

      System.out.println(trigger);
      // end-get_trigger
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_trigger
      Trigger triggerModel = new Trigger.Builder()
        .add("foo", "testString")
        .build();
      ReplaceTriggerOptions replaceTriggerOptions = new ReplaceTriggerOptions.Builder()
        .triggerId("testString")
        .trigger(triggerModel)
        .build();

      Response<Trigger> response = service.replaceTrigger(replaceTriggerOptions).execute();
      Trigger trigger = response.getResult();

      System.out.println(trigger);
      // end-replace_trigger
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_webhook
      ListWebhookOptions listWebhookOptions = new ListWebhookOptions.Builder()
        .build();

      Response<WebHookList> response = service.listWebhook(listWebhookOptions).execute();
      WebHookList webHookList = response.getResult();

      System.out.println(webHookList);
      // end-list_webhook
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_webhook
      WebHook webHookModel = new WebHook.Builder()
        .add("foo", "testString")
        .build();
      CreateWebhookOptions createWebhookOptions = new CreateWebhookOptions.Builder()
        .webHook(webHookModel)
        .build();

      Response<WebHook> response = service.createWebhook(createWebhookOptions).execute();
      WebHook webHook = response.getResult();

      System.out.println(webHook);
      // end-create_webhook
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_webhook
      GetWebhookOptions getWebhookOptions = new GetWebhookOptions.Builder()
        .hookId("testString")
        .build();

      Response<WebHook> response = service.getWebhook(getWebhookOptions).execute();
      WebHook webHook = response.getResult();

      System.out.println(webHook);
      // end-get_webhook
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_webhook
      WebHook webHookModel = new WebHook.Builder()
        .add("foo", "testString")
        .build();
      ReplaceWebhookOptions replaceWebhookOptions = new ReplaceWebhookOptions.Builder()
        .hookId("testString")
        .webHook(webHookModel)
        .build();

      Response<WebHook> response = service.replaceWebhook(replaceWebhookOptions).execute();
      WebHook webHook = response.getResult();

      System.out.println(webHook);
      // end-replace_webhook
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_private_cluster
      GetPrivateClusterOptions getPrivateClusterOptions = new GetPrivateClusterOptions();

      Response<PrivateClusterList> response = service.getPrivateCluster(getPrivateClusterOptions).execute();
      PrivateClusterList privateClusterList = response.getResult();

      System.out.println(privateClusterList);
      // end-get_private_cluster
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_private_cluster
      PrivateCluster privateClusterModel = new PrivateCluster.Builder()
        .add("foo", "testString")
        .build();
      CreatePrivateClusterOptions createPrivateClusterOptions = new CreatePrivateClusterOptions.Builder()
        .privateCluster(privateClusterModel)
        .build();

      Response<PrivateCluster> response = service.createPrivateCluster(createPrivateClusterOptions).execute();
      PrivateCluster privateCluster = response.getResult();

      System.out.println(privateCluster);
      // end-create_private_cluster
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_adapter
      ListAdapterOptions listAdapterOptions = new ListAdapterOptions.Builder()
        .build();

      Response<AdapterList> response = service.listAdapter(listAdapterOptions).execute();
      AdapterList adapterList = response.getResult();

      System.out.println(adapterList);
      // end-list_adapter
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_adapter
      Adapter adapterModel = new Adapter.Builder()
        .add("foo", "testString")
        .build();
      CreateAdapterOptions createAdapterOptions = new CreateAdapterOptions.Builder()
        .adapter(adapterModel)
        .build();

      Response<Adapter> response = service.createAdapter(createAdapterOptions).execute();
      Adapter adapter = response.getResult();

      System.out.println(adapter);
      // end-create_adapter
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_adapter
      GetAdapterOptions getAdapterOptions = new GetAdapterOptions.Builder()
        .adapterId("testString")
        .build();

      Response<Adapter> response = service.getAdapter(getAdapterOptions).execute();
      Adapter adapter = response.getResult();

      System.out.println(adapter);
      // end-get_adapter
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_adapter
      Adapter adapterModel = new Adapter.Builder()
        .add("foo", "testString")
        .build();
      ReplaceAdapterOptions replaceAdapterOptions = new ReplaceAdapterOptions.Builder()
        .adapterId("testString")
        .adapter(adapterModel)
        .build();

      Response<Adapter> response = service.replaceAdapter(replaceAdapterOptions).execute();
      Adapter adapter = response.getResult();

      System.out.println(adapter);
      // end-replace_adapter
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_connection
      ListConnectionOptions listConnectionOptions = new ListConnectionOptions.Builder()
        .build();

      Response<ConnectionList> response = service.listConnection(listConnectionOptions).execute();
      ConnectionList connectionList = response.getResult();

      System.out.println(connectionList);
      // end-list_connection
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_connection
      Connection connectionModel = new Connection.Builder()
        .add("foo", "testString")
        .build();
      CreateConnectionOptions createConnectionOptions = new CreateConnectionOptions.Builder()
        .connection(connectionModel)
        .build();

      Response<Connection> response = service.createConnection(createConnectionOptions).execute();
      Connection connection = response.getResult();

      System.out.println(connection);
      // end-create_connection
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_datasources
      ListDatasourcesOptions listDatasourcesOptions = new ListDatasourcesOptions.Builder()
        .build();

      Response<DatasourceList> response = service.listDatasources(listDatasourcesOptions).execute();
      DatasourceList datasourceList = response.getResult();

      System.out.println(datasourceList);
      // end-list_datasources
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_datasource
      Datasource datasourceModel = new Datasource.Builder()
        .add("foo", "testString")
        .build();
      CreateDatasourceOptions createDatasourceOptions = new CreateDatasourceOptions.Builder()
        .datasource(datasourceModel)
        .build();

      Response<Datasource> response = service.createDatasource(createDatasourceOptions).execute();
      Datasource datasource = response.getResult();

      System.out.println(datasource);
      // end-create_datasource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_cart
      ListCartOptions listCartOptions = new ListCartOptions.Builder()
        .service("testString")
        .build();

      Response<CartOrderList> response = service.listCart(listCartOptions).execute();
      CartOrderList cartOrderList = response.getResult();

      System.out.println(cartOrderList);
      // end-list_cart
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_cart_order
      CartOrder cartOrderModel = new CartOrder.Builder()
        .name("MySatelliteLocation")
        .add("foo", "testString")
        .build();
      CreateCartOrderOptions createCartOrderOptions = new CreateCartOrderOptions.Builder()
        .cartOrder(cartOrderModel)
        .build();

      Response<CartOrder> response = service.createCartOrder(createCartOrderOptions).execute();
      CartOrder cartOrder = response.getResult();

      System.out.println(cartOrder);
      // end-create_cart_order
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_cart_order
      GetCartOrderOptions getCartOrderOptions = new GetCartOrderOptions.Builder()
        .orderId("testString")
        .build();

      Response<CartOrder> response = service.getCartOrder(getCartOrderOptions).execute();
      CartOrder cartOrder = response.getResult();

      System.out.println(cartOrder);
      // end-get_cart_order
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_cart_order
      CartOrder cartOrderModel = new CartOrder.Builder()
        .name("MySatelliteLocation")
        .add("foo", "testString")
        .build();
      ReplaceCartOrderOptions replaceCartOrderOptions = new ReplaceCartOrderOptions.Builder()
        .orderId("testString")
        .operation("testString")
        .cartOrder(cartOrderModel)
        .build();

      Response<CartOrder> response = service.replaceCartOrder(replaceCartOrderOptions).execute();
      CartOrder cartOrder = response.getResult();

      System.out.println(cartOrder);
      // end-replace_cart_order
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-run_fulfilment_operation
      RunFulfilmentOperationOptions runFulfilmentOperationOptions = new RunFulfilmentOperationOptions.Builder()
        .orderId("testString")
        .operation("testString")
        .build();

      service.runFulfilmentOperation(runFulfilmentOperationOptions).execute();
      // end-run_fulfilment_operation
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_cart_order
      UpdateCartOrder updateCartOrderModel = new UpdateCartOrder.Builder()
        .add("foo", "testString")
        .build();
      UpdateCartOrderOptions updateCartOrderOptions = new UpdateCartOrderOptions.Builder()
        .orderId("testString")
        .updateCartOrder(updateCartOrderModel)
        .build();

      Response<CartOrder> response = service.updateCartOrder(updateCartOrderOptions).execute();
      CartOrder cartOrder = response.getResult();

      System.out.println(cartOrder);
      // end-update_cart_order
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_cart_metadata
      GetCartMetadataOptions getCartMetadataOptions = new GetCartMetadataOptions.Builder()
        .orderId("testString")
        .build();

      Response<ItemMetadata> response = service.getCartMetadata(getCartMetadataOptions).execute();
      ItemMetadata itemMetadata = response.getResult();

      System.out.println(itemMetadata);
      // end-get_cart_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_cart_resources
      ListCartResourcesOptions listCartResourcesOptions = new ListCartResourcesOptions.Builder()
        .orderId("testString")
        .build();

      Response<CloudResourceList> response = service.listCartResources(listCartResourcesOptions).execute();
      CloudResourceList cloudResourceList = response.getResult();

      System.out.println(cloudResourceList);
      // end-list_cart_resources
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_cart_order_jobs
      ListCartOrderJobsOptions listCartOrderJobsOptions = new ListCartOrderJobsOptions.Builder()
        .orderId("testString")
        .build();

      Response<JobList> response = service.listCartOrderJobs(listCartOrderJobsOptions).execute();
      JobList jobList = response.getResult();

      System.out.println(jobList);
      // end-list_cart_order_jobs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_cart_order_job
      GetCartOrderJobOptions getCartOrderJobOptions = new GetCartOrderJobOptions.Builder()
        .orderId("testString")
        .jobId("testString")
        .build();

      Response<JobLite> response = service.getCartOrderJob(getCartOrderJobOptions).execute();
      JobLite jobLite = response.getResult();

      System.out.println(jobLite);
      // end-get_cart_order_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_cart_order_job_log
      GetCartOrderJobLogOptions getCartOrderJobLogOptions = new GetCartOrderJobLogOptions.Builder()
        .orderId("testString")
        .jobId("testString")
        .build();

      Response<JobLog> response = service.getCartOrderJobLog(getCartOrderJobLogOptions).execute();
      JobLog jobLog = response.getResult();

      System.out.println(jobLog);
      // end-get_cart_order_job_log
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_cart_order_job_resources
      GetCartOrderJobResourcesOptions getCartOrderJobResourcesOptions = new GetCartOrderJobResourcesOptions.Builder()
        .orderId("testString")
        .jobId("testString")
        .build();

      Response<CloudResourceList> response = service.getCartOrderJobResources(getCartOrderJobResourcesOptions).execute();
      CloudResourceList cloudResourceList = response.getResult();

      System.out.println(cloudResourceList);
      // end-get_cart_order_job_resources
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_environment_definitions
      ListEnvironmentDefinitionsOptions listEnvironmentDefinitionsOptions = new ListEnvironmentDefinitionsOptions.Builder()
        .build();

      Response<List<EnvironmentCatalogOfferingItem>> response = service.listEnvironmentDefinitions(listEnvironmentDefinitionsOptions).execute();
      List<EnvironmentCatalogOfferingItem> listEnvironmentCatalogOfferingItem = response.getResult();

      System.out.println(listEnvironmentCatalogOfferingItem);
      // end-list_environment_definitions
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_environment_definition
      GetEnvironmentDefinitionOptions getEnvironmentDefinitionOptions = new GetEnvironmentDefinitionOptions.Builder()
        .offeringId("testString")
        .build();

      Response<Environment> response = service.getEnvironmentDefinition(getEnvironmentDefinitionOptions).execute();
      Environment environment = response.getResult();

      System.out.println(environment);
      // end-get_environment_definition
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_environment
      ListEnvironmentOptions listEnvironmentOptions = new ListEnvironmentOptions.Builder()
        .build();

      Response<EnvironmentList> response = service.listEnvironment(listEnvironmentOptions).execute();
      EnvironmentList environmentList = response.getResult();

      System.out.println(environmentList);
      // end-list_environment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_environment
      Environment environmentModel = new Environment.Builder()
        .name("Toronto Dev Environtment")
        .add("foo", "testString")
        .build();
      CreateEnvironmentOptions createEnvironmentOptions = new CreateEnvironmentOptions.Builder()
        .environment(environmentModel)
        .build();

      Response<Environment> response = service.createEnvironment(createEnvironmentOptions).execute();
      Environment environment = response.getResult();

      System.out.println(environment);
      // end-create_environment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_environment
      GetEnvironmentOptions getEnvironmentOptions = new GetEnvironmentOptions.Builder()
        .environmentId("testString")
        .build();

      Response<Environment> response = service.getEnvironment(getEnvironmentOptions).execute();
      Environment environment = response.getResult();

      System.out.println(environment);
      // end-get_environment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_environment
      Environment environmentModel = new Environment.Builder()
        .name("Toronto Dev Environtment")
        .add("foo", "testString")
        .build();
      ReplaceEnvironmentOptions replaceEnvironmentOptions = new ReplaceEnvironmentOptions.Builder()
        .environmentId("testString")
        .environment(environmentModel)
        .build();

      Response<Environment> response = service.replaceEnvironment(replaceEnvironmentOptions).execute();
      Environment environment = response.getResult();

      System.out.println(environment);
      // end-replace_environment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_environment
      Environment environmentModel = new Environment.Builder()
        .name("Toronto Dev Environtment")
        .add("foo", "testString")
        .build();
      UpdateEnvironmentOptions updateEnvironmentOptions = new UpdateEnvironmentOptions.Builder()
        .environmentId("testString")
        .environment(environmentModel)
        .build();

      Response<Environment> response = service.updateEnvironment(updateEnvironmentOptions).execute();
      Environment environment = response.getResult();

      System.out.println(environment);
      // end-update_environment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_environment_workspaces
      ListEnvironmentWorkspacesOptions listEnvironmentWorkspacesOptions = new ListEnvironmentWorkspacesOptions.Builder()
        .environmentId("testString")
        .build();

      Response<CloudResourceList> response = service.listEnvironmentWorkspaces(listEnvironmentWorkspacesOptions).execute();
      CloudResourceList cloudResourceList = response.getResult();

      System.out.println(cloudResourceList);
      // end-list_environment_workspaces
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_environment_resources
      ListEnvironmentResourcesOptions listEnvironmentResourcesOptions = new ListEnvironmentResourcesOptions.Builder()
        .environmentId("testString")
        .build();

      Response<CloudResourceList> response = service.listEnvironmentResources(listEnvironmentResourcesOptions).execute();
      CloudResourceList cloudResourceList = response.getResult();

      System.out.println(cloudResourceList);
      // end-list_environment_resources
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
      KMSSettings kmsSettingsModel = new KMSSettings.Builder()
        .add("foo", "testString")
        .build();
      UpdateKmsSettingsOptions updateKmsSettingsOptions = new UpdateKmsSettingsOptions.Builder()
        .kmsSettings(kmsSettingsModel)
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
        .add("foo", "testString")
        .build();
      TemplateMetaDataRequest templateMetaDataRequestModel = new TemplateMetaDataRequest.Builder()
        .templateType("testString")
        .source(externalSourceModel)
        .add("foo", "testString")
        .build();
      ProcessTemplateMetaDataOptions processTemplateMetaDataOptions = new ProcessTemplateMetaDataOptions.Builder()
        .templateMetaDataRequest(templateMetaDataRequestModel)
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
      // begin-delete_workspace
      DeleteWorkspaceOptions deleteWorkspaceOptions = new DeleteWorkspaceOptions.Builder()
        .workspaceId("testString")
        .build();

      service.deleteWorkspace(deleteWorkspaceOptions).execute();
      // end-delete_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_webhook
      DeleteWebhookOptions deleteWebhookOptions = new DeleteWebhookOptions.Builder()
        .hookId("testString")
        .build();

      service.deleteWebhook(deleteWebhookOptions).execute();
      // end-delete_webhook
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_trigger
      DeleteTriggerOptions deleteTriggerOptions = new DeleteTriggerOptions.Builder()
        .triggerId("testString")
        .build();

      service.deleteTrigger(deleteTriggerOptions).execute();
      // end-delete_trigger
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_template_from_workspace
      DeleteTemplateFromWorkspaceOptions deleteTemplateFromWorkspaceOptions = new DeleteTemplateFromWorkspaceOptions.Builder()
        .workspaceId("testString")
        .templateId("testString")
        .build();

      service.deleteTemplateFromWorkspace(deleteTemplateFromWorkspaceOptions).execute();
      // end-delete_template_from_workspace
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
      // begin-delete_private_cluster
      DeletePrivateClusterOptions deletePrivateClusterOptions = new DeletePrivateClusterOptions();

      service.deletePrivateCluster(deletePrivateClusterOptions).execute();
      // end-delete_private_cluster
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
      // begin-delete_flow_from_workspace
      DeleteFlowFromWorkspaceOptions deleteFlowFromWorkspaceOptions = new DeleteFlowFromWorkspaceOptions.Builder()
        .workspaceId("testString")
        .flowId("testString")
        .build();

      service.deleteFlowFromWorkspace(deleteFlowFromWorkspaceOptions).execute();
      // end-delete_flow_from_workspace
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_environment
      DeleteEnvironmentOptions deleteEnvironmentOptions = new DeleteEnvironmentOptions.Builder()
        .environmentId("testString")
        .build();

      service.deleteEnvironment(deleteEnvironmentOptions).execute();
      // end-delete_environment
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_dataset
      DeleteDatasetOptions deleteDatasetOptions = new DeleteDatasetOptions.Builder()
        .datasetId("testString")
        .build();

      service.deleteDataset(deleteDatasetOptions).execute();
      // end-delete_dataset
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_credential
      DeleteCredentialOptions deleteCredentialOptions = new DeleteCredentialOptions.Builder()
        .credsId("testString")
        .build();

      service.deleteCredential(deleteCredentialOptions).execute();
      // end-delete_credential
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_controls
      DeleteControlsOptions deleteControlsOptions = new DeleteControlsOptions.Builder()
        .controlsId("testString")
        .build();

      service.deleteControls(deleteControlsOptions).execute();
      // end-delete_controls
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_cart_order
      DeleteCartOrderOptions deleteCartOrderOptions = new DeleteCartOrderOptions.Builder()
        .orderId("testString")
        .build();

      service.deleteCartOrder(deleteCartOrderOptions).execute();
      // end-delete_cart_order
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_capsule
      DeleteCapsuleOptions deleteCapsuleOptions = new DeleteCapsuleOptions.Builder()
        .controlsId("testString")
        .capsuleId("testString")
        .build();

      service.deleteCapsule(deleteCapsuleOptions).execute();
      // end-delete_capsule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_adapter
      DeleteAdapterOptions deleteAdapterOptions = new DeleteAdapterOptions.Builder()
        .adapterId("testString")
        .build();

      service.deleteAdapter(deleteAdapterOptions).execute();
      // end-delete_adapter
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
