# example_process_template_meta_data_test

version='terraform_v0.15'
external_source_model = {
    'source_type': 'git_hub',
    'git' : {
        'computed_git_repo_url': 'string',
        'git_repo_url': 'https://github.com/IBM-Cloud/terraform-provider-ibm/tree/master/examples/ibm-vsi',
    },
}

# test_create_workspace_example

template_source_data_request_model = {}
template_source_data_request_model['env_values'] = [{ 'foo': 'bar' }]
template_source_data_request_model['folder'] = '.'
template_source_data_request_model['type'] = 'terraform_v0.12'
template_source_data_request_model['variablestore'] = [
    {
        "name":"sample_var",
        "secure":False,
        "value":"THIS IS IBM CLOUD TERRAFORM CLI DEMO",
        "description":"Description of sample_var"
    },
    {
        "name":"sleepy_time",
        "value":"15"
    }
]

template_repo_request_model = {}
template_repo_request_model['url'] = 'https://github.com/ptaube/tf_cloudless_sleepy'



tags = ["HR","compensation","staging"]
workspace_status ={}
workspace_status['frozen']=False
workspace_status['locked']=False
create_workspace_desc="terraform workspace"
create_workspace_name="testWorkspaceApi"
create_workspace_type=["terraform_v0.12"]
create_workspace_location="us-south"
create_workspace_resource_group="default"


# test_upload_template_tar_example

template_tar_file_name='master.tar'

# test_create_action_example

create_action_name="mskpythonsamples-templates6375"#unique
create_action_description="<short description>"
create_action_location="us-south"
# create_action_resource_group="default"
create_action_tags=["User environment,mytest"]
create_action_source={
    'git':
        {
            'git_repo_url':'https://github.com/Cloud-Schematics/cli-demo'
        }
    }

# test_update_action_example

update_action_action_id="us-south.ACTION.myactiongf.30e2c358" #provide everytime
update_action_name="mskpythonsamples-templates678765"

# test_delete_action_example

delete_workspace_action_id="us-south.ACTION.myactiongf.30e2c358" # needed to be provided evertime

# test_list_jobs_example

list_jobs_resource="action"
list_jobs_action_id="us-south.ACTION.myaction.66d1a10f"

# test_create_job_example

create_job_command_object="action"
create_job_command_object_id="us-south.ACTION.myaction.66d1a10f"
create_job_command_name="ansible_playbook_run"
create_job_command_parameter="test.yml"

#test_create_inventory_example

create_inventory_name="dev-inventory29"#unique
create_inventory_desc="My dev env inventory"
create_inventory_location="us-east"
create_inventory_resource_group="Default"
create_inventory_resource_queries=["default.RESOURCEQUERY.string.df3d8a47"]

# test_replace_inventory_example

replace_inventory_id='us-east.INVENTORY.dev-inventory542.475e3f27'
replace_inventory_name="dev-inventory542"
replace_inventory_description="My dev env inventory text is replaced"
replace_inventory_location="us-east"
replace_inventory_resource_group= "Default"
replace_inventory_resource_queries=["default.RESOURCEQUERY.string.df3d8a47"]

# test_create_resource_query_example

create_resource_query_type="workspace_resource"
create_resource_query_name="hello my world"
create_resource_queries=[{
    "query_type":"workspaces",
    "query_condition": [{
    "name":"workspace-id",
    "value":"us-east.ACTION.kubectlWorkshop.41901417",
    "description":"string"},{
    "name":"resource-name",
    "value":"tf00vpc-pubpriv-frontend-vsi",
    "description":"string"}
]
}
]

# test_replace_resources_query_example

replace_resources_query_type= "workspace_resource"
replace_resources_query_name= "hello my world"
replace_resources_query_queries=[
    {
        "query_type": "workspaces",
        "query_condition": [
            {
                "name": "workspace-id",
                "value": "us-east.ACTION.kubectlWorkshop.41901417",
                "description": "string"
            },
            {
                "name": "resource-name",
                "value": "tf00vpc-pubpriv-frontend-vsi",
                "description": "string"
            }
        ]   
    }
]

# KMS 

kms_settings_location='US'

list_kms_encryption_scheme='byok'
list_kms_location='US'