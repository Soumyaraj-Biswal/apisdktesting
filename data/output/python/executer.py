from apitestpytemplate import TestSchematicsV1Examples
import json

N = TestSchematicsV1Examples()
N.setup_class()
N.token()
t=""
t+=N.test_list_schematics_location_example()
t+=N.test_list_location_example()
t+=N.test_list_resource_group_example()
t+=N.test_get_schematics_version_example()
t+=N.example_process_template_meta_data_test()
t+=N.test_list_workspaces_example()

#workspace CRUD

t+="""
    create_workspace request example
"""+"\n"+json.dumps(N.test_create_workspace_example(False), indent=2)
t+=N.test_get_workspace_example(False)
N.test_get_workspace_example(True)
t+=N.test_update_workspace_example()
t+=N.test_upload_template_tar_example()
N.test_get_workspace_example(True)
t+=N.test_get_workspace_inputs_example()
t+=N.test_delete_workspace_example()

t+="""
    create_workspace request example
"""+"\n"+json.dumps(N.test_create_workspace_example(True),indent=2)
t+=N.test_get_workspace_example(True)
t+=N.test_get_template_logs_example()
t+=N.test_get_template_activity_log_example()
t+=N.test_get_workspace_log_urls_example()
t+=N.test_delete_workspace_example()

#Actions

t+=N.test_list_actions_example()
t+=N.test_create_action_example()
t+=N.test_get_action_example()
t+=N.test_update_action_example()
t+=N.test_delete_action_example()

#Jobs

t+="""
    create_workspace request example
"""+"\n"+json.dumps(N.test_create_workspace_example(True), indent=2)
t+=N.test_get_workspace_example(True)
t+=N.test_list_workspace_activities_example()
t+=N.test_get_workspace_activity_example()
t+=N.test_plan_workspace_command_example()
N.test_get_workspace_example(True)
t+=N.test_apply_workspace_command_example()
N.test_get_workspace_example(True)
t+=N.test_destroy_workspace_command_example()
N.test_get_workspace_example(True)
t+=N.test_refresh_workspace_command_example()
N.test_get_workspace_example(True)

t+=N.test_list_jobs_example()
t+=N.test_create_job_example()
t+=N.test_get_job_example(False)
t+=N.test_update_job_example()
N.test_get_job_example(True)
t+=N.test_list_job_logs_example()
t+=N.test_delete_job_example()

# Bulk-jobs

l=[]
for _ in range(5):
    l.append(N.test_create_workspace_example(False)["id"])
t+=N.test_create_workspace_deletion_job_example(l)
t+=N.test_get_workspace_deletion_job_status_example()

#Inventories

t+=N.test_list_inventories_example()
t+=N.test_create_inventory_example()
t+=N.test_get_inventory_example()
t+=N.test_replace_inventory_example()
t+=N.test_delete_inventory_example()

#Resource-queries

t+=N.test_list_resource_query_example()
t+=N.test_create_resource_query_example()
t+=N.test_get_resources_query_example()
t+=N.test_replace_resources_query_example()
t+=N.test_delete_resources_query_example()


# KMS

t+=N.test_kms_apis_example()

f = open("output.txt", "w")
f.write(t)
f.close()