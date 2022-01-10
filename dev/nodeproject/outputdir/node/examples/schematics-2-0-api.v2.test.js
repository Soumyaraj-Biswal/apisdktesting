/**
* @jest-environment node
*/
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
'use strict';

const Schematics20ApiV2 = require('../dist/schematics-2-0-api/v2');
const { readExternalSources } = require('ibm-cloud-sdk-core');
const authHelper = require('../test/resources/auth-helper.js');

// Location of our config file.
const configFile = 'schematics20_api_v2.env';

const describe = authHelper.prepareTests(configFile);

// Save original console.log and console.warn
const originalLog = console.log;
const originalWarn = console.warn;

// Mocks for console.log and console.warn
const consoleLogMock = jest.spyOn(console, 'log');
const consoleWarnMock = jest.spyOn(console, 'warn');

describe('Schematics20ApiV2', () => {

  // begin-common

  const schematics20ApiService = Schematics20ApiV2.newInstance({});

  // end-common

  const config = readExternalSources(Schematics20ApiV2.DEFAULT_SERVICE_NAME);

  test('getSchematicsInfo request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_schematics_info

    schematics20ApiService.getSchematicsInfo({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_schematics_info
  });
  test('listSchematicsAccessRules request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_schematics_access_rules

    schematics20ApiService.listSchematicsAccessRules({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_schematics_access_rules
  });
  test('getSchematicsAccessRulesForResource request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_schematics_access_rules_for_resource

    const params = {
      resourceName: 'testString',
    };

    schematics20ApiService.getSchematicsAccessRulesForResource(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_schematics_access_rules_for_resource
  });
  test('getSchematicsCommandNames request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_schematics_command_names

    const params = {
      resourceName: 'testString',
    };

    schematics20ApiService.getSchematicsCommandNames(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_schematics_command_names
  });
  test('listWorkspaces request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_workspaces

    schematics20ApiService.listWorkspaces({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_workspaces
  });
  test('createWorkspace request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-create_workspace

    const params = {
      workspace: workspaceModel,
    };

    schematics20ApiService.createWorkspace(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-create_workspace
  });
  test('getWorkspace request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_workspace

    const params = {
      workspaceId: 'testString',
    };

    schematics20ApiService.getWorkspace(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_workspace
  });
  test('replaceWorkspace request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-replace_workspace

    const params = {
      workspaceId: 'testString',
      workspace: workspaceModel,
    };

    schematics20ApiService.replaceWorkspace(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-replace_workspace
  });
  test('updateWorkspace request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-update_workspace

    const params = {
      workspaceId: 'testString',
      workspace: workspaceModel,
    };

    schematics20ApiService.updateWorkspace(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-update_workspace
  });
  test('listWorkspaceInputs request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_workspace_inputs

    const params = {
      workspaceId: 'testString',
    };

    schematics20ApiService.listWorkspaceInputs(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_workspace_inputs
  });
  test('listWorkspaceOutputs request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_workspace_outputs

    const params = {
      workspaceId: 'testString',
    };

    schematics20ApiService.listWorkspaceOutputs(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_workspace_outputs
  });
  test('createWorkspaceTemplates request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-create_workspace_templates

    const params = {
      templateListRequest: templateListRequestModel,
    };

    schematics20ApiService.createWorkspaceTemplates(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-create_workspace_templates
  });
  test('listTemplatesInWorkspace request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_templates_in_workspace

    const params = {
      workspaceId: 'testString',
    };

    schematics20ApiService.listTemplatesInWorkspace(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_templates_in_workspace
  });
  test('addTemplatesToWorkspace request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-add_templates_to_workspace

    const params = {
      workspaceId: 'testString',
      template: templateModel,
    };

    schematics20ApiService.addTemplatesToWorkspace(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-add_templates_to_workspace
  });
  test('getTemplateInWorkspace request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_template_in_workspace

    const params = {
      workspaceId: 'testString',
      templateId: 'testString',
    };

    schematics20ApiService.getTemplateInWorkspace(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_template_in_workspace
  });
  test('replaceTemplateInWorkspace request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-replace_template_in_workspace

    const params = {
      workspaceId: 'testString',
      templateId: 'testString',
    };

    schematics20ApiService.replaceTemplateInWorkspace(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-replace_template_in_workspace
  });
  test('updateTemplateInWorkspace request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-update_template_in_workspace

    const params = {
      workspaceId: 'testString',
      templateId: 'testString',
    };

    schematics20ApiService.updateTemplateInWorkspace(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-update_template_in_workspace
  });
  test('uploadTemplateTarInWorkspace request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-upload_template_tar_in_workspace

    const params = {
      workspaceId: 'testString',
      templateId: 'testString',
    };

    schematics20ApiService.uploadTemplateTarInWorkspace(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-upload_template_tar_in_workspace
  });
  test('getTemplateReadme request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_template_readme

    const params = {
      workspaceId: 'testString',
      templateId: 'testString',
    };

    schematics20ApiService.getTemplateReadme(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_template_readme
  });
  test('getTemplateSource request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_template_source

    const params = {
      workspaceId: 'testString',
      templateId: 'testString',
    };

    schematics20ApiService.getTemplateSource(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_template_source
  });
  test('listTemplateInputs request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_template_inputs

    const params = {
      workspaceId: 'testString',
      templateId: 'testString',
    };

    schematics20ApiService.listTemplateInputs(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_template_inputs
  });
  test('listTemplateOutputs request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_template_outputs

    const params = {
      workspaceId: 'testString',
      templateId: 'testString',
    };

    schematics20ApiService.listTemplateOutputs(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_template_outputs
  });
  test('listFlowsInWorkspace request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_flows_in_workspace

    const params = {
      workspaceId: 'testString',
    };

    schematics20ApiService.listFlowsInWorkspace(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_flows_in_workspace
  });
  test('addFlowToWorkspace request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-add_flow_to_workspace

    const params = {
      workspaceId: 'testString',
      templateFlow: templateFlowModel,
    };

    schematics20ApiService.addFlowToWorkspace(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-add_flow_to_workspace
  });
  test('getFlowInWorkspace request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_flow_in_workspace

    const params = {
      workspaceId: 'testString',
      flowId: 'testString',
    };

    schematics20ApiService.getFlowInWorkspace(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_flow_in_workspace
  });
  test('replaceFlowInWorkspace request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-replace_flow_in_workspace

    const params = {
      workspaceId: 'testString',
      flowId: 'testString',
    };

    schematics20ApiService.replaceFlowInWorkspace(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-replace_flow_in_workspace
  });
  test('updateFlowInWorkspace request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-update_flow_in_workspace

    const params = {
      workspaceId: 'testString',
      flowId: 'testString',
    };

    schematics20ApiService.updateFlowInWorkspace(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-update_flow_in_workspace
  });
  test('listActions request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_actions

    schematics20ApiService.listActions({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_actions
  });
  test('createAction request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-create_action

    const params = {
      action: actionModel,
    };

    schematics20ApiService.createAction(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-create_action
  });
  test('getAction request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_action

    const params = {
      actionId: 'testString',
    };

    schematics20ApiService.getAction(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_action
  });
  test('updateAction request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-update_action

    const params = {
      actionId: 'testString',
      action: actionModel,
    };

    schematics20ApiService.updateAction(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-update_action
  });
  test('uploadTemplateTarAction request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-upload_template_tar_action

    const params = {
      actionId: 'testString',
    };

    schematics20ApiService.uploadTemplateTarAction(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-upload_template_tar_action
  });
  test('listJobs request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_jobs

    schematics20ApiService.listJobs({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_jobs
  });
  test('createJob request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-create_job

    const params = {
      refreshToken: 'testString',
      job: jobModel,
    };

    schematics20ApiService.createJob(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-create_job
  });
  test('getJob request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_job

    const params = {
      jobId: 'testString',
    };

    schematics20ApiService.getJob(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_job
  });
  test('updateJob request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-update_job

    const params = {
      jobId: 'testString',
      refreshToken: 'testString',
      job: jobModel,
    };

    schematics20ApiService.updateJob(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-update_job
  });
  test('listJobLogs request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_job_logs

    const params = {
      jobId: 'testString',
    };

    schematics20ApiService.listJobLogs(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_job_logs
  });
  test('listJobStates request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_job_states

    const params = {
      jobId: 'testString',
    };

    schematics20ApiService.listJobStates(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_job_states
  });
  test('listControls request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_controls

    schematics20ApiService.listControls({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_controls
  });
  test('createControls request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-create_controls

    const params = {
      controls: controlsModel,
    };

    schematics20ApiService.createControls(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-create_controls
  });
  test('getControls request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_controls

    const params = {
      controlsId: 'testString',
    };

    schematics20ApiService.getControls(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_controls
  });
  test('updateControls request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-update_controls

    const params = {
      controlsId: 'testString',
      controls: controlsModel,
    };

    schematics20ApiService.updateControls(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-update_controls
  });
  test('listCapsules request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_capsules

    const params = {
      controlsId: 'testString',
    };

    schematics20ApiService.listCapsules(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_capsules
  });
  test('createCapsule request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-create_capsule

    const params = {
      controlsId: 'testString',
      capsule: capsuleModel,
    };

    schematics20ApiService.createCapsule(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-create_capsule
  });
  test('getCapsule request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_capsule

    const params = {
      controlsId: 'testString',
      capsuleId: 'testString',
    };

    schematics20ApiService.getCapsule(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_capsule
  });
  test('updateCapsule request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-update_capsule

    const params = {
      controlsId: 'testString',
      capsuleId: 'testString',
      capsule: capsuleModel,
    };

    schematics20ApiService.updateCapsule(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-update_capsule
  });
  test('listDatasets request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_datasets

    schematics20ApiService.listDatasets({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_datasets
  });
  test('createDataset request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-create_dataset

    const params = {
      dataset: datasetModel,
    };

    schematics20ApiService.createDataset(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-create_dataset
  });
  test('getDataset request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_dataset

    const params = {
      datasetId: 'testString',
    };

    schematics20ApiService.getDataset(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_dataset
  });
  test('replaceDataset request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-replace_dataset

    const params = {
      datasetId: 'testString',
      dataset: datasetModel,
    };

    schematics20ApiService.replaceDataset(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-replace_dataset
  });
  test('updateAtaset request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-update_ataset

    const params = {
      datasetId: 'testString',
      dataset: datasetModel,
    };

    schematics20ApiService.updateAtaset(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-update_ataset
  });
  test('listDatasetVariables request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_dataset_variables

    const params = {
      datasetId: 'testString',
    };

    schematics20ApiService.listDatasetVariables(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_dataset_variables
  });
  test('getDatasetVariable request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_dataset_variable

    const params = {
      datasetId: 'testString',
      varName: 'testString',
    };

    schematics20ApiService.getDatasetVariable(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_dataset_variable
  });
  test('listCredentials request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_credentials

    schematics20ApiService.listCredentials({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_credentials
  });
  test('createCredential request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-create_credential

    const params = {
      credentialset: credentialsetModel,
    };

    schematics20ApiService.createCredential(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-create_credential
  });
  test('getCredential request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_credential

    const params = {
      credsId: 'testString',
    };

    schematics20ApiService.getCredential(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_credential
  });
  test('replaceCredential request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-replace_credential

    const params = {
      credsId: 'testString',
      credentialset: credentialsetModel,
    };

    schematics20ApiService.replaceCredential(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-replace_credential
  });
  test('updateCredential request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-update_credential

    const params = {
      credsId: 'testString',
      credentialset: credentialsetModel,
    };

    schematics20ApiService.updateCredential(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-update_credential
  });
  test('listCredentialValues request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_credential_values

    const params = {
      credsId: 'testString',
    };

    schematics20ApiService.listCredentialValues(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_credential_values
  });
  test('getCredentialValue request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_credential_value

    const params = {
      credsId: 'testString',
      varName: 'testString',
    };

    schematics20ApiService.getCredentialValue(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_credential_value
  });
  test('listInventories request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_inventories

    schematics20ApiService.listInventories({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_inventories
  });
  test('createInventory request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-create_inventory

    const params = {
      inventoryResourceDefinition: inventoryResourceDefinitionModel,
    };

    schematics20ApiService.createInventory(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-create_inventory
  });
  test('getInventory request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_inventory

    const params = {
      inventoryId: 'testString',
    };

    schematics20ApiService.getInventory(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_inventory
  });
  test('replaceInventory request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-replace_inventory

    const params = {
      inventoryId: 'testString',
      inventoryResourceDefinition: inventoryResourceDefinitionModel,
    };

    schematics20ApiService.replaceInventory(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-replace_inventory
  });
  test('updateInventory request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-update_inventory

    const params = {
      inventoryId: 'testString',
      inventoryResourceDefinition: inventoryResourceDefinitionModel,
    };

    schematics20ApiService.updateInventory(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-update_inventory
  });
  test('listResourceQuery request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_resource_query

    schematics20ApiService.listResourceQuery({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_resource_query
  });
  test('createResourceQuery request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-create_resource_query

    const params = {
      resourceQueryDefinition: resourceQueryDefinitionModel,
    };

    schematics20ApiService.createResourceQuery(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-create_resource_query
  });
  test('getResourcesQuery request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_resources_query

    const params = {
      queryId: 'testString',
    };

    schematics20ApiService.getResourcesQuery(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_resources_query
  });
  test('replaceResourcesQuery request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-replace_resources_query

    const params = {
      queryId: 'testString',
      resourceQueryDefinition: resourceQueryDefinitionModel,
    };

    schematics20ApiService.replaceResourcesQuery(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-replace_resources_query
  });
  test('executeResourceQuery request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-execute_resource_query

    const params = {
      queryId: 'testString',
    };

    schematics20ApiService.executeResourceQuery(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-execute_resource_query
  });
  test('getDatasetVariableValue request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_dataset_variable_value

    const params = {
      datasetId: 'testString',
      varName: 'testString',
    };

    schematics20ApiService.getDatasetVariableValue(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_dataset_variable_value
  });
  test('getCredentialVariableValue request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_credential_variable_value

    const params = {
      credsId: 'testString',
      varName: 'testString',
    };

    schematics20ApiService.getCredentialVariableValue(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_credential_variable_value
  });
  test('getInventoryVariableValue request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_inventory_variable_value

    const params = {
      inventoryId: 'testString',
      varName: 'testString',
    };

    schematics20ApiService.getInventoryVariableValue(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_inventory_variable_value
  });
  test('getWorkspaceInputValue request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_workspace_input_value

    const params = {
      workspaceId: 'testString',
      varName: 'testString',
    };

    schematics20ApiService.getWorkspaceInputValue(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_workspace_input_value
  });
  test('getWorkspaceOutputValue request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_workspace_output_value

    const params = {
      workspaceId: 'testString',
      varName: 'testString',
    };

    schematics20ApiService.getWorkspaceOutputValue(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_workspace_output_value
  });
  test('getWorkspaceSettingsValue request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_workspace_settings_value

    const params = {
      workspaceId: 'testString',
      varName: 'testString',
    };

    schematics20ApiService.getWorkspaceSettingsValue(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_workspace_settings_value
  });
  test('getWorkspaceTemplateInputValue request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_workspace_template_input_value

    const params = {
      workspaceId: 'testString',
      templateId: 'testString',
      varName: 'testString',
    };

    schematics20ApiService.getWorkspaceTemplateInputValue(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_workspace_template_input_value
  });
  test('getWorkspaceTemplateOutputValue request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_workspace_template_output_value

    const params = {
      workspaceId: 'testString',
      templateId: 'testString',
      varName: 'testString',
    };

    schematics20ApiService.getWorkspaceTemplateOutputValue(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_workspace_template_output_value
  });
  test('getWorkspaceTemplateSettingValue request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_workspace_template_setting_value

    const params = {
      workspaceId: 'testString',
      templateId: 'testString',
      varName: 'testString',
    };

    schematics20ApiService.getWorkspaceTemplateSettingValue(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_workspace_template_setting_value
  });
  test('getJobWorkspaceInputValue request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_job_workspace_input_value

    const params = {
      jobId: 'testString',
      workspaceId: 'testString',
      varName: 'testString',
    };

    schematics20ApiService.getJobWorkspaceInputValue(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_job_workspace_input_value
  });
  test('getJobWorkspaceOutputValue request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_job_workspace_output_value

    const params = {
      jobId: 'testString',
      workspaceId: 'testString',
      varName: 'testString',
    };

    schematics20ApiService.getJobWorkspaceOutputValue(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_job_workspace_output_value
  });
  test('getJobWorkspaceSettingValue request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_job_workspace_setting_value

    const params = {
      jobId: 'testString',
      workspaceId: 'testString',
      varName: 'testString',
    };

    schematics20ApiService.getJobWorkspaceSettingValue(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_job_workspace_setting_value
  });
  test('listTriggers request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_triggers

    schematics20ApiService.listTriggers({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_triggers
  });
  test('createTrigger request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-create_trigger

    const params = {
      trigger: triggerModel,
    };

    schematics20ApiService.createTrigger(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-create_trigger
  });
  test('getTrigger request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_trigger

    const params = {
      triggerId: 'testString',
    };

    schematics20ApiService.getTrigger(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_trigger
  });
  test('replaceTrigger request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-replace_trigger

    const params = {
      triggerId: 'testString',
      trigger: triggerModel,
    };

    schematics20ApiService.replaceTrigger(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-replace_trigger
  });
  test('listWebhook request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_webhook

    schematics20ApiService.listWebhook({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_webhook
  });
  test('createWebhook request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-create_webhook

    const params = {
      webHook: webHookModel,
    };

    schematics20ApiService.createWebhook(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-create_webhook
  });
  test('getWebhook request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_webhook

    const params = {
      hookId: 'testString',
    };

    schematics20ApiService.getWebhook(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_webhook
  });
  test('replaceWebhook request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-replace_webhook

    const params = {
      hookId: 'testString',
      webHook: webHookModel,
    };

    schematics20ApiService.replaceWebhook(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-replace_webhook
  });
  test('getPrivateCluster request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_private_cluster

    schematics20ApiService.getPrivateCluster({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_private_cluster
  });
  test('createPrivateCluster request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-create_private_cluster

    const params = {
      privateCluster: privateClusterModel,
    };

    schematics20ApiService.createPrivateCluster(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-create_private_cluster
  });
  test('listAdapter request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_adapter

    schematics20ApiService.listAdapter({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_adapter
  });
  test('createAdapter request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-create_adapter

    const params = {
      adapter: adapterModel,
    };

    schematics20ApiService.createAdapter(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-create_adapter
  });
  test('getAdapter request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_adapter

    const params = {
      adapterId: 'testString',
    };

    schematics20ApiService.getAdapter(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_adapter
  });
  test('replaceAdapter request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-replace_adapter

    const params = {
      adapterId: 'testString',
      adapter: adapterModel,
    };

    schematics20ApiService.replaceAdapter(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-replace_adapter
  });
  test('listConnection request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_connection

    schematics20ApiService.listConnection({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_connection
  });
  test('createConnection request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-create_connection

    const params = {
      connection: connectionModel,
    };

    schematics20ApiService.createConnection(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-create_connection
  });
  test('listDatasources request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_datasources

    schematics20ApiService.listDatasources({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_datasources
  });
  test('createDatasource request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-create_datasource

    const params = {
      datasource: datasourceModel,
    };

    schematics20ApiService.createDatasource(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-create_datasource
  });
  test('listCart request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_cart

    const params = {
      service: 'testString',
    };

    schematics20ApiService.listCart(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_cart
  });
  test('createCartOrder request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-create_cart_order

    const params = {
      cartOrder: cartOrderModel,
    };

    schematics20ApiService.createCartOrder(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-create_cart_order
  });
  test('getCartOrder request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_cart_order

    const params = {
      orderId: 'testString',
    };

    schematics20ApiService.getCartOrder(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_cart_order
  });
  test('replaceCartOrder request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-replace_cart_order

    const params = {
      orderId: 'testString',
      operation: '0',
      cartOrder: cartOrderModel,
    };

    schematics20ApiService.replaceCartOrder(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-replace_cart_order
  });
  test('runFulfilmentOperation request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-run_fulfilment_operation

    const params = {
      orderId: 'testString',
      operation: '0',
    };

    schematics20ApiService.runFulfilmentOperation(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-run_fulfilment_operation
  });
  test('updateCartOrder request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-update_cart_order

    const params = {
      orderId: 'testString',
      updateCartOrder: updateCartOrderModel,
    };

    schematics20ApiService.updateCartOrder(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-update_cart_order
  });
  test('getCartMetadata request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_cart_metadata

    const params = {
      orderId: 'testString',
    };

    schematics20ApiService.getCartMetadata(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_cart_metadata
  });
  test('listCartResources request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_cart_resources

    const params = {
      orderId: 'testString',
    };

    schematics20ApiService.listCartResources(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_cart_resources
  });
  test('listCartOrderJobs request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_cart_order_jobs

    const params = {
      orderId: 'testString',
    };

    schematics20ApiService.listCartOrderJobs(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_cart_order_jobs
  });
  test('getCartOrderJob request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_cart_order_job

    const params = {
      orderId: 'testString',
      jobId: 'testString',
    };

    schematics20ApiService.getCartOrderJob(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_cart_order_job
  });
  test('getCartOrderJobLog request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_cart_order_job_log

    const params = {
      orderId: 'testString',
      jobId: 'testString',
    };

    schematics20ApiService.getCartOrderJobLog(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_cart_order_job_log
  });
  test('getCartOrderJobResources request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_cart_order_job_resources

    const params = {
      orderId: 'testString',
      jobId: 'testString',
    };

    schematics20ApiService.getCartOrderJobResources(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_cart_order_job_resources
  });
  test('listEnvironmentDefinitions request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_environment_definitions

    schematics20ApiService.listEnvironmentDefinitions({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_environment_definitions
  });
  test('getEnvironmentDefinition request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_environment_definition

    const params = {
      offeringId: 'testString',
    };

    schematics20ApiService.getEnvironmentDefinition(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_environment_definition
  });
  test('listEnvironment request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_environment

    schematics20ApiService.listEnvironment({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_environment
  });
  test('createEnvironment request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-create_environment

    const params = {
      environment: environmentModel,
    };

    schematics20ApiService.createEnvironment(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-create_environment
  });
  test('getEnvironment request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_environment

    const params = {
      environmentId: 'testString',
    };

    schematics20ApiService.getEnvironment(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_environment
  });
  test('replaceEnvironment request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-replace_environment

    const params = {
      environmentId: 'testString',
      environment: environmentModel,
    };

    schematics20ApiService.replaceEnvironment(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-replace_environment
  });
  test('updateEnvironment request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-update_environment

    const params = {
      environmentId: 'testString',
      environment: environmentModel,
    };

    schematics20ApiService.updateEnvironment(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-update_environment
  });
  test('listEnvironmentWorkspaces request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_environment_workspaces

    const params = {
      environmentId: 'testString',
    };

    schematics20ApiService.listEnvironmentWorkspaces(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_environment_workspaces
  });
  test('listEnvironmentResources request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_environment_resources

    const params = {
      environmentId: 'testString',
    };

    schematics20ApiService.listEnvironmentResources(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_environment_resources
  });
  test('getKmsSettings request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-get_kms_settings

    const params = {
      location: 'testString',
    };

    schematics20ApiService.getKmsSettings(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-get_kms_settings
  });
  test('updateKmsSettings request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-update_kms_settings

    const params = {
      kmsSettings: kmsSettingsModel,
    };

    schematics20ApiService.updateKmsSettings(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-update_kms_settings
  });
  test('listKms request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_kms

    const params = {
      encryptionScheme: 'testString',
      location: 'testString',
    };

    schematics20ApiService.listKms(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_kms
  });
  test('listLocations request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-list_locations

    schematics20ApiService.listLocations({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_locations
  });
  test('processTemplateMetaData request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-ProcessTemplateMetaData

    const params = {
      templateMetaDataRequest: templateMetaDataRequestModel,
    };

    schematics20ApiService.processTemplateMetaData(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-ProcessTemplateMetaData
  });
  test('deleteWorkspace request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-delete_workspace

    const params = {
      workspaceId: 'testString',
    };

    schematics20ApiService.deleteWorkspace(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-delete_workspace
  });
  test('deleteWebhook request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-delete_webhook

    const params = {
      hookId: 'testString',
    };

    schematics20ApiService.deleteWebhook(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-delete_webhook
  });
  test('deleteTrigger request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-delete_trigger

    const params = {
      triggerId: 'testString',
    };

    schematics20ApiService.deleteTrigger(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-delete_trigger
  });
  test('deleteTemplateFromWorkspace request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-delete_template_from_workspace

    const params = {
      workspaceId: 'testString',
      templateId: 'testString',
    };

    schematics20ApiService.deleteTemplateFromWorkspace(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-delete_template_from_workspace
  });
  test('deleteResourcesQuery request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-delete_resources_query

    const params = {
      queryId: 'testString',
    };

    schematics20ApiService.deleteResourcesQuery(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-delete_resources_query
  });
  test('deletePrivateCluster request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-delete_private_cluster

    schematics20ApiService.deletePrivateCluster({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-delete_private_cluster
  });
  test('deleteJob request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-delete_job

    const params = {
      jobId: 'testString',
      refreshToken: 'testString',
    };

    schematics20ApiService.deleteJob(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-delete_job
  });
  test('deleteInventory request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-delete_inventory

    const params = {
      inventoryId: 'testString',
    };

    schematics20ApiService.deleteInventory(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-delete_inventory
  });
  test('deleteFlowFromWorkspace request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-delete_flow_from_workspace

    const params = {
      workspaceId: 'testString',
      flowId: 'testString',
    };

    schematics20ApiService.deleteFlowFromWorkspace(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-delete_flow_from_workspace
  });
  test('deleteEnvironment request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-delete_environment

    const params = {
      environmentId: 'testString',
    };

    schematics20ApiService.deleteEnvironment(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-delete_environment
  });
  test('deleteDataset request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-delete_dataset

    const params = {
      datasetId: 'testString',
    };

    schematics20ApiService.deleteDataset(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-delete_dataset
  });
  test('deleteCredential request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-delete_credential

    const params = {
      credsId: 'testString',
    };

    schematics20ApiService.deleteCredential(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-delete_credential
  });
  test('deleteControls request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-delete_controls

    const params = {
      controlsId: 'testString',
    };

    schematics20ApiService.deleteControls(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-delete_controls
  });
  test('deleteCartOrder request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-delete_cart_order

    const params = {
      orderId: 'testString',
    };

    schematics20ApiService.deleteCartOrder(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-delete_cart_order
  });
  test('deleteCapsule request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-delete_capsule

    const params = {
      controlsId: 'testString',
      capsuleId: 'testString',
    };

    schematics20ApiService.deleteCapsule(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-delete_capsule
  });
  test('deleteAdapter request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-delete_adapter

    const params = {
      adapterId: 'testString',
    };

    schematics20ApiService.deleteAdapter(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-delete_adapter
  });
  test('deleteAction request example', done => {

    consoleLogMock.mockImplementation(output => {
      originalLog(output);
      done();
    });
    consoleWarnMock.mockImplementation(output => {
      done(output);
    });

    // begin-delete_action

    const params = {
      actionId: 'testString',
    };

    schematics20ApiService.deleteAction(params)
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-delete_action
  });
});
