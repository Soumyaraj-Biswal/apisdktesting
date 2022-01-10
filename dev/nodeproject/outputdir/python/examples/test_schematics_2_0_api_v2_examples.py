# -*- coding: utf-8 -*-
# (C) Copyright IBM Corp. 2021.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

"""
Examples for Schematics20ApiV2
"""

import os
import pytest
from ibm_cloud_sdk_core import ApiException, read_external_sources
from com.ibm.cloud.schematics_2_0_api_v2 import *

# Config file name
config_file = 'schematics20_api_v2.env'

schematics_2_0_api_service = None

config = None


##############################################################################
# Start of Examples for Service: Schematics20ApiV2
##############################################################################
# region
class TestSchematics20ApiV2Examples():
    """
    Example Test Class for Schematics20ApiV2
    """

    @classmethod
    def setup_class(cls):
        global schematics_2_0_api_service
        if os.path.exists(config_file):
            os.environ['IBM_CREDENTIALS_FILE'] = config_file

            # begin-common

            schematics_2_0_api_service = Schematics20ApiV2.new_instance(
            )

            # end-common
            assert schematics_2_0_api_service is not None

            # Load the configuration
            global config
            config = read_external_sources(Schematics20ApiV2.DEFAULT_SERVICE_NAME)

        print('Setup complete.')

    needscredentials = pytest.mark.skipif(
        not os.path.exists(config_file), reason="External configuration not available, skipping..."
    )

    @needscredentials
    def test_get_schematics_info_example(self):
        """
        get_schematics_info request example
        """
        try:
            # begin-get_schematics_info

            schematics_info = schematics_2_0_api_service.get_schematics_info().get_result()

            print(json.dumps(schematics_info, indent=2))

            # end-get_schematics_info

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_schematics_access_rules_example(self):
        """
        list_schematics_access_rules request example
        """
        try:
            # begin-list_schematics_access_rules

            schematics_access_rule_list = schematics_2_0_api_service.list_schematics_access_rules().get_result()

            print(json.dumps(schematics_access_rule_list, indent=2))

            # end-list_schematics_access_rules

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_schematics_access_rules_for_resource_example(self):
        """
        get_schematics_access_rules_for_resource request example
        """
        try:
            # begin-get_schematics_access_rules_for_resource

            schematics_access_rule_list = schematics_2_0_api_service.get_schematics_access_rules_for_resource(
                resource_name='testString'
            ).get_result()

            print(json.dumps(schematics_access_rule_list, indent=2))

            # end-get_schematics_access_rules_for_resource

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_schematics_command_names_example(self):
        """
        get_schematics_command_names request example
        """
        try:
            # begin-get_schematics_command_names

            command_list = schematics_2_0_api_service.get_schematics_command_names(
                resource_name='testString'
            ).get_result()

            print(json.dumps(command_list, indent=2))

            # end-get_schematics_command_names

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_workspaces_example(self):
        """
        list_workspaces request example
        """
        try:
            # begin-list_workspaces

            workspace_list = schematics_2_0_api_service.list_workspaces().get_result()

            print(json.dumps(workspace_list, indent=2))

            # end-list_workspaces

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_workspace_example(self):
        """
        create_workspace request example
        """
        try:
            # begin-create_workspace

            workspace_model = {
                'name': 'My Workspace',
                'resource_group': 'testString',
                'location': 'us-south'
            }

            workspace = schematics_2_0_api_service.create_workspace(
                workspace=workspace_model
            ).get_result()

            print(json.dumps(workspace, indent=2))

            # end-create_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_example(self):
        """
        get_workspace request example
        """
        try:
            # begin-get_workspace

            workspace = schematics_2_0_api_service.get_workspace(
                workspace_id='testString'
            ).get_result()

            print(json.dumps(workspace, indent=2))

            # end-get_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_replace_workspace_example(self):
        """
        replace_workspace request example
        """
        try:
            # begin-replace_workspace

            workspace_model = {
                'name': 'My Workspace',
                'resource_group': 'testString',
                'location': 'us-south'
            }

            workspace = schematics_2_0_api_service.replace_workspace(
                workspace_id='testString',
                workspace=workspace_model
            ).get_result()

            print(json.dumps(workspace, indent=2))

            # end-replace_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_update_workspace_example(self):
        """
        update_workspace request example
        """
        try:
            # begin-update_workspace

            workspace_model = {
                'name': 'My Workspace',
                'resource_group': 'testString',
                'location': 'us-south'
            }

            workspace = schematics_2_0_api_service.update_workspace(
                workspace_id='testString',
                workspace=workspace_model
            ).get_result()

            print(json.dumps(workspace, indent=2))

            # end-update_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_workspace_inputs_example(self):
        """
        list_workspace_inputs request example
        """
        try:
            # begin-list_workspace_inputs

            input_variable_data_list = schematics_2_0_api_service.list_workspace_inputs(
                workspace_id='testString'
            ).get_result()

            print(json.dumps(input_variable_data_list, indent=2))

            # end-list_workspace_inputs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_workspace_outputs_example(self):
        """
        list_workspace_outputs request example
        """
        try:
            # begin-list_workspace_outputs

            output_variable_data_list = schematics_2_0_api_service.list_workspace_outputs(
                workspace_id='testString'
            ).get_result()

            print(json.dumps(output_variable_data_list, indent=2))

            # end-list_workspace_outputs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_workspace_templates_example(self):
        """
        create_workspace_templates request example
        """
        try:
            # begin-create_workspace_templates

            template_list_request_model = {
            }

            workspace = schematics_2_0_api_service.create_workspace_templates(
                template_list_request=template_list_request_model
            ).get_result()

            print(json.dumps(workspace, indent=2))

            # end-create_workspace_templates

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_templates_in_workspace_example(self):
        """
        list_templates_in_workspace request example
        """
        try:
            # begin-list_templates_in_workspace

            template_list = schematics_2_0_api_service.list_templates_in_workspace(
                workspace_id='testString'
            ).get_result()

            print(json.dumps(template_list, indent=2))

            # end-list_templates_in_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_add_templates_to_workspace_example(self):
        """
        add_templates_to_workspace request example
        """
        try:
            # begin-add_templates_to_workspace

            template_model = {
            }

            template = schematics_2_0_api_service.add_templates_to_workspace(
                workspace_id='testString',
                template=template_model
            ).get_result()

            print(json.dumps(template, indent=2))

            # end-add_templates_to_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_template_in_workspace_example(self):
        """
        get_template_in_workspace request example
        """
        try:
            # begin-get_template_in_workspace

            template = schematics_2_0_api_service.get_template_in_workspace(
                workspace_id='testString',
                template_id='testString'
            ).get_result()

            print(json.dumps(template, indent=2))

            # end-get_template_in_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_replace_template_in_workspace_example(self):
        """
        replace_template_in_workspace request example
        """
        try:
            # begin-replace_template_in_workspace

            template = schematics_2_0_api_service.replace_template_in_workspace(
                workspace_id='testString',
                template_id='testString'
            ).get_result()

            print(json.dumps(template, indent=2))

            # end-replace_template_in_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_update_template_in_workspace_example(self):
        """
        update_template_in_workspace request example
        """
        try:
            # begin-update_template_in_workspace

            template = schematics_2_0_api_service.update_template_in_workspace(
                workspace_id='testString',
                template_id='testString'
            ).get_result()

            print(json.dumps(template, indent=2))

            # end-update_template_in_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_upload_template_tar_in_workspace_example(self):
        """
        upload_template_tar_in_workspace request example
        """
        try:
            # begin-upload_template_tar_in_workspace

            template = schematics_2_0_api_service.upload_template_tar_in_workspace(
                workspace_id='testString',
                template_id='testString'
            ).get_result()

            print(json.dumps(template, indent=2))

            # end-upload_template_tar_in_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_template_readme_example(self):
        """
        get_template_readme request example
        """
        try:
            # begin-get_template_readme

            result = schematics_2_0_api_service.get_template_readme(
                workspace_id='testString',
                template_id='testString'
            ).get_result()

            print(json.dumps(result, indent=2))

            # end-get_template_readme

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_template_source_example(self):
        """
        get_template_source request example
        """
        try:
            # begin-get_template_source

            external_source = schematics_2_0_api_service.get_template_source(
                workspace_id='testString',
                template_id='testString'
            ).get_result()

            print(json.dumps(external_source, indent=2))

            # end-get_template_source

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_template_inputs_example(self):
        """
        list_template_inputs request example
        """
        try:
            # begin-list_template_inputs

            variable_data_list = schematics_2_0_api_service.list_template_inputs(
                workspace_id='testString',
                template_id='testString'
            ).get_result()

            print(json.dumps(variable_data_list, indent=2))

            # end-list_template_inputs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_template_outputs_example(self):
        """
        list_template_outputs request example
        """
        try:
            # begin-list_template_outputs

            variable_data_list = schematics_2_0_api_service.list_template_outputs(
                workspace_id='testString',
                template_id='testString'
            ).get_result()

            print(json.dumps(variable_data_list, indent=2))

            # end-list_template_outputs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_flows_in_workspace_example(self):
        """
        list_flows_in_workspace request example
        """
        try:
            # begin-list_flows_in_workspace

            template_flow_list = schematics_2_0_api_service.list_flows_in_workspace(
                workspace_id='testString'
            ).get_result()

            print(json.dumps(template_flow_list, indent=2))

            # end-list_flows_in_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_add_flow_to_workspace_example(self):
        """
        add_flow_to_workspace request example
        """
        try:
            # begin-add_flow_to_workspace

            template_flow_model = {
            }

            template_flow = schematics_2_0_api_service.add_flow_to_workspace(
                workspace_id='testString',
                template_flow=template_flow_model
            ).get_result()

            print(json.dumps(template_flow, indent=2))

            # end-add_flow_to_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_flow_in_workspace_example(self):
        """
        get_flow_in_workspace request example
        """
        try:
            # begin-get_flow_in_workspace

            template_flow = schematics_2_0_api_service.get_flow_in_workspace(
                workspace_id='testString',
                flow_id='testString'
            ).get_result()

            print(json.dumps(template_flow, indent=2))

            # end-get_flow_in_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_replace_flow_in_workspace_example(self):
        """
        replace_flow_in_workspace request example
        """
        try:
            # begin-replace_flow_in_workspace

            template_flow = schematics_2_0_api_service.replace_flow_in_workspace(
                workspace_id='testString',
                flow_id='testString'
            ).get_result()

            print(json.dumps(template_flow, indent=2))

            # end-replace_flow_in_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_update_flow_in_workspace_example(self):
        """
        update_flow_in_workspace request example
        """
        try:
            # begin-update_flow_in_workspace

            template_flow = schematics_2_0_api_service.update_flow_in_workspace(
                workspace_id='testString',
                flow_id='testString'
            ).get_result()

            print(json.dumps(template_flow, indent=2))

            # end-update_flow_in_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_actions_example(self):
        """
        list_actions request example
        """
        try:
            # begin-list_actions

            action_list = schematics_2_0_api_service.list_actions().get_result()

            print(json.dumps(action_list, indent=2))

            # end-list_actions

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_action_example(self):
        """
        create_action request example
        """
        try:
            # begin-create_action

            action_model = {
            }

            action = schematics_2_0_api_service.create_action(
                action=action_model
            ).get_result()

            print(json.dumps(action, indent=2))

            # end-create_action

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_action_example(self):
        """
        get_action request example
        """
        try:
            # begin-get_action

            action = schematics_2_0_api_service.get_action(
                action_id='testString'
            ).get_result()

            print(json.dumps(action, indent=2))

            # end-get_action

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_update_action_example(self):
        """
        update_action request example
        """
        try:
            # begin-update_action

            action_model = {
            }

            action = schematics_2_0_api_service.update_action(
                action_id='testString',
                action=action_model
            ).get_result()

            print(json.dumps(action, indent=2))

            # end-update_action

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_upload_template_tar_action_example(self):
        """
        upload_template_tar_action request example
        """
        try:
            # begin-upload_template_tar_action

            template_repo_tar_upload_response = schematics_2_0_api_service.upload_template_tar_action(
                action_id='testString'
            ).get_result()

            print(json.dumps(template_repo_tar_upload_response, indent=2))

            # end-upload_template_tar_action

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_jobs_example(self):
        """
        list_jobs request example
        """
        try:
            # begin-list_jobs

            job_list = schematics_2_0_api_service.list_jobs().get_result()

            print(json.dumps(job_list, indent=2))

            # end-list_jobs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_job_example(self):
        """
        create_job request example
        """
        try:
            # begin-create_job

            job_model = {
            }

            job = schematics_2_0_api_service.create_job(
                refresh_token='testString',
                job=job_model
            ).get_result()

            print(json.dumps(job, indent=2))

            # end-create_job

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_job_example(self):
        """
        get_job request example
        """
        try:
            # begin-get_job

            job = schematics_2_0_api_service.get_job(
                job_id='testString'
            ).get_result()

            print(json.dumps(job, indent=2))

            # end-get_job

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_update_job_example(self):
        """
        update_job request example
        """
        try:
            # begin-update_job

            job_model = {
            }

            job = schematics_2_0_api_service.update_job(
                job_id='testString',
                refresh_token='testString',
                job=job_model
            ).get_result()

            print(json.dumps(job, indent=2))

            # end-update_job

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_job_logs_example(self):
        """
        list_job_logs request example
        """
        try:
            # begin-list_job_logs

            job_log = schematics_2_0_api_service.list_job_logs(
                job_id='testString'
            ).get_result()

            print(json.dumps(job_log, indent=2))

            # end-list_job_logs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_job_states_example(self):
        """
        list_job_states request example
        """
        try:
            # begin-list_job_states

            job_state_data = schematics_2_0_api_service.list_job_states(
                job_id='testString'
            ).get_result()

            print(json.dumps(job_state_data, indent=2))

            # end-list_job_states

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_controls_example(self):
        """
        list_controls request example
        """
        try:
            # begin-list_controls

            controls_list = schematics_2_0_api_service.list_controls().get_result()

            print(json.dumps(controls_list, indent=2))

            # end-list_controls

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_controls_example(self):
        """
        create_controls request example
        """
        try:
            # begin-create_controls

            controls_model = {
            }

            controls = schematics_2_0_api_service.create_controls(
                controls=controls_model
            ).get_result()

            print(json.dumps(controls, indent=2))

            # end-create_controls

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_controls_example(self):
        """
        get_controls request example
        """
        try:
            # begin-get_controls

            controls = schematics_2_0_api_service.get_controls(
                controls_id='testString'
            ).get_result()

            print(json.dumps(controls, indent=2))

            # end-get_controls

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_update_controls_example(self):
        """
        update_controls request example
        """
        try:
            # begin-update_controls

            controls_model = {
            }

            controls = schematics_2_0_api_service.update_controls(
                controls_id='testString',
                controls=controls_model
            ).get_result()

            print(json.dumps(controls, indent=2))

            # end-update_controls

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_capsules_example(self):
        """
        list_capsules request example
        """
        try:
            # begin-list_capsules

            capsule_list = schematics_2_0_api_service.list_capsules(
                controls_id='testString'
            ).get_result()

            print(json.dumps(capsule_list, indent=2))

            # end-list_capsules

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_capsule_example(self):
        """
        create_capsule request example
        """
        try:
            # begin-create_capsule

            capsule_model = {
            }

            capsule_list = schematics_2_0_api_service.create_capsule(
                controls_id='testString',
                capsule=capsule_model
            ).get_result()

            print(json.dumps(capsule_list, indent=2))

            # end-create_capsule

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_capsule_example(self):
        """
        get_capsule request example
        """
        try:
            # begin-get_capsule

            capsule = schematics_2_0_api_service.get_capsule(
                controls_id='testString',
                capsule_id='testString'
            ).get_result()

            print(json.dumps(capsule, indent=2))

            # end-get_capsule

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_update_capsule_example(self):
        """
        update_capsule request example
        """
        try:
            # begin-update_capsule

            capsule_model = {
            }

            capsule = schematics_2_0_api_service.update_capsule(
                controls_id='testString',
                capsule_id='testString',
                capsule=capsule_model
            ).get_result()

            print(json.dumps(capsule, indent=2))

            # end-update_capsule

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_datasets_example(self):
        """
        list_datasets request example
        """
        try:
            # begin-list_datasets

            dataset_list = schematics_2_0_api_service.list_datasets().get_result()

            print(json.dumps(dataset_list, indent=2))

            # end-list_datasets

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_dataset_example(self):
        """
        create_dataset request example
        """
        try:
            # begin-create_dataset

            dataset_model = {
            }

            dataset = schematics_2_0_api_service.create_dataset(
                dataset=dataset_model
            ).get_result()

            print(json.dumps(dataset, indent=2))

            # end-create_dataset

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_dataset_example(self):
        """
        get_dataset request example
        """
        try:
            # begin-get_dataset

            dataset = schematics_2_0_api_service.get_dataset(
                dataset_id='testString'
            ).get_result()

            print(json.dumps(dataset, indent=2))

            # end-get_dataset

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_replace_dataset_example(self):
        """
        replace_dataset request example
        """
        try:
            # begin-replace_dataset

            dataset_model = {
            }

            dataset = schematics_2_0_api_service.replace_dataset(
                dataset_id='testString',
                dataset=dataset_model
            ).get_result()

            print(json.dumps(dataset, indent=2))

            # end-replace_dataset

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_update_ataset_example(self):
        """
        update_ataset request example
        """
        try:
            # begin-update_ataset

            dataset_model = {
            }

            dataset = schematics_2_0_api_service.update_ataset(
                dataset_id='testString',
                dataset=dataset_model
            ).get_result()

            print(json.dumps(dataset, indent=2))

            # end-update_ataset

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_dataset_variables_example(self):
        """
        list_dataset_variables request example
        """
        try:
            # begin-list_dataset_variables

            variable_data_list = schematics_2_0_api_service.list_dataset_variables(
                dataset_id='testString'
            ).get_result()

            print(json.dumps(variable_data_list, indent=2))

            # end-list_dataset_variables

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_dataset_variable_example(self):
        """
        get_dataset_variable request example
        """
        try:
            # begin-get_dataset_variable

            variable_data = schematics_2_0_api_service.get_dataset_variable(
                dataset_id='testString',
                var_name='testString'
            ).get_result()

            print(json.dumps(variable_data, indent=2))

            # end-get_dataset_variable

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_credentials_example(self):
        """
        list_credentials request example
        """
        try:
            # begin-list_credentials

            credential_list = schematics_2_0_api_service.list_credentials().get_result()

            print(json.dumps(credential_list, indent=2))

            # end-list_credentials

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_credential_example(self):
        """
        create_credential request example
        """
        try:
            # begin-create_credential

            credentialset_model = {
            }

            credentialset = schematics_2_0_api_service.create_credential(
                credentialset=credentialset_model
            ).get_result()

            print(json.dumps(credentialset, indent=2))

            # end-create_credential

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_credential_example(self):
        """
        get_credential request example
        """
        try:
            # begin-get_credential

            credentialset = schematics_2_0_api_service.get_credential(
                creds_id='testString'
            ).get_result()

            print(json.dumps(credentialset, indent=2))

            # end-get_credential

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_replace_credential_example(self):
        """
        replace_credential request example
        """
        try:
            # begin-replace_credential

            credentialset_model = {
            }

            credentialset = schematics_2_0_api_service.replace_credential(
                creds_id='testString',
                credentialset=credentialset_model
            ).get_result()

            print(json.dumps(credentialset, indent=2))

            # end-replace_credential

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_update_credential_example(self):
        """
        update_credential request example
        """
        try:
            # begin-update_credential

            credentialset_model = {
            }

            credentialset = schematics_2_0_api_service.update_credential(
                creds_id='testString',
                credentialset=credentialset_model
            ).get_result()

            print(json.dumps(credentialset, indent=2))

            # end-update_credential

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_credential_values_example(self):
        """
        list_credential_values request example
        """
        try:
            # begin-list_credential_values

            variable_data_list = schematics_2_0_api_service.list_credential_values(
                creds_id='testString'
            ).get_result()

            print(json.dumps(variable_data_list, indent=2))

            # end-list_credential_values

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_credential_value_example(self):
        """
        get_credential_value request example
        """
        try:
            # begin-get_credential_value

            variable_data = schematics_2_0_api_service.get_credential_value(
                creds_id='testString',
                var_name='testString'
            ).get_result()

            print(json.dumps(variable_data, indent=2))

            # end-get_credential_value

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_inventories_example(self):
        """
        list_inventories request example
        """
        try:
            # begin-list_inventories

            inventory_resource_record_list = schematics_2_0_api_service.list_inventories().get_result()

            print(json.dumps(inventory_resource_record_list, indent=2))

            # end-list_inventories

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_inventory_example(self):
        """
        create_inventory request example
        """
        try:
            # begin-create_inventory

            inventory_resource_definition_model = {
            }

            inventory_resource_record = schematics_2_0_api_service.create_inventory(
                inventory_resource_definition=inventory_resource_definition_model
            ).get_result()

            print(json.dumps(inventory_resource_record, indent=2))

            # end-create_inventory

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_inventory_example(self):
        """
        get_inventory request example
        """
        try:
            # begin-get_inventory

            inventory_resource_record = schematics_2_0_api_service.get_inventory(
                inventory_id='testString'
            ).get_result()

            print(json.dumps(inventory_resource_record, indent=2))

            # end-get_inventory

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_replace_inventory_example(self):
        """
        replace_inventory request example
        """
        try:
            # begin-replace_inventory

            inventory_resource_definition_model = {
            }

            inventory_resource_record = schematics_2_0_api_service.replace_inventory(
                inventory_id='testString',
                inventory_resource_definition=inventory_resource_definition_model
            ).get_result()

            print(json.dumps(inventory_resource_record, indent=2))

            # end-replace_inventory

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_update_inventory_example(self):
        """
        update_inventory request example
        """
        try:
            # begin-update_inventory

            inventory_resource_definition_model = {
            }

            inventory_resource_record = schematics_2_0_api_service.update_inventory(
                inventory_id='testString',
                inventory_resource_definition=inventory_resource_definition_model
            ).get_result()

            print(json.dumps(inventory_resource_record, indent=2))

            # end-update_inventory

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_resource_query_example(self):
        """
        list_resource_query request example
        """
        try:
            # begin-list_resource_query

            resource_query_record_list = schematics_2_0_api_service.list_resource_query().get_result()

            print(json.dumps(resource_query_record_list, indent=2))

            # end-list_resource_query

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_resource_query_example(self):
        """
        create_resource_query request example
        """
        try:
            # begin-create_resource_query

            resource_query_definition_model = {
            }

            resource_query_record = schematics_2_0_api_service.create_resource_query(
                resource_query_definition=resource_query_definition_model
            ).get_result()

            print(json.dumps(resource_query_record, indent=2))

            # end-create_resource_query

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_resources_query_example(self):
        """
        get_resources_query request example
        """
        try:
            # begin-get_resources_query

            resource_query_record = schematics_2_0_api_service.get_resources_query(
                query_id='testString'
            ).get_result()

            print(json.dumps(resource_query_record, indent=2))

            # end-get_resources_query

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_replace_resources_query_example(self):
        """
        replace_resources_query request example
        """
        try:
            # begin-replace_resources_query

            resource_query_definition_model = {
            }

            resource_query_record = schematics_2_0_api_service.replace_resources_query(
                query_id='testString',
                resource_query_definition=resource_query_definition_model
            ).get_result()

            print(json.dumps(resource_query_record, indent=2))

            # end-replace_resources_query

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_execute_resource_query_example(self):
        """
        execute_resource_query request example
        """
        try:
            # begin-execute_resource_query

            resource_query_response_record = schematics_2_0_api_service.execute_resource_query(
                query_id='testString'
            ).get_result()

            print(json.dumps(resource_query_response_record, indent=2))

            # end-execute_resource_query

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_dataset_variable_value_example(self):
        """
        get_dataset_variable_value request example
        """
        try:
            # begin-get_dataset_variable_value

            value_response = schematics_2_0_api_service.get_dataset_variable_value(
                dataset_id='testString',
                var_name='testString'
            ).get_result()

            print(json.dumps(value_response, indent=2))

            # end-get_dataset_variable_value

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_credential_variable_value_example(self):
        """
        get_credential_variable_value request example
        """
        try:
            # begin-get_credential_variable_value

            value_response = schematics_2_0_api_service.get_credential_variable_value(
                creds_id='testString',
                var_name='testString'
            ).get_result()

            print(json.dumps(value_response, indent=2))

            # end-get_credential_variable_value

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_inventory_variable_value_example(self):
        """
        get_inventory_variable_value request example
        """
        try:
            # begin-get_inventory_variable_value

            value_list_response = schematics_2_0_api_service.get_inventory_variable_value(
                inventory_id='testString',
                var_name='testString'
            ).get_result()

            print(json.dumps(value_list_response, indent=2))

            # end-get_inventory_variable_value

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_input_value_example(self):
        """
        get_workspace_input_value request example
        """
        try:
            # begin-get_workspace_input_value

            value_response = schematics_2_0_api_service.get_workspace_input_value(
                workspace_id='testString',
                var_name='testString'
            ).get_result()

            print(json.dumps(value_response, indent=2))

            # end-get_workspace_input_value

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_output_value_example(self):
        """
        get_workspace_output_value request example
        """
        try:
            # begin-get_workspace_output_value

            value_response = schematics_2_0_api_service.get_workspace_output_value(
                workspace_id='testString',
                var_name='testString'
            ).get_result()

            print(json.dumps(value_response, indent=2))

            # end-get_workspace_output_value

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_settings_value_example(self):
        """
        get_workspace_settings_value request example
        """
        try:
            # begin-get_workspace_settings_value

            value_response = schematics_2_0_api_service.get_workspace_settings_value(
                workspace_id='testString',
                var_name='testString'
            ).get_result()

            print(json.dumps(value_response, indent=2))

            # end-get_workspace_settings_value

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_template_input_value_example(self):
        """
        get_workspace_template_input_value request example
        """
        try:
            # begin-get_workspace_template_input_value

            value_response = schematics_2_0_api_service.get_workspace_template_input_value(
                workspace_id='testString',
                template_id='testString',
                var_name='testString'
            ).get_result()

            print(json.dumps(value_response, indent=2))

            # end-get_workspace_template_input_value

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_template_output_value_example(self):
        """
        get_workspace_template_output_value request example
        """
        try:
            # begin-get_workspace_template_output_value

            value_response = schematics_2_0_api_service.get_workspace_template_output_value(
                workspace_id='testString',
                template_id='testString',
                var_name='testString'
            ).get_result()

            print(json.dumps(value_response, indent=2))

            # end-get_workspace_template_output_value

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_template_setting_value_example(self):
        """
        get_workspace_template_setting_value request example
        """
        try:
            # begin-get_workspace_template_setting_value

            value_response = schematics_2_0_api_service.get_workspace_template_setting_value(
                workspace_id='testString',
                template_id='testString',
                var_name='testString'
            ).get_result()

            print(json.dumps(value_response, indent=2))

            # end-get_workspace_template_setting_value

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_job_workspace_input_value_example(self):
        """
        get_job_workspace_input_value request example
        """
        try:
            # begin-get_job_workspace_input_value

            value_response = schematics_2_0_api_service.get_job_workspace_input_value(
                job_id='testString',
                workspace_id='testString',
                var_name='testString'
            ).get_result()

            print(json.dumps(value_response, indent=2))

            # end-get_job_workspace_input_value

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_job_workspace_output_value_example(self):
        """
        get_job_workspace_output_value request example
        """
        try:
            # begin-get_job_workspace_output_value

            value_response = schematics_2_0_api_service.get_job_workspace_output_value(
                job_id='testString',
                workspace_id='testString',
                var_name='testString'
            ).get_result()

            print(json.dumps(value_response, indent=2))

            # end-get_job_workspace_output_value

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_job_workspace_setting_value_example(self):
        """
        get_job_workspace_setting_value request example
        """
        try:
            # begin-get_job_workspace_setting_value

            value_response = schematics_2_0_api_service.get_job_workspace_setting_value(
                job_id='testString',
                workspace_id='testString',
                var_name='testString'
            ).get_result()

            print(json.dumps(value_response, indent=2))

            # end-get_job_workspace_setting_value

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_triggers_example(self):
        """
        list_triggers request example
        """
        try:
            # begin-list_triggers

            trigger_list = schematics_2_0_api_service.list_triggers().get_result()

            print(json.dumps(trigger_list, indent=2))

            # end-list_triggers

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_trigger_example(self):
        """
        create_trigger request example
        """
        try:
            # begin-create_trigger

            trigger_model = {
            }

            trigger = schematics_2_0_api_service.create_trigger(
                trigger=trigger_model
            ).get_result()

            print(json.dumps(trigger, indent=2))

            # end-create_trigger

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_trigger_example(self):
        """
        get_trigger request example
        """
        try:
            # begin-get_trigger

            trigger = schematics_2_0_api_service.get_trigger(
                trigger_id='testString'
            ).get_result()

            print(json.dumps(trigger, indent=2))

            # end-get_trigger

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_replace_trigger_example(self):
        """
        replace_trigger request example
        """
        try:
            # begin-replace_trigger

            trigger_model = {
            }

            trigger = schematics_2_0_api_service.replace_trigger(
                trigger_id='testString',
                trigger=trigger_model
            ).get_result()

            print(json.dumps(trigger, indent=2))

            # end-replace_trigger

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_webhook_example(self):
        """
        list_webhook request example
        """
        try:
            # begin-list_webhook

            web_hook_list = schematics_2_0_api_service.list_webhook().get_result()

            print(json.dumps(web_hook_list, indent=2))

            # end-list_webhook

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_webhook_example(self):
        """
        create_webhook request example
        """
        try:
            # begin-create_webhook

            web_hook_model = {
            }

            web_hook = schematics_2_0_api_service.create_webhook(
                web_hook=web_hook_model
            ).get_result()

            print(json.dumps(web_hook, indent=2))

            # end-create_webhook

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_webhook_example(self):
        """
        get_webhook request example
        """
        try:
            # begin-get_webhook

            web_hook = schematics_2_0_api_service.get_webhook(
                hook_id='testString'
            ).get_result()

            print(json.dumps(web_hook, indent=2))

            # end-get_webhook

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_replace_webhook_example(self):
        """
        replace_webhook request example
        """
        try:
            # begin-replace_webhook

            web_hook_model = {
            }

            web_hook = schematics_2_0_api_service.replace_webhook(
                hook_id='testString',
                web_hook=web_hook_model
            ).get_result()

            print(json.dumps(web_hook, indent=2))

            # end-replace_webhook

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_private_cluster_example(self):
        """
        get_private_cluster request example
        """
        try:
            # begin-get_private_cluster

            private_cluster_list = schematics_2_0_api_service.get_private_cluster().get_result()

            print(json.dumps(private_cluster_list, indent=2))

            # end-get_private_cluster

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_private_cluster_example(self):
        """
        create_private_cluster request example
        """
        try:
            # begin-create_private_cluster

            private_cluster_model = {
            }

            private_cluster = schematics_2_0_api_service.create_private_cluster(
                private_cluster=private_cluster_model
            ).get_result()

            print(json.dumps(private_cluster, indent=2))

            # end-create_private_cluster

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_adapter_example(self):
        """
        list_adapter request example
        """
        try:
            # begin-list_adapter

            adapter_list = schematics_2_0_api_service.list_adapter().get_result()

            print(json.dumps(adapter_list, indent=2))

            # end-list_adapter

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_adapter_example(self):
        """
        create_adapter request example
        """
        try:
            # begin-create_adapter

            adapter_model = {
            }

            adapter = schematics_2_0_api_service.create_adapter(
                adapter=adapter_model
            ).get_result()

            print(json.dumps(adapter, indent=2))

            # end-create_adapter

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_adapter_example(self):
        """
        get_adapter request example
        """
        try:
            # begin-get_adapter

            adapter = schematics_2_0_api_service.get_adapter(
                adapter_id='testString'
            ).get_result()

            print(json.dumps(adapter, indent=2))

            # end-get_adapter

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_replace_adapter_example(self):
        """
        replace_adapter request example
        """
        try:
            # begin-replace_adapter

            adapter_model = {
            }

            adapter = schematics_2_0_api_service.replace_adapter(
                adapter_id='testString',
                adapter=adapter_model
            ).get_result()

            print(json.dumps(adapter, indent=2))

            # end-replace_adapter

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_connection_example(self):
        """
        list_connection request example
        """
        try:
            # begin-list_connection

            connection_list = schematics_2_0_api_service.list_connection().get_result()

            print(json.dumps(connection_list, indent=2))

            # end-list_connection

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_connection_example(self):
        """
        create_connection request example
        """
        try:
            # begin-create_connection

            connection_model = {
            }

            connection = schematics_2_0_api_service.create_connection(
                connection=connection_model
            ).get_result()

            print(json.dumps(connection, indent=2))

            # end-create_connection

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_datasources_example(self):
        """
        list_datasources request example
        """
        try:
            # begin-list_datasources

            datasource_list = schematics_2_0_api_service.list_datasources().get_result()

            print(json.dumps(datasource_list, indent=2))

            # end-list_datasources

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_datasource_example(self):
        """
        create_datasource request example
        """
        try:
            # begin-create_datasource

            datasource_model = {
            }

            datasource = schematics_2_0_api_service.create_datasource(
                datasource=datasource_model
            ).get_result()

            print(json.dumps(datasource, indent=2))

            # end-create_datasource

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_cart_example(self):
        """
        list_cart request example
        """
        try:
            # begin-list_cart

            cart_order_list = schematics_2_0_api_service.list_cart(
                service='testString'
            ).get_result()

            print(json.dumps(cart_order_list, indent=2))

            # end-list_cart

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_cart_order_example(self):
        """
        create_cart_order request example
        """
        try:
            # begin-create_cart_order

            cart_order_model = {
                'name': 'MySatelliteLocation'
            }

            cart_order = schematics_2_0_api_service.create_cart_order(
                cart_order=cart_order_model
            ).get_result()

            print(json.dumps(cart_order, indent=2))

            # end-create_cart_order

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_cart_order_example(self):
        """
        get_cart_order request example
        """
        try:
            # begin-get_cart_order

            cart_order = schematics_2_0_api_service.get_cart_order(
                order_id='testString'
            ).get_result()

            print(json.dumps(cart_order, indent=2))

            # end-get_cart_order

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_replace_cart_order_example(self):
        """
        replace_cart_order request example
        """
        try:
            # begin-replace_cart_order

            cart_order_model = {
                'name': 'MySatelliteLocation'
            }

            cart_order = schematics_2_0_api_service.replace_cart_order(
                order_id='testString',
                operation='0',
                cart_order=cart_order_model
            ).get_result()

            print(json.dumps(cart_order, indent=2))

            # end-replace_cart_order

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_run_fulfilment_operation_example(self):
        """
        run_fulfilment_operation request example
        """
        try:
            # begin-run_fulfilment_operation

            response = schematics_2_0_api_service.run_fulfilment_operation(
                order_id='testString',
                operation='0'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-run_fulfilment_operation

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_update_cart_order_example(self):
        """
        update_cart_order request example
        """
        try:
            # begin-update_cart_order

            update_cart_order_model = {
            }

            cart_order = schematics_2_0_api_service.update_cart_order(
                order_id='testString',
                update_cart_order=update_cart_order_model
            ).get_result()

            print(json.dumps(cart_order, indent=2))

            # end-update_cart_order

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_cart_metadata_example(self):
        """
        get_cart_metadata request example
        """
        try:
            # begin-get_cart_metadata

            item_metadata = schematics_2_0_api_service.get_cart_metadata(
                order_id='testString'
            ).get_result()

            print(json.dumps(item_metadata, indent=2))

            # end-get_cart_metadata

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_cart_resources_example(self):
        """
        list_cart_resources request example
        """
        try:
            # begin-list_cart_resources

            cloud_resource_list = schematics_2_0_api_service.list_cart_resources(
                order_id='testString'
            ).get_result()

            print(json.dumps(cloud_resource_list, indent=2))

            # end-list_cart_resources

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_cart_order_jobs_example(self):
        """
        list_cart_order_jobs request example
        """
        try:
            # begin-list_cart_order_jobs

            job_list = schematics_2_0_api_service.list_cart_order_jobs(
                order_id='testString'
            ).get_result()

            print(json.dumps(job_list, indent=2))

            # end-list_cart_order_jobs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_cart_order_job_example(self):
        """
        get_cart_order_job request example
        """
        try:
            # begin-get_cart_order_job

            job_lite = schematics_2_0_api_service.get_cart_order_job(
                order_id='testString',
                job_id='testString'
            ).get_result()

            print(json.dumps(job_lite, indent=2))

            # end-get_cart_order_job

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_cart_order_job_log_example(self):
        """
        get_cart_order_job_log request example
        """
        try:
            # begin-get_cart_order_job_log

            job_log = schematics_2_0_api_service.get_cart_order_job_log(
                order_id='testString',
                job_id='testString'
            ).get_result()

            print(json.dumps(job_log, indent=2))

            # end-get_cart_order_job_log

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_cart_order_job_resources_example(self):
        """
        get_cart_order_job_resources request example
        """
        try:
            # begin-get_cart_order_job_resources

            cloud_resource_list = schematics_2_0_api_service.get_cart_order_job_resources(
                order_id='testString',
                job_id='testString'
            ).get_result()

            print(json.dumps(cloud_resource_list, indent=2))

            # end-get_cart_order_job_resources

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_environment_definitions_example(self):
        """
        list_environment_definitions request example
        """
        try:
            # begin-list_environment_definitions

            list_environment_catalog_offering_item = schematics_2_0_api_service.list_environment_definitions().get_result()

            print(json.dumps(list_environment_catalog_offering_item, indent=2))

            # end-list_environment_definitions

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_environment_definition_example(self):
        """
        get_environment_definition request example
        """
        try:
            # begin-get_environment_definition

            environment = schematics_2_0_api_service.get_environment_definition(
                offering_id='testString'
            ).get_result()

            print(json.dumps(environment, indent=2))

            # end-get_environment_definition

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_environment_example(self):
        """
        list_environment request example
        """
        try:
            # begin-list_environment

            environment_list = schematics_2_0_api_service.list_environment().get_result()

            print(json.dumps(environment_list, indent=2))

            # end-list_environment

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_environment_example(self):
        """
        create_environment request example
        """
        try:
            # begin-create_environment

            environment_model = {
                'name': 'Toronto Dev Environtment'
            }

            environment = schematics_2_0_api_service.create_environment(
                environment=environment_model
            ).get_result()

            print(json.dumps(environment, indent=2))

            # end-create_environment

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_environment_example(self):
        """
        get_environment request example
        """
        try:
            # begin-get_environment

            environment = schematics_2_0_api_service.get_environment(
                environment_id='testString'
            ).get_result()

            print(json.dumps(environment, indent=2))

            # end-get_environment

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_replace_environment_example(self):
        """
        replace_environment request example
        """
        try:
            # begin-replace_environment

            environment_model = {
                'name': 'Toronto Dev Environtment'
            }

            environment = schematics_2_0_api_service.replace_environment(
                environment_id='testString',
                environment=environment_model
            ).get_result()

            print(json.dumps(environment, indent=2))

            # end-replace_environment

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_update_environment_example(self):
        """
        update_environment request example
        """
        try:
            # begin-update_environment

            environment_model = {
                'name': 'Toronto Dev Environtment'
            }

            environment = schematics_2_0_api_service.update_environment(
                environment_id='testString',
                environment=environment_model
            ).get_result()

            print(json.dumps(environment, indent=2))

            # end-update_environment

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_environment_workspaces_example(self):
        """
        list_environment_workspaces request example
        """
        try:
            # begin-list_environment_workspaces

            cloud_resource_list = schematics_2_0_api_service.list_environment_workspaces(
                environment_id='testString'
            ).get_result()

            print(json.dumps(cloud_resource_list, indent=2))

            # end-list_environment_workspaces

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_environment_resources_example(self):
        """
        list_environment_resources request example
        """
        try:
            # begin-list_environment_resources

            cloud_resource_list = schematics_2_0_api_service.list_environment_resources(
                environment_id='testString'
            ).get_result()

            print(json.dumps(cloud_resource_list, indent=2))

            # end-list_environment_resources

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_kms_settings_example(self):
        """
        get_kms_settings request example
        """
        try:
            # begin-get_kms_settings

            kms_settings = schematics_2_0_api_service.get_kms_settings(
                location='testString'
            ).get_result()

            print(json.dumps(kms_settings, indent=2))

            # end-get_kms_settings

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_update_kms_settings_example(self):
        """
        update_kms_settings request example
        """
        try:
            # begin-update_kms_settings

            kms_settings_model = {
            }

            kms_settings = schematics_2_0_api_service.update_kms_settings(
                kms_settings=kms_settings_model
            ).get_result()

            print(json.dumps(kms_settings, indent=2))

            # end-update_kms_settings

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_kms_example(self):
        """
        list_kms request example
        """
        try:
            # begin-list_kms

            kms_discovery = schematics_2_0_api_service.list_kms(
                encryption_scheme='testString',
                location='testString'
            ).get_result()

            print(json.dumps(kms_discovery, indent=2))

            # end-list_kms

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_locations_example(self):
        """
        list_locations request example
        """
        try:
            # begin-list_locations

            schematics_locations_list = schematics_2_0_api_service.list_locations().get_result()

            print(json.dumps(schematics_locations_list, indent=2))

            # end-list_locations

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_process_template_meta_data_example(self):
        """
        process_template_meta_data request example
        """
        try:
            # begin-ProcessTemplateMetaData

            external_source_model = {
                'source_type': 'local'
            }

            template_meta_data_request_model = {
                'template_type': 'testString',
                'source': external_source_model
            }

            template_meta_data_response = schematics_2_0_api_service.process_template_meta_data(
                template_meta_data_request=template_meta_data_request_model
            ).get_result()

            print(json.dumps(template_meta_data_response, indent=2))

            # end-ProcessTemplateMetaData

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_workspace_example(self):
        """
        delete_workspace request example
        """
        try:
            # begin-delete_workspace

            response = schematics_2_0_api_service.delete_workspace(
                workspace_id='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_webhook_example(self):
        """
        delete_webhook request example
        """
        try:
            # begin-delete_webhook

            response = schematics_2_0_api_service.delete_webhook(
                hook_id='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_webhook

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_trigger_example(self):
        """
        delete_trigger request example
        """
        try:
            # begin-delete_trigger

            response = schematics_2_0_api_service.delete_trigger(
                trigger_id='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_trigger

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_template_from_workspace_example(self):
        """
        delete_template_from_workspace request example
        """
        try:
            # begin-delete_template_from_workspace

            response = schematics_2_0_api_service.delete_template_from_workspace(
                workspace_id='testString',
                template_id='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_template_from_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_resources_query_example(self):
        """
        delete_resources_query request example
        """
        try:
            # begin-delete_resources_query

            response = schematics_2_0_api_service.delete_resources_query(
                query_id='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_resources_query

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_private_cluster_example(self):
        """
        delete_private_cluster request example
        """
        try:
            # begin-delete_private_cluster

            response = schematics_2_0_api_service.delete_private_cluster().get_result()

            print(json.dumps(response, indent=2))

            # end-delete_private_cluster

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_job_example(self):
        """
        delete_job request example
        """
        try:
            # begin-delete_job

            response = schematics_2_0_api_service.delete_job(
                job_id='testString',
                refresh_token='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_job

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_inventory_example(self):
        """
        delete_inventory request example
        """
        try:
            # begin-delete_inventory

            response = schematics_2_0_api_service.delete_inventory(
                inventory_id='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_inventory

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_flow_from_workspace_example(self):
        """
        delete_flow_from_workspace request example
        """
        try:
            # begin-delete_flow_from_workspace

            response = schematics_2_0_api_service.delete_flow_from_workspace(
                workspace_id='testString',
                flow_id='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_flow_from_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_environment_example(self):
        """
        delete_environment request example
        """
        try:
            # begin-delete_environment

            response = schematics_2_0_api_service.delete_environment(
                environment_id='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_environment

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_dataset_example(self):
        """
        delete_dataset request example
        """
        try:
            # begin-delete_dataset

            response = schematics_2_0_api_service.delete_dataset(
                dataset_id='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_dataset

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_credential_example(self):
        """
        delete_credential request example
        """
        try:
            # begin-delete_credential

            response = schematics_2_0_api_service.delete_credential(
                creds_id='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_credential

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_controls_example(self):
        """
        delete_controls request example
        """
        try:
            # begin-delete_controls

            response = schematics_2_0_api_service.delete_controls(
                controls_id='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_controls

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_cart_order_example(self):
        """
        delete_cart_order request example
        """
        try:
            # begin-delete_cart_order

            response = schematics_2_0_api_service.delete_cart_order(
                order_id='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_cart_order

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_capsule_example(self):
        """
        delete_capsule request example
        """
        try:
            # begin-delete_capsule

            response = schematics_2_0_api_service.delete_capsule(
                controls_id='testString',
                capsule_id='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_capsule

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_adapter_example(self):
        """
        delete_adapter request example
        """
        try:
            # begin-delete_adapter

            response = schematics_2_0_api_service.delete_adapter(
                adapter_id='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_adapter

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_action_example(self):
        """
        delete_action request example
        """
        try:
            # begin-delete_action

            response = schematics_2_0_api_service.delete_action(
                action_id='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_action

        except ApiException as e:
            pytest.fail(str(e))

# endregion
##############################################################################
# End of Examples for Service: Schematics20ApiV2
##############################################################################
