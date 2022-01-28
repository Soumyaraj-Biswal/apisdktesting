"""
Examples for SchematicsV1
"""

from msilib.schema import File
import os
import json
from pydoc import locate
import pytest
from ibm_cloud_sdk_core import ApiException, read_external_sources
from ibm_schematics.schematics_v1 import SchematicsV1
import requests
from test_data import *


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

            schematics_service = SchematicsV1.new_instance(service_name="ibm-schematics")

            

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
    def test_list_actions_example(self):
        print("""
        list_actions request example
        """)
        try:
            # begin-list_actions

            action_list = schematics_service.list_actions().get_result()

            print(json.dumps(action_list, indent=2))
            return """
        list_actions request example
        """+"\n"+json.dumps(action_list, indent=2)
            # end-list_actions

        except ApiException as e:
            pytest.fail(str(e))

    
    def token(self):
        headers = {
            'Content-Type': 'application/x-www-form-urlencoded',
        }

        data = {
        'grant_type': 'urn:ibm:params:oauth:grant-type:apikey',
        'apikey': os.environ["IBMCLOUD_API_KEY"]
        }

        response = requests.post('https://iam.cloud.ibm.com/identity/token', headers=headers, data=data, auth=('bx', 'bx'))
        self.refresh_token = json.loads(response.text)["refresh_token"]
        self.access_token = json.loads(response.text)["access_token"]
        print("Token Generated")
    
    @needscredentials
    def test_create_action_example(self):
        print("""
        create_action request example
        """)
        try:
            # begin-create_action

            action_list = schematics_service.create_action(
                name=create_action_name,
                description=create_action_description,
                location=create_action_location,
                # resource_group="default",
                tags=create_action_tags,
                source=create_action_source
            ).get_result()
            self.action = action_list["id"]
            print(json.dumps(action_list, indent=2))
            return """
        create_action request example
        """+"\n"+json.dumps(action_list, indent=2)
            # end-create_action

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_action_example(self):
        print("""
        get_action request example
        """)
        try:
            # begin-get_action

            action = schematics_service.get_action(
                action_id=self.action
            ).get_result()

            print(json.dumps(action, indent=2))
            return """
        get_action request example
        """+"\n"+json.dumps(action, indent=2)
            # end-get_action

        except ApiException as e:
            pytest.fail(str(e))

            
    @needscredentials
    def test_list_location_example(self):
        print("""
        get_action request example
        """)
        try:
            # begin-get_action

            schematics_locations_list = schematics_service.list_locations(headers={'X-Feature-Region-Visibility' : 'true'}).get_result()
            print(json.dumps(schematics_locations_list, indent=2))
            return """
        get_action request example
        """ + "\n"+json.dumps(schematics_locations_list, indent=2)
            # end-get_action

        except ApiException as e:
            pytest.fail(str(e))    
            
            

    @needscredentials
    def test_update_action_example(self):
        print("""
        update_action request example
        """)
        try:
            # begin-update_action

            action = schematics_service.update_action(
                action_id=update_action_action_id,
                name=update_action_name
            ).get_result()

            print(json.dumps(action, indent=2))
            return """
        update_action request example
        """+"\n"+json.dumps(action, indent=2)
            # end-update_action

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_jobs_example(self):
        print("""
        list_jobs request example
        """)
        try:
            # begin-list_jobs

            job_list = schematics_service.list_jobs(
                resource=list_jobs_resource,
                action_id=list_jobs_action_id
            ).get_result()

            print(json.dumps(job_list, indent=2))
            return """
        list_jobs request example
        """+"\n"+json.dumps(job_list, indent=2)
            # end-list_jobs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_job_example(self):
        print("""
        create_job request example
        """)
        try:
            # begin-create_job

            job = schematics_service.create_job(
                refresh_token=self.refresh_token,
                command_object=create_job_command_object,
                command_object_id=create_job_command_object_id,
                command_name=create_job_command_name, 
                command_parameter=create_job_command_parameter
            ).get_result()

            self.job_id=job["id"]
            print(json.dumps(job, indent=2))
            return """
        create_job request example
        """+"\n"+json.dumps(job, indent=2)
            # end-create_job

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_job_example(self,ch):
        print("""
        get_job request example
        """)
        try:
            # begin-get_job

            job = schematics_service.get_job(
                job_id=self.job_id
            ).get_result()
            while ch and (job["status"]["action_job_status"]["status_code"]=="job_pending" or job["status"]["action_job_status"]["status_code"]=="job_in_progress"):
                job = schematics_service.get_job(
                    job_id=self.job_id
                ).get_result()
            print(json.dumps(job, indent=2))
            return """
        get_job request example
        """+"\n"+json.dumps(job, indent=2)
            # end-get_job

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_update_job_example(self):
        print("""
        update_job request example
        """)
        try:
            # begin-update_job

            job = schematics_service.update_job(
                refresh_token=self.refresh_token,
                job_id=self.job_id,
            ).get_result()

            print(json.dumps(job, indent=2))
            return """
        update_job request example
        """+"\n"+json.dumps(job, indent=2)
            # end-update_job

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_job_logs_example(self):
        print("""
        list_job_logs request example
        """)
        try:
            # begin-list_job_logs

            job_log = schematics_service.list_job_logs(
                job_id=self.job_id
            ).get_result()

            print(job_log.text)
            return """
        list_job_logs request example
        """+"\n"+job_log.text
            # end-list_job_logs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_schematics_version_example(self):
        print("""
        get_schematics_version request example
        """)
        try:
            # begin-get_schematics_version

            version_response = schematics_service.get_schematics_version().get_result()

            print(json.dumps(version_response, indent=2))
            return """
        get_schematics_version request example
        """+"\n"+json.dumps(version_response, indent=2)
            # end-get_schematics_version

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_schematics_location_example(self):
        print("""
        list_schematics_location request example
        """)
        try:
            # begin-list_schematics_location

            list_schematics_locations = schematics_service.list_schematics_location().get_result()

            print(json.dumps(list_schematics_locations, indent=2))
            return """
        list_schematics_location request example
        """ + "\n"+json.dumps(list_schematics_locations, indent=2)
            # end-list_schematics_location

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def example_process_template_meta_data_test(self):
        print("""
        process template meta data test example
        """)
        try:
            
            template_meta_data_response = schematics_service.process_template_meta_data(
            template_type=version,
            source=external_source_model
            ).get_result()
            print(json.dumps(template_meta_data_response, indent=2))
            return """
        process template meta data test example
        """+"\n"+json.dumps(template_meta_data_response, indent=2)
        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_resource_group_example(self):
        print("""
        list_resource_group request example
        """)
        try:
            # begin-list_resource_group

            list_resource_group_response = schematics_service.list_resource_group().get_result()

            print(json.dumps(list_resource_group_response, indent=2))
            return """
        list_resource_group request example
        """+"\n"+json.dumps(list_resource_group_response, indent=2)
            # end-list_resource_group

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_workspaces_example(self):
        print("""
        list_workspaces request example
        """)
        try:
            # begin-list_workspaces

            workspace_response_list = schematics_service.list_workspaces().get_result()

            print(json.dumps(workspace_response_list, indent=2))
            return """
        list_workspaces request example
        """+"\n"+json.dumps(workspace_response_list, indent=2)
            # end-list_workspaces

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_workspace_example(self,ch):
        print("""
        create_workspace request example
        """)
        
        try:
            # begin-create_workspace
            workspace_response={}
            if ch:
                workspace_response = schematics_service.create_workspace(
                    description = create_workspace_desc,
                    name = create_workspace_name,
                    template_data=[template_source_data_request_model],
                    template_repo=template_repo_request_model,
                    type = create_workspace_type,
                    location=create_workspace_location,
                    resource_group=create_workspace_resource_group,
                    tags=tags,
                    workspace_status=workspace_status
                    
                ).get_result()
            else:
                workspace_response = schematics_service.create_workspace(
                    description = create_workspace_desc,
                    name = create_workspace_name,
                    template_data=[template_source_data_request_model],
                    type = create_workspace_type,
                    location=create_workspace_location,
                    resource_group=create_workspace_resource_group,
                    tags=tags,
                    workspace_status=workspace_status
                    
                ).get_result()
            self.w_id=workspace_response["id"]
            print(json.dumps(workspace_response, indent=2))
            return workspace_response

            # end-create_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_example(self,ch):
        print("""
        get_workspace request example
        """)
        try:
            # begin-get_workspace
            workspace_response = schematics_service.get_workspace(
                w_id=self.w_id
            ).get_result()
            if ch:

                while workspace_response["workspace_status"]["locked"]:

                    workspace_response = schematics_service.get_workspace(
                        w_id=self.w_id
                    ).get_result()

            self.t_id=workspace_response["template_data"][0]["id"]
            self.a_id=workspace_response["last_activity_id"]
            print(json.dumps(workspace_response, indent=2))
            return """
        get_workspace request example
        """+"\n"+json.dumps(workspace_response, indent=2)
            # end-get_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_update_workspace_example(self):
        print("""
        update_workspace request example
        """)
        try:
            # begin-update_workspace

            workspace_response = schematics_service.update_workspace(
                w_id=self.w_id,
            ).get_result()

            print(json.dumps(workspace_response, indent=2))
            return """
        update_workspace request example
        """+"\n"+json.dumps(workspace_response, indent=2)
            # end-update_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_replace_workspace_example(self):
        print("""
        replace_workspace request example
        """)
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
    def test_upload_template_tar_example(self):
        print("""
        upload_template_tar request example
        """)
        try:

            file = open("master.tar", "rb")
            template_repo_tar_upload_response = schematics_service.template_repo_upload(
                w_id=self.w_id,
                t_id=self.t_id,
                file = file,
                file_content_type = 'multipart/form-data'
            ).get_result()

            print(json.dumps(template_repo_tar_upload_response, indent=2))
            return """
        upload_template_tar request example
        """+"\n"+json.dumps(template_repo_tar_upload_response, indent=2)
            # end-upload_template_tar

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_plan_workspace_command_example(self):
        print("""
        plan_workspace_command request example
        """)
        try:
            # begin-plan_workspace_command

            workspace_activity_plan_result = schematics_service.plan_workspace_command(
                w_id=self.w_id,
                refresh_token=self.refresh_token
            ).get_result()

            print(json.dumps(workspace_activity_plan_result, indent=2))
            return """
        plan_workspace_command request example
        """+"\n"+json.dumps(workspace_activity_plan_result, indent=2)
            # end-plan_workspace_command

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_apply_workspace_command_example(self):
        print("""
        apply_workspace_command request example
        """)
        try:
            # begin-apply_workspace_command

            workspace_activity_apply_result = schematics_service.apply_workspace_command(
                w_id=self.w_id,
                refresh_token=self.refresh_token
            ).get_result()

            print(json.dumps(workspace_activity_apply_result, indent=2))
            return """
        apply_workspace_command request example
        """+"\n"+json.dumps(workspace_activity_apply_result, indent=2)
            # end-apply_workspace_command

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_destroy_workspace_command_example(self):
        print("""
        destroy_workspace_command request example
        """)
        try:
            # begin-destroy_workspace_command

            
            workspace_activity_destroy_result = schematics_service.destroy_workspace_command(
                
                w_id=self.w_id,
                refresh_token=self.refresh_token
            ).get_result()

            print(json.dumps(workspace_activity_destroy_result, indent=2))
            return """
        destroy_workspace_command request example
        """+"\n"+json.dumps(workspace_activity_destroy_result, indent=2)
            # end-destroy_workspace_command

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_refresh_workspace_command_example(self):
        print("""
        refresh_workspace_command request example
        """)
        try:
            # begin-refresh_workspace_command

            workspace_activity_refresh_result = schematics_service.refresh_workspace_command(
                w_id=self.w_id,
                refresh_token=self.refresh_token
            ).get_result()

            print(json.dumps(workspace_activity_refresh_result, indent=2))
            return """
        refresh_workspace_command request example
        """+"\n"+json.dumps(workspace_activity_refresh_result, indent=2)
            # end-refresh_workspace_command

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_update_terraform_commands_example(self):
        print("""
        update_terraform_commands request example
        """)
        try:
            # begin-update terraform commands

            workspace_activity_command_result = schematics_service.update_terraform_commands(
                w_id='testString',
            ).get_result()

            print(json.dumps(workspace_activity_command_result, indent=2))

            # end-update terraform commands

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_workspace_activities_example(self):
        print("""
        list_workspace_activities request example
        """)
        try:
            # begin-list_workspace_activities

            workspace_activities = schematics_service.list_workspace_activities(
                w_id=self.w_id
            ).get_result()
            self.a_id = workspace_activities["actions"][0]["action_id"]
            print(json.dumps(workspace_activities, indent=2))
            return """
        list_workspace_activities request example
        """+"\n"+json.dumps(workspace_activities, indent=2)
            # end-list_workspace_activities

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_activity_example(self):
        print("""
        get_workspace_activity request example
        """)
        try:
            # begin-get_workspace_activity

            workspace_activity = schematics_service.get_workspace_activity(
                w_id=self.w_id,
                activity_id=self.a_id
            ).get_result()

            print(json.dumps(workspace_activity, indent=2))
            return """
        get_workspace_activity request example
        """+"\n"+json.dumps(workspace_activity, indent=2)
            # end-get_workspace_activity

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_activity_logs_example(self):
        print("""
        get_workspace_activity_logs request example
        """)
        try:
            # begin-get_workspace_activity_logs

            workspace_activity_logs = schematics_service.get_workspace_activity_logs(
                w_id=self.w_id,
                activity_id=self.a_id
            ).get_result()

            print(json.dumps(workspace_activity_logs, indent=2))

            # end-get_workspace_activity_logs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_log_urls_example(self):
        print("""
        get_workspace_log_urls request example
        """)
        try:
            # begin-get_workspace_log_urls

            log_store_response_list = schematics_service.get_workspace_log_urls(
                w_id=self.w_id
            ).get_result()

            print(json.dumps(log_store_response_list, indent=2))
            return """
        get_workspace_log_urls request example
        """+"\n"+json.dumps(log_store_response_list, indent=2)
            # end-get_workspace_log_urls

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_template_activity_log_example(self):
        print("""
        get_template_activity_log request example
        """)
        try:
            # begin-get_template_activity_log

            workspace_activity_template_log_string = schematics_service.get_template_activity_log(
                w_id=self.w_id,
                activity_id=self.a_id,
                t_id=self.t_id
            ).get_result()

            print(workspace_activity_template_log_string.text)
            return """
        get_template_activity_log request example
        """+"\n"+workspace_activity_template_log_string.text
            # end-get_template_activity_log

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_template_logs_example(self):
        print("""
        get_template_logs request example
        """)
        try:
            # begin-get_template_logs

            template_log_store_string = schematics_service.get_template_logs(
                w_id=self.w_id,
                t_id=self.t_id
            ).get_result()

            print(template_log_store_string.text)
            return """
        get_template_logs request example
        """+"\n"+template_log_store_string.text
            # end-get_template_logs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_state_example(self):
        print("""
        get_workspace_state request example
        """)
        try:
            # begin-get_workspace_state

            state_store_response_list = schematics_service.get_workspace_state(
                w_id=self.w_id
            ).get_result()

            print(json.dumps(state_store_response_list, indent=2))

            # end-get_workspace_state

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_template_state_example(self):
        print("""
        get_workspace_template_state request example
        """)
        try:
            # begin-get_workspace_template_state

            template_state_store = schematics_service.get_workspace_template_state(
                w_id=self.w_id,
                t_id=self.t_id
            ).get_result()

            print(json.dumps(template_state_store, indent=2))

            # end-get_workspace_template_state

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_resources_example(self):
        print("""
        get_workspace_resources request example
        """)
        try:
            # begin-get_workspace_resources

            list_template_resources = schematics_service.get_workspace_resources(
                w_id=self.w_id
            ).get_result()

            print(json.dumps(list_template_resources, indent=2))

            # end-get_workspace_resources

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_outputs_example(self):
        print("""
        get_workspace_outputs request example
        """)
        try:
            # begin-get_workspace_outputs

            list_output_values_inner = schematics_service.get_workspace_outputs(
                w_id=self.w_id
            ).get_result()

            print(json.dumps(list_output_values_inner, indent=2))

            # end-get_workspace_outputs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_all_workspace_inputs_example(self):
        print("""
        get_all_workspace_inputs request example
        """)
        try:
            # begin-get_all_workspace_inputs

            workspace_template_values_response = schematics_service.get_all_workspace_inputs(
                w_id=self.w_id
            ).get_result()

            print(json.dumps(workspace_template_values_response, indent=2))

            # end-get_all_workspace_inputs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_readme_example(self):
        print("""
        get_workspace_readme request example
        """)
        try:
            # begin-get_workspace_readme

            template_readme = schematics_service.get_workspace_readme(
                w_id=self.w_id
            ).get_result()

            print(json.dumps(template_readme, indent=2))

            # end-get_workspace_readme

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_workspace_inputs_example(self):
        print("""
        get_workspace_inputs request example
        """)
        try:
            # begin-get_workspace_inputs

            template_values = schematics_service.get_workspace_inputs(
                w_id=self.w_id,
                t_id=self.t_id
            ).get_result()

            print(json.dumps(template_values, indent=2))
            return """
        get_workspace_inputs request example
        """+"\n"+json.dumps(template_values, indent=2)
            # end-get_workspace_inputs

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_replace_workspace_inputs_example(self):
        print("""
        replace_workspace_inputs request example
        """)
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
    def test_get_workspace_input_metadata_example(self):
        print("""
        get_workspace_input_metadata request example
        """)
        try:
            # begin-get_workspace_input_metadata
            result = schematics_service.get_workspace_input_metadata(
                w_id=self.w_id,
                t_id=self.t_id,
            ).get_result()

            print(json.dumps(result, indent=2))

            # end-get_workspace_input_metadata

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_workspace_activity_example(self):
        print("""
        delete_workspace_activity request example
        """)
        try:
            # begin-delete_workspace_activity

            workspace_activity_apply_result = schematics_service.delete_workspace_activity(
                w_id=self.w_id,
                activity_id=self.a_id
            ).get_result()

            print(json.dumps(workspace_activity_apply_result, indent=2))

            # end-delete_workspace_activity

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_workspace_example(self):
        print("""
        delete_workspace request example
        """)
        try:
            # begin-delete_workspace

            workspace_delete_response = schematics_service.delete_workspace(
                w_id=self.w_id,
                refresh_token=self.refresh_token
            ).get_result()

            print(json.dumps(workspace_delete_response, indent=2))
            return """
        delete_workspace request example
        """
            # end-delete_workspace

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_job_example(self):
        print("""
        delete_job request example
        """)
        try:
            # begin-delete_job

            response = schematics_service.delete_job(
                job_id=self.job_id,
                refresh_token=self.refresh_token
            ).get_result()

            print(json.dumps(response, indent=2))
            return """
        delete_job request example
        """+"\n"+json.dumps(response, indent=2)
            # end-delete_job

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_action_example(self):
        print("""
        delete_action request example
        """)
        try:
            # begin-delete_action

            response = schematics_service.delete_action(
                action_id=delete_workspace_action_id
            ).get_result()

            print(json.dumps(response, indent=2))
            return """
        delete_action request example
        """+"\n"+json.dumps(response, indent=2)
            # end-delete_action

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_workspace_deletion_job_example(self,l):
        print("""
        create_workspace_deletion_job example
        """)
        try:
            # begin-delete_action

            workspace_bulk_delete_response = schematics_service.create_workspace_deletion_job(
                new_workspaces=l,
                refresh_token=self.refresh_token
            ).get_result()
            self.bulk_jid=workspace_bulk_delete_response["job_id"]
            print(json.dumps(workspace_bulk_delete_response, indent=2))
            return """
        create_workspace_deletion_job example
        """+"\n"+json.dumps(workspace_bulk_delete_response, indent=2)
            # end-delete_action

        except ApiException as e:
            pytest.fail(str(e))


    @needscredentials
    def test_get_workspace_deletion_job_status_example(self):
        print("""
        get_workspace_deletion_job_status
        """)
        try:
            
            workspace_job_response = schematics_service.get_workspace_deletion_job_status(
                wj_id=self.bulk_jid
            ).get_result()

            print(json.dumps(workspace_job_response, indent=2))
            return """
        get_workspace_deletion_job_status
        """+"\n"+json.dumps(workspace_job_response, indent=2)
        except ApiException as e:
            pytest.fail(str(e))


    @needscredentials
    def test_list_inventories_example(self):
        print("""
        list_inventories
        """)
        try:

            inventory_resource_record_list = schematics_service.list_inventories().get_result()
            print(json.dumps(inventory_resource_record_list, indent=2))
            return """
        list_inventories
        """+"\n"+json.dumps(inventory_resource_record_list, indent=2)
        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_inventory_example(self):
        print("""
        create_inventory
        """)
        try:

            inventory_resource_record = schematics_service.create_inventory(
                name= create_inventory_name,
                description= create_inventory_desc,
                location= create_inventory_location,
                resource_group=create_inventory_resource_group,
                resource_queries=create_inventory_resource_queries
            ).get_result()

            self.inv = inventory_resource_record["id"]
            print(json.dumps(inventory_resource_record, indent=2))
            return """
        create_inventory
        """+"\n"+json.dumps(inventory_resource_record, indent=2)

        except ApiException as e:
            pytest.fail(str(e))


    @needscredentials
    def test_get_inventory_example(self):
        print("""
        get_inventory
        """)
        try:

            inventory_resource_record = schematics_service.get_inventory(
                inventory_id=self.inv
            ).get_result()
            print(json.dumps(inventory_resource_record, indent=2))
            return """
        get_inventory
        """+"\n"+json.dumps(inventory_resource_record, indent=2)

        except ApiException as e:
            pytest.fail(str(e))
    

    @needscredentials
    def test_replace_inventory_example(self):
        print("""
        replace_inventory
        """)
        try:

            inventory_resource_record = schematics_service.replace_inventory(
                inventory_id=self.inv,
                name=replace_inventory_name,
                description=replace_inventory_description,
                location=replace_inventory_location,
                resource_group=replace_inventory_resource_group,
                resource_queries=replace_inventory_resource_queries
            ).get_result()
            print(json.dumps(inventory_resource_record, indent=2))
            return """
        replace_inventory
        """+"\n"+json.dumps(inventory_resource_record, indent=2)

        except ApiException as e:
            pytest.fail(str(e))


    @needscredentials
    def test_delete_inventory_example(self):
        print("""
        delete_inventory
        """)
        try:

            response = schematics_service.delete_inventory(
                inventory_id=self.inv
            ).get_result()
            print(json.dumps(response, indent=2))
            return """
        delete_inventory
        """+"\n"+json.dumps(response, indent=2)

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_list_resource_query_example(self):
        print("""
        list_resource_query
        """)
        try:

            resource_query_record_list = schematics_service.list_resource_query().get_result()
            print(json.dumps(resource_query_record_list, indent=2))
            return """
        list_resource_query
        """+"\n"+json.dumps(resource_query_record_list, indent=2)

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_create_resource_query_example(self):
        print("""
        create_resource_query
        """)
        try:

            resource_query_record = schematics_service.create_resource_query(
                type=create_resource_query_type,
                name=create_resource_query_name,
                queries=create_resource_queries
            ).get_result()
            self.query_id = resource_query_record["id"]
            print(json.dumps(resource_query_record, indent=2))
            return """
        create_resource_query
        """+"\n"+json.dumps(resource_query_record, indent=2)

        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_get_resources_query_example(self):
        print("""
        get_resources_query
        """)
        try:

            resource_query_record = schematics_service.get_resources_query(
            query_id=self.query_id
            ).get_result()
            print(json.dumps(resource_query_record, indent=2))
            return """
        get_resources_query
        """+"\n"+json.dumps(resource_query_record, indent=2)


        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_replace_resources_query_example(self):
        print("""
        replace_resources_query
        """)
        try:

            resource_query_record = schematics_service.replace_resources_query(
                query_id= self.query_id,
                type= replace_resources_query_type,
                name= replace_resources_query_name,
                queries=replace_resources_query_queries
            ).get_result()
            print(json.dumps(resource_query_record, indent=2))
            return """
        replace_resources_query
        """+"\n"+json.dumps(resource_query_record, indent=2)


        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_delete_resources_query_example(self):
        print("""
        delete_resources_query
        """)
        try:

            response = schematics_service.delete_resources_query(
                query_id=self.query_id
            ).get_result()
            print(json.dumps(response, indent=2))
            return """
        delete_resources_query
        """+"\n"+json.dumps(response, indent=2)


        except ApiException as e:
            pytest.fail(str(e))

    @needscredentials
    def test_kms_apis_example(self):
        t=""
        try:
            print("""
        get_kms_settings
        """)
            kms_settings = schematics_service.get_kms_settings(
                location=kms_settings_location
            ).get_result()
            print(json.dumps(kms_settings, indent=2))
            t+="""
        get_kms_settings
        """+"\n"+json.dumps(kms_settings, indent=2)

            print("""
        List KMS
        """)

            kms_discovery = schematics_service.list_kms(
                encryption_scheme=list_kms_encryption_scheme,
                location=list_kms_location
            ).get_result()
            print(json.dumps(kms_discovery, indent=2))
            t+="""
        List KMS
        """+"\n"+json.dumps(kms_discovery, indent=2)
            return t
        except ApiException as e:
            pytest.fail(str(e))


