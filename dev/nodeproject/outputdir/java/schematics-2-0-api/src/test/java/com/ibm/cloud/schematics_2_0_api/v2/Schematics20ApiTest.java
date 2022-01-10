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

import com.ibm.cloud.schematics_2_0_api.v2.Schematics20Api;
import com.ibm.cloud.schematics_2_0_api.v2.model.Action;
import com.ibm.cloud.schematics_2_0_api.v2.model.ActionList;
import com.ibm.cloud.schematics_2_0_api.v2.model.ActionLite;
import com.ibm.cloud.schematics_2_0_api.v2.model.ActionLiteState;
import com.ibm.cloud.schematics_2_0_api.v2.model.ActionState;
import com.ibm.cloud.schematics_2_0_api.v2.model.Adapter;
import com.ibm.cloud.schematics_2_0_api.v2.model.AdapterList;
import com.ibm.cloud.schematics_2_0_api.v2.model.AddFlowToWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.AddTemplatesToWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.BastionResourceDefinition;
import com.ibm.cloud.schematics_2_0_api.v2.model.Blueprint;
import com.ibm.cloud.schematics_2_0_api.v2.model.BlueprintVariableData;
import com.ibm.cloud.schematics_2_0_api.v2.model.Capsule;
import com.ibm.cloud.schematics_2_0_api.v2.model.CapsuleList;
import com.ibm.cloud.schematics_2_0_api.v2.model.CapsuleLite;
import com.ibm.cloud.schematics_2_0_api.v2.model.CapsuleLiteState;
import com.ibm.cloud.schematics_2_0_api.v2.model.CapsuleResultEvidences;
import com.ibm.cloud.schematics_2_0_api.v2.model.CapsuleResultResources;
import com.ibm.cloud.schematics_2_0_api.v2.model.CartOrder;
import com.ibm.cloud.schematics_2_0_api.v2.model.CartOrderList;
import com.ibm.cloud.schematics_2_0_api.v2.model.CartOrderLite;
import com.ibm.cloud.schematics_2_0_api.v2.model.CartOrderLiteState;
import com.ibm.cloud.schematics_2_0_api.v2.model.CartOrderUserState;
import com.ibm.cloud.schematics_2_0_api.v2.model.CloudResource;
import com.ibm.cloud.schematics_2_0_api.v2.model.CloudResourceList;
import com.ibm.cloud.schematics_2_0_api.v2.model.CommandList;
import com.ibm.cloud.schematics_2_0_api.v2.model.CommandListCommands;
import com.ibm.cloud.schematics_2_0_api.v2.model.ConfigItem;
import com.ibm.cloud.schematics_2_0_api.v2.model.Connection;
import com.ibm.cloud.schematics_2_0_api.v2.model.ConnectionList;
import com.ibm.cloud.schematics_2_0_api.v2.model.ConnectionLite;
import com.ibm.cloud.schematics_2_0_api.v2.model.ConnectionSecret;
import com.ibm.cloud.schematics_2_0_api.v2.model.ConnectionSecretApikey;
import com.ibm.cloud.schematics_2_0_api.v2.model.Controls;
import com.ibm.cloud.schematics_2_0_api.v2.model.ControlsDecision;
import com.ibm.cloud.schematics_2_0_api.v2.model.ControlsEscalation;
import com.ibm.cloud.schematics_2_0_api.v2.model.ControlsList;
import com.ibm.cloud.schematics_2_0_api.v2.model.ControlsLite;
import com.ibm.cloud.schematics_2_0_api.v2.model.ControlsLiteState;
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
import com.ibm.cloud.schematics_2_0_api.v2.model.CredentialsetLite;
import com.ibm.cloud.schematics_2_0_api.v2.model.Dataset;
import com.ibm.cloud.schematics_2_0_api.v2.model.DatasetList;
import com.ibm.cloud.schematics_2_0_api.v2.model.DatasetLite;
import com.ibm.cloud.schematics_2_0_api.v2.model.Datasource;
import com.ibm.cloud.schematics_2_0_api.v2.model.DatasourceList;
import com.ibm.cloud.schematics_2_0_api.v2.model.DatasourceLite;
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
import com.ibm.cloud.schematics_2_0_api.v2.model.EnvironmentCatalogOfferingItemVersions;
import com.ibm.cloud.schematics_2_0_api.v2.model.EnvironmentList;
import com.ibm.cloud.schematics_2_0_api.v2.model.EnvironmentLite;
import com.ibm.cloud.schematics_2_0_api.v2.model.EnvironmentState;
import com.ibm.cloud.schematics_2_0_api.v2.model.EnvironmentUserState;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExecuteResourceQueryOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSource;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceCatalog;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceCosBucket;
import com.ibm.cloud.schematics_2_0_api.v2.model.ExternalSourceGit;
import com.ibm.cloud.schematics_2_0_api.v2.model.Flow;
import com.ibm.cloud.schematics_2_0_api.v2.model.FlowOperations;
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
import com.ibm.cloud.schematics_2_0_api.v2.model.ItemSKU;
import com.ibm.cloud.schematics_2_0_api.v2.model.Job;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobData;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataAction;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataCapsule;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataFlow;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataSystem;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataTemplate;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataWorkItem;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataWorkItemLastJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobDataWorkspace;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobList;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLite;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLog;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummary;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryActionJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryActionJobRecap;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryFlowJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryLogErrors;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryRepoDownloadJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummarySystemJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryWorkitems;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobLogSummaryWorkspaceJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobResultCapsule;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStateData;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStateDataSummary;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatus;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusAction;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusFlow;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusSchematicsResources;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusSystem;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusTemplate;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusWorkitem;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusWorkspace;
import com.ibm.cloud.schematics_2_0_api.v2.model.JobStatusWorkspaceTemplateFlow;
import com.ibm.cloud.schematics_2_0_api.v2.model.KMSDiscovery;
import com.ibm.cloud.schematics_2_0_api.v2.model.KMSInstances;
import com.ibm.cloud.schematics_2_0_api.v2.model.KMSInstancesKeys;
import com.ibm.cloud.schematics_2_0_api.v2.model.KMSSettings;
import com.ibm.cloud.schematics_2_0_api.v2.model.KMSSettingsPrimaryCrk;
import com.ibm.cloud.schematics_2_0_api.v2.model.KMSSettingsSecondaryCrk;
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
import com.ibm.cloud.schematics_2_0_api.v2.model.OrderItemConfiguration;
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
import com.ibm.cloud.schematics_2_0_api.v2.model.ResourceQuery;
import com.ibm.cloud.schematics_2_0_api.v2.model.ResourceQueryDefinition;
import com.ibm.cloud.schematics_2_0_api.v2.model.ResourceQueryParam;
import com.ibm.cloud.schematics_2_0_api.v2.model.ResourceQueryRecord;
import com.ibm.cloud.schematics_2_0_api.v2.model.ResourceQueryRecordList;
import com.ibm.cloud.schematics_2_0_api.v2.model.ResourceQueryResponseRecord;
import com.ibm.cloud.schematics_2_0_api.v2.model.ResourceQueryResponseRecordQueryOutput;
import com.ibm.cloud.schematics_2_0_api.v2.model.ResourceQueryResponseRecordResponse;
import com.ibm.cloud.schematics_2_0_api.v2.model.RunFulfilmentOperationOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.SKUUserState;
import com.ibm.cloud.schematics_2_0_api.v2.model.SchematicsAccessRule;
import com.ibm.cloud.schematics_2_0_api.v2.model.SchematicsAccessRuleList;
import com.ibm.cloud.schematics_2_0_api.v2.model.SchematicsInfo;
import com.ibm.cloud.schematics_2_0_api.v2.model.SchematicsLocationsList;
import com.ibm.cloud.schematics_2_0_api.v2.model.SchematicsLocationsLite;
import com.ibm.cloud.schematics_2_0_api.v2.model.SchematicsRuntimeInfo;
import com.ibm.cloud.schematics_2_0_api.v2.model.ServiceMappingRule;
import com.ibm.cloud.schematics_2_0_api.v2.model.ServiceVariableData;
import com.ibm.cloud.schematics_2_0_api.v2.model.SystemLock;
import com.ibm.cloud.schematics_2_0_api.v2.model.TargetRequest;
import com.ibm.cloud.schematics_2_0_api.v2.model.Template;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateCommand;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlow;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlowDataValidationStatus;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlowDefinition;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlowDefinitionSimpleFlow;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlowDefinitionTemplateOperation;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlowList;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlowLite;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlowValidationLogs;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateFlowValidationSummary;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateList;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateListRequest;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateLite;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateMetaDataRequest;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateMetaDataResponse;
import com.ibm.cloud.schematics_2_0_api.v2.model.TemplateRepoTarUploadResponse;
import com.ibm.cloud.schematics_2_0_api.v2.model.Trigger;
import com.ibm.cloud.schematics_2_0_api.v2.model.TriggerJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.TriggerList;
import com.ibm.cloud.schematics_2_0_api.v2.model.TriggerScheduled;
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
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateOrderItemConfiguration;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateTemplateInWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UpdateWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UploadTemplateTarActionOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UploadTemplateTarInWorkspaceOptions;
import com.ibm.cloud.schematics_2_0_api.v2.model.UserState;
import com.ibm.cloud.schematics_2_0_api.v2.model.ValueListResponse;
import com.ibm.cloud.schematics_2_0_api.v2.model.ValueResponse;
import com.ibm.cloud.schematics_2_0_api.v2.model.VariableData;
import com.ibm.cloud.schematics_2_0_api.v2.model.VariableDataList;
import com.ibm.cloud.schematics_2_0_api.v2.model.VariableMetadata;
import com.ibm.cloud.schematics_2_0_api.v2.model.WebHook;
import com.ibm.cloud.schematics_2_0_api.v2.model.WebHookList;
import com.ibm.cloud.schematics_2_0_api.v2.model.WorkItem;
import com.ibm.cloud.schematics_2_0_api.v2.model.WorkItemLastJob;
import com.ibm.cloud.schematics_2_0_api.v2.model.Workspace;
import com.ibm.cloud.schematics_2_0_api.v2.model.WorkspaceList;
import com.ibm.cloud.schematics_2_0_api.v2.model.WorkspaceLite;
import com.ibm.cloud.schematics_2_0_api.v2.model.WorkspaceLiteState;
import com.ibm.cloud.schematics_2_0_api.v2.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Schematics20Api service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class Schematics20ApiTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected Schematics20Api schematics20ApiService;

  // Creates a mock set of environment variables that are returned by EnvironmentUtils.getenv().
  private Map<String, String> getTestProcessEnvironment() {
    Map<String, String> env = new HashMap<>();
    env.put("TESTSERVICE_AUTH_TYPE", "noAuth");
    return env;
  }

  public void constructClientService() throws Throwable {
    PowerMockito.spy(EnvironmentUtils.class);
    PowerMockito.when(EnvironmentUtils.getenv()).thenReturn(getTestProcessEnvironment());
    final String serviceName = "testService";

    schematics20ApiService = Schematics20Api.newInstance(serviceName);
    String url = server.url("/").toString();
    schematics20ApiService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";

    new Schematics20Api(serviceName, null);
  }

  @Test
  public void testGetSchematicsInfoWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"schematics_version\": \"schematicsVersion\", \"schematics_build\": \"schematicsBuild\", \"supported_locations\": [\"us-south\"], \"supported_templates\": {\"mapKey\": [\"terraform_v0_11\"]}, \"supported_runtimes\": {\"mapKey\": [{\"runtime_image\": \"runtimeImage\", \"runtime_properties\": {\"mapKey\": [\"inner\"]}}]}}";
    String getSchematicsInfoPath = "/v2/info";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSchematicsInfoOptions model
    GetSchematicsInfoOptions getSchematicsInfoOptionsModel = new GetSchematicsInfoOptions();

    // Invoke operation with valid options model (positive test)
    Response<SchematicsInfo> response = schematics20ApiService.getSchematicsInfo(getSchematicsInfoOptionsModel).execute();
    assertNotNull(response);
    SchematicsInfo responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSchematicsInfoPath);
  }

  @Test
  public void testListSchematicsAccessRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"access_rules\": [{\"effect\": \"allow\", \"command_name\": \"workspace_plan\", \"command_parameter\": \"commandParameter\", \"principal\": \"principal\", \"origin\": \"workspaces\"}]}";
    String listSchematicsAccessRulesPath = "/v2/access";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListSchematicsAccessRulesOptions model
    ListSchematicsAccessRulesOptions listSchematicsAccessRulesOptionsModel = new ListSchematicsAccessRulesOptions();

    // Invoke operation with valid options model (positive test)
    Response<SchematicsAccessRuleList> response = schematics20ApiService.listSchematicsAccessRules(listSchematicsAccessRulesOptionsModel).execute();
    assertNotNull(response);
    SchematicsAccessRuleList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listSchematicsAccessRulesPath);
  }

  @Test
  public void testGetSchematicsAccessRulesForResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"access_rules\": [{\"effect\": \"allow\", \"command_name\": \"workspace_plan\", \"command_parameter\": \"commandParameter\", \"principal\": \"principal\", \"origin\": \"workspaces\"}]}";
    String getSchematicsAccessRulesForResourcePath = "/v2/access/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSchematicsAccessRulesForResourceOptions model
    GetSchematicsAccessRulesForResourceOptions getSchematicsAccessRulesForResourceOptionsModel = new GetSchematicsAccessRulesForResourceOptions.Builder()
    .resourceName("testString")
    .commandName("testString")
    .commandParameter("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SchematicsAccessRuleList> response = schematics20ApiService.getSchematicsAccessRulesForResource(getSchematicsAccessRulesForResourceOptionsModel).execute();
    assertNotNull(response);
    SchematicsAccessRuleList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("command_name"), "testString");
    assertEquals(query.get("command_parameter"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSchematicsAccessRulesForResourcePath);
  }

  // Test the getSchematicsAccessRulesForResource operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSchematicsAccessRulesForResourceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getSchematicsAccessRulesForResource(null).execute();
  }

  @Test
  public void testGetSchematicsCommandNamesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"commands\": [{\"command_name\": \"workspace_plan\", \"command_parameter\": \"commandParameter\"}]}";
    String getSchematicsCommandNamesPath = "/v2/commands/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetSchematicsCommandNamesOptions model
    GetSchematicsCommandNamesOptions getSchematicsCommandNamesOptionsModel = new GetSchematicsCommandNamesOptions.Builder()
    .resourceName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CommandList> response = schematics20ApiService.getSchematicsCommandNames(getSchematicsCommandNamesOptionsModel).execute();
    assertNotNull(response);
    CommandList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSchematicsCommandNamesPath);
  }

  // Test the getSchematicsCommandNames operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSchematicsCommandNamesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getSchematicsCommandNames(null).execute();
  }

  @Test
  public void testListWorkspacesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"workspaces\": [{\"name\": \"name\", \"description\": \"description\", \"id\": \"id\", \"crn\": \"crn\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\"}]}";
    String listWorkspacesPath = "/v2/workspaces";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListWorkspacesOptions model
    ListWorkspacesOptions listWorkspacesOptionsModel = new ListWorkspacesOptions.Builder()
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .sort("testString")
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WorkspaceList> response = schematics20ApiService.listWorkspaces(listWorkspacesOptionsModel).execute();
    assertNotNull(response);
    WorkspaceList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listWorkspacesPath);
  }

  @Test
  public void testCreateWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"My Workspace\", \"description\": \"This workspace manages front-end micro service for production environment\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"destroy_resources_on_delete\": true, \"location\": \"us-south\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"command_parameter\": \"commandParameter\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"templates\": [{\"name\": \"vpc_terraform / helm_front_end_app_micro_service\", \"description\": \"This template provisions clusters in production environment\", \"type\": \"type\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_readme_url\": \"sourceReadmeUrl\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"inventory\": \"inventory\", \"id\": \"id\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"status\": {\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}]}";
    String createWorkspacePath = "/v2/workspaces";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the WorkspaceLiteState model
    WorkspaceLiteState workspaceLiteStateModel = new WorkspaceLiteState.Builder()
    .statusCode("normal")
    .statusMessage("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Workspace model
    Workspace workspaceModel = new Workspace.Builder()
    .name("My Workspace")
    .description("This workspace manages front-end micro service for production environment")
    .resourceGroup("testString")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .destroyResourcesOnDelete(true)
    .location("us-south")
    .userState(userStateModel)
    .commandParameter("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .state(workspaceLiteStateModel)
    .sysLock(systemLockModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the CreateWorkspaceOptions model
    CreateWorkspaceOptions createWorkspaceOptionsModel = new CreateWorkspaceOptions.Builder()
    .workspace(workspaceModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Workspace> response = schematics20ApiService.createWorkspace(createWorkspaceOptionsModel).execute();
    assertNotNull(response);
    Workspace responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createWorkspacePath);
  }

  // Test the createWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.createWorkspace(null).execute();
  }

  @Test
  public void testGetWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"My Workspace\", \"description\": \"This workspace manages front-end micro service for production environment\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"destroy_resources_on_delete\": true, \"location\": \"us-south\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"command_parameter\": \"commandParameter\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"templates\": [{\"name\": \"vpc_terraform / helm_front_end_app_micro_service\", \"description\": \"This template provisions clusters in production environment\", \"type\": \"type\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_readme_url\": \"sourceReadmeUrl\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"inventory\": \"inventory\", \"id\": \"id\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"status\": {\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}]}";
    String getWorkspacePath = "/v2/workspaces/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceOptions model
    GetWorkspaceOptions getWorkspaceOptionsModel = new GetWorkspaceOptions.Builder()
    .workspaceId("testString")
    .profile("summary")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Workspace> response = schematics20ApiService.getWorkspace(getWorkspaceOptionsModel).execute();
    assertNotNull(response);
    Workspace responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("profile"), "summary");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspacePath);
  }

  // Test the getWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getWorkspace(null).execute();
  }

  @Test
  public void testReplaceWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"My Workspace\", \"description\": \"This workspace manages front-end micro service for production environment\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"destroy_resources_on_delete\": true, \"location\": \"us-south\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"command_parameter\": \"commandParameter\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"templates\": [{\"name\": \"vpc_terraform / helm_front_end_app_micro_service\", \"description\": \"This template provisions clusters in production environment\", \"type\": \"type\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_readme_url\": \"sourceReadmeUrl\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"inventory\": \"inventory\", \"id\": \"id\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"status\": {\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}]}";
    String replaceWorkspacePath = "/v2/workspaces/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the WorkspaceLiteState model
    WorkspaceLiteState workspaceLiteStateModel = new WorkspaceLiteState.Builder()
    .statusCode("normal")
    .statusMessage("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Workspace model
    Workspace workspaceModel = new Workspace.Builder()
    .name("My Workspace")
    .description("This workspace manages front-end micro service for production environment")
    .resourceGroup("testString")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .destroyResourcesOnDelete(true)
    .location("us-south")
    .userState(userStateModel)
    .commandParameter("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .state(workspaceLiteStateModel)
    .sysLock(systemLockModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the ReplaceWorkspaceOptions model
    ReplaceWorkspaceOptions replaceWorkspaceOptionsModel = new ReplaceWorkspaceOptions.Builder()
    .workspaceId("testString")
    .workspace(workspaceModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Workspace> response = schematics20ApiService.replaceWorkspace(replaceWorkspaceOptionsModel).execute();
    assertNotNull(response);
    Workspace responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceWorkspacePath);
  }

  // Test the replaceWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.replaceWorkspace(null).execute();
  }

  @Test
  public void testDeleteWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteWorkspacePath = "/v2/workspaces/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteWorkspaceOptions model
    DeleteWorkspaceOptions deleteWorkspaceOptionsModel = new DeleteWorkspaceOptions.Builder()
    .workspaceId("testString")
    .force(true)
    .propagate(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematics20ApiService.deleteWorkspace(deleteWorkspaceOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteWorkspacePath);
  }

  // Test the deleteWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.deleteWorkspace(null).execute();
  }

  @Test
  public void testUpdateWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"My Workspace\", \"description\": \"This workspace manages front-end micro service for production environment\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"destroy_resources_on_delete\": true, \"location\": \"us-south\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"command_parameter\": \"commandParameter\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"templates\": [{\"name\": \"vpc_terraform / helm_front_end_app_micro_service\", \"description\": \"This template provisions clusters in production environment\", \"type\": \"type\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_readme_url\": \"sourceReadmeUrl\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"inventory\": \"inventory\", \"id\": \"id\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"status\": {\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}]}";
    String updateWorkspacePath = "/v2/workspaces/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the WorkspaceLiteState model
    WorkspaceLiteState workspaceLiteStateModel = new WorkspaceLiteState.Builder()
    .statusCode("normal")
    .statusMessage("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Workspace model
    Workspace workspaceModel = new Workspace.Builder()
    .name("My Workspace")
    .description("This workspace manages front-end micro service for production environment")
    .resourceGroup("testString")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .destroyResourcesOnDelete(true)
    .location("us-south")
    .userState(userStateModel)
    .commandParameter("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .state(workspaceLiteStateModel)
    .sysLock(systemLockModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the UpdateWorkspaceOptions model
    UpdateWorkspaceOptions updateWorkspaceOptionsModel = new UpdateWorkspaceOptions.Builder()
    .workspaceId("testString")
    .workspace(workspaceModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Workspace> response = schematics20ApiService.updateWorkspace(updateWorkspaceOptionsModel).execute();
    assertNotNull(response);
    Workspace responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateWorkspacePath);
  }

  // Test the updateWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.updateWorkspace(null).execute();
  }

  @Test
  public void testListWorkspaceInputsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}]}";
    String listWorkspaceInputsPath = "/v2/workspaces/testString/inputs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListWorkspaceInputsOptions model
    ListWorkspaceInputsOptions listWorkspaceInputsOptionsModel = new ListWorkspaceInputsOptions.Builder()
    .workspaceId("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InputVariableDataList> response = schematics20ApiService.listWorkspaceInputs(listWorkspaceInputsOptionsModel).execute();
    assertNotNull(response);
    InputVariableDataList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listWorkspaceInputsPath);
  }

  // Test the listWorkspaceInputs operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListWorkspaceInputsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.listWorkspaceInputs(null).execute();
  }

  @Test
  public void testListWorkspaceOutputsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}]}";
    String listWorkspaceOutputsPath = "/v2/workspaces/testString/outputs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListWorkspaceOutputsOptions model
    ListWorkspaceOutputsOptions listWorkspaceOutputsOptionsModel = new ListWorkspaceOutputsOptions.Builder()
    .workspaceId("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<OutputVariableDataList> response = schematics20ApiService.listWorkspaceOutputs(listWorkspaceOutputsOptionsModel).execute();
    assertNotNull(response);
    OutputVariableDataList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listWorkspaceOutputsPath);
  }

  // Test the listWorkspaceOutputs operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListWorkspaceOutputsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.listWorkspaceOutputs(null).execute();
  }

  @Test
  public void testCreateWorkspaceTemplatesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"My Workspace\", \"description\": \"This workspace manages front-end micro service for production environment\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"destroy_resources_on_delete\": true, \"location\": \"us-south\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"command_parameter\": \"commandParameter\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"templates\": [{\"name\": \"vpc_terraform / helm_front_end_app_micro_service\", \"description\": \"This template provisions clusters in production environment\", \"type\": \"type\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_readme_url\": \"sourceReadmeUrl\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"inventory\": \"inventory\", \"id\": \"id\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"status\": {\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}]}";
    String createWorkspaceTemplatesPath = "/v2/templates";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusTemplate model
    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Template model
    Template templateModel = new Template.Builder()
    .name("vpc_terraform / helm_front_end_app_micro_service")
    .description("This template provisions clusters in production environment")
    .type("testString")
    .userState(userStateModel)
    .sourceType("local")
    .source(externalSourceModel)
    .sourceReadmeUrl("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .inventory("testString")
    .status(jobStatusTemplateModel)
    .sysLock(systemLockModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateListRequest model
    TemplateListRequest templateListRequestModel = new TemplateListRequest.Builder()
    .templates(new java.util.ArrayList<Template>(java.util.Arrays.asList(templateModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the CreateWorkspaceTemplatesOptions model
    CreateWorkspaceTemplatesOptions createWorkspaceTemplatesOptionsModel = new CreateWorkspaceTemplatesOptions.Builder()
    .templateListRequest(templateListRequestModel)
    .xGithubToken("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Workspace> response = schematics20ApiService.createWorkspaceTemplates(createWorkspaceTemplatesOptionsModel).execute();
    assertNotNull(response);
    Workspace responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createWorkspaceTemplatesPath);
  }

  // Test the createWorkspaceTemplates operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateWorkspaceTemplatesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.createWorkspaceTemplates(null).execute();
  }

  @Test
  public void testListTemplatesInWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"templates\": [{\"id\": \"id\", \"name\": \"vpc_terraform / helm_front_end_app_micro_service\", \"description\": \"This template provisions clusters in production environment\", \"type\": \"type\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"source_type\": \"local\", \"status\": {\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\"}]}";
    String listTemplatesInWorkspacePath = "/v2/workspaces/testString/templates";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListTemplatesInWorkspaceOptions model
    ListTemplatesInWorkspaceOptions listTemplatesInWorkspaceOptionsModel = new ListTemplatesInWorkspaceOptions.Builder()
    .workspaceId("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .sort("testString")
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TemplateList> response = schematics20ApiService.listTemplatesInWorkspace(listTemplatesInWorkspaceOptionsModel).execute();
    assertNotNull(response);
    TemplateList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTemplatesInWorkspacePath);
  }

  // Test the listTemplatesInWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTemplatesInWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.listTemplatesInWorkspace(null).execute();
  }

  @Test
  public void testAddTemplatesToWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"vpc_terraform / helm_front_end_app_micro_service\", \"description\": \"This template provisions clusters in production environment\", \"type\": \"type\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_readme_url\": \"sourceReadmeUrl\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"inventory\": \"inventory\", \"id\": \"id\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"status\": {\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}";
    String addTemplatesToWorkspacePath = "/v2/workspaces/testString/templates";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusTemplate model
    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Template model
    Template templateModel = new Template.Builder()
    .name("vpc_terraform / helm_front_end_app_micro_service")
    .description("This template provisions clusters in production environment")
    .type("testString")
    .userState(userStateModel)
    .sourceType("local")
    .source(externalSourceModel)
    .sourceReadmeUrl("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .inventory("testString")
    .status(jobStatusTemplateModel)
    .sysLock(systemLockModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the AddTemplatesToWorkspaceOptions model
    AddTemplatesToWorkspaceOptions addTemplatesToWorkspaceOptionsModel = new AddTemplatesToWorkspaceOptions.Builder()
    .workspaceId("testString")
    .template(templateModel)
    .xGithubToken("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Template> response = schematics20ApiService.addTemplatesToWorkspace(addTemplatesToWorkspaceOptionsModel).execute();
    assertNotNull(response);
    Template responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, addTemplatesToWorkspacePath);
  }

  // Test the addTemplatesToWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddTemplatesToWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.addTemplatesToWorkspace(null).execute();
  }

  @Test
  public void testGetTemplateInWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"vpc_terraform / helm_front_end_app_micro_service\", \"description\": \"This template provisions clusters in production environment\", \"type\": \"type\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_readme_url\": \"sourceReadmeUrl\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"inventory\": \"inventory\", \"id\": \"id\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"status\": {\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}";
    String getTemplateInWorkspacePath = "/v2/workspaces/testString/templates/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetTemplateInWorkspaceOptions model
    GetTemplateInWorkspaceOptions getTemplateInWorkspaceOptionsModel = new GetTemplateInWorkspaceOptions.Builder()
    .workspaceId("testString")
    .templateId("testString")
    .profile("summary")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Template> response = schematics20ApiService.getTemplateInWorkspace(getTemplateInWorkspaceOptionsModel).execute();
    assertNotNull(response);
    Template responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("profile"), "summary");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTemplateInWorkspacePath);
  }

  // Test the getTemplateInWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTemplateInWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getTemplateInWorkspace(null).execute();
  }

  @Test
  public void testReplaceTemplateInWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"vpc_terraform / helm_front_end_app_micro_service\", \"description\": \"This template provisions clusters in production environment\", \"type\": \"type\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_readme_url\": \"sourceReadmeUrl\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"inventory\": \"inventory\", \"id\": \"id\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"status\": {\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}";
    String replaceTemplateInWorkspacePath = "/v2/workspaces/testString/templates/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusTemplate model
    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Template model
    Template templateModel = new Template.Builder()
    .name("vpc_terraform / helm_front_end_app_micro_service")
    .description("This template provisions clusters in production environment")
    .type("testString")
    .userState(userStateModel)
    .sourceType("local")
    .source(externalSourceModel)
    .sourceReadmeUrl("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .inventory("testString")
    .status(jobStatusTemplateModel)
    .sysLock(systemLockModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the ReplaceTemplateInWorkspaceOptions model
    ReplaceTemplateInWorkspaceOptions replaceTemplateInWorkspaceOptionsModel = new ReplaceTemplateInWorkspaceOptions.Builder()
    .workspaceId("testString")
    .templateId("testString")
    .template(templateModel)
    .xGithubToken("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Template> response = schematics20ApiService.replaceTemplateInWorkspace(replaceTemplateInWorkspaceOptionsModel).execute();
    assertNotNull(response);
    Template responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceTemplateInWorkspacePath);
  }

  // Test the replaceTemplateInWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceTemplateInWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.replaceTemplateInWorkspace(null).execute();
  }

  @Test
  public void testDeleteTemplateFromWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteTemplateFromWorkspacePath = "/v2/workspaces/testString/templates/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteTemplateFromWorkspaceOptions model
    DeleteTemplateFromWorkspaceOptions deleteTemplateFromWorkspaceOptionsModel = new DeleteTemplateFromWorkspaceOptions.Builder()
    .workspaceId("testString")
    .templateId("testString")
    .force(true)
    .propagate(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematics20ApiService.deleteTemplateFromWorkspace(deleteTemplateFromWorkspaceOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteTemplateFromWorkspacePath);
  }

  // Test the deleteTemplateFromWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteTemplateFromWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.deleteTemplateFromWorkspace(null).execute();
  }

  @Test
  public void testUpdateTemplateInWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"vpc_terraform / helm_front_end_app_micro_service\", \"description\": \"This template provisions clusters in production environment\", \"type\": \"type\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_readme_url\": \"sourceReadmeUrl\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"inventory\": \"inventory\", \"id\": \"id\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"status\": {\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}";
    String updateTemplateInWorkspacePath = "/v2/workspaces/testString/templates/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusTemplate model
    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Template model
    Template templateModel = new Template.Builder()
    .name("vpc_terraform / helm_front_end_app_micro_service")
    .description("This template provisions clusters in production environment")
    .type("testString")
    .userState(userStateModel)
    .sourceType("local")
    .source(externalSourceModel)
    .sourceReadmeUrl("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .inventory("testString")
    .status(jobStatusTemplateModel)
    .sysLock(systemLockModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the UpdateTemplateInWorkspaceOptions model
    UpdateTemplateInWorkspaceOptions updateTemplateInWorkspaceOptionsModel = new UpdateTemplateInWorkspaceOptions.Builder()
    .workspaceId("testString")
    .templateId("testString")
    .template(templateModel)
    .xGithubToken("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Template> response = schematics20ApiService.updateTemplateInWorkspace(updateTemplateInWorkspaceOptionsModel).execute();
    assertNotNull(response);
    Template responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateTemplateInWorkspacePath);
  }

  // Test the updateTemplateInWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateTemplateInWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.updateTemplateInWorkspace(null).execute();
  }

  @Test
  public void testUploadTemplateTarInWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"vpc_terraform / helm_front_end_app_micro_service\", \"description\": \"This template provisions clusters in production environment\", \"type\": \"type\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_readme_url\": \"sourceReadmeUrl\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"inventory\": \"inventory\", \"id\": \"id\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"status\": {\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}";
    String uploadTemplateTarInWorkspacePath = "/v2/workspaces/testString/templates/testString/content";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UploadTemplateTarInWorkspaceOptions model
    UploadTemplateTarInWorkspaceOptions uploadTemplateTarInWorkspaceOptionsModel = new UploadTemplateTarInWorkspaceOptions.Builder()
    .workspaceId("testString")
    .templateId("testString")
    .tarFile(TestUtilities.createMockStream("This is a mock file."))
    .tarFileContentType("testString")
    .xGithubToken("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Template> response = schematics20ApiService.uploadTemplateTarInWorkspace(uploadTemplateTarInWorkspaceOptionsModel).execute();
    assertNotNull(response);
    Template responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, uploadTemplateTarInWorkspacePath);
  }

  // Test the uploadTemplateTarInWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUploadTemplateTarInWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.uploadTemplateTarInWorkspace(null).execute();
  }

  @Test
  public void testGetTemplateReadmeWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "\"operationResponse\"";
    String getTemplateReadmePath = "/v2/workspaces/testString/templates/testString/readme";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "text/markdown")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetTemplateReadmeOptions model
    GetTemplateReadmeOptions getTemplateReadmeOptionsModel = new GetTemplateReadmeOptions.Builder()
    .workspaceId("testString")
    .templateId("testString")
    .accept("text/markdown")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<String> response = schematics20ApiService.getTemplateReadme(getTemplateReadmeOptionsModel).execute();
    assertNotNull(response);
    String responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTemplateReadmePath);
  }

  // Test the getTemplateReadme operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTemplateReadmeNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getTemplateReadme(null).execute();
  }

  @Test
  public void testGetTemplateSourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}";
    String getTemplateSourcePath = "/v2/workspaces/testString/templates/testString/source";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetTemplateSourceOptions model
    GetTemplateSourceOptions getTemplateSourceOptionsModel = new GetTemplateSourceOptions.Builder()
    .workspaceId("testString")
    .templateId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ExternalSource> response = schematics20ApiService.getTemplateSource(getTemplateSourceOptionsModel).execute();
    assertNotNull(response);
    ExternalSource responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTemplateSourcePath);
  }

  // Test the getTemplateSource operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTemplateSourceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getTemplateSource(null).execute();
  }

  @Test
  public void testListTemplateInputsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"variables\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}]}";
    String listTemplateInputsPath = "/v2/workspaces/testString/templates/testString/inputs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListTemplateInputsOptions model
    ListTemplateInputsOptions listTemplateInputsOptionsModel = new ListTemplateInputsOptions.Builder()
    .workspaceId("testString")
    .templateId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VariableDataList> response = schematics20ApiService.listTemplateInputs(listTemplateInputsOptionsModel).execute();
    assertNotNull(response);
    VariableDataList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTemplateInputsPath);
  }

  // Test the listTemplateInputs operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTemplateInputsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.listTemplateInputs(null).execute();
  }

  @Test
  public void testListTemplateOutputsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"variables\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}]}";
    String listTemplateOutputsPath = "/v2/workspaces/testString/templates/testString/outputs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListTemplateOutputsOptions model
    ListTemplateOutputsOptions listTemplateOutputsOptionsModel = new ListTemplateOutputsOptions.Builder()
    .workspaceId("testString")
    .templateId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VariableDataList> response = schematics20ApiService.listTemplateOutputs(listTemplateOutputsOptionsModel).execute();
    assertNotNull(response);
    VariableDataList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTemplateOutputsPath);
  }

  // Test the listTemplateOutputs operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListTemplateOutputsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.listTemplateOutputs(null).execute();
  }

  @Test
  public void testListFlowsInWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"flows\": [{\"id\": \"id\", \"name\": \"name\", \"version\": \"version\", \"type\": \"simple_flow\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\"}]}";
    String listFlowsInWorkspacePath = "/v2/workspaces/testString/flows";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListFlowsInWorkspaceOptions model
    ListFlowsInWorkspaceOptions listFlowsInWorkspaceOptionsModel = new ListFlowsInWorkspaceOptions.Builder()
    .workspaceId("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .sort("testString")
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TemplateFlowList> response = schematics20ApiService.listFlowsInWorkspace(listFlowsInWorkspaceOptionsModel).execute();
    assertNotNull(response);
    TemplateFlowList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listFlowsInWorkspacePath);
  }

  // Test the listFlowsInWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListFlowsInWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.listFlowsInWorkspace(null).execute();
  }

  @Test
  public void testAddFlowToWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"version\": \"version\", \"type\": \"simple_flow\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"definition\": {\"flow_type\": \"simple\", \"id\": \"id\", \"simple_flow\": [{\"index\": 5, \"control\": \"do\", \"template_operation\": {\"pre_condition\": \"preCondition\", \"template_id\": \"templateId\", \"override_command\": {\"command\": \"workspace_plan\", \"command_options\": [\"commandOptions\"]}, \"post_condition\": \"postCondition\", \"on_error\": \"onError\"}}], \"custom_flow\": \"VGhpcyBpcyBhbiBlbmNvZGVkIGJ5dGUgYXJyYXku\"}, \"id\": \"id\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"validation_summary\": {\"warning_count\": 12, \"error_count\": 10}, \"validation_logs\": [{\"flow_index\": 9, \"inputs_status\": [{\"log_level\": \"info\", \"var_name\": \"varName\", \"var_status\": \"varStatus\"}], \"outputs_status\": [{\"log_level\": \"info\", \"var_name\": \"varName\", \"var_status\": \"varStatus\"}]}]}";
    String addFlowToWorkspacePath = "/v2/workspaces/testString/flows";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateCommand model
    TemplateCommand templateCommandModel = new TemplateCommand.Builder()
    .command("workspace_plan")
    .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateFlowDefinitionTemplateOperation model
    TemplateFlowDefinitionTemplateOperation templateFlowDefinitionTemplateOperationModel = new TemplateFlowDefinitionTemplateOperation.Builder()
    .preCondition("testString")
    .templateId("testString")
    .overrideCommand(templateCommandModel)
    .postCondition("testString")
    .onError("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateFlowDefinitionSimpleFlow model
    TemplateFlowDefinitionSimpleFlow templateFlowDefinitionSimpleFlowModel = new TemplateFlowDefinitionSimpleFlow.Builder()
    .index(Long.valueOf("26"))
    .control("do")
    .templateOperation(templateFlowDefinitionTemplateOperationModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateFlowDefinition model
    TemplateFlowDefinition templateFlowDefinitionModel = new TemplateFlowDefinition.Builder()
    .flowType("simple")
    .id("testString")
    .simpleFlow(new java.util.ArrayList<TemplateFlowDefinitionSimpleFlow>(java.util.Arrays.asList(templateFlowDefinitionSimpleFlowModel)))
    .customFlow(TestUtilities.createMockByteArray("This is a mock byte array value."))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkspaceTemplateFlow model
    JobStatusWorkspaceTemplateFlow jobStatusWorkspaceTemplateFlowModel = new JobStatusWorkspaceTemplateFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateFlowValidationSummary model
    TemplateFlowValidationSummary templateFlowValidationSummaryModel = new TemplateFlowValidationSummary.Builder()
    .warningCount(Double.valueOf("72.5"))
    .errorCount(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateFlow model
    TemplateFlow templateFlowModel = new TemplateFlow.Builder()
    .name("testString")
    .version("testString")
    .type("simple_flow")
    .userState(userStateModel)
    .definition(templateFlowDefinitionModel)
    .sysLock(systemLockModel)
    .status(jobStatusWorkspaceTemplateFlowModel)
    .validationSummary(templateFlowValidationSummaryModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the AddFlowToWorkspaceOptions model
    AddFlowToWorkspaceOptions addFlowToWorkspaceOptionsModel = new AddFlowToWorkspaceOptions.Builder()
    .workspaceId("testString")
    .templateFlow(templateFlowModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TemplateFlow> response = schematics20ApiService.addFlowToWorkspace(addFlowToWorkspaceOptionsModel).execute();
    assertNotNull(response);
    TemplateFlow responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, addFlowToWorkspacePath);
  }

  // Test the addFlowToWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddFlowToWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.addFlowToWorkspace(null).execute();
  }

  @Test
  public void testGetFlowInWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"version\": \"version\", \"type\": \"simple_flow\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"definition\": {\"flow_type\": \"simple\", \"id\": \"id\", \"simple_flow\": [{\"index\": 5, \"control\": \"do\", \"template_operation\": {\"pre_condition\": \"preCondition\", \"template_id\": \"templateId\", \"override_command\": {\"command\": \"workspace_plan\", \"command_options\": [\"commandOptions\"]}, \"post_condition\": \"postCondition\", \"on_error\": \"onError\"}}], \"custom_flow\": \"VGhpcyBpcyBhbiBlbmNvZGVkIGJ5dGUgYXJyYXku\"}, \"id\": \"id\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"validation_summary\": {\"warning_count\": 12, \"error_count\": 10}, \"validation_logs\": [{\"flow_index\": 9, \"inputs_status\": [{\"log_level\": \"info\", \"var_name\": \"varName\", \"var_status\": \"varStatus\"}], \"outputs_status\": [{\"log_level\": \"info\", \"var_name\": \"varName\", \"var_status\": \"varStatus\"}]}]}";
    String getFlowInWorkspacePath = "/v2/workspaces/testString/flows/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetFlowInWorkspaceOptions model
    GetFlowInWorkspaceOptions getFlowInWorkspaceOptionsModel = new GetFlowInWorkspaceOptions.Builder()
    .workspaceId("testString")
    .flowId("testString")
    .profile("summary")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TemplateFlow> response = schematics20ApiService.getFlowInWorkspace(getFlowInWorkspaceOptionsModel).execute();
    assertNotNull(response);
    TemplateFlow responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("profile"), "summary");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getFlowInWorkspacePath);
  }

  // Test the getFlowInWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetFlowInWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getFlowInWorkspace(null).execute();
  }

  @Test
  public void testReplaceFlowInWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"version\": \"version\", \"type\": \"simple_flow\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"definition\": {\"flow_type\": \"simple\", \"id\": \"id\", \"simple_flow\": [{\"index\": 5, \"control\": \"do\", \"template_operation\": {\"pre_condition\": \"preCondition\", \"template_id\": \"templateId\", \"override_command\": {\"command\": \"workspace_plan\", \"command_options\": [\"commandOptions\"]}, \"post_condition\": \"postCondition\", \"on_error\": \"onError\"}}], \"custom_flow\": \"VGhpcyBpcyBhbiBlbmNvZGVkIGJ5dGUgYXJyYXku\"}, \"id\": \"id\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"validation_summary\": {\"warning_count\": 12, \"error_count\": 10}, \"validation_logs\": [{\"flow_index\": 9, \"inputs_status\": [{\"log_level\": \"info\", \"var_name\": \"varName\", \"var_status\": \"varStatus\"}], \"outputs_status\": [{\"log_level\": \"info\", \"var_name\": \"varName\", \"var_status\": \"varStatus\"}]}]}";
    String replaceFlowInWorkspacePath = "/v2/workspaces/testString/flows/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateCommand model
    TemplateCommand templateCommandModel = new TemplateCommand.Builder()
    .command("workspace_plan")
    .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateFlowDefinitionTemplateOperation model
    TemplateFlowDefinitionTemplateOperation templateFlowDefinitionTemplateOperationModel = new TemplateFlowDefinitionTemplateOperation.Builder()
    .preCondition("testString")
    .templateId("testString")
    .overrideCommand(templateCommandModel)
    .postCondition("testString")
    .onError("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateFlowDefinitionSimpleFlow model
    TemplateFlowDefinitionSimpleFlow templateFlowDefinitionSimpleFlowModel = new TemplateFlowDefinitionSimpleFlow.Builder()
    .index(Long.valueOf("26"))
    .control("do")
    .templateOperation(templateFlowDefinitionTemplateOperationModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateFlowDefinition model
    TemplateFlowDefinition templateFlowDefinitionModel = new TemplateFlowDefinition.Builder()
    .flowType("simple")
    .id("testString")
    .simpleFlow(new java.util.ArrayList<TemplateFlowDefinitionSimpleFlow>(java.util.Arrays.asList(templateFlowDefinitionSimpleFlowModel)))
    .customFlow(TestUtilities.createMockByteArray("This is a mock byte array value."))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkspaceTemplateFlow model
    JobStatusWorkspaceTemplateFlow jobStatusWorkspaceTemplateFlowModel = new JobStatusWorkspaceTemplateFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateFlowValidationSummary model
    TemplateFlowValidationSummary templateFlowValidationSummaryModel = new TemplateFlowValidationSummary.Builder()
    .warningCount(Double.valueOf("72.5"))
    .errorCount(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateFlow model
    TemplateFlow templateFlowModel = new TemplateFlow.Builder()
    .name("testString")
    .version("testString")
    .type("simple_flow")
    .userState(userStateModel)
    .definition(templateFlowDefinitionModel)
    .sysLock(systemLockModel)
    .status(jobStatusWorkspaceTemplateFlowModel)
    .validationSummary(templateFlowValidationSummaryModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the ReplaceFlowInWorkspaceOptions model
    ReplaceFlowInWorkspaceOptions replaceFlowInWorkspaceOptionsModel = new ReplaceFlowInWorkspaceOptions.Builder()
    .workspaceId("testString")
    .flowId("testString")
    .templateFlow(templateFlowModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TemplateFlow> response = schematics20ApiService.replaceFlowInWorkspace(replaceFlowInWorkspaceOptionsModel).execute();
    assertNotNull(response);
    TemplateFlow responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceFlowInWorkspacePath);
  }

  // Test the replaceFlowInWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceFlowInWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.replaceFlowInWorkspace(null).execute();
  }

  @Test
  public void testDeleteFlowFromWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteFlowFromWorkspacePath = "/v2/workspaces/testString/flows/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteFlowFromWorkspaceOptions model
    DeleteFlowFromWorkspaceOptions deleteFlowFromWorkspaceOptionsModel = new DeleteFlowFromWorkspaceOptions.Builder()
    .workspaceId("testString")
    .flowId("testString")
    .propagate(true)
    .force(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematics20ApiService.deleteFlowFromWorkspace(deleteFlowFromWorkspaceOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteFlowFromWorkspacePath);
  }

  // Test the deleteFlowFromWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteFlowFromWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.deleteFlowFromWorkspace(null).execute();
  }

  @Test
  public void testUpdateFlowInWorkspaceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"version\": \"version\", \"type\": \"simple_flow\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"definition\": {\"flow_type\": \"simple\", \"id\": \"id\", \"simple_flow\": [{\"index\": 5, \"control\": \"do\", \"template_operation\": {\"pre_condition\": \"preCondition\", \"template_id\": \"templateId\", \"override_command\": {\"command\": \"workspace_plan\", \"command_options\": [\"commandOptions\"]}, \"post_condition\": \"postCondition\", \"on_error\": \"onError\"}}], \"custom_flow\": \"VGhpcyBpcyBhbiBlbmNvZGVkIGJ5dGUgYXJyYXku\"}, \"id\": \"id\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"validation_summary\": {\"warning_count\": 12, \"error_count\": 10}, \"validation_logs\": [{\"flow_index\": 9, \"inputs_status\": [{\"log_level\": \"info\", \"var_name\": \"varName\", \"var_status\": \"varStatus\"}], \"outputs_status\": [{\"log_level\": \"info\", \"var_name\": \"varName\", \"var_status\": \"varStatus\"}]}]}";
    String updateFlowInWorkspacePath = "/v2/workspaces/testString/flows/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateCommand model
    TemplateCommand templateCommandModel = new TemplateCommand.Builder()
    .command("workspace_plan")
    .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateFlowDefinitionTemplateOperation model
    TemplateFlowDefinitionTemplateOperation templateFlowDefinitionTemplateOperationModel = new TemplateFlowDefinitionTemplateOperation.Builder()
    .preCondition("testString")
    .templateId("testString")
    .overrideCommand(templateCommandModel)
    .postCondition("testString")
    .onError("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateFlowDefinitionSimpleFlow model
    TemplateFlowDefinitionSimpleFlow templateFlowDefinitionSimpleFlowModel = new TemplateFlowDefinitionSimpleFlow.Builder()
    .index(Long.valueOf("26"))
    .control("do")
    .templateOperation(templateFlowDefinitionTemplateOperationModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateFlowDefinition model
    TemplateFlowDefinition templateFlowDefinitionModel = new TemplateFlowDefinition.Builder()
    .flowType("simple")
    .id("testString")
    .simpleFlow(new java.util.ArrayList<TemplateFlowDefinitionSimpleFlow>(java.util.Arrays.asList(templateFlowDefinitionSimpleFlowModel)))
    .customFlow(TestUtilities.createMockByteArray("This is a mock byte array value."))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkspaceTemplateFlow model
    JobStatusWorkspaceTemplateFlow jobStatusWorkspaceTemplateFlowModel = new JobStatusWorkspaceTemplateFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateFlowValidationSummary model
    TemplateFlowValidationSummary templateFlowValidationSummaryModel = new TemplateFlowValidationSummary.Builder()
    .warningCount(Double.valueOf("72.5"))
    .errorCount(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateFlow model
    TemplateFlow templateFlowModel = new TemplateFlow.Builder()
    .name("testString")
    .version("testString")
    .type("simple_flow")
    .userState(userStateModel)
    .definition(templateFlowDefinitionModel)
    .sysLock(systemLockModel)
    .status(jobStatusWorkspaceTemplateFlowModel)
    .validationSummary(templateFlowValidationSummaryModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the UpdateFlowInWorkspaceOptions model
    UpdateFlowInWorkspaceOptions updateFlowInWorkspaceOptionsModel = new UpdateFlowInWorkspaceOptions.Builder()
    .workspaceId("testString")
    .flowId("testString")
    .templateFlow(templateFlowModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TemplateFlow> response = schematics20ApiService.updateFlowInWorkspace(updateFlowInWorkspaceOptionsModel).execute();
    assertNotNull(response);
    TemplateFlow responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateFlowInWorkspacePath);
  }

  // Test the updateFlowInWorkspace operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateFlowInWorkspaceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.updateFlowInWorkspace(null).execute();
  }

  @Test
  public void testListActionsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"actions\": [{\"name\": \"Stop Action\", \"description\": \"This Action can be used to Stop the targets\", \"id\": \"id\", \"crn\": \"crn\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"namespace\": \"namespace\", \"tags\": [\"tags\"], \"playbook_name\": \"playbookName\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\"}]}";
    String listActionsPath = "/v2/actions";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListActionsOptions model
    ListActionsOptions listActionsOptionsModel = new ListActionsOptions.Builder()
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .sort("testString")
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ActionList> response = schematics20ApiService.listActions(listActionsOptionsModel).execute();
    assertNotNull(response);
    ActionList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listActionsPath);
  }

  @Test
  public void testCreateActionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"Stop Action\", \"description\": \"The description of your action. The description can be up to 2048 characters long in size. **Example** you can use the description to stop the targets.\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"source_readme_url\": \"sourceReadmeUrl\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_type\": \"local\", \"command_parameter\": \"commandParameter\", \"inventory\": \"inventory\", \"credentials\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"bastion_credential\": {\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}, \"targets_ini\": \"targetsIni\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"state\": {\"status_code\": \"normal\", \"status_job_id\": \"statusJobId\", \"status_message\": \"statusMessage\"}, \"playbook_names\": [\"playbookNames\"], \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}";
    String createActionPath = "/v2/actions";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the BastionResourceDefinition model
    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
    .name("testString")
    .host("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ActionState model
    ActionState actionStateModel = new ActionState.Builder()
    .statusCode("normal")
    .statusJobId("testString")
    .statusMessage("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Action model
    Action actionModel = new Action.Builder()
    .name("Stop Action")
    .description("The description of your action. The description can be up to 2048 characters long in size. **Example** you can use the description to stop the targets.")
    .location("us-south")
    .resourceGroup("testString")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .userState(userStateModel)
    .sourceReadmeUrl("testString")
    .source(externalSourceModel)
    .sourceType("local")
    .commandParameter("testString")
    .inventory("testString")
    .credentials(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .bastion(bastionResourceDefinitionModel)
    .bastionCredential(variableDataModel)
    .targetsIni("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .state(actionStateModel)
    .sysLock(systemLockModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the CreateActionOptions model
    CreateActionOptions createActionOptionsModel = new CreateActionOptions.Builder()
    .action(actionModel)
    .xGithubToken("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Action> response = schematics20ApiService.createAction(createActionOptionsModel).execute();
    assertNotNull(response);
    Action responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createActionPath);
  }

  // Test the createAction operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateActionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.createAction(null).execute();
  }

  @Test
  public void testGetActionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"Stop Action\", \"description\": \"The description of your action. The description can be up to 2048 characters long in size. **Example** you can use the description to stop the targets.\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"source_readme_url\": \"sourceReadmeUrl\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_type\": \"local\", \"command_parameter\": \"commandParameter\", \"inventory\": \"inventory\", \"credentials\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"bastion_credential\": {\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}, \"targets_ini\": \"targetsIni\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"state\": {\"status_code\": \"normal\", \"status_job_id\": \"statusJobId\", \"status_message\": \"statusMessage\"}, \"playbook_names\": [\"playbookNames\"], \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}";
    String getActionPath = "/v2/actions/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetActionOptions model
    GetActionOptions getActionOptionsModel = new GetActionOptions.Builder()
    .actionId("testString")
    .profile("summary")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Action> response = schematics20ApiService.getAction(getActionOptionsModel).execute();
    assertNotNull(response);
    Action responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("profile"), "summary");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getActionPath);
  }

  // Test the getAction operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetActionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getAction(null).execute();
  }

  @Test
  public void testDeleteActionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteActionPath = "/v2/actions/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteActionOptions model
    DeleteActionOptions deleteActionOptionsModel = new DeleteActionOptions.Builder()
    .actionId("testString")
    .force(true)
    .propagate(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematics20ApiService.deleteAction(deleteActionOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteActionPath);
  }

  // Test the deleteAction operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteActionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.deleteAction(null).execute();
  }

  @Test
  public void testUpdateActionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"Stop Action\", \"description\": \"The description of your action. The description can be up to 2048 characters long in size. **Example** you can use the description to stop the targets.\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"source_readme_url\": \"sourceReadmeUrl\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_type\": \"local\", \"command_parameter\": \"commandParameter\", \"inventory\": \"inventory\", \"credentials\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"bastion_credential\": {\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}, \"targets_ini\": \"targetsIni\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"state\": {\"status_code\": \"normal\", \"status_job_id\": \"statusJobId\", \"status_message\": \"statusMessage\"}, \"playbook_names\": [\"playbookNames\"], \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}";
    String updateActionPath = "/v2/actions/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the BastionResourceDefinition model
    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
    .name("testString")
    .host("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ActionState model
    ActionState actionStateModel = new ActionState.Builder()
    .statusCode("normal")
    .statusJobId("testString")
    .statusMessage("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Action model
    Action actionModel = new Action.Builder()
    .name("Stop Action")
    .description("The description of your action. The description can be up to 2048 characters long in size. **Example** you can use the description to stop the targets.")
    .location("us-south")
    .resourceGroup("testString")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .userState(userStateModel)
    .sourceReadmeUrl("testString")
    .source(externalSourceModel)
    .sourceType("local")
    .commandParameter("testString")
    .inventory("testString")
    .credentials(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .bastion(bastionResourceDefinitionModel)
    .bastionCredential(variableDataModel)
    .targetsIni("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .state(actionStateModel)
    .sysLock(systemLockModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the UpdateActionOptions model
    UpdateActionOptions updateActionOptionsModel = new UpdateActionOptions.Builder()
    .actionId("testString")
    .action(actionModel)
    .xGithubToken("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Action> response = schematics20ApiService.updateAction(updateActionOptionsModel).execute();
    assertNotNull(response);
    Action responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateActionPath);
  }

  // Test the updateAction operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateActionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.updateAction(null).execute();
  }

  @Test
  public void testUploadTemplateTarActionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"file_value\": \"fileValue\", \"has_received_file\": false, \"id\": \"id\"}";
    String uploadTemplateTarActionPath = "/v2/actions/testString/template_repo_upload";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UploadTemplateTarActionOptions model
    UploadTemplateTarActionOptions uploadTemplateTarActionOptionsModel = new UploadTemplateTarActionOptions.Builder()
    .actionId("testString")
    .file(TestUtilities.createMockStream("This is a mock file."))
    .fileContentType("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TemplateRepoTarUploadResponse> response = schematics20ApiService.uploadTemplateTarAction(uploadTemplateTarActionOptionsModel).execute();
    assertNotNull(response);
    TemplateRepoTarUploadResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, uploadTemplateTarActionPath);
  }

  // Test the uploadTemplateTarAction operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUploadTemplateTarActionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.uploadTemplateTarAction(null).execute();
  }

  @Test
  public void testListJobsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"jobs\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"tags\": [\"tags\"], \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"duration\": \"duration\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"status\": {\"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listJobsPath = "/v2/jobs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListJobsOptions model
    ListJobsOptions listJobsOptionsModel = new ListJobsOptions.Builder()
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .sort("testString")
    .profile("ids")
    .resource("workspace")
    .resourceId("testString")
    .actionId("testString")
    .list("all")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<JobList> response = schematics20ApiService.listJobs(listJobsOptionsModel).execute();
    assertNotNull(response);
    JobList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("profile"), "ids");
    assertEquals(query.get("resource"), "workspace");
    assertEquals(query.get("resource_id"), "testString");
    assertEquals(query.get("action_id"), "testString");
    assertEquals(query.get("list"), "all");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listJobsPath);
  }

  @Test
  public void testCreateJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"command_parameter\": \"commandParameter\", \"command_options\": [\"commandOptions\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"tags\": [\"tags\"], \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"duration\": \"duration\", \"status\": {\"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"data\": {\"job_type\": \"repo_download_job\", \"workspace_job_data\": {\"workspace_name\": \"workspaceName\", \"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"template_data\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_data\": {\"action_name\": \"actionName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"inventory_record\": {\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}, \"materialized_inventory\": \"materializedInventory\"}, \"system_job_data\": {\"key_id\": \"keyId\", \"schematics_resource_id\": [\"schematicsResourceId\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_data\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"workitems\": [{\"command_object_id\": \"commandObjectId\", \"command_object_name\": \"commandObjectName\", \"layers\": \"layers\", \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_id\": \"jobId\", \"job_status\": \"job_pending\"}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"log_store_url\": \"logStoreUrl\", \"state_store_url\": \"stateStoreUrl\", \"results_url\": \"resultsUrl\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createJobPath = "/v2/jobs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkitem model
    JobStatusWorkitem jobStatusWorkitemModel = new JobStatusWorkitem.Builder()
    .workspaceId("testString")
    .workspaceName("testString")
    .jobId("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusFlow model
    JobStatusFlow jobStatusFlowModel = new JobStatusFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .workitems(new java.util.ArrayList<JobStatusWorkitem>(java.util.Arrays.asList(jobStatusWorkitemModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusTemplate model
    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkspace model
    JobStatusWorkspace jobStatusWorkspaceModel = new JobStatusWorkspace.Builder()
    .workspaceName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .flowStatus(jobStatusFlowModel)
    .templateStatus(new java.util.ArrayList<JobStatusTemplate>(java.util.Arrays.asList(jobStatusTemplateModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusAction model
    JobStatusAction jobStatusActionModel = new JobStatusAction.Builder()
    .actionName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .bastionStatusCode("none")
    .bastionStatusMessage("testString")
    .targetsStatusCode("none")
    .targetsStatusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusSchematicsResources model
    JobStatusSchematicsResources jobStatusSchematicsResourcesModel = new JobStatusSchematicsResources.Builder()
    .statusCode("job_pending")
    .statusMessage("testString")
    .schematicsResourceId("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusSystem model
    JobStatusSystem jobStatusSystemModel = new JobStatusSystem.Builder()
    .systemStatusMessage("testString")
    .systemStatusCode("job_pending")
    .schematicsResourceStatus(new java.util.ArrayList<JobStatusSchematicsResources>(java.util.Arrays.asList(jobStatusSchematicsResourcesModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatus model
    JobStatus jobStatusModel = new JobStatus.Builder()
    .workspaceJobStatus(jobStatusWorkspaceModel)
    .actionJobStatus(jobStatusActionModel)
    .systemJobStatus(jobStatusSystemModel)
    .flowJobStatus(jobStatusFlowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataTemplate model
    JobDataTemplate jobDataTemplateModel = new JobDataTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkspace model
    JobDataWorkspace jobDataWorkspaceModel = new JobDataWorkspace.Builder()
    .workspaceName("testString")
    .flowId("testString")
    .flowName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .templateData(new java.util.ArrayList<JobDataTemplate>(java.util.Arrays.asList(jobDataTemplateModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the InventoryResourceRecord model
    InventoryResourceRecord inventoryResourceRecordModel = new InventoryResourceRecord.Builder()
    .name("testString")
    .description("testString")
    .location("us-south")
    .resourceGroup("testString")
    .inventoriesIni("testString")
    .resourceQueries(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataAction model
    JobDataAction jobDataActionModel = new JobDataAction.Builder()
    .actionName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .inventoryRecord(inventoryResourceRecordModel)
    .materializedInventory("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataSystem model
    JobDataSystem jobDataSystemModel = new JobDataSystem.Builder()
    .keyId("testString")
    .schematicsResourceId(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkItemLastJob model
    JobDataWorkItemLastJob jobDataWorkItemLastJobModel = new JobDataWorkItemLastJob.Builder()
    .commandObject("workspace")
    .commandObjectName("testString")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .jobId("testString")
    .jobStatus("job_pending")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkItem model
    JobDataWorkItem jobDataWorkItemModel = new JobDataWorkItem.Builder()
    .commandObjectId("testString")
    .commandObjectName("testString")
    .layers("testString")
    .sourceType("local")
    .source(externalSourceModel)
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .lastJob(jobDataWorkItemLastJobModel)
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataFlow model
    JobDataFlow jobDataFlowModel = new JobDataFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .workitems(new java.util.ArrayList<JobDataWorkItem>(java.util.Arrays.asList(jobDataWorkItemModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobData model
    JobData jobDataModel = new JobData.Builder()
    .jobType("repo_download_job")
    .workspaceJobData(jobDataWorkspaceModel)
    .actionJobData(jobDataActionModel)
    .systemJobData(jobDataSystemModel)
    .flowJobData(jobDataFlowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the BastionResourceDefinition model
    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
    .name("testString")
    .host("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryRepoDownloadJob model
    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryWorkspaceJob model
    JobLogSummaryWorkspaceJob jobLogSummaryWorkspaceJobModel = new JobLogSummaryWorkspaceJob.Builder()
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryWorkitems model
    JobLogSummaryWorkitems jobLogSummaryWorkitemsModel = new JobLogSummaryWorkitems.Builder()
    .workspaceId("testString")
    .jobId("testString")
    .logUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryFlowJob model
    JobLogSummaryFlowJob jobLogSummaryFlowJobModel = new JobLogSummaryFlowJob.Builder()
    .workitems(new java.util.ArrayList<JobLogSummaryWorkitems>(java.util.Arrays.asList(jobLogSummaryWorkitemsModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryActionJobRecap model
    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
    .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .ok(Double.valueOf("72.5"))
    .changed(Double.valueOf("72.5"))
    .failed(Double.valueOf("72.5"))
    .skipped(Double.valueOf("72.5"))
    .unreachable(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryActionJob model
    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
    .recap(jobLogSummaryActionJobRecapModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummarySystemJob model
    JobLogSummarySystemJob jobLogSummarySystemJobModel = new JobLogSummarySystemJob.Builder()
    .success(Double.valueOf("72.5"))
    .failed(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummary model
    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
    .jobType("repo_download_job")
    .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
    .workspaceJob(jobLogSummaryWorkspaceJobModel)
    .flowJob(jobLogSummaryFlowJobModel)
    .actionJob(jobLogSummaryActionJobModel)
    .systemJob(jobLogSummarySystemJobModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the Job model
    Job jobModel = new Job.Builder()
    .commandObject("workspace")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .commandParameter("testString")
    .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .location("us-south")
    .status(jobStatusModel)
    .data(jobDataModel)
    .bastion(bastionResourceDefinitionModel)
    .logSummary(jobLogSummaryModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the CreateJobOptions model
    CreateJobOptions createJobOptionsModel = new CreateJobOptions.Builder()
    .refreshToken("testString")
    .job(jobModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Job> response = schematics20ApiService.createJob(createJobOptionsModel).execute();
    assertNotNull(response);
    Job responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    assertEquals(request.getHeader("Refresh_token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createJobPath);
  }

  // Test the createJob operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateJobNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.createJob(null).execute();
  }

  @Test
  public void testGetJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"command_parameter\": \"commandParameter\", \"command_options\": [\"commandOptions\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"tags\": [\"tags\"], \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"duration\": \"duration\", \"status\": {\"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"data\": {\"job_type\": \"repo_download_job\", \"workspace_job_data\": {\"workspace_name\": \"workspaceName\", \"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"template_data\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_data\": {\"action_name\": \"actionName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"inventory_record\": {\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}, \"materialized_inventory\": \"materializedInventory\"}, \"system_job_data\": {\"key_id\": \"keyId\", \"schematics_resource_id\": [\"schematicsResourceId\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_data\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"workitems\": [{\"command_object_id\": \"commandObjectId\", \"command_object_name\": \"commandObjectName\", \"layers\": \"layers\", \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_id\": \"jobId\", \"job_status\": \"job_pending\"}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"log_store_url\": \"logStoreUrl\", \"state_store_url\": \"stateStoreUrl\", \"results_url\": \"resultsUrl\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getJobPath = "/v2/jobs/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetJobOptions model
    GetJobOptions getJobOptionsModel = new GetJobOptions.Builder()
    .jobId("testString")
    .profile("summary")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Job> response = schematics20ApiService.getJob(getJobOptionsModel).execute();
    assertNotNull(response);
    Job responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("profile"), "summary");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getJobPath);
  }

  // Test the getJob operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetJobNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getJob(null).execute();
  }

  @Test
  public void testUpdateJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"command_parameter\": \"commandParameter\", \"command_options\": [\"commandOptions\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"tags\": [\"tags\"], \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"duration\": \"duration\", \"status\": {\"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"data\": {\"job_type\": \"repo_download_job\", \"workspace_job_data\": {\"workspace_name\": \"workspaceName\", \"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"template_data\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_data\": {\"action_name\": \"actionName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"inventory_record\": {\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}, \"materialized_inventory\": \"materializedInventory\"}, \"system_job_data\": {\"key_id\": \"keyId\", \"schematics_resource_id\": [\"schematicsResourceId\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_data\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"workitems\": [{\"command_object_id\": \"commandObjectId\", \"command_object_name\": \"commandObjectName\", \"layers\": \"layers\", \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_id\": \"jobId\", \"job_status\": \"job_pending\"}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"log_store_url\": \"logStoreUrl\", \"state_store_url\": \"stateStoreUrl\", \"results_url\": \"resultsUrl\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String updateJobPath = "/v2/jobs/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkitem model
    JobStatusWorkitem jobStatusWorkitemModel = new JobStatusWorkitem.Builder()
    .workspaceId("testString")
    .workspaceName("testString")
    .jobId("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusFlow model
    JobStatusFlow jobStatusFlowModel = new JobStatusFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .workitems(new java.util.ArrayList<JobStatusWorkitem>(java.util.Arrays.asList(jobStatusWorkitemModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusTemplate model
    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkspace model
    JobStatusWorkspace jobStatusWorkspaceModel = new JobStatusWorkspace.Builder()
    .workspaceName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .flowStatus(jobStatusFlowModel)
    .templateStatus(new java.util.ArrayList<JobStatusTemplate>(java.util.Arrays.asList(jobStatusTemplateModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusAction model
    JobStatusAction jobStatusActionModel = new JobStatusAction.Builder()
    .actionName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .bastionStatusCode("none")
    .bastionStatusMessage("testString")
    .targetsStatusCode("none")
    .targetsStatusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusSchematicsResources model
    JobStatusSchematicsResources jobStatusSchematicsResourcesModel = new JobStatusSchematicsResources.Builder()
    .statusCode("job_pending")
    .statusMessage("testString")
    .schematicsResourceId("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusSystem model
    JobStatusSystem jobStatusSystemModel = new JobStatusSystem.Builder()
    .systemStatusMessage("testString")
    .systemStatusCode("job_pending")
    .schematicsResourceStatus(new java.util.ArrayList<JobStatusSchematicsResources>(java.util.Arrays.asList(jobStatusSchematicsResourcesModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatus model
    JobStatus jobStatusModel = new JobStatus.Builder()
    .workspaceJobStatus(jobStatusWorkspaceModel)
    .actionJobStatus(jobStatusActionModel)
    .systemJobStatus(jobStatusSystemModel)
    .flowJobStatus(jobStatusFlowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataTemplate model
    JobDataTemplate jobDataTemplateModel = new JobDataTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkspace model
    JobDataWorkspace jobDataWorkspaceModel = new JobDataWorkspace.Builder()
    .workspaceName("testString")
    .flowId("testString")
    .flowName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .templateData(new java.util.ArrayList<JobDataTemplate>(java.util.Arrays.asList(jobDataTemplateModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the InventoryResourceRecord model
    InventoryResourceRecord inventoryResourceRecordModel = new InventoryResourceRecord.Builder()
    .name("testString")
    .description("testString")
    .location("us-south")
    .resourceGroup("testString")
    .inventoriesIni("testString")
    .resourceQueries(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataAction model
    JobDataAction jobDataActionModel = new JobDataAction.Builder()
    .actionName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .inventoryRecord(inventoryResourceRecordModel)
    .materializedInventory("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataSystem model
    JobDataSystem jobDataSystemModel = new JobDataSystem.Builder()
    .keyId("testString")
    .schematicsResourceId(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkItemLastJob model
    JobDataWorkItemLastJob jobDataWorkItemLastJobModel = new JobDataWorkItemLastJob.Builder()
    .commandObject("workspace")
    .commandObjectName("testString")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .jobId("testString")
    .jobStatus("job_pending")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkItem model
    JobDataWorkItem jobDataWorkItemModel = new JobDataWorkItem.Builder()
    .commandObjectId("testString")
    .commandObjectName("testString")
    .layers("testString")
    .sourceType("local")
    .source(externalSourceModel)
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .lastJob(jobDataWorkItemLastJobModel)
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataFlow model
    JobDataFlow jobDataFlowModel = new JobDataFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .workitems(new java.util.ArrayList<JobDataWorkItem>(java.util.Arrays.asList(jobDataWorkItemModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobData model
    JobData jobDataModel = new JobData.Builder()
    .jobType("repo_download_job")
    .workspaceJobData(jobDataWorkspaceModel)
    .actionJobData(jobDataActionModel)
    .systemJobData(jobDataSystemModel)
    .flowJobData(jobDataFlowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the BastionResourceDefinition model
    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
    .name("testString")
    .host("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryRepoDownloadJob model
    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryWorkspaceJob model
    JobLogSummaryWorkspaceJob jobLogSummaryWorkspaceJobModel = new JobLogSummaryWorkspaceJob.Builder()
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryWorkitems model
    JobLogSummaryWorkitems jobLogSummaryWorkitemsModel = new JobLogSummaryWorkitems.Builder()
    .workspaceId("testString")
    .jobId("testString")
    .logUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryFlowJob model
    JobLogSummaryFlowJob jobLogSummaryFlowJobModel = new JobLogSummaryFlowJob.Builder()
    .workitems(new java.util.ArrayList<JobLogSummaryWorkitems>(java.util.Arrays.asList(jobLogSummaryWorkitemsModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryActionJobRecap model
    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
    .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .ok(Double.valueOf("72.5"))
    .changed(Double.valueOf("72.5"))
    .failed(Double.valueOf("72.5"))
    .skipped(Double.valueOf("72.5"))
    .unreachable(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryActionJob model
    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
    .recap(jobLogSummaryActionJobRecapModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummarySystemJob model
    JobLogSummarySystemJob jobLogSummarySystemJobModel = new JobLogSummarySystemJob.Builder()
    .success(Double.valueOf("72.5"))
    .failed(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummary model
    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
    .jobType("repo_download_job")
    .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
    .workspaceJob(jobLogSummaryWorkspaceJobModel)
    .flowJob(jobLogSummaryFlowJobModel)
    .actionJob(jobLogSummaryActionJobModel)
    .systemJob(jobLogSummarySystemJobModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the Job model
    Job jobModel = new Job.Builder()
    .commandObject("workspace")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .commandParameter("testString")
    .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .location("us-south")
    .status(jobStatusModel)
    .data(jobDataModel)
    .bastion(bastionResourceDefinitionModel)
    .logSummary(jobLogSummaryModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the UpdateJobOptions model
    UpdateJobOptions updateJobOptionsModel = new UpdateJobOptions.Builder()
    .jobId("testString")
    .refreshToken("testString")
    .job(jobModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Job> response = schematics20ApiService.updateJob(updateJobOptionsModel).execute();
    assertNotNull(response);
    Job responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    assertEquals(request.getHeader("Refresh_token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateJobPath);
  }

  // Test the updateJob operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateJobNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.updateJob(null).execute();
  }

  @Test
  public void testDeleteJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteJobPath = "/v2/jobs/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteJobOptions model
    DeleteJobOptions deleteJobOptionsModel = new DeleteJobOptions.Builder()
    .jobId("testString")
    .refreshToken("testString")
    .force(true)
    .propagate(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematics20ApiService.deleteJob(deleteJobOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    assertEquals(request.getHeader("Refresh_token"), "testString");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteJobPath);
  }

  // Test the deleteJob operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteJobNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.deleteJob(null).execute();
  }

  @Test
  public void testListJobLogsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_name\": \"jobName\", \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"format\": \"json\", \"details\": \"VGhpcyBpcyBhbiBlbmNvZGVkIGJ5dGUgYXJyYXku\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String listJobLogsPath = "/v2/jobs/testString/logs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListJobLogsOptions model
    ListJobLogsOptions listJobLogsOptionsModel = new ListJobLogsOptions.Builder()
    .jobId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<JobLog> response = schematics20ApiService.listJobLogs(listJobLogsOptionsModel).execute();
    assertNotNull(response);
    JobLog responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listJobLogsPath);
  }

  // Test the listJobLogs operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListJobLogsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.listJobLogs(null).execute();
  }

  @Test
  public void testListJobStatesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_name\": \"jobName\", \"summary\": [{\"name\": \"name\", \"type\": \"number\", \"value\": \"value\"}], \"format\": \"format\", \"details\": \"VGhpcyBpcyBhbiBlbmNvZGVkIGJ5dGUgYXJyYXku\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String listJobStatesPath = "/v2/jobs/testString/states";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListJobStatesOptions model
    ListJobStatesOptions listJobStatesOptionsModel = new ListJobStatesOptions.Builder()
    .jobId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<JobStateData> response = schematics20ApiService.listJobStates(listJobStatesOptionsModel).execute();
    assertNotNull(response);
    JobStateData responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listJobStatesPath);
  }

  // Test the listJobStates operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListJobStatesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.listJobStates(null).execute();
  }

  @Test
  public void testListControlsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"controls\": [{\"name\": \"name\", \"description\": \"This Controls can be used to Stop the targets\", \"id\": \"id\", \"crn\": \"crn\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\"}]}";
    String listControlsPath = "/v2/controls";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListControlsOptions model
    ListControlsOptions listControlsOptionsModel = new ListControlsOptions.Builder()
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .sort("testString")
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ControlsList> response = schematics20ApiService.listControls(listControlsOptionsModel).execute();
    assertNotNull(response);
    ControlsList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listControlsPath);
  }

  @Test
  public void testCreateControlsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"type\": \"it_controls\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"location\": \"us-south\", \"tags\": [\"tags\"], \"source_readme_url\": \"sourceReadmeUrl\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_type\": \"local\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"id\": \"id\", \"crn\": \"crn\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"capsules\": [{\"name\": \"name\", \"description\": \"description\", \"type\": \"type\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"package\": \"Policy package path\", \"severity\": 1, \"inventory\": \"inventory\", \"trigger_record_id\": \"triggerRecordId\", \"job_triggers\": [{\"event\": \"before | after\", \"job\": {\"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"command_parameter\": \"commandParameter\", \"command_options\": [\"commandOptions\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"tags\": [\"tags\"], \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"duration\": \"duration\", \"status\": {\"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"data\": {\"job_type\": \"repo_download_job\", \"workspace_job_data\": {\"workspace_name\": \"workspaceName\", \"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"template_data\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_data\": {\"action_name\": \"actionName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"inventory_record\": {\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}, \"materialized_inventory\": \"materializedInventory\"}, \"system_job_data\": {\"key_id\": \"keyId\", \"schematics_resource_id\": [\"schematicsResourceId\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_data\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"workitems\": [{\"command_object_id\": \"commandObjectId\", \"command_object_name\": \"commandObjectName\", \"layers\": \"layers\", \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_id\": \"jobId\", \"job_status\": \"job_pending\"}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"log_store_url\": \"logStoreUrl\", \"state_store_url\": \"stateStoreUrl\", \"results_url\": \"resultsUrl\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}], \"scheduled_triggers\": [{\"frequency\": \"daily | weekly\", \"time\": \"time in UTC\", \"day\": \"expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday\"}], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"decisions\": [{\"rule\": \"rule\", \"pass_value\": \"before\", \"pass_expr\": \"== OR != OR <= OR >= OR > OR <\", \"evidence_found_in\": \"rule emitting details\"}], \"escalations\": [{\"action_id\": \"actionId\"}], \"id\": \"id\", \"status\": \"status\", \"controls_id\": \"controlsId\", \"controls_name\": \"controlsName\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"last_job_data\": {\"capsule_id\": \"capsuleId\", \"calsule_name\": \"calsuleName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"results\": [{\"job_id\": \"jobId\", \"job_name\": \"jobName\", \"policy\": \"policy\", \"severity\": 1, \"job_state\": \"success\", \"failures\": [\"failures\"], \"passed\": [\"passed\"], \"evidences\": [{\"resources\": [{\"name\": \"name\", \"type\": \"type\"}]}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}]}";
    String createControlsPath = "/v2/controls";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkitem model
    JobStatusWorkitem jobStatusWorkitemModel = new JobStatusWorkitem.Builder()
    .workspaceId("testString")
    .workspaceName("testString")
    .jobId("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusFlow model
    JobStatusFlow jobStatusFlowModel = new JobStatusFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .workitems(new java.util.ArrayList<JobStatusWorkitem>(java.util.Arrays.asList(jobStatusWorkitemModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusTemplate model
    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkspace model
    JobStatusWorkspace jobStatusWorkspaceModel = new JobStatusWorkspace.Builder()
    .workspaceName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .flowStatus(jobStatusFlowModel)
    .templateStatus(new java.util.ArrayList<JobStatusTemplate>(java.util.Arrays.asList(jobStatusTemplateModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusAction model
    JobStatusAction jobStatusActionModel = new JobStatusAction.Builder()
    .actionName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .bastionStatusCode("none")
    .bastionStatusMessage("testString")
    .targetsStatusCode("none")
    .targetsStatusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusSchematicsResources model
    JobStatusSchematicsResources jobStatusSchematicsResourcesModel = new JobStatusSchematicsResources.Builder()
    .statusCode("job_pending")
    .statusMessage("testString")
    .schematicsResourceId("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusSystem model
    JobStatusSystem jobStatusSystemModel = new JobStatusSystem.Builder()
    .systemStatusMessage("testString")
    .systemStatusCode("job_pending")
    .schematicsResourceStatus(new java.util.ArrayList<JobStatusSchematicsResources>(java.util.Arrays.asList(jobStatusSchematicsResourcesModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatus model
    JobStatus jobStatusModel = new JobStatus.Builder()
    .workspaceJobStatus(jobStatusWorkspaceModel)
    .actionJobStatus(jobStatusActionModel)
    .systemJobStatus(jobStatusSystemModel)
    .flowJobStatus(jobStatusFlowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataTemplate model
    JobDataTemplate jobDataTemplateModel = new JobDataTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkspace model
    JobDataWorkspace jobDataWorkspaceModel = new JobDataWorkspace.Builder()
    .workspaceName("testString")
    .flowId("testString")
    .flowName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .templateData(new java.util.ArrayList<JobDataTemplate>(java.util.Arrays.asList(jobDataTemplateModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the InventoryResourceRecord model
    InventoryResourceRecord inventoryResourceRecordModel = new InventoryResourceRecord.Builder()
    .name("testString")
    .description("testString")
    .location("us-south")
    .resourceGroup("testString")
    .inventoriesIni("testString")
    .resourceQueries(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataAction model
    JobDataAction jobDataActionModel = new JobDataAction.Builder()
    .actionName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .inventoryRecord(inventoryResourceRecordModel)
    .materializedInventory("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataSystem model
    JobDataSystem jobDataSystemModel = new JobDataSystem.Builder()
    .keyId("testString")
    .schematicsResourceId(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkItemLastJob model
    JobDataWorkItemLastJob jobDataWorkItemLastJobModel = new JobDataWorkItemLastJob.Builder()
    .commandObject("workspace")
    .commandObjectName("testString")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .jobId("testString")
    .jobStatus("job_pending")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkItem model
    JobDataWorkItem jobDataWorkItemModel = new JobDataWorkItem.Builder()
    .commandObjectId("testString")
    .commandObjectName("testString")
    .layers("testString")
    .sourceType("local")
    .source(externalSourceModel)
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .lastJob(jobDataWorkItemLastJobModel)
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataFlow model
    JobDataFlow jobDataFlowModel = new JobDataFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .workitems(new java.util.ArrayList<JobDataWorkItem>(java.util.Arrays.asList(jobDataWorkItemModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobData model
    JobData jobDataModel = new JobData.Builder()
    .jobType("repo_download_job")
    .workspaceJobData(jobDataWorkspaceModel)
    .actionJobData(jobDataActionModel)
    .systemJobData(jobDataSystemModel)
    .flowJobData(jobDataFlowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the BastionResourceDefinition model
    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
    .name("testString")
    .host("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryRepoDownloadJob model
    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryWorkspaceJob model
    JobLogSummaryWorkspaceJob jobLogSummaryWorkspaceJobModel = new JobLogSummaryWorkspaceJob.Builder()
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryWorkitems model
    JobLogSummaryWorkitems jobLogSummaryWorkitemsModel = new JobLogSummaryWorkitems.Builder()
    .workspaceId("testString")
    .jobId("testString")
    .logUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryFlowJob model
    JobLogSummaryFlowJob jobLogSummaryFlowJobModel = new JobLogSummaryFlowJob.Builder()
    .workitems(new java.util.ArrayList<JobLogSummaryWorkitems>(java.util.Arrays.asList(jobLogSummaryWorkitemsModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryActionJobRecap model
    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
    .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .ok(Double.valueOf("72.5"))
    .changed(Double.valueOf("72.5"))
    .failed(Double.valueOf("72.5"))
    .skipped(Double.valueOf("72.5"))
    .unreachable(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryActionJob model
    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
    .recap(jobLogSummaryActionJobRecapModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummarySystemJob model
    JobLogSummarySystemJob jobLogSummarySystemJobModel = new JobLogSummarySystemJob.Builder()
    .success(Double.valueOf("72.5"))
    .failed(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummary model
    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
    .jobType("repo_download_job")
    .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
    .workspaceJob(jobLogSummaryWorkspaceJobModel)
    .flowJob(jobLogSummaryFlowJobModel)
    .actionJob(jobLogSummaryActionJobModel)
    .systemJob(jobLogSummarySystemJobModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the Job model
    Job jobModel = new Job.Builder()
    .commandObject("workspace")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .commandParameter("testString")
    .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .location("us-south")
    .status(jobStatusModel)
    .data(jobDataModel)
    .bastion(bastionResourceDefinitionModel)
    .logSummary(jobLogSummaryModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TriggerJob model
    TriggerJob triggerJobModel = new TriggerJob.Builder()
    .event("before | after")
    .job(jobModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TriggerScheduled model
    TriggerScheduled triggerScheduledModel = new TriggerScheduled.Builder()
    .frequency("daily | weekly")
    .time("time in UTC")
    .day("expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ControlsDecision model
    ControlsDecision controlsDecisionModel = new ControlsDecision.Builder()
    .rule("testString")
    .passValue("before")
    .passExpr("== OR != OR <= OR >= OR > OR <")
    .evidenceFoundIn("rule emitting details")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ControlsEscalation model
    ControlsEscalation controlsEscalationModel = new ControlsEscalation.Builder()
    .actionId("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ControlsLiteState model
    ControlsLiteState controlsLiteStateModel = new ControlsLiteState.Builder()
    .statusCode("normal")
    .statusMessage("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the CapsuleResultResources model
    CapsuleResultResources capsuleResultResourcesModel = new CapsuleResultResources.Builder()
    .name("testString")
    .type("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the CapsuleResultEvidences model
    CapsuleResultEvidences capsuleResultEvidencesModel = new CapsuleResultEvidences.Builder()
    .resources(new java.util.ArrayList<CapsuleResultResources>(java.util.Arrays.asList(capsuleResultResourcesModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobResultCapsule model
    JobResultCapsule jobResultCapsuleModel = new JobResultCapsule.Builder()
    .jobId("testString")
    .jobName("testString")
    .policy("testString")
    .severity(Long.valueOf("1"))
    .jobState("success")
    .failures(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .passed(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .evidences(new java.util.ArrayList<CapsuleResultEvidences>(java.util.Arrays.asList(capsuleResultEvidencesModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataCapsule model
    JobDataCapsule jobDataCapsuleModel = new JobDataCapsule.Builder()
    .capsuleId("testString")
    .calsuleName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .results(new java.util.ArrayList<JobResultCapsule>(java.util.Arrays.asList(jobResultCapsuleModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Capsule model
    Capsule capsuleModel = new Capsule.Builder()
    .name("testString")
    .description("testString")
    .type("testString")
    .userState(userStateModel)
    .xPackage("Policy package path")
    .severity(Long.valueOf("1"))
    .inventory("testString")
    .triggerRecordId("testString")
    .jobTriggers(new java.util.ArrayList<TriggerJob>(java.util.Arrays.asList(triggerJobModel)))
    .scheduledTriggers(new java.util.ArrayList<TriggerScheduled>(java.util.Arrays.asList(triggerScheduledModel)))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .decisions(new java.util.ArrayList<ControlsDecision>(java.util.Arrays.asList(controlsDecisionModel)))
    .escalations(new java.util.ArrayList<ControlsEscalation>(java.util.Arrays.asList(controlsEscalationModel)))
    .id("testString")
    .status("testString")
    .controlsId("testString")
    .controlsName("testString")
    .createdAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .createdBy("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .updatedBy("testString")
    .state(controlsLiteStateModel)
    .lastJobData(jobDataCapsuleModel)
    .sysLock(systemLockModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the Controls model
    Controls controlsModel = new Controls.Builder()
    .name("testString")
    .type("it_controls")
    .description("testString")
    .resourceGroup("testString")
    .location("us-south")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .sourceReadmeUrl("testString")
    .source(externalSourceModel)
    .sourceType("local")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .userState(userStateModel)
    .sysLock(systemLockModel)
    .capsules(new java.util.ArrayList<Capsule>(java.util.Arrays.asList(capsuleModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the CreateControlsOptions model
    CreateControlsOptions createControlsOptionsModel = new CreateControlsOptions.Builder()
    .controls(controlsModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Controls> response = schematics20ApiService.createControls(createControlsOptionsModel).execute();
    assertNotNull(response);
    Controls responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createControlsPath);
  }

  // Test the createControls operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateControlsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.createControls(null).execute();
  }

  @Test
  public void testGetControlsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"type\": \"it_controls\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"location\": \"us-south\", \"tags\": [\"tags\"], \"source_readme_url\": \"sourceReadmeUrl\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_type\": \"local\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"id\": \"id\", \"crn\": \"crn\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"capsules\": [{\"name\": \"name\", \"description\": \"description\", \"type\": \"type\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"package\": \"Policy package path\", \"severity\": 1, \"inventory\": \"inventory\", \"trigger_record_id\": \"triggerRecordId\", \"job_triggers\": [{\"event\": \"before | after\", \"job\": {\"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"command_parameter\": \"commandParameter\", \"command_options\": [\"commandOptions\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"tags\": [\"tags\"], \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"duration\": \"duration\", \"status\": {\"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"data\": {\"job_type\": \"repo_download_job\", \"workspace_job_data\": {\"workspace_name\": \"workspaceName\", \"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"template_data\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_data\": {\"action_name\": \"actionName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"inventory_record\": {\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}, \"materialized_inventory\": \"materializedInventory\"}, \"system_job_data\": {\"key_id\": \"keyId\", \"schematics_resource_id\": [\"schematicsResourceId\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_data\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"workitems\": [{\"command_object_id\": \"commandObjectId\", \"command_object_name\": \"commandObjectName\", \"layers\": \"layers\", \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_id\": \"jobId\", \"job_status\": \"job_pending\"}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"log_store_url\": \"logStoreUrl\", \"state_store_url\": \"stateStoreUrl\", \"results_url\": \"resultsUrl\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}], \"scheduled_triggers\": [{\"frequency\": \"daily | weekly\", \"time\": \"time in UTC\", \"day\": \"expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday\"}], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"decisions\": [{\"rule\": \"rule\", \"pass_value\": \"before\", \"pass_expr\": \"== OR != OR <= OR >= OR > OR <\", \"evidence_found_in\": \"rule emitting details\"}], \"escalations\": [{\"action_id\": \"actionId\"}], \"id\": \"id\", \"status\": \"status\", \"controls_id\": \"controlsId\", \"controls_name\": \"controlsName\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"last_job_data\": {\"capsule_id\": \"capsuleId\", \"calsule_name\": \"calsuleName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"results\": [{\"job_id\": \"jobId\", \"job_name\": \"jobName\", \"policy\": \"policy\", \"severity\": 1, \"job_state\": \"success\", \"failures\": [\"failures\"], \"passed\": [\"passed\"], \"evidences\": [{\"resources\": [{\"name\": \"name\", \"type\": \"type\"}]}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}]}";
    String getControlsPath = "/v2/controls/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetControlsOptions model
    GetControlsOptions getControlsOptionsModel = new GetControlsOptions.Builder()
    .controlsId("testString")
    .profile("summary")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Controls> response = schematics20ApiService.getControls(getControlsOptionsModel).execute();
    assertNotNull(response);
    Controls responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("profile"), "summary");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getControlsPath);
  }

  // Test the getControls operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetControlsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getControls(null).execute();
  }

  @Test
  public void testDeleteControlsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteControlsPath = "/v2/controls/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteControlsOptions model
    DeleteControlsOptions deleteControlsOptionsModel = new DeleteControlsOptions.Builder()
    .controlsId("testString")
    .force(true)
    .propagate(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematics20ApiService.deleteControls(deleteControlsOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteControlsPath);
  }

  // Test the deleteControls operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteControlsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.deleteControls(null).execute();
  }

  @Test
  public void testUpdateControlsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"type\": \"it_controls\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"location\": \"us-south\", \"tags\": [\"tags\"], \"source_readme_url\": \"sourceReadmeUrl\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_type\": \"local\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"id\": \"id\", \"crn\": \"crn\", \"source_created_at\": \"2019-01-01T12:00:00.000Z\", \"source_created_by\": \"sourceCreatedBy\", \"source_updated_at\": \"2019-01-01T12:00:00.000Z\", \"source_updated_by\": \"sourceUpdatedBy\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"capsules\": [{\"name\": \"name\", \"description\": \"description\", \"type\": \"type\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"package\": \"Policy package path\", \"severity\": 1, \"inventory\": \"inventory\", \"trigger_record_id\": \"triggerRecordId\", \"job_triggers\": [{\"event\": \"before | after\", \"job\": {\"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"command_parameter\": \"commandParameter\", \"command_options\": [\"commandOptions\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"tags\": [\"tags\"], \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"duration\": \"duration\", \"status\": {\"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"data\": {\"job_type\": \"repo_download_job\", \"workspace_job_data\": {\"workspace_name\": \"workspaceName\", \"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"template_data\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_data\": {\"action_name\": \"actionName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"inventory_record\": {\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}, \"materialized_inventory\": \"materializedInventory\"}, \"system_job_data\": {\"key_id\": \"keyId\", \"schematics_resource_id\": [\"schematicsResourceId\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_data\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"workitems\": [{\"command_object_id\": \"commandObjectId\", \"command_object_name\": \"commandObjectName\", \"layers\": \"layers\", \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_id\": \"jobId\", \"job_status\": \"job_pending\"}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"log_store_url\": \"logStoreUrl\", \"state_store_url\": \"stateStoreUrl\", \"results_url\": \"resultsUrl\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}], \"scheduled_triggers\": [{\"frequency\": \"daily | weekly\", \"time\": \"time in UTC\", \"day\": \"expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday\"}], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"decisions\": [{\"rule\": \"rule\", \"pass_value\": \"before\", \"pass_expr\": \"== OR != OR <= OR >= OR > OR <\", \"evidence_found_in\": \"rule emitting details\"}], \"escalations\": [{\"action_id\": \"actionId\"}], \"id\": \"id\", \"status\": \"status\", \"controls_id\": \"controlsId\", \"controls_name\": \"controlsName\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"last_job_data\": {\"capsule_id\": \"capsuleId\", \"calsule_name\": \"calsuleName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"results\": [{\"job_id\": \"jobId\", \"job_name\": \"jobName\", \"policy\": \"policy\", \"severity\": 1, \"job_state\": \"success\", \"failures\": [\"failures\"], \"passed\": [\"passed\"], \"evidences\": [{\"resources\": [{\"name\": \"name\", \"type\": \"type\"}]}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}]}";
    String updateControlsPath = "/v2/controls/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkitem model
    JobStatusWorkitem jobStatusWorkitemModel = new JobStatusWorkitem.Builder()
    .workspaceId("testString")
    .workspaceName("testString")
    .jobId("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusFlow model
    JobStatusFlow jobStatusFlowModel = new JobStatusFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .workitems(new java.util.ArrayList<JobStatusWorkitem>(java.util.Arrays.asList(jobStatusWorkitemModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusTemplate model
    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkspace model
    JobStatusWorkspace jobStatusWorkspaceModel = new JobStatusWorkspace.Builder()
    .workspaceName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .flowStatus(jobStatusFlowModel)
    .templateStatus(new java.util.ArrayList<JobStatusTemplate>(java.util.Arrays.asList(jobStatusTemplateModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusAction model
    JobStatusAction jobStatusActionModel = new JobStatusAction.Builder()
    .actionName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .bastionStatusCode("none")
    .bastionStatusMessage("testString")
    .targetsStatusCode("none")
    .targetsStatusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusSchematicsResources model
    JobStatusSchematicsResources jobStatusSchematicsResourcesModel = new JobStatusSchematicsResources.Builder()
    .statusCode("job_pending")
    .statusMessage("testString")
    .schematicsResourceId("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusSystem model
    JobStatusSystem jobStatusSystemModel = new JobStatusSystem.Builder()
    .systemStatusMessage("testString")
    .systemStatusCode("job_pending")
    .schematicsResourceStatus(new java.util.ArrayList<JobStatusSchematicsResources>(java.util.Arrays.asList(jobStatusSchematicsResourcesModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatus model
    JobStatus jobStatusModel = new JobStatus.Builder()
    .workspaceJobStatus(jobStatusWorkspaceModel)
    .actionJobStatus(jobStatusActionModel)
    .systemJobStatus(jobStatusSystemModel)
    .flowJobStatus(jobStatusFlowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataTemplate model
    JobDataTemplate jobDataTemplateModel = new JobDataTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkspace model
    JobDataWorkspace jobDataWorkspaceModel = new JobDataWorkspace.Builder()
    .workspaceName("testString")
    .flowId("testString")
    .flowName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .templateData(new java.util.ArrayList<JobDataTemplate>(java.util.Arrays.asList(jobDataTemplateModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the InventoryResourceRecord model
    InventoryResourceRecord inventoryResourceRecordModel = new InventoryResourceRecord.Builder()
    .name("testString")
    .description("testString")
    .location("us-south")
    .resourceGroup("testString")
    .inventoriesIni("testString")
    .resourceQueries(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataAction model
    JobDataAction jobDataActionModel = new JobDataAction.Builder()
    .actionName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .inventoryRecord(inventoryResourceRecordModel)
    .materializedInventory("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataSystem model
    JobDataSystem jobDataSystemModel = new JobDataSystem.Builder()
    .keyId("testString")
    .schematicsResourceId(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkItemLastJob model
    JobDataWorkItemLastJob jobDataWorkItemLastJobModel = new JobDataWorkItemLastJob.Builder()
    .commandObject("workspace")
    .commandObjectName("testString")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .jobId("testString")
    .jobStatus("job_pending")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkItem model
    JobDataWorkItem jobDataWorkItemModel = new JobDataWorkItem.Builder()
    .commandObjectId("testString")
    .commandObjectName("testString")
    .layers("testString")
    .sourceType("local")
    .source(externalSourceModel)
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .lastJob(jobDataWorkItemLastJobModel)
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataFlow model
    JobDataFlow jobDataFlowModel = new JobDataFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .workitems(new java.util.ArrayList<JobDataWorkItem>(java.util.Arrays.asList(jobDataWorkItemModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobData model
    JobData jobDataModel = new JobData.Builder()
    .jobType("repo_download_job")
    .workspaceJobData(jobDataWorkspaceModel)
    .actionJobData(jobDataActionModel)
    .systemJobData(jobDataSystemModel)
    .flowJobData(jobDataFlowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the BastionResourceDefinition model
    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
    .name("testString")
    .host("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryRepoDownloadJob model
    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryWorkspaceJob model
    JobLogSummaryWorkspaceJob jobLogSummaryWorkspaceJobModel = new JobLogSummaryWorkspaceJob.Builder()
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryWorkitems model
    JobLogSummaryWorkitems jobLogSummaryWorkitemsModel = new JobLogSummaryWorkitems.Builder()
    .workspaceId("testString")
    .jobId("testString")
    .logUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryFlowJob model
    JobLogSummaryFlowJob jobLogSummaryFlowJobModel = new JobLogSummaryFlowJob.Builder()
    .workitems(new java.util.ArrayList<JobLogSummaryWorkitems>(java.util.Arrays.asList(jobLogSummaryWorkitemsModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryActionJobRecap model
    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
    .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .ok(Double.valueOf("72.5"))
    .changed(Double.valueOf("72.5"))
    .failed(Double.valueOf("72.5"))
    .skipped(Double.valueOf("72.5"))
    .unreachable(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryActionJob model
    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
    .recap(jobLogSummaryActionJobRecapModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummarySystemJob model
    JobLogSummarySystemJob jobLogSummarySystemJobModel = new JobLogSummarySystemJob.Builder()
    .success(Double.valueOf("72.5"))
    .failed(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummary model
    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
    .jobType("repo_download_job")
    .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
    .workspaceJob(jobLogSummaryWorkspaceJobModel)
    .flowJob(jobLogSummaryFlowJobModel)
    .actionJob(jobLogSummaryActionJobModel)
    .systemJob(jobLogSummarySystemJobModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the Job model
    Job jobModel = new Job.Builder()
    .commandObject("workspace")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .commandParameter("testString")
    .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .location("us-south")
    .status(jobStatusModel)
    .data(jobDataModel)
    .bastion(bastionResourceDefinitionModel)
    .logSummary(jobLogSummaryModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TriggerJob model
    TriggerJob triggerJobModel = new TriggerJob.Builder()
    .event("before | after")
    .job(jobModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TriggerScheduled model
    TriggerScheduled triggerScheduledModel = new TriggerScheduled.Builder()
    .frequency("daily | weekly")
    .time("time in UTC")
    .day("expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ControlsDecision model
    ControlsDecision controlsDecisionModel = new ControlsDecision.Builder()
    .rule("testString")
    .passValue("before")
    .passExpr("== OR != OR <= OR >= OR > OR <")
    .evidenceFoundIn("rule emitting details")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ControlsEscalation model
    ControlsEscalation controlsEscalationModel = new ControlsEscalation.Builder()
    .actionId("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ControlsLiteState model
    ControlsLiteState controlsLiteStateModel = new ControlsLiteState.Builder()
    .statusCode("normal")
    .statusMessage("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the CapsuleResultResources model
    CapsuleResultResources capsuleResultResourcesModel = new CapsuleResultResources.Builder()
    .name("testString")
    .type("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the CapsuleResultEvidences model
    CapsuleResultEvidences capsuleResultEvidencesModel = new CapsuleResultEvidences.Builder()
    .resources(new java.util.ArrayList<CapsuleResultResources>(java.util.Arrays.asList(capsuleResultResourcesModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobResultCapsule model
    JobResultCapsule jobResultCapsuleModel = new JobResultCapsule.Builder()
    .jobId("testString")
    .jobName("testString")
    .policy("testString")
    .severity(Long.valueOf("1"))
    .jobState("success")
    .failures(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .passed(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .evidences(new java.util.ArrayList<CapsuleResultEvidences>(java.util.Arrays.asList(capsuleResultEvidencesModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataCapsule model
    JobDataCapsule jobDataCapsuleModel = new JobDataCapsule.Builder()
    .capsuleId("testString")
    .calsuleName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .results(new java.util.ArrayList<JobResultCapsule>(java.util.Arrays.asList(jobResultCapsuleModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Capsule model
    Capsule capsuleModel = new Capsule.Builder()
    .name("testString")
    .description("testString")
    .type("testString")
    .userState(userStateModel)
    .xPackage("Policy package path")
    .severity(Long.valueOf("1"))
    .inventory("testString")
    .triggerRecordId("testString")
    .jobTriggers(new java.util.ArrayList<TriggerJob>(java.util.Arrays.asList(triggerJobModel)))
    .scheduledTriggers(new java.util.ArrayList<TriggerScheduled>(java.util.Arrays.asList(triggerScheduledModel)))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .decisions(new java.util.ArrayList<ControlsDecision>(java.util.Arrays.asList(controlsDecisionModel)))
    .escalations(new java.util.ArrayList<ControlsEscalation>(java.util.Arrays.asList(controlsEscalationModel)))
    .id("testString")
    .status("testString")
    .controlsId("testString")
    .controlsName("testString")
    .createdAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .createdBy("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .updatedBy("testString")
    .state(controlsLiteStateModel)
    .lastJobData(jobDataCapsuleModel)
    .sysLock(systemLockModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the Controls model
    Controls controlsModel = new Controls.Builder()
    .name("testString")
    .type("it_controls")
    .description("testString")
    .resourceGroup("testString")
    .location("us-south")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .sourceReadmeUrl("testString")
    .source(externalSourceModel)
    .sourceType("local")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .userState(userStateModel)
    .sysLock(systemLockModel)
    .capsules(new java.util.ArrayList<Capsule>(java.util.Arrays.asList(capsuleModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the UpdateControlsOptions model
    UpdateControlsOptions updateControlsOptionsModel = new UpdateControlsOptions.Builder()
    .controlsId("testString")
    .controls(controlsModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Controls> response = schematics20ApiService.updateControls(updateControlsOptionsModel).execute();
    assertNotNull(response);
    Controls responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateControlsPath);
  }

  // Test the updateControls operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateControlsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.updateControls(null).execute();
  }

  @Test
  public void testListCapsulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"capsules\": [{\"name\": \"name\", \"description\": \"This Capsule can be used to Stop the targets\", \"id\": \"id\", \"crn\": \"crn\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\"}]}";
    String listCapsulesPath = "/v2/controls/testString/capsules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListCapsulesOptions model
    ListCapsulesOptions listCapsulesOptionsModel = new ListCapsulesOptions.Builder()
    .controlsId("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .sort("testString")
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CapsuleList> response = schematics20ApiService.listCapsules(listCapsulesOptionsModel).execute();
    assertNotNull(response);
    CapsuleList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listCapsulesPath);
  }

  // Test the listCapsules operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListCapsulesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.listCapsules(null).execute();
  }

  @Test
  public void testCreateCapsuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"capsules\": [{\"name\": \"name\", \"description\": \"This Capsule can be used to Stop the targets\", \"id\": \"id\", \"crn\": \"crn\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\"}]}";
    String createCapsulePath = "/v2/controls/testString/capsules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkitem model
    JobStatusWorkitem jobStatusWorkitemModel = new JobStatusWorkitem.Builder()
    .workspaceId("testString")
    .workspaceName("testString")
    .jobId("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusFlow model
    JobStatusFlow jobStatusFlowModel = new JobStatusFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .workitems(new java.util.ArrayList<JobStatusWorkitem>(java.util.Arrays.asList(jobStatusWorkitemModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusTemplate model
    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkspace model
    JobStatusWorkspace jobStatusWorkspaceModel = new JobStatusWorkspace.Builder()
    .workspaceName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .flowStatus(jobStatusFlowModel)
    .templateStatus(new java.util.ArrayList<JobStatusTemplate>(java.util.Arrays.asList(jobStatusTemplateModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusAction model
    JobStatusAction jobStatusActionModel = new JobStatusAction.Builder()
    .actionName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .bastionStatusCode("none")
    .bastionStatusMessage("testString")
    .targetsStatusCode("none")
    .targetsStatusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusSchematicsResources model
    JobStatusSchematicsResources jobStatusSchematicsResourcesModel = new JobStatusSchematicsResources.Builder()
    .statusCode("job_pending")
    .statusMessage("testString")
    .schematicsResourceId("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusSystem model
    JobStatusSystem jobStatusSystemModel = new JobStatusSystem.Builder()
    .systemStatusMessage("testString")
    .systemStatusCode("job_pending")
    .schematicsResourceStatus(new java.util.ArrayList<JobStatusSchematicsResources>(java.util.Arrays.asList(jobStatusSchematicsResourcesModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatus model
    JobStatus jobStatusModel = new JobStatus.Builder()
    .workspaceJobStatus(jobStatusWorkspaceModel)
    .actionJobStatus(jobStatusActionModel)
    .systemJobStatus(jobStatusSystemModel)
    .flowJobStatus(jobStatusFlowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataTemplate model
    JobDataTemplate jobDataTemplateModel = new JobDataTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkspace model
    JobDataWorkspace jobDataWorkspaceModel = new JobDataWorkspace.Builder()
    .workspaceName("testString")
    .flowId("testString")
    .flowName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .templateData(new java.util.ArrayList<JobDataTemplate>(java.util.Arrays.asList(jobDataTemplateModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the InventoryResourceRecord model
    InventoryResourceRecord inventoryResourceRecordModel = new InventoryResourceRecord.Builder()
    .name("testString")
    .description("testString")
    .location("us-south")
    .resourceGroup("testString")
    .inventoriesIni("testString")
    .resourceQueries(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataAction model
    JobDataAction jobDataActionModel = new JobDataAction.Builder()
    .actionName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .inventoryRecord(inventoryResourceRecordModel)
    .materializedInventory("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataSystem model
    JobDataSystem jobDataSystemModel = new JobDataSystem.Builder()
    .keyId("testString")
    .schematicsResourceId(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkItemLastJob model
    JobDataWorkItemLastJob jobDataWorkItemLastJobModel = new JobDataWorkItemLastJob.Builder()
    .commandObject("workspace")
    .commandObjectName("testString")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .jobId("testString")
    .jobStatus("job_pending")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkItem model
    JobDataWorkItem jobDataWorkItemModel = new JobDataWorkItem.Builder()
    .commandObjectId("testString")
    .commandObjectName("testString")
    .layers("testString")
    .sourceType("local")
    .source(externalSourceModel)
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .lastJob(jobDataWorkItemLastJobModel)
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataFlow model
    JobDataFlow jobDataFlowModel = new JobDataFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .workitems(new java.util.ArrayList<JobDataWorkItem>(java.util.Arrays.asList(jobDataWorkItemModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobData model
    JobData jobDataModel = new JobData.Builder()
    .jobType("repo_download_job")
    .workspaceJobData(jobDataWorkspaceModel)
    .actionJobData(jobDataActionModel)
    .systemJobData(jobDataSystemModel)
    .flowJobData(jobDataFlowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the BastionResourceDefinition model
    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
    .name("testString")
    .host("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryRepoDownloadJob model
    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryWorkspaceJob model
    JobLogSummaryWorkspaceJob jobLogSummaryWorkspaceJobModel = new JobLogSummaryWorkspaceJob.Builder()
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryWorkitems model
    JobLogSummaryWorkitems jobLogSummaryWorkitemsModel = new JobLogSummaryWorkitems.Builder()
    .workspaceId("testString")
    .jobId("testString")
    .logUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryFlowJob model
    JobLogSummaryFlowJob jobLogSummaryFlowJobModel = new JobLogSummaryFlowJob.Builder()
    .workitems(new java.util.ArrayList<JobLogSummaryWorkitems>(java.util.Arrays.asList(jobLogSummaryWorkitemsModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryActionJobRecap model
    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
    .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .ok(Double.valueOf("72.5"))
    .changed(Double.valueOf("72.5"))
    .failed(Double.valueOf("72.5"))
    .skipped(Double.valueOf("72.5"))
    .unreachable(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryActionJob model
    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
    .recap(jobLogSummaryActionJobRecapModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummarySystemJob model
    JobLogSummarySystemJob jobLogSummarySystemJobModel = new JobLogSummarySystemJob.Builder()
    .success(Double.valueOf("72.5"))
    .failed(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummary model
    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
    .jobType("repo_download_job")
    .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
    .workspaceJob(jobLogSummaryWorkspaceJobModel)
    .flowJob(jobLogSummaryFlowJobModel)
    .actionJob(jobLogSummaryActionJobModel)
    .systemJob(jobLogSummarySystemJobModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the Job model
    Job jobModel = new Job.Builder()
    .commandObject("workspace")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .commandParameter("testString")
    .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .location("us-south")
    .status(jobStatusModel)
    .data(jobDataModel)
    .bastion(bastionResourceDefinitionModel)
    .logSummary(jobLogSummaryModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TriggerJob model
    TriggerJob triggerJobModel = new TriggerJob.Builder()
    .event("before | after")
    .job(jobModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TriggerScheduled model
    TriggerScheduled triggerScheduledModel = new TriggerScheduled.Builder()
    .frequency("daily | weekly")
    .time("time in UTC")
    .day("expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ControlsDecision model
    ControlsDecision controlsDecisionModel = new ControlsDecision.Builder()
    .rule("testString")
    .passValue("before")
    .passExpr("== OR != OR <= OR >= OR > OR <")
    .evidenceFoundIn("rule emitting details")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ControlsEscalation model
    ControlsEscalation controlsEscalationModel = new ControlsEscalation.Builder()
    .actionId("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ControlsLiteState model
    ControlsLiteState controlsLiteStateModel = new ControlsLiteState.Builder()
    .statusCode("normal")
    .statusMessage("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the CapsuleResultResources model
    CapsuleResultResources capsuleResultResourcesModel = new CapsuleResultResources.Builder()
    .name("testString")
    .type("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the CapsuleResultEvidences model
    CapsuleResultEvidences capsuleResultEvidencesModel = new CapsuleResultEvidences.Builder()
    .resources(new java.util.ArrayList<CapsuleResultResources>(java.util.Arrays.asList(capsuleResultResourcesModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobResultCapsule model
    JobResultCapsule jobResultCapsuleModel = new JobResultCapsule.Builder()
    .jobId("testString")
    .jobName("testString")
    .policy("testString")
    .severity(Long.valueOf("1"))
    .jobState("success")
    .failures(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .passed(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .evidences(new java.util.ArrayList<CapsuleResultEvidences>(java.util.Arrays.asList(capsuleResultEvidencesModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataCapsule model
    JobDataCapsule jobDataCapsuleModel = new JobDataCapsule.Builder()
    .capsuleId("testString")
    .calsuleName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .results(new java.util.ArrayList<JobResultCapsule>(java.util.Arrays.asList(jobResultCapsuleModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Capsule model
    Capsule capsuleModel = new Capsule.Builder()
    .name("testString")
    .description("testString")
    .type("testString")
    .userState(userStateModel)
    .xPackage("Policy package path")
    .severity(Long.valueOf("1"))
    .inventory("testString")
    .triggerRecordId("testString")
    .jobTriggers(new java.util.ArrayList<TriggerJob>(java.util.Arrays.asList(triggerJobModel)))
    .scheduledTriggers(new java.util.ArrayList<TriggerScheduled>(java.util.Arrays.asList(triggerScheduledModel)))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .decisions(new java.util.ArrayList<ControlsDecision>(java.util.Arrays.asList(controlsDecisionModel)))
    .escalations(new java.util.ArrayList<ControlsEscalation>(java.util.Arrays.asList(controlsEscalationModel)))
    .id("testString")
    .status("testString")
    .controlsId("testString")
    .controlsName("testString")
    .createdAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .createdBy("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .updatedBy("testString")
    .state(controlsLiteStateModel)
    .lastJobData(jobDataCapsuleModel)
    .sysLock(systemLockModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the CreateCapsuleOptions model
    CreateCapsuleOptions createCapsuleOptionsModel = new CreateCapsuleOptions.Builder()
    .controlsId("testString")
    .capsule(capsuleModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CapsuleList> response = schematics20ApiService.createCapsule(createCapsuleOptionsModel).execute();
    assertNotNull(response);
    CapsuleList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createCapsulePath);
  }

  // Test the createCapsule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateCapsuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.createCapsule(null).execute();
  }

  @Test
  public void testGetCapsuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"type\": \"type\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"package\": \"Policy package path\", \"severity\": 1, \"inventory\": \"inventory\", \"trigger_record_id\": \"triggerRecordId\", \"job_triggers\": [{\"event\": \"before | after\", \"job\": {\"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"command_parameter\": \"commandParameter\", \"command_options\": [\"commandOptions\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"tags\": [\"tags\"], \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"duration\": \"duration\", \"status\": {\"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"data\": {\"job_type\": \"repo_download_job\", \"workspace_job_data\": {\"workspace_name\": \"workspaceName\", \"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"template_data\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_data\": {\"action_name\": \"actionName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"inventory_record\": {\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}, \"materialized_inventory\": \"materializedInventory\"}, \"system_job_data\": {\"key_id\": \"keyId\", \"schematics_resource_id\": [\"schematicsResourceId\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_data\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"workitems\": [{\"command_object_id\": \"commandObjectId\", \"command_object_name\": \"commandObjectName\", \"layers\": \"layers\", \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_id\": \"jobId\", \"job_status\": \"job_pending\"}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"log_store_url\": \"logStoreUrl\", \"state_store_url\": \"stateStoreUrl\", \"results_url\": \"resultsUrl\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}], \"scheduled_triggers\": [{\"frequency\": \"daily | weekly\", \"time\": \"time in UTC\", \"day\": \"expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday\"}], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"decisions\": [{\"rule\": \"rule\", \"pass_value\": \"before\", \"pass_expr\": \"== OR != OR <= OR >= OR > OR <\", \"evidence_found_in\": \"rule emitting details\"}], \"escalations\": [{\"action_id\": \"actionId\"}], \"id\": \"id\", \"status\": \"status\", \"controls_id\": \"controlsId\", \"controls_name\": \"controlsName\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"last_job_data\": {\"capsule_id\": \"capsuleId\", \"calsule_name\": \"calsuleName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"results\": [{\"job_id\": \"jobId\", \"job_name\": \"jobName\", \"policy\": \"policy\", \"severity\": 1, \"job_state\": \"success\", \"failures\": [\"failures\"], \"passed\": [\"passed\"], \"evidences\": [{\"resources\": [{\"name\": \"name\", \"type\": \"type\"}]}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}";
    String getCapsulePath = "/v2/controls/testString/capsules/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetCapsuleOptions model
    GetCapsuleOptions getCapsuleOptionsModel = new GetCapsuleOptions.Builder()
    .controlsId("testString")
    .capsuleId("testString")
    .profile("summary")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Capsule> response = schematics20ApiService.getCapsule(getCapsuleOptionsModel).execute();
    assertNotNull(response);
    Capsule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("profile"), "summary");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCapsulePath);
  }

  // Test the getCapsule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCapsuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getCapsule(null).execute();
  }

  @Test
  public void testDeleteCapsuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteCapsulePath = "/v2/controls/testString/capsules/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteCapsuleOptions model
    DeleteCapsuleOptions deleteCapsuleOptionsModel = new DeleteCapsuleOptions.Builder()
    .controlsId("testString")
    .capsuleId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematics20ApiService.deleteCapsule(deleteCapsuleOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteCapsulePath);
  }

  // Test the deleteCapsule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteCapsuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.deleteCapsule(null).execute();
  }

  @Test
  public void testUpdateCapsuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"type\": \"type\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"package\": \"Policy package path\", \"severity\": 1, \"inventory\": \"inventory\", \"trigger_record_id\": \"triggerRecordId\", \"job_triggers\": [{\"event\": \"before | after\", \"job\": {\"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"command_parameter\": \"commandParameter\", \"command_options\": [\"commandOptions\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"tags\": [\"tags\"], \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"duration\": \"duration\", \"status\": {\"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"data\": {\"job_type\": \"repo_download_job\", \"workspace_job_data\": {\"workspace_name\": \"workspaceName\", \"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"template_data\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_data\": {\"action_name\": \"actionName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"inventory_record\": {\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}, \"materialized_inventory\": \"materializedInventory\"}, \"system_job_data\": {\"key_id\": \"keyId\", \"schematics_resource_id\": [\"schematicsResourceId\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_data\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"workitems\": [{\"command_object_id\": \"commandObjectId\", \"command_object_name\": \"commandObjectName\", \"layers\": \"layers\", \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_id\": \"jobId\", \"job_status\": \"job_pending\"}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"log_store_url\": \"logStoreUrl\", \"state_store_url\": \"stateStoreUrl\", \"results_url\": \"resultsUrl\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}], \"scheduled_triggers\": [{\"frequency\": \"daily | weekly\", \"time\": \"time in UTC\", \"day\": \"expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday\"}], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"decisions\": [{\"rule\": \"rule\", \"pass_value\": \"before\", \"pass_expr\": \"== OR != OR <= OR >= OR > OR <\", \"evidence_found_in\": \"rule emitting details\"}], \"escalations\": [{\"action_id\": \"actionId\"}], \"id\": \"id\", \"status\": \"status\", \"controls_id\": \"controlsId\", \"controls_name\": \"controlsName\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}, \"last_job_data\": {\"capsule_id\": \"capsuleId\", \"calsule_name\": \"calsuleName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"results\": [{\"job_id\": \"jobId\", \"job_name\": \"jobName\", \"policy\": \"policy\", \"severity\": 1, \"job_state\": \"success\", \"failures\": [\"failures\"], \"passed\": [\"passed\"], \"evidences\": [{\"resources\": [{\"name\": \"name\", \"type\": \"type\"}]}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}}";
    String updateCapsulePath = "/v2/controls/testString/capsules/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkitem model
    JobStatusWorkitem jobStatusWorkitemModel = new JobStatusWorkitem.Builder()
    .workspaceId("testString")
    .workspaceName("testString")
    .jobId("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusFlow model
    JobStatusFlow jobStatusFlowModel = new JobStatusFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .workitems(new java.util.ArrayList<JobStatusWorkitem>(java.util.Arrays.asList(jobStatusWorkitemModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusTemplate model
    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkspace model
    JobStatusWorkspace jobStatusWorkspaceModel = new JobStatusWorkspace.Builder()
    .workspaceName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .flowStatus(jobStatusFlowModel)
    .templateStatus(new java.util.ArrayList<JobStatusTemplate>(java.util.Arrays.asList(jobStatusTemplateModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusAction model
    JobStatusAction jobStatusActionModel = new JobStatusAction.Builder()
    .actionName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .bastionStatusCode("none")
    .bastionStatusMessage("testString")
    .targetsStatusCode("none")
    .targetsStatusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusSchematicsResources model
    JobStatusSchematicsResources jobStatusSchematicsResourcesModel = new JobStatusSchematicsResources.Builder()
    .statusCode("job_pending")
    .statusMessage("testString")
    .schematicsResourceId("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusSystem model
    JobStatusSystem jobStatusSystemModel = new JobStatusSystem.Builder()
    .systemStatusMessage("testString")
    .systemStatusCode("job_pending")
    .schematicsResourceStatus(new java.util.ArrayList<JobStatusSchematicsResources>(java.util.Arrays.asList(jobStatusSchematicsResourcesModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatus model
    JobStatus jobStatusModel = new JobStatus.Builder()
    .workspaceJobStatus(jobStatusWorkspaceModel)
    .actionJobStatus(jobStatusActionModel)
    .systemJobStatus(jobStatusSystemModel)
    .flowJobStatus(jobStatusFlowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataTemplate model
    JobDataTemplate jobDataTemplateModel = new JobDataTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkspace model
    JobDataWorkspace jobDataWorkspaceModel = new JobDataWorkspace.Builder()
    .workspaceName("testString")
    .flowId("testString")
    .flowName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .templateData(new java.util.ArrayList<JobDataTemplate>(java.util.Arrays.asList(jobDataTemplateModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the InventoryResourceRecord model
    InventoryResourceRecord inventoryResourceRecordModel = new InventoryResourceRecord.Builder()
    .name("testString")
    .description("testString")
    .location("us-south")
    .resourceGroup("testString")
    .inventoriesIni("testString")
    .resourceQueries(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataAction model
    JobDataAction jobDataActionModel = new JobDataAction.Builder()
    .actionName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .inventoryRecord(inventoryResourceRecordModel)
    .materializedInventory("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataSystem model
    JobDataSystem jobDataSystemModel = new JobDataSystem.Builder()
    .keyId("testString")
    .schematicsResourceId(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkItemLastJob model
    JobDataWorkItemLastJob jobDataWorkItemLastJobModel = new JobDataWorkItemLastJob.Builder()
    .commandObject("workspace")
    .commandObjectName("testString")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .jobId("testString")
    .jobStatus("job_pending")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkItem model
    JobDataWorkItem jobDataWorkItemModel = new JobDataWorkItem.Builder()
    .commandObjectId("testString")
    .commandObjectName("testString")
    .layers("testString")
    .sourceType("local")
    .source(externalSourceModel)
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .lastJob(jobDataWorkItemLastJobModel)
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataFlow model
    JobDataFlow jobDataFlowModel = new JobDataFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .workitems(new java.util.ArrayList<JobDataWorkItem>(java.util.Arrays.asList(jobDataWorkItemModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobData model
    JobData jobDataModel = new JobData.Builder()
    .jobType("repo_download_job")
    .workspaceJobData(jobDataWorkspaceModel)
    .actionJobData(jobDataActionModel)
    .systemJobData(jobDataSystemModel)
    .flowJobData(jobDataFlowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the BastionResourceDefinition model
    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
    .name("testString")
    .host("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryRepoDownloadJob model
    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryWorkspaceJob model
    JobLogSummaryWorkspaceJob jobLogSummaryWorkspaceJobModel = new JobLogSummaryWorkspaceJob.Builder()
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryWorkitems model
    JobLogSummaryWorkitems jobLogSummaryWorkitemsModel = new JobLogSummaryWorkitems.Builder()
    .workspaceId("testString")
    .jobId("testString")
    .logUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryFlowJob model
    JobLogSummaryFlowJob jobLogSummaryFlowJobModel = new JobLogSummaryFlowJob.Builder()
    .workitems(new java.util.ArrayList<JobLogSummaryWorkitems>(java.util.Arrays.asList(jobLogSummaryWorkitemsModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryActionJobRecap model
    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
    .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .ok(Double.valueOf("72.5"))
    .changed(Double.valueOf("72.5"))
    .failed(Double.valueOf("72.5"))
    .skipped(Double.valueOf("72.5"))
    .unreachable(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryActionJob model
    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
    .recap(jobLogSummaryActionJobRecapModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummarySystemJob model
    JobLogSummarySystemJob jobLogSummarySystemJobModel = new JobLogSummarySystemJob.Builder()
    .success(Double.valueOf("72.5"))
    .failed(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummary model
    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
    .jobType("repo_download_job")
    .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
    .workspaceJob(jobLogSummaryWorkspaceJobModel)
    .flowJob(jobLogSummaryFlowJobModel)
    .actionJob(jobLogSummaryActionJobModel)
    .systemJob(jobLogSummarySystemJobModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the Job model
    Job jobModel = new Job.Builder()
    .commandObject("workspace")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .commandParameter("testString")
    .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .location("us-south")
    .status(jobStatusModel)
    .data(jobDataModel)
    .bastion(bastionResourceDefinitionModel)
    .logSummary(jobLogSummaryModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TriggerJob model
    TriggerJob triggerJobModel = new TriggerJob.Builder()
    .event("before | after")
    .job(jobModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TriggerScheduled model
    TriggerScheduled triggerScheduledModel = new TriggerScheduled.Builder()
    .frequency("daily | weekly")
    .time("time in UTC")
    .day("expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ControlsDecision model
    ControlsDecision controlsDecisionModel = new ControlsDecision.Builder()
    .rule("testString")
    .passValue("before")
    .passExpr("== OR != OR <= OR >= OR > OR <")
    .evidenceFoundIn("rule emitting details")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ControlsEscalation model
    ControlsEscalation controlsEscalationModel = new ControlsEscalation.Builder()
    .actionId("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ControlsLiteState model
    ControlsLiteState controlsLiteStateModel = new ControlsLiteState.Builder()
    .statusCode("normal")
    .statusMessage("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the CapsuleResultResources model
    CapsuleResultResources capsuleResultResourcesModel = new CapsuleResultResources.Builder()
    .name("testString")
    .type("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the CapsuleResultEvidences model
    CapsuleResultEvidences capsuleResultEvidencesModel = new CapsuleResultEvidences.Builder()
    .resources(new java.util.ArrayList<CapsuleResultResources>(java.util.Arrays.asList(capsuleResultResourcesModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobResultCapsule model
    JobResultCapsule jobResultCapsuleModel = new JobResultCapsule.Builder()
    .jobId("testString")
    .jobName("testString")
    .policy("testString")
    .severity(Long.valueOf("1"))
    .jobState("success")
    .failures(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .passed(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .evidences(new java.util.ArrayList<CapsuleResultEvidences>(java.util.Arrays.asList(capsuleResultEvidencesModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataCapsule model
    JobDataCapsule jobDataCapsuleModel = new JobDataCapsule.Builder()
    .capsuleId("testString")
    .calsuleName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .results(new java.util.ArrayList<JobResultCapsule>(java.util.Arrays.asList(jobResultCapsuleModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Capsule model
    Capsule capsuleModel = new Capsule.Builder()
    .name("testString")
    .description("testString")
    .type("testString")
    .userState(userStateModel)
    .xPackage("Policy package path")
    .severity(Long.valueOf("1"))
    .inventory("testString")
    .triggerRecordId("testString")
    .jobTriggers(new java.util.ArrayList<TriggerJob>(java.util.Arrays.asList(triggerJobModel)))
    .scheduledTriggers(new java.util.ArrayList<TriggerScheduled>(java.util.Arrays.asList(triggerScheduledModel)))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .decisions(new java.util.ArrayList<ControlsDecision>(java.util.Arrays.asList(controlsDecisionModel)))
    .escalations(new java.util.ArrayList<ControlsEscalation>(java.util.Arrays.asList(controlsEscalationModel)))
    .id("testString")
    .status("testString")
    .controlsId("testString")
    .controlsName("testString")
    .createdAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .createdBy("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .updatedBy("testString")
    .state(controlsLiteStateModel)
    .lastJobData(jobDataCapsuleModel)
    .sysLock(systemLockModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the UpdateCapsuleOptions model
    UpdateCapsuleOptions updateCapsuleOptionsModel = new UpdateCapsuleOptions.Builder()
    .controlsId("testString")
    .capsuleId("testString")
    .capsule(capsuleModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Capsule> response = schematics20ApiService.updateCapsule(updateCapsuleOptionsModel).execute();
    assertNotNull(response);
    Capsule responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateCapsulePath);
  }

  // Test the updateCapsule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateCapsuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.updateCapsule(null).execute();
  }

  @Test
  public void testListDatasetsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"datasets\": [{\"name\": \"name\", \"dataset_id\": \"datasetId\", \"type\": \"credential\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"location\": \"us-south\", \"tags\": [\"tags\"], \"source_type\": \"local\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\"}]}";
    String listDatasetsPath = "/v2/datasets";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListDatasetsOptions model
    ListDatasetsOptions listDatasetsOptionsModel = new ListDatasetsOptions.Builder()
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .sort("testString")
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DatasetList> response = schematics20ApiService.listDatasets(listDatasetsOptionsModel).execute();
    assertNotNull(response);
    DatasetList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDatasetsPath);
  }

  @Test
  public void testCreateDatasetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"type\": \"credential\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"location\": \"us-south\", \"tags\": [\"tags\"], \"data\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_type\": \"local\", \"source_link\": \"static\", \"source_readme_url\": \"sourceReadmeUrl\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"auto_propagate_change\": false, \"dataset_id\": \"datasetId\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"affected_resource_ids\": [\"affectedResourceIds\"]}";
    String createDatasetPath = "/v2/datasets";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Dataset model
    Dataset datasetModel = new Dataset.Builder()
    .name("testString")
    .type("credential")
    .description("testString")
    .resourceGroup("testString")
    .location("us-south")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .data(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .source(externalSourceModel)
    .sourceType("local")
    .sourceLink("static")
    .sourceReadmeUrl("testString")
    .userState(userStateModel)
    .autoPropagateChange(true)
    .add("foo", "testString")
    .build();

    // Construct an instance of the CreateDatasetOptions model
    CreateDatasetOptions createDatasetOptionsModel = new CreateDatasetOptions.Builder()
    .dataset(datasetModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Dataset> response = schematics20ApiService.createDataset(createDatasetOptionsModel).execute();
    assertNotNull(response);
    Dataset responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDatasetPath);
  }

  // Test the createDataset operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDatasetNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.createDataset(null).execute();
  }

  @Test
  public void testGetDatasetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"type\": \"credential\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"location\": \"us-south\", \"tags\": [\"tags\"], \"data\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_type\": \"local\", \"source_link\": \"static\", \"source_readme_url\": \"sourceReadmeUrl\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"auto_propagate_change\": false, \"dataset_id\": \"datasetId\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"affected_resource_ids\": [\"affectedResourceIds\"]}";
    String getDatasetPath = "/v2/datasets/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDatasetOptions model
    GetDatasetOptions getDatasetOptionsModel = new GetDatasetOptions.Builder()
    .datasetId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Dataset> response = schematics20ApiService.getDataset(getDatasetOptionsModel).execute();
    assertNotNull(response);
    Dataset responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDatasetPath);
  }

  // Test the getDataset operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDatasetNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getDataset(null).execute();
  }

  @Test
  public void testReplaceDatasetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"type\": \"credential\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"location\": \"us-south\", \"tags\": [\"tags\"], \"data\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_type\": \"local\", \"source_link\": \"static\", \"source_readme_url\": \"sourceReadmeUrl\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"auto_propagate_change\": false, \"dataset_id\": \"datasetId\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"affected_resource_ids\": [\"affectedResourceIds\"]}";
    String replaceDatasetPath = "/v2/datasets/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Dataset model
    Dataset datasetModel = new Dataset.Builder()
    .name("testString")
    .type("credential")
    .description("testString")
    .resourceGroup("testString")
    .location("us-south")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .data(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .source(externalSourceModel)
    .sourceType("local")
    .sourceLink("static")
    .sourceReadmeUrl("testString")
    .userState(userStateModel)
    .autoPropagateChange(true)
    .add("foo", "testString")
    .build();

    // Construct an instance of the ReplaceDatasetOptions model
    ReplaceDatasetOptions replaceDatasetOptionsModel = new ReplaceDatasetOptions.Builder()
    .datasetId("testString")
    .dataset(datasetModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Dataset> response = schematics20ApiService.replaceDataset(replaceDatasetOptionsModel).execute();
    assertNotNull(response);
    Dataset responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceDatasetPath);
  }

  // Test the replaceDataset operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceDatasetNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.replaceDataset(null).execute();
  }

  @Test
  public void testDeleteDatasetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteDatasetPath = "/v2/datasets/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteDatasetOptions model
    DeleteDatasetOptions deleteDatasetOptionsModel = new DeleteDatasetOptions.Builder()
    .datasetId("testString")
    .force(true)
    .propagate(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematics20ApiService.deleteDataset(deleteDatasetOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDatasetPath);
  }

  // Test the deleteDataset operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDatasetNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.deleteDataset(null).execute();
  }

  @Test
  public void testUpdateAtasetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"type\": \"credential\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"location\": \"us-south\", \"tags\": [\"tags\"], \"data\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_type\": \"local\", \"source_link\": \"static\", \"source_readme_url\": \"sourceReadmeUrl\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"auto_propagate_change\": false, \"dataset_id\": \"datasetId\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"affected_resource_ids\": [\"affectedResourceIds\"]}";
    String updateAtasetPath = "/v2/datasets/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Dataset model
    Dataset datasetModel = new Dataset.Builder()
    .name("testString")
    .type("credential")
    .description("testString")
    .resourceGroup("testString")
    .location("us-south")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .data(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .source(externalSourceModel)
    .sourceType("local")
    .sourceLink("static")
    .sourceReadmeUrl("testString")
    .userState(userStateModel)
    .autoPropagateChange(true)
    .add("foo", "testString")
    .build();

    // Construct an instance of the UpdateAtasetOptions model
    UpdateAtasetOptions updateAtasetOptionsModel = new UpdateAtasetOptions.Builder()
    .datasetId("testString")
    .dataset(datasetModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Dataset> response = schematics20ApiService.updateAtaset(updateAtasetOptionsModel).execute();
    assertNotNull(response);
    Dataset responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateAtasetPath);
  }

  // Test the updateAtaset operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateAtasetNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.updateAtaset(null).execute();
  }

  @Test
  public void testListDatasetVariablesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"variables\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}]}";
    String listDatasetVariablesPath = "/v2/datasets/testString/variables";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListDatasetVariablesOptions model
    ListDatasetVariablesOptions listDatasetVariablesOptionsModel = new ListDatasetVariablesOptions.Builder()
    .datasetId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VariableDataList> response = schematics20ApiService.listDatasetVariables(listDatasetVariablesOptionsModel).execute();
    assertNotNull(response);
    VariableDataList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDatasetVariablesPath);
  }

  // Test the listDatasetVariables operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDatasetVariablesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.listDatasetVariables(null).execute();
  }

  @Test
  public void testGetDatasetVariableWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}";
    String getDatasetVariablePath = "/v2/datasets/testString/values/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDatasetVariableOptions model
    GetDatasetVariableOptions getDatasetVariableOptionsModel = new GetDatasetVariableOptions.Builder()
    .datasetId("testString")
    .varName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VariableData> response = schematics20ApiService.getDatasetVariable(getDatasetVariableOptionsModel).execute();
    assertNotNull(response);
    VariableData responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDatasetVariablePath);
  }

  // Test the getDatasetVariable operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDatasetVariableNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getDatasetVariable(null).execute();
  }

  @Test
  public void testListCredentialsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"credentials\": [{\"name\": \"name\", \"description\": \"description\", \"credential_id\": \"credentialId\", \"resource_group\": \"resourceGroup\", \"location\": \"us-south\", \"tags\": [\"tags\"], \"source_type\": \"local\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\"}]}";
    String listCredentialsPath = "/v2/credentials";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListCredentialsOptions model
    ListCredentialsOptions listCredentialsOptionsModel = new ListCredentialsOptions.Builder()
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .sort("testString")
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CredentialList> response = schematics20ApiService.listCredentials(listCredentialsOptionsModel).execute();
    assertNotNull(response);
    CredentialList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listCredentialsPath);
  }

  @Test
  public void testCreateCredentialWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"location\": \"us-south\", \"tags\": [\"tags\"], \"data\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"source_connection\": \"sourceConnection\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_type\": \"local\", \"source_link\": \"static\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"auto_propagate_change\": false, \"replica_enabled\": true, \"replica_invalidation_frequency\": \"hourly\", \"credential_id\": \"credentialId\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"affected_resource_ids\": [\"affectedResourceIds\"]}";
    String createCredentialPath = "/v2/credentials";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Credentialset model
    Credentialset credentialsetModel = new Credentialset.Builder()
    .name("testString")
    .description("testString")
    .resourceGroup("testString")
    .location("us-south")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .data(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .sourceConnection("testString")
    .source(externalSourceModel)
    .sourceType("local")
    .sourceLink("static")
    .userState(userStateModel)
    .autoPropagateChange(true)
    .replicaEnabled(true)
    .replicaInvalidationFrequency("hourly")
    .add("foo", "testString")
    .build();

    // Construct an instance of the CreateCredentialOptions model
    CreateCredentialOptions createCredentialOptionsModel = new CreateCredentialOptions.Builder()
    .credentialset(credentialsetModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Credentialset> response = schematics20ApiService.createCredential(createCredentialOptionsModel).execute();
    assertNotNull(response);
    Credentialset responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createCredentialPath);
  }

  // Test the createCredential operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateCredentialNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.createCredential(null).execute();
  }

  @Test
  public void testGetCredentialWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"location\": \"us-south\", \"tags\": [\"tags\"], \"data\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"source_connection\": \"sourceConnection\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_type\": \"local\", \"source_link\": \"static\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"auto_propagate_change\": false, \"replica_enabled\": true, \"replica_invalidation_frequency\": \"hourly\", \"credential_id\": \"credentialId\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"affected_resource_ids\": [\"affectedResourceIds\"]}";
    String getCredentialPath = "/v2/credentials/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetCredentialOptions model
    GetCredentialOptions getCredentialOptionsModel = new GetCredentialOptions.Builder()
    .credsId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Credentialset> response = schematics20ApiService.getCredential(getCredentialOptionsModel).execute();
    assertNotNull(response);
    Credentialset responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCredentialPath);
  }

  // Test the getCredential operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCredentialNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getCredential(null).execute();
  }

  @Test
  public void testReplaceCredentialWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"location\": \"us-south\", \"tags\": [\"tags\"], \"data\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"source_connection\": \"sourceConnection\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_type\": \"local\", \"source_link\": \"static\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"auto_propagate_change\": false, \"replica_enabled\": true, \"replica_invalidation_frequency\": \"hourly\", \"credential_id\": \"credentialId\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"affected_resource_ids\": [\"affectedResourceIds\"]}";
    String replaceCredentialPath = "/v2/credentials/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Credentialset model
    Credentialset credentialsetModel = new Credentialset.Builder()
    .name("testString")
    .description("testString")
    .resourceGroup("testString")
    .location("us-south")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .data(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .sourceConnection("testString")
    .source(externalSourceModel)
    .sourceType("local")
    .sourceLink("static")
    .userState(userStateModel)
    .autoPropagateChange(true)
    .replicaEnabled(true)
    .replicaInvalidationFrequency("hourly")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ReplaceCredentialOptions model
    ReplaceCredentialOptions replaceCredentialOptionsModel = new ReplaceCredentialOptions.Builder()
    .credsId("testString")
    .credentialset(credentialsetModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Credentialset> response = schematics20ApiService.replaceCredential(replaceCredentialOptionsModel).execute();
    assertNotNull(response);
    Credentialset responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceCredentialPath);
  }

  // Test the replaceCredential operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceCredentialNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.replaceCredential(null).execute();
  }

  @Test
  public void testDeleteCredentialWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteCredentialPath = "/v2/credentials/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteCredentialOptions model
    DeleteCredentialOptions deleteCredentialOptionsModel = new DeleteCredentialOptions.Builder()
    .credsId("testString")
    .force(true)
    .propagate(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematics20ApiService.deleteCredential(deleteCredentialOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteCredentialPath);
  }

  // Test the deleteCredential operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteCredentialNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.deleteCredential(null).execute();
  }

  @Test
  public void testUpdateCredentialWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"location\": \"us-south\", \"tags\": [\"tags\"], \"data\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"source_connection\": \"sourceConnection\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"source_type\": \"local\", \"source_link\": \"static\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"auto_propagate_change\": false, \"replica_enabled\": true, \"replica_invalidation_frequency\": \"hourly\", \"credential_id\": \"credentialId\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"affected_resource_ids\": [\"affectedResourceIds\"]}";
    String updateCredentialPath = "/v2/credentials/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Credentialset model
    Credentialset credentialsetModel = new Credentialset.Builder()
    .name("testString")
    .description("testString")
    .resourceGroup("testString")
    .location("us-south")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .data(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .sourceConnection("testString")
    .source(externalSourceModel)
    .sourceType("local")
    .sourceLink("static")
    .userState(userStateModel)
    .autoPropagateChange(true)
    .replicaEnabled(true)
    .replicaInvalidationFrequency("hourly")
    .add("foo", "testString")
    .build();

    // Construct an instance of the UpdateCredentialOptions model
    UpdateCredentialOptions updateCredentialOptionsModel = new UpdateCredentialOptions.Builder()
    .credsId("testString")
    .credentialset(credentialsetModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Credentialset> response = schematics20ApiService.updateCredential(updateCredentialOptionsModel).execute();
    assertNotNull(response);
    Credentialset responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateCredentialPath);
  }

  // Test the updateCredential operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateCredentialNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.updateCredential(null).execute();
  }

  @Test
  public void testListCredentialValuesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"variables\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}]}";
    String listCredentialValuesPath = "/v2/credentials/testString/variables";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListCredentialValuesOptions model
    ListCredentialValuesOptions listCredentialValuesOptionsModel = new ListCredentialValuesOptions.Builder()
    .credsId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VariableDataList> response = schematics20ApiService.listCredentialValues(listCredentialValuesOptionsModel).execute();
    assertNotNull(response);
    VariableDataList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listCredentialValuesPath);
  }

  // Test the listCredentialValues operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListCredentialValuesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.listCredentialValues(null).execute();
  }

  @Test
  public void testGetCredentialValueWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}";
    String getCredentialValuePath = "/v2/credentials/testString/variables/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetCredentialValueOptions model
    GetCredentialValueOptions getCredentialValueOptionsModel = new GetCredentialValueOptions.Builder()
    .credsId("testString")
    .varName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<VariableData> response = schematics20ApiService.getCredentialValue(getCredentialValueOptionsModel).execute();
    assertNotNull(response);
    VariableData responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCredentialValuePath);
  }

  // Test the getCredentialValue operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCredentialValueNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getCredentialValue(null).execute();
  }

  @Test
  public void testListInventoriesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"inventories\": [{\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}]}";
    String listInventoriesPath = "/v2/inventories";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListInventoriesOptions model
    ListInventoriesOptions listInventoriesOptionsModel = new ListInventoriesOptions.Builder()
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .sort("testString")
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InventoryResourceRecordList> response = schematics20ApiService.listInventories(listInventoriesOptionsModel).execute();
    assertNotNull(response);
    InventoryResourceRecordList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listInventoriesPath);
  }

  @Test
  public void testCreateInventoryWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}";
    String createInventoryPath = "/v2/inventories";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the InventoryResourceDefinition model
    InventoryResourceDefinition inventoryResourceDefinitionModel = new InventoryResourceDefinition.Builder()
    .name("testString")
    .description("testString")
    .location("us-south")
    .resourceGroup("testString")
    .inventoriesIni("testString")
    .resourceQueries(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the CreateInventoryOptions model
    CreateInventoryOptions createInventoryOptionsModel = new CreateInventoryOptions.Builder()
    .inventoryResourceDefinition(inventoryResourceDefinitionModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InventoryResourceRecord> response = schematics20ApiService.createInventory(createInventoryOptionsModel).execute();
    assertNotNull(response);
    InventoryResourceRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createInventoryPath);
  }

  // Test the createInventory operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateInventoryNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.createInventory(null).execute();
  }

  @Test
  public void testGetInventoryWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}";
    String getInventoryPath = "/v2/inventories/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetInventoryOptions model
    GetInventoryOptions getInventoryOptionsModel = new GetInventoryOptions.Builder()
    .inventoryId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InventoryResourceRecord> response = schematics20ApiService.getInventory(getInventoryOptionsModel).execute();
    assertNotNull(response);
    InventoryResourceRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInventoryPath);
  }

  // Test the getInventory operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInventoryNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getInventory(null).execute();
  }

  @Test
  public void testReplaceInventoryWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}";
    String replaceInventoryPath = "/v2/inventories/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the InventoryResourceDefinition model
    InventoryResourceDefinition inventoryResourceDefinitionModel = new InventoryResourceDefinition.Builder()
    .name("testString")
    .description("testString")
    .location("us-south")
    .resourceGroup("testString")
    .inventoriesIni("testString")
    .resourceQueries(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ReplaceInventoryOptions model
    ReplaceInventoryOptions replaceInventoryOptionsModel = new ReplaceInventoryOptions.Builder()
    .inventoryId("testString")
    .inventoryResourceDefinition(inventoryResourceDefinitionModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InventoryResourceRecord> response = schematics20ApiService.replaceInventory(replaceInventoryOptionsModel).execute();
    assertNotNull(response);
    InventoryResourceRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceInventoryPath);
  }

  // Test the replaceInventory operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceInventoryNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.replaceInventory(null).execute();
  }

  @Test
  public void testDeleteInventoryWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteInventoryPath = "/v2/inventories/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteInventoryOptions model
    DeleteInventoryOptions deleteInventoryOptionsModel = new DeleteInventoryOptions.Builder()
    .inventoryId("testString")
    .force(true)
    .propagate(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematics20ApiService.deleteInventory(deleteInventoryOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteInventoryPath);
  }

  // Test the deleteInventory operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteInventoryNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.deleteInventory(null).execute();
  }

  @Test
  public void testUpdateInventoryWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}";
    String updateInventoryPath = "/v2/inventories/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the InventoryResourceDefinition model
    InventoryResourceDefinition inventoryResourceDefinitionModel = new InventoryResourceDefinition.Builder()
    .name("testString")
    .description("testString")
    .location("us-south")
    .resourceGroup("testString")
    .inventoriesIni("testString")
    .resourceQueries(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the UpdateInventoryOptions model
    UpdateInventoryOptions updateInventoryOptionsModel = new UpdateInventoryOptions.Builder()
    .inventoryId("testString")
    .inventoryResourceDefinition(inventoryResourceDefinitionModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InventoryResourceRecord> response = schematics20ApiService.updateInventory(updateInventoryOptionsModel).execute();
    assertNotNull(response);
    InventoryResourceRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateInventoryPath);
  }

  // Test the updateInventory operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateInventoryNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.updateInventory(null).execute();
  }

  @Test
  public void testListResourceQueryWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"resource_queries\": [{\"type\": \"vsi\", \"name\": \"name\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"queries\": [{\"query_type\": \"workspaces\", \"query_condition\": [{\"name\": \"name\", \"value\": \"value\", \"description\": \"description\"}], \"query_select\": [\"querySelect\"]}]}]}";
    String listResourceQueryPath = "/v2/resources_query";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListResourceQueryOptions model
    ListResourceQueryOptions listResourceQueryOptionsModel = new ListResourceQueryOptions.Builder()
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .sort("testString")
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ResourceQueryRecordList> response = schematics20ApiService.listResourceQuery(listResourceQueryOptionsModel).execute();
    assertNotNull(response);
    ResourceQueryRecordList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listResourceQueryPath);
  }

  @Test
  public void testCreateResourceQueryWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"type\": \"vsi\", \"name\": \"name\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"queries\": [{\"query_type\": \"workspaces\", \"query_condition\": [{\"name\": \"name\", \"value\": \"value\", \"description\": \"description\"}], \"query_select\": [\"querySelect\"]}]}";
    String createResourceQueryPath = "/v2/resources_query";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ResourceQueryParam model
    ResourceQueryParam resourceQueryParamModel = new ResourceQueryParam.Builder()
    .name("testString")
    .value("testString")
    .description("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ResourceQuery model
    ResourceQuery resourceQueryModel = new ResourceQuery.Builder()
    .queryType("workspaces")
    .queryCondition(new java.util.ArrayList<ResourceQueryParam>(java.util.Arrays.asList(resourceQueryParamModel)))
    .querySelect(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ResourceQueryDefinition model
    ResourceQueryDefinition resourceQueryDefinitionModel = new ResourceQueryDefinition.Builder()
    .type("vsi")
    .name("testString")
    .queries(new java.util.ArrayList<ResourceQuery>(java.util.Arrays.asList(resourceQueryModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the CreateResourceQueryOptions model
    CreateResourceQueryOptions createResourceQueryOptionsModel = new CreateResourceQueryOptions.Builder()
    .resourceQueryDefinition(resourceQueryDefinitionModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ResourceQueryRecord> response = schematics20ApiService.createResourceQuery(createResourceQueryOptionsModel).execute();
    assertNotNull(response);
    ResourceQueryRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createResourceQueryPath);
  }

  // Test the createResourceQuery operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateResourceQueryNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.createResourceQuery(null).execute();
  }

  @Test
  public void testGetResourcesQueryWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"type\": \"vsi\", \"name\": \"name\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"queries\": [{\"query_type\": \"workspaces\", \"query_condition\": [{\"name\": \"name\", \"value\": \"value\", \"description\": \"description\"}], \"query_select\": [\"querySelect\"]}]}";
    String getResourcesQueryPath = "/v2/resources_query/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetResourcesQueryOptions model
    GetResourcesQueryOptions getResourcesQueryOptionsModel = new GetResourcesQueryOptions.Builder()
    .queryId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ResourceQueryRecord> response = schematics20ApiService.getResourcesQuery(getResourcesQueryOptionsModel).execute();
    assertNotNull(response);
    ResourceQueryRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getResourcesQueryPath);
  }

  // Test the getResourcesQuery operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetResourcesQueryNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getResourcesQuery(null).execute();
  }

  @Test
  public void testReplaceResourcesQueryWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"type\": \"vsi\", \"name\": \"name\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"queries\": [{\"query_type\": \"workspaces\", \"query_condition\": [{\"name\": \"name\", \"value\": \"value\", \"description\": \"description\"}], \"query_select\": [\"querySelect\"]}]}";
    String replaceResourcesQueryPath = "/v2/resources_query/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ResourceQueryParam model
    ResourceQueryParam resourceQueryParamModel = new ResourceQueryParam.Builder()
    .name("testString")
    .value("testString")
    .description("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ResourceQuery model
    ResourceQuery resourceQueryModel = new ResourceQuery.Builder()
    .queryType("workspaces")
    .queryCondition(new java.util.ArrayList<ResourceQueryParam>(java.util.Arrays.asList(resourceQueryParamModel)))
    .querySelect(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ResourceQueryDefinition model
    ResourceQueryDefinition resourceQueryDefinitionModel = new ResourceQueryDefinition.Builder()
    .type("vsi")
    .name("testString")
    .queries(new java.util.ArrayList<ResourceQuery>(java.util.Arrays.asList(resourceQueryModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ReplaceResourcesQueryOptions model
    ReplaceResourcesQueryOptions replaceResourcesQueryOptionsModel = new ReplaceResourcesQueryOptions.Builder()
    .queryId("testString")
    .resourceQueryDefinition(resourceQueryDefinitionModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ResourceQueryRecord> response = schematics20ApiService.replaceResourcesQuery(replaceResourcesQueryOptionsModel).execute();
    assertNotNull(response);
    ResourceQueryRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceResourcesQueryPath);
  }

  // Test the replaceResourcesQuery operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceResourcesQueryNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.replaceResourcesQuery(null).execute();
  }

  @Test
  public void testExecuteResourceQueryWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"response\": [{\"query_type\": \"workspaces\", \"query_condition\": [{\"name\": \"name\", \"value\": \"value\", \"description\": \"description\"}], \"query_select\": [\"querySelect\"], \"query_output\": [{\"name\": \"name\", \"value\": \"value\"}]}]}";
    String executeResourceQueryPath = "/v2/resources_query/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ExecuteResourceQueryOptions model
    ExecuteResourceQueryOptions executeResourceQueryOptionsModel = new ExecuteResourceQueryOptions.Builder()
    .queryId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ResourceQueryResponseRecord> response = schematics20ApiService.executeResourceQuery(executeResourceQueryOptionsModel).execute();
    assertNotNull(response);
    ResourceQueryResponseRecord responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, executeResourceQueryPath);
  }

  // Test the executeResourceQuery operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testExecuteResourceQueryNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.executeResourceQuery(null).execute();
  }

  @Test
  public void testDeleteResourcesQueryWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteResourcesQueryPath = "/v2/resources_query/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteResourcesQueryOptions model
    DeleteResourcesQueryOptions deleteResourcesQueryOptionsModel = new DeleteResourcesQueryOptions.Builder()
    .queryId("testString")
    .force(true)
    .propagate(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematics20ApiService.deleteResourcesQuery(deleteResourcesQueryOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteResourcesQueryPath);
  }

  // Test the deleteResourcesQuery operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteResourcesQueryNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.deleteResourcesQuery(null).execute();
  }

  @Test
  public void testGetDatasetVariableValueWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"value\": \"value\"}";
    String getDatasetVariableValuePath = "/v2/datasets/testString/values/testString/value";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDatasetVariableValueOptions model
    GetDatasetVariableValueOptions getDatasetVariableValueOptionsModel = new GetDatasetVariableValueOptions.Builder()
    .datasetId("testString")
    .varName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ValueResponse> response = schematics20ApiService.getDatasetVariableValue(getDatasetVariableValueOptionsModel).execute();
    assertNotNull(response);
    ValueResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDatasetVariableValuePath);
  }

  // Test the getDatasetVariableValue operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDatasetVariableValueNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getDatasetVariableValue(null).execute();
  }

  @Test
  public void testGetCredentialVariableValueWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"value\": \"value\"}";
    String getCredentialVariableValuePath = "/v2/credentials/testString/variables/testString/value";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetCredentialVariableValueOptions model
    GetCredentialVariableValueOptions getCredentialVariableValueOptionsModel = new GetCredentialVariableValueOptions.Builder()
    .credsId("testString")
    .varName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ValueResponse> response = schematics20ApiService.getCredentialVariableValue(getCredentialVariableValueOptionsModel).execute();
    assertNotNull(response);
    ValueResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCredentialVariableValuePath);
  }

  // Test the getCredentialVariableValue operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCredentialVariableValueNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getCredentialVariableValue(null).execute();
  }

  @Test
  public void testGetInventoryVariableValueWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"values\": [\"values\"]}";
    String getInventoryVariableValuePath = "/v2/inventories/testString/variables/testString/value";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetInventoryVariableValueOptions model
    GetInventoryVariableValueOptions getInventoryVariableValueOptionsModel = new GetInventoryVariableValueOptions.Builder()
    .inventoryId("testString")
    .varName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ValueListResponse> response = schematics20ApiService.getInventoryVariableValue(getInventoryVariableValueOptionsModel).execute();
    assertNotNull(response);
    ValueListResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getInventoryVariableValuePath);
  }

  // Test the getInventoryVariableValue operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetInventoryVariableValueNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getInventoryVariableValue(null).execute();
  }

  @Test
  public void testGetWorkspaceInputValueWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"value\": \"value\"}";
    String getWorkspaceInputValuePath = "/v2/workspaces/testString/inputs/testString/value";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceInputValueOptions model
    GetWorkspaceInputValueOptions getWorkspaceInputValueOptionsModel = new GetWorkspaceInputValueOptions.Builder()
    .workspaceId("testString")
    .varName("testString")
    .limit(Long.valueOf("1"))
    .offset(Long.valueOf("0"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ValueResponse> response = schematics20ApiService.getWorkspaceInputValue(getWorkspaceInputValueOptionsModel).execute();
    assertNotNull(response);
    ValueResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceInputValuePath);
  }

  // Test the getWorkspaceInputValue operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceInputValueNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getWorkspaceInputValue(null).execute();
  }

  @Test
  public void testGetWorkspaceOutputValueWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"value\": \"value\"}";
    String getWorkspaceOutputValuePath = "/v2/workspaces/testString/outputs/testString/value";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceOutputValueOptions model
    GetWorkspaceOutputValueOptions getWorkspaceOutputValueOptionsModel = new GetWorkspaceOutputValueOptions.Builder()
    .workspaceId("testString")
    .varName("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ValueResponse> response = schematics20ApiService.getWorkspaceOutputValue(getWorkspaceOutputValueOptionsModel).execute();
    assertNotNull(response);
    ValueResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceOutputValuePath);
  }

  // Test the getWorkspaceOutputValue operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceOutputValueNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getWorkspaceOutputValue(null).execute();
  }

  @Test
  public void testGetWorkspaceSettingsValueWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"value\": \"value\"}";
    String getWorkspaceSettingsValuePath = "/v2/workspaces/testString/settings/testString/value";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceSettingsValueOptions model
    GetWorkspaceSettingsValueOptions getWorkspaceSettingsValueOptionsModel = new GetWorkspaceSettingsValueOptions.Builder()
    .workspaceId("testString")
    .varName("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ValueResponse> response = schematics20ApiService.getWorkspaceSettingsValue(getWorkspaceSettingsValueOptionsModel).execute();
    assertNotNull(response);
    ValueResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceSettingsValuePath);
  }

  // Test the getWorkspaceSettingsValue operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceSettingsValueNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getWorkspaceSettingsValue(null).execute();
  }

  @Test
  public void testGetWorkspaceTemplateInputValueWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"value\": \"value\"}";
    String getWorkspaceTemplateInputValuePath = "/v2/workspaces/testString/templates/testString/inputs/testString/value";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceTemplateInputValueOptions model
    GetWorkspaceTemplateInputValueOptions getWorkspaceTemplateInputValueOptionsModel = new GetWorkspaceTemplateInputValueOptions.Builder()
    .workspaceId("testString")
    .templateId("testString")
    .varName("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ValueResponse> response = schematics20ApiService.getWorkspaceTemplateInputValue(getWorkspaceTemplateInputValueOptionsModel).execute();
    assertNotNull(response);
    ValueResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceTemplateInputValuePath);
  }

  // Test the getWorkspaceTemplateInputValue operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceTemplateInputValueNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getWorkspaceTemplateInputValue(null).execute();
  }

  @Test
  public void testGetWorkspaceTemplateOutputValueWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"value\": \"value\"}";
    String getWorkspaceTemplateOutputValuePath = "/v2/workspaces/testString/templates/testString/outputs/testString/value";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceTemplateOutputValueOptions model
    GetWorkspaceTemplateOutputValueOptions getWorkspaceTemplateOutputValueOptionsModel = new GetWorkspaceTemplateOutputValueOptions.Builder()
    .workspaceId("testString")
    .templateId("testString")
    .varName("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ValueResponse> response = schematics20ApiService.getWorkspaceTemplateOutputValue(getWorkspaceTemplateOutputValueOptionsModel).execute();
    assertNotNull(response);
    ValueResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceTemplateOutputValuePath);
  }

  // Test the getWorkspaceTemplateOutputValue operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceTemplateOutputValueNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getWorkspaceTemplateOutputValue(null).execute();
  }

  @Test
  public void testGetWorkspaceTemplateSettingValueWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"value\": \"value\"}";
    String getWorkspaceTemplateSettingValuePath = "/v2/workspaces/testString/templates/testString/settings/testString/value";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWorkspaceTemplateSettingValueOptions model
    GetWorkspaceTemplateSettingValueOptions getWorkspaceTemplateSettingValueOptionsModel = new GetWorkspaceTemplateSettingValueOptions.Builder()
    .workspaceId("testString")
    .templateId("testString")
    .varName("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ValueResponse> response = schematics20ApiService.getWorkspaceTemplateSettingValue(getWorkspaceTemplateSettingValueOptionsModel).execute();
    assertNotNull(response);
    ValueResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkspaceTemplateSettingValuePath);
  }

  // Test the getWorkspaceTemplateSettingValue operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkspaceTemplateSettingValueNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getWorkspaceTemplateSettingValue(null).execute();
  }

  @Test
  public void testGetJobWorkspaceInputValueWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"value\": \"value\"}";
    String getJobWorkspaceInputValuePath = "/v2/jobs/testString/workspaces/testString/inputs/testString/value";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetJobWorkspaceInputValueOptions model
    GetJobWorkspaceInputValueOptions getJobWorkspaceInputValueOptionsModel = new GetJobWorkspaceInputValueOptions.Builder()
    .jobId("testString")
    .workspaceId("testString")
    .varName("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ValueResponse> response = schematics20ApiService.getJobWorkspaceInputValue(getJobWorkspaceInputValueOptionsModel).execute();
    assertNotNull(response);
    ValueResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getJobWorkspaceInputValuePath);
  }

  // Test the getJobWorkspaceInputValue operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetJobWorkspaceInputValueNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getJobWorkspaceInputValue(null).execute();
  }

  @Test
  public void testGetJobWorkspaceOutputValueWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"value\": \"value\"}";
    String getJobWorkspaceOutputValuePath = "/v2/jobs/testString/workspaces/testString/outputs/testString/value";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetJobWorkspaceOutputValueOptions model
    GetJobWorkspaceOutputValueOptions getJobWorkspaceOutputValueOptionsModel = new GetJobWorkspaceOutputValueOptions.Builder()
    .jobId("testString")
    .workspaceId("testString")
    .varName("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ValueResponse> response = schematics20ApiService.getJobWorkspaceOutputValue(getJobWorkspaceOutputValueOptionsModel).execute();
    assertNotNull(response);
    ValueResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getJobWorkspaceOutputValuePath);
  }

  // Test the getJobWorkspaceOutputValue operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetJobWorkspaceOutputValueNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getJobWorkspaceOutputValue(null).execute();
  }

  @Test
  public void testGetJobWorkspaceSettingValueWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"value\": \"value\"}";
    String getJobWorkspaceSettingValuePath = "/v2/jobs/testString/workspaces/testString/settings/testString/value";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetJobWorkspaceSettingValueOptions model
    GetJobWorkspaceSettingValueOptions getJobWorkspaceSettingValueOptionsModel = new GetJobWorkspaceSettingValueOptions.Builder()
    .jobId("testString")
    .workspaceId("testString")
    .varName("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ValueResponse> response = schematics20ApiService.getJobWorkspaceSettingValue(getJobWorkspaceSettingValueOptionsModel).execute();
    assertNotNull(response);
    ValueResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getJobWorkspaceSettingValuePath);
  }

  // Test the getJobWorkspaceSettingValue operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetJobWorkspaceSettingValueNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getJobWorkspaceSettingValue(null).execute();
  }

  @Test
  public void testListTriggersWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"triggers\": [{\"name\": \"name\", \"type\": \"action\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"service_id\": \"VGhpcyBpcyBhbiBlbmNvZGVkIGJ5dGUgYXJyYXku\", \"apikey\": \"VGhpcyBpcyBhbiBlbmNvZGVkIGJ5dGUgYXJyYXku\", \"location\": \"us-south\", \"tags\": [\"tags\"], \"job_triggers\": [{\"event\": \"before | after\", \"job\": {\"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"command_parameter\": \"commandParameter\", \"command_options\": [\"commandOptions\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"tags\": [\"tags\"], \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"duration\": \"duration\", \"status\": {\"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"data\": {\"job_type\": \"repo_download_job\", \"workspace_job_data\": {\"workspace_name\": \"workspaceName\", \"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"template_data\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_data\": {\"action_name\": \"actionName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"inventory_record\": {\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}, \"materialized_inventory\": \"materializedInventory\"}, \"system_job_data\": {\"key_id\": \"keyId\", \"schematics_resource_id\": [\"schematicsResourceId\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_data\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"workitems\": [{\"command_object_id\": \"commandObjectId\", \"command_object_name\": \"commandObjectName\", \"layers\": \"layers\", \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_id\": \"jobId\", \"job_status\": \"job_pending\"}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"log_store_url\": \"logStoreUrl\", \"state_store_url\": \"stateStoreUrl\", \"results_url\": \"resultsUrl\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}], \"scheduled_triggers\": [{\"frequency\": \"daily | weekly\", \"time\": \"time in UTC\", \"day\": \"expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday\"}], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"trigger_id\": \"triggerId\", \"registered_by\": \"registeredBy\", \"registered_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"last_health_checked_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listTriggersPath = "/v2/settings/triggers";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListTriggersOptions model
    ListTriggersOptions listTriggersOptionsModel = new ListTriggersOptions.Builder()
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .sort("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TriggerList> response = schematics20ApiService.listTriggers(listTriggersOptionsModel).execute();
    assertNotNull(response);
    TriggerList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listTriggersPath);
  }

  @Test
  public void testCreateTriggerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"type\": \"action\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"service_id\": \"VGhpcyBpcyBhbiBlbmNvZGVkIGJ5dGUgYXJyYXku\", \"apikey\": \"VGhpcyBpcyBhbiBlbmNvZGVkIGJ5dGUgYXJyYXku\", \"location\": \"us-south\", \"tags\": [\"tags\"], \"job_triggers\": [{\"event\": \"before | after\", \"job\": {\"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"command_parameter\": \"commandParameter\", \"command_options\": [\"commandOptions\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"tags\": [\"tags\"], \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"duration\": \"duration\", \"status\": {\"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"data\": {\"job_type\": \"repo_download_job\", \"workspace_job_data\": {\"workspace_name\": \"workspaceName\", \"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"template_data\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_data\": {\"action_name\": \"actionName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"inventory_record\": {\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}, \"materialized_inventory\": \"materializedInventory\"}, \"system_job_data\": {\"key_id\": \"keyId\", \"schematics_resource_id\": [\"schematicsResourceId\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_data\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"workitems\": [{\"command_object_id\": \"commandObjectId\", \"command_object_name\": \"commandObjectName\", \"layers\": \"layers\", \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_id\": \"jobId\", \"job_status\": \"job_pending\"}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"log_store_url\": \"logStoreUrl\", \"state_store_url\": \"stateStoreUrl\", \"results_url\": \"resultsUrl\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}], \"scheduled_triggers\": [{\"frequency\": \"daily | weekly\", \"time\": \"time in UTC\", \"day\": \"expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday\"}], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"trigger_id\": \"triggerId\", \"registered_by\": \"registeredBy\", \"registered_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"last_health_checked_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createTriggerPath = "/v2/settings/triggers";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkitem model
    JobStatusWorkitem jobStatusWorkitemModel = new JobStatusWorkitem.Builder()
    .workspaceId("testString")
    .workspaceName("testString")
    .jobId("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusFlow model
    JobStatusFlow jobStatusFlowModel = new JobStatusFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .workitems(new java.util.ArrayList<JobStatusWorkitem>(java.util.Arrays.asList(jobStatusWorkitemModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusTemplate model
    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkspace model
    JobStatusWorkspace jobStatusWorkspaceModel = new JobStatusWorkspace.Builder()
    .workspaceName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .flowStatus(jobStatusFlowModel)
    .templateStatus(new java.util.ArrayList<JobStatusTemplate>(java.util.Arrays.asList(jobStatusTemplateModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusAction model
    JobStatusAction jobStatusActionModel = new JobStatusAction.Builder()
    .actionName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .bastionStatusCode("none")
    .bastionStatusMessage("testString")
    .targetsStatusCode("none")
    .targetsStatusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusSchematicsResources model
    JobStatusSchematicsResources jobStatusSchematicsResourcesModel = new JobStatusSchematicsResources.Builder()
    .statusCode("job_pending")
    .statusMessage("testString")
    .schematicsResourceId("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusSystem model
    JobStatusSystem jobStatusSystemModel = new JobStatusSystem.Builder()
    .systemStatusMessage("testString")
    .systemStatusCode("job_pending")
    .schematicsResourceStatus(new java.util.ArrayList<JobStatusSchematicsResources>(java.util.Arrays.asList(jobStatusSchematicsResourcesModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatus model
    JobStatus jobStatusModel = new JobStatus.Builder()
    .workspaceJobStatus(jobStatusWorkspaceModel)
    .actionJobStatus(jobStatusActionModel)
    .systemJobStatus(jobStatusSystemModel)
    .flowJobStatus(jobStatusFlowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataTemplate model
    JobDataTemplate jobDataTemplateModel = new JobDataTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkspace model
    JobDataWorkspace jobDataWorkspaceModel = new JobDataWorkspace.Builder()
    .workspaceName("testString")
    .flowId("testString")
    .flowName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .templateData(new java.util.ArrayList<JobDataTemplate>(java.util.Arrays.asList(jobDataTemplateModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the InventoryResourceRecord model
    InventoryResourceRecord inventoryResourceRecordModel = new InventoryResourceRecord.Builder()
    .name("testString")
    .description("testString")
    .location("us-south")
    .resourceGroup("testString")
    .inventoriesIni("testString")
    .resourceQueries(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataAction model
    JobDataAction jobDataActionModel = new JobDataAction.Builder()
    .actionName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .inventoryRecord(inventoryResourceRecordModel)
    .materializedInventory("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataSystem model
    JobDataSystem jobDataSystemModel = new JobDataSystem.Builder()
    .keyId("testString")
    .schematicsResourceId(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkItemLastJob model
    JobDataWorkItemLastJob jobDataWorkItemLastJobModel = new JobDataWorkItemLastJob.Builder()
    .commandObject("workspace")
    .commandObjectName("testString")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .jobId("testString")
    .jobStatus("job_pending")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkItem model
    JobDataWorkItem jobDataWorkItemModel = new JobDataWorkItem.Builder()
    .commandObjectId("testString")
    .commandObjectName("testString")
    .layers("testString")
    .sourceType("local")
    .source(externalSourceModel)
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .lastJob(jobDataWorkItemLastJobModel)
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataFlow model
    JobDataFlow jobDataFlowModel = new JobDataFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .workitems(new java.util.ArrayList<JobDataWorkItem>(java.util.Arrays.asList(jobDataWorkItemModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobData model
    JobData jobDataModel = new JobData.Builder()
    .jobType("repo_download_job")
    .workspaceJobData(jobDataWorkspaceModel)
    .actionJobData(jobDataActionModel)
    .systemJobData(jobDataSystemModel)
    .flowJobData(jobDataFlowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the BastionResourceDefinition model
    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
    .name("testString")
    .host("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryRepoDownloadJob model
    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryWorkspaceJob model
    JobLogSummaryWorkspaceJob jobLogSummaryWorkspaceJobModel = new JobLogSummaryWorkspaceJob.Builder()
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryWorkitems model
    JobLogSummaryWorkitems jobLogSummaryWorkitemsModel = new JobLogSummaryWorkitems.Builder()
    .workspaceId("testString")
    .jobId("testString")
    .logUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryFlowJob model
    JobLogSummaryFlowJob jobLogSummaryFlowJobModel = new JobLogSummaryFlowJob.Builder()
    .workitems(new java.util.ArrayList<JobLogSummaryWorkitems>(java.util.Arrays.asList(jobLogSummaryWorkitemsModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryActionJobRecap model
    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
    .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .ok(Double.valueOf("72.5"))
    .changed(Double.valueOf("72.5"))
    .failed(Double.valueOf("72.5"))
    .skipped(Double.valueOf("72.5"))
    .unreachable(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryActionJob model
    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
    .recap(jobLogSummaryActionJobRecapModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummarySystemJob model
    JobLogSummarySystemJob jobLogSummarySystemJobModel = new JobLogSummarySystemJob.Builder()
    .success(Double.valueOf("72.5"))
    .failed(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummary model
    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
    .jobType("repo_download_job")
    .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
    .workspaceJob(jobLogSummaryWorkspaceJobModel)
    .flowJob(jobLogSummaryFlowJobModel)
    .actionJob(jobLogSummaryActionJobModel)
    .systemJob(jobLogSummarySystemJobModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the Job model
    Job jobModel = new Job.Builder()
    .commandObject("workspace")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .commandParameter("testString")
    .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .location("us-south")
    .status(jobStatusModel)
    .data(jobDataModel)
    .bastion(bastionResourceDefinitionModel)
    .logSummary(jobLogSummaryModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TriggerJob model
    TriggerJob triggerJobModel = new TriggerJob.Builder()
    .event("before | after")
    .job(jobModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TriggerScheduled model
    TriggerScheduled triggerScheduledModel = new TriggerScheduled.Builder()
    .frequency("daily | weekly")
    .time("time in UTC")
    .day("expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday")
    .add("foo", "testString")
    .build();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Trigger model
    Trigger triggerModel = new Trigger.Builder()
    .name("testString")
    .type("action")
    .description("testString")
    .resourceGroup("testString")
    .serviceId(TestUtilities.createMockByteArray("This is a mock byte array value."))
    .apikey(TestUtilities.createMockByteArray("This is a mock byte array value."))
    .location("us-south")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .jobTriggers(new java.util.ArrayList<TriggerJob>(java.util.Arrays.asList(triggerJobModel)))
    .scheduledTriggers(new java.util.ArrayList<TriggerScheduled>(java.util.Arrays.asList(triggerScheduledModel)))
    .userState(userStateModel)
    .sysLock(systemLockModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the CreateTriggerOptions model
    CreateTriggerOptions createTriggerOptionsModel = new CreateTriggerOptions.Builder()
    .trigger(triggerModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Trigger> response = schematics20ApiService.createTrigger(createTriggerOptionsModel).execute();
    assertNotNull(response);
    Trigger responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createTriggerPath);
  }

  // Test the createTrigger operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateTriggerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.createTrigger(null).execute();
  }

  @Test
  public void testGetTriggerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"type\": \"action\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"service_id\": \"VGhpcyBpcyBhbiBlbmNvZGVkIGJ5dGUgYXJyYXku\", \"apikey\": \"VGhpcyBpcyBhbiBlbmNvZGVkIGJ5dGUgYXJyYXku\", \"location\": \"us-south\", \"tags\": [\"tags\"], \"job_triggers\": [{\"event\": \"before | after\", \"job\": {\"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"command_parameter\": \"commandParameter\", \"command_options\": [\"commandOptions\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"tags\": [\"tags\"], \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"duration\": \"duration\", \"status\": {\"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"data\": {\"job_type\": \"repo_download_job\", \"workspace_job_data\": {\"workspace_name\": \"workspaceName\", \"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"template_data\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_data\": {\"action_name\": \"actionName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"inventory_record\": {\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}, \"materialized_inventory\": \"materializedInventory\"}, \"system_job_data\": {\"key_id\": \"keyId\", \"schematics_resource_id\": [\"schematicsResourceId\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_data\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"workitems\": [{\"command_object_id\": \"commandObjectId\", \"command_object_name\": \"commandObjectName\", \"layers\": \"layers\", \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_id\": \"jobId\", \"job_status\": \"job_pending\"}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"log_store_url\": \"logStoreUrl\", \"state_store_url\": \"stateStoreUrl\", \"results_url\": \"resultsUrl\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}], \"scheduled_triggers\": [{\"frequency\": \"daily | weekly\", \"time\": \"time in UTC\", \"day\": \"expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday\"}], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"trigger_id\": \"triggerId\", \"registered_by\": \"registeredBy\", \"registered_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"last_health_checked_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getTriggerPath = "/v2/settings/triggers/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetTriggerOptions model
    GetTriggerOptions getTriggerOptionsModel = new GetTriggerOptions.Builder()
    .triggerId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Trigger> response = schematics20ApiService.getTrigger(getTriggerOptionsModel).execute();
    assertNotNull(response);
    Trigger responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getTriggerPath);
  }

  // Test the getTrigger operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetTriggerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getTrigger(null).execute();
  }

  @Test
  public void testReplaceTriggerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"type\": \"action\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"service_id\": \"VGhpcyBpcyBhbiBlbmNvZGVkIGJ5dGUgYXJyYXku\", \"apikey\": \"VGhpcyBpcyBhbiBlbmNvZGVkIGJ5dGUgYXJyYXku\", \"location\": \"us-south\", \"tags\": [\"tags\"], \"job_triggers\": [{\"event\": \"before | after\", \"job\": {\"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"command_parameter\": \"commandParameter\", \"command_options\": [\"commandOptions\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"tags\": [\"tags\"], \"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"duration\": \"duration\", \"status\": {\"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"data\": {\"job_type\": \"repo_download_job\", \"workspace_job_data\": {\"workspace_name\": \"workspaceName\", \"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"template_data\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_data\": {\"action_name\": \"actionName\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"inventory_record\": {\"name\": \"name\", \"id\": \"id\", \"description\": \"description\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"inventories_ini\": \"inventoriesIni\", \"resource_queries\": [\"resourceQueries\"]}, \"materialized_inventory\": \"materializedInventory\"}, \"system_job_data\": {\"key_id\": \"keyId\", \"schematics_resource_id\": [\"schematicsResourceId\"], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_data\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"workitems\": [{\"command_object_id\": \"commandObjectId\", \"command_object_name\": \"commandObjectName\", \"layers\": \"layers\", \"source_type\": \"local\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_id\": \"jobId\", \"job_status\": \"job_pending\"}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"bastion\": {\"name\": \"name\", \"host\": \"host\"}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"log_store_url\": \"logStoreUrl\", \"state_store_url\": \"stateStoreUrl\", \"results_url\": \"resultsUrl\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}], \"scheduled_triggers\": [{\"frequency\": \"daily | weekly\", \"time\": \"time in UTC\", \"day\": \"expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday\"}], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"trigger_id\": \"triggerId\", \"registered_by\": \"registeredBy\", \"registered_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"last_health_checked_at\": \"2019-01-01T12:00:00.000Z\"}";
    String replaceTriggerPath = "/v2/settings/triggers/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkitem model
    JobStatusWorkitem jobStatusWorkitemModel = new JobStatusWorkitem.Builder()
    .workspaceId("testString")
    .workspaceName("testString")
    .jobId("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusFlow model
    JobStatusFlow jobStatusFlowModel = new JobStatusFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .workitems(new java.util.ArrayList<JobStatusWorkitem>(java.util.Arrays.asList(jobStatusWorkitemModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusTemplate model
    JobStatusTemplate jobStatusTemplateModel = new JobStatusTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .statusCode("job_pending")
    .statusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusWorkspace model
    JobStatusWorkspace jobStatusWorkspaceModel = new JobStatusWorkspace.Builder()
    .workspaceName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .flowStatus(jobStatusFlowModel)
    .templateStatus(new java.util.ArrayList<JobStatusTemplate>(java.util.Arrays.asList(jobStatusTemplateModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusAction model
    JobStatusAction jobStatusActionModel = new JobStatusAction.Builder()
    .actionName("testString")
    .statusCode("job_pending")
    .statusMessage("testString")
    .bastionStatusCode("none")
    .bastionStatusMessage("testString")
    .targetsStatusCode("none")
    .targetsStatusMessage("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusSchematicsResources model
    JobStatusSchematicsResources jobStatusSchematicsResourcesModel = new JobStatusSchematicsResources.Builder()
    .statusCode("job_pending")
    .statusMessage("testString")
    .schematicsResourceId("testString")
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatusSystem model
    JobStatusSystem jobStatusSystemModel = new JobStatusSystem.Builder()
    .systemStatusMessage("testString")
    .systemStatusCode("job_pending")
    .schematicsResourceStatus(new java.util.ArrayList<JobStatusSchematicsResources>(java.util.Arrays.asList(jobStatusSchematicsResourcesModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobStatus model
    JobStatus jobStatusModel = new JobStatus.Builder()
    .workspaceJobStatus(jobStatusWorkspaceModel)
    .actionJobStatus(jobStatusActionModel)
    .systemJobStatus(jobStatusSystemModel)
    .flowJobStatus(jobStatusFlowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataTemplate model
    JobDataTemplate jobDataTemplateModel = new JobDataTemplate.Builder()
    .templateId("testString")
    .templateName("testString")
    .flowIndex(Long.valueOf("26"))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkspace model
    JobDataWorkspace jobDataWorkspaceModel = new JobDataWorkspace.Builder()
    .workspaceName("testString")
    .flowId("testString")
    .flowName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .templateData(new java.util.ArrayList<JobDataTemplate>(java.util.Arrays.asList(jobDataTemplateModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the InventoryResourceRecord model
    InventoryResourceRecord inventoryResourceRecordModel = new InventoryResourceRecord.Builder()
    .name("testString")
    .description("testString")
    .location("us-south")
    .resourceGroup("testString")
    .inventoriesIni("testString")
    .resourceQueries(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataAction model
    JobDataAction jobDataActionModel = new JobDataAction.Builder()
    .actionName("testString")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .inventoryRecord(inventoryResourceRecordModel)
    .materializedInventory("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataSystem model
    JobDataSystem jobDataSystemModel = new JobDataSystem.Builder()
    .keyId("testString")
    .schematicsResourceId(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkItemLastJob model
    JobDataWorkItemLastJob jobDataWorkItemLastJobModel = new JobDataWorkItemLastJob.Builder()
    .commandObject("workspace")
    .commandObjectName("testString")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .jobId("testString")
    .jobStatus("job_pending")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataWorkItem model
    JobDataWorkItem jobDataWorkItemModel = new JobDataWorkItem.Builder()
    .commandObjectId("testString")
    .commandObjectName("testString")
    .layers("testString")
    .sourceType("local")
    .source(externalSourceModel)
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .lastJob(jobDataWorkItemLastJobModel)
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobDataFlow model
    JobDataFlow jobDataFlowModel = new JobDataFlow.Builder()
    .flowId("testString")
    .flowName("testString")
    .workitems(new java.util.ArrayList<JobDataWorkItem>(java.util.Arrays.asList(jobDataWorkItemModel)))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobData model
    JobData jobDataModel = new JobData.Builder()
    .jobType("repo_download_job")
    .workspaceJobData(jobDataWorkspaceModel)
    .actionJobData(jobDataActionModel)
    .systemJobData(jobDataSystemModel)
    .flowJobData(jobDataFlowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the BastionResourceDefinition model
    BastionResourceDefinition bastionResourceDefinitionModel = new BastionResourceDefinition.Builder()
    .name("testString")
    .host("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryRepoDownloadJob model
    JobLogSummaryRepoDownloadJob jobLogSummaryRepoDownloadJobModel = new JobLogSummaryRepoDownloadJob.Builder()
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryWorkspaceJob model
    JobLogSummaryWorkspaceJob jobLogSummaryWorkspaceJobModel = new JobLogSummaryWorkspaceJob.Builder()
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryWorkitems model
    JobLogSummaryWorkitems jobLogSummaryWorkitemsModel = new JobLogSummaryWorkitems.Builder()
    .workspaceId("testString")
    .jobId("testString")
    .logUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryFlowJob model
    JobLogSummaryFlowJob jobLogSummaryFlowJobModel = new JobLogSummaryFlowJob.Builder()
    .workitems(new java.util.ArrayList<JobLogSummaryWorkitems>(java.util.Arrays.asList(jobLogSummaryWorkitemsModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryActionJobRecap model
    JobLogSummaryActionJobRecap jobLogSummaryActionJobRecapModel = new JobLogSummaryActionJobRecap.Builder()
    .target(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .ok(Double.valueOf("72.5"))
    .changed(Double.valueOf("72.5"))
    .failed(Double.valueOf("72.5"))
    .skipped(Double.valueOf("72.5"))
    .unreachable(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummaryActionJob model
    JobLogSummaryActionJob jobLogSummaryActionJobModel = new JobLogSummaryActionJob.Builder()
    .recap(jobLogSummaryActionJobRecapModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummarySystemJob model
    JobLogSummarySystemJob jobLogSummarySystemJobModel = new JobLogSummarySystemJob.Builder()
    .success(Double.valueOf("72.5"))
    .failed(Double.valueOf("72.5"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the JobLogSummary model
    JobLogSummary jobLogSummaryModel = new JobLogSummary.Builder()
    .jobType("repo_download_job")
    .repoDownloadJob(jobLogSummaryRepoDownloadJobModel)
    .workspaceJob(jobLogSummaryWorkspaceJobModel)
    .flowJob(jobLogSummaryFlowJobModel)
    .actionJob(jobLogSummaryActionJobModel)
    .systemJob(jobLogSummarySystemJobModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the Job model
    Job jobModel = new Job.Builder()
    .commandObject("workspace")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .commandParameter("testString")
    .commandOptions(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .location("us-south")
    .status(jobStatusModel)
    .data(jobDataModel)
    .bastion(bastionResourceDefinitionModel)
    .logSummary(jobLogSummaryModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TriggerJob model
    TriggerJob triggerJobModel = new TriggerJob.Builder()
    .event("before | after")
    .job(jobModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TriggerScheduled model
    TriggerScheduled triggerScheduledModel = new TriggerScheduled.Builder()
    .frequency("daily | weekly")
    .time("time in UTC")
    .day("expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday")
    .add("foo", "testString")
    .build();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Trigger model
    Trigger triggerModel = new Trigger.Builder()
    .name("testString")
    .type("action")
    .description("testString")
    .resourceGroup("testString")
    .serviceId(TestUtilities.createMockByteArray("This is a mock byte array value."))
    .apikey(TestUtilities.createMockByteArray("This is a mock byte array value."))
    .location("us-south")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .jobTriggers(new java.util.ArrayList<TriggerJob>(java.util.Arrays.asList(triggerJobModel)))
    .scheduledTriggers(new java.util.ArrayList<TriggerScheduled>(java.util.Arrays.asList(triggerScheduledModel)))
    .userState(userStateModel)
    .sysLock(systemLockModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the ReplaceTriggerOptions model
    ReplaceTriggerOptions replaceTriggerOptionsModel = new ReplaceTriggerOptions.Builder()
    .triggerId("testString")
    .trigger(triggerModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Trigger> response = schematics20ApiService.replaceTrigger(replaceTriggerOptionsModel).execute();
    assertNotNull(response);
    Trigger responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceTriggerPath);
  }

  // Test the replaceTrigger operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceTriggerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.replaceTrigger(null).execute();
  }

  @Test
  public void testDeleteTriggerWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteTriggerPath = "/v2/settings/triggers/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteTriggerOptions model
    DeleteTriggerOptions deleteTriggerOptionsModel = new DeleteTriggerOptions.Builder()
    .triggerId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematics20ApiService.deleteTrigger(deleteTriggerOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteTriggerPath);
  }

  // Test the deleteTrigger operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteTriggerNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.deleteTrigger(null).execute();
  }

  @Test
  public void testListWebhookWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"hooks\": [{\"command_name\": \"workspace_plan\", \"hook_type\": \"hook\", \"hook_site\": \"before\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"hook_endpoint_url\": \"hookEndpointUrl\", \"service_id\": \"serviceId\", \"apikey\": \"apikey\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"ignore_inflight_operations\": true, \"hook_id\": \"hookId\", \"registered_by\": \"registeredBy\", \"registered_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"last_health_checked_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listWebhookPath = "/v2/settings/hooks";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListWebhookOptions model
    ListWebhookOptions listWebhookOptionsModel = new ListWebhookOptions.Builder()
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .sort("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WebHookList> response = schematics20ApiService.listWebhook(listWebhookOptionsModel).execute();
    assertNotNull(response);
    WebHookList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listWebhookPath);
  }

  @Test
  public void testCreateWebhookWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"command_name\": \"workspace_plan\", \"hook_type\": \"hook\", \"hook_site\": \"before\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"hook_endpoint_url\": \"hookEndpointUrl\", \"service_id\": \"serviceId\", \"apikey\": \"apikey\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"ignore_inflight_operations\": true, \"hook_id\": \"hookId\", \"registered_by\": \"registeredBy\", \"registered_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"last_health_checked_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createWebhookPath = "/v2/settings/hooks";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the WebHook model
    WebHook webHookModel = new WebHook.Builder()
    .commandName("workspace_plan")
    .hookType("hook")
    .hookSite("before")
    .location("us-south")
    .resourceGroup("testString")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .hookEndpointUrl("testString")
    .serviceId("testString")
    .apikey("testString")
    .userState(userStateModel)
    .ignoreInflightOperations(true)
    .sysLock(systemLockModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the CreateWebhookOptions model
    CreateWebhookOptions createWebhookOptionsModel = new CreateWebhookOptions.Builder()
    .webHook(webHookModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WebHook> response = schematics20ApiService.createWebhook(createWebhookOptionsModel).execute();
    assertNotNull(response);
    WebHook responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createWebhookPath);
  }

  // Test the createWebhook operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateWebhookNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.createWebhook(null).execute();
  }

  @Test
  public void testGetWebhookWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"command_name\": \"workspace_plan\", \"hook_type\": \"hook\", \"hook_site\": \"before\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"hook_endpoint_url\": \"hookEndpointUrl\", \"service_id\": \"serviceId\", \"apikey\": \"apikey\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"ignore_inflight_operations\": true, \"hook_id\": \"hookId\", \"registered_by\": \"registeredBy\", \"registered_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"last_health_checked_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getWebhookPath = "/v2/settings/hooks/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetWebhookOptions model
    GetWebhookOptions getWebhookOptionsModel = new GetWebhookOptions.Builder()
    .hookId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WebHook> response = schematics20ApiService.getWebhook(getWebhookOptionsModel).execute();
    assertNotNull(response);
    WebHook responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWebhookPath);
  }

  // Test the getWebhook operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWebhookNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getWebhook(null).execute();
  }

  @Test
  public void testReplaceWebhookWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"command_name\": \"workspace_plan\", \"hook_type\": \"hook\", \"hook_site\": \"before\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"hook_endpoint_url\": \"hookEndpointUrl\", \"service_id\": \"serviceId\", \"apikey\": \"apikey\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"ignore_inflight_operations\": true, \"hook_id\": \"hookId\", \"registered_by\": \"registeredBy\", \"registered_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"last_health_checked_at\": \"2019-01-01T12:00:00.000Z\"}";
    String replaceWebhookPath = "/v2/settings/hooks/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the WebHook model
    WebHook webHookModel = new WebHook.Builder()
    .commandName("workspace_plan")
    .hookType("hook")
    .hookSite("before")
    .location("us-south")
    .resourceGroup("testString")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .hookEndpointUrl("testString")
    .serviceId("testString")
    .apikey("testString")
    .userState(userStateModel)
    .ignoreInflightOperations(true)
    .sysLock(systemLockModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the ReplaceWebhookOptions model
    ReplaceWebhookOptions replaceWebhookOptionsModel = new ReplaceWebhookOptions.Builder()
    .hookId("testString")
    .webHook(webHookModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<WebHook> response = schematics20ApiService.replaceWebhook(replaceWebhookOptionsModel).execute();
    assertNotNull(response);
    WebHook responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceWebhookPath);
  }

  // Test the replaceWebhook operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceWebhookNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.replaceWebhook(null).execute();
  }

  @Test
  public void testDeleteWebhookWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteWebhookPath = "/v2/settings/hooks/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteWebhookOptions model
    DeleteWebhookOptions deleteWebhookOptionsModel = new DeleteWebhookOptions.Builder()
    .hookId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematics20ApiService.deleteWebhook(deleteWebhookOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteWebhookPath);
  }

  // Test the deleteWebhook operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteWebhookNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.deleteWebhook(null).execute();
  }

  @Test
  public void testGetPrivateClusterWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"clusters\": [{\"cluster_id\": \"clusterId\", \"kube_config\": \"kubeConfig\", \"tags\": [\"tags\"], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"registered_by\": \"registeredBy\", \"registered_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"cluster_health\": \"active\", \"last_health_checked_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String getPrivateClusterPath = "/v2/settings/private_clusters";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetPrivateClusterOptions model
    GetPrivateClusterOptions getPrivateClusterOptionsModel = new GetPrivateClusterOptions();

    // Invoke operation with valid options model (positive test)
    Response<PrivateClusterList> response = schematics20ApiService.getPrivateCluster(getPrivateClusterOptionsModel).execute();
    assertNotNull(response);
    PrivateClusterList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getPrivateClusterPath);
  }

  @Test
  public void testCreatePrivateClusterWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"cluster_id\": \"clusterId\", \"kube_config\": \"kubeConfig\", \"tags\": [\"tags\"], \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"registered_by\": \"registeredBy\", \"registered_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"cluster_health\": \"active\", \"last_health_checked_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createPrivateClusterPath = "/v2/settings/private_clusters";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the PrivateCluster model
    PrivateCluster privateClusterModel = new PrivateCluster.Builder()
    .clusterId("testString")
    .kubeConfig("testString")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .userState(userStateModel)
    .registeredBy("testString")
    .registeredAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .updatedBy("testString")
    .sysLock(systemLockModel)
    .clusterHealth("active")
    .lastHealthCheckedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the CreatePrivateClusterOptions model
    CreatePrivateClusterOptions createPrivateClusterOptionsModel = new CreatePrivateClusterOptions.Builder()
    .privateCluster(privateClusterModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PrivateCluster> response = schematics20ApiService.createPrivateCluster(createPrivateClusterOptionsModel).execute();
    assertNotNull(response);
    PrivateCluster responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createPrivateClusterPath);
  }

  // Test the createPrivateCluster operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreatePrivateClusterNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.createPrivateCluster(null).execute();
  }

  @Test
  public void testDeletePrivateClusterWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deletePrivateClusterPath = "/v2/settings/private_clusters";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeletePrivateClusterOptions model
    DeletePrivateClusterOptions deletePrivateClusterOptionsModel = new DeletePrivateClusterOptions();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematics20ApiService.deletePrivateCluster(deletePrivateClusterOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deletePrivateClusterPath);
  }

  @Test
  public void testListAdapterWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"adapters\": [{\"adapter_name\": \"adapterName\", \"adapter_type\": \"scm_adapter\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"adapter_endpoint_url\": \"adapterEndpointUrl\", \"service_id\": \"serviceId\", \"apikey\": \"apikey\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"ignore_inflight_operations\": true, \"adapter_id\": \"adapterId\", \"registered_by\": \"registeredBy\", \"registered_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"adapter_health\": \"active\", \"last_health_checked_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listAdapterPath = "/v2/settings/adapters";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListAdapterOptions model
    ListAdapterOptions listAdapterOptionsModel = new ListAdapterOptions.Builder()
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .sort("testString")
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<AdapterList> response = schematics20ApiService.listAdapter(listAdapterOptionsModel).execute();
    assertNotNull(response);
    AdapterList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listAdapterPath);
  }

  @Test
  public void testCreateAdapterWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"adapter_name\": \"adapterName\", \"adapter_type\": \"scm_adapter\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"adapter_endpoint_url\": \"adapterEndpointUrl\", \"service_id\": \"serviceId\", \"apikey\": \"apikey\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"ignore_inflight_operations\": true, \"adapter_id\": \"adapterId\", \"registered_by\": \"registeredBy\", \"registered_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"adapter_health\": \"active\", \"last_health_checked_at\": \"2019-01-01T12:00:00.000Z\"}";
    String createAdapterPath = "/v2/settings/adapters";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Adapter model
    Adapter adapterModel = new Adapter.Builder()
    .adapterName("testString")
    .adapterType("scm_adapter")
    .location("us-south")
    .resourceGroup("testString")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .adapterEndpointUrl("testString")
    .serviceId("testString")
    .apikey("testString")
    .userState(userStateModel)
    .ignoreInflightOperations(true)
    .adapterId("testString")
    .registeredBy("testString")
    .registeredAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .updatedBy("testString")
    .sysLock(systemLockModel)
    .adapterHealth("active")
    .lastHealthCheckedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the CreateAdapterOptions model
    CreateAdapterOptions createAdapterOptionsModel = new CreateAdapterOptions.Builder()
    .adapter(adapterModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Adapter> response = schematics20ApiService.createAdapter(createAdapterOptionsModel).execute();
    assertNotNull(response);
    Adapter responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createAdapterPath);
  }

  // Test the createAdapter operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateAdapterNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.createAdapter(null).execute();
  }

  @Test
  public void testGetAdapterWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"adapter_name\": \"adapterName\", \"adapter_type\": \"scm_adapter\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"adapter_endpoint_url\": \"adapterEndpointUrl\", \"service_id\": \"serviceId\", \"apikey\": \"apikey\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"ignore_inflight_operations\": true, \"adapter_id\": \"adapterId\", \"registered_by\": \"registeredBy\", \"registered_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"adapter_health\": \"active\", \"last_health_checked_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getAdapterPath = "/v2/settings/adapters/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetAdapterOptions model
    GetAdapterOptions getAdapterOptionsModel = new GetAdapterOptions.Builder()
    .adapterId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Adapter> response = schematics20ApiService.getAdapter(getAdapterOptionsModel).execute();
    assertNotNull(response);
    Adapter responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAdapterPath);
  }

  // Test the getAdapter operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAdapterNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getAdapter(null).execute();
  }

  @Test
  public void testReplaceAdapterWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"adapter_name\": \"adapterName\", \"adapter_type\": \"scm_adapter\", \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"adapter_endpoint_url\": \"adapterEndpointUrl\", \"service_id\": \"serviceId\", \"apikey\": \"apikey\", \"user_state\": {\"state\": \"draft\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"ignore_inflight_operations\": true, \"adapter_id\": \"adapterId\", \"registered_by\": \"registeredBy\", \"registered_at\": \"2019-01-01T12:00:00.000Z\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"adapter_health\": \"active\", \"last_health_checked_at\": \"2019-01-01T12:00:00.000Z\"}";
    String replaceAdapterPath = "/v2/settings/adapters/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UserState model
    UserState userStateModel = new UserState.Builder()
    .state("draft")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Adapter model
    Adapter adapterModel = new Adapter.Builder()
    .adapterName("testString")
    .adapterType("scm_adapter")
    .location("us-south")
    .resourceGroup("testString")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .adapterEndpointUrl("testString")
    .serviceId("testString")
    .apikey("testString")
    .userState(userStateModel)
    .ignoreInflightOperations(true)
    .adapterId("testString")
    .registeredBy("testString")
    .registeredAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .updatedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .updatedBy("testString")
    .sysLock(systemLockModel)
    .adapterHealth("active")
    .lastHealthCheckedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ReplaceAdapterOptions model
    ReplaceAdapterOptions replaceAdapterOptionsModel = new ReplaceAdapterOptions.Builder()
    .adapterId("testString")
    .adapter(adapterModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Adapter> response = schematics20ApiService.replaceAdapter(replaceAdapterOptionsModel).execute();
    assertNotNull(response);
    Adapter responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceAdapterPath);
  }

  // Test the replaceAdapter operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceAdapterNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.replaceAdapter(null).execute();
  }

  @Test
  public void testDeleteAdapterWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteAdapterPath = "/v2/settings/adapters/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteAdapterOptions model
    DeleteAdapterOptions deleteAdapterOptionsModel = new DeleteAdapterOptions.Builder()
    .adapterId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematics20ApiService.deleteAdapter(deleteAdapterOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteAdapterPath);
  }

  // Test the deleteAdapter operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteAdapterNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.deleteAdapter(null).execute();
  }

  @Test
  public void testListConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"connections\": [{\"name\": \"name\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"source_type\": \"git_hub\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\"}]}";
    String listConnectionPath = "/v2/settings/connections";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListConnectionOptions model
    ListConnectionOptions listConnectionOptionsModel = new ListConnectionOptions.Builder()
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .sort("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ConnectionList> response = schematics20ApiService.listConnection(listConnectionOptionsModel).execute();
    assertNotNull(response);
    ConnectionList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listConnectionPath);
  }

  @Test
  public void testCreateConnectionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"connection_details\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"connection_secrets\": {\"type\": \"apikey\", \"apikey\": {\"key\": \"key\"}}, \"id\": \"id\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\"}";
    String createConnectionPath = "/v2/settings/connections";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the ConnectionSecretApikey model
    ConnectionSecretApikey connectionSecretApikeyModel = new ConnectionSecretApikey.Builder()
    .key("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ConnectionSecret model
    ConnectionSecret connectionSecretModel = new ConnectionSecret.Builder()
    .type("apikey")
    .apikey(connectionSecretApikeyModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the Connection model
    Connection connectionModel = new Connection.Builder()
    .name("testString")
    .description("testString")
    .resourceGroup("testString")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .connectionDetails(externalSourceModel)
    .connectionSecrets(connectionSecretModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the CreateConnectionOptions model
    CreateConnectionOptions createConnectionOptionsModel = new CreateConnectionOptions.Builder()
    .connection(connectionModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Connection> response = schematics20ApiService.createConnection(createConnectionOptionsModel).execute();
    assertNotNull(response);
    Connection responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createConnectionPath);
  }

  // Test the createConnection operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateConnectionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.createConnection(null).execute();
  }

  @Test
  public void testListDatasourcesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"datasources\": [{\"name\": \"name\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"data_source\": \"dataSource\", \"connection\": \"connection\", \"id\": \"id\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\"}]}";
    String listDatasourcesPath = "/v2/settings/datasources";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListDatasourcesOptions model
    ListDatasourcesOptions listDatasourcesOptionsModel = new ListDatasourcesOptions.Builder()
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .sort("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DatasourceList> response = schematics20ApiService.listDatasources(listDatasourcesOptionsModel).execute();
    assertNotNull(response);
    DatasourceList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDatasourcesPath);
  }

  @Test
  public void testCreateDatasourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"source_type\": \"git\", \"data_source\": \"dataSource\", \"connection\": \"connection\", \"replica_enabled\": true, \"replica_invalidation_frequency\": \"hourly\", \"id\": \"id\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\"}";
    String createDatasourcePath = "/v2/settings/datasources";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the Datasource model
    Datasource datasourceModel = new Datasource.Builder()
    .name("testString")
    .description("testString")
    .resourceGroup("testString")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .sourceType("git")
    .dataSource("testString")
    .connection("testString")
    .replicaEnabled(true)
    .replicaInvalidationFrequency("hourly")
    .add("foo", "testString")
    .build();

    // Construct an instance of the CreateDatasourceOptions model
    CreateDatasourceOptions createDatasourceOptionsModel = new CreateDatasourceOptions.Builder()
    .datasource(datasourceModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Datasource> response = schematics20ApiService.createDatasource(createDatasourceOptionsModel).execute();
    assertNotNull(response);
    Datasource responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDatasourcePath);
  }

  // Test the createDatasource operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDatasourceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.createDatasource(null).execute();
  }

  @Test
  public void testListCartWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"cart\": [{\"name\": \"MySatelliteLocation\", \"description\": \"Creates satellite location in AWS\", \"service_name\": \"SatelliteLocation\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"location\": \"us-south\", \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"user_state\": {\"state\": \"Order_Create_Init\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}}]}";
    String listCartPath = "/v2/cart";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListCartOptions model
    ListCartOptions listCartOptionsModel = new ListCartOptions.Builder()
    .service("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CartOrderList> response = schematics20ApiService.listCart(listCartOptionsModel).execute();
    assertNotNull(response);
    CartOrderList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("service"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listCartPath);
  }

  // Test the listCart operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListCartNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.listCart(null).execute();
  }

  @Test
  public void testCreateCartOrderWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"MySatelliteLocation\", \"description\": \"Creates satellite location in AWS\", \"tags\": [\"tags\"], \"cart_items\": [{\"name\": \"AWS Satellite\", \"description\": \"Create satellite location in AWS\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"target\": {\"cluster_id\": \"clusterId\", \"cluster_name\": \"clusterName\", \"entitlement_key\": {\"mapKey\": \"anyValue\"}, \"namespace\": \"namespace\", \"region\": \"region\", \"resource_group_id\": \"resourceGroupId\"}, \"operation\": \"install\", \"service_data\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"mapping\": [{\"type\": \"type\", \"input_param_name\": \"inputParamName\", \"output_param_name\": \"outputParamName\"}]}], \"catalog_id\": \"catalogId\", \"offering_id\": \"offeringId\", \"owning_account\": \"owningAccount\", \"owning_account_crn\": \"owningAccountCrn\", \"offering_kind_id\": \"offeringKindId\", \"offering_target_kind\": \"offeringTargetKind\", \"offering_version_id\": \"offeringVersionId\", \"offering_kind\": \"offeringKind\", \"offering_fulfilment_kind\": \"offeringFulfilmentKind\", \"offering_version\": \"offeringVersion\", \"offering_provisioner_url\": \"offeringProvisionerUrl\", \"offering_provisioner_ssh\": \"offeringProvisionerSsh\", \"offering_provisioner_working_directory\": \"offeringProvisionerWorkingDirectory\", \"item_sku\": {\"sku_id\": \"skuId\", \"sku_type\": \"skuType\", \"sku_sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"sku_user_state\": {\"state\": \"state\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}}}], \"service_name\": \"SatelliteLocation\", \"resource_group\": \"resourceGroup\", \"location\": \"us-south\", \"user_state\": {\"state\": \"Order_Create_Init\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"cart_order_id\": \"cartOrderId\", \"crn\": \"crn\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}}";
    String createCartOrderPath = "/v2/cart";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TargetRequest model
    TargetRequest targetRequestModel = new TargetRequest.Builder()
    .clusterId("testString")
    .clusterName("testString")
    .entitlementKey(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .namespace("testString")
    .region("testString")
    .resourceGroupId("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ServiceMappingRule model
    ServiceMappingRule serviceMappingRuleModel = new ServiceMappingRule.Builder()
    .type("testString")
    .inputParamName("testString")
    .outputParamName("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ServiceVariableData model
    ServiceVariableData serviceVariableDataModel = new ServiceVariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .mapping(new java.util.ArrayList<ServiceMappingRule>(java.util.Arrays.asList(serviceMappingRuleModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SKUUserState model
    SKUUserState skuUserStateModel = new SKUUserState.Builder()
    .state("testString")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ItemSKU model
    ItemSKU itemSkuModel = new ItemSKU.Builder()
    .skuId("testString")
    .skuType("testString")
    .skuSysLock(systemLockModel)
    .skuUserState(skuUserStateModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the OrderItemConfiguration model
    OrderItemConfiguration orderItemConfigurationModel = new OrderItemConfiguration.Builder()
    .name("AWS Satellite")
    .description("Create satellite location in AWS")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .target(targetRequestModel)
    .operation("install")
    .serviceData(new java.util.ArrayList<ServiceVariableData>(java.util.Arrays.asList(serviceVariableDataModel)))
    .catalogId("testString")
    .offeringId("testString")
    .owningAccount("testString")
    .owningAccountCrn("testString")
    .offeringKindId("testString")
    .offeringTargetKind("testString")
    .offeringVersionId("testString")
    .offeringKind("testString")
    .offeringFulfilmentKind("testString")
    .offeringVersion("testString")
    .offeringProvisionerUrl("testString")
    .offeringProvisionerSsh("testString")
    .offeringProvisionerWorkingDirectory("testString")
    .itemSku(itemSkuModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the CartOrderUserState model
    CartOrderUserState cartOrderUserStateModel = new CartOrderUserState.Builder()
    .state("Order_Create_Init")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the CartOrderLiteState model
    CartOrderLiteState cartOrderLiteStateModel = new CartOrderLiteState.Builder()
    .statusCode("normal")
    .statusMessage("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the CartOrder model
    CartOrder cartOrderModel = new CartOrder.Builder()
    .name("MySatelliteLocation")
    .description("Creates satellite location in AWS")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .cartItems(new java.util.ArrayList<OrderItemConfiguration>(java.util.Arrays.asList(orderItemConfigurationModel)))
    .serviceName("SatelliteLocation")
    .resourceGroup("testString")
    .location("us-south")
    .userState(cartOrderUserStateModel)
    .sysLock(systemLockModel)
    .state(cartOrderLiteStateModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the CreateCartOrderOptions model
    CreateCartOrderOptions createCartOrderOptionsModel = new CreateCartOrderOptions.Builder()
    .cartOrder(cartOrderModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CartOrder> response = schematics20ApiService.createCartOrder(createCartOrderOptionsModel).execute();
    assertNotNull(response);
    CartOrder responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createCartOrderPath);
  }

  // Test the createCartOrder operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateCartOrderNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.createCartOrder(null).execute();
  }

  @Test
  public void testGetCartOrderWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"MySatelliteLocation\", \"description\": \"Creates satellite location in AWS\", \"tags\": [\"tags\"], \"cart_items\": [{\"name\": \"AWS Satellite\", \"description\": \"Create satellite location in AWS\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"target\": {\"cluster_id\": \"clusterId\", \"cluster_name\": \"clusterName\", \"entitlement_key\": {\"mapKey\": \"anyValue\"}, \"namespace\": \"namespace\", \"region\": \"region\", \"resource_group_id\": \"resourceGroupId\"}, \"operation\": \"install\", \"service_data\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"mapping\": [{\"type\": \"type\", \"input_param_name\": \"inputParamName\", \"output_param_name\": \"outputParamName\"}]}], \"catalog_id\": \"catalogId\", \"offering_id\": \"offeringId\", \"owning_account\": \"owningAccount\", \"owning_account_crn\": \"owningAccountCrn\", \"offering_kind_id\": \"offeringKindId\", \"offering_target_kind\": \"offeringTargetKind\", \"offering_version_id\": \"offeringVersionId\", \"offering_kind\": \"offeringKind\", \"offering_fulfilment_kind\": \"offeringFulfilmentKind\", \"offering_version\": \"offeringVersion\", \"offering_provisioner_url\": \"offeringProvisionerUrl\", \"offering_provisioner_ssh\": \"offeringProvisionerSsh\", \"offering_provisioner_working_directory\": \"offeringProvisionerWorkingDirectory\", \"item_sku\": {\"sku_id\": \"skuId\", \"sku_type\": \"skuType\", \"sku_sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"sku_user_state\": {\"state\": \"state\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}}}], \"service_name\": \"SatelliteLocation\", \"resource_group\": \"resourceGroup\", \"location\": \"us-south\", \"user_state\": {\"state\": \"Order_Create_Init\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"cart_order_id\": \"cartOrderId\", \"crn\": \"crn\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}}";
    String getCartOrderPath = "/v2/cart/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetCartOrderOptions model
    GetCartOrderOptions getCartOrderOptionsModel = new GetCartOrderOptions.Builder()
    .orderId("testString")
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CartOrder> response = schematics20ApiService.getCartOrder(getCartOrderOptionsModel).execute();
    assertNotNull(response);
    CartOrder responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCartOrderPath);
  }

  // Test the getCartOrder operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCartOrderNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getCartOrder(null).execute();
  }

  @Test
  public void testReplaceCartOrderWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"MySatelliteLocation\", \"description\": \"Creates satellite location in AWS\", \"tags\": [\"tags\"], \"cart_items\": [{\"name\": \"AWS Satellite\", \"description\": \"Create satellite location in AWS\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"target\": {\"cluster_id\": \"clusterId\", \"cluster_name\": \"clusterName\", \"entitlement_key\": {\"mapKey\": \"anyValue\"}, \"namespace\": \"namespace\", \"region\": \"region\", \"resource_group_id\": \"resourceGroupId\"}, \"operation\": \"install\", \"service_data\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"mapping\": [{\"type\": \"type\", \"input_param_name\": \"inputParamName\", \"output_param_name\": \"outputParamName\"}]}], \"catalog_id\": \"catalogId\", \"offering_id\": \"offeringId\", \"owning_account\": \"owningAccount\", \"owning_account_crn\": \"owningAccountCrn\", \"offering_kind_id\": \"offeringKindId\", \"offering_target_kind\": \"offeringTargetKind\", \"offering_version_id\": \"offeringVersionId\", \"offering_kind\": \"offeringKind\", \"offering_fulfilment_kind\": \"offeringFulfilmentKind\", \"offering_version\": \"offeringVersion\", \"offering_provisioner_url\": \"offeringProvisionerUrl\", \"offering_provisioner_ssh\": \"offeringProvisionerSsh\", \"offering_provisioner_working_directory\": \"offeringProvisionerWorkingDirectory\", \"item_sku\": {\"sku_id\": \"skuId\", \"sku_type\": \"skuType\", \"sku_sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"sku_user_state\": {\"state\": \"state\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}}}], \"service_name\": \"SatelliteLocation\", \"resource_group\": \"resourceGroup\", \"location\": \"us-south\", \"user_state\": {\"state\": \"Order_Create_Init\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"cart_order_id\": \"cartOrderId\", \"crn\": \"crn\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}}";
    String replaceCartOrderPath = "/v2/cart/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TargetRequest model
    TargetRequest targetRequestModel = new TargetRequest.Builder()
    .clusterId("testString")
    .clusterName("testString")
    .entitlementKey(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .namespace("testString")
    .region("testString")
    .resourceGroupId("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ServiceMappingRule model
    ServiceMappingRule serviceMappingRuleModel = new ServiceMappingRule.Builder()
    .type("testString")
    .inputParamName("testString")
    .outputParamName("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ServiceVariableData model
    ServiceVariableData serviceVariableDataModel = new ServiceVariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .mapping(new java.util.ArrayList<ServiceMappingRule>(java.util.Arrays.asList(serviceMappingRuleModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SKUUserState model
    SKUUserState skuUserStateModel = new SKUUserState.Builder()
    .state("testString")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the ItemSKU model
    ItemSKU itemSkuModel = new ItemSKU.Builder()
    .skuId("testString")
    .skuType("testString")
    .skuSysLock(systemLockModel)
    .skuUserState(skuUserStateModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the OrderItemConfiguration model
    OrderItemConfiguration orderItemConfigurationModel = new OrderItemConfiguration.Builder()
    .name("AWS Satellite")
    .description("Create satellite location in AWS")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .target(targetRequestModel)
    .operation("install")
    .serviceData(new java.util.ArrayList<ServiceVariableData>(java.util.Arrays.asList(serviceVariableDataModel)))
    .catalogId("testString")
    .offeringId("testString")
    .owningAccount("testString")
    .owningAccountCrn("testString")
    .offeringKindId("testString")
    .offeringTargetKind("testString")
    .offeringVersionId("testString")
    .offeringKind("testString")
    .offeringFulfilmentKind("testString")
    .offeringVersion("testString")
    .offeringProvisionerUrl("testString")
    .offeringProvisionerSsh("testString")
    .offeringProvisionerWorkingDirectory("testString")
    .itemSku(itemSkuModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the CartOrderUserState model
    CartOrderUserState cartOrderUserStateModel = new CartOrderUserState.Builder()
    .state("Order_Create_Init")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the CartOrderLiteState model
    CartOrderLiteState cartOrderLiteStateModel = new CartOrderLiteState.Builder()
    .statusCode("normal")
    .statusMessage("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the CartOrder model
    CartOrder cartOrderModel = new CartOrder.Builder()
    .name("MySatelliteLocation")
    .description("Creates satellite location in AWS")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .cartItems(new java.util.ArrayList<OrderItemConfiguration>(java.util.Arrays.asList(orderItemConfigurationModel)))
    .serviceName("SatelliteLocation")
    .resourceGroup("testString")
    .location("us-south")
    .userState(cartOrderUserStateModel)
    .sysLock(systemLockModel)
    .state(cartOrderLiteStateModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the ReplaceCartOrderOptions model
    ReplaceCartOrderOptions replaceCartOrderOptionsModel = new ReplaceCartOrderOptions.Builder()
    .orderId("testString")
    .operation("testString")
    .cartOrder(cartOrderModel)
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CartOrder> response = schematics20ApiService.replaceCartOrder(replaceCartOrderOptionsModel).execute();
    assertNotNull(response);
    CartOrder responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("operation"), "0");
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceCartOrderPath);
  }

  // Test the replaceCartOrder operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceCartOrderNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.replaceCartOrder(null).execute();
  }

  @Test
  public void testRunFulfilmentOperationWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String runFulfilmentOperationPath = "/v2/cart/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RunFulfilmentOperationOptions model
    RunFulfilmentOperationOptions runFulfilmentOperationOptionsModel = new RunFulfilmentOperationOptions.Builder()
    .orderId("testString")
    .operation("testString")
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematics20ApiService.runFulfilmentOperation(runFulfilmentOperationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("operation"), "0");
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, runFulfilmentOperationPath);
  }

  // Test the runFulfilmentOperation operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRunFulfilmentOperationNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.runFulfilmentOperation(null).execute();
  }

  @Test
  public void testDeleteCartOrderWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteCartOrderPath = "/v2/cart/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteCartOrderOptions model
    DeleteCartOrderOptions deleteCartOrderOptionsModel = new DeleteCartOrderOptions.Builder()
    .orderId("testString")
    .profile("ids")
    .destroy(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematics20ApiService.deleteCartOrder(deleteCartOrderOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("profile"), "ids");
    assertEquals(Boolean.valueOf(query.get("destroy")), Boolean.valueOf(0));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteCartOrderPath);
  }

  // Test the deleteCartOrder operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteCartOrderNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.deleteCartOrder(null).execute();
  }

  @Test
  public void testUpdateCartOrderWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"MySatelliteLocation\", \"description\": \"Creates satellite location in AWS\", \"tags\": [\"tags\"], \"cart_items\": [{\"name\": \"AWS Satellite\", \"description\": \"Create satellite location in AWS\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"target\": {\"cluster_id\": \"clusterId\", \"cluster_name\": \"clusterName\", \"entitlement_key\": {\"mapKey\": \"anyValue\"}, \"namespace\": \"namespace\", \"region\": \"region\", \"resource_group_id\": \"resourceGroupId\"}, \"operation\": \"install\", \"service_data\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"mapping\": [{\"type\": \"type\", \"input_param_name\": \"inputParamName\", \"output_param_name\": \"outputParamName\"}]}], \"catalog_id\": \"catalogId\", \"offering_id\": \"offeringId\", \"owning_account\": \"owningAccount\", \"owning_account_crn\": \"owningAccountCrn\", \"offering_kind_id\": \"offeringKindId\", \"offering_target_kind\": \"offeringTargetKind\", \"offering_version_id\": \"offeringVersionId\", \"offering_kind\": \"offeringKind\", \"offering_fulfilment_kind\": \"offeringFulfilmentKind\", \"offering_version\": \"offeringVersion\", \"offering_provisioner_url\": \"offeringProvisionerUrl\", \"offering_provisioner_ssh\": \"offeringProvisionerSsh\", \"offering_provisioner_working_directory\": \"offeringProvisionerWorkingDirectory\", \"item_sku\": {\"sku_id\": \"skuId\", \"sku_type\": \"skuType\", \"sku_sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"sku_user_state\": {\"state\": \"state\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}}}], \"service_name\": \"SatelliteLocation\", \"resource_group\": \"resourceGroup\", \"location\": \"us-south\", \"user_state\": {\"state\": \"Order_Create_Init\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"cart_order_id\": \"cartOrderId\", \"crn\": \"crn\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}}";
    String updateCartOrderPath = "/v2/cart/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TargetRequest model
    TargetRequest targetRequestModel = new TargetRequest.Builder()
    .clusterId("testString")
    .clusterName("testString")
    .entitlementKey(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .namespace("testString")
    .region("testString")
    .resourceGroupId("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ServiceMappingRule model
    ServiceMappingRule serviceMappingRuleModel = new ServiceMappingRule.Builder()
    .type("testString")
    .inputParamName("testString")
    .outputParamName("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ServiceVariableData model
    ServiceVariableData serviceVariableDataModel = new ServiceVariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .mapping(new java.util.ArrayList<ServiceMappingRule>(java.util.Arrays.asList(serviceMappingRuleModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the UpdateOrderItemConfiguration model
    UpdateOrderItemConfiguration updateOrderItemConfigurationModel = new UpdateOrderItemConfiguration.Builder()
    .name("AWS Satellite")
    .description("Create satellite location in AWS")
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .target(targetRequestModel)
    .operation("install")
    .serviceData(new java.util.ArrayList<ServiceVariableData>(java.util.Arrays.asList(serviceVariableDataModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the UpdateCartOrder model
    UpdateCartOrder updateCartOrderModel = new UpdateCartOrder.Builder()
    .name("MySatelliteLocation")
    .description("Creates satellite location in AWS")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .cartItems(new java.util.ArrayList<UpdateOrderItemConfiguration>(java.util.Arrays.asList(updateOrderItemConfigurationModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the UpdateCartOrderOptions model
    UpdateCartOrderOptions updateCartOrderOptionsModel = new UpdateCartOrderOptions.Builder()
    .orderId("testString")
    .updateCartOrder(updateCartOrderModel)
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CartOrder> response = schematics20ApiService.updateCartOrder(updateCartOrderOptionsModel).execute();
    assertNotNull(response);
    CartOrder responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateCartOrderPath);
  }

  // Test the updateCartOrder operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateCartOrderNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.updateCartOrder(null).execute();
  }

  @Test
  public void testGetCartMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"item_id\": \"itemId\", \"offering_id\": \"offeringId\", \"offering_kind_id\": \"offeringKindId\", \"offering_version_id\": \"offeringVersionId\", \"name\": \"AWS Satellite\", \"description\": \"Create satellite location in AWS\", \"operations\": [\"install\"], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}]}";
    String getCartMetadataPath = "/v2/cart/testString/metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetCartMetadataOptions model
    GetCartMetadataOptions getCartMetadataOptionsModel = new GetCartMetadataOptions.Builder()
    .orderId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ItemMetadata> response = schematics20ApiService.getCartMetadata(getCartMetadataOptionsModel).execute();
    assertNotNull(response);
    ItemMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCartMetadataPath);
  }

  // Test the getCartMetadata operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCartMetadataNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getCartMetadata(null).execute();
  }

  @Test
  public void testListCartResourcesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"outputs\": [{\"resource_id\": \"resourceId\", \"cloud_resource_name\": \"cloudResourceName\", \"terraform_resource_name\": \"terraformResourceName\", \"crn\": \"crn\", \"resource_state\": \"resourceState\", \"tags\": [\"tags\"]}]}";
    String listCartResourcesPath = "/v2/cart/testString/resources";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListCartResourcesOptions model
    ListCartResourcesOptions listCartResourcesOptionsModel = new ListCartResourcesOptions.Builder()
    .orderId("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CloudResourceList> response = schematics20ApiService.listCartResources(listCartResourcesOptionsModel).execute();
    assertNotNull(response);
    CloudResourceList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listCartResourcesPath);
  }

  // Test the listCartResources operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListCartResourcesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.listCartResources(null).execute();
  }

  @Test
  public void testListCartOrderJobsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"jobs\": [{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"tags\": [\"tags\"], \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"duration\": \"duration\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"status\": {\"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}]}";
    String listCartOrderJobsPath = "/v2/cart/testString/jobs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListCartOrderJobsOptions model
    ListCartOrderJobsOptions listCartOrderJobsOptionsModel = new ListCartOrderJobsOptions.Builder()
    .orderId("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<JobList> response = schematics20ApiService.listCartOrderJobs(listCartOrderJobsOptionsModel).execute();
    assertNotNull(response);
    JobList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listCartOrderJobsPath);
  }

  // Test the listCartOrderJobs operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListCartOrderJobsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.listCartOrderJobs(null).execute();
  }

  @Test
  public void testGetCartOrderJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"id\": \"id\", \"name\": \"name\", \"description\": \"description\", \"command_object\": \"workspace\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"tags\": [\"tags\"], \"location\": \"us-south\", \"resource_group\": \"resourceGroup\", \"submitted_at\": \"2019-01-01T12:00:00.000Z\", \"submitted_by\": \"submittedBy\", \"duration\": \"duration\", \"start_at\": \"2019-01-01T12:00:00.000Z\", \"end_at\": \"2019-01-01T12:00:00.000Z\", \"status\": {\"workspace_job_status\": {\"workspace_name\": \"workspaceName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"flow_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"template_status\": [{\"template_id\": \"templateId\", \"template_name\": \"templateName\", \"flow_index\": 9, \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"action_job_status\": {\"action_name\": \"actionName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"bastion_status_code\": \"none\", \"bastion_status_message\": \"bastionStatusMessage\", \"targets_status_code\": \"none\", \"targets_status_message\": \"targetsStatusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"system_job_status\": {\"system_status_message\": \"systemStatusMessage\", \"system_status_code\": \"job_pending\", \"schematics_resource_status\": [{\"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"schematics_resource_id\": \"schematicsResourceId\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}, \"flow_job_status\": {\"flow_id\": \"flowId\", \"flow_name\": \"flowName\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"workitems\": [{\"workspace_id\": \"workspaceId\", \"workspace_name\": \"workspaceName\", \"job_id\": \"jobId\", \"status_code\": \"job_pending\", \"status_message\": \"statusMessage\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}], \"updated_at\": \"2019-01-01T12:00:00.000Z\"}}, \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getCartOrderJobPath = "/v2/cart/testString/jobs/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetCartOrderJobOptions model
    GetCartOrderJobOptions getCartOrderJobOptionsModel = new GetCartOrderJobOptions.Builder()
    .orderId("testString")
    .jobId("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<JobLite> response = schematics20ApiService.getCartOrderJob(getCartOrderJobOptionsModel).execute();
    assertNotNull(response);
    JobLite responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCartOrderJobPath);
  }

  // Test the getCartOrderJob operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCartOrderJobNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getCartOrderJob(null).execute();
  }

  @Test
  public void testGetCartOrderJobLogWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_name\": \"jobName\", \"log_summary\": {\"job_id\": \"jobId\", \"job_type\": \"repo_download_job\", \"log_start_at\": \"2019-01-01T12:00:00.000Z\", \"log_analyzed_till\": \"2019-01-01T12:00:00.000Z\", \"elapsed_time\": 11, \"log_errors\": [{\"error_code\": \"errorCode\", \"error_msg\": \"errorMsg\", \"error_count\": 10}], \"repo_download_job\": {\"scanned_file_count\": 16, \"quarantined_file_count\": 20, \"detected_filetype\": \"detectedFiletype\", \"inputs_count\": \"inputsCount\", \"outputs_count\": \"outputsCount\"}, \"workspace_job\": {\"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16}, \"flow_job\": {\"workitems_completed\": 18, \"workitems_pending\": 16, \"workitems_failed\": 15, \"workitems\": [{\"workspace_id\": \"workspaceId\", \"job_id\": \"jobId\", \"resources_add\": 12, \"resources_modify\": 15, \"resources_destroy\": 16, \"log_url\": \"logUrl\"}]}, \"action_job\": {\"target_count\": 11, \"task_count\": 9, \"play_count\": 9, \"recap\": {\"target\": [\"target\"], \"ok\": 2, \"changed\": 7, \"failed\": 6, \"skipped\": 7, \"unreachable\": 11}}, \"system_job\": {\"target_count\": 11, \"success\": 7, \"failed\": 6}}, \"format\": \"json\", \"details\": \"VGhpcyBpcyBhbiBlbmNvZGVkIGJ5dGUgYXJyYXku\", \"updated_at\": \"2019-01-01T12:00:00.000Z\"}";
    String getCartOrderJobLogPath = "/v2/cart/testString/jobs/testString/logs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetCartOrderJobLogOptions model
    GetCartOrderJobLogOptions getCartOrderJobLogOptionsModel = new GetCartOrderJobLogOptions.Builder()
    .orderId("testString")
    .jobId("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<JobLog> response = schematics20ApiService.getCartOrderJobLog(getCartOrderJobLogOptionsModel).execute();
    assertNotNull(response);
    JobLog responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCartOrderJobLogPath);
  }

  // Test the getCartOrderJobLog operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCartOrderJobLogNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getCartOrderJobLog(null).execute();
  }

  @Test
  public void testGetCartOrderJobResourcesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"outputs\": [{\"resource_id\": \"resourceId\", \"cloud_resource_name\": \"cloudResourceName\", \"terraform_resource_name\": \"terraformResourceName\", \"crn\": \"crn\", \"resource_state\": \"resourceState\", \"tags\": [\"tags\"]}]}";
    String getCartOrderJobResourcesPath = "/v2/cart/testString/jobs/testString/resources";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetCartOrderJobResourcesOptions model
    GetCartOrderJobResourcesOptions getCartOrderJobResourcesOptionsModel = new GetCartOrderJobResourcesOptions.Builder()
    .orderId("testString")
    .jobId("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CloudResourceList> response = schematics20ApiService.getCartOrderJobResources(getCartOrderJobResourcesOptionsModel).execute();
    assertNotNull(response);
    CloudResourceList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCartOrderJobResourcesPath);
  }

  // Test the getCartOrderJobResources operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCartOrderJobResourcesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getCartOrderJobResources(null).execute();
  }

  @Test
  public void testListEnvironmentDefinitionsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "[{\"name\": \"Schematics\", \"label\": \"Schematics\", \"offering_id\": \"offeringId\", \"short_description\": \"shortDescription\", \"crn\": \"crn\", \"offering_url\": \"offeringUrl\", \"versions\": [{\"version\": \"version\", \"versionid\": \"versionid\"}]}]";
    String listEnvironmentDefinitionsPath = "/v2/environmentdefinitions";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListEnvironmentDefinitionsOptions model
    ListEnvironmentDefinitionsOptions listEnvironmentDefinitionsOptionsModel = new ListEnvironmentDefinitionsOptions.Builder()
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .catalogId("testString")
    .catalogName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<List<EnvironmentCatalogOfferingItem>> response = schematics20ApiService.listEnvironmentDefinitions(listEnvironmentDefinitionsOptionsModel).execute();
    assertNotNull(response);
    List<EnvironmentCatalogOfferingItem> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("catalog_id"), "testString");
    assertEquals(query.get("catalog_name"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listEnvironmentDefinitionsPath);
  }

  @Test
  public void testGetEnvironmentDefinitionWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"Toronto Dev Environtment\", \"schema_version\": \"1.0\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"description\": \"Deploys dev environtment instance in Toronto Region\", \"resource_group\": \"Default\", \"tags\": [\"tags\"], \"location\": \"us-south\", \"blueprint\": {\"name\": \"name\", \"description\": \"description\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"workitems\": [{\"workitem_object_id\": \"workitemObjectId\", \"workitem_object_type\": \"workspace\", \"name\": \"name\", \"layer\": \"layer\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"tags\": \"tags\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_status\": \"job_pending\"}}], \"flow\": {\"type\": \"type\", \"operations\": [{\"install\": \"install\", \"update\": \"update\", \"uninstall\": \"uninstall\", \"configure\": \"configure\"}]}}, \"config\": [{\"name\": \"name\", \"description\": \"description\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}]}], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"environment_id\": \"environmentId\", \"crn\": \"crn\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"user_state\": {\"state\": \"Environment_Create_Init\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}}";
    String getEnvironmentDefinitionPath = "/v2/environmentdefinitions/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetEnvironmentDefinitionOptions model
    GetEnvironmentDefinitionOptions getEnvironmentDefinitionOptionsModel = new GetEnvironmentDefinitionOptions.Builder()
    .offeringId("testString")
    .catalogId("testString")
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Environment> response = schematics20ApiService.getEnvironmentDefinition(getEnvironmentDefinitionOptionsModel).execute();
    assertNotNull(response);
    Environment responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("catalog_id"), "testString");
    assertEquals(query.get("catalog_name"), "testString");
    assertEquals(query.get("offering_name"), "testString");
    assertEquals(query.get("offering_version"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getEnvironmentDefinitionPath);
  }

  // Test the getEnvironmentDefinition operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetEnvironmentDefinitionNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getEnvironmentDefinition(null).execute();
  }

  @Test
  public void testListEnvironmentWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"environments\": [{\"name\": \"MySatelliteLocation\", \"description\": \"Creates satellite location in AWS\", \"resource_group\": \"resourceGroup\", \"tags\": [\"tags\"], \"location\": \"us-south\", \"id\": \"id\", \"crn\": \"crn\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"user_state\": {\"state\": \"Environment_Create_Init\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}}]}";
    String listEnvironmentPath = "/v2/environments";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListEnvironmentOptions model
    ListEnvironmentOptions listEnvironmentOptionsModel = new ListEnvironmentOptions.Builder()
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<EnvironmentList> response = schematics20ApiService.listEnvironment(listEnvironmentOptionsModel).execute();
    assertNotNull(response);
    EnvironmentList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listEnvironmentPath);
  }

  @Test
  public void testCreateEnvironmentWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"Toronto Dev Environtment\", \"schema_version\": \"1.0\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"description\": \"Deploys dev environtment instance in Toronto Region\", \"resource_group\": \"Default\", \"tags\": [\"tags\"], \"location\": \"us-south\", \"blueprint\": {\"name\": \"name\", \"description\": \"description\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"workitems\": [{\"workitem_object_id\": \"workitemObjectId\", \"workitem_object_type\": \"workspace\", \"name\": \"name\", \"layer\": \"layer\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"tags\": \"tags\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_status\": \"job_pending\"}}], \"flow\": {\"type\": \"type\", \"operations\": [{\"install\": \"install\", \"update\": \"update\", \"uninstall\": \"uninstall\", \"configure\": \"configure\"}]}}, \"config\": [{\"name\": \"name\", \"description\": \"description\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}]}], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"environment_id\": \"environmentId\", \"crn\": \"crn\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"user_state\": {\"state\": \"Environment_Create_Init\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}}";
    String createEnvironmentPath = "/v2/environments";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the BlueprintVariableData model
    BlueprintVariableData blueprintVariableDataModel = new BlueprintVariableData.Builder()
    .name("testString")
    .value("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the WorkItemLastJob model
    WorkItemLastJob workItemLastJobModel = new WorkItemLastJob.Builder()
    .commandObject("workspace")
    .commandObjectName("testString")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .jobStatus("job_pending")
    .add("foo", "testString")
    .build();

    // Construct an instance of the WorkItem model
    WorkItem workItemModel = new WorkItem.Builder()
    .workitemObjectId("testString")
    .workitemObjectType("workspace")
    .name("testString")
    .layer("testString")
    .source(externalSourceModel)
    .tags("testString")
    .inputs(new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)))
    .outputs(new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)))
    .settings(new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)))
    .lastJob(workItemLastJobModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the FlowOperations model
    FlowOperations flowOperationsModel = new FlowOperations.Builder()
    .install("testString")
    .update("testString")
    .uninstall("testString")
    .configure("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the Flow model
    Flow flowModel = new Flow.Builder()
    .type("testString")
    .operations(new java.util.ArrayList<FlowOperations>(java.util.Arrays.asList(flowOperationsModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Blueprint model
    Blueprint blueprintModel = new Blueprint.Builder()
    .name("testString")
    .description("testString")
    .source(externalSourceModel)
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .workitems(new java.util.ArrayList<WorkItem>(java.util.Arrays.asList(workItemModel)))
    .flow(flowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the ConfigItem model
    ConfigItem configItemModel = new ConfigItem.Builder()
    .name("testString")
    .description("testString")
    .source(externalSourceModel)
    .inputs(new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the EnvironmentUserState model
    EnvironmentUserState environmentUserStateModel = new EnvironmentUserState.Builder()
    .state("Environment_Create_Init")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the EnvironmentState model
    EnvironmentState environmentStateModel = new EnvironmentState.Builder()
    .statusCode("normal")
    .statusMessage("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the Environment model
    Environment environmentModel = new Environment.Builder()
    .name("Toronto Dev Environtment")
    .schemaVersion("1.0")
    .source(externalSourceModel)
    .description("Deploys dev environtment instance in Toronto Region")
    .resourceGroup("Default")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .location("us-south")
    .blueprint(blueprintModel)
    .config(new java.util.ArrayList<ConfigItem>(java.util.Arrays.asList(configItemModel)))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .sysLock(systemLockModel)
    .userState(environmentUserStateModel)
    .state(environmentStateModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the CreateEnvironmentOptions model
    CreateEnvironmentOptions createEnvironmentOptionsModel = new CreateEnvironmentOptions.Builder()
    .environment(environmentModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Environment> response = schematics20ApiService.createEnvironment(createEnvironmentOptionsModel).execute();
    assertNotNull(response);
    Environment responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createEnvironmentPath);
  }

  // Test the createEnvironment operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateEnvironmentNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.createEnvironment(null).execute();
  }

  @Test
  public void testGetEnvironmentWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"Toronto Dev Environtment\", \"schema_version\": \"1.0\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"description\": \"Deploys dev environtment instance in Toronto Region\", \"resource_group\": \"Default\", \"tags\": [\"tags\"], \"location\": \"us-south\", \"blueprint\": {\"name\": \"name\", \"description\": \"description\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"workitems\": [{\"workitem_object_id\": \"workitemObjectId\", \"workitem_object_type\": \"workspace\", \"name\": \"name\", \"layer\": \"layer\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"tags\": \"tags\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_status\": \"job_pending\"}}], \"flow\": {\"type\": \"type\", \"operations\": [{\"install\": \"install\", \"update\": \"update\", \"uninstall\": \"uninstall\", \"configure\": \"configure\"}]}}, \"config\": [{\"name\": \"name\", \"description\": \"description\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}]}], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"environment_id\": \"environmentId\", \"crn\": \"crn\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"user_state\": {\"state\": \"Environment_Create_Init\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}}";
    String getEnvironmentPath = "/v2/environments/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetEnvironmentOptions model
    GetEnvironmentOptions getEnvironmentOptionsModel = new GetEnvironmentOptions.Builder()
    .environmentId("testString")
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Environment> response = schematics20ApiService.getEnvironment(getEnvironmentOptionsModel).execute();
    assertNotNull(response);
    Environment responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getEnvironmentPath);
  }

  // Test the getEnvironment operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetEnvironmentNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getEnvironment(null).execute();
  }

  @Test
  public void testReplaceEnvironmentWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"Toronto Dev Environtment\", \"schema_version\": \"1.0\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"description\": \"Deploys dev environtment instance in Toronto Region\", \"resource_group\": \"Default\", \"tags\": [\"tags\"], \"location\": \"us-south\", \"blueprint\": {\"name\": \"name\", \"description\": \"description\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"workitems\": [{\"workitem_object_id\": \"workitemObjectId\", \"workitem_object_type\": \"workspace\", \"name\": \"name\", \"layer\": \"layer\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"tags\": \"tags\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_status\": \"job_pending\"}}], \"flow\": {\"type\": \"type\", \"operations\": [{\"install\": \"install\", \"update\": \"update\", \"uninstall\": \"uninstall\", \"configure\": \"configure\"}]}}, \"config\": [{\"name\": \"name\", \"description\": \"description\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}]}], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"environment_id\": \"environmentId\", \"crn\": \"crn\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"user_state\": {\"state\": \"Environment_Create_Init\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}}";
    String replaceEnvironmentPath = "/v2/environments/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the BlueprintVariableData model
    BlueprintVariableData blueprintVariableDataModel = new BlueprintVariableData.Builder()
    .name("testString")
    .value("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the WorkItemLastJob model
    WorkItemLastJob workItemLastJobModel = new WorkItemLastJob.Builder()
    .commandObject("workspace")
    .commandObjectName("testString")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .jobStatus("job_pending")
    .add("foo", "testString")
    .build();

    // Construct an instance of the WorkItem model
    WorkItem workItemModel = new WorkItem.Builder()
    .workitemObjectId("testString")
    .workitemObjectType("workspace")
    .name("testString")
    .layer("testString")
    .source(externalSourceModel)
    .tags("testString")
    .inputs(new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)))
    .outputs(new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)))
    .settings(new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)))
    .lastJob(workItemLastJobModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the FlowOperations model
    FlowOperations flowOperationsModel = new FlowOperations.Builder()
    .install("testString")
    .update("testString")
    .uninstall("testString")
    .configure("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the Flow model
    Flow flowModel = new Flow.Builder()
    .type("testString")
    .operations(new java.util.ArrayList<FlowOperations>(java.util.Arrays.asList(flowOperationsModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Blueprint model
    Blueprint blueprintModel = new Blueprint.Builder()
    .name("testString")
    .description("testString")
    .source(externalSourceModel)
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .workitems(new java.util.ArrayList<WorkItem>(java.util.Arrays.asList(workItemModel)))
    .flow(flowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the ConfigItem model
    ConfigItem configItemModel = new ConfigItem.Builder()
    .name("testString")
    .description("testString")
    .source(externalSourceModel)
    .inputs(new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the EnvironmentUserState model
    EnvironmentUserState environmentUserStateModel = new EnvironmentUserState.Builder()
    .state("Environment_Create_Init")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the EnvironmentState model
    EnvironmentState environmentStateModel = new EnvironmentState.Builder()
    .statusCode("normal")
    .statusMessage("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the Environment model
    Environment environmentModel = new Environment.Builder()
    .name("Toronto Dev Environtment")
    .schemaVersion("1.0")
    .source(externalSourceModel)
    .description("Deploys dev environtment instance in Toronto Region")
    .resourceGroup("Default")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .location("us-south")
    .blueprint(blueprintModel)
    .config(new java.util.ArrayList<ConfigItem>(java.util.Arrays.asList(configItemModel)))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .sysLock(systemLockModel)
    .userState(environmentUserStateModel)
    .state(environmentStateModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the ReplaceEnvironmentOptions model
    ReplaceEnvironmentOptions replaceEnvironmentOptionsModel = new ReplaceEnvironmentOptions.Builder()
    .environmentId("testString")
    .environment(environmentModel)
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Environment> response = schematics20ApiService.replaceEnvironment(replaceEnvironmentOptionsModel).execute();
    assertNotNull(response);
    Environment responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceEnvironmentPath);
  }

  // Test the replaceEnvironment operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceEnvironmentNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.replaceEnvironment(null).execute();
  }

  @Test
  public void testDeleteEnvironmentWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteEnvironmentPath = "/v2/environments/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteEnvironmentOptions model
    DeleteEnvironmentOptions deleteEnvironmentOptionsModel = new DeleteEnvironmentOptions.Builder()
    .environmentId("testString")
    .profile("ids")
    .destroy(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = schematics20ApiService.deleteEnvironment(deleteEnvironmentOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("profile"), "ids");
    assertEquals(Boolean.valueOf(query.get("destroy")), Boolean.valueOf(0));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteEnvironmentPath);
  }

  // Test the deleteEnvironment operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteEnvironmentNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.deleteEnvironment(null).execute();
  }

  @Test
  public void testUpdateEnvironmentWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"name\": \"Toronto Dev Environtment\", \"schema_version\": \"1.0\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"description\": \"Deploys dev environtment instance in Toronto Region\", \"resource_group\": \"Default\", \"tags\": [\"tags\"], \"location\": \"us-south\", \"blueprint\": {\"name\": \"name\", \"description\": \"description\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"workitems\": [{\"workitem_object_id\": \"workitemObjectId\", \"workitem_object_type\": \"workspace\", \"name\": \"name\", \"layer\": \"layer\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"tags\": \"tags\", \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}], \"last_job\": {\"command_object\": \"workspace\", \"command_object_name\": \"commandObjectName\", \"command_object_id\": \"commandObjectId\", \"command_name\": \"workspace_plan\", \"job_status\": \"job_pending\"}}], \"flow\": {\"type\": \"type\", \"operations\": [{\"install\": \"install\", \"update\": \"update\", \"uninstall\": \"uninstall\", \"configure\": \"configure\"}]}}, \"config\": [{\"name\": \"name\", \"description\": \"description\", \"source\": {\"source_type\": \"local\", \"git\": {\"computed_git_repo_url\": \"computedGitRepoUrl\", \"git_repo_url\": \"gitRepoUrl\", \"git_token\": \"gitToken\", \"git_repo_folder\": \"gitRepoFolder\", \"git_release\": \"gitRelease\", \"git_branch\": \"gitBranch\"}, \"catalog\": {\"catalog_name\": \"catalogName\", \"offering_name\": \"offeringName\", \"offering_version\": \"offeringVersion\", \"offering_kind\": \"offeringKind\", \"offering_id\": \"offeringId\", \"offering_version_id\": \"offeringVersionId\", \"offering_repo_url\": \"offeringRepoUrl\"}, \"cos_bucket\": {\"cos_bucket_url\": \"cosBucketUrl\"}}, \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"link\": \"link\"}]}], \"inputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"settings\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"outputs\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}], \"environment_id\": \"environmentId\", \"crn\": \"crn\", \"account\": \"account\", \"created_at\": \"2019-01-01T12:00:00.000Z\", \"created_by\": \"createdBy\", \"updated_at\": \"2019-01-01T12:00:00.000Z\", \"updated_by\": \"updatedBy\", \"sys_lock\": {\"sys_locked\": false, \"sys_locked_by\": \"sysLockedBy\", \"sys_locked_at\": \"2019-01-01T12:00:00.000Z\"}, \"user_state\": {\"state\": \"Environment_Create_Init\", \"set_by\": \"setBy\", \"set_at\": \"2019-01-01T12:00:00.000Z\"}, \"state\": {\"status_code\": \"normal\", \"status_message\": \"statusMessage\"}}";
    String updateEnvironmentPath = "/v2/environments/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableMetadata model
    VariableMetadata variableMetadataModel = new VariableMetadata.Builder()
    .type("boolean")
    .aliases(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .defaultValue("testString")
    .secure(true)
    .immutable(true)
    .hidden(true)
    .options(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minValue(Long.valueOf("26"))
    .maxValue(Long.valueOf("26"))
    .minLength(Long.valueOf("26"))
    .maxLength(Long.valueOf("26"))
    .matches("testString")
    .position(Long.valueOf("26"))
    .groupBy("testString")
    .source("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the VariableData model
    VariableData variableDataModel = new VariableData.Builder()
    .name("testString")
    .value("testString")
    .metadata(variableMetadataModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the BlueprintVariableData model
    BlueprintVariableData blueprintVariableDataModel = new BlueprintVariableData.Builder()
    .name("testString")
    .value("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the WorkItemLastJob model
    WorkItemLastJob workItemLastJobModel = new WorkItemLastJob.Builder()
    .commandObject("workspace")
    .commandObjectName("testString")
    .commandObjectId("testString")
    .commandName("workspace_plan")
    .jobStatus("job_pending")
    .add("foo", "testString")
    .build();

    // Construct an instance of the WorkItem model
    WorkItem workItemModel = new WorkItem.Builder()
    .workitemObjectId("testString")
    .workitemObjectType("workspace")
    .name("testString")
    .layer("testString")
    .source(externalSourceModel)
    .tags("testString")
    .inputs(new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)))
    .outputs(new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)))
    .settings(new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)))
    .lastJob(workItemLastJobModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the FlowOperations model
    FlowOperations flowOperationsModel = new FlowOperations.Builder()
    .install("testString")
    .update("testString")
    .uninstall("testString")
    .configure("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the Flow model
    Flow flowModel = new Flow.Builder()
    .type("testString")
    .operations(new java.util.ArrayList<FlowOperations>(java.util.Arrays.asList(flowOperationsModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the Blueprint model
    Blueprint blueprintModel = new Blueprint.Builder()
    .name("testString")
    .description("testString")
    .source(externalSourceModel)
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .workitems(new java.util.ArrayList<WorkItem>(java.util.Arrays.asList(workItemModel)))
    .flow(flowModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the ConfigItem model
    ConfigItem configItemModel = new ConfigItem.Builder()
    .name("testString")
    .description("testString")
    .source(externalSourceModel)
    .inputs(new java.util.ArrayList<BlueprintVariableData>(java.util.Arrays.asList(blueprintVariableDataModel)))
    .add("foo", "testString")
    .build();

    // Construct an instance of the SystemLock model
    SystemLock systemLockModel = new SystemLock.Builder()
    .sysLocked(true)
    .sysLockedBy("testString")
    .sysLockedAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the EnvironmentUserState model
    EnvironmentUserState environmentUserStateModel = new EnvironmentUserState.Builder()
    .state("Environment_Create_Init")
    .setBy("testString")
    .setAt(DateUtils.parseAsDateTime("2019-01-01T12:00:00.000Z"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the EnvironmentState model
    EnvironmentState environmentStateModel = new EnvironmentState.Builder()
    .statusCode("normal")
    .statusMessage("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the Environment model
    Environment environmentModel = new Environment.Builder()
    .name("Toronto Dev Environtment")
    .schemaVersion("1.0")
    .source(externalSourceModel)
    .description("Deploys dev environtment instance in Toronto Region")
    .resourceGroup("Default")
    .tags(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .location("us-south")
    .blueprint(blueprintModel)
    .config(new java.util.ArrayList<ConfigItem>(java.util.Arrays.asList(configItemModel)))
    .inputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .settings(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .outputs(new java.util.ArrayList<VariableData>(java.util.Arrays.asList(variableDataModel)))
    .sysLock(systemLockModel)
    .userState(environmentUserStateModel)
    .state(environmentStateModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the UpdateEnvironmentOptions model
    UpdateEnvironmentOptions updateEnvironmentOptionsModel = new UpdateEnvironmentOptions.Builder()
    .environmentId("testString")
    .environment(environmentModel)
    .profile("ids")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Environment> response = schematics20ApiService.updateEnvironment(updateEnvironmentOptionsModel).execute();
    assertNotNull(response);
    Environment responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("profile"), "ids");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateEnvironmentPath);
  }

  // Test the updateEnvironment operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateEnvironmentNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.updateEnvironment(null).execute();
  }

  @Test
  public void testListEnvironmentWorkspacesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"outputs\": [{\"resource_id\": \"resourceId\", \"cloud_resource_name\": \"cloudResourceName\", \"terraform_resource_name\": \"terraformResourceName\", \"crn\": \"crn\", \"resource_state\": \"resourceState\", \"tags\": [\"tags\"]}]}";
    String listEnvironmentWorkspacesPath = "/v2/environment/testString/workspaces";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListEnvironmentWorkspacesOptions model
    ListEnvironmentWorkspacesOptions listEnvironmentWorkspacesOptionsModel = new ListEnvironmentWorkspacesOptions.Builder()
    .environmentId("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CloudResourceList> response = schematics20ApiService.listEnvironmentWorkspaces(listEnvironmentWorkspacesOptionsModel).execute();
    assertNotNull(response);
    CloudResourceList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listEnvironmentWorkspacesPath);
  }

  // Test the listEnvironmentWorkspaces operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListEnvironmentWorkspacesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.listEnvironmentWorkspaces(null).execute();
  }

  @Test
  public void testListEnvironmentResourcesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"outputs\": [{\"resource_id\": \"resourceId\", \"cloud_resource_name\": \"cloudResourceName\", \"terraform_resource_name\": \"terraformResourceName\", \"crn\": \"crn\", \"resource_state\": \"resourceState\", \"tags\": [\"tags\"]}]}";
    String listEnvironmentResourcesPath = "/v2/environment/testString/resources";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListEnvironmentResourcesOptions model
    ListEnvironmentResourcesOptions listEnvironmentResourcesOptionsModel = new ListEnvironmentResourcesOptions.Builder()
    .environmentId("testString")
    .offset(Long.valueOf("0"))
    .limit(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CloudResourceList> response = schematics20ApiService.listEnvironmentResources(listEnvironmentResourcesOptionsModel).execute();
    assertNotNull(response);
    CloudResourceList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listEnvironmentResourcesPath);
  }

  // Test the listEnvironmentResources operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListEnvironmentResourcesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.listEnvironmentResources(null).execute();
  }

  @Test
  public void testGetKmsSettingsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"location\": \"location\", \"encryption_scheme\": \"encryptionScheme\", \"resource_group\": \"resourceGroup\", \"primary_crk\": {\"kms_name\": \"kmsName\", \"kms_private_endpoint\": \"kmsPrivateEndpoint\", \"key_crn\": \"keyCrn\"}, \"secondary_crk\": {\"kms_name\": \"kmsName\", \"kms_private_endpoint\": \"kmsPrivateEndpoint\", \"key_crn\": \"keyCrn\"}}";
    String getKmsSettingsPath = "/v2/settings/kms";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetKmsSettingsOptions model
    GetKmsSettingsOptions getKmsSettingsOptionsModel = new GetKmsSettingsOptions.Builder()
    .location("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<KMSSettings> response = schematics20ApiService.getKmsSettings(getKmsSettingsOptionsModel).execute();
    assertNotNull(response);
    KMSSettings responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("location"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getKmsSettingsPath);
  }

  // Test the getKmsSettings operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetKmsSettingsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.getKmsSettings(null).execute();
  }

  @Test
  public void testUpdateKmsSettingsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"location\": \"location\", \"encryption_scheme\": \"encryptionScheme\", \"resource_group\": \"resourceGroup\", \"primary_crk\": {\"kms_name\": \"kmsName\", \"kms_private_endpoint\": \"kmsPrivateEndpoint\", \"key_crn\": \"keyCrn\"}, \"secondary_crk\": {\"kms_name\": \"kmsName\", \"kms_private_endpoint\": \"kmsPrivateEndpoint\", \"key_crn\": \"keyCrn\"}}";
    String updateKmsSettingsPath = "/v2/settings/kms";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the KMSSettingsPrimaryCrk model
    KMSSettingsPrimaryCrk kmsSettingsPrimaryCrkModel = new KMSSettingsPrimaryCrk.Builder()
    .kmsName("testString")
    .kmsPrivateEndpoint("testString")
    .keyCrn("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the KMSSettingsSecondaryCrk model
    KMSSettingsSecondaryCrk kmsSettingsSecondaryCrkModel = new KMSSettingsSecondaryCrk.Builder()
    .kmsName("testString")
    .kmsPrivateEndpoint("testString")
    .keyCrn("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the KMSSettings model
    KMSSettings kmsSettingsModel = new KMSSettings.Builder()
    .location("testString")
    .encryptionScheme("testString")
    .resourceGroup("testString")
    .primaryCrk(kmsSettingsPrimaryCrkModel)
    .secondaryCrk(kmsSettingsSecondaryCrkModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the UpdateKmsSettingsOptions model
    UpdateKmsSettingsOptions updateKmsSettingsOptionsModel = new UpdateKmsSettingsOptions.Builder()
    .kmsSettings(kmsSettingsModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<KMSSettings> response = schematics20ApiService.updateKmsSettings(updateKmsSettingsOptionsModel).execute();
    assertNotNull(response);
    KMSSettings responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateKmsSettingsPath);
  }

  // Test the updateKmsSettings operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateKmsSettingsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.updateKmsSettings(null).execute();
  }

  @Test
  public void testListKmsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"limit\": 5, \"offset\": 6, \"kms_instances\": [{\"location\": \"location\", \"encryption_scheme\": \"encryptionScheme\", \"resource_group\": \"resourceGroup\", \"kms_crn\": \"kmsCrn\", \"kms_name\": \"kmsName\", \"kms_private_endpoint\": \"kmsPrivateEndpoint\", \"kms_public_endpoint\": \"kmsPublicEndpoint\", \"keys\": [{\"name\": \"name\", \"crn\": \"crn\", \"error\": \"error\"}]}]}";
    String listKmsPath = "/v2/settings/kms_instances";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListKmsOptions model
    ListKmsOptions listKmsOptionsModel = new ListKmsOptions.Builder()
    .encryptionScheme("testString")
    .location("testString")
    .resourceGroup("testString")
    .limit(Long.valueOf("1"))
    .sort("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<KMSDiscovery> response = schematics20ApiService.listKms(listKmsOptionsModel).execute();
    assertNotNull(response);
    KMSDiscovery responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("encryption_scheme"), "testString");
    assertEquals(query.get("location"), "testString");
    assertEquals(query.get("resource_group"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(query.get("sort"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listKmsPath);
  }

  // Test the listKms operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListKmsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.listKms(null).execute();
  }

  @Test
  public void testListLocationsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"locations\": [{\"region\": \"region\", \"metro\": \"metro\", \"geography_code\": \"geographyCode\", \"geography\": \"geography\", \"country\": \"country\", \"kind\": \"kind\", \"paired_region\": [\"pairedRegion\"], \"restricted\": true}]}";
    String listLocationsPath = "/v2/locations";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListLocationsOptions model
    ListLocationsOptions listLocationsOptionsModel = new ListLocationsOptions();

    // Invoke operation with valid options model (positive test)
    Response<SchematicsLocationsList> response = schematics20ApiService.listLocations(listLocationsOptionsModel).execute();
    assertNotNull(response);
    SchematicsLocationsList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listLocationsPath);
  }

  @Test
  public void testProcessTemplateMetaDataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"type\": \"type\", \"variables\": [{\"name\": \"name\", \"value\": \"value\", \"metadata\": {\"type\": \"boolean\", \"aliases\": [\"aliases\"], \"description\": \"description\", \"default_value\": \"defaultValue\", \"secure\": true, \"immutable\": false, \"hidden\": true, \"options\": [\"options\"], \"min_value\": 8, \"max_value\": 8, \"min_length\": 9, \"max_length\": 9, \"matches\": \"matches\", \"position\": 8, \"group_by\": \"groupBy\", \"source\": \"source\"}, \"link\": \"link\"}]}";
    String processTemplateMetaDataPath = "/v2/template_metadata_processor";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ExternalSourceGit model
    ExternalSourceGit externalSourceGitModel = new ExternalSourceGit.Builder()
    .computedGitRepoUrl("testString")
    .gitRepoUrl("testString")
    .gitToken("testString")
    .gitRepoFolder("testString")
    .gitRelease("testString")
    .gitBranch("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCatalog model
    ExternalSourceCatalog externalSourceCatalogModel = new ExternalSourceCatalog.Builder()
    .catalogName("testString")
    .offeringName("testString")
    .offeringVersion("testString")
    .offeringKind("testString")
    .offeringId("testString")
    .offeringVersionId("testString")
    .offeringRepoUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSourceCosBucket model
    ExternalSourceCosBucket externalSourceCosBucketModel = new ExternalSourceCosBucket.Builder()
    .cosBucketUrl("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ExternalSource model
    ExternalSource externalSourceModel = new ExternalSource.Builder()
    .sourceType("local")
    .git(externalSourceGitModel)
    .catalog(externalSourceCatalogModel)
    .cosBucket(externalSourceCosBucketModel)
    .add("foo", "testString")
    .build();

    // Construct an instance of the TemplateMetaDataRequest model
    TemplateMetaDataRequest templateMetaDataRequestModel = new TemplateMetaDataRequest.Builder()
    .region("testString")
    .templateType("testString")
    .source(externalSourceModel)
    .sourceType("local")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ProcessTemplateMetaDataOptions model
    ProcessTemplateMetaDataOptions processTemplateMetaDataOptionsModel = new ProcessTemplateMetaDataOptions.Builder()
    .templateMetaDataRequest(templateMetaDataRequestModel)
    .xGithubToken("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<TemplateMetaDataResponse> response = schematics20ApiService.processTemplateMetaData(processTemplateMetaDataOptionsModel).execute();
    assertNotNull(response);
    TemplateMetaDataResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNull(query);

    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, processTemplateMetaDataPath);
  }

  // Test the processTemplateMetaData operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testProcessTemplateMetaDataNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    schematics20ApiService.processTemplateMetaData(null).execute();
  }

  /** Initialize the server */
  @BeforeMethod
  public void setUpMockServer() {
    try {
        server = new MockWebServer();
        // register handler
        server.start();
        }
    catch (IOException err) {
        fail("Failed to instantiate mock web server");
    }
  }

  @AfterMethod
  public void tearDownMockServer() throws IOException {
    server.shutdown();
    schematics20ApiService = null;
  }
}