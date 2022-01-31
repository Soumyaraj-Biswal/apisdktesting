### Current Implementation

1. Current Implementation has been done by manually adding the APIs to a single file(apitestpytemplate.py).
2. This file has code with payload information which are defined in a series of functions.
3. Each api is called in a function defined in a class.
4. This file require additional 3 files for proper running
    1. One file named executor.py calls each function after creating a token from your API Key(IBMCLOUD_API_KEY needs to be set as environment variable before running the file), and creating all the authorization configuration which are required by the APIs
    2. test_data.py has all the variables defined with payload test data, this file needs to be maintained after every test(read the comments added to the file).
    3. schematics_v1.env file which has 2 variables IBM_SCHEMATICS_URL and IBM_SCHEMATICS_APIKEY and values.
5. Run the executor.py file to see the output(also gets saved to output.txt)
6. At current stage we implemented the 3rd part of the testing tool and the complete tool can be developed further by following a bottom-up approach.

### Future Work

1. Creation of a tool to extract example snippets of apis from the Swagger and storing it to a raw file.
2. A better approach would be to convert swagger.yml file to json for easier extraction.
3. Raw file should follow the same structure as apitestpytemplate.py file(a class with functions calling each api)
4. Creating of a tool which takes the raw file with all example scripts of each api and generate the apitestpytemplate.py file.
5. This raw file should have few helper scripts to add each variable names which are present in test_data.py to the appropriate apis in apitestpytemplate.py file.
6. Adding functionality to the existing tool to compare the response generated apitestpytemplate.py file with the response present in the swagger file for test results.

### Supporting APIs

1. list_schematics_location
2. list_location 
3. list_resource_group 
4. get_schematics_version 
5. process_template_meta_data
6. list_workspaces
7. create_workspace
8. get_workspace
9. update_workspace
10. upload_template_tar
11. get_workspace_inputs
12. delete_workspace
13. get_template_logs
14. get_template_activity_log
15. get_workspace_log_urls
16. delete_workspace
17. list_actions
18. create_action
19. get_action
20. update_action
21. delete_action
22. list_workspace_activities
23. get_workspace_activity
24. plan_workspace_command
25. apply_workspace_command
26. destroy_workspace_command
27. refresh_workspace_command
28. list_jobs
29. create_job
30. get_job)
31. update_job
32. list_job_logs
34. delete_job
35. create_workspace_deletion_job
37. get_workspace_deletion_job_status
38. list_inventories
39. create_inventory
40. get_inventory
41. replace_inventory
42. delete_inventory
43. list_resource_query
44. create_resource_query
45. get_resources_query
46. replace_resources_query
47. delete_resources_query
48. get_kms_settings
49. list_kms
