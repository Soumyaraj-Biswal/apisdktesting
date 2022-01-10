// +build examples

/**
 * (C) Copyright IBM Corp. 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package schematicsv1_test

import (
	"com.ibm.cloud/schematicsv1"
	"encoding/json"
	"fmt"
	"github.com/IBM/go-sdk-core/v5/core"
	. "github.com/onsi/ginkgo"
	. "github.com/onsi/gomega"
	"os"
)

const externalConfigFile = "../schematics_v1.env"

var (
	schematicsService *schematicsv1.SchematicsV1
	config       map[string]string
	configLoaded bool = false
)

func shouldSkipTest() {
	if !configLoaded {
		Skip("External configuration is not available, skipping tests...")
	}
}

var _ = Describe(`SchematicsV1 Examples Tests`, func() {
	Describe(`External configuration`, func() {
		It("Successfully load the configuration", func() {
			var err error
			_, err = os.Stat(externalConfigFile)
			if err != nil {
				Skip("External configuration file not found, skipping tests: " + err.Error())
			}

			os.Setenv("IBM_CREDENTIALS_FILE", externalConfigFile)
			config, err = core.GetServiceProperties(schematicsv1.DefaultServiceName)
			if err != nil {
				Skip("Error loading service properties, skipping tests: " + err.Error())
			}

			configLoaded = len(config) > 0
		})
	})

	Describe(`Client initialization`, func() {
		BeforeEach(func() {
			shouldSkipTest()
		})
		It("Successfully construct the service client instance", func() {
			var err error

			// begin-common

			schematicsServiceOptions := &schematicsv1.SchematicsV1Options{}

			schematicsService, err = schematicsv1.NewSchematicsV1UsingExternalConfig(schematicsServiceOptions)

			if err != nil {
				panic(err)
			}

			// end-common

			Expect(schematicsService).ToNot(BeNil())
		})
	})

	Describe(`SchematicsV1 request examples`, func() {
		BeforeEach(func() {
			shouldSkipTest()
		})
		It(`ListSchematicsLocation request example`, func() {
			// begin-list_schematics_location

			listSchematicsLocationOptions := schematicsService.NewListSchematicsLocationOptions()

			schematicsLocations, response, err := schematicsService.ListSchematicsLocation(listSchematicsLocationOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(schematicsLocations, "", "  ")
			fmt.Println(string(b))

			// end-list_schematics_location

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(schematicsLocations).ToNot(BeNil())

		})
		It(`ListResourceGroup request example`, func() {
			// begin-list_resource_group

			listResourceGroupOptions := schematicsService.NewListResourceGroupOptions()

			resourceGroupResponse, response, err := schematicsService.ListResourceGroup(listResourceGroupOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(resourceGroupResponse, "", "  ")
			fmt.Println(string(b))

			// end-list_resource_group

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(resourceGroupResponse).ToNot(BeNil())

		})
		It(`GetSchematicsVersion request example`, func() {
			// begin-get_schematics_version

			getSchematicsVersionOptions := schematicsService.NewGetSchematicsVersionOptions()

			versionResponse, response, err := schematicsService.GetSchematicsVersion(getSchematicsVersionOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(versionResponse, "", "  ")
			fmt.Println(string(b))

			// end-get_schematics_version

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(versionResponse).ToNot(BeNil())

		})
		It(`ListLocations request example`, func() {
			// begin-list_locations

			listLocationsOptions := schematicsService.NewListLocationsOptions()

			schematicsLocationsList, response, err := schematicsService.ListLocations(listLocationsOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(schematicsLocationsList, "", "  ")
			fmt.Println(string(b))

			// end-list_locations

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(schematicsLocationsList).ToNot(BeNil())

		})
		It(`ProcessTemplateMetaData request example`, func() {
			// begin-ProcessTemplateMetaData

			externalSourceModel := &schematicsv1.ExternalSource{
				SourceType: core.StringPtr("local"),
			}

			processTemplateMetaDataOptions := schematicsService.NewProcessTemplateMetaDataOptions(
				"testString",
				externalSourceModel,
			)

			templateMetaDataResponse, response, err := schematicsService.ProcessTemplateMetaData(processTemplateMetaDataOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(templateMetaDataResponse, "", "  ")
			fmt.Println(string(b))

			// end-ProcessTemplateMetaData

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(templateMetaDataResponse).ToNot(BeNil())

		})
		It(`ListWorkspaces request example`, func() {
			// begin-list_workspaces

			listWorkspacesOptions := schematicsService.NewListWorkspacesOptions()

			workspaceResponseList, response, err := schematicsService.ListWorkspaces(listWorkspacesOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceResponseList, "", "  ")
			fmt.Println(string(b))

			// end-list_workspaces

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(workspaceResponseList).ToNot(BeNil())

		})
		It(`CreateWorkspace request example`, func() {
			// begin-create_workspace

			createWorkspaceOptions := schematicsService.NewCreateWorkspaceOptions()

			workspaceResponse, response, err := schematicsService.CreateWorkspace(createWorkspaceOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceResponse, "", "  ")
			fmt.Println(string(b))

			// end-create_workspace

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(201))
			Expect(workspaceResponse).ToNot(BeNil())

		})
		It(`GetWorkspace request example`, func() {
			// begin-get_workspace

			getWorkspaceOptions := schematicsService.NewGetWorkspaceOptions(
				"testString",
			)

			workspaceResponse, response, err := schematicsService.GetWorkspace(getWorkspaceOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceResponse, "", "  ")
			fmt.Println(string(b))

			// end-get_workspace

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(workspaceResponse).ToNot(BeNil())

		})
		It(`ReplaceWorkspace request example`, func() {
			// begin-replace_workspace

			replaceWorkspaceOptions := schematicsService.NewReplaceWorkspaceOptions(
				"testString",
			)

			workspaceResponse, response, err := schematicsService.ReplaceWorkspace(replaceWorkspaceOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceResponse, "", "  ")
			fmt.Println(string(b))

			// end-replace_workspace

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(workspaceResponse).ToNot(BeNil())

		})
		It(`UpdateWorkspace request example`, func() {
			// begin-update_workspace

			updateWorkspaceOptions := schematicsService.NewUpdateWorkspaceOptions(
				"testString",
			)

			workspaceResponse, response, err := schematicsService.UpdateWorkspace(updateWorkspaceOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceResponse, "", "  ")
			fmt.Println(string(b))

			// end-update_workspace

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(workspaceResponse).ToNot(BeNil())

		})
		It(`GetWorkspaceReadme request example`, func() {
			// begin-get_workspace_readme

			getWorkspaceReadmeOptions := schematicsService.NewGetWorkspaceReadmeOptions(
				"testString",
			)

			templateReadme, response, err := schematicsService.GetWorkspaceReadme(getWorkspaceReadmeOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(templateReadme, "", "  ")
			fmt.Println(string(b))

			// end-get_workspace_readme

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(templateReadme).ToNot(BeNil())

		})
		It(`TemplateRepoUpload request example`, func() {
			// begin-template_repo_upload

			templateRepoUploadOptions := schematicsService.NewTemplateRepoUploadOptions(
				"testString",
				"testString",
			)

			templateRepoTarUploadResponse, response, err := schematicsService.TemplateRepoUpload(templateRepoUploadOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(templateRepoTarUploadResponse, "", "  ")
			fmt.Println(string(b))

			// end-template_repo_upload

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(templateRepoTarUploadResponse).ToNot(BeNil())

		})
		It(`GetWorkspaceInputs request example`, func() {
			// begin-get_workspace_inputs

			getWorkspaceInputsOptions := schematicsService.NewGetWorkspaceInputsOptions(
				"testString",
				"testString",
			)

			templateValues, response, err := schematicsService.GetWorkspaceInputs(getWorkspaceInputsOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(templateValues, "", "  ")
			fmt.Println(string(b))

			// end-get_workspace_inputs

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(templateValues).ToNot(BeNil())

		})
		It(`ReplaceWorkspaceInputs request example`, func() {
			// begin-replace_workspace_inputs

			replaceWorkspaceInputsOptions := schematicsService.NewReplaceWorkspaceInputsOptions(
				"testString",
				"testString",
			)

			userValues, response, err := schematicsService.ReplaceWorkspaceInputs(replaceWorkspaceInputsOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(userValues, "", "  ")
			fmt.Println(string(b))

			// end-replace_workspace_inputs

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(userValues).ToNot(BeNil())

		})
		It(`GetAllWorkspaceInputs request example`, func() {
			// begin-get_all_workspace_inputs

			getAllWorkspaceInputsOptions := schematicsService.NewGetAllWorkspaceInputsOptions(
				"testString",
			)

			workspaceTemplateValuesResponse, response, err := schematicsService.GetAllWorkspaceInputs(getAllWorkspaceInputsOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceTemplateValuesResponse, "", "  ")
			fmt.Println(string(b))

			// end-get_all_workspace_inputs

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(workspaceTemplateValuesResponse).ToNot(BeNil())

		})
		It(`GetWorkspaceInputMetadata request example`, func() {
			// begin-get_workspace_input_metadata

			getWorkspaceInputMetadataOptions := schematicsService.NewGetWorkspaceInputMetadataOptions(
				"testString",
				"testString",
			)

			result, response, err := schematicsService.GetWorkspaceInputMetadata(getWorkspaceInputMetadataOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(result, "", "  ")
			fmt.Println(string(b))

			// end-get_workspace_input_metadata

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(result).ToNot(BeNil())

		})
		It(`GetWorkspaceOutputs request example`, func() {
			// begin-get_workspace_outputs

			getWorkspaceOutputsOptions := schematicsService.NewGetWorkspaceOutputsOptions(
				"testString",
			)

			outputValuesInner, response, err := schematicsService.GetWorkspaceOutputs(getWorkspaceOutputsOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(outputValuesInner, "", "  ")
			fmt.Println(string(b))

			// end-get_workspace_outputs

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(outputValuesInner).ToNot(BeNil())

		})
		It(`GetWorkspaceResources request example`, func() {
			// begin-get_workspace_resources

			getWorkspaceResourcesOptions := schematicsService.NewGetWorkspaceResourcesOptions(
				"testString",
			)

			templateResources, response, err := schematicsService.GetWorkspaceResources(getWorkspaceResourcesOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(templateResources, "", "  ")
			fmt.Println(string(b))

			// end-get_workspace_resources

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(templateResources).ToNot(BeNil())

		})
		It(`GetWorkspaceState request example`, func() {
			// begin-get_workspace_state

			getWorkspaceStateOptions := schematicsService.NewGetWorkspaceStateOptions(
				"testString",
			)

			stateStoreResponseList, response, err := schematicsService.GetWorkspaceState(getWorkspaceStateOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(stateStoreResponseList, "", "  ")
			fmt.Println(string(b))

			// end-get_workspace_state

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(stateStoreResponseList).ToNot(BeNil())

		})
		It(`GetWorkspaceTemplateState request example`, func() {
			// begin-get_workspace_template_state

			getWorkspaceTemplateStateOptions := schematicsService.NewGetWorkspaceTemplateStateOptions(
				"testString",
				"testString",
			)

			templateStateStore, response, err := schematicsService.GetWorkspaceTemplateState(getWorkspaceTemplateStateOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(templateStateStore, "", "  ")
			fmt.Println(string(b))

			// end-get_workspace_template_state

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(templateStateStore).ToNot(BeNil())

		})
		It(`GetWorkspaceActivityLogs request example`, func() {
			// begin-get_workspace_activity_logs

			getWorkspaceActivityLogsOptions := schematicsService.NewGetWorkspaceActivityLogsOptions(
				"testString",
				"testString",
			)

			workspaceActivityLogs, response, err := schematicsService.GetWorkspaceActivityLogs(getWorkspaceActivityLogsOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceActivityLogs, "", "  ")
			fmt.Println(string(b))

			// end-get_workspace_activity_logs

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(workspaceActivityLogs).ToNot(BeNil())

		})
		It(`GetWorkspaceLogUrls request example`, func() {
			// begin-get_workspace_log_urls

			getWorkspaceLogUrlsOptions := schematicsService.NewGetWorkspaceLogUrlsOptions(
				"testString",
			)

			logStoreResponseList, response, err := schematicsService.GetWorkspaceLogUrls(getWorkspaceLogUrlsOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(logStoreResponseList, "", "  ")
			fmt.Println(string(b))

			// end-get_workspace_log_urls

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(logStoreResponseList).ToNot(BeNil())

		})
		It(`GetTemplateLogs request example`, func() {
			// begin-get_template_logs

			getTemplateLogsOptions := schematicsService.NewGetTemplateLogsOptions(
				"testString",
				"testString",
			)

			templateLogStoreString, response, err := schematicsService.GetTemplateLogs(getTemplateLogsOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(templateLogStoreString, "", "  ")
			fmt.Println(string(b))

			// end-get_template_logs

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(templateLogStoreString).ToNot(BeNil())

		})
		It(`GetTemplateActivityLog request example`, func() {
			// begin-get_template_activity_log

			getTemplateActivityLogOptions := schematicsService.NewGetTemplateActivityLogOptions(
				"testString",
				"testString",
				"testString",
			)

			workspaceActivityTemplateLogString, response, err := schematicsService.GetTemplateActivityLog(getTemplateActivityLogOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceActivityTemplateLogString, "", "  ")
			fmt.Println(string(b))

			// end-get_template_activity_log

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(workspaceActivityTemplateLogString).ToNot(BeNil())

		})
		It(`ListActions request example`, func() {
			// begin-list_actions

			listActionsOptions := schematicsService.NewListActionsOptions()

			actionList, response, err := schematicsService.ListActions(listActionsOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(actionList, "", "  ")
			fmt.Println(string(b))

			// end-list_actions

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(actionList).ToNot(BeNil())

		})
		It(`CreateAction request example`, func() {
			// begin-create_action

			createActionOptions := schematicsService.NewCreateActionOptions()

			actionList, response, err := schematicsService.CreateAction(createActionOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(actionList, "", "  ")
			fmt.Println(string(b))

			// end-create_action

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(201))
			Expect(actionList).ToNot(BeNil())

		})
		It(`GetAction request example`, func() {
			// begin-get_action

			getActionOptions := schematicsService.NewGetActionOptions(
				"testString",
			)

			action, response, err := schematicsService.GetAction(getActionOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(action, "", "  ")
			fmt.Println(string(b))

			// end-get_action

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(action).ToNot(BeNil())

		})
		It(`UpdateAction request example`, func() {
			// begin-update_action

			updateActionOptions := schematicsService.NewUpdateActionOptions(
				"testString",
			)

			action, response, err := schematicsService.UpdateAction(updateActionOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(action, "", "  ")
			fmt.Println(string(b))

			// end-update_action

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(action).ToNot(BeNil())

		})
		It(`UploadTemplateTarAction request example`, func() {
			// begin-upload_template_tar_action

			uploadTemplateTarActionOptions := schematicsService.NewUploadTemplateTarActionOptions(
				"testString",
			)

			templateRepoTarUploadResponse, response, err := schematicsService.UploadTemplateTarAction(uploadTemplateTarActionOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(templateRepoTarUploadResponse, "", "  ")
			fmt.Println(string(b))

			// end-upload_template_tar_action

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(templateRepoTarUploadResponse).ToNot(BeNil())

		})
		It(`ListWorkspaceActivities request example`, func() {
			// begin-list_workspace_activities

			listWorkspaceActivitiesOptions := schematicsService.NewListWorkspaceActivitiesOptions(
				"testString",
			)

			workspaceActivities, response, err := schematicsService.ListWorkspaceActivities(listWorkspaceActivitiesOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceActivities, "", "  ")
			fmt.Println(string(b))

			// end-list_workspace_activities

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(workspaceActivities).ToNot(BeNil())

		})
		It(`GetWorkspaceActivity request example`, func() {
			// begin-get_workspace_activity

			getWorkspaceActivityOptions := schematicsService.NewGetWorkspaceActivityOptions(
				"testString",
				"testString",
			)

			workspaceActivity, response, err := schematicsService.GetWorkspaceActivity(getWorkspaceActivityOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceActivity, "", "  ")
			fmt.Println(string(b))

			// end-get_workspace_activity

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(workspaceActivity).ToNot(BeNil())

		})
		It(`RunWorkspaceCommands request example`, func() {
			// begin-run_workspace_commands

			runWorkspaceCommandsOptions := schematicsService.NewRunWorkspaceCommandsOptions(
				"testString",
				"testString",
			)

			workspaceActivityCommandResult, response, err := schematicsService.RunWorkspaceCommands(runWorkspaceCommandsOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceActivityCommandResult, "", "  ")
			fmt.Println(string(b))

			// end-run_workspace_commands

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(workspaceActivityCommandResult).ToNot(BeNil())

		})
		It(`ApplyWorkspaceCommand request example`, func() {
			// begin-apply_workspace_command

			applyWorkspaceCommandOptions := schematicsService.NewApplyWorkspaceCommandOptions(
				"testString",
				"testString",
			)

			workspaceActivityApplyResult, response, err := schematicsService.ApplyWorkspaceCommand(applyWorkspaceCommandOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceActivityApplyResult, "", "  ")
			fmt.Println(string(b))

			// end-apply_workspace_command

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(202))
			Expect(workspaceActivityApplyResult).ToNot(BeNil())

		})
		It(`DestroyWorkspaceCommand request example`, func() {
			// begin-destroy_workspace_command

			destroyWorkspaceCommandOptions := schematicsService.NewDestroyWorkspaceCommandOptions(
				"testString",
				"testString",
			)

			workspaceActivityDestroyResult, response, err := schematicsService.DestroyWorkspaceCommand(destroyWorkspaceCommandOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceActivityDestroyResult, "", "  ")
			fmt.Println(string(b))

			// end-destroy_workspace_command

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(202))
			Expect(workspaceActivityDestroyResult).ToNot(BeNil())

		})
		It(`PlanWorkspaceCommand request example`, func() {
			// begin-plan_workspace_command

			planWorkspaceCommandOptions := schematicsService.NewPlanWorkspaceCommandOptions(
				"testString",
				"testString",
			)

			workspaceActivityPlanResult, response, err := schematicsService.PlanWorkspaceCommand(planWorkspaceCommandOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceActivityPlanResult, "", "  ")
			fmt.Println(string(b))

			// end-plan_workspace_command

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(202))
			Expect(workspaceActivityPlanResult).ToNot(BeNil())

		})
		It(`RefreshWorkspaceCommand request example`, func() {
			// begin-refresh_workspace_command

			refreshWorkspaceCommandOptions := schematicsService.NewRefreshWorkspaceCommandOptions(
				"testString",
				"testString",
			)

			workspaceActivityRefreshResult, response, err := schematicsService.RefreshWorkspaceCommand(refreshWorkspaceCommandOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceActivityRefreshResult, "", "  ")
			fmt.Println(string(b))

			// end-refresh_workspace_command

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(202))
			Expect(workspaceActivityRefreshResult).ToNot(BeNil())

		})
		It(`ListJobs request example`, func() {
			// begin-list_jobs

			listJobsOptions := schematicsService.NewListJobsOptions()

			jobList, response, err := schematicsService.ListJobs(listJobsOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(jobList, "", "  ")
			fmt.Println(string(b))

			// end-list_jobs

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(jobList).ToNot(BeNil())

		})
		It(`CreateJob request example`, func() {
			// begin-create_job

			createJobOptions := schematicsService.NewCreateJobOptions(
				"testString",
			)

			job, response, err := schematicsService.CreateJob(createJobOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(job, "", "  ")
			fmt.Println(string(b))

			// end-create_job

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(201))
			Expect(job).ToNot(BeNil())

		})
		It(`GetJob request example`, func() {
			// begin-get_job

			getJobOptions := schematicsService.NewGetJobOptions(
				"testString",
			)

			job, response, err := schematicsService.GetJob(getJobOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(job, "", "  ")
			fmt.Println(string(b))

			// end-get_job

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(job).ToNot(BeNil())

		})
		It(`UpdateJob request example`, func() {
			// begin-update_job

			updateJobOptions := schematicsService.NewUpdateJobOptions(
				"testString",
				"testString",
			)

			job, response, err := schematicsService.UpdateJob(updateJobOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(job, "", "  ")
			fmt.Println(string(b))

			// end-update_job

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(job).ToNot(BeNil())

		})
		It(`ListJobLogs request example`, func() {
			// begin-list_job_logs

			listJobLogsOptions := schematicsService.NewListJobLogsOptions(
				"testString",
			)

			jobLog, response, err := schematicsService.ListJobLogs(listJobLogsOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(jobLog, "", "  ")
			fmt.Println(string(b))

			// end-list_job_logs

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(jobLog).ToNot(BeNil())

		})
		It(`CreateWorkspaceDeletionJob request example`, func() {
			// begin-create_workspace_deletion_job

			createWorkspaceDeletionJobOptions := schematicsService.NewCreateWorkspaceDeletionJobOptions(
				"testString",
			)

			workspaceBulkDeleteResponse, response, err := schematicsService.CreateWorkspaceDeletionJob(createWorkspaceDeletionJobOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceBulkDeleteResponse, "", "  ")
			fmt.Println(string(b))

			// end-create_workspace_deletion_job

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(workspaceBulkDeleteResponse).ToNot(BeNil())

		})
		It(`GetWorkspaceDeletionJobStatus request example`, func() {
			// begin-get_workspace_deletion_job_status

			getWorkspaceDeletionJobStatusOptions := schematicsService.NewGetWorkspaceDeletionJobStatusOptions(
				"testString",
			)

			workspaceJobResponse, response, err := schematicsService.GetWorkspaceDeletionJobStatus(getWorkspaceDeletionJobStatusOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceJobResponse, "", "  ")
			fmt.Println(string(b))

			// end-get_workspace_deletion_job_status

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(workspaceJobResponse).ToNot(BeNil())

		})
		It(`ListInventories request example`, func() {
			// begin-list_inventories

			listInventoriesOptions := schematicsService.NewListInventoriesOptions()

			inventoryResourceRecordList, response, err := schematicsService.ListInventories(listInventoriesOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(inventoryResourceRecordList, "", "  ")
			fmt.Println(string(b))

			// end-list_inventories

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(inventoryResourceRecordList).ToNot(BeNil())

		})
		It(`CreateInventory request example`, func() {
			// begin-create_inventory

			createInventoryOptions := schematicsService.NewCreateInventoryOptions()

			inventoryResourceRecord, response, err := schematicsService.CreateInventory(createInventoryOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(inventoryResourceRecord, "", "  ")
			fmt.Println(string(b))

			// end-create_inventory

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(inventoryResourceRecord).ToNot(BeNil())

		})
		It(`GetInventory request example`, func() {
			// begin-get_inventory

			getInventoryOptions := schematicsService.NewGetInventoryOptions(
				"testString",
			)

			inventoryResourceRecord, response, err := schematicsService.GetInventory(getInventoryOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(inventoryResourceRecord, "", "  ")
			fmt.Println(string(b))

			// end-get_inventory

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(inventoryResourceRecord).ToNot(BeNil())

		})
		It(`ReplaceInventory request example`, func() {
			// begin-replace_inventory

			replaceInventoryOptions := schematicsService.NewReplaceInventoryOptions(
				"testString",
			)

			inventoryResourceRecord, response, err := schematicsService.ReplaceInventory(replaceInventoryOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(inventoryResourceRecord, "", "  ")
			fmt.Println(string(b))

			// end-replace_inventory

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(inventoryResourceRecord).ToNot(BeNil())

		})
		It(`UpdateInventory request example`, func() {
			// begin-update_inventory

			updateInventoryOptions := schematicsService.NewUpdateInventoryOptions(
				"testString",
			)

			inventoryResourceRecord, response, err := schematicsService.UpdateInventory(updateInventoryOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(inventoryResourceRecord, "", "  ")
			fmt.Println(string(b))

			// end-update_inventory

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(inventoryResourceRecord).ToNot(BeNil())

		})
		It(`ListInventoryValues request example`, func() {
			// begin-list_inventory_values

			listInventoryValuesOptions := schematicsService.NewListInventoryValuesOptions(
				"testString",
			)

			inventoryResourceRecordList, response, err := schematicsService.ListInventoryValues(listInventoryValuesOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(inventoryResourceRecordList, "", "  ")
			fmt.Println(string(b))

			// end-list_inventory_values

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(inventoryResourceRecordList).ToNot(BeNil())

		})
		It(`GetInventoryValue request example`, func() {
			// begin-get_inventory_value

			getInventoryValueOptions := schematicsService.NewGetInventoryValueOptions(
				"testString",
				"testString",
			)

			inventoryResourceRecord, response, err := schematicsService.GetInventoryValue(getInventoryValueOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(inventoryResourceRecord, "", "  ")
			fmt.Println(string(b))

			// end-get_inventory_value

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(inventoryResourceRecord).ToNot(BeNil())

		})
		It(`ListResourceQuery request example`, func() {
			// begin-list_resource_query

			listResourceQueryOptions := schematicsService.NewListResourceQueryOptions()

			resourceQueryRecordList, response, err := schematicsService.ListResourceQuery(listResourceQueryOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(resourceQueryRecordList, "", "  ")
			fmt.Println(string(b))

			// end-list_resource_query

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(resourceQueryRecordList).ToNot(BeNil())

		})
		It(`CreateResourceQuery request example`, func() {
			// begin-create_resource_query

			createResourceQueryOptions := schematicsService.NewCreateResourceQueryOptions()

			resourceQueryRecord, response, err := schematicsService.CreateResourceQuery(createResourceQueryOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(resourceQueryRecord, "", "  ")
			fmt.Println(string(b))

			// end-create_resource_query

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(resourceQueryRecord).ToNot(BeNil())

		})
		It(`GetResourcesQuery request example`, func() {
			// begin-get_resources_query

			getResourcesQueryOptions := schematicsService.NewGetResourcesQueryOptions(
				"testString",
			)

			resourceQueryRecord, response, err := schematicsService.GetResourcesQuery(getResourcesQueryOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(resourceQueryRecord, "", "  ")
			fmt.Println(string(b))

			// end-get_resources_query

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(resourceQueryRecord).ToNot(BeNil())

		})
		It(`ReplaceResourcesQuery request example`, func() {
			// begin-replace_resources_query

			replaceResourcesQueryOptions := schematicsService.NewReplaceResourcesQueryOptions(
				"testString",
			)

			resourceQueryRecord, response, err := schematicsService.ReplaceResourcesQuery(replaceResourcesQueryOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(resourceQueryRecord, "", "  ")
			fmt.Println(string(b))

			// end-replace_resources_query

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(resourceQueryRecord).ToNot(BeNil())

		})
		It(`ExecuteResourceQuery request example`, func() {
			// begin-execute_resource_query

			executeResourceQueryOptions := schematicsService.NewExecuteResourceQueryOptions(
				"testString",
			)

			resourceQueryResponseRecord, response, err := schematicsService.ExecuteResourceQuery(executeResourceQueryOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(resourceQueryResponseRecord, "", "  ")
			fmt.Println(string(b))

			// end-execute_resource_query

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(resourceQueryResponseRecord).ToNot(BeNil())

		})
		It(`GetKmsSettings request example`, func() {
			// begin-get_kms_settings

			getKmsSettingsOptions := schematicsService.NewGetKmsSettingsOptions(
				"testString",
			)

			kmsSettings, response, err := schematicsService.GetKmsSettings(getKmsSettingsOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(kmsSettings, "", "  ")
			fmt.Println(string(b))

			// end-get_kms_settings

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(kmsSettings).ToNot(BeNil())

		})
		It(`UpdateKmsSettings request example`, func() {
			// begin-update_kms_settings

			updateKmsSettingsOptions := schematicsService.NewUpdateKmsSettingsOptions()

			kmsSettings, response, err := schematicsService.UpdateKmsSettings(updateKmsSettingsOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(kmsSettings, "", "  ")
			fmt.Println(string(b))

			// end-update_kms_settings

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(kmsSettings).ToNot(BeNil())

		})
		It(`ListKms request example`, func() {
			// begin-list_kms

			listKmsOptions := schematicsService.NewListKmsOptions(
				"testString",
				"testString",
			)

			kmsDiscovery, response, err := schematicsService.ListKms(listKmsOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(kmsDiscovery, "", "  ")
			fmt.Println(string(b))

			// end-list_kms

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(kmsDiscovery).ToNot(BeNil())

		})
		It(`DeleteWorkspaceActivity request example`, func() {
			// begin-delete_workspace_activity

			deleteWorkspaceActivityOptions := schematicsService.NewDeleteWorkspaceActivityOptions(
				"testString",
				"testString",
			)

			workspaceActivityApplyResult, response, err := schematicsService.DeleteWorkspaceActivity(deleteWorkspaceActivityOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceActivityApplyResult, "", "  ")
			fmt.Println(string(b))

			// end-delete_workspace_activity

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(202))
			Expect(workspaceActivityApplyResult).ToNot(BeNil())

		})
		It(`DeleteWorkspace request example`, func() {
			// begin-delete_workspace

			deleteWorkspaceOptions := schematicsService.NewDeleteWorkspaceOptions(
				"testString",
			)

			workspaceDeleteResponse, response, err := schematicsService.DeleteWorkspace(deleteWorkspaceOptions)
			if err != nil {
				panic(err)
			}
			b, _ := json.MarshalIndent(workspaceDeleteResponse, "", "  ")
			fmt.Println(string(b))

			// end-delete_workspace

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(200))
			Expect(workspaceDeleteResponse).ToNot(BeNil())

		})
		It(`DeleteResourcesQuery request example`, func() {
			// begin-delete_resources_query

			deleteResourcesQueryOptions := schematicsService.NewDeleteResourcesQueryOptions(
				"testString",
			)

			response, err := schematicsService.DeleteResourcesQuery(deleteResourcesQueryOptions)
			if err != nil {
				panic(err)
			}

			// end-delete_resources_query

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(204))

		})
		It(`DeleteJob request example`, func() {
			// begin-delete_job

			deleteJobOptions := schematicsService.NewDeleteJobOptions(
				"testString",
				"testString",
			)

			response, err := schematicsService.DeleteJob(deleteJobOptions)
			if err != nil {
				panic(err)
			}

			// end-delete_job

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(204))

		})
		It(`DeleteInventory request example`, func() {
			// begin-delete_inventory

			deleteInventoryOptions := schematicsService.NewDeleteInventoryOptions(
				"testString",
			)

			response, err := schematicsService.DeleteInventory(deleteInventoryOptions)
			if err != nil {
				panic(err)
			}

			// end-delete_inventory

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(204))

		})
		It(`DeleteAction request example`, func() {
			// begin-delete_action

			deleteActionOptions := schematicsService.NewDeleteActionOptions(
				"testString",
			)

			response, err := schematicsService.DeleteAction(deleteActionOptions)
			if err != nil {
				panic(err)
			}

			// end-delete_action

			Expect(err).To(BeNil())
			Expect(response.StatusCode).To(Equal(204))

		})
	})
})