# endregion
##############################################################################
# End of Examples for Service: SchematicsV1
##############################################################################




# N = TestSchematicsV1Examples()
# N.setup_class()
# N.token()

# N.test_list_schematics_location_example()
# N.test_list_location_example()
# N.test_list_resource_group_example()
# N.test_get_schematics_version_example()
# N.example_process_template_meta_data_test()
# N.test_list_workspaces_example()

#workspace CRUD

# N.test_create_workspace_example(False)
# N.test_get_workspace_example(False)
# N.test_get_workspace_example(True)
# N.test_update_workspace_example()
# N.test_upload_template_tar_example()
# N.test_get_workspace_inputs_example()
# # N.test_get_workspace_resources_example()
# # N.test_get_workspace_state_example()
# N.test_delete_workspace_example()

# N.test_create_workspace_example(True)
# N.test_get_workspace_example(True)
# N.test_get_template_logs_example()
# N.test_get_template_activity_log_example()
# N.test_get_workspace_log_urls_example()
# N.test_delete_workspace_example()

#Actions

# N.test_list_actions_example()
# N.test_create_action_example()
# N.test_get_action_example()
# N.test_update_action_example()
# N.test_delete_action_example()

#Jobs

# N.test_create_workspace_example(True)
# N.test_get_workspace_example(True)
# N.test_list_workspace_activities_example()
# N.test_get_workspace_activity_example()
# N.test_plan_workspace_command_example()
# N.test_get_workspace_example(True)
# N.test_apply_workspace_command_example()
# N.test_get_workspace_example(True)
# N.test_destroy_workspace_command_example()
# N.test_get_workspace_example(True)
# N.test_refresh_workspace_command_example()
# N.test_get_workspace_example(True)
# # N.test_delete_workspace_activity_example()

# N.test_list_jobs_example()
# N.test_create_job_example()
# N.test_get_job_example(False)
# N.test_update_job_example()
# N.test_get_job_example(True)
# N.test_list_job_logs_example()
# N.test_delete_job_example()

# Bulk-jobs

# l=[]
# for _ in range(5):
#     l.append(N.test_create_workspace_example(False)["id"])
# N.test_create_workspace_deletion_job_example(l)
# N.test_get_workspace_deletion_job_status_example()

#Inventories

# N.test_list_inventories_example()
# N.test_create_inventory_example()
# N.test_get_inventory_example()
# N.test_replace_inventory_example()
# N.test_delete_inventory_example()

#Resource-queries

# N.test_list_resource_query_example()
# N.test_create_resource_query_example()
# N.test_get_resources_query_example()
# N.test_replace_resources_query_example()
# N.test_delete_resources_query_example()

