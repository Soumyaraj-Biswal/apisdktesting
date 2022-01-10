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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.27.0-c07e12f4-20210209-225127
 */

package com.ibm.cloud.schematics_2_0_api.v2;

import com.ibm.cloud.common.SdkCommon;
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
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateMetaDataResponse;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateRepoTarUploadResponse;
import com.ibm.cloud.schematics_2_0_api.v2.model.Trigger;
import com.ibm.cloud.schematics_2_0_api.v2.model.TriggerList;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateActionOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateAtasetOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateCapsuleOptions;
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
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import okhttp3.MultipartBody;

/**
 * Use IBM Cloud Schematics service to provision a stack of IBM Cloud resources described using a templating language,
 * such as - Terraform files, Helm charts, Ansible playbooks, etc..
 *
 * @version v2
 */
public class Schematics20Api extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "schematics_2_0_api";

  public static final String DEFAULT_SERVICE_URL = "https://schematics-dev.containers.appdomain.cloud";

 /**
   * Class method which constructs an instance of the `Schematics20Api` client.
   * The default service name is used to configure the client instance.
   *
   * @return an instance of the `Schematics20Api` client using external configuration
   */
  public static Schematics20Api newInstance() {
    return newInstance(DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `Schematics20Api` client.
   * The specified service name is used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `Schematics20Api` client using external configuration
   */
  public static Schematics20Api newInstance(String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    Schematics20Api service = new Schematics20Api(serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `Schematics20Api` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public Schematics20Api(String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
  }

  /**
   * Get the information about schematics.
   *
   * Get detailed information about the IBM Cloud Schematics API version, supported template types and versions, and the
   * supported locations.
   *
   * @param getSchematicsInfoOptions the {@link GetSchematicsInfoOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SchematicsInfo}
   */
  public ServiceCall<SchematicsInfo> getSchematicsInfo(GetSchematicsInfoOptions getSchematicsInfoOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/info"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getSchematicsInfo");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SchematicsInfo> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SchematicsInfo>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the information about schematics.
   *
   * Get detailed information about the IBM Cloud Schematics API version, supported template types and versions, and the
   * supported locations.
   *
   * @return a {@link ServiceCall} with a result of type {@link SchematicsInfo}
   */
  public ServiceCall<SchematicsInfo> getSchematicsInfo() {
    return getSchematicsInfo(null);
  }

  /**
   * Get all access_rules for all schematics resources.
   *
   * Get all the authorization rules for the User for Workspaces,  Datasets, Controls &amp; Settings API.
   *
   * @param listSchematicsAccessRulesOptions the {@link ListSchematicsAccessRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SchematicsAccessRuleList}
   */
  public ServiceCall<SchematicsAccessRuleList> listSchematicsAccessRules(ListSchematicsAccessRulesOptions listSchematicsAccessRulesOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/access"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listSchematicsAccessRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SchematicsAccessRuleList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SchematicsAccessRuleList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all access_rules for all schematics resources.
   *
   * Get all the authorization rules for the User for Workspaces,  Datasets, Controls &amp; Settings API.
   *
   * @return a {@link ServiceCall} with a result of type {@link SchematicsAccessRuleList}
   */
  public ServiceCall<SchematicsAccessRuleList> listSchematicsAccessRules() {
    return listSchematicsAccessRules(null);
  }

  /**
   * Get the access_rules for the schematics resource.
   *
   * Get the authorization rules for the User for Workspaces,  Shared datasets, Controls &amp; Settings API.
   *
   * @param getSchematicsAccessRulesForResourceOptions the {@link GetSchematicsAccessRulesForResourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SchematicsAccessRuleList}
   */
  public ServiceCall<SchematicsAccessRuleList> getSchematicsAccessRulesForResource(GetSchematicsAccessRulesForResourceOptions getSchematicsAccessRulesForResourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSchematicsAccessRulesForResourceOptions,
      "getSchematicsAccessRulesForResourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("resource_name", getSchematicsAccessRulesForResourceOptions.resourceName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/access/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getSchematicsAccessRulesForResource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getSchematicsAccessRulesForResourceOptions.commandName() != null) {
      builder.query("command_name", String.valueOf(getSchematicsAccessRulesForResourceOptions.commandName()));
    }
    if (getSchematicsAccessRulesForResourceOptions.commandParameter() != null) {
      builder.query("command_parameter", String.valueOf(getSchematicsAccessRulesForResourceOptions.commandParameter()));
    }
    ResponseConverter<SchematicsAccessRuleList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SchematicsAccessRuleList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all the allowed commands for schematics resource.
   *
   * Get all the allowed commands for schematics resource.
   *
   * @param getSchematicsCommandNamesOptions the {@link GetSchematicsCommandNamesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CommandList}
   */
  public ServiceCall<CommandList> getSchematicsCommandNames(GetSchematicsCommandNamesOptions getSchematicsCommandNamesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSchematicsCommandNamesOptions,
      "getSchematicsCommandNamesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("resource_name", getSchematicsCommandNamesOptions.resourceName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/commands/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getSchematicsCommandNames");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<CommandList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CommandList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all Workspace definitions.
   *
   * Get all Workspace definitions.
   *
   * @param listWorkspacesOptions the {@link ListWorkspacesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceList}
   */
  public ServiceCall<WorkspaceList> listWorkspaces(ListWorkspacesOptions listWorkspacesOptions) {
    if (listWorkspacesOptions == null) {
      listWorkspacesOptions = new ListWorkspacesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listWorkspaces");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listWorkspacesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listWorkspacesOptions.offset()));
    }
    if (listWorkspacesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listWorkspacesOptions.limit()));
    }
    if (listWorkspacesOptions.sort() != null) {
      builder.query("sort", String.valueOf(listWorkspacesOptions.sort()));
    }
    if (listWorkspacesOptions.profile() != null) {
      builder.query("profile", String.valueOf(listWorkspacesOptions.profile()));
    }
    ResponseConverter<WorkspaceList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkspaceList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all Workspace definitions.
   *
   * Get all Workspace definitions.
   *
   * @return a {@link ServiceCall} with a result of type {@link WorkspaceList}
   */
  public ServiceCall<WorkspaceList> listWorkspaces() {
    return listWorkspaces(null);
  }

  /**
   * Create a Workspace definition.
   *
   * Create a new workspace definition.
   *
   * @param createWorkspaceOptions the {@link CreateWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Workspace}
   */
  public ServiceCall<Workspace> createWorkspace(CreateWorkspaceOptions createWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createWorkspaceOptions,
      "createWorkspaceOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "createWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createWorkspaceOptions.workspace()), "application/json");
    ResponseConverter<Workspace> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Workspace>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the Workspace definition.
   *
   * Get the Workspace definition.
   *
   * @param getWorkspaceOptions the {@link GetWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Workspace}
   */
  public ServiceCall<Workspace> getWorkspace(GetWorkspaceOptions getWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceOptions,
      "getWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", getWorkspaceOptions.workspaceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getWorkspaceOptions.profile() != null) {
      builder.query("profile", String.valueOf(getWorkspaceOptions.profile()));
    }
    ResponseConverter<Workspace> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Workspace>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace the Workspace definition.
   *
   * Replace the Workspace definition.
   *
   * @param replaceWorkspaceOptions the {@link ReplaceWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Workspace}
   */
  public ServiceCall<Workspace> replaceWorkspace(ReplaceWorkspaceOptions replaceWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceWorkspaceOptions,
      "replaceWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", replaceWorkspaceOptions.workspaceId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "replaceWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceWorkspaceOptions.workspace()), "application/json");
    ResponseConverter<Workspace> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Workspace>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete the Workspace.
   *
   * Delete the workspace; if the workspace's auto_destroy_on_delete is set to true, try to destroy all the resources in
   * the workspace before deleting the workspace.
   *
   * @param deleteWorkspaceOptions the {@link DeleteWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteWorkspace(DeleteWorkspaceOptions deleteWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteWorkspaceOptions,
      "deleteWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", deleteWorkspaceOptions.workspaceId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "deleteWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteWorkspaceOptions.force() != null) {
      builder.header("force", deleteWorkspaceOptions.force());
    }
    if (deleteWorkspaceOptions.propagate() != null) {
      builder.header("propagate", deleteWorkspaceOptions.propagate());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the Workspace definition.
   *
   * Update the Workspace definition.
   *
   * @param updateWorkspaceOptions the {@link UpdateWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Workspace}
   */
  public ServiceCall<Workspace> updateWorkspace(UpdateWorkspaceOptions updateWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateWorkspaceOptions,
      "updateWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", updateWorkspaceOptions.workspaceId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "updateWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateWorkspaceOptions.workspace()), "application/json");
    ResponseConverter<Workspace> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Workspace>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the Workspace input parameter definitions.
   *
   * Get the input parameter definition (variables, values, metadata) for the workspace.
   *
   * @param listWorkspaceInputsOptions the {@link ListWorkspaceInputsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputVariableDataList}
   */
  public ServiceCall<InputVariableDataList> listWorkspaceInputs(ListWorkspaceInputsOptions listWorkspaceInputsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listWorkspaceInputsOptions,
      "listWorkspaceInputsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", listWorkspaceInputsOptions.workspaceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/inputs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listWorkspaceInputs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listWorkspaceInputsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listWorkspaceInputsOptions.offset()));
    }
    if (listWorkspaceInputsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listWorkspaceInputsOptions.limit()));
    }
    ResponseConverter<InputVariableDataList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InputVariableDataList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the Workspace output parameter definitions.
   *
   * Get the output parameter definition (variables, metadata) for the workspace.
   *
   * @param listWorkspaceOutputsOptions the {@link ListWorkspaceOutputsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link OutputVariableDataList}
   */
  public ServiceCall<OutputVariableDataList> listWorkspaceOutputs(ListWorkspaceOutputsOptions listWorkspaceOutputsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listWorkspaceOutputsOptions,
      "listWorkspaceOutputsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", listWorkspaceOutputsOptions.workspaceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/outputs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listWorkspaceOutputs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listWorkspaceOutputsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listWorkspaceOutputsOptions.offset()));
    }
    if (listWorkspaceOutputsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listWorkspaceOutputsOptions.limit()));
    }
    ResponseConverter<OutputVariableDataList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<OutputVariableDataList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new Workspace with Template definitions.
   *
   * A new workspace is created for the templates.
   *
   * @param createWorkspaceTemplatesOptions the {@link CreateWorkspaceTemplatesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Workspace}
   */
  public ServiceCall<Workspace> createWorkspaceTemplates(CreateWorkspaceTemplatesOptions createWorkspaceTemplatesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createWorkspaceTemplatesOptions,
      "createWorkspaceTemplatesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/templates"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "createWorkspaceTemplates");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createWorkspaceTemplatesOptions.xGithubToken() != null) {
      builder.header("X-Github-token", createWorkspaceTemplatesOptions.xGithubToken());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createWorkspaceTemplatesOptions.templateListRequest()), "application/json");
    ResponseConverter<Workspace> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Workspace>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all Template definitions from the Workspace.
   *
   * Get list of all Templates in a Workspace.
   *
   * @param listTemplatesInWorkspaceOptions the {@link ListTemplatesInWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateList}
   */
  public ServiceCall<TemplateList> listTemplatesInWorkspace(ListTemplatesInWorkspaceOptions listTemplatesInWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listTemplatesInWorkspaceOptions,
      "listTemplatesInWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", listTemplatesInWorkspaceOptions.workspaceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/templates", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listTemplatesInWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listTemplatesInWorkspaceOptions.offset() != null) {
      builder.query("offset", String.valueOf(listTemplatesInWorkspaceOptions.offset()));
    }
    if (listTemplatesInWorkspaceOptions.limit() != null) {
      builder.query("limit", String.valueOf(listTemplatesInWorkspaceOptions.limit()));
    }
    if (listTemplatesInWorkspaceOptions.sort() != null) {
      builder.query("sort", String.valueOf(listTemplatesInWorkspaceOptions.sort()));
    }
    if (listTemplatesInWorkspaceOptions.profile() != null) {
      builder.query("profile", String.valueOf(listTemplatesInWorkspaceOptions.profile()));
    }
    ResponseConverter<TemplateList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Add a new Template definition to the Workspace.
   *
   * Creates a new Template and adds it to Workspace.
   *
   * @param addTemplatesToWorkspaceOptions the {@link AddTemplatesToWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Template}
   */
  public ServiceCall<Template> addTemplatesToWorkspace(AddTemplatesToWorkspaceOptions addTemplatesToWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addTemplatesToWorkspaceOptions,
      "addTemplatesToWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", addTemplatesToWorkspaceOptions.workspaceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/templates", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "addTemplatesToWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (addTemplatesToWorkspaceOptions.xGithubToken() != null) {
      builder.header("X-Github-token", addTemplatesToWorkspaceOptions.xGithubToken());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(addTemplatesToWorkspaceOptions.template()), "application/json");
    ResponseConverter<Template> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Template>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the Template definition from the Workspace.
   *
   * Get the Template definition from the workspace.
   *
   * @param getTemplateInWorkspaceOptions the {@link GetTemplateInWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Template}
   */
  public ServiceCall<Template> getTemplateInWorkspace(GetTemplateInWorkspaceOptions getTemplateInWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTemplateInWorkspaceOptions,
      "getTemplateInWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", getTemplateInWorkspaceOptions.workspaceId());
    pathParamsMap.put("template_id", getTemplateInWorkspaceOptions.templateId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/templates/{template_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getTemplateInWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getTemplateInWorkspaceOptions.profile() != null) {
      builder.query("profile", String.valueOf(getTemplateInWorkspaceOptions.profile()));
    }
    ResponseConverter<Template> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Template>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace the Template definition in the Workspace.
   *
   * Replace the Template definition in the Workspace.
   *
   * @param replaceTemplateInWorkspaceOptions the {@link ReplaceTemplateInWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Template}
   */
  public ServiceCall<Template> replaceTemplateInWorkspace(ReplaceTemplateInWorkspaceOptions replaceTemplateInWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceTemplateInWorkspaceOptions,
      "replaceTemplateInWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", replaceTemplateInWorkspaceOptions.workspaceId());
    pathParamsMap.put("template_id", replaceTemplateInWorkspaceOptions.templateId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/templates/{template_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "replaceTemplateInWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (replaceTemplateInWorkspaceOptions.xGithubToken() != null) {
      builder.header("X-Github-token", replaceTemplateInWorkspaceOptions.xGithubToken());
    }
    if (replaceTemplateInWorkspaceOptions.template() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceTemplateInWorkspaceOptions.template()), "application/json");
    }
    ResponseConverter<Template> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Template>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove the Template from the Workspace.
   *
   * Delete the Template associated with the workspace; if the template's auto_destroy_on_delete is set to true, try to
   * destroy all the resources  associated with Template before deleting the Template.
   *
   * @param deleteTemplateFromWorkspaceOptions the {@link DeleteTemplateFromWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteTemplateFromWorkspace(DeleteTemplateFromWorkspaceOptions deleteTemplateFromWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTemplateFromWorkspaceOptions,
      "deleteTemplateFromWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", deleteTemplateFromWorkspaceOptions.workspaceId());
    pathParamsMap.put("template_id", deleteTemplateFromWorkspaceOptions.templateId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/templates/{template_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "deleteTemplateFromWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteTemplateFromWorkspaceOptions.force() != null) {
      builder.header("force", deleteTemplateFromWorkspaceOptions.force());
    }
    if (deleteTemplateFromWorkspaceOptions.propagate() != null) {
      builder.header("propagate", deleteTemplateFromWorkspaceOptions.propagate());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the Template definition in the Workspace.
   *
   * Update the Template definition in the Workspace.
   *
   * @param updateTemplateInWorkspaceOptions the {@link UpdateTemplateInWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Template}
   */
  public ServiceCall<Template> updateTemplateInWorkspace(UpdateTemplateInWorkspaceOptions updateTemplateInWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateTemplateInWorkspaceOptions,
      "updateTemplateInWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", updateTemplateInWorkspaceOptions.workspaceId());
    pathParamsMap.put("template_id", updateTemplateInWorkspaceOptions.templateId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/templates/{template_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "updateTemplateInWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateTemplateInWorkspaceOptions.xGithubToken() != null) {
      builder.header("X-Github-token", updateTemplateInWorkspaceOptions.xGithubToken());
    }
    if (updateTemplateInWorkspaceOptions.template() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateTemplateInWorkspaceOptions.template()), "application/json");
    }
    ResponseConverter<Template> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Template>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Upload the Template content as tar-file.
   *
   * Upload the Template content as tar-file.
   *
   * @param uploadTemplateTarInWorkspaceOptions the {@link UploadTemplateTarInWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Template}
   */
  public ServiceCall<Template> uploadTemplateTarInWorkspace(UploadTemplateTarInWorkspaceOptions uploadTemplateTarInWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(uploadTemplateTarInWorkspaceOptions,
      "uploadTemplateTarInWorkspaceOptions cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.isTrue((uploadTemplateTarInWorkspaceOptions.tarFile() != null), "At least one of  or tarFile must be supplied.");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", uploadTemplateTarInWorkspaceOptions.workspaceId());
    pathParamsMap.put("template_id", uploadTemplateTarInWorkspaceOptions.templateId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/templates/{template_id}/content", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "uploadTemplateTarInWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (uploadTemplateTarInWorkspaceOptions.xGithubToken() != null) {
      builder.header("X-Github-token", uploadTemplateTarInWorkspaceOptions.xGithubToken());
    }
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    if (uploadTemplateTarInWorkspaceOptions.tarFile() != null) {
      okhttp3.RequestBody tarFileBody = RequestUtils.inputStreamBody(uploadTemplateTarInWorkspaceOptions.tarFile(), uploadTemplateTarInWorkspaceOptions.tarFileContentType());
      multipartBuilder.addFormDataPart("tar_file", "filename", tarFileBody);
    }
    builder.body(multipartBuilder.build());
    ResponseConverter<Template> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Template>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the Templates Readme file.
   *
   * Get the Readme file from the Template in the Workspace.
   *
   * @param getTemplateReadmeOptions the {@link GetTemplateReadmeOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link String}
   */
  public ServiceCall<String> getTemplateReadme(GetTemplateReadmeOptions getTemplateReadmeOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTemplateReadmeOptions,
      "getTemplateReadmeOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", getTemplateReadmeOptions.workspaceId());
    pathParamsMap.put("template_id", getTemplateReadmeOptions.templateId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/templates/{template_id}/readme", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getTemplateReadme");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (getTemplateReadmeOptions.accept() != null) {
      builder.header("Accept", getTemplateReadmeOptions.accept());
    }
    ResponseConverter<String> responseConverter = ResponseConverterUtils.getString();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the Template source details.
   *
   * Get the source details (Git repo, IBM Catalog, or other catalog sources) of the Template in the Workspace.
   *
   * @param getTemplateSourceOptions the {@link GetTemplateSourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ExternalSource}
   */
  public ServiceCall<ExternalSource> getTemplateSource(GetTemplateSourceOptions getTemplateSourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTemplateSourceOptions,
      "getTemplateSourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", getTemplateSourceOptions.workspaceId());
    pathParamsMap.put("template_id", getTemplateSourceOptions.templateId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/templates/{template_id}/source", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getTemplateSource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ExternalSource> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ExternalSource>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the Template input parameter definitions.
   *
   * Get the template input parameter definitions (variables, values, metadata) of Template in the Workspace.
   *
   * @param listTemplateInputsOptions the {@link ListTemplateInputsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VariableDataList}
   */
  public ServiceCall<VariableDataList> listTemplateInputs(ListTemplateInputsOptions listTemplateInputsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listTemplateInputsOptions,
      "listTemplateInputsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", listTemplateInputsOptions.workspaceId());
    pathParamsMap.put("template_id", listTemplateInputsOptions.templateId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/templates/{template_id}/inputs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listTemplateInputs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<VariableDataList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VariableDataList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the Template output parameter definitions.
   *
   * Get the output parameter definitions (variables, values, metadata) of Template in the Workspace.
   *
   * @param listTemplateOutputsOptions the {@link ListTemplateOutputsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VariableDataList}
   */
  public ServiceCall<VariableDataList> listTemplateOutputs(ListTemplateOutputsOptions listTemplateOutputsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listTemplateOutputsOptions,
      "listTemplateOutputsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", listTemplateOutputsOptions.workspaceId());
    pathParamsMap.put("template_id", listTemplateOutputsOptions.templateId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/templates/{template_id}/outputs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listTemplateOutputs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<VariableDataList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VariableDataList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all Flow definitions from the Workspace.
   *
   * Get list of all Flow definitions in a Workspace.
   *
   * @param listFlowsInWorkspaceOptions the {@link ListFlowsInWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateFlowList}
   */
  public ServiceCall<TemplateFlowList> listFlowsInWorkspace(ListFlowsInWorkspaceOptions listFlowsInWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listFlowsInWorkspaceOptions,
      "listFlowsInWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", listFlowsInWorkspaceOptions.workspaceId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/flows", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listFlowsInWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listFlowsInWorkspaceOptions.offset() != null) {
      builder.query("offset", String.valueOf(listFlowsInWorkspaceOptions.offset()));
    }
    if (listFlowsInWorkspaceOptions.limit() != null) {
      builder.query("limit", String.valueOf(listFlowsInWorkspaceOptions.limit()));
    }
    if (listFlowsInWorkspaceOptions.sort() != null) {
      builder.query("sort", String.valueOf(listFlowsInWorkspaceOptions.sort()));
    }
    if (listFlowsInWorkspaceOptions.profile() != null) {
      builder.query("profile", String.valueOf(listFlowsInWorkspaceOptions.profile()));
    }
    ResponseConverter<TemplateFlowList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateFlowList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Add a new Flow definition to the Workspace.
   *
   * Creates a new Flow and adds it to the Workspace.
   *
   * @param addFlowToWorkspaceOptions the {@link AddFlowToWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateFlow}
   */
  public ServiceCall<TemplateFlow> addFlowToWorkspace(AddFlowToWorkspaceOptions addFlowToWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addFlowToWorkspaceOptions,
      "addFlowToWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", addFlowToWorkspaceOptions.workspaceId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/flows", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "addFlowToWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(addFlowToWorkspaceOptions.templateFlow()), "application/json");
    ResponseConverter<TemplateFlow> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateFlow>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get Flow definition from the Workspace.
   *
   * Get specified flow details in a workspace.
   *
   * @param getFlowInWorkspaceOptions the {@link GetFlowInWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateFlow}
   */
  public ServiceCall<TemplateFlow> getFlowInWorkspace(GetFlowInWorkspaceOptions getFlowInWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getFlowInWorkspaceOptions,
      "getFlowInWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", getFlowInWorkspaceOptions.workspaceId());
    pathParamsMap.put("flow_id", getFlowInWorkspaceOptions.flowId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/flows/{flow_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getFlowInWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getFlowInWorkspaceOptions.profile() != null) {
      builder.query("profile", String.valueOf(getFlowInWorkspaceOptions.profile()));
    }
    ResponseConverter<TemplateFlow> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateFlow>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace the Flow definition in the Workspace.
   *
   * Replace the Flow definition in the Workspace.
   *
   * @param replaceFlowInWorkspaceOptions the {@link ReplaceFlowInWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateFlow}
   */
  public ServiceCall<TemplateFlow> replaceFlowInWorkspace(ReplaceFlowInWorkspaceOptions replaceFlowInWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceFlowInWorkspaceOptions,
      "replaceFlowInWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", replaceFlowInWorkspaceOptions.workspaceId());
    pathParamsMap.put("flow_id", replaceFlowInWorkspaceOptions.flowId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/flows/{flow_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "replaceFlowInWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (replaceFlowInWorkspaceOptions.templateFlow() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceFlowInWorkspaceOptions.templateFlow()), "application/json");
    }
    ResponseConverter<TemplateFlow> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateFlow>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove the Flow from the Workspace.
   *
   * Delete the flow associated with workspace;.
   *
   * @param deleteFlowFromWorkspaceOptions the {@link DeleteFlowFromWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteFlowFromWorkspace(DeleteFlowFromWorkspaceOptions deleteFlowFromWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteFlowFromWorkspaceOptions,
      "deleteFlowFromWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", deleteFlowFromWorkspaceOptions.workspaceId());
    pathParamsMap.put("flow_id", deleteFlowFromWorkspaceOptions.flowId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/flows/{flow_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "deleteFlowFromWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteFlowFromWorkspaceOptions.propagate() != null) {
      builder.header("propagate", deleteFlowFromWorkspaceOptions.propagate());
    }
    if (deleteFlowFromWorkspaceOptions.force() != null) {
      builder.header("force", deleteFlowFromWorkspaceOptions.force());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the Flow definition in the Workspace.
   *
   * Update the Flow definition in the Workspace.
   *
   * @param updateFlowInWorkspaceOptions the {@link UpdateFlowInWorkspaceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateFlow}
   */
  public ServiceCall<TemplateFlow> updateFlowInWorkspace(UpdateFlowInWorkspaceOptions updateFlowInWorkspaceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateFlowInWorkspaceOptions,
      "updateFlowInWorkspaceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", updateFlowInWorkspaceOptions.workspaceId());
    pathParamsMap.put("flow_id", updateFlowInWorkspaceOptions.flowId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/flows/{flow_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "updateFlowInWorkspace");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateFlowInWorkspaceOptions.templateFlow() != null) {
      builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateFlowInWorkspaceOptions.templateFlow()), "application/json");
    }
    ResponseConverter<TemplateFlow> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateFlow>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List actions.
   *
   * Retrieve a list of all Schematics actions that depends on the API endpoint that you have access. For example, if
   * you use an API endpoint for a geography, such as North America, only actions that are created in `us-south` or
   * `us-east` are retrieved.
   *  For more information, about supported API endpoints, see
   * [API endpoints](/apidocs/schematics#api-endpoints).
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization such as service access or
   *  platform access to an action ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions.
   *
   * @param listActionsOptions the {@link ListActionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ActionList}
   */
  public ServiceCall<ActionList> listActions(ListActionsOptions listActionsOptions) {
    if (listActionsOptions == null) {
      listActionsOptions = new ListActionsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/actions"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listActions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listActionsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listActionsOptions.offset()));
    }
    if (listActionsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listActionsOptions.limit()));
    }
    if (listActionsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listActionsOptions.sort()));
    }
    if (listActionsOptions.profile() != null) {
      builder.query("profile", String.valueOf(listActionsOptions.profile()));
    }
    ResponseConverter<ActionList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ActionList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List actions.
   *
   * Retrieve a list of all Schematics actions that depends on the API endpoint that you have access. For example, if
   * you use an API endpoint for a geography, such as North America, only actions that are created in `us-south` or
   * `us-east` are retrieved.
   *  For more information, about supported API endpoints, see
   * [API endpoints](/apidocs/schematics#api-endpoints).
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization such as service access or
   *  platform access to an action ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions.
   *
   * @return a {@link ServiceCall} with a result of type {@link ActionList}
   */
  public ServiceCall<ActionList> listActions() {
    return listActions(null);
  }

  /**
   * Create an action.
   *
   * Create an IBM Cloud Schematics action to run on a single target or groups of target hosts, roles, policies, or
   * steps to deploy your resources in the target hosts. You can run the IBM Cloud resources the order in which you want
   * to execute them. **Note** If your Git repository already contains a host file. Schematics does not overwrite the
   * host file already present in your Git repository. For sample templates, see IBM Cloud Automation
   * [templates](https://github.com/Cloud-Schematics).
   *  For more information, about the Schematics create action,
   *  see [ibmcloud schematics action
   * create](/docs/schematics?topic=schematics-schematics-cli-reference#schematics-create-action).
   *  **Note** you cannot update the location and region once an action is created.
   *  Also, make sure your IP addresses are in the [allowlist](/docs/schematics?topic=schematics-allowed-ipaddresses).
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization such as service access or
   *  platform access to an action ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions.
   *
   * @param createActionOptions the {@link CreateActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Action}
   */
  public ServiceCall<Action> createAction(CreateActionOptions createActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createActionOptions,
      "createActionOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/actions"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "createAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (createActionOptions.xGithubToken() != null) {
      builder.header("X-Github-token", createActionOptions.xGithubToken());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createActionOptions.action()), "application/json");
    ResponseConverter<Action> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Action>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get action details.
   *
   * Retrieve the detailed information of an actions from your IBM Cloud account.  This API returns a URL to the log
   * file that you can retrieve by using  the\_ `GET /v2/actions/{action_id}/logs` API.
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization such as service access or
   *  platform access to an action ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions.
   *
   * @param getActionOptions the {@link GetActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Action}
   */
  public ServiceCall<Action> getAction(GetActionOptions getActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getActionOptions,
      "getActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_id", getActionOptions.actionId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/actions/{action_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getActionOptions.profile() != null) {
      builder.query("profile", String.valueOf(getActionOptions.profile()));
    }
    ResponseConverter<Action> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Action>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete an action.
   *
   * Delete a Schematics action and specify the Ansible playbook that you want to run against your IBM Cloud resources.
   * **Note** you cannot delete or stop the job activity from an ongoing execution of an action defined in the playbook.
   * You can repeat the execution of same job, whenever you patch the actions. For more information, about the
   * Schematics action state, see [Schematics action state
   * diagram](/docs/schematics?topic=schematics-action-setup#action-state-diagram).
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization such as service access or
   *  platform access to an action ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions.
   *
   * @param deleteActionOptions the {@link DeleteActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteAction(DeleteActionOptions deleteActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteActionOptions,
      "deleteActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_id", deleteActionOptions.actionId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/actions/{action_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "deleteAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteActionOptions.force() != null) {
      builder.header("force", deleteActionOptions.force());
    }
    if (deleteActionOptions.propagate() != null) {
      builder.header("propagate", deleteActionOptions.propagate());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update an action.
   *
   * Update or replace an action to change the action state from the critical state to normal state, or pending state to
   * the normal state for a successful execution. For more information, about the Schematics action state, see
   * [Schematics action state diagram](/docs/schematics?topic=schematics-action-setup#action-state-diagram).
   *  **Note** you cannot update the location and region once an action is created.
   *  Also, make sure your IP addresses are in the [allowlist](/docs/schematics?topic=schematics-allowed-ipaddresses].
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *
   *  Schematics support generic authorization such as service access or
   *  platform access to an action ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions.
   *
   * @param updateActionOptions the {@link UpdateActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Action}
   */
  public ServiceCall<Action> updateAction(UpdateActionOptions updateActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateActionOptions,
      "updateActionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_id", updateActionOptions.actionId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/actions/{action_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "updateAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateActionOptions.xGithubToken() != null) {
      builder.header("X-Github-token", updateActionOptions.xGithubToken());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateActionOptions.action()), "application/json");
    ResponseConverter<Action> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Action>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace a TAR file to an action.
   *
   * Replace your template by uploading tape archive file (.tar) file from  your local machine. Before you use this API,
   * you must create an action  without a link to a GitHub or GitLab repository with the\_POST /v2/actions\_API.
   * &lt;h3&gt;Authorization&lt;/h3&gt;  Schematics support generic authorization such as service access or  platform
   * access to an action ID and the resource group.  For more information, about Schematics access and permissions, see
   * [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions.
   *
   * @param uploadTemplateTarActionOptions the {@link UploadTemplateTarActionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateRepoTarUploadResponse}
   */
  public ServiceCall<TemplateRepoTarUploadResponse> uploadTemplateTarAction(UploadTemplateTarActionOptions uploadTemplateTarActionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(uploadTemplateTarActionOptions,
      "uploadTemplateTarActionOptions cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.isTrue((uploadTemplateTarActionOptions.file() != null), "At least one of  or file must be supplied.");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("action_id", uploadTemplateTarActionOptions.actionId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/actions/{action_id}/template_repo_upload", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "uploadTemplateTarAction");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    MultipartBody.Builder multipartBuilder = new MultipartBody.Builder();
    multipartBuilder.setType(MultipartBody.FORM);
    if (uploadTemplateTarActionOptions.file() != null) {
      okhttp3.RequestBody fileBody = RequestUtils.inputStreamBody(uploadTemplateTarActionOptions.file(), uploadTemplateTarActionOptions.fileContentType());
      multipartBuilder.addFormDataPart("file", "filename", fileBody);
    }
    builder.body(multipartBuilder.build());
    ResponseConverter<TemplateRepoTarUploadResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateRepoTarUploadResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List jobs.
   *
   * Retrieve a list of all Schematics jobs.  The job displays a list of jobs with the status as `in_progess`,
   * `success`, or `failed`. Jobs are generated when you use the  `POST /v2/jobs`, `PUT /v2/jobs/{job_id}`, or `DELETE
   * /v2/jobs/{job_id}`.
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *  Schematics support generic authorization such as service access or
   *  platform access to the job ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required permissions](/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param listJobsOptions the {@link ListJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JobList}
   */
  public ServiceCall<JobList> listJobs(ListJobsOptions listJobsOptions) {
    if (listJobsOptions == null) {
      listJobsOptions = new ListJobsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listJobs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listJobsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listJobsOptions.offset()));
    }
    if (listJobsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listJobsOptions.limit()));
    }
    if (listJobsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listJobsOptions.sort()));
    }
    if (listJobsOptions.profile() != null) {
      builder.query("profile", String.valueOf(listJobsOptions.profile()));
    }
    if (listJobsOptions.resource() != null) {
      builder.query("resource", String.valueOf(listJobsOptions.resource()));
    }
    if (listJobsOptions.resourceId() != null) {
      builder.query("resource_id", String.valueOf(listJobsOptions.resourceId()));
    }
    if (listJobsOptions.actionId() != null) {
      builder.query("action_id", String.valueOf(listJobsOptions.actionId()));
    }
    if (listJobsOptions.list() != null) {
      builder.query("list", String.valueOf(listJobsOptions.list()));
    }
    ResponseConverter<JobList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JobList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List jobs.
   *
   * Retrieve a list of all Schematics jobs.  The job displays a list of jobs with the status as `in_progess`,
   * `success`, or `failed`. Jobs are generated when you use the  `POST /v2/jobs`, `PUT /v2/jobs/{job_id}`, or `DELETE
   * /v2/jobs/{job_id}`.
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *  Schematics support generic authorization such as service access or
   *  platform access to the job ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required permissions](/docs/schematics?topic=schematics-access#access-roles).
   *
   * @return a {@link ServiceCall} with a result of type {@link JobList}
   */
  public ServiceCall<JobList> listJobs() {
    return listJobs(null);
  }

  /**
   * Create a job.
   *
   * Create a job and launch the job.
   *
   * @param createJobOptions the {@link CreateJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Job}
   */
  public ServiceCall<Job> createJob(CreateJobOptions createJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createJobOptions,
      "createJobOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "createJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", createJobOptions.refreshToken());
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createJobOptions.job()), "application/json");
    ResponseConverter<Job> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Job>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a job.
   *
   * Retrieve the detailed information of Job
   *
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *  Schematics support generic authorization such as service access or
   *  platform access to the job ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required permissions](/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getJobOptions the {@link GetJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Job}
   */
  public ServiceCall<Job> getJob(GetJobOptions getJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getJobOptions,
      "getJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", getJobOptions.jobId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getJobOptions.profile() != null) {
      builder.query("profile", String.valueOf(getJobOptions.profile()));
    }
    ResponseConverter<Job> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Job>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Clone the Job, and relaunch the Job.
   *
   * Update or replace a job creates a copy of the job and relaunches an existing job by updating the information of an
   * existing Schematics job.
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *  Schematics support generic authorization such as service access or
   *  platform access to the job ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required permissions](/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param updateJobOptions the {@link UpdateJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Job}
   */
  public ServiceCall<Job> updateJob(UpdateJobOptions updateJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateJobOptions,
      "updateJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", updateJobOptions.jobId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "updateJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.header("refresh_token", updateJobOptions.refreshToken());
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateJobOptions.job()), "application/json");
    ResponseConverter<Job> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Job>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Stop the running Job, and delete the Job.
   *
   * Stop the running Job, and delete the Job.  **Note** You cannot delete or stop the job activity from an ongoing
   * execution of an action defined in the playbook.  You can repeat the execution of same job, whenever you patch or
   * update the action or workspace.
   *  &lt;h3&gt;Authorization&lt;/h3&gt;
   *  Schematics support generic authorization such as service access or
   *  platform access to the job ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required permissions](/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param deleteJobOptions the {@link DeleteJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteJob(DeleteJobOptions deleteJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteJobOptions,
      "deleteJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", deleteJobOptions.jobId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "deleteJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("refresh_token", deleteJobOptions.refreshToken());
    if (deleteJobOptions.force() != null) {
      builder.header("force", deleteJobOptions.force());
    }
    if (deleteJobOptions.propagate() != null) {
      builder.header("propagate", deleteJobOptions.propagate());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get job logs.
   *
   * Retrieve the job logs
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization such as service access or  platform
   * access to the action ID and the resource group.  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required permissions](/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param listJobLogsOptions the {@link ListJobLogsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JobLog}
   */
  public ServiceCall<JobLog> listJobLogs(ListJobLogsOptions listJobLogsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listJobLogsOptions,
      "listJobLogsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", listJobLogsOptions.jobId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs/{job_id}/logs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listJobLogs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<JobLog> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JobLog>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get state-data from the Job record.
   *
   * Get state-data from the Job record.
   *
   * @param listJobStatesOptions the {@link ListJobStatesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JobStateData}
   */
  public ServiceCall<JobStateData> listJobStates(ListJobStatesOptions listJobStatesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listJobStatesOptions,
      "listJobStatesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", listJobStatesOptions.jobId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs/{job_id}/states", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listJobStates");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<JobStateData> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JobStateData>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all Controls definition.
   *
   * Get all Controls definition.
   *
   * @param listControlsOptions the {@link ListControlsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ControlsList}
   */
  public ServiceCall<ControlsList> listControls(ListControlsOptions listControlsOptions) {
    if (listControlsOptions == null) {
      listControlsOptions = new ListControlsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/controls"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listControls");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listControlsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listControlsOptions.offset()));
    }
    if (listControlsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listControlsOptions.limit()));
    }
    if (listControlsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listControlsOptions.sort()));
    }
    if (listControlsOptions.profile() != null) {
      builder.query("profile", String.valueOf(listControlsOptions.profile()));
    }
    ResponseConverter<ControlsList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ControlsList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all Controls definition.
   *
   * Get all Controls definition.
   *
   * @return a {@link ServiceCall} with a result of type {@link ControlsList}
   */
  public ServiceCall<ControlsList> listControls() {
    return listControls(null);
  }

  /**
   * Register a new Controls definition.
   *
   * Create a new Controls definition.
   *
   * @param createControlsOptions the {@link CreateControlsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Controls}
   */
  public ServiceCall<Controls> createControls(CreateControlsOptions createControlsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createControlsOptions,
      "createControlsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/controls"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "createControls");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createControlsOptions.controls()), "application/json");
    ResponseConverter<Controls> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Controls>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the Controls definition.
   *
   * Get the Controls definition.
   *
   * @param getControlsOptions the {@link GetControlsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Controls}
   */
  public ServiceCall<Controls> getControls(GetControlsOptions getControlsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getControlsOptions,
      "getControlsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("controls_id", getControlsOptions.controlsId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/controls/{controls_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getControls");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getControlsOptions.profile() != null) {
      builder.query("profile", String.valueOf(getControlsOptions.profile()));
    }
    ResponseConverter<Controls> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Controls>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete the Controls definition.
   *
   * Delete the Controls definition.
   *
   * @param deleteControlsOptions the {@link DeleteControlsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteControls(DeleteControlsOptions deleteControlsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteControlsOptions,
      "deleteControlsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("controls_id", deleteControlsOptions.controlsId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/controls/{controls_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "deleteControls");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteControlsOptions.force() != null) {
      builder.header("force", deleteControlsOptions.force());
    }
    if (deleteControlsOptions.propagate() != null) {
      builder.header("propagate", deleteControlsOptions.propagate());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the Controls definition.
   *
   * Update the Controls definition.
   *
   * @param updateControlsOptions the {@link UpdateControlsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Controls}
   */
  public ServiceCall<Controls> updateControls(UpdateControlsOptions updateControlsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateControlsOptions,
      "updateControlsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("controls_id", updateControlsOptions.controlsId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/controls/{controls_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "updateControls");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateControlsOptions.controls()), "application/json");
    ResponseConverter<Controls> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Controls>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all Policy Capsules in the Controls definition.
   *
   * Get all Policy Capsules in the Controls definition.
   *
   * @param listCapsulesOptions the {@link ListCapsulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CapsuleList}
   */
  public ServiceCall<CapsuleList> listCapsules(ListCapsulesOptions listCapsulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listCapsulesOptions,
      "listCapsulesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("controls_id", listCapsulesOptions.controlsId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/controls/{controls_id}/capsules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listCapsules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listCapsulesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listCapsulesOptions.offset()));
    }
    if (listCapsulesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listCapsulesOptions.limit()));
    }
    if (listCapsulesOptions.sort() != null) {
      builder.query("sort", String.valueOf(listCapsulesOptions.sort()));
    }
    if (listCapsulesOptions.profile() != null) {
      builder.query("profile", String.valueOf(listCapsulesOptions.profile()));
    }
    ResponseConverter<CapsuleList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CapsuleList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Register a Policy Capsule to the Controls definition.
   *
   * Create a Policy Capsule in the Controls definition.
   *
   * @param createCapsuleOptions the {@link CreateCapsuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CapsuleList}
   */
  public ServiceCall<CapsuleList> createCapsule(CreateCapsuleOptions createCapsuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createCapsuleOptions,
      "createCapsuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("controls_id", createCapsuleOptions.controlsId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/controls/{controls_id}/capsules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "createCapsule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createCapsuleOptions.capsule()), "application/json");
    ResponseConverter<CapsuleList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CapsuleList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get Policy Capsule from the Controls definition.
   *
   * Get Policy Capsule from the Controls definition.
   *
   * @param getCapsuleOptions the {@link GetCapsuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Capsule}
   */
  public ServiceCall<Capsule> getCapsule(GetCapsuleOptions getCapsuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getCapsuleOptions,
      "getCapsuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("controls_id", getCapsuleOptions.controlsId());
    pathParamsMap.put("capsule_id", getCapsuleOptions.capsuleId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/controls/{controls_id}/capsules/{capsule_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getCapsule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getCapsuleOptions.profile() != null) {
      builder.query("profile", String.valueOf(getCapsuleOptions.profile()));
    }
    ResponseConverter<Capsule> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Capsule>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Unregister the Policy Capsule from the Controls.
   *
   * Delete the Policy Capsule from the Controls.
   *
   * @param deleteCapsuleOptions the {@link DeleteCapsuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteCapsule(DeleteCapsuleOptions deleteCapsuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteCapsuleOptions,
      "deleteCapsuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("controls_id", deleteCapsuleOptions.controlsId());
    pathParamsMap.put("capsule_id", deleteCapsuleOptions.capsuleId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/controls/{controls_id}/capsules/{capsule_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "deleteCapsule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the Policy Capsule in the Controls definition.
   *
   * Update the Policy Capsule in the Controls definition.
   *
   * @param updateCapsuleOptions the {@link UpdateCapsuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Capsule}
   */
  public ServiceCall<Capsule> updateCapsule(UpdateCapsuleOptions updateCapsuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateCapsuleOptions,
      "updateCapsuleOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("controls_id", updateCapsuleOptions.controlsId());
    pathParamsMap.put("capsule_id", updateCapsuleOptions.capsuleId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/controls/{controls_id}/capsules/{capsule_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "updateCapsule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateCapsuleOptions.capsule()), "application/json");
    ResponseConverter<Capsule> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Capsule>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all shared datasets.
   *
   * Get all shared datasets.
   *
   * @param listDatasetsOptions the {@link ListDatasetsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DatasetList}
   */
  public ServiceCall<DatasetList> listDatasets(ListDatasetsOptions listDatasetsOptions) {
    if (listDatasetsOptions == null) {
      listDatasetsOptions = new ListDatasetsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/datasets"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listDatasets");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listDatasetsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listDatasetsOptions.offset()));
    }
    if (listDatasetsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDatasetsOptions.limit()));
    }
    if (listDatasetsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listDatasetsOptions.sort()));
    }
    if (listDatasetsOptions.profile() != null) {
      builder.query("profile", String.valueOf(listDatasetsOptions.profile()));
    }
    ResponseConverter<DatasetList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DatasetList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all shared datasets.
   *
   * Get all shared datasets.
   *
   * @return a {@link ServiceCall} with a result of type {@link DatasetList}
   */
  public ServiceCall<DatasetList> listDatasets() {
    return listDatasets(null);
  }

  /**
   * Create a shared dataset.
   *
   * Create a shared dataset.
   *
   * @param createDatasetOptions the {@link CreateDatasetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Dataset}
   */
  public ServiceCall<Dataset> createDataset(CreateDatasetOptions createDatasetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDatasetOptions,
      "createDatasetOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/datasets"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "createDataset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createDatasetOptions.dataset()), "application/json");
    ResponseConverter<Dataset> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Dataset>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the shared dataset.
   *
   * Get the Shared dataset.
   *
   * @param getDatasetOptions the {@link GetDatasetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Dataset}
   */
  public ServiceCall<Dataset> getDataset(GetDatasetOptions getDatasetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDatasetOptions,
      "getDatasetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("dataset_id", getDatasetOptions.datasetId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/datasets/{dataset_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getDataset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Dataset> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Dataset>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace the shared dataset.
   *
   * Replace the shared dataset.
   *
   * @param replaceDatasetOptions the {@link ReplaceDatasetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Dataset}
   */
  public ServiceCall<Dataset> replaceDataset(ReplaceDatasetOptions replaceDatasetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceDatasetOptions,
      "replaceDatasetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("dataset_id", replaceDatasetOptions.datasetId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/datasets/{dataset_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "replaceDataset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceDatasetOptions.dataset()), "application/json");
    ResponseConverter<Dataset> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Dataset>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete the Shared dataset.
   *
   * Delete the shared dataset.
   *
   * @param deleteDatasetOptions the {@link DeleteDatasetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDataset(DeleteDatasetOptions deleteDatasetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDatasetOptions,
      "deleteDatasetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("dataset_id", deleteDatasetOptions.datasetId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/datasets/{dataset_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "deleteDataset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteDatasetOptions.force() != null) {
      builder.header("force", deleteDatasetOptions.force());
    }
    if (deleteDatasetOptions.propagate() != null) {
      builder.header("propagate", deleteDatasetOptions.propagate());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the shared dataset.
   *
   * Update the shared dataset details.
   *
   * @param updateAtasetOptions the {@link UpdateAtasetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Dataset}
   */
  public ServiceCall<Dataset> updateAtaset(UpdateAtasetOptions updateAtasetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateAtasetOptions,
      "updateAtasetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("dataset_id", updateAtasetOptions.datasetId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/datasets/{dataset_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "updateAtaset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateAtasetOptions.dataset()), "application/json");
    ResponseConverter<Dataset> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Dataset>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all the Shared dataset variable definitions.
   *
   * Get all the shared dataset variable definitions (variables, values, metadata).
   *
   * @param listDatasetVariablesOptions the {@link ListDatasetVariablesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VariableDataList}
   */
  public ServiceCall<VariableDataList> listDatasetVariables(ListDatasetVariablesOptions listDatasetVariablesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDatasetVariablesOptions,
      "listDatasetVariablesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("dataset_id", listDatasetVariablesOptions.datasetId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/datasets/{dataset_id}/variables", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listDatasetVariables");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<VariableDataList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VariableDataList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the Shared dataset.
   *
   * Get the shared dataset.
   *
   * @param getDatasetVariableOptions the {@link GetDatasetVariableOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VariableData}
   */
  public ServiceCall<VariableData> getDatasetVariable(GetDatasetVariableOptions getDatasetVariableOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDatasetVariableOptions,
      "getDatasetVariableOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("dataset_id", getDatasetVariableOptions.datasetId());
    pathParamsMap.put("var_name", getDatasetVariableOptions.varName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/datasets/{dataset_id}/values/{var_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getDatasetVariable");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<VariableData> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VariableData>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all credentials.
   *
   * Get all credentials.
   *
   * @param listCredentialsOptions the {@link ListCredentialsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CredentialList}
   */
  public ServiceCall<CredentialList> listCredentials(ListCredentialsOptions listCredentialsOptions) {
    if (listCredentialsOptions == null) {
      listCredentialsOptions = new ListCredentialsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/credentials"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listCredentials");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listCredentialsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listCredentialsOptions.offset()));
    }
    if (listCredentialsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listCredentialsOptions.limit()));
    }
    if (listCredentialsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listCredentialsOptions.sort()));
    }
    if (listCredentialsOptions.profile() != null) {
      builder.query("profile", String.valueOf(listCredentialsOptions.profile()));
    }
    ResponseConverter<CredentialList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CredentialList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all credentials.
   *
   * Get all credentials.
   *
   * @return a {@link ServiceCall} with a result of type {@link CredentialList}
   */
  public ServiceCall<CredentialList> listCredentials() {
    return listCredentials(null);
  }

  /**
   * Create a credential entry.
   *
   * Create a credential entry.
   *
   * @param createCredentialOptions the {@link CreateCredentialOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Credentialset}
   */
  public ServiceCall<Credentialset> createCredential(CreateCredentialOptions createCredentialOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createCredentialOptions,
      "createCredentialOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/credentials"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "createCredential");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createCredentialOptions.credentialset()), "application/json");
    ResponseConverter<Credentialset> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Credentialset>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the credential entry.
   *
   * Get the credential entry.
   *
   * @param getCredentialOptions the {@link GetCredentialOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Credentialset}
   */
  public ServiceCall<Credentialset> getCredential(GetCredentialOptions getCredentialOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getCredentialOptions,
      "getCredentialOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("creds_id", getCredentialOptions.credsId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/credentials/{creds_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getCredential");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Credentialset> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Credentialset>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace the credential entry.
   *
   * Replace the credential entry.
   *
   * @param replaceCredentialOptions the {@link ReplaceCredentialOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Credentialset}
   */
  public ServiceCall<Credentialset> replaceCredential(ReplaceCredentialOptions replaceCredentialOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceCredentialOptions,
      "replaceCredentialOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("creds_id", replaceCredentialOptions.credsId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/credentials/{creds_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "replaceCredential");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceCredentialOptions.credentialset()), "application/json");
    ResponseConverter<Credentialset> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Credentialset>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete the credential entry.
   *
   * Delete the credential entry.
   *
   * @param deleteCredentialOptions the {@link DeleteCredentialOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteCredential(DeleteCredentialOptions deleteCredentialOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteCredentialOptions,
      "deleteCredentialOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("creds_id", deleteCredentialOptions.credsId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/credentials/{creds_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "deleteCredential");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteCredentialOptions.force() != null) {
      builder.header("force", deleteCredentialOptions.force());
    }
    if (deleteCredentialOptions.propagate() != null) {
      builder.header("propagate", deleteCredentialOptions.propagate());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the credential entry.
   *
   * Update the credential entry.
   *
   * @param updateCredentialOptions the {@link UpdateCredentialOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Credentialset}
   */
  public ServiceCall<Credentialset> updateCredential(UpdateCredentialOptions updateCredentialOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateCredentialOptions,
      "updateCredentialOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("creds_id", updateCredentialOptions.credsId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/credentials/{creds_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "updateCredential");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateCredentialOptions.credentialset()), "application/json");
    ResponseConverter<Credentialset> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Credentialset>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all the credential variable definitions.
   *
   * Get all the credential variable definitions.
   *
   * @param listCredentialValuesOptions the {@link ListCredentialValuesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VariableDataList}
   */
  public ServiceCall<VariableDataList> listCredentialValues(ListCredentialValuesOptions listCredentialValuesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listCredentialValuesOptions,
      "listCredentialValuesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("creds_id", listCredentialValuesOptions.credsId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/credentials/{creds_id}/variables", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listCredentialValues");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<VariableDataList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VariableDataList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the credential variable definition.
   *
   * Get the credential variable definition (variables, values, metadata).
   *
   * @param getCredentialValueOptions the {@link GetCredentialValueOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link VariableData}
   */
  public ServiceCall<VariableData> getCredentialValue(GetCredentialValueOptions getCredentialValueOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getCredentialValueOptions,
      "getCredentialValueOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("creds_id", getCredentialValueOptions.credsId());
    pathParamsMap.put("var_name", getCredentialValueOptions.varName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/credentials/{creds_id}/variables/{var_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getCredentialValue");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<VariableData> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<VariableData>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List inventories.
   *
   * Retrieve a list of all Schematics inventories that depends on the API endpoint that you have access. For example,
   * if you use an API endpoint for a geography, such as North America, only inventories that are created in `us-south`
   * or `us-east` are retrieved. For more information, about supported API endpoints, see [API
   * endpoints](/apidocs/schematics#api-endpoints).
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization such as service access or platform
   * access to an action ID and the resource group. For more information, about Schematics access and permissions, see
   * [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param listInventoriesOptions the {@link ListInventoriesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecordList}
   */
  public ServiceCall<InventoryResourceRecordList> listInventories(ListInventoriesOptions listInventoriesOptions) {
    if (listInventoriesOptions == null) {
      listInventoriesOptions = new ListInventoriesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listInventories");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listInventoriesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listInventoriesOptions.offset()));
    }
    if (listInventoriesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listInventoriesOptions.limit()));
    }
    if (listInventoriesOptions.sort() != null) {
      builder.query("sort", String.valueOf(listInventoriesOptions.sort()));
    }
    if (listInventoriesOptions.profile() != null) {
      builder.query("profile", String.valueOf(listInventoriesOptions.profile()));
    }
    ResponseConverter<InventoryResourceRecordList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InventoryResourceRecordList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List inventories.
   *
   * Retrieve a list of all Schematics inventories that depends on the API endpoint that you have access. For example,
   * if you use an API endpoint for a geography, such as North America, only inventories that are created in `us-south`
   * or `us-east` are retrieved. For more information, about supported API endpoints, see [API
   * endpoints](/apidocs/schematics#api-endpoints).
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization such as service access or platform
   * access to an action ID and the resource group. For more information, about Schematics access and permissions, see
   * [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecordList}
   */
  public ServiceCall<InventoryResourceRecordList> listInventories() {
    return listInventories(null);
  }

  /**
   * Create an inventory.
   *
   * Create an IBM Cloud Schematics inventory as a single IBM Cloud resource where you want to run Ansible playbook by
   * using Schematics actions. For more information, about inventory host groups, refer to [creating static and dynamic
   * inventory for Schematics actions](/docs/schematics?topic=schematics-inventories-setup). **Note** you cannot update
   * the location and region, resource group once an action is created.  Also, make sure your IP addresses are in the
   * [allowlist](/docs/schematics?topic=schematics-allowed-ipaddresses).  If your Git repository already contains a host
   * file. Schematics does not  overwrite the host file already present in your Git repository.
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization such as service access or platform
   * access to an action ID and the resource group. For more information, about Schematics access and permissions, see
   * [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param createInventoryOptions the {@link CreateInventoryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecord}
   */
  public ServiceCall<InventoryResourceRecord> createInventory(CreateInventoryOptions createInventoryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createInventoryOptions,
      "createInventoryOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "createInventory");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createInventoryOptions.inventoryResourceDefinition()), "application/json");
    ResponseConverter<InventoryResourceRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InventoryResourceRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get inventory definition resource.
   *
   * Use this API to retrieve the detailed information for a resource inventory definition used to target an action in
   * your IBM Cloud account. For more information, about inventory get, refer to [ibmcloud schematics inventory
   * get](/docs/schematics?topic=schematics-schematics-cli-reference#schematics-get-inv). **Note** you can fetch only
   * the location and region, resource group from where your inventory is created.
   *  Also, make sure your IP addresses are in the [allowlist](/docs/schematics?topic=schematics-allowed-ipaddresses).
   *
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization such as service access or platform
   * access to an action ID and the resource group. For more information, about Schematics access and permissions, see
   * [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param getInventoryOptions the {@link GetInventoryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecord}
   */
  public ServiceCall<InventoryResourceRecord> getInventory(GetInventoryOptions getInventoryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInventoryOptions,
      "getInventoryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("inventory_id", getInventoryOptions.inventoryId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories/{inventory_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getInventory");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<InventoryResourceRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InventoryResourceRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace an inventory.
   *
   * Use this API to update the inventory definition resource used to target an action. For more information, about
   * inventory update, refer to [ibmcloud schematics inventory
   * update](/docs/schematics?topic=schematics-schematics-cli-reference#schematics-update-inv). **Note** you cannot
   * update the location and region, resource group once an action is created.
   *  Also, make sure your IP addresses are in the [allowlist](/docs/schematics?topic=schematics-allowed-ipaddresses).
   *
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization such as service access or platform
   * access to an action ID and the resource group. For more information, about Schematics access and permissions, see
   * [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param replaceInventoryOptions the {@link ReplaceInventoryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecord}
   */
  public ServiceCall<InventoryResourceRecord> replaceInventory(ReplaceInventoryOptions replaceInventoryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceInventoryOptions,
      "replaceInventoryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("inventory_id", replaceInventoryOptions.inventoryId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories/{inventory_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "replaceInventory");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceInventoryOptions.inventoryResourceDefinition()), "application/json");
    ResponseConverter<InventoryResourceRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InventoryResourceRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete inventory definition resource.
   *
   * Use this API to delete the resource inventory definition by using the inventory ID that you want to run against.
   * For more information, about inventory delete, refer to [ibmcloud schematics inventory
   * delete](/docs/schematics?topic=schematics-schematics-cli-reference#schematics-delete-inventory). **Note** you
   * cannot delete the location and region, resource group from where your inventory is created.
   *  Also, make sure your IP addresses are in the [allowlist](/docs/schematics?topic=schematics-allowed-ipaddresses).
   *
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization such as service access or platform
   * access to an action ID and the resource group. For more information, about Schematics access and permissions, see
   * [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param deleteInventoryOptions the {@link DeleteInventoryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteInventory(DeleteInventoryOptions deleteInventoryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteInventoryOptions,
      "deleteInventoryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("inventory_id", deleteInventoryOptions.inventoryId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories/{inventory_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "deleteInventory");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteInventoryOptions.force() != null) {
      builder.header("force", deleteInventoryOptions.force());
    }
    if (deleteInventoryOptions.propagate() != null) {
      builder.header("propagate", deleteInventoryOptions.propagate());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the inventory definition resource.
   *
   * Update the resource inventory definition.
   *
   * @param updateInventoryOptions the {@link UpdateInventoryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InventoryResourceRecord}
   */
  public ServiceCall<InventoryResourceRecord> updateInventory(UpdateInventoryOptions updateInventoryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateInventoryOptions,
      "updateInventoryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("inventory_id", updateInventoryOptions.inventoryId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories/{inventory_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "updateInventory");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateInventoryOptions.inventoryResourceDefinition()), "application/json");
    ResponseConverter<InventoryResourceRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InventoryResourceRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List resource queries.
   *
   * Retrieve the list of resource query definitions that you have access to.  The list of resource queries that is
   * returned depends on the API  endpoint that you use. For example, if you use an API endpoint for a geography, such
   * as North America, only resource query definitions that are created in `us-south` or `us-east` are retrieved. For
   * more information, about supported API endpoints, see [API endpoints](/apidocs/schematics#api-endpoints).
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization such as service access or platform
   * access to an action ID and the resource group. For more information, about Schematics access and permissions,  see
   * [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param listResourceQueryOptions the {@link ListResourceQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryRecordList}
   */
  public ServiceCall<ResourceQueryRecordList> listResourceQuery(ListResourceQueryOptions listResourceQueryOptions) {
    if (listResourceQueryOptions == null) {
      listResourceQueryOptions = new ListResourceQueryOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/resources_query"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listResourceQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listResourceQueryOptions.offset() != null) {
      builder.query("offset", String.valueOf(listResourceQueryOptions.offset()));
    }
    if (listResourceQueryOptions.limit() != null) {
      builder.query("limit", String.valueOf(listResourceQueryOptions.limit()));
    }
    if (listResourceQueryOptions.sort() != null) {
      builder.query("sort", String.valueOf(listResourceQueryOptions.sort()));
    }
    if (listResourceQueryOptions.profile() != null) {
      builder.query("profile", String.valueOf(listResourceQueryOptions.profile()));
    }
    ResponseConverter<ResourceQueryRecordList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceQueryRecordList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List resource queries.
   *
   * Retrieve the list of resource query definitions that you have access to.  The list of resource queries that is
   * returned depends on the API  endpoint that you use. For example, if you use an API endpoint for a geography, such
   * as North America, only resource query definitions that are created in `us-south` or `us-east` are retrieved. For
   * more information, about supported API endpoints, see [API endpoints](/apidocs/schematics#api-endpoints).
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization such as service access or platform
   * access to an action ID and the resource group. For more information, about Schematics access and permissions,  see
   * [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryRecordList}
   */
  public ServiceCall<ResourceQueryRecordList> listResourceQuery() {
    return listResourceQuery(null);
  }

  /**
   * Create resource query.
   *
   * Use this API to create a resource query definition that will be used to select an IBM Cloud resource or a group of
   * resources as the dynamic inventory for the Schematics Actions. For more information, about resource query commands,
   * refer to  [ibmcloud schematics resource query
   * create](/docs/schematics?topic=schematics-schematics-cli-reference#schematics-create-rq).  **Note** you cannot
   * update the location and region, resource group  once an action is created. Also, make sure your IP addresses are
   * in the [allowlist](/docs/schematics?topic=schematics-allowed-ipaddresses). If your Git repository already contains
   * a host file.  Schematics does not overwrite the host file already present in your Git repository.
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization such as service access or platform
   * access to an action ID and the resource group. For more information, about Schematics access and permissions,  see
   * [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param createResourceQueryOptions the {@link CreateResourceQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryRecord}
   */
  public ServiceCall<ResourceQueryRecord> createResourceQuery(CreateResourceQueryOptions createResourceQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createResourceQueryOptions,
      "createResourceQueryOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/resources_query"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "createResourceQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createResourceQueryOptions.resourceQueryDefinition()), "application/json");
    ResponseConverter<ResourceQueryRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceQueryRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get resources query.
   *
   * Use this API to retrieve the information resource query by Id.  For more information, about resource query
   * commands, refer to  [ibmcloud schematics resource query
   * get](/docs/schematics?topic=schematics-schematics-cli-reference#schematics-get-rq).
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization such as service access or platform
   * access to an action ID and the resource group. For more information, about Schematics access and permissions,  see
   * [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param getResourcesQueryOptions the {@link GetResourcesQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryRecord}
   */
  public ServiceCall<ResourceQueryRecord> getResourcesQuery(GetResourcesQueryOptions getResourcesQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getResourcesQueryOptions,
      "getResourcesQueryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("query_id", getResourcesQueryOptions.queryId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/resources_query/{query_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getResourcesQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ResourceQueryRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceQueryRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace resources query definition.
   *
   * Use this API to replace the resource query definition used to build  the dynamic inventory for the Schematics
   * Action.  For more information, about resource query commands, refer to [ibmcloud schematics resource query
   * update](/docs/schematics?topic=schematics-schematics-cli-reference#schematics-update-rq).
   * **Note** you cannot update the location and region, resource group  once a resource query is created. Also, make
   * sure your IP addresses  are in the [allowlist](/docs/schematics?topic=schematics-allowed-ipaddresses).
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization such as service access or platform
   * access to an action ID and the resource group. For more information, about Schematics access and permissions,  see
   * [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param replaceResourcesQueryOptions the {@link ReplaceResourcesQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryRecord}
   */
  public ServiceCall<ResourceQueryRecord> replaceResourcesQuery(ReplaceResourcesQueryOptions replaceResourcesQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceResourcesQueryOptions,
      "replaceResourcesQueryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("query_id", replaceResourcesQueryOptions.queryId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/resources_query/{query_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "replaceResourcesQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceResourcesQueryOptions.resourceQueryDefinition()), "application/json");
    ResponseConverter<ResourceQueryRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceQueryRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Run the resource query.
   *
   * Run the resource query.
   *
   * @param executeResourceQueryOptions the {@link ExecuteResourceQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResourceQueryResponseRecord}
   */
  public ServiceCall<ResourceQueryResponseRecord> executeResourceQuery(ExecuteResourceQueryOptions executeResourceQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(executeResourceQueryOptions,
      "executeResourceQueryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("query_id", executeResourceQueryOptions.queryId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/resources_query/{query_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "executeResourceQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ResourceQueryResponseRecord> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResourceQueryResponseRecord>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete resources query.
   *
   * Use this API to delete the resource query definition by Id.  For more information, about resource query commands,
   * refer to  [ibmcloud schematics resource query
   * delete](/docs/schematics?topic=schematics-schematics-cli-reference#schematics-delete-resource-query).
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization such as service access or platform
   * access to an action ID and the resource group. For more information, about Schematics access and permissions,  see
   * [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param deleteResourcesQueryOptions the {@link DeleteResourcesQueryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteResourcesQuery(DeleteResourcesQueryOptions deleteResourcesQueryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteResourcesQueryOptions,
      "deleteResourcesQueryOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("query_id", deleteResourcesQueryOptions.queryId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/resources_query/{query_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "deleteResourcesQuery");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteResourcesQueryOptions.force() != null) {
      builder.header("force", deleteResourcesQueryOptions.force());
    }
    if (deleteResourcesQueryOptions.propagate() != null) {
      builder.header("propagate", deleteResourcesQueryOptions.propagate());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Shared dataset value for {var_name}.
   *
   * Get the Shared dataset value for {var_name}; "$$D(dataset_id):$$V(var_name)".
   *
   * @param getDatasetVariableValueOptions the {@link GetDatasetVariableValueOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ValueResponse}
   */
  public ServiceCall<ValueResponse> getDatasetVariableValue(GetDatasetVariableValueOptions getDatasetVariableValueOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDatasetVariableValueOptions,
      "getDatasetVariableValueOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("dataset_id", getDatasetVariableValueOptions.datasetId());
    pathParamsMap.put("var_name", getDatasetVariableValueOptions.varName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/datasets/{dataset_id}/values/{var_name}/value", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getDatasetVariableValue");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ValueResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ValueResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the credential value for {var_name}.
   *
   * Get the credential value for {var_name}; "$$C(creds_id):$$V(var_name)".
   *
   * @param getCredentialVariableValueOptions the {@link GetCredentialVariableValueOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ValueResponse}
   */
  public ServiceCall<ValueResponse> getCredentialVariableValue(GetCredentialVariableValueOptions getCredentialVariableValueOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getCredentialVariableValueOptions,
      "getCredentialVariableValueOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("creds_id", getCredentialVariableValueOptions.credsId());
    pathParamsMap.put("var_name", getCredentialVariableValueOptions.varName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/credentials/{creds_id}/variables/{var_name}/value", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getCredentialVariableValue");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ValueResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ValueResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the resource ids for {var_name}.
   *
   * Get the resource ids for {var_name}.
   *
   * @param getInventoryVariableValueOptions the {@link GetInventoryVariableValueOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ValueListResponse}
   */
  public ServiceCall<ValueListResponse> getInventoryVariableValue(GetInventoryVariableValueOptions getInventoryVariableValueOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getInventoryVariableValueOptions,
      "getInventoryVariableValueOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("inventory_id", getInventoryVariableValueOptions.inventoryId());
    pathParamsMap.put("var_name", getInventoryVariableValueOptions.varName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/inventories/{inventory_id}/variables/{var_name}/value", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getInventoryVariableValue");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ValueListResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ValueListResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Workspace Input value for {var_name}, used by the recent job execution.
   *
   * Get Workspace Input value for {var_name}, used by the recent job execution; "$$W(workspace_name):$$I(var_name)".
   *
   * @param getWorkspaceInputValueOptions the {@link GetWorkspaceInputValueOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ValueResponse}
   */
  public ServiceCall<ValueResponse> getWorkspaceInputValue(GetWorkspaceInputValueOptions getWorkspaceInputValueOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceInputValueOptions,
      "getWorkspaceInputValueOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", getWorkspaceInputValueOptions.workspaceId());
    pathParamsMap.put("var_name", getWorkspaceInputValueOptions.varName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/inputs/{var_name}/value", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getWorkspaceInputValue");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getWorkspaceInputValueOptions.limit() != null) {
      builder.query("limit", String.valueOf(getWorkspaceInputValueOptions.limit()));
    }
    if (getWorkspaceInputValueOptions.offset() != null) {
      builder.query("offset", String.valueOf(getWorkspaceInputValueOptions.offset()));
    }
    ResponseConverter<ValueResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ValueResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Workspace Output value for {var_name}, produced by the recent job execution.
   *
   * Get Workspace Output value for {var_name}, produced by the recent job execution;
   * "$$W(workspace_name):$$O(var_name)".
   *
   * @param getWorkspaceOutputValueOptions the {@link GetWorkspaceOutputValueOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ValueResponse}
   */
  public ServiceCall<ValueResponse> getWorkspaceOutputValue(GetWorkspaceOutputValueOptions getWorkspaceOutputValueOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceOutputValueOptions,
      "getWorkspaceOutputValueOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", getWorkspaceOutputValueOptions.workspaceId());
    pathParamsMap.put("var_name", getWorkspaceOutputValueOptions.varName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/outputs/{var_name}/value", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getWorkspaceOutputValue");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getWorkspaceOutputValueOptions.offset() != null) {
      builder.query("offset", String.valueOf(getWorkspaceOutputValueOptions.offset()));
    }
    if (getWorkspaceOutputValueOptions.limit() != null) {
      builder.query("limit", String.valueOf(getWorkspaceOutputValueOptions.limit()));
    }
    ResponseConverter<ValueResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ValueResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Workspace environment setting value for {var_name}, used by the recent job execution.
   *
   * Get Workspace environment setting value for {var_name}, used by the recent job execution;
   * "$$W(workspace_name):$$S(var_name)".
   *
   * @param getWorkspaceSettingsValueOptions the {@link GetWorkspaceSettingsValueOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ValueResponse}
   */
  public ServiceCall<ValueResponse> getWorkspaceSettingsValue(GetWorkspaceSettingsValueOptions getWorkspaceSettingsValueOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceSettingsValueOptions,
      "getWorkspaceSettingsValueOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", getWorkspaceSettingsValueOptions.workspaceId());
    pathParamsMap.put("var_name", getWorkspaceSettingsValueOptions.varName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/settings/{var_name}/value", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getWorkspaceSettingsValue");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getWorkspaceSettingsValueOptions.offset() != null) {
      builder.query("offset", String.valueOf(getWorkspaceSettingsValueOptions.offset()));
    }
    if (getWorkspaceSettingsValueOptions.limit() != null) {
      builder.query("limit", String.valueOf(getWorkspaceSettingsValueOptions.limit()));
    }
    ResponseConverter<ValueResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ValueResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Workspace Input value for {var_name}, used by the recent job execution.
   *
   * Get Workspace Input value for {var_name}, used by the recent job execution;
   * "$$W(workspace_name):$$T(template_name):$$I(var_name)".
   *
   * @param getWorkspaceTemplateInputValueOptions the {@link GetWorkspaceTemplateInputValueOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ValueResponse}
   */
  public ServiceCall<ValueResponse> getWorkspaceTemplateInputValue(GetWorkspaceTemplateInputValueOptions getWorkspaceTemplateInputValueOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceTemplateInputValueOptions,
      "getWorkspaceTemplateInputValueOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", getWorkspaceTemplateInputValueOptions.workspaceId());
    pathParamsMap.put("template_id", getWorkspaceTemplateInputValueOptions.templateId());
    pathParamsMap.put("var_name", getWorkspaceTemplateInputValueOptions.varName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/templates/{template_id}/inputs/{var_name}/value", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getWorkspaceTemplateInputValue");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getWorkspaceTemplateInputValueOptions.offset() != null) {
      builder.query("offset", String.valueOf(getWorkspaceTemplateInputValueOptions.offset()));
    }
    if (getWorkspaceTemplateInputValueOptions.limit() != null) {
      builder.query("limit", String.valueOf(getWorkspaceTemplateInputValueOptions.limit()));
    }
    ResponseConverter<ValueResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ValueResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Workspace Output value for {var_name}, produced by the recent job execution.
   *
   * Get Workspace Output value for {var_name}, produced by the recent job execution;
   * "$$W(workspace_name):$$T(template_name):$$O(var_name)".
   *
   * @param getWorkspaceTemplateOutputValueOptions the {@link GetWorkspaceTemplateOutputValueOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ValueResponse}
   */
  public ServiceCall<ValueResponse> getWorkspaceTemplateOutputValue(GetWorkspaceTemplateOutputValueOptions getWorkspaceTemplateOutputValueOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceTemplateOutputValueOptions,
      "getWorkspaceTemplateOutputValueOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", getWorkspaceTemplateOutputValueOptions.workspaceId());
    pathParamsMap.put("template_id", getWorkspaceTemplateOutputValueOptions.templateId());
    pathParamsMap.put("var_name", getWorkspaceTemplateOutputValueOptions.varName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/templates/{template_id}/outputs/{var_name}/value", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getWorkspaceTemplateOutputValue");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getWorkspaceTemplateOutputValueOptions.offset() != null) {
      builder.query("offset", String.valueOf(getWorkspaceTemplateOutputValueOptions.offset()));
    }
    if (getWorkspaceTemplateOutputValueOptions.limit() != null) {
      builder.query("limit", String.valueOf(getWorkspaceTemplateOutputValueOptions.limit()));
    }
    ResponseConverter<ValueResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ValueResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Workspace environment setting value for {var_name}, used by the recent job execution.
   *
   * Get Workspace environment setting value for {var_name}, used by the recent job execution;
   * "$$W(workspace_name):$$T(template_name):$$S(var_name)".
   *
   * @param getWorkspaceTemplateSettingValueOptions the {@link GetWorkspaceTemplateSettingValueOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ValueResponse}
   */
  public ServiceCall<ValueResponse> getWorkspaceTemplateSettingValue(GetWorkspaceTemplateSettingValueOptions getWorkspaceTemplateSettingValueOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkspaceTemplateSettingValueOptions,
      "getWorkspaceTemplateSettingValueOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workspace_id", getWorkspaceTemplateSettingValueOptions.workspaceId());
    pathParamsMap.put("template_id", getWorkspaceTemplateSettingValueOptions.templateId());
    pathParamsMap.put("var_name", getWorkspaceTemplateSettingValueOptions.varName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/workspaces/{workspace_id}/templates/{template_id}/settings/{var_name}/value", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getWorkspaceTemplateSettingValue");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getWorkspaceTemplateSettingValueOptions.offset() != null) {
      builder.query("offset", String.valueOf(getWorkspaceTemplateSettingValueOptions.offset()));
    }
    if (getWorkspaceTemplateSettingValueOptions.limit() != null) {
      builder.query("limit", String.valueOf(getWorkspaceTemplateSettingValueOptions.limit()));
    }
    ResponseConverter<ValueResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ValueResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Workspace Input value for {var_name}, used by the job {job_id}.
   *
   * Get Workspace Input value for {var_name}, used by the recent job execution;
   * "$$J(job_id):$$W(workspace_name):$$I(var_name)".
   *
   * @param getJobWorkspaceInputValueOptions the {@link GetJobWorkspaceInputValueOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ValueResponse}
   */
  public ServiceCall<ValueResponse> getJobWorkspaceInputValue(GetJobWorkspaceInputValueOptions getJobWorkspaceInputValueOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getJobWorkspaceInputValueOptions,
      "getJobWorkspaceInputValueOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", getJobWorkspaceInputValueOptions.jobId());
    pathParamsMap.put("workspace_id", getJobWorkspaceInputValueOptions.workspaceId());
    pathParamsMap.put("var_name", getJobWorkspaceInputValueOptions.varName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs/{job_id}/workspaces/{workspace_id}/inputs/{var_name}/value", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getJobWorkspaceInputValue");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getJobWorkspaceInputValueOptions.offset() != null) {
      builder.query("offset", String.valueOf(getJobWorkspaceInputValueOptions.offset()));
    }
    if (getJobWorkspaceInputValueOptions.limit() != null) {
      builder.query("limit", String.valueOf(getJobWorkspaceInputValueOptions.limit()));
    }
    ResponseConverter<ValueResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ValueResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Workspace Output value for {var_name}, produced by the job {job_id}.
   *
   * Get Workspace Output value for {var_name}, produced by the recent job execution;
   * "$$J(job_id):$$W(workspace_name):$$O(var_name)".
   *
   * @param getJobWorkspaceOutputValueOptions the {@link GetJobWorkspaceOutputValueOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ValueResponse}
   */
  public ServiceCall<ValueResponse> getJobWorkspaceOutputValue(GetJobWorkspaceOutputValueOptions getJobWorkspaceOutputValueOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getJobWorkspaceOutputValueOptions,
      "getJobWorkspaceOutputValueOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", getJobWorkspaceOutputValueOptions.jobId());
    pathParamsMap.put("workspace_id", getJobWorkspaceOutputValueOptions.workspaceId());
    pathParamsMap.put("var_name", getJobWorkspaceOutputValueOptions.varName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs/{job_id}/workspaces/{workspace_id}/outputs/{var_name}/value", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getJobWorkspaceOutputValue");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getJobWorkspaceOutputValueOptions.offset() != null) {
      builder.query("offset", String.valueOf(getJobWorkspaceOutputValueOptions.offset()));
    }
    if (getJobWorkspaceOutputValueOptions.limit() != null) {
      builder.query("limit", String.valueOf(getJobWorkspaceOutputValueOptions.limit()));
    }
    ResponseConverter<ValueResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ValueResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Workspace environment setting value for {var_name}, used by the recent job execution.
   *
   * Get Workspace environment setting value for {var_name}, used by the recent job execution;
   * "$$J(job_id):$$W(workspace_name):$$S(var_name)".
   *
   * @param getJobWorkspaceSettingValueOptions the {@link GetJobWorkspaceSettingValueOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ValueResponse}
   */
  public ServiceCall<ValueResponse> getJobWorkspaceSettingValue(GetJobWorkspaceSettingValueOptions getJobWorkspaceSettingValueOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getJobWorkspaceSettingValueOptions,
      "getJobWorkspaceSettingValueOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", getJobWorkspaceSettingValueOptions.jobId());
    pathParamsMap.put("workspace_id", getJobWorkspaceSettingValueOptions.workspaceId());
    pathParamsMap.put("var_name", getJobWorkspaceSettingValueOptions.varName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/jobs/{job_id}/workspaces/{workspace_id}/settings/{var_name}/value", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getJobWorkspaceSettingValue");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getJobWorkspaceSettingValueOptions.offset() != null) {
      builder.query("offset", String.valueOf(getJobWorkspaceSettingValueOptions.offset()));
    }
    if (getJobWorkspaceSettingValueOptions.limit() != null) {
      builder.query("limit", String.valueOf(getJobWorkspaceSettingValueOptions.limit()));
    }
    ResponseConverter<ValueResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ValueResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all the Schematics triggers.
   *
   * Get all the Schematics triggers.
   *
   * @param listTriggersOptions the {@link ListTriggersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TriggerList}
   */
  public ServiceCall<TriggerList> listTriggers(ListTriggersOptions listTriggersOptions) {
    if (listTriggersOptions == null) {
      listTriggersOptions = new ListTriggersOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/triggers"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listTriggers");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listTriggersOptions.offset() != null) {
      builder.query("offset", String.valueOf(listTriggersOptions.offset()));
    }
    if (listTriggersOptions.limit() != null) {
      builder.query("limit", String.valueOf(listTriggersOptions.limit()));
    }
    if (listTriggersOptions.sort() != null) {
      builder.query("sort", String.valueOf(listTriggersOptions.sort()));
    }
    ResponseConverter<TriggerList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TriggerList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all the Schematics triggers.
   *
   * Get all the Schematics triggers.
   *
   * @return a {@link ServiceCall} with a result of type {@link TriggerList}
   */
  public ServiceCall<TriggerList> listTriggers() {
    return listTriggers(null);
  }

  /**
   * Register a Schematics trigger.
   *
   * Register a Schematics trigger.
   *
   * @param createTriggerOptions the {@link CreateTriggerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Trigger}
   */
  public ServiceCall<Trigger> createTrigger(CreateTriggerOptions createTriggerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createTriggerOptions,
      "createTriggerOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/triggers"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "createTrigger");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createTriggerOptions.trigger()), "application/json");
    ResponseConverter<Trigger> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Trigger>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the Schematics trigger.
   *
   * Get the Schematics trigger.
   *
   * @param getTriggerOptions the {@link GetTriggerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Trigger}
   */
  public ServiceCall<Trigger> getTrigger(GetTriggerOptions getTriggerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getTriggerOptions,
      "getTriggerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("trigger_id", getTriggerOptions.triggerId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/triggers/{trigger_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getTrigger");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Trigger> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Trigger>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace the Schematics trigger.
   *
   * Replace the Schematics trigger.
   *
   * @param replaceTriggerOptions the {@link ReplaceTriggerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Trigger}
   */
  public ServiceCall<Trigger> replaceTrigger(ReplaceTriggerOptions replaceTriggerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceTriggerOptions,
      "replaceTriggerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("trigger_id", replaceTriggerOptions.triggerId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/triggers/{trigger_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "replaceTrigger");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceTriggerOptions.trigger()), "application/json");
    ResponseConverter<Trigger> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Trigger>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Unregister the Schematics trigger.
   *
   * Delete the Schematics trigger.
   *
   * @param deleteTriggerOptions the {@link DeleteTriggerOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteTrigger(DeleteTriggerOptions deleteTriggerOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteTriggerOptions,
      "deleteTriggerOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("trigger_id", deleteTriggerOptions.triggerId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/triggers/{trigger_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "deleteTrigger");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all the Schematics web-hooks.
   *
   * Get all the Schematics web-hooks.
   *
   * @param listWebhookOptions the {@link ListWebhookOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WebHookList}
   */
  public ServiceCall<WebHookList> listWebhook(ListWebhookOptions listWebhookOptions) {
    if (listWebhookOptions == null) {
      listWebhookOptions = new ListWebhookOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/hooks"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listWebhook");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listWebhookOptions.offset() != null) {
      builder.query("offset", String.valueOf(listWebhookOptions.offset()));
    }
    if (listWebhookOptions.limit() != null) {
      builder.query("limit", String.valueOf(listWebhookOptions.limit()));
    }
    if (listWebhookOptions.sort() != null) {
      builder.query("sort", String.valueOf(listWebhookOptions.sort()));
    }
    ResponseConverter<WebHookList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WebHookList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all the Schematics web-hooks.
   *
   * Get all the Schematics web-hooks.
   *
   * @return a {@link ServiceCall} with a result of type {@link WebHookList}
   */
  public ServiceCall<WebHookList> listWebhook() {
    return listWebhook(null);
  }

  /**
   * Register a Schematics web-hook.
   *
   * Register a Schematics web-hook.
   *
   * @param createWebhookOptions the {@link CreateWebhookOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WebHook}
   */
  public ServiceCall<WebHook> createWebhook(CreateWebhookOptions createWebhookOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createWebhookOptions,
      "createWebhookOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/hooks"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "createWebhook");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createWebhookOptions.webHook()), "application/json");
    ResponseConverter<WebHook> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WebHook>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the Schematics web-hook.
   *
   * Get the Schematics web-hook.
   *
   * @param getWebhookOptions the {@link GetWebhookOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WebHook}
   */
  public ServiceCall<WebHook> getWebhook(GetWebhookOptions getWebhookOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWebhookOptions,
      "getWebhookOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("hook_id", getWebhookOptions.hookId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/hooks/{hook_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getWebhook");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<WebHook> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WebHook>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace the Schematics web-hook.
   *
   * Replace the Schematics web-hooks.
   *
   * @param replaceWebhookOptions the {@link ReplaceWebhookOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WebHook}
   */
  public ServiceCall<WebHook> replaceWebhook(ReplaceWebhookOptions replaceWebhookOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceWebhookOptions,
      "replaceWebhookOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("hook_id", replaceWebhookOptions.hookId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/hooks/{hook_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "replaceWebhook");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceWebhookOptions.webHook()), "application/json");
    ResponseConverter<WebHook> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WebHook>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Unregister the Schematics web-hook.
   *
   * Delete the Schematics web-hook.
   *
   * @param deleteWebhookOptions the {@link DeleteWebhookOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteWebhook(DeleteWebhookOptions deleteWebhookOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteWebhookOptions,
      "deleteWebhookOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("hook_id", deleteWebhookOptions.hookId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/hooks/{hook_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "deleteWebhook");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the details of private cluster registered with Schematics.
   *
   * Get the details of private cluster registered with Schematics.
   *
   * @param getPrivateClusterOptions the {@link GetPrivateClusterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrivateClusterList}
   */
  public ServiceCall<PrivateClusterList> getPrivateCluster(GetPrivateClusterOptions getPrivateClusterOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/private_clusters"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getPrivateCluster");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<PrivateClusterList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrivateClusterList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the details of private cluster registered with Schematics.
   *
   * Get the details of private cluster registered with Schematics.
   *
   * @return a {@link ServiceCall} with a result of type {@link PrivateClusterList}
   */
  public ServiceCall<PrivateClusterList> getPrivateCluster() {
    return getPrivateCluster(null);
  }

  /**
   * Register your private cluster with Schematics.
   *
   * Register your private Kubernetes cluster, that will be used by schematics to run its Job (over a private network).
   *
   * @param createPrivateClusterOptions the {@link CreatePrivateClusterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PrivateCluster}
   */
  public ServiceCall<PrivateCluster> createPrivateCluster(CreatePrivateClusterOptions createPrivateClusterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createPrivateClusterOptions,
      "createPrivateClusterOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/private_clusters"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "createPrivateCluster");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createPrivateClusterOptions.privateCluster()), "application/json");
    ResponseConverter<PrivateCluster> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PrivateCluster>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Un-register your private cluster with Schematics.
   *
   * Un-register the private cluster registered with Schematics.
   *
   * @param deletePrivateClusterOptions the {@link DeletePrivateClusterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deletePrivateCluster(DeletePrivateClusterOptions deletePrivateClusterOptions) {
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/private_clusters"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "deletePrivateCluster");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Un-register your private cluster with Schematics.
   *
   * Un-register the private cluster registered with Schematics.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deletePrivateCluster() {
    return deletePrivateCluster(null);
  }

  /**
   * Get all Schematics Adapter definitions.
   *
   * Get all the registered Schematics Adapter definitions.
   *
   * @param listAdapterOptions the {@link ListAdapterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AdapterList}
   */
  public ServiceCall<AdapterList> listAdapter(ListAdapterOptions listAdapterOptions) {
    if (listAdapterOptions == null) {
      listAdapterOptions = new ListAdapterOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/adapters"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listAdapter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listAdapterOptions.offset() != null) {
      builder.query("offset", String.valueOf(listAdapterOptions.offset()));
    }
    if (listAdapterOptions.limit() != null) {
      builder.query("limit", String.valueOf(listAdapterOptions.limit()));
    }
    if (listAdapterOptions.sort() != null) {
      builder.query("sort", String.valueOf(listAdapterOptions.sort()));
    }
    if (listAdapterOptions.profile() != null) {
      builder.query("profile", String.valueOf(listAdapterOptions.profile()));
    }
    ResponseConverter<AdapterList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AdapterList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all Schematics Adapter definitions.
   *
   * Get all the registered Schematics Adapter definitions.
   *
   * @return a {@link ServiceCall} with a result of type {@link AdapterList}
   */
  public ServiceCall<AdapterList> listAdapter() {
    return listAdapter(null);
  }

  /**
   * Register an Adapter definition with Schematics.
   *
   * Register an adapter with Schematics, used to access your SCM Repo, Action,  Provisioner, Data, and Credentials.
   *
   * @param createAdapterOptions the {@link CreateAdapterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Adapter}
   */
  public ServiceCall<Adapter> createAdapter(CreateAdapterOptions createAdapterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createAdapterOptions,
      "createAdapterOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/adapters"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "createAdapter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createAdapterOptions.adapter()), "application/json");
    ResponseConverter<Adapter> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Adapter>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the Schematics Adapter definition.
   *
   * Get the Schematics Adapter definition.
   *
   * @param getAdapterOptions the {@link GetAdapterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Adapter}
   */
  public ServiceCall<Adapter> getAdapter(GetAdapterOptions getAdapterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAdapterOptions,
      "getAdapterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("adapter_id", getAdapterOptions.adapterId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/adapters/{adapter_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getAdapter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<Adapter> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Adapter>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace the Schematics Adapter definition.
   *
   * Replace the Schematics Adapter definition.
   *
   * @param replaceAdapterOptions the {@link ReplaceAdapterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Adapter}
   */
  public ServiceCall<Adapter> replaceAdapter(ReplaceAdapterOptions replaceAdapterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceAdapterOptions,
      "replaceAdapterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("adapter_id", replaceAdapterOptions.adapterId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/adapters/{adapter_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "replaceAdapter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceAdapterOptions.adapter()), "application/json");
    ResponseConverter<Adapter> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Adapter>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Unregister the Schematics Adapter definition.
   *
   * Delete the Schematics Adapter definition.
   *
   * @param deleteAdapterOptions the {@link DeleteAdapterOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteAdapter(DeleteAdapterOptions deleteAdapterOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteAdapterOptions,
      "deleteAdapterOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("adapter_id", deleteAdapterOptions.adapterId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/adapters/{adapter_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "deleteAdapter");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all external connection definition.
   *
   * Get all external connection definition.
   *
   * @param listConnectionOptions the {@link ListConnectionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConnectionList}
   */
  public ServiceCall<ConnectionList> listConnection(ListConnectionOptions listConnectionOptions) {
    if (listConnectionOptions == null) {
      listConnectionOptions = new ListConnectionOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/connections"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listConnection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listConnectionOptions.offset() != null) {
      builder.query("offset", String.valueOf(listConnectionOptions.offset()));
    }
    if (listConnectionOptions.limit() != null) {
      builder.query("limit", String.valueOf(listConnectionOptions.limit()));
    }
    if (listConnectionOptions.sort() != null) {
      builder.query("sort", String.valueOf(listConnectionOptions.sort()));
    }
    ResponseConverter<ConnectionList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConnectionList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all external connection definition.
   *
   * Get all external connection definition.
   *
   * @return a {@link ServiceCall} with a result of type {@link ConnectionList}
   */
  public ServiceCall<ConnectionList> listConnection() {
    return listConnection(null);
  }

  /**
   * Register an external connection definition.
   *
   * Register an external connection definition.
   *
   * @param createConnectionOptions the {@link CreateConnectionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Connection}
   */
  public ServiceCall<Connection> createConnection(CreateConnectionOptions createConnectionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createConnectionOptions,
      "createConnectionOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/connections"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "createConnection");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createConnectionOptions.connection()), "application/json");
    ResponseConverter<Connection> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Connection>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all datasources registered with Schematics.
   *
   * Get all datasource registered with Schematics.
   *
   * @param listDatasourcesOptions the {@link ListDatasourcesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DatasourceList}
   */
  public ServiceCall<DatasourceList> listDatasources(ListDatasourcesOptions listDatasourcesOptions) {
    if (listDatasourcesOptions == null) {
      listDatasourcesOptions = new ListDatasourcesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/datasources"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listDatasources");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listDatasourcesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listDatasourcesOptions.offset()));
    }
    if (listDatasourcesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDatasourcesOptions.limit()));
    }
    if (listDatasourcesOptions.sort() != null) {
      builder.query("sort", String.valueOf(listDatasourcesOptions.sort()));
    }
    ResponseConverter<DatasourceList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DatasourceList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all datasources registered with Schematics.
   *
   * Get all datasource registered with Schematics.
   *
   * @return a {@link ServiceCall} with a result of type {@link DatasourceList}
   */
  public ServiceCall<DatasourceList> listDatasources() {
    return listDatasources(null);
  }

  /**
   * Register an external datasource definition.
   *
   * Register an external datasource definition.
   *
   * @param createDatasourceOptions the {@link CreateDatasourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Datasource}
   */
  public ServiceCall<Datasource> createDatasource(CreateDatasourceOptions createDatasourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDatasourceOptions,
      "createDatasourceOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/datasources"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "createDatasource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createDatasourceOptions.datasource()), "application/json");
    ResponseConverter<Datasource> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Datasource>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all the fulfilment job order, in the Account.
   *
   * Get all the fulfilment job order, in the Account, associated with a Service.
   *
   * @param listCartOptions the {@link ListCartOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CartOrderList}
   */
  public ServiceCall<CartOrderList> listCart(ListCartOptions listCartOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listCartOptions,
      "listCartOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/cart"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listCart");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("service", String.valueOf(listCartOptions.service()));
    if (listCartOptions.offset() != null) {
      builder.query("offset", String.valueOf(listCartOptions.offset()));
    }
    if (listCartOptions.limit() != null) {
      builder.query("limit", String.valueOf(listCartOptions.limit()));
    }
    ResponseConverter<CartOrderList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CartOrderList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new fulfilment job order for the cart.
   *
   * Create a new fulfilment job order for the cart.
   *
   * @param createCartOrderOptions the {@link CreateCartOrderOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CartOrder}
   */
  public ServiceCall<CartOrder> createCartOrder(CreateCartOrderOptions createCartOrderOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createCartOrderOptions,
      "createCartOrderOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/cart"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "createCartOrder");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createCartOrderOptions.cartOrder()), "application/json");
    ResponseConverter<CartOrder> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CartOrder>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the fulfilment job order details.
   *
   * Get the fulfilment job order.
   *
   * @param getCartOrderOptions the {@link GetCartOrderOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CartOrder}
   */
  public ServiceCall<CartOrder> getCartOrder(GetCartOrderOptions getCartOrderOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getCartOrderOptions,
      "getCartOrderOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("order_id", getCartOrderOptions.orderId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/cart/{order_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getCartOrder");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getCartOrderOptions.profile() != null) {
      builder.query("profile", String.valueOf(getCartOrderOptions.profile()));
    }
    ResponseConverter<CartOrder> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CartOrder>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the fulfilment job order and contextually run.
   *
   * Update the fulfilment job order and run with the same context.
   *
   * @param replaceCartOrderOptions the {@link ReplaceCartOrderOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CartOrder}
   */
  public ServiceCall<CartOrder> replaceCartOrder(ReplaceCartOrderOptions replaceCartOrderOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceCartOrderOptions,
      "replaceCartOrderOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("order_id", replaceCartOrderOptions.orderId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/cart/{order_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "replaceCartOrder");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("operation", String.valueOf(replaceCartOrderOptions.operation()));
    if (replaceCartOrderOptions.profile() != null) {
      builder.query("profile", String.valueOf(replaceCartOrderOptions.profile()));
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceCartOrderOptions.cartOrder()), "application/json");
    ResponseConverter<CartOrder> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CartOrder>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Run the fulfilment job operation for the cart.
   *
   * Run the fulfilment job operation for the cart.
   *
   * @param runFulfilmentOperationOptions the {@link RunFulfilmentOperationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> runFulfilmentOperation(RunFulfilmentOperationOptions runFulfilmentOperationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(runFulfilmentOperationOptions,
      "runFulfilmentOperationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("order_id", runFulfilmentOperationOptions.orderId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/cart/{order_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "runFulfilmentOperation");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("operation", String.valueOf(runFulfilmentOperationOptions.operation()));
    if (runFulfilmentOperationOptions.profile() != null) {
      builder.query("profile", String.valueOf(runFulfilmentOperationOptions.profile()));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete the fulfilment job order.
   *
   * Run pre-delete operation and delete the fulfilment job order.
   *
   * @param deleteCartOrderOptions the {@link DeleteCartOrderOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteCartOrder(DeleteCartOrderOptions deleteCartOrderOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteCartOrderOptions,
      "deleteCartOrderOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("order_id", deleteCartOrderOptions.orderId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/cart/{order_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "deleteCartOrder");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteCartOrderOptions.profile() != null) {
      builder.query("profile", String.valueOf(deleteCartOrderOptions.profile()));
    }
    if (deleteCartOrderOptions.destroy() != null) {
      builder.query("destroy", String.valueOf(deleteCartOrderOptions.destroy()));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the fulfilment job order.
   *
   * Update the fulfilment job order.
   *
   * @param updateCartOrderOptions the {@link UpdateCartOrderOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CartOrder}
   */
  public ServiceCall<CartOrder> updateCartOrder(UpdateCartOrderOptions updateCartOrderOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateCartOrderOptions,
      "updateCartOrderOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("order_id", updateCartOrderOptions.orderId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/cart/{order_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "updateCartOrder");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateCartOrderOptions.profile() != null) {
      builder.query("profile", String.valueOf(updateCartOrderOptions.profile()));
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateCartOrderOptions.updateCartOrder()), "application/json");
    ResponseConverter<CartOrder> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CartOrder>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get metadata for the fulfilment job order.
   *
   * Get variable and operation metadata for the fulfilment job order.
   *
   * @param getCartMetadataOptions the {@link GetCartMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ItemMetadata}
   */
  public ServiceCall<ItemMetadata> getCartMetadata(GetCartMetadataOptions getCartMetadataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getCartMetadataOptions,
      "getCartMetadataOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("order_id", getCartMetadataOptions.orderId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/cart/{order_id}/metadata", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getCartMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<ItemMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ItemMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get current list of cloud sources, fulfilled by the cart.
   *
   * Get current list of cloud resources, fulfilled by the cart.
   *
   * @param listCartResourcesOptions the {@link ListCartResourcesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CloudResourceList}
   */
  public ServiceCall<CloudResourceList> listCartResources(ListCartResourcesOptions listCartResourcesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listCartResourcesOptions,
      "listCartResourcesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("order_id", listCartResourcesOptions.orderId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/cart/{order_id}/resources", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listCartResources");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listCartResourcesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listCartResourcesOptions.offset()));
    }
    if (listCartResourcesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listCartResourcesOptions.limit()));
    }
    ResponseConverter<CloudResourceList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CloudResourceList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the list of fulfilment jobs performed on the cart.
   *
   * Get list of fulfilment jobs performed on the cart.
   *
   * @param listCartOrderJobsOptions the {@link ListCartOrderJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JobList}
   */
  public ServiceCall<JobList> listCartOrderJobs(ListCartOrderJobsOptions listCartOrderJobsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listCartOrderJobsOptions,
      "listCartOrderJobsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("order_id", listCartOrderJobsOptions.orderId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/cart/{order_id}/jobs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listCartOrderJobs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listCartOrderJobsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listCartOrderJobsOptions.offset()));
    }
    if (listCartOrderJobsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listCartOrderJobsOptions.limit()));
    }
    ResponseConverter<JobList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JobList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get fulfilment job details.
   *
   * Get fulfilment job details.
   *
   * @param getCartOrderJobOptions the {@link GetCartOrderJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JobLite}
   */
  public ServiceCall<JobLite> getCartOrderJob(GetCartOrderJobOptions getCartOrderJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getCartOrderJobOptions,
      "getCartOrderJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("order_id", getCartOrderJobOptions.orderId());
    pathParamsMap.put("job_id", getCartOrderJobOptions.jobId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/cart/{order_id}/jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getCartOrderJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getCartOrderJobOptions.offset() != null) {
      builder.query("offset", String.valueOf(getCartOrderJobOptions.offset()));
    }
    if (getCartOrderJobOptions.limit() != null) {
      builder.query("limit", String.valueOf(getCartOrderJobOptions.limit()));
    }
    ResponseConverter<JobLite> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JobLite>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the fulfilment job logs.
   *
   * Get the fulfilment job logs.
   *
   * @param getCartOrderJobLogOptions the {@link GetCartOrderJobLogOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JobLog}
   */
  public ServiceCall<JobLog> getCartOrderJobLog(GetCartOrderJobLogOptions getCartOrderJobLogOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getCartOrderJobLogOptions,
      "getCartOrderJobLogOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("order_id", getCartOrderJobLogOptions.orderId());
    pathParamsMap.put("job_id", getCartOrderJobLogOptions.jobId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/cart/{order_id}/jobs/{job_id}/logs", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getCartOrderJobLog");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getCartOrderJobLogOptions.offset() != null) {
      builder.query("offset", String.valueOf(getCartOrderJobLogOptions.offset()));
    }
    if (getCartOrderJobLogOptions.limit() != null) {
      builder.query("limit", String.valueOf(getCartOrderJobLogOptions.limit()));
    }
    ResponseConverter<JobLog> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JobLog>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the fulfilment job resources.
   *
   * Get the fulfilment job resources.
   *
   * @param getCartOrderJobResourcesOptions the {@link GetCartOrderJobResourcesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CloudResourceList}
   */
  public ServiceCall<CloudResourceList> getCartOrderJobResources(GetCartOrderJobResourcesOptions getCartOrderJobResourcesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getCartOrderJobResourcesOptions,
      "getCartOrderJobResourcesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("order_id", getCartOrderJobResourcesOptions.orderId());
    pathParamsMap.put("job_id", getCartOrderJobResourcesOptions.jobId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/cart/{order_id}/jobs/{job_id}/resources", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getCartOrderJobResources");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getCartOrderJobResourcesOptions.offset() != null) {
      builder.query("offset", String.valueOf(getCartOrderJobResourcesOptions.offset()));
    }
    if (getCartOrderJobResourcesOptions.limit() != null) {
      builder.query("limit", String.valueOf(getCartOrderJobResourcesOptions.limit()));
    }
    ResponseConverter<CloudResourceList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CloudResourceList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all the environment definitions from the catalog by filtering the offerings by environment kind.
   *
   * Get all the environments defined in the catalog as an environment offering.
   *
   * @param listEnvironmentDefinitionsOptions the {@link ListEnvironmentDefinitionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<EnvironmentCatalogOfferingItem>> listEnvironmentDefinitions(ListEnvironmentDefinitionsOptions listEnvironmentDefinitionsOptions) {
    if (listEnvironmentDefinitionsOptions == null) {
      listEnvironmentDefinitionsOptions = new ListEnvironmentDefinitionsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/environmentdefinitions"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listEnvironmentDefinitions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listEnvironmentDefinitionsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listEnvironmentDefinitionsOptions.offset()));
    }
    if (listEnvironmentDefinitionsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listEnvironmentDefinitionsOptions.limit()));
    }
    if (listEnvironmentDefinitionsOptions.catalogId() != null) {
      builder.query("catalog_id", String.valueOf(listEnvironmentDefinitionsOptions.catalogId()));
    }
    if (listEnvironmentDefinitionsOptions.catalogName() != null) {
      builder.query("catalog_name", String.valueOf(listEnvironmentDefinitionsOptions.catalogName()));
    }
    ResponseConverter<List<EnvironmentCatalogOfferingItem>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<List<EnvironmentCatalogOfferingItem>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all the environment definitions from the catalog by filtering the offerings by environment kind.
   *
   * Get all the environments defined in the catalog as an environment offering.
   *
   * @return a {@link ServiceCall} with a result of type {@link List}
   */
  public ServiceCall<List<EnvironmentCatalogOfferingItem>> listEnvironmentDefinitions() {
    return listEnvironmentDefinitions(null);
  }

  /**
   * Get the environment definition from the provided catalog and offering id.
   *
   * Get the details of the environment (blueprint.yml and config.yml) from the provided catalog and offering id.
   *
   * @param getEnvironmentDefinitionOptions the {@link GetEnvironmentDefinitionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Environment}
   */
  public ServiceCall<Environment> getEnvironmentDefinition(GetEnvironmentDefinitionOptions getEnvironmentDefinitionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getEnvironmentDefinitionOptions,
      "getEnvironmentDefinitionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("offering_id", getEnvironmentDefinitionOptions.offeringId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/environmentdefinitions/{offering_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getEnvironmentDefinition");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getEnvironmentDefinitionOptions.catalogId() != null) {
      builder.query("catalog_id", String.valueOf(getEnvironmentDefinitionOptions.catalogId()));
    }
    if (getEnvironmentDefinitionOptions.catalogName() != null) {
      builder.query("catalog_name", String.valueOf(getEnvironmentDefinitionOptions.catalogName()));
    }
    if (getEnvironmentDefinitionOptions.offeringName() != null) {
      builder.query("offering_name", String.valueOf(getEnvironmentDefinitionOptions.offeringName()));
    }
    if (getEnvironmentDefinitionOptions.offeringVersion() != null) {
      builder.query("offering_version", String.valueOf(getEnvironmentDefinitionOptions.offeringVersion()));
    }
    if (getEnvironmentDefinitionOptions.offset() != null) {
      builder.query("offset", String.valueOf(getEnvironmentDefinitionOptions.offset()));
    }
    if (getEnvironmentDefinitionOptions.limit() != null) {
      builder.query("limit", String.valueOf(getEnvironmentDefinitionOptions.limit()));
    }
    ResponseConverter<Environment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Environment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all the environment instances, in the Account.
   *
   * Get all the environment instances, in the Account, associated with a Service.
   *
   * @param listEnvironmentOptions the {@link ListEnvironmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EnvironmentList}
   */
  public ServiceCall<EnvironmentList> listEnvironment(ListEnvironmentOptions listEnvironmentOptions) {
    if (listEnvironmentOptions == null) {
      listEnvironmentOptions = new ListEnvironmentOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/environments"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listEnvironment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listEnvironmentOptions.offset() != null) {
      builder.query("offset", String.valueOf(listEnvironmentOptions.offset()));
    }
    if (listEnvironmentOptions.limit() != null) {
      builder.query("limit", String.valueOf(listEnvironmentOptions.limit()));
    }
    ResponseConverter<EnvironmentList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EnvironmentList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all the environment instances, in the Account.
   *
   * Get all the environment instances, in the Account, associated with a Service.
   *
   * @return a {@link ServiceCall} with a result of type {@link EnvironmentList}
   */
  public ServiceCall<EnvironmentList> listEnvironment() {
    return listEnvironment(null);
  }

  /**
   * Create a new environment.
   *
   * Create a new environment.
   *
   * @param createEnvironmentOptions the {@link CreateEnvironmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Environment}
   */
  public ServiceCall<Environment> createEnvironment(CreateEnvironmentOptions createEnvironmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createEnvironmentOptions,
      "createEnvironmentOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/environments"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "createEnvironment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(createEnvironmentOptions.environment()), "application/json");
    ResponseConverter<Environment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Environment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the environment details.
   *
   * Get the environment details.
   *
   * @param getEnvironmentOptions the {@link GetEnvironmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Environment}
   */
  public ServiceCall<Environment> getEnvironment(GetEnvironmentOptions getEnvironmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getEnvironmentOptions,
      "getEnvironmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("environment_id", getEnvironmentOptions.environmentId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/environments/{environment_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getEnvironment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (getEnvironmentOptions.profile() != null) {
      builder.query("profile", String.valueOf(getEnvironmentOptions.profile()));
    }
    ResponseConverter<Environment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Environment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the environment details.
   *
   * Update the environment details.
   *
   * @param replaceEnvironmentOptions the {@link ReplaceEnvironmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Environment}
   */
  public ServiceCall<Environment> replaceEnvironment(ReplaceEnvironmentOptions replaceEnvironmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceEnvironmentOptions,
      "replaceEnvironmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("environment_id", replaceEnvironmentOptions.environmentId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/environments/{environment_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "replaceEnvironment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (replaceEnvironmentOptions.profile() != null) {
      builder.query("profile", String.valueOf(replaceEnvironmentOptions.profile()));
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceEnvironmentOptions.environment()), "application/json");
    ResponseConverter<Environment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Environment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete the environment.
   *
   * Delete the environment.
   *
   * @param deleteEnvironmentOptions the {@link DeleteEnvironmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteEnvironment(DeleteEnvironmentOptions deleteEnvironmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteEnvironmentOptions,
      "deleteEnvironmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("environment_id", deleteEnvironmentOptions.environmentId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/environments/{environment_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "deleteEnvironment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (deleteEnvironmentOptions.profile() != null) {
      builder.query("profile", String.valueOf(deleteEnvironmentOptions.profile()));
    }
    if (deleteEnvironmentOptions.destroy() != null) {
      builder.query("destroy", String.valueOf(deleteEnvironmentOptions.destroy()));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the environment details.
   *
   * Update the environment details.
   *
   * @param updateEnvironmentOptions the {@link UpdateEnvironmentOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Environment}
   */
  public ServiceCall<Environment> updateEnvironment(UpdateEnvironmentOptions updateEnvironmentOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateEnvironmentOptions,
      "updateEnvironmentOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("environment_id", updateEnvironmentOptions.environmentId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/environments/{environment_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "updateEnvironment");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (updateEnvironmentOptions.profile() != null) {
      builder.query("profile", String.valueOf(updateEnvironmentOptions.profile()));
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateEnvironmentOptions.environment()), "application/json");
    ResponseConverter<Environment> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Environment>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get current list of workspaces, created for the environment.
   *
   * Get current list of workspaces, created for the environment.
   *
   * @param listEnvironmentWorkspacesOptions the {@link ListEnvironmentWorkspacesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CloudResourceList}
   */
  public ServiceCall<CloudResourceList> listEnvironmentWorkspaces(ListEnvironmentWorkspacesOptions listEnvironmentWorkspacesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listEnvironmentWorkspacesOptions,
      "listEnvironmentWorkspacesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("environment_id", listEnvironmentWorkspacesOptions.environmentId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/environment/{environment_id}/workspaces", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listEnvironmentWorkspaces");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listEnvironmentWorkspacesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listEnvironmentWorkspacesOptions.offset()));
    }
    if (listEnvironmentWorkspacesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listEnvironmentWorkspacesOptions.limit()));
    }
    ResponseConverter<CloudResourceList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CloudResourceList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get current list of cloud resources.
   *
   * Get current list of cloud resources.
   *
   * @param listEnvironmentResourcesOptions the {@link ListEnvironmentResourcesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CloudResourceList}
   */
  public ServiceCall<CloudResourceList> listEnvironmentResources(ListEnvironmentResourcesOptions listEnvironmentResourcesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listEnvironmentResourcesOptions,
      "listEnvironmentResourcesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("environment_id", listEnvironmentResourcesOptions.environmentId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/environment/{environment_id}/resources", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listEnvironmentResources");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (listEnvironmentResourcesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listEnvironmentResourcesOptions.offset()));
    }
    if (listEnvironmentResourcesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listEnvironmentResourcesOptions.limit()));
    }
    ResponseConverter<CloudResourceList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CloudResourceList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the KMS settings.
   *
   * Retrieve the KMS on the API endpoint that you have access. For example, if you use an API endpoint for a geography,
   * such as North America, only Schematics resource that are created in `us-south` or `us-east` are retrieved.
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization such as service access or platform
   * access to the action ID and the resource group. For more information, about Schematics access and permissions, see
   * [Schematics service access roles and required permissions](/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param getKmsSettingsOptions the {@link GetKmsSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link KMSSettings}
   */
  public ServiceCall<KMSSettings> getKmsSettings(GetKmsSettingsOptions getKmsSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getKmsSettingsOptions,
      "getKmsSettingsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/kms"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "getKmsSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("location", String.valueOf(getKmsSettingsOptions.location()));
    ResponseConverter<KMSSettings> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<KMSSettings>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace the KMS settings.
   *
   * Replace or Update the KMS setting for your location, by using your private endpoint, `CRN`, primary `CRK`, and
   * secondary `CRK`. **Note** you can update the KMS settings only once. For example, if you use an API endpoint for a
   * geography, such as North America, only Schematics resource that are created in `us-south` or `us-east` are
   * retrieved.
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization such as service access or platform
   * access to the action ID and the resource group. For more information, about Schematics access and permissions, see
   * [Schematics service access roles and required permissions](/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param updateKmsSettingsOptions the {@link UpdateKmsSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link KMSSettings}
   */
  public ServiceCall<KMSSettings> updateKmsSettings(UpdateKmsSettingsOptions updateKmsSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateKmsSettingsOptions,
      "updateKmsSettingsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/kms"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "updateKmsSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(updateKmsSettingsOptions.kmsSettings()), "application/json");
    ResponseConverter<KMSSettings> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<KMSSettings>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Discover the KMS instances.
   *
   * Lists the KMS instances of your IBM Cloud account to find your Key Protect or Hyper Protect Crypto Services by
   * using the location and encrypted scheme such as KYOK or BYOK.
   * &lt;h3&gt;Authorization&lt;/h3&gt; Schematics support generic authorization such as service access or platform
   * access to the action ID and the resource group. For more information, about Schematics access and permissions, see
   * [Schematics service access roles and required permissions](/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param listKmsOptions the {@link ListKmsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link KMSDiscovery}
   */
  public ServiceCall<KMSDiscovery> listKms(ListKmsOptions listKmsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listKmsOptions,
      "listKmsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/settings/kms_instances"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listKms");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("encryption_scheme", String.valueOf(listKmsOptions.encryptionScheme()));
    builder.query("location", String.valueOf(listKmsOptions.location()));
    if (listKmsOptions.resourceGroup() != null) {
      builder.query("resource_group", String.valueOf(listKmsOptions.resourceGroup()));
    }
    if (listKmsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listKmsOptions.limit()));
    }
    if (listKmsOptions.sort() != null) {
      builder.query("sort", String.valueOf(listKmsOptions.sort()));
    }
    ResponseConverter<KMSDiscovery> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<KMSDiscovery>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List supported Schematics locations.
   *
   * Retrieve a list of IBM Cloud locations where you can work with Schematics objects.
   *
   * @param listLocationsOptions the {@link ListLocationsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SchematicsLocationsList}
   */
  public ServiceCall<SchematicsLocationsList> listLocations(ListLocationsOptions listLocationsOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/locations"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "listLocations");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    ResponseConverter<SchematicsLocationsList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SchematicsLocationsList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List supported Schematics locations.
   *
   * Retrieve a list of IBM Cloud locations where you can work with Schematics objects.
   *
   * @return a {@link ServiceCall} with a result of type {@link SchematicsLocationsList}
   */
  public ServiceCall<SchematicsLocationsList> listLocations() {
    return listLocations(null);
  }

  /**
   * Create metadata by parsing the template.
   *
   * Get the variable metadata from the template. This metadata can be passed in the payload during Schematics workspace
   * create or update API call.
   *
   * @param processTemplateMetaDataOptions the {@link ProcessTemplateMetaDataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TemplateMetaDataResponse}
   */
  public ServiceCall<TemplateMetaDataResponse> processTemplateMetaData(ProcessTemplateMetaDataOptions processTemplateMetaDataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(processTemplateMetaDataOptions,
      "processTemplateMetaDataOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/v2/template_metadata_processor"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("schematics_2_0_api", "v2", "processTemplateMetaData");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    if (processTemplateMetaDataOptions.xGithubToken() != null) {
      builder.header("X-Github-token", processTemplateMetaDataOptions.xGithubToken());
    }
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(processTemplateMetaDataOptions.templateMetaDataRequest()), "application/json");
    ResponseConverter<TemplateMetaDataResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TemplateMetaDataResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
