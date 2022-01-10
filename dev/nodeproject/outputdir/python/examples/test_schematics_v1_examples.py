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
Examples for SchematicsV1
"""

import os
import pytest
from ibm_cloud_sdk_core import ApiException, read_external_sources
from com.ibm.cloud.schematics_v1 import *

# Config file name
config_file = 'schematics_v1.env'

schematics_service = None

config = None


##############################################################################
# Start of Examples for Service: SchematicsV1
##############################################################################
# region
class TestSchematicsV1Examples():
    """
    Example Test Class for SchematicsV1
    """

    @classmethod
    def setup_class(cls):
        global schematics_service
        if os.path.exists(config_file):
            os.environ['IBM_CREDENTIALS_FILE'] = config_file

            # begin-common

            schematics_service = SchematicsV1.new_instance(
            )

            # end-common
            assert schematics_service is not None

            # Load the configuration
            global config
            config = read_external_sources(SchematicsV1.DEFAULT_SERVICE_NAME)

        print('Setup complete.')

    needscredentials = pytest.mark.skipif(
        not os.path.exists(config_file), reason="External configuration not available, skipping..."
    )

    @needscredentials
    def test_list_schematics_location_example(self):
        """
        list_schematics_location request example
        """
        try:
            # begin-list_schematics_location

            list_schematics_locations = schematics_service.list_schematics_location().get_result()

            print(json.dumps(list_schematics_locations, indent=2))

            # end-list_schematics_location

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_resource_group_example(self):
        """
        list_resource_group request example
        """
        try:
            # begin-list_resource_group

            list_resource_group_response = schematics_service.list_resource_group().get_result()

            print(json.dumps(list_resource_group_response, indent=2))

            # end-list_resource_group

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_schematics_version_example(self):
        """
        get_schematics_version request example
        """
        try:
            # begin-get_schematics_version

            version_response = schematics_service.get_schematics_version().get_result()

            print(json.dumps(version_response, indent=2))

            # end-get_schematics_version

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_locations_example(self):
        """
        list_locations request example
        """
        try:
            # begin-list_locations

            schematics_locations_list = schematics_service.list_locations().get_result()

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

            template_meta_data_response = schematics_service.process_template_meta_data(
                template_type='testString',
                source=external_source_model
            ).get_result()

            print(json.dumps(template_meta_data_response, indent=2))

            # end-ProcessTemplateMetaData

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_workspaces_example(self):
        """
        list_workspaces request example
        """
        try:
            # begin-list_workspaces

            workspace_response_list = schematics_service.list_workspaces().get_result()

            print(json.dumps(workspace_response_list, indent=2))

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

            workspace_response = schematics_service.create_workspace(
            ).get_result()

            print(json.dumps(workspace_response, indent=2))

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

            workspace_response = schematics_service.get_workspace(
                w_id='testString'
            ).get_result()

            print(json.dumps(workspace_response, indent=2))

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

            workspace_response = schematics_service.replace_workspace(
                w_id='testString',
            ).get_result()

            print(json.dumps(workspace_response, indent=2))

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

            workspace_response = schematics_service.update_workspace(
                w_id='testString',
            ).get_result()

            print(json.dumps(workspace_response, indent=2))

            # end-update_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_readme_example(self):
        """
        get_workspace_readme request example
        """
        try:
            # begin-get_workspace_readme

            template_readme = schematics_service.get_workspace_readme(
                w_id='testString'
            ).get_result()

            print(json.dumps(template_readme, indent=2))

            # end-get_workspace_readme

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_template_repo_upload_example(self):
        """
        template_repo_upload request example
        """
        try:
            # begin-template_repo_upload

            template_repo_tar_upload_response = schematics_service.template_repo_upload(
                w_id='testString',
                t_id='testString'
            ).get_result()

            print(json.dumps(template_repo_tar_upload_response, indent=2))

            # end-template_repo_upload

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_inputs_example(self):
        """
        get_workspace_inputs request example
        """
        try:
            # begin-get_workspace_inputs

            template_values = schematics_service.get_workspace_inputs(
                w_id='testString',
                t_id='testString'
            ).get_result()

            print(json.dumps(template_values, indent=2))

            # end-get_workspace_inputs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_replace_workspace_inputs_example(self):
        """
        replace_workspace_inputs request example
        """
        try:
            # begin-replace_workspace_inputs

            user_values = schematics_service.replace_workspace_inputs(
                w_id='testString',
                t_id='testString',
            ).get_result()

            print(json.dumps(user_values, indent=2))

            # end-replace_workspace_inputs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_all_workspace_inputs_example(self):
        """
        get_all_workspace_inputs request example
        """
        try:
            # begin-get_all_workspace_inputs

            workspace_template_values_response = schematics_service.get_all_workspace_inputs(
                w_id='testString'
            ).get_result()

            print(json.dumps(workspace_template_values_response, indent=2))

            # end-get_all_workspace_inputs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_input_metadata_example(self):
        """
        get_workspace_input_metadata request example
        """
        try:
            # begin-get_workspace_input_metadata

            result = schematics_service.get_workspace_input_metadata(
                w_id='testString',
                t_id='testString'
            ).get_result()

            print(json.dumps(result, indent=2))

            # end-get_workspace_input_metadata

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_outputs_example(self):
        """
        get_workspace_outputs request example
        """
        try:
            # begin-get_workspace_outputs

            list_output_values_inner = schematics_service.get_workspace_outputs(
                w_id='testString'
            ).get_result()

            print(json.dumps(list_output_values_inner, indent=2))

            # end-get_workspace_outputs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_resources_example(self):
        """
        get_workspace_resources request example
        """
        try:
            # begin-get_workspace_resources

            list_template_resources = schematics_service.get_workspace_resources(
                w_id='testString'
            ).get_result()

            print(json.dumps(list_template_resources, indent=2))

            # end-get_workspace_resources

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_state_example(self):
        """
        get_workspace_state request example
        """
        try:
            # begin-get_workspace_state

            state_store_response_list = schematics_service.get_workspace_state(
                w_id='testString'
            ).get_result()

            print(json.dumps(state_store_response_list, indent=2))

            # end-get_workspace_state

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_template_state_example(self):
        """
        get_workspace_template_state request example
        """
        try:
            # begin-get_workspace_template_state

            template_state_store = schematics_service.get_workspace_template_state(
                w_id='testString',
                t_id='testString'
            ).get_result()

            print(json.dumps(template_state_store, indent=2))

            # end-get_workspace_template_state

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_activity_logs_example(self):
        """
        get_workspace_activity_logs request example
        """
        try:
            # begin-get_workspace_activity_logs

            workspace_activity_logs = schematics_service.get_workspace_activity_logs(
                w_id='testString',
                activity_id='testString'
            ).get_result()

            print(json.dumps(workspace_activity_logs, indent=2))

            # end-get_workspace_activity_logs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_log_urls_example(self):
        """
        get_workspace_log_urls request example
        """
        try:
            # begin-get_workspace_log_urls

            log_store_response_list = schematics_service.get_workspace_log_urls(
                w_id='testString'
            ).get_result()

            print(json.dumps(log_store_response_list, indent=2))

            # end-get_workspace_log_urls

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_template_logs_example(self):
        """
        get_template_logs request example
        """
        try:
            # begin-get_template_logs

            template_log_store_string = schematics_service.get_template_logs(
                w_id='testString',
                t_id='testString'
            ).get_result()

            print(json.dumps(template_log_store_string, indent=2))

            # end-get_template_logs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_template_activity_log_example(self):
        """
        get_template_activity_log request example
        """
        try:
            # begin-get_template_activity_log

            workspace_activity_template_log_string = schematics_service.get_template_activity_log(
                w_id='testString',
                t_id='testString',
                activity_id='testString'
            ).get_result()

            print(json.dumps(workspace_activity_template_log_string, indent=2))

            # end-get_template_activity_log

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_actions_example(self):
        """
        list_actions request example
        """
        try:
            # begin-list_actions

            action_list = schematics_service.list_actions().get_result()

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

            action_list = schematics_service.create_action(
            ).get_result()

            print(json.dumps(action_list, indent=2))

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

            action = schematics_service.get_action(
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

            action = schematics_service.update_action(
                action_id='testString',
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

            template_repo_tar_upload_response = schematics_service.upload_template_tar_action(
                action_id='testString'
            ).get_result()

            print(json.dumps(template_repo_tar_upload_response, indent=2))

            # end-upload_template_tar_action

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_workspace_activities_example(self):
        """
        list_workspace_activities request example
        """
        try:
            # begin-list_workspace_activities

            workspace_activities = schematics_service.list_workspace_activities(
                w_id='testString'
            ).get_result()

            print(json.dumps(workspace_activities, indent=2))

            # end-list_workspace_activities

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_activity_example(self):
        """
        get_workspace_activity request example
        """
        try:
            # begin-get_workspace_activity

            workspace_activity = schematics_service.get_workspace_activity(
                w_id='testString',
                activity_id='testString'
            ).get_result()

            print(json.dumps(workspace_activity, indent=2))

            # end-get_workspace_activity

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_run_workspace_commands_example(self):
        """
        run_workspace_commands request example
        """
        try:
            # begin-run_workspace_commands

            workspace_activity_command_result = schematics_service.run_workspace_commands(
                w_id='testString',
                refresh_token='testString',
            ).get_result()

            print(json.dumps(workspace_activity_command_result, indent=2))

            # end-run_workspace_commands

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_apply_workspace_command_example(self):
        """
        apply_workspace_command request example
        """
        try:
            # begin-apply_workspace_command

            workspace_activity_apply_result = schematics_service.apply_workspace_command(
                w_id='testString',
                refresh_token='testString',
            ).get_result()

            print(json.dumps(workspace_activity_apply_result, indent=2))

            # end-apply_workspace_command

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_destroy_workspace_command_example(self):
        """
        destroy_workspace_command request example
        """
        try:
            # begin-destroy_workspace_command

            workspace_activity_destroy_result = schematics_service.destroy_workspace_command(
                w_id='testString',
                refresh_token='testString',
            ).get_result()

            print(json.dumps(workspace_activity_destroy_result, indent=2))

            # end-destroy_workspace_command

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_plan_workspace_command_example(self):
        """
        plan_workspace_command request example
        """
        try:
            # begin-plan_workspace_command

            workspace_activity_plan_result = schematics_service.plan_workspace_command(
                w_id='testString',
                refresh_token='testString'
            ).get_result()

            print(json.dumps(workspace_activity_plan_result, indent=2))

            # end-plan_workspace_command

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_refresh_workspace_command_example(self):
        """
        refresh_workspace_command request example
        """
        try:
            # begin-refresh_workspace_command

            workspace_activity_refresh_result = schematics_service.refresh_workspace_command(
                w_id='testString',
                refresh_token='testString'
            ).get_result()

            print(json.dumps(workspace_activity_refresh_result, indent=2))

            # end-refresh_workspace_command

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_jobs_example(self):
        """
        list_jobs request example
        """
        try:
            # begin-list_jobs

            job_list = schematics_service.list_jobs().get_result()

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

            job = schematics_service.create_job(
                refresh_token='testString',
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

            job = schematics_service.get_job(
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

            job = schematics_service.update_job(
                job_id='testString',
                refresh_token='testString',
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

            job_log = schematics_service.list_job_logs(
                job_id='testString'
            ).get_result()

            print(json.dumps(job_log, indent=2))

            # end-list_job_logs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_workspace_deletion_job_example(self):
        """
        create_workspace_deletion_job request example
        """
        try:
            # begin-create_workspace_deletion_job

            workspace_bulk_delete_response = schematics_service.create_workspace_deletion_job(
                refresh_token='testString',
            ).get_result()

            print(json.dumps(workspace_bulk_delete_response, indent=2))

            # end-create_workspace_deletion_job

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_deletion_job_status_example(self):
        """
        get_workspace_deletion_job_status request example
        """
        try:
            # begin-get_workspace_deletion_job_status

            workspace_job_response = schematics_service.get_workspace_deletion_job_status(
                wj_id='testString'
            ).get_result()

            print(json.dumps(workspace_job_response, indent=2))

            # end-get_workspace_deletion_job_status

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_inventories_example(self):
        """
        list_inventories request example
        """
        try:
            # begin-list_inventories

            inventory_resource_record_list = schematics_service.list_inventories().get_result()

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

            inventory_resource_record = schematics_service.create_inventory(
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

            inventory_resource_record = schematics_service.get_inventory(
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

            inventory_resource_record = schematics_service.replace_inventory(
                inventory_id='testString',
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

            inventory_resource_record = schematics_service.update_inventory(
                inventory_id='testString',
            ).get_result()

            print(json.dumps(inventory_resource_record, indent=2))

            # end-update_inventory

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_inventory_values_example(self):
        """
        list_inventory_values request example
        """
        try:
            # begin-list_inventory_values

            inventory_resource_record_list = schematics_service.list_inventory_values(
                inventory_id='testString'
            ).get_result()

            print(json.dumps(inventory_resource_record_list, indent=2))

            # end-list_inventory_values

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_inventory_value_example(self):
        """
        get_inventory_value request example
        """
        try:
            # begin-get_inventory_value

            inventory_resource_record = schematics_service.get_inventory_value(
                inventory_id='testString',
                var_name='testString'
            ).get_result()

            print(json.dumps(inventory_resource_record, indent=2))

            # end-get_inventory_value

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_resource_query_example(self):
        """
        list_resource_query request example
        """
        try:
            # begin-list_resource_query

            resource_query_record_list = schematics_service.list_resource_query().get_result()

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

            resource_query_record = schematics_service.create_resource_query(
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

            resource_query_record = schematics_service.get_resources_query(
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

            resource_query_record = schematics_service.replace_resources_query(
                query_id='testString',
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

            resource_query_response_record = schematics_service.execute_resource_query(
                query_id='testString'
            ).get_result()

            print(json.dumps(resource_query_response_record, indent=2))

            # end-execute_resource_query

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_kms_settings_example(self):
        """
        get_kms_settings request example
        """
        try:
            # begin-get_kms_settings

            kms_settings = schematics_service.get_kms_settings(
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

            kms_settings = schematics_service.update_kms_settings(
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

            kms_discovery = schematics_service.list_kms(
                encryption_scheme='testString',
                location='testString'
            ).get_result()

            print(json.dumps(kms_discovery, indent=2))

            # end-list_kms

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_workspace_activity_example(self):
        """
        delete_workspace_activity request example
        """
        try:
            # begin-delete_workspace_activity

            workspace_activity_apply_result = schematics_service.delete_workspace_activity(
                w_id='testString',
                activity_id='testString'
            ).get_result()

            print(json.dumps(workspace_activity_apply_result, indent=2))

            # end-delete_workspace_activity

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_workspace_example(self):
        """
        delete_workspace request example
        """
        try:
            # begin-delete_workspace

            workspace_delete_response = schematics_service.delete_workspace(
                w_id='testString'
            ).get_result()

            print(json.dumps(workspace_delete_response, indent=2))

            # end-delete_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_resources_query_example(self):
        """
        delete_resources_query request example
        """
        try:
            # begin-delete_resources_query

            response = schematics_service.delete_resources_query(
                query_id='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_resources_query

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_job_example(self):
        """
        delete_job request example
        """
        try:
            # begin-delete_job

            response = schematics_service.delete_job(
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

            response = schematics_service.delete_inventory(
                inventory_id='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_inventory

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_action_example(self):
        """
        delete_action request example
        """
        try:
            # begin-delete_action

            response = schematics_service.delete_action(
                action_id='testString'
            ).get_result()

            print(json.dumps(response, indent=2))

            # end-delete_action

        except ApiException as e:
            pytest.fail(str(e))

# endregion
##############################################################################
# End of Examples for Service: SchematicsV1
##############################################################################
