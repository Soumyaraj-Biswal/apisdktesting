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

/**
 * IBM OpenAPI SDK Code Generator Version: 3.27.0-c07e12f4-20210209-225127
 */


import * as extend from 'extend';
import { IncomingHttpHeaders, OutgoingHttpHeaders } from 'http';
import { Authenticator, BaseService, getAuthenticatorFromEnvironment, getMissingParams, UserOptions } from 'ibm-cloud-sdk-core';
import { getSdkHeaders } from '../lib/common';

/**
 * Use IBM Cloud Schematics service to provision a stack of IBM Cloud resources described using a templating language,
 * such as - Terraform files, Helm charts, Ansible playbooks, etc..
 */

class Schematics20ApiV2 extends BaseService {

  static DEFAULT_SERVICE_URL: string = 'https://schematics-dev.containers.appdomain.cloud';
  static DEFAULT_SERVICE_NAME: string = 'schematics_2_0_api';

  /*************************
   * Factory method
   ************************/

  /**
   * Constructs an instance of Schematics20ApiV2 with passed in options and external configuration.
   *
   * @param {UserOptions} [options] - The parameters to send to the service.
   * @param {string} [options.serviceName] - The name of the service to configure
   * @param {Authenticator} [options.authenticator] - The Authenticator object used to authenticate requests to the service
   * @param {string} [options.serviceUrl] - The URL for the service
   * @returns {Schematics20ApiV2}
   */

  public static newInstance(options: UserOptions): Schematics20ApiV2 {
    options = options || {};

    if (!options.serviceName) {
      options.serviceName = this.DEFAULT_SERVICE_NAME;
    }
    if (!options.authenticator) {
      options.authenticator = getAuthenticatorFromEnvironment(options.serviceName);
    }
    const service = new Schematics20ApiV2(options);
    service.configureService(options.serviceName);
    if (options.serviceUrl) {
      service.setServiceUrl(options.serviceUrl);
    }
    return service;
  }


  /**
   * Construct a Schematics20ApiV2 object.
   *
   * @param {Object} options - Options for the service.
   * @param {string} [options.serviceUrl] - The base url to use when contacting the service. The base url may differ between IBM Cloud regions.
   * @param {OutgoingHttpHeaders} [options.headers] - Default headers that shall be included with every request to the service.
   * @param {Authenticator} options.authenticator - The Authenticator object used to authenticate requests to the service
   * @constructor
   * @returns {Schematics20ApiV2}
   */
  constructor(options: UserOptions) {
    options = options || {};

    super(options);
    if (options.serviceUrl) {
      this.setServiceUrl(options.serviceUrl);
    } else {
      this.setServiceUrl(Schematics20ApiV2.DEFAULT_SERVICE_URL);
    }
  }

  /*************************
   * utils
   ************************/

  /**
   * Get the information about schematics.
   *
   * Get detailed information about the IBM Cloud Schematics API version, supported template types and versions, and the
   * supported locations.
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.SchematicsInfo>>}
   */
  public getSchematicsInfo(params?: Schematics20ApiV2.GetSchematicsInfoParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.SchematicsInfo>> {
    const _params = Object.assign({}, params);

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getSchematicsInfo');

    const parameters = {
      options: {
        url: '/v2/info',
        method: 'GET',
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get all access_rules for all schematics resources.
   *
   * Get all the authorization rules for the User for Workspaces,  Datasets, Controls & Settings API.
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.SchematicsAccessRuleList>>}
   */
  public listSchematicsAccessRules(params?: Schematics20ApiV2.ListSchematicsAccessRulesParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.SchematicsAccessRuleList>> {
    const _params = Object.assign({}, params);

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listSchematicsAccessRules');

    const parameters = {
      options: {
        url: '/v2/access',
        method: 'GET',
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the access_rules for the schematics resource.
   *
   * Get the authorization rules for the User for Workspaces,  Shared datasets, Controls & Settings API.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.resourceName - Name of the schematics resource.
   * @param {string} [params.commandName] - Job command name.
   * @param {string} [params.commandParameter] - Schematics job command parameter (playbook-name, capsule-name or
   * flow-name).
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.SchematicsAccessRuleList>>}
   */
  public getSchematicsAccessRulesForResource(params: Schematics20ApiV2.GetSchematicsAccessRulesForResourceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.SchematicsAccessRuleList>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['resourceName'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'command_name': _params.commandName,
      'command_parameter': _params.commandParameter
    };

    const path = {
      'resource_name': _params.resourceName
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getSchematicsAccessRulesForResource');

    const parameters = {
      options: {
        url: '/v2/access/{resource_name}',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get all the allowed commands for schematics resource.
   *
   * Get all the allowed commands for schematics resource.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.resourceName - Name of the schematics resource.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CommandList>>}
   */
  public getSchematicsCommandNames(params: Schematics20ApiV2.GetSchematicsCommandNamesParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CommandList>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['resourceName'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'resource_name': _params.resourceName
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getSchematicsCommandNames');

    const parameters = {
      options: {
        url: '/v2/commands/{resource_name}',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * workspaces
   ************************/

  /**
   * Get all Workspace definitions.
   *
   * Get all Workspace definitions.
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {string} [params.sort] - Name of the field to sort-by;  Use the '.' character to delineate sub-resources and
   * sub-fields (eg. owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending'
   * (default is ascending)   Ignore unrecognized or unsupported sort field.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.WorkspaceList>>}
   */
  public listWorkspaces(params?: Schematics20ApiV2.ListWorkspacesParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.WorkspaceList>> {
    const _params = Object.assign({}, params);

    const query = {
      'offset': _params.offset,
      'limit': _params.limit,
      'sort': _params.sort,
      'profile': _params.profile
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listWorkspaces');

    const parameters = {
      options: {
        url: '/v2/workspaces',
        method: 'GET',
        qs: query,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Create a Workspace definition.
   *
   * Create a new workspace definition.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {Workspace} params.workspace - Create a Workspace in your Account.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Workspace>>}
   */
  public createWorkspace(params: Schematics20ApiV2.CreateWorkspaceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Workspace>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspace'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.workspace;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'createWorkspace');

    const parameters = {
      options: {
        url: '/v2/workspaces',
        method: 'POST',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the Workspace definition.
   *
   * Get the Workspace definition.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Workspace>>}
   */
  public getWorkspace(params: Schematics20ApiV2.GetWorkspaceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Workspace>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'profile': _params.profile
    };

    const path = {
      'workspace_id': _params.workspaceId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getWorkspace');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Replace the Workspace definition.
   *
   * Replace the Workspace definition.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {Workspace} params.workspace - Replace the entire Workspace definition.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Workspace>>}
   */
  public replaceWorkspace(params: Schematics20ApiV2.ReplaceWorkspaceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Workspace>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'workspace'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.workspace;
    const path = {
      'workspace_id': _params.workspaceId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'replaceWorkspace');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}',
        method: 'PUT',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Delete the Workspace.
   *
   * Delete the workspace; if the workspace's auto_destroy_on_delete is set to true, try to destroy all the resources in
   * the workspace before deleting the workspace.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {boolean} [params.force] - Equivalent to -force options in the command line.
   * @param {boolean} [params.propagate] - Auto propagate the chaange or deletion to the dependent resources.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>>}
   */
  public deleteWorkspace(params: Schematics20ApiV2.DeleteWorkspaceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'workspace_id': _params.workspaceId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'deleteWorkspace');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}',
        method: 'DELETE',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'force': _params.force,
          'propagate': _params.propagate
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Update the Workspace definition.
   *
   * Update the Workspace definition.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {Workspace} params.workspace - Update some details in the Workspace.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Workspace>>}
   */
  public updateWorkspace(params: Schematics20ApiV2.UpdateWorkspaceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Workspace>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'workspace'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.workspace;
    const path = {
      'workspace_id': _params.workspaceId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'updateWorkspace');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}',
        method: 'PATCH',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the Workspace input parameter definitions.
   *
   * Get the input parameter definition (variables, values, metadata) for the workspace.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.InputVariableDataList>>}
   */
  public listWorkspaceInputs(params: Schematics20ApiV2.ListWorkspaceInputsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.InputVariableDataList>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit
    };

    const path = {
      'workspace_id': _params.workspaceId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listWorkspaceInputs');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/inputs',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the Workspace output parameter definitions.
   *
   * Get the output parameter definition (variables, metadata) for the workspace.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.OutputVariableDataList>>}
   */
  public listWorkspaceOutputs(params: Schematics20ApiV2.ListWorkspaceOutputsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.OutputVariableDataList>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit
    };

    const path = {
      'workspace_id': _params.workspaceId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listWorkspaceOutputs');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/outputs',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * workspaceTemplate
   ************************/

  /**
   * Create a new Workspace with Template definitions.
   *
   * A new workspace is created for the templates.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {TemplateListRequest} params.templateListRequest - List of Templates.
   * @param {string} [params.xGithubToken] - The personal access token associated with your GitHub or GitLab repository,
   * required to clone the repository.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Workspace>>}
   */
  public createWorkspaceTemplates(params: Schematics20ApiV2.CreateWorkspaceTemplatesParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Workspace>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['templateListRequest'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.templateListRequest;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'createWorkspaceTemplates');

    const parameters = {
      options: {
        url: '/v2/templates',
        method: 'POST',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
          'X-Github-token': _params.xGithubToken
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get all Template definitions from the Workspace.
   *
   * Get list of all Templates in a Workspace.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {string} [params.sort] - Name of the field to sort-by;  Use the '.' character to delineate sub-resources and
   * sub-fields (eg. owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending'
   * (default is ascending)   Ignore unrecognized or unsupported sort field.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.TemplateList>>}
   */
  public listTemplatesInWorkspace(params: Schematics20ApiV2.ListTemplatesInWorkspaceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.TemplateList>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit,
      'sort': _params.sort,
      'profile': _params.profile
    };

    const path = {
      'workspace_id': _params.workspaceId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listTemplatesInWorkspace');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/templates',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Add a new Template definition to the Workspace.
   *
   * Creates a new Template and adds it to Workspace.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {Template} params.template - Add a new Template to the Workspace.
   * @param {string} [params.xGithubToken] - The personal access token associated with your GitHub or GitLab repository,
   * required to clone the repository.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Template>>}
   */
  public addTemplatesToWorkspace(params: Schematics20ApiV2.AddTemplatesToWorkspaceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Template>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'template'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.template;
    const path = {
      'workspace_id': _params.workspaceId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'addTemplatesToWorkspace');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/templates',
        method: 'POST',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
          'X-Github-token': _params.xGithubToken
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the Template definition from the Workspace.
   *
   * Get the Template definition from the workspace.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.templateId - Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the
   * Template Ids in your Workspaces.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Template>>}
   */
  public getTemplateInWorkspace(params: Schematics20ApiV2.GetTemplateInWorkspaceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Template>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'templateId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'profile': _params.profile
    };

    const path = {
      'workspace_id': _params.workspaceId,
      'template_id': _params.templateId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getTemplateInWorkspace');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/templates/{template_id}',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Replace the Template definition in the Workspace.
   *
   * Replace the Template definition in the Workspace.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.templateId - Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the
   * Template Ids in your Workspaces.
   * @param {Template} [params.template] - Replace the entire Template in the Workspace.
   * @param {string} [params.xGithubToken] - The personal access token associated with your GitHub or GitLab repository,
   * required to clone the repository.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Template>>}
   */
  public replaceTemplateInWorkspace(params: Schematics20ApiV2.ReplaceTemplateInWorkspaceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Template>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'templateId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.template;
    const path = {
      'workspace_id': _params.workspaceId,
      'template_id': _params.templateId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'replaceTemplateInWorkspace');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/templates/{template_id}',
        method: 'PUT',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
          'X-Github-token': _params.xGithubToken
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Remove the Template from the Workspace.
   *
   * Delete the Template associated with the workspace; if the template's auto_destroy_on_delete is set to true, try to
   * destroy all the resources  associated with Template before deleting the Template.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.templateId - Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the
   * Template Ids in your Workspaces.
   * @param {boolean} [params.force] - Equivalent to -force options in the command line.
   * @param {boolean} [params.propagate] - Auto propagate the chaange or deletion to the dependent resources.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>>}
   */
  public deleteTemplateFromWorkspace(params: Schematics20ApiV2.DeleteTemplateFromWorkspaceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'templateId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'workspace_id': _params.workspaceId,
      'template_id': _params.templateId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'deleteTemplateFromWorkspace');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/templates/{template_id}',
        method: 'DELETE',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'force': _params.force,
          'propagate': _params.propagate
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Update the Template definition in the Workspace.
   *
   * Update the Template definition in the Workspace.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.templateId - Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the
   * Template Ids in your Workspaces.
   * @param {Template} [params.template] - Update the Template definition in the Workspace.
   * @param {string} [params.xGithubToken] - The personal access token associated with your GitHub or GitLab repository,
   * required to clone the repository.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Template>>}
   */
  public updateTemplateInWorkspace(params: Schematics20ApiV2.UpdateTemplateInWorkspaceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Template>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'templateId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.template;
    const path = {
      'workspace_id': _params.workspaceId,
      'template_id': _params.templateId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'updateTemplateInWorkspace');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/templates/{template_id}',
        method: 'PATCH',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
          'X-Github-token': _params.xGithubToken
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Upload the Template content as tar-file.
   *
   * Upload the Template content as tar-file.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.templateId - Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the
   * Template Ids in your Workspaces.
   * @param {NodeJS.ReadableStream|Buffer} [params.tarFile] - Template tar file.
   * @param {string} [params.tarFileContentType] - The content type of tarFile.
   * @param {string} [params.xGithubToken] - The personal access token associated with your GitHub or GitLab repository,
   * required to clone the repository.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Template>>}
   */
  public uploadTemplateTarInWorkspace(params: Schematics20ApiV2.UploadTemplateTarInWorkspaceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Template>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'templateId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const formData = {
      'tar_file': {
        data: _params.tarFile,
        contentType: _params.tarFileContentType
      }
    };

    const path = {
      'workspace_id': _params.workspaceId,
      'template_id': _params.templateId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'uploadTemplateTarInWorkspace');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/templates/{template_id}/content',
        method: 'PUT',
        path,
        formData
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'multipart/form-data',
          'X-Github-token': _params.xGithubToken
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the Templates Readme file.
   *
   * Get the Readme file from the Template in the Workspace.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.templateId - Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the
   * Template Ids in your Workspaces.
   * @param {string} [params.accept] - The type of the response: text/markdown or text/html. A character encoding can be
   * specified by including a `charset` parameter. For example, 'text/markdown;charset=utf-8'.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<string>>}
   */
  public getTemplateReadme(params: Schematics20ApiV2.GetTemplateReadmeParams): Promise<Schematics20ApiV2.Response<string>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'templateId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'workspace_id': _params.workspaceId,
      'template_id': _params.templateId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getTemplateReadme');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/templates/{template_id}/readme',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': _params.accept
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the Template source details.
   *
   * Get the source details (Git repo, IBM Catalog, or other catalog sources) of the Template in the Workspace.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.templateId - Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the
   * Template Ids in your Workspaces.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ExternalSource>>}
   */
  public getTemplateSource(params: Schematics20ApiV2.GetTemplateSourceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ExternalSource>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'templateId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'workspace_id': _params.workspaceId,
      'template_id': _params.templateId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getTemplateSource');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/templates/{template_id}/source',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the Template input parameter definitions.
   *
   * Get the template input parameter definitions (variables, values, metadata) of Template in the Workspace.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.templateId - Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the
   * Template Ids in your Workspaces.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.VariableDataList>>}
   */
  public listTemplateInputs(params: Schematics20ApiV2.ListTemplateInputsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.VariableDataList>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'templateId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'workspace_id': _params.workspaceId,
      'template_id': _params.templateId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listTemplateInputs');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/templates/{template_id}/inputs',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the Template output parameter definitions.
   *
   * Get the output parameter definitions (variables, values, metadata) of Template in the Workspace.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.templateId - Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the
   * Template Ids in your Workspaces.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.VariableDataList>>}
   */
  public listTemplateOutputs(params: Schematics20ApiV2.ListTemplateOutputsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.VariableDataList>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'templateId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'workspace_id': _params.workspaceId,
      'template_id': _params.templateId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listTemplateOutputs');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/templates/{template_id}/outputs',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * workspaceFlows
   ************************/

  /**
   * Get all Flow definitions from the Workspace.
   *
   * Get list of all Flow definitions in a Workspace.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {string} [params.sort] - Name of the field to sort-by;  Use the '.' character to delineate sub-resources and
   * sub-fields (eg. owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending'
   * (default is ascending)   Ignore unrecognized or unsupported sort field.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.TemplateFlowList>>}
   */
  public listFlowsInWorkspace(params: Schematics20ApiV2.ListFlowsInWorkspaceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.TemplateFlowList>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit,
      'sort': _params.sort,
      'profile': _params.profile
    };

    const path = {
      'workspace_id': _params.workspaceId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listFlowsInWorkspace');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/flows',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Add a new Flow definition to the Workspace.
   *
   * Creates a new Flow and adds it to the Workspace.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {TemplateFlow} params.templateFlow - Add a new Flow to the Workspace.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.TemplateFlow>>}
   */
  public addFlowToWorkspace(params: Schematics20ApiV2.AddFlowToWorkspaceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.TemplateFlow>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'templateFlow'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.templateFlow;
    const path = {
      'workspace_id': _params.workspaceId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'addFlowToWorkspace');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/flows',
        method: 'POST',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get Flow definition from the Workspace.
   *
   * Get specified flow details in a workspace.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.flowId - Flow Id.  Use GET /workspaces/<workspace_id>/flows API to look up the  Flow Ids in
   * your Workspaces.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.TemplateFlow>>}
   */
  public getFlowInWorkspace(params: Schematics20ApiV2.GetFlowInWorkspaceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.TemplateFlow>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'flowId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'profile': _params.profile
    };

    const path = {
      'workspace_id': _params.workspaceId,
      'flow_id': _params.flowId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getFlowInWorkspace');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/flows/{flow_id}',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Replace the Flow definition in the Workspace.
   *
   * Replace the Flow definition in the Workspace.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.flowId - Flow Id.  Use GET /workspaces/<workspace_id>/flows API to look up the  Flow Ids in
   * your Workspaces.
   * @param {TemplateFlow} [params.templateFlow] - Replace the entire Flow in the Workspace.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.TemplateFlow>>}
   */
  public replaceFlowInWorkspace(params: Schematics20ApiV2.ReplaceFlowInWorkspaceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.TemplateFlow>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'flowId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.templateFlow;
    const path = {
      'workspace_id': _params.workspaceId,
      'flow_id': _params.flowId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'replaceFlowInWorkspace');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/flows/{flow_id}',
        method: 'PUT',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Remove the Flow from the Workspace.
   *
   * Delete the flow associated with workspace;.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.flowId - Flow Id.  Use GET /workspaces/<workspace_id>/flows API to look up the  Flow Ids in
   * your Workspaces.
   * @param {boolean} [params.propagate] - Auto propagate the chaange or deletion to the dependent resources.
   * @param {boolean} [params.force] - Equivalent to -force options in the command line.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>>}
   */
  public deleteFlowFromWorkspace(params: Schematics20ApiV2.DeleteFlowFromWorkspaceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'flowId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'workspace_id': _params.workspaceId,
      'flow_id': _params.flowId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'deleteFlowFromWorkspace');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/flows/{flow_id}',
        method: 'DELETE',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'propagate': _params.propagate,
          'force': _params.force
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Update the Flow definition in the Workspace.
   *
   * Update the Flow definition in the Workspace.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.flowId - Flow Id.  Use GET /workspaces/<workspace_id>/flows API to look up the  Flow Ids in
   * your Workspaces.
   * @param {TemplateFlow} [params.templateFlow] - Update the Flow definition in the workspace.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.TemplateFlow>>}
   */
  public updateFlowInWorkspace(params: Schematics20ApiV2.UpdateFlowInWorkspaceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.TemplateFlow>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'flowId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.templateFlow;
    const path = {
      'workspace_id': _params.workspaceId,
      'flow_id': _params.flowId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'updateFlowInWorkspace');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/flows/{flow_id}',
        method: 'PATCH',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * actions
   ************************/

  /**
   * List actions.
   *
   * Retrieve a list of all Schematics actions that depends on the API endpoint that you have access. For example, if
   * you use an API endpoint for a geography, such as North America, only actions that are created in `us-south` or
   * `us-east` are retrieved.
   *  For more information, about supported API endpoints, see
   * [API endpoints](/apidocs/schematics#api-endpoints).
   *  <h3>Authorization</h3>
   *
   *  Schematics support generic authorization such as service access or
   *  platform access to an action ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions.
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {string} [params.sort] - Name of the field to sort-by;  Use the '.' character to delineate sub-resources and
   * sub-fields (eg. owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending'
   * (default is ascending)   Ignore unrecognized or unsupported sort field.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ActionList>>}
   */
  public listActions(params?: Schematics20ApiV2.ListActionsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ActionList>> {
    const _params = Object.assign({}, params);

    const query = {
      'offset': _params.offset,
      'limit': _params.limit,
      'sort': _params.sort,
      'profile': _params.profile
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listActions');

    const parameters = {
      options: {
        url: '/v2/actions',
        method: 'GET',
        qs: query,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

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
   *  <h3>Authorization</h3>
   *
   *  Schematics support generic authorization such as service access or
   *  platform access to an action ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {Action} params.action - Create Action request.
   * @param {string} [params.xGithubToken] - The personal access token associated with your GitHub or GitLab repository,
   * required to clone the repository.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Action>>}
   */
  public createAction(params: Schematics20ApiV2.CreateActionParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Action>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['action'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.action;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'createAction');

    const parameters = {
      options: {
        url: '/v2/actions',
        method: 'POST',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
          'X-Github-token': _params.xGithubToken
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get action details.
   *
   * Retrieve the detailed information of an actions from your IBM Cloud account.  This API returns a URL to the log
   * file that you can retrieve by using  the\_ `GET /v2/actions/{action_id}/logs` API.
   *  <h3>Authorization</h3>
   *
   *  Schematics support generic authorization such as service access or
   *  platform access to an action ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.actionId - Action Id.  Use GET /actions API to look up the Action Ids in your IBM Cloud
   * account.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Action>>}
   */
  public getAction(params: Schematics20ApiV2.GetActionParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Action>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['actionId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'profile': _params.profile
    };

    const path = {
      'action_id': _params.actionId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getAction');

    const parameters = {
      options: {
        url: '/v2/actions/{action_id}',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Delete an action.
   *
   * Delete a Schematics action and specify the Ansible playbook that you want to run against your IBM Cloud resources.
   * **Note** you cannot delete or stop the job activity from an ongoing execution of an action defined in the playbook.
   * You can repeat the execution of same job, whenever you patch the actions. For more information, about the
   * Schematics action state, see [Schematics action state
   * diagram](/docs/schematics?topic=schematics-action-setup#action-state-diagram).
   *  <h3>Authorization</h3>
   *
   *  Schematics support generic authorization such as service access or
   *  platform access to an action ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.actionId - Action Id.  Use GET /actions API to look up the Action Ids in your IBM Cloud
   * account.
   * @param {boolean} [params.force] - Equivalent to -force options in the command line.
   * @param {boolean} [params.propagate] - Auto propagate the chaange or deletion to the dependent resources.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>>}
   */
  public deleteAction(params: Schematics20ApiV2.DeleteActionParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['actionId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'action_id': _params.actionId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'deleteAction');

    const parameters = {
      options: {
        url: '/v2/actions/{action_id}',
        method: 'DELETE',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'force': _params.force,
          'propagate': _params.propagate
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Update an action.
   *
   * Update or replace an action to change the action state from the critical state to normal state, or pending state to
   * the normal state for a successful execution. For more information, about the Schematics action state, see
   * [Schematics action state diagram](/docs/schematics?topic=schematics-action-setup#action-state-diagram).
   *  **Note** you cannot update the location and region once an action is created.
   *  Also, make sure your IP addresses are in the [allowlist](/docs/schematics?topic=schematics-allowed-ipaddresses].
   *
   *  <h3>Authorization</h3>
   *
   *  Schematics support generic authorization such as service access or
   *  platform access to an action ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required
   * permissions](/docs/schematics?topic=schematics-access#action-permissions.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.actionId - Action Id.  Use GET /actions API to look up the Action Ids in your IBM Cloud
   * account.
   * @param {Action} params.action - Action.
   * @param {string} [params.xGithubToken] - The personal access token associated with your GitHub or GitLab repository,
   * required to clone the repository.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Action>>}
   */
  public updateAction(params: Schematics20ApiV2.UpdateActionParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Action>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['actionId', 'action'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.action;
    const path = {
      'action_id': _params.actionId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'updateAction');

    const parameters = {
      options: {
        url: '/v2/actions/{action_id}',
        method: 'PATCH',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
          'X-Github-token': _params.xGithubToken
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Replace a TAR file to an action.
   *
   * Replace your template by uploading tape archive file (.tar) file from  your local machine. Before you use this API,
   * you must create an action  without a link to a GitHub or GitLab repository with the\_POST /v2/actions\_API.
   * <h3>Authorization</h3>  Schematics support generic authorization such as service access or  platform access to an
   * action ID and the resource group.  For more information, about Schematics access and permissions, see  [Schematics
   * service access roles and required permissions](/docs/schematics?topic=schematics-access#action-permissions.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.actionId - Action Id.  Use GET /actions API to look up the Action Ids in your IBM Cloud
   * account.
   * @param {NodeJS.ReadableStream|Buffer} [params.file] - Template tar file.
   * @param {string} [params.fileContentType] - The content type of file.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.TemplateRepoTarUploadResponse>>}
   */
  public uploadTemplateTarAction(params: Schematics20ApiV2.UploadTemplateTarActionParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.TemplateRepoTarUploadResponse>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['actionId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const formData = {
      'file': {
        data: _params.file,
        contentType: _params.fileContentType
      }
    };

    const path = {
      'action_id': _params.actionId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'uploadTemplateTarAction');

    const parameters = {
      options: {
        url: '/v2/actions/{action_id}/template_repo_upload',
        method: 'PUT',
        path,
        formData
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'multipart/form-data',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * jobs
   ************************/

  /**
   * List jobs.
   *
   * Retrieve a list of all Schematics jobs.  The job displays a list of jobs with the status as `in_progess`,
   * `success`, or `failed`. Jobs are generated when you use the  `POST /v2/jobs`, `PUT /v2/jobs/{job_id}`, or `DELETE
   * /v2/jobs/{job_id}`.
   *  <h3>Authorization</h3>
   *  Schematics support generic authorization such as service access or
   *  platform access to the job ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required permissions](/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {string} [params.sort] - Name of the field to sort-by;  Use the '.' character to delineate sub-resources and
   * sub-fields (eg. owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending'
   * (default is ascending)   Ignore unrecognized or unsupported sort field.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {string} [params.resource] - Name of the resource (workspace, actions or controls).
   * @param {string} [params.resourceId] - The Resource Id. It could be an Action-id or Workspace-id.
   * @param {string} [params.actionId] - Action Id.
   * @param {string} [params.list] - list jobs.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.JobList>>}
   */
  public listJobs(params?: Schematics20ApiV2.ListJobsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.JobList>> {
    const _params = Object.assign({}, params);

    const query = {
      'offset': _params.offset,
      'limit': _params.limit,
      'sort': _params.sort,
      'profile': _params.profile,
      'resource': _params.resource,
      'resource_id': _params.resourceId,
      'action_id': _params.actionId,
      'list': _params.list
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listJobs');

    const parameters = {
      options: {
        url: '/v2/jobs',
        method: 'GET',
        qs: query,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Create a job.
   *
   * Create a job and launch the job.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.refreshToken - The IAM refresh token associated with the IBM Cloud account.
   * @param {Job} params.job - Create a Job Record and launch the Job.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Job>>}
   */
  public createJob(params: Schematics20ApiV2.CreateJobParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Job>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['refreshToken', 'job'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.job;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'createJob');

    const parameters = {
      options: {
        url: '/v2/jobs',
        method: 'POST',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
          'refresh_token': _params.refreshToken
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get a job.
   *
   * Retrieve the detailed information of Job
   *
   *  <h3>Authorization</h3>
   *  Schematics support generic authorization such as service access or
   *  platform access to the job ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required permissions](/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.jobId - Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Job>>}
   */
  public getJob(params: Schematics20ApiV2.GetJobParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Job>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['jobId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'profile': _params.profile
    };

    const path = {
      'job_id': _params.jobId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getJob');

    const parameters = {
      options: {
        url: '/v2/jobs/{job_id}',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Clone the Job, and relaunch the Job.
   *
   * Update or replace a job creates a copy of the job and relaunches an existing job by updating the information of an
   * existing Schematics job.
   *  <h3>Authorization</h3>
   *  Schematics support generic authorization such as service access or
   *  platform access to the job ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required permissions](/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.jobId - Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account.
   * @param {string} params.refreshToken - The IAM refresh token associated with the IBM Cloud account.
   * @param {Job} params.job - Clone the Job-record, and relaunch the Job.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Job>>}
   */
  public updateJob(params: Schematics20ApiV2.UpdateJobParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Job>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['jobId', 'refreshToken', 'job'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.job;
    const path = {
      'job_id': _params.jobId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'updateJob');

    const parameters = {
      options: {
        url: '/v2/jobs/{job_id}',
        method: 'PUT',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
          'refresh_token': _params.refreshToken
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Stop the running Job, and delete the Job.
   *
   * Stop the running Job, and delete the Job.  **Note** You cannot delete or stop the job activity from an ongoing
   * execution of an action defined in the playbook.  You can repeat the execution of same job, whenever you patch or
   * update the action or workspace.
   *  <h3>Authorization</h3>
   *  Schematics support generic authorization such as service access or
   *  platform access to the job ID and the resource group.
   *  For more information, about Schematics access and permissions, see
   *  [Schematics service access roles and required permissions](/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.jobId - Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account.
   * @param {string} params.refreshToken - The IAM refresh token associated with the IBM Cloud account.
   * @param {boolean} [params.force] - Equivalent to -force options in the command line.
   * @param {boolean} [params.propagate] - Auto propagate the chaange or deletion to the dependent resources.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>>}
   */
  public deleteJob(params: Schematics20ApiV2.DeleteJobParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['jobId', 'refreshToken'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'job_id': _params.jobId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'deleteJob');

    const parameters = {
      options: {
        url: '/v2/jobs/{job_id}',
        method: 'DELETE',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'refresh_token': _params.refreshToken,
          'force': _params.force,
          'propagate': _params.propagate
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get job logs.
   *
   * Retrieve the job logs
   * <h3>Authorization</h3> Schematics support generic authorization such as service access or  platform access to the
   * action ID and the resource group.  For more information, about Schematics access and permissions, see  [Schematics
   * service access roles and required permissions](/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.jobId - Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.JobLog>>}
   */
  public listJobLogs(params: Schematics20ApiV2.ListJobLogsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.JobLog>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['jobId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'job_id': _params.jobId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listJobLogs');

    const parameters = {
      options: {
        url: '/v2/jobs/{job_id}/logs',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get state-data from the Job record.
   *
   * Get state-data from the Job record.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.jobId - Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.JobStateData>>}
   */
  public listJobStates(params: Schematics20ApiV2.ListJobStatesParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.JobStateData>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['jobId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'job_id': _params.jobId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listJobStates');

    const parameters = {
      options: {
        url: '/v2/jobs/{job_id}/states',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * controls
   ************************/

  /**
   * Get all Controls definition.
   *
   * Get all Controls definition.
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {string} [params.sort] - Name of the field to sort-by;  Use the '.' character to delineate sub-resources and
   * sub-fields (eg. owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending'
   * (default is ascending)   Ignore unrecognized or unsupported sort field.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ControlsList>>}
   */
  public listControls(params?: Schematics20ApiV2.ListControlsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ControlsList>> {
    const _params = Object.assign({}, params);

    const query = {
      'offset': _params.offset,
      'limit': _params.limit,
      'sort': _params.sort,
      'profile': _params.profile
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listControls');

    const parameters = {
      options: {
        url: '/v2/controls',
        method: 'GET',
        qs: query,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Register a new Controls definition.
   *
   * Create a new Controls definition.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {Controls} params.controls - Register a Control.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Controls>>}
   */
  public createControls(params: Schematics20ApiV2.CreateControlsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Controls>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['controls'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.controls;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'createControls');

    const parameters = {
      options: {
        url: '/v2/controls',
        method: 'POST',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the Controls definition.
   *
   * Get the Controls definition.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.controlsId - Controls Id.  Use GET /controls API to look up the Controls Ids in your IBM
   * Cloud account.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Controls>>}
   */
  public getControls(params: Schematics20ApiV2.GetControlsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Controls>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['controlsId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'profile': _params.profile
    };

    const path = {
      'controls_id': _params.controlsId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getControls');

    const parameters = {
      options: {
        url: '/v2/controls/{controls_id}',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Delete the Controls definition.
   *
   * Delete the Controls definition.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.controlsId - Controls Id.  Use GET /controls API to look up the Controls Ids in your IBM
   * Cloud account.
   * @param {boolean} [params.force] - Equivalent to -force options in the command line.
   * @param {boolean} [params.propagate] - Auto propagate the chaange or deletion to the dependent resources.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>>}
   */
  public deleteControls(params: Schematics20ApiV2.DeleteControlsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['controlsId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'controls_id': _params.controlsId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'deleteControls');

    const parameters = {
      options: {
        url: '/v2/controls/{controls_id}',
        method: 'DELETE',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'force': _params.force,
          'propagate': _params.propagate
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Update the Controls definition.
   *
   * Update the Controls definition.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.controlsId - Controls Id.  Use GET /controls API to look up the Controls Ids in your IBM
   * Cloud account.
   * @param {Controls} params.controls - Update the Controls definition.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Controls>>}
   */
  public updateControls(params: Schematics20ApiV2.UpdateControlsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Controls>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['controlsId', 'controls'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.controls;
    const path = {
      'controls_id': _params.controlsId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'updateControls');

    const parameters = {
      options: {
        url: '/v2/controls/{controls_id}',
        method: 'PATCH',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get all Policy Capsules in the Controls definition.
   *
   * Get all Policy Capsules in the Controls definition.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.controlsId - Controls Id.  Use GET /controls API to look up the Controls Ids in your IBM
   * Cloud account.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {string} [params.sort] - Name of the field to sort-by;  Use the '.' character to delineate sub-resources and
   * sub-fields (eg. owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending'
   * (default is ascending)   Ignore unrecognized or unsupported sort field.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CapsuleList>>}
   */
  public listCapsules(params: Schematics20ApiV2.ListCapsulesParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CapsuleList>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['controlsId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit,
      'sort': _params.sort,
      'profile': _params.profile
    };

    const path = {
      'controls_id': _params.controlsId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listCapsules');

    const parameters = {
      options: {
        url: '/v2/controls/{controls_id}/capsules',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Register a Policy Capsule to the Controls definition.
   *
   * Create a Policy Capsule in the Controls definition.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.controlsId - Controls Id.  Use GET /controls API to look up the Controls Ids in your IBM
   * Cloud account.
   * @param {Capsule} params.capsule - Create a Policy Capsule in the Controls definition.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CapsuleList>>}
   */
  public createCapsule(params: Schematics20ApiV2.CreateCapsuleParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CapsuleList>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['controlsId', 'capsule'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.capsule;
    const path = {
      'controls_id': _params.controlsId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'createCapsule');

    const parameters = {
      options: {
        url: '/v2/controls/{controls_id}/capsules',
        method: 'POST',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get Policy Capsule from the Controls definition.
   *
   * Get Policy Capsule from the Controls definition.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.controlsId - Controls Id.  Use GET /controls API to look up the Controls Ids in your IBM
   * Cloud account.
   * @param {string} params.capsuleId - Capsule Id.  Use GET /controls/<contorls_id>/capsules API to look up the
   * Capsules Ids  for the Controls in your IBM Cloud account.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Capsule>>}
   */
  public getCapsule(params: Schematics20ApiV2.GetCapsuleParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Capsule>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['controlsId', 'capsuleId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'profile': _params.profile
    };

    const path = {
      'controls_id': _params.controlsId,
      'capsule_id': _params.capsuleId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getCapsule');

    const parameters = {
      options: {
        url: '/v2/controls/{controls_id}/capsules/{capsule_id}',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Unregister the Policy Capsule from the Controls.
   *
   * Delete the Policy Capsule from the Controls.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.controlsId - Controls Id.  Use GET /controls API to look up the Controls Ids in your IBM
   * Cloud account.
   * @param {string} params.capsuleId - Capsule Id.  Use GET /controls/<contorls_id>/capsules API to look up the
   * Capsules Ids  for the Controls in your IBM Cloud account.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>>}
   */
  public deleteCapsule(params: Schematics20ApiV2.DeleteCapsuleParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['controlsId', 'capsuleId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'controls_id': _params.controlsId,
      'capsule_id': _params.capsuleId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'deleteCapsule');

    const parameters = {
      options: {
        url: '/v2/controls/{controls_id}/capsules/{capsule_id}',
        method: 'DELETE',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Update the Policy Capsule in the Controls definition.
   *
   * Update the Policy Capsule in the Controls definition.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.controlsId - Controls Id.  Use GET /controls API to look up the Controls Ids in your IBM
   * Cloud account.
   * @param {string} params.capsuleId - Capsule Id.  Use GET /controls/<contorls_id>/capsules API to look up the
   * Capsules Ids  for the Controls in your IBM Cloud account.
   * @param {Capsule} params.capsule - Update the Policy Capusle.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Capsule>>}
   */
  public updateCapsule(params: Schematics20ApiV2.UpdateCapsuleParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Capsule>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['controlsId', 'capsuleId', 'capsule'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.capsule;
    const path = {
      'controls_id': _params.controlsId,
      'capsule_id': _params.capsuleId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'updateCapsule');

    const parameters = {
      options: {
        url: '/v2/controls/{controls_id}/capsules/{capsule_id}',
        method: 'PATCH',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * settingsDatasets
   ************************/

  /**
   * Get all shared datasets.
   *
   * Get all shared datasets.
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {string} [params.sort] - Name of the field to sort-by;  Use the '.' character to delineate sub-resources and
   * sub-fields (eg. owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending'
   * (default is ascending)   Ignore unrecognized or unsupported sort field.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.DatasetList>>}
   */
  public listDatasets(params?: Schematics20ApiV2.ListDatasetsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.DatasetList>> {
    const _params = Object.assign({}, params);

    const query = {
      'offset': _params.offset,
      'limit': _params.limit,
      'sort': _params.sort,
      'profile': _params.profile
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listDatasets');

    const parameters = {
      options: {
        url: '/v2/datasets',
        method: 'GET',
        qs: query,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Create a shared dataset.
   *
   * Create a shared dataset.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {Dataset} params.dataset - Create a shared dataset.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Dataset>>}
   */
  public createDataset(params: Schematics20ApiV2.CreateDatasetParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Dataset>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['dataset'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.dataset;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'createDataset');

    const parameters = {
      options: {
        url: '/v2/datasets',
        method: 'POST',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the shared dataset.
   *
   * Get the Shared dataset.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.datasetId - Shared dataset Id.  Use GET /datasets API to look up the Shared dataset Ids  in
   * your IBM Cloud account.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Dataset>>}
   */
  public getDataset(params: Schematics20ApiV2.GetDatasetParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Dataset>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['datasetId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'dataset_id': _params.datasetId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getDataset');

    const parameters = {
      options: {
        url: '/v2/datasets/{dataset_id}',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Replace the shared dataset.
   *
   * Replace the shared dataset.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.datasetId - Shared dataset Id.  Use GET /datasets API to look up the Shared dataset Ids  in
   * your IBM Cloud account.
   * @param {Dataset} params.dataset - Replace the shared datasets.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Dataset>>}
   */
  public replaceDataset(params: Schematics20ApiV2.ReplaceDatasetParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Dataset>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['datasetId', 'dataset'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.dataset;
    const path = {
      'dataset_id': _params.datasetId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'replaceDataset');

    const parameters = {
      options: {
        url: '/v2/datasets/{dataset_id}',
        method: 'PUT',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Delete the Shared dataset.
   *
   * Delete the shared dataset.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.datasetId - Shared dataset Id.  Use GET /datasets API to look up the Shared dataset Ids  in
   * your IBM Cloud account.
   * @param {boolean} [params.force] - Equivalent to -force options in the command line.
   * @param {boolean} [params.propagate] - Auto propagate the chaange or deletion to the dependent resources.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>>}
   */
  public deleteDataset(params: Schematics20ApiV2.DeleteDatasetParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['datasetId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'dataset_id': _params.datasetId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'deleteDataset');

    const parameters = {
      options: {
        url: '/v2/datasets/{dataset_id}',
        method: 'DELETE',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'force': _params.force,
          'propagate': _params.propagate
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Update the shared dataset.
   *
   * Update the shared dataset details.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.datasetId - Shared dataset Id.  Use GET /datasets API to look up the Shared dataset Ids  in
   * your IBM Cloud account.
   * @param {Dataset} params.dataset - Update the shared dataset details.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Dataset>>}
   */
  public updateAtaset(params: Schematics20ApiV2.UpdateAtasetParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Dataset>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['datasetId', 'dataset'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.dataset;
    const path = {
      'dataset_id': _params.datasetId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'updateAtaset');

    const parameters = {
      options: {
        url: '/v2/datasets/{dataset_id}',
        method: 'PATCH',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get all the Shared dataset variable definitions.
   *
   * Get all the shared dataset variable definitions (variables, values, metadata).
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.datasetId - Shared dataset Id.  Use GET /datasets API to look up the Shared dataset Ids  in
   * your IBM Cloud account.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.VariableDataList>>}
   */
  public listDatasetVariables(params: Schematics20ApiV2.ListDatasetVariablesParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.VariableDataList>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['datasetId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'dataset_id': _params.datasetId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listDatasetVariables');

    const parameters = {
      options: {
        url: '/v2/datasets/{dataset_id}/variables',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the Shared dataset.
   *
   * Get the shared dataset.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.datasetId - Shared dataset Id.  Use GET /datasets API to look up the Shared dataset Ids  in
   * your IBM Cloud account.
   * @param {string} params.varName - Name of the variable.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.VariableData>>}
   */
  public getDatasetVariable(params: Schematics20ApiV2.GetDatasetVariableParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.VariableData>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['datasetId', 'varName'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'dataset_id': _params.datasetId,
      'var_name': _params.varName
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getDatasetVariable');

    const parameters = {
      options: {
        url: '/v2/datasets/{dataset_id}/values/{var_name}',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * settingsCredentials
   ************************/

  /**
   * Get all credentials.
   *
   * Get all credentials.
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {string} [params.sort] - Name of the field to sort-by;  Use the '.' character to delineate sub-resources and
   * sub-fields (eg. owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending'
   * (default is ascending)   Ignore unrecognized or unsupported sort field.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CredentialList>>}
   */
  public listCredentials(params?: Schematics20ApiV2.ListCredentialsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CredentialList>> {
    const _params = Object.assign({}, params);

    const query = {
      'offset': _params.offset,
      'limit': _params.limit,
      'sort': _params.sort,
      'profile': _params.profile
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listCredentials');

    const parameters = {
      options: {
        url: '/v2/credentials',
        method: 'GET',
        qs: query,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Create a credential entry.
   *
   * Create a credential entry.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {Credentialset} params.credentialset - Create a credential entry.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Credentialset>>}
   */
  public createCredential(params: Schematics20ApiV2.CreateCredentialParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Credentialset>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['credentialset'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.credentialset;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'createCredential');

    const parameters = {
      options: {
        url: '/v2/credentials',
        method: 'POST',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the credential entry.
   *
   * Get the credential entry.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.credsId - Credentials Id.  Use GET /credentials API to look up the Credentials Ids  in your
   * IBM Cloud account.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Credentialset>>}
   */
  public getCredential(params: Schematics20ApiV2.GetCredentialParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Credentialset>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['credsId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'creds_id': _params.credsId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getCredential');

    const parameters = {
      options: {
        url: '/v2/credentials/{creds_id}',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Replace the credential entry.
   *
   * Replace the credential entry.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.credsId - Credentials Id.  Use GET /credentials API to look up the Credentials Ids  in your
   * IBM Cloud account.
   * @param {Credentialset} params.credentialset - Replace the credential entry.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Credentialset>>}
   */
  public replaceCredential(params: Schematics20ApiV2.ReplaceCredentialParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Credentialset>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['credsId', 'credentialset'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.credentialset;
    const path = {
      'creds_id': _params.credsId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'replaceCredential');

    const parameters = {
      options: {
        url: '/v2/credentials/{creds_id}',
        method: 'PUT',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Delete the credential entry.
   *
   * Delete the credential entry.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.credsId - Credentials Id.  Use GET /credentials API to look up the Credentials Ids  in your
   * IBM Cloud account.
   * @param {boolean} [params.force] - Equivalent to -force options in the command line.
   * @param {boolean} [params.propagate] - Auto propagate the chaange or deletion to the dependent resources.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>>}
   */
  public deleteCredential(params: Schematics20ApiV2.DeleteCredentialParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['credsId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'creds_id': _params.credsId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'deleteCredential');

    const parameters = {
      options: {
        url: '/v2/credentials/{creds_id}',
        method: 'DELETE',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'force': _params.force,
          'propagate': _params.propagate
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Update the credential entry.
   *
   * Update the credential entry.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.credsId - Credentials Id.  Use GET /credentials API to look up the Credentials Ids  in your
   * IBM Cloud account.
   * @param {Credentialset} params.credentialset - Update the credential entry.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Credentialset>>}
   */
  public updateCredential(params: Schematics20ApiV2.UpdateCredentialParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Credentialset>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['credsId', 'credentialset'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.credentialset;
    const path = {
      'creds_id': _params.credsId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'updateCredential');

    const parameters = {
      options: {
        url: '/v2/credentials/{creds_id}',
        method: 'PATCH',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get all the credential variable definitions.
   *
   * Get all the credential variable definitions.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.credsId - Credentials Id.  Use GET /credentials API to look up the Credentials Ids  in your
   * IBM Cloud account.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.VariableDataList>>}
   */
  public listCredentialValues(params: Schematics20ApiV2.ListCredentialValuesParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.VariableDataList>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['credsId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'creds_id': _params.credsId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listCredentialValues');

    const parameters = {
      options: {
        url: '/v2/credentials/{creds_id}/variables',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the credential variable definition.
   *
   * Get the credential variable definition (variables, values, metadata).
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.credsId - Credentials Id.  Use GET /credentials API to look up the Credentials Ids  in your
   * IBM Cloud account.
   * @param {string} params.varName - Name of the variable.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.VariableData>>}
   */
  public getCredentialValue(params: Schematics20ApiV2.GetCredentialValueParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.VariableData>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['credsId', 'varName'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'creds_id': _params.credsId,
      'var_name': _params.varName
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getCredentialValue');

    const parameters = {
      options: {
        url: '/v2/credentials/{creds_id}/variables/{var_name}',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * inventory
   ************************/

  /**
   * List inventories.
   *
   * Retrieve a list of all Schematics inventories that depends on the API endpoint that you have access. For example,
   * if you use an API endpoint for a geography, such as North America, only inventories that are created in `us-south`
   * or `us-east` are retrieved. For more information, about supported API endpoints, see [API
   * endpoints](/apidocs/schematics#api-endpoints).
   * <h3>Authorization</h3> Schematics support generic authorization such as service access or platform access to an
   * action ID and the resource group. For more information, about Schematics access and permissions, see  [Schematics
   * service access roles and required permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {string} [params.sort] - Name of the field to sort-by;  Use the '.' character to delineate sub-resources and
   * sub-fields (eg. owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending'
   * (default is ascending)   Ignore unrecognized or unsupported sort field.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.InventoryResourceRecordList>>}
   */
  public listInventories(params?: Schematics20ApiV2.ListInventoriesParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.InventoryResourceRecordList>> {
    const _params = Object.assign({}, params);

    const query = {
      'offset': _params.offset,
      'limit': _params.limit,
      'sort': _params.sort,
      'profile': _params.profile
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listInventories');

    const parameters = {
      options: {
        url: '/v2/inventories',
        method: 'GET',
        qs: query,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Create an inventory.
   *
   * Create an IBM Cloud Schematics inventory as a single IBM Cloud resource where you want to run Ansible playbook by
   * using Schematics actions. For more information, about inventory host groups, refer to [creating static and dynamic
   * inventory for Schematics actions](/docs/schematics?topic=schematics-inventories-setup). **Note** you cannot update
   * the location and region, resource group once an action is created.  Also, make sure your IP addresses are in the
   * [allowlist](/docs/schematics?topic=schematics-allowed-ipaddresses).  If your Git repository already contains a host
   * file. Schematics does not  overwrite the host file already present in your Git repository.
   * <h3>Authorization</h3> Schematics support generic authorization such as service access or platform access to an
   * action ID and the resource group. For more information, about Schematics access and permissions, see  [Schematics
   * service access roles and required permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {InventoryResourceDefinition} params.inventoryResourceDefinition - Create a Inventory definition resource.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.InventoryResourceRecord>>}
   */
  public createInventory(params: Schematics20ApiV2.CreateInventoryParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.InventoryResourceRecord>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['inventoryResourceDefinition'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.inventoryResourceDefinition;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'createInventory');

    const parameters = {
      options: {
        url: '/v2/inventories',
        method: 'POST',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get inventory definition resource.
   *
   * Use this API to retrieve the detailed information for a resource inventory definition used to target an action in
   * your IBM Cloud account. For more information, about inventory get, refer to [ibmcloud schematics inventory
   * get](/docs/schematics?topic=schematics-schematics-cli-reference#schematics-get-inv). **Note** you can fetch only
   * the location and region, resource group from where your inventory is created.
   *  Also, make sure your IP addresses are in the [allowlist](/docs/schematics?topic=schematics-allowed-ipaddresses).
   *
   * <h3>Authorization</h3> Schematics support generic authorization such as service access or platform access to an
   * action ID and the resource group. For more information, about Schematics access and permissions, see  [Schematics
   * service access roles and required permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.inventoryId - Resource Inventory Id.  Use GET /inventories API to look up the Resource
   * Inventory definition Ids  in your IBM Cloud account.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.InventoryResourceRecord>>}
   */
  public getInventory(params: Schematics20ApiV2.GetInventoryParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.InventoryResourceRecord>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['inventoryId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'inventory_id': _params.inventoryId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getInventory');

    const parameters = {
      options: {
        url: '/v2/inventories/{inventory_id}',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Replace an inventory.
   *
   * Use this API to update the inventory definition resource used to target an action. For more information, about
   * inventory update, refer to [ibmcloud schematics inventory
   * update](/docs/schematics?topic=schematics-schematics-cli-reference#schematics-update-inv). **Note** you cannot
   * update the location and region, resource group once an action is created.
   *  Also, make sure your IP addresses are in the [allowlist](/docs/schematics?topic=schematics-allowed-ipaddresses).
   *
   * <h3>Authorization</h3> Schematics support generic authorization such as service access or platform access to an
   * action ID and the resource group. For more information, about Schematics access and permissions, see  [Schematics
   * service access roles and required permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.inventoryId - Resource Inventory Id.  Use GET /inventories API to look up the Resource
   * Inventory definition Ids  in your IBM Cloud account.
   * @param {InventoryResourceDefinition} params.inventoryResourceDefinition - Replace the inventory definition
   * resource.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.InventoryResourceRecord>>}
   */
  public replaceInventory(params: Schematics20ApiV2.ReplaceInventoryParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.InventoryResourceRecord>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['inventoryId', 'inventoryResourceDefinition'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.inventoryResourceDefinition;
    const path = {
      'inventory_id': _params.inventoryId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'replaceInventory');

    const parameters = {
      options: {
        url: '/v2/inventories/{inventory_id}',
        method: 'PUT',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Delete inventory definition resource.
   *
   * Use this API to delete the resource inventory definition by using the inventory ID that you want to run against.
   * For more information, about inventory delete, refer to [ibmcloud schematics inventory
   * delete](/docs/schematics?topic=schematics-schematics-cli-reference#schematics-delete-inventory). **Note** you
   * cannot delete the location and region, resource group from where your inventory is created.
   *  Also, make sure your IP addresses are in the [allowlist](/docs/schematics?topic=schematics-allowed-ipaddresses).
   *
   * <h3>Authorization</h3> Schematics support generic authorization such as service access or platform access to an
   * action ID and the resource group. For more information, about Schematics access and permissions, see  [Schematics
   * service access roles and required permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.inventoryId - Resource Inventory Id.  Use GET /inventories API to look up the Resource
   * Inventory definition Ids  in your IBM Cloud account.
   * @param {boolean} [params.force] - Equivalent to -force options in the command line.
   * @param {boolean} [params.propagate] - Auto propagate the chaange or deletion to the dependent resources.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>>}
   */
  public deleteInventory(params: Schematics20ApiV2.DeleteInventoryParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['inventoryId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'inventory_id': _params.inventoryId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'deleteInventory');

    const parameters = {
      options: {
        url: '/v2/inventories/{inventory_id}',
        method: 'DELETE',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'force': _params.force,
          'propagate': _params.propagate
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Update the inventory definition resource.
   *
   * Update the resource inventory definition.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.inventoryId - Resource Inventory Id.  Use GET /inventories API to look up the Resource
   * Inventory definition Ids  in your IBM Cloud account.
   * @param {InventoryResourceDefinition} params.inventoryResourceDefinition - Update the resource inventory definition.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.InventoryResourceRecord>>}
   */
  public updateInventory(params: Schematics20ApiV2.UpdateInventoryParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.InventoryResourceRecord>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['inventoryId', 'inventoryResourceDefinition'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.inventoryResourceDefinition;
    const path = {
      'inventory_id': _params.inventoryId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'updateInventory');

    const parameters = {
      options: {
        url: '/v2/inventories/{inventory_id}',
        method: 'PATCH',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * resourceQuery
   ************************/

  /**
   * List resource queries.
   *
   * Retrieve the list of resource query definitions that you have access to.  The list of resource queries that is
   * returned depends on the API  endpoint that you use. For example, if you use an API endpoint for a geography, such
   * as North America, only resource query definitions that are created in `us-south` or `us-east` are retrieved. For
   * more information, about supported API endpoints, see [API endpoints](/apidocs/schematics#api-endpoints).
   * <h3>Authorization</h3> Schematics support generic authorization such as service access or platform access to an
   * action ID and the resource group. For more information, about Schematics access and permissions,  see [Schematics
   * service access roles and required permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {string} [params.sort] - Name of the field to sort-by;  Use the '.' character to delineate sub-resources and
   * sub-fields (eg. owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending'
   * (default is ascending)   Ignore unrecognized or unsupported sort field.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ResourceQueryRecordList>>}
   */
  public listResourceQuery(params?: Schematics20ApiV2.ListResourceQueryParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ResourceQueryRecordList>> {
    const _params = Object.assign({}, params);

    const query = {
      'offset': _params.offset,
      'limit': _params.limit,
      'sort': _params.sort,
      'profile': _params.profile
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listResourceQuery');

    const parameters = {
      options: {
        url: '/v2/resources_query',
        method: 'GET',
        qs: query,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

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
   * <h3>Authorization</h3> Schematics support generic authorization such as service access or platform access to an
   * action ID and the resource group. For more information, about Schematics access and permissions,  see [Schematics
   * service access roles and required permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {ResourceQueryDefinition} params.resourceQueryDefinition - Create a resource query definition.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ResourceQueryRecord>>}
   */
  public createResourceQuery(params: Schematics20ApiV2.CreateResourceQueryParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ResourceQueryRecord>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['resourceQueryDefinition'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.resourceQueryDefinition;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'createResourceQuery');

    const parameters = {
      options: {
        url: '/v2/resources_query',
        method: 'POST',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get resources query.
   *
   * Use this API to retrieve the information resource query by Id.  For more information, about resource query
   * commands, refer to  [ibmcloud schematics resource query
   * get](/docs/schematics?topic=schematics-schematics-cli-reference#schematics-get-rq).
   * <h3>Authorization</h3> Schematics support generic authorization such as service access or platform access to an
   * action ID and the resource group. For more information, about Schematics access and permissions,  see [Schematics
   * service access roles and required permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.queryId - Resource query Id.  Use GET /resource_query API to look up the Resource query
   * definition Ids  in your IBM Cloud account.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ResourceQueryRecord>>}
   */
  public getResourcesQuery(params: Schematics20ApiV2.GetResourcesQueryParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ResourceQueryRecord>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['queryId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'query_id': _params.queryId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getResourcesQuery');

    const parameters = {
      options: {
        url: '/v2/resources_query/{query_id}',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Replace resources query definition.
   *
   * Use this API to replace the resource query definition used to build  the dynamic inventory for the Schematics
   * Action.  For more information, about resource query commands, refer to [ibmcloud schematics resource query
   * update](/docs/schematics?topic=schematics-schematics-cli-reference#schematics-update-rq).
   * **Note** you cannot update the location and region, resource group  once a resource query is created. Also, make
   * sure your IP addresses  are in the [allowlist](/docs/schematics?topic=schematics-allowed-ipaddresses).
   * <h3>Authorization</h3> Schematics support generic authorization such as service access or platform access to an
   * action ID and the resource group. For more information, about Schematics access and permissions,  see [Schematics
   * service access roles and required permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.queryId - Resource query Id.  Use GET /resource_query API to look up the Resource query
   * definition Ids  in your IBM Cloud account.
   * @param {ResourceQueryDefinition} params.resourceQueryDefinition - Replace the resources query definition.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ResourceQueryRecord>>}
   */
  public replaceResourcesQuery(params: Schematics20ApiV2.ReplaceResourcesQueryParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ResourceQueryRecord>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['queryId', 'resourceQueryDefinition'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.resourceQueryDefinition;
    const path = {
      'query_id': _params.queryId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'replaceResourcesQuery');

    const parameters = {
      options: {
        url: '/v2/resources_query/{query_id}',
        method: 'PUT',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Run the resource query.
   *
   * Run the resource query.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.queryId - Resource query Id.  Use GET /resource_query API to look up the Resource query
   * definition Ids  in your IBM Cloud account.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ResourceQueryResponseRecord>>}
   */
  public executeResourceQuery(params: Schematics20ApiV2.ExecuteResourceQueryParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ResourceQueryResponseRecord>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['queryId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'query_id': _params.queryId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'executeResourceQuery');

    const parameters = {
      options: {
        url: '/v2/resources_query/{query_id}',
        method: 'POST',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Delete resources query.
   *
   * Use this API to delete the resource query definition by Id.  For more information, about resource query commands,
   * refer to  [ibmcloud schematics resource query
   * delete](/docs/schematics?topic=schematics-schematics-cli-reference#schematics-delete-resource-query).
   * <h3>Authorization</h3> Schematics support generic authorization such as service access or platform access to an
   * action ID and the resource group. For more information, about Schematics access and permissions,  see [Schematics
   * service access roles and required permissions](/docs/schematics?topic=schematics-access#action-permissions).
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.queryId - Resource query Id.  Use GET /resource_query API to look up the Resource query
   * definition Ids  in your IBM Cloud account.
   * @param {boolean} [params.force] - Equivalent to -force options in the command line.
   * @param {boolean} [params.propagate] - Auto propagate the chaange or deletion to the dependent resources.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>>}
   */
  public deleteResourcesQuery(params: Schematics20ApiV2.DeleteResourcesQueryParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['queryId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'query_id': _params.queryId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'deleteResourcesQuery');

    const parameters = {
      options: {
        url: '/v2/resources_query/{query_id}',
        method: 'DELETE',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'force': _params.force,
          'propagate': _params.propagate
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * referenceData
   ************************/

  /**
   * Shared dataset value for {var_name}.
   *
   * Get the Shared dataset value for {var_name}; "$$D(dataset_id):$$V(var_name)".
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.datasetId - Shared dataset Id.  Use GET /datasets API to look up the Shared dataset Ids  in
   * your IBM Cloud account.
   * @param {string} params.varName - Name of the variable.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>>}
   */
  public getDatasetVariableValue(params: Schematics20ApiV2.GetDatasetVariableValueParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['datasetId', 'varName'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'dataset_id': _params.datasetId,
      'var_name': _params.varName
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getDatasetVariableValue');

    const parameters = {
      options: {
        url: '/v2/datasets/{dataset_id}/values/{var_name}/value',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the credential value for {var_name}.
   *
   * Get the credential value for {var_name}; "$$C(creds_id):$$V(var_name)".
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.credsId - Credentials Id.  Use GET /credentials API to look up the Credentials Ids  in your
   * IBM Cloud account.
   * @param {string} params.varName - Name of the variable.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>>}
   */
  public getCredentialVariableValue(params: Schematics20ApiV2.GetCredentialVariableValueParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['credsId', 'varName'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'creds_id': _params.credsId,
      'var_name': _params.varName
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getCredentialVariableValue');

    const parameters = {
      options: {
        url: '/v2/credentials/{creds_id}/variables/{var_name}/value',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the resource ids for {var_name}.
   *
   * Get the resource ids for {var_name}.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.inventoryId - Resource Inventory Id.  Use GET /inventories API to look up the Resource
   * Inventory definition Ids  in your IBM Cloud account.
   * @param {string} params.varName - Name of the variable.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueListResponse>>}
   */
  public getInventoryVariableValue(params: Schematics20ApiV2.GetInventoryVariableValueParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueListResponse>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['inventoryId', 'varName'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'inventory_id': _params.inventoryId,
      'var_name': _params.varName
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getInventoryVariableValue');

    const parameters = {
      options: {
        url: '/v2/inventories/{inventory_id}/variables/{var_name}/value',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Workspace Input value for {var_name}, used by the recent job execution.
   *
   * Get Workspace Input value for {var_name}, used by the recent job execution; "$$W(workspace_name):$$I(var_name)".
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.varName - Name of the variable.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>>}
   */
  public getWorkspaceInputValue(params: Schematics20ApiV2.GetWorkspaceInputValueParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'varName'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'limit': _params.limit,
      'offset': _params.offset
    };

    const path = {
      'workspace_id': _params.workspaceId,
      'var_name': _params.varName
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getWorkspaceInputValue');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/inputs/{var_name}/value',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Workspace Output value for {var_name}, produced by the recent job execution.
   *
   * Get Workspace Output value for {var_name}, produced by the recent job execution;
   * "$$W(workspace_name):$$O(var_name)".
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.varName - Name of the variable.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>>}
   */
  public getWorkspaceOutputValue(params: Schematics20ApiV2.GetWorkspaceOutputValueParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'varName'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit
    };

    const path = {
      'workspace_id': _params.workspaceId,
      'var_name': _params.varName
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getWorkspaceOutputValue');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/outputs/{var_name}/value',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Workspace environment setting value for {var_name}, used by the recent job execution.
   *
   * Get Workspace environment setting value for {var_name}, used by the recent job execution;
   * "$$W(workspace_name):$$S(var_name)".
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.varName - Name of the variable.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>>}
   */
  public getWorkspaceSettingsValue(params: Schematics20ApiV2.GetWorkspaceSettingsValueParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'varName'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit
    };

    const path = {
      'workspace_id': _params.workspaceId,
      'var_name': _params.varName
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getWorkspaceSettingsValue');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/settings/{var_name}/value',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Workspace Input value for {var_name}, used by the recent job execution.
   *
   * Get Workspace Input value for {var_name}, used by the recent job execution;
   * "$$W(workspace_name):$$T(template_name):$$I(var_name)".
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.templateId - Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the
   * Template Ids in your Workspaces.
   * @param {string} params.varName - Name of the variable.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>>}
   */
  public getWorkspaceTemplateInputValue(params: Schematics20ApiV2.GetWorkspaceTemplateInputValueParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'templateId', 'varName'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit
    };

    const path = {
      'workspace_id': _params.workspaceId,
      'template_id': _params.templateId,
      'var_name': _params.varName
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getWorkspaceTemplateInputValue');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/templates/{template_id}/inputs/{var_name}/value',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Workspace Output value for {var_name}, produced by the recent job execution.
   *
   * Get Workspace Output value for {var_name}, produced by the recent job execution;
   * "$$W(workspace_name):$$T(template_name):$$O(var_name)".
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.templateId - Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the
   * Template Ids in your Workspaces.
   * @param {string} params.varName - Name of the variable.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>>}
   */
  public getWorkspaceTemplateOutputValue(params: Schematics20ApiV2.GetWorkspaceTemplateOutputValueParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'templateId', 'varName'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit
    };

    const path = {
      'workspace_id': _params.workspaceId,
      'template_id': _params.templateId,
      'var_name': _params.varName
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getWorkspaceTemplateOutputValue');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/templates/{template_id}/outputs/{var_name}/value',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Workspace environment setting value for {var_name}, used by the recent job execution.
   *
   * Get Workspace environment setting value for {var_name}, used by the recent job execution;
   * "$$W(workspace_name):$$T(template_name):$$S(var_name)".
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.templateId - Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the
   * Template Ids in your Workspaces.
   * @param {string} params.varName - Name of the variable.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>>}
   */
  public getWorkspaceTemplateSettingValue(params: Schematics20ApiV2.GetWorkspaceTemplateSettingValueParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['workspaceId', 'templateId', 'varName'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit
    };

    const path = {
      'workspace_id': _params.workspaceId,
      'template_id': _params.templateId,
      'var_name': _params.varName
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getWorkspaceTemplateSettingValue');

    const parameters = {
      options: {
        url: '/v2/workspaces/{workspace_id}/templates/{template_id}/settings/{var_name}/value',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Workspace Input value for {var_name}, used by the job {job_id}.
   *
   * Get Workspace Input value for {var_name}, used by the recent job execution;
   * "$$J(job_id):$$W(workspace_name):$$I(var_name)".
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.jobId - Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.varName - Name of the variable.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>>}
   */
  public getJobWorkspaceInputValue(params: Schematics20ApiV2.GetJobWorkspaceInputValueParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['jobId', 'workspaceId', 'varName'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit
    };

    const path = {
      'job_id': _params.jobId,
      'workspace_id': _params.workspaceId,
      'var_name': _params.varName
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getJobWorkspaceInputValue');

    const parameters = {
      options: {
        url: '/v2/jobs/{job_id}/workspaces/{workspace_id}/inputs/{var_name}/value',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Workspace Output value for {var_name}, produced by the job {job_id}.
   *
   * Get Workspace Output value for {var_name}, produced by the recent job execution;
   * "$$J(job_id):$$W(workspace_name):$$O(var_name)".
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.jobId - Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.varName - Name of the variable.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>>}
   */
  public getJobWorkspaceOutputValue(params: Schematics20ApiV2.GetJobWorkspaceOutputValueParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['jobId', 'workspaceId', 'varName'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit
    };

    const path = {
      'job_id': _params.jobId,
      'workspace_id': _params.workspaceId,
      'var_name': _params.varName
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getJobWorkspaceOutputValue');

    const parameters = {
      options: {
        url: '/v2/jobs/{job_id}/workspaces/{workspace_id}/outputs/{var_name}/value',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Workspace environment setting value for {var_name}, used by the recent job execution.
   *
   * Get Workspace environment setting value for {var_name}, used by the recent job execution;
   * "$$J(job_id):$$W(workspace_name):$$S(var_name)".
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.jobId - Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account.
   * @param {string} params.workspaceId - Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your
   * IBM Cloud account.
   * @param {string} params.varName - Name of the variable.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>>}
   */
  public getJobWorkspaceSettingValue(params: Schematics20ApiV2.GetJobWorkspaceSettingValueParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ValueResponse>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['jobId', 'workspaceId', 'varName'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit
    };

    const path = {
      'job_id': _params.jobId,
      'workspace_id': _params.workspaceId,
      'var_name': _params.varName
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getJobWorkspaceSettingValue');

    const parameters = {
      options: {
        url: '/v2/jobs/{job_id}/workspaces/{workspace_id}/settings/{var_name}/value',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * settingsTriggers
   ************************/

  /**
   * Get all the Schematics triggers.
   *
   * Get all the Schematics triggers.
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {string} [params.sort] - Name of the field to sort-by;  Use the '.' character to delineate sub-resources and
   * sub-fields (eg. owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending'
   * (default is ascending)   Ignore unrecognized or unsupported sort field.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.TriggerList>>}
   */
  public listTriggers(params?: Schematics20ApiV2.ListTriggersParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.TriggerList>> {
    const _params = Object.assign({}, params);

    const query = {
      'offset': _params.offset,
      'limit': _params.limit,
      'sort': _params.sort
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listTriggers');

    const parameters = {
      options: {
        url: '/v2/settings/triggers',
        method: 'GET',
        qs: query,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Register a Schematics trigger.
   *
   * Register a Schematics trigger.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {Trigger} params.trigger - Register a Scheduling or Action Trigger with Schematics.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Trigger>>}
   */
  public createTrigger(params: Schematics20ApiV2.CreateTriggerParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Trigger>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['trigger'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.trigger;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'createTrigger');

    const parameters = {
      options: {
        url: '/v2/settings/triggers',
        method: 'POST',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the Schematics trigger.
   *
   * Get the Schematics trigger.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.triggerId - Id of the Schematics trigger.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Trigger>>}
   */
  public getTrigger(params: Schematics20ApiV2.GetTriggerParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Trigger>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['triggerId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'trigger_id': _params.triggerId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getTrigger');

    const parameters = {
      options: {
        url: '/v2/settings/triggers/{trigger_id}',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Replace the Schematics trigger.
   *
   * Replace the Schematics trigger.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.triggerId - Id of the Schematics trigger.
   * @param {Trigger} params.trigger - Replace the Schematics trigger.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Trigger>>}
   */
  public replaceTrigger(params: Schematics20ApiV2.ReplaceTriggerParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Trigger>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['triggerId', 'trigger'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.trigger;
    const path = {
      'trigger_id': _params.triggerId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'replaceTrigger');

    const parameters = {
      options: {
        url: '/v2/settings/triggers/{trigger_id}',
        method: 'PUT',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Unregister the Schematics trigger.
   *
   * Delete the Schematics trigger.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.triggerId - Id of the Schematics trigger.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>>}
   */
  public deleteTrigger(params: Schematics20ApiV2.DeleteTriggerParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['triggerId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'trigger_id': _params.triggerId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'deleteTrigger');

    const parameters = {
      options: {
        url: '/v2/settings/triggers/{trigger_id}',
        method: 'DELETE',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * settingsHook
   ************************/

  /**
   * Get all the Schematics web-hooks.
   *
   * Get all the Schematics web-hooks.
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {string} [params.sort] - Name of the field to sort-by;  Use the '.' character to delineate sub-resources and
   * sub-fields (eg. owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending'
   * (default is ascending)   Ignore unrecognized or unsupported sort field.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.WebHookList>>}
   */
  public listWebhook(params?: Schematics20ApiV2.ListWebhookParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.WebHookList>> {
    const _params = Object.assign({}, params);

    const query = {
      'offset': _params.offset,
      'limit': _params.limit,
      'sort': _params.sort
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listWebhook');

    const parameters = {
      options: {
        url: '/v2/settings/hooks',
        method: 'GET',
        qs: query,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Register a Schematics web-hook.
   *
   * Register a Schematics web-hook.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {WebHook} params.webHook - Register a Web-hook or callback (pre- & post-  actions, such as initialise,
   * redeploy, reconfigure, refresh) with Schematics.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.WebHook>>}
   */
  public createWebhook(params: Schematics20ApiV2.CreateWebhookParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.WebHook>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['webHook'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.webHook;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'createWebhook');

    const parameters = {
      options: {
        url: '/v2/settings/hooks',
        method: 'POST',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the Schematics web-hook.
   *
   * Get the Schematics web-hook.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.hookId - Id of the Schematics web-hook.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.WebHook>>}
   */
  public getWebhook(params: Schematics20ApiV2.GetWebhookParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.WebHook>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['hookId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'hook_id': _params.hookId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getWebhook');

    const parameters = {
      options: {
        url: '/v2/settings/hooks/{hook_id}',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Replace the Schematics web-hook.
   *
   * Replace the Schematics web-hooks.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.hookId - Id of the Schematics web-hook.
   * @param {WebHook} params.webHook - Replace the Schematics web-hook.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.WebHook>>}
   */
  public replaceWebhook(params: Schematics20ApiV2.ReplaceWebhookParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.WebHook>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['hookId', 'webHook'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.webHook;
    const path = {
      'hook_id': _params.hookId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'replaceWebhook');

    const parameters = {
      options: {
        url: '/v2/settings/hooks/{hook_id}',
        method: 'PUT',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Unregister the Schematics web-hook.
   *
   * Delete the Schematics web-hook.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.hookId - Id of the Schematics web-hook.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>>}
   */
  public deleteWebhook(params: Schematics20ApiV2.DeleteWebhookParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['hookId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'hook_id': _params.hookId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'deleteWebhook');

    const parameters = {
      options: {
        url: '/v2/settings/hooks/{hook_id}',
        method: 'DELETE',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * settingsPrivateCluster
   ************************/

  /**
   * Get the details of private cluster registered with Schematics.
   *
   * Get the details of private cluster registered with Schematics.
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.PrivateClusterList>>}
   */
  public getPrivateCluster(params?: Schematics20ApiV2.GetPrivateClusterParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.PrivateClusterList>> {
    const _params = Object.assign({}, params);

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getPrivateCluster');

    const parameters = {
      options: {
        url: '/v2/settings/private_clusters',
        method: 'GET',
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Register your private cluster with Schematics.
   *
   * Register your private Kubernetes cluster, that will be used by schematics to run its Job (over a private network).
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {PrivateCluster} params.privateCluster - Register your private cluster with Schematics to run the jobs.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.PrivateCluster>>}
   */
  public createPrivateCluster(params: Schematics20ApiV2.CreatePrivateClusterParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.PrivateCluster>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['privateCluster'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.privateCluster;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'createPrivateCluster');

    const parameters = {
      options: {
        url: '/v2/settings/private_clusters',
        method: 'POST',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Un-register your private cluster with Schematics.
   *
   * Un-register the private cluster registered with Schematics.
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>>}
   */
  public deletePrivateCluster(params?: Schematics20ApiV2.DeletePrivateClusterParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>> {
    const _params = Object.assign({}, params);

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'deletePrivateCluster');

    const parameters = {
      options: {
        url: '/v2/settings/private_clusters',
        method: 'DELETE',
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * settingsExternalAdapter
   ************************/

  /**
   * Get all Schematics Adapter definitions.
   *
   * Get all the registered Schematics Adapter definitions.
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {string} [params.sort] - Name of the field to sort-by;  Use the '.' character to delineate sub-resources and
   * sub-fields (eg. owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending'
   * (default is ascending)   Ignore unrecognized or unsupported sort field.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.AdapterList>>}
   */
  public listAdapter(params?: Schematics20ApiV2.ListAdapterParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.AdapterList>> {
    const _params = Object.assign({}, params);

    const query = {
      'offset': _params.offset,
      'limit': _params.limit,
      'sort': _params.sort,
      'profile': _params.profile
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listAdapter');

    const parameters = {
      options: {
        url: '/v2/settings/adapters',
        method: 'GET',
        qs: query,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Register an Adapter definition with Schematics.
   *
   * Register an adapter with Schematics, used to access your SCM Repo, Action,  Provisioner, Data, and Credentials.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {Adapter} params.adapter - Adapter Register Request.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Adapter>>}
   */
  public createAdapter(params: Schematics20ApiV2.CreateAdapterParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Adapter>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['adapter'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.adapter;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'createAdapter');

    const parameters = {
      options: {
        url: '/v2/settings/adapters',
        method: 'POST',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the Schematics Adapter definition.
   *
   * Get the Schematics Adapter definition.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.adapterId - Id of the Schematics Adapter.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Adapter>>}
   */
  public getAdapter(params: Schematics20ApiV2.GetAdapterParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Adapter>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['adapterId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'adapter_id': _params.adapterId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getAdapter');

    const parameters = {
      options: {
        url: '/v2/settings/adapters/{adapter_id}',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Replace the Schematics Adapter definition.
   *
   * Replace the Schematics Adapter definition.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.adapterId - Id of the Schematics Adapter.
   * @param {Adapter} params.adapter - Replace the Schematics Adapter definition.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Adapter>>}
   */
  public replaceAdapter(params: Schematics20ApiV2.ReplaceAdapterParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Adapter>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['adapterId', 'adapter'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.adapter;
    const path = {
      'adapter_id': _params.adapterId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'replaceAdapter');

    const parameters = {
      options: {
        url: '/v2/settings/adapters/{adapter_id}',
        method: 'PUT',
        body,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Unregister the Schematics Adapter definition.
   *
   * Delete the Schematics Adapter definition.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.adapterId - Id of the Schematics Adapter.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>>}
   */
  public deleteAdapter(params: Schematics20ApiV2.DeleteAdapterParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['adapterId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'adapter_id': _params.adapterId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'deleteAdapter');

    const parameters = {
      options: {
        url: '/v2/settings/adapters/{adapter_id}',
        method: 'DELETE',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * settingsDatasource
   ************************/

  /**
   * Get all external connection definition.
   *
   * Get all external connection definition.
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {string} [params.sort] - Name of the field to sort-by;  Use the '.' character to delineate sub-resources and
   * sub-fields (eg. owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending'
   * (default is ascending)   Ignore unrecognized or unsupported sort field.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ConnectionList>>}
   */
  public listConnection(params?: Schematics20ApiV2.ListConnectionParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ConnectionList>> {
    const _params = Object.assign({}, params);

    const query = {
      'offset': _params.offset,
      'limit': _params.limit,
      'sort': _params.sort
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listConnection');

    const parameters = {
      options: {
        url: '/v2/settings/connections',
        method: 'GET',
        qs: query,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Register an external connection definition.
   *
   * Register an external connection definition.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {Connection} params.connection - Register a new connection.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Connection>>}
   */
  public createConnection(params: Schematics20ApiV2.CreateConnectionParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Connection>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['connection'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.connection;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'createConnection');

    const parameters = {
      options: {
        url: '/v2/settings/connections',
        method: 'POST',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get all datasources registered with Schematics.
   *
   * Get all datasource registered with Schematics.
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {string} [params.sort] - Name of the field to sort-by;  Use the '.' character to delineate sub-resources and
   * sub-fields (eg. owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending'
   * (default is ascending)   Ignore unrecognized or unsupported sort field.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.DatasourceList>>}
   */
  public listDatasources(params?: Schematics20ApiV2.ListDatasourcesParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.DatasourceList>> {
    const _params = Object.assign({}, params);

    const query = {
      'offset': _params.offset,
      'limit': _params.limit,
      'sort': _params.sort
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listDatasources');

    const parameters = {
      options: {
        url: '/v2/settings/datasources',
        method: 'GET',
        qs: query,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Register an external datasource definition.
   *
   * Register an external datasource definition.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {Datasource} params.datasource - Register a datasource.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Datasource>>}
   */
  public createDatasource(params: Schematics20ApiV2.CreateDatasourceParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Datasource>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['datasource'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.datasource;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'createDatasource');

    const parameters = {
      options: {
        url: '/v2/settings/datasources',
        method: 'POST',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * fulfilment
   ************************/

  /**
   * Get all the fulfilment job order, in the Account.
   *
   * Get all the fulfilment job order, in the Account, associated with a Service.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.service - Short name of the IBM Cloud service.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CartOrderList>>}
   */
  public listCart(params: Schematics20ApiV2.ListCartParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CartOrderList>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['service'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'service': _params.service,
      'offset': _params.offset,
      'limit': _params.limit
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listCart');

    const parameters = {
      options: {
        url: '/v2/cart',
        method: 'GET',
        qs: query,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Create a new fulfilment job order for the cart.
   *
   * Create a new fulfilment job order for the cart.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {CartOrder} params.cartOrder - Create fulfilment job order for the cart.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CartOrder>>}
   */
  public createCartOrder(params: Schematics20ApiV2.CreateCartOrderParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CartOrder>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['cartOrder'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.cartOrder;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'createCartOrder');

    const parameters = {
      options: {
        url: '/v2/cart',
        method: 'POST',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the fulfilment job order details.
   *
   * Get the fulfilment job order.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.orderId - Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM
   * Cloud account.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CartOrder>>}
   */
  public getCartOrder(params: Schematics20ApiV2.GetCartOrderParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CartOrder>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['orderId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'profile': _params.profile
    };

    const path = {
      'order_id': _params.orderId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getCartOrder');

    const parameters = {
      options: {
        url: '/v2/cart/{order_id}',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Update the fulfilment job order and contextually run.
   *
   * Update the fulfilment job order and run with the same context.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.orderId - Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM
   * Cloud account.
   * @param {string} params.operation - The name of fulfilment job operation (install, uninstall, configure, operate).
   * @param {CartOrder} params.cartOrder - Update the fulfilment job order and run the job.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CartOrder>>}
   */
  public replaceCartOrder(params: Schematics20ApiV2.ReplaceCartOrderParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CartOrder>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['orderId', 'operation', 'cartOrder'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.cartOrder;
    const query = {
      'operation': _params.operation,
      'profile': _params.profile
    };

    const path = {
      'order_id': _params.orderId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'replaceCartOrder');

    const parameters = {
      options: {
        url: '/v2/cart/{order_id}',
        method: 'PUT',
        body,
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Run the fulfilment job operation for the cart.
   *
   * Run the fulfilment job operation for the cart.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.orderId - Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM
   * Cloud account.
   * @param {string} params.operation - The name of fulfilment job operation (install, uninstall, configure, operate).
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>>}
   */
  public runFulfilmentOperation(params: Schematics20ApiV2.RunFulfilmentOperationParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['orderId', 'operation'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'operation': _params.operation,
      'profile': _params.profile
    };

    const path = {
      'order_id': _params.orderId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'runFulfilmentOperation');

    const parameters = {
      options: {
        url: '/v2/cart/{order_id}',
        method: 'POST',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Delete the fulfilment job order.
   *
   * Run pre-delete operation and delete the fulfilment job order.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.orderId - Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM
   * Cloud account.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {boolean} [params.destroy] - Destroy the resources before deleting the fulfilment job order (default=true).
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>>}
   */
  public deleteCartOrder(params: Schematics20ApiV2.DeleteCartOrderParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['orderId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'profile': _params.profile,
      'destroy': _params.destroy
    };

    const path = {
      'order_id': _params.orderId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'deleteCartOrder');

    const parameters = {
      options: {
        url: '/v2/cart/{order_id}',
        method: 'DELETE',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Update the fulfilment job order.
   *
   * Update the fulfilment job order.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.orderId - Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM
   * Cloud account.
   * @param {UpdateCartOrder} params.updateCartOrder - Update the fulfilment job order.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CartOrder>>}
   */
  public updateCartOrder(params: Schematics20ApiV2.UpdateCartOrderParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CartOrder>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['orderId', 'updateCartOrder'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.updateCartOrder;
    const query = {
      'profile': _params.profile
    };

    const path = {
      'order_id': _params.orderId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'updateCartOrder');

    const parameters = {
      options: {
        url: '/v2/cart/{order_id}',
        method: 'PATCH',
        body,
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get metadata for the fulfilment job order.
   *
   * Get variable and operation metadata for the fulfilment job order.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.orderId - Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM
   * Cloud account.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ItemMetadata>>}
   */
  public getCartMetadata(params: Schematics20ApiV2.GetCartMetadataParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.ItemMetadata>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['orderId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const path = {
      'order_id': _params.orderId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getCartMetadata');

    const parameters = {
      options: {
        url: '/v2/cart/{order_id}/metadata',
        method: 'GET',
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get current list of cloud sources, fulfilled by the cart.
   *
   * Get current list of cloud resources, fulfilled by the cart.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.orderId - Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM
   * Cloud account.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CloudResourceList>>}
   */
  public listCartResources(params: Schematics20ApiV2.ListCartResourcesParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CloudResourceList>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['orderId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit
    };

    const path = {
      'order_id': _params.orderId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listCartResources');

    const parameters = {
      options: {
        url: '/v2/cart/{order_id}/resources',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the list of fulfilment jobs performed on the cart.
   *
   * Get list of fulfilment jobs performed on the cart.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.orderId - Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM
   * Cloud account.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.JobList>>}
   */
  public listCartOrderJobs(params: Schematics20ApiV2.ListCartOrderJobsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.JobList>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['orderId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit
    };

    const path = {
      'order_id': _params.orderId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listCartOrderJobs');

    const parameters = {
      options: {
        url: '/v2/cart/{order_id}/jobs',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get fulfilment job details.
   *
   * Get fulfilment job details.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.orderId - Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM
   * Cloud account.
   * @param {string} params.jobId - Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.JobLite>>}
   */
  public getCartOrderJob(params: Schematics20ApiV2.GetCartOrderJobParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.JobLite>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['orderId', 'jobId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit
    };

    const path = {
      'order_id': _params.orderId,
      'job_id': _params.jobId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getCartOrderJob');

    const parameters = {
      options: {
        url: '/v2/cart/{order_id}/jobs/{job_id}',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the fulfilment job logs.
   *
   * Get the fulfilment job logs.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.orderId - Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM
   * Cloud account.
   * @param {string} params.jobId - Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.JobLog>>}
   */
  public getCartOrderJobLog(params: Schematics20ApiV2.GetCartOrderJobLogParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.JobLog>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['orderId', 'jobId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit
    };

    const path = {
      'order_id': _params.orderId,
      'job_id': _params.jobId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getCartOrderJobLog');

    const parameters = {
      options: {
        url: '/v2/cart/{order_id}/jobs/{job_id}/logs',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the fulfilment job resources.
   *
   * Get the fulfilment job resources.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.orderId - Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM
   * Cloud account.
   * @param {string} params.jobId - Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CloudResourceList>>}
   */
  public getCartOrderJobResources(params: Schematics20ApiV2.GetCartOrderJobResourcesParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CloudResourceList>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['orderId', 'jobId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit
    };

    const path = {
      'order_id': _params.orderId,
      'job_id': _params.jobId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getCartOrderJobResources');

    const parameters = {
      options: {
        url: '/v2/cart/{order_id}/jobs/{job_id}/resources',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * environment
   ************************/

  /**
   * List all the environment definitions from the catalog by filtering the offerings by environment kind.
   *
   * Get all the environments defined in the catalog as an environment offering.
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {string} [params.catalogId] - Catalog ID to get the list of environments defined as part of offerings.
   * @param {string} [params.catalogName] - Catalog Name to get the list of environments defined as part of offerings.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.EnvironmentCatalogOfferingItem[]>>}
   */
  public listEnvironmentDefinitions(params?: Schematics20ApiV2.ListEnvironmentDefinitionsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.EnvironmentCatalogOfferingItem[]>> {
    const _params = Object.assign({}, params);

    const query = {
      'offset': _params.offset,
      'limit': _params.limit,
      'catalog_id': _params.catalogId,
      'catalog_name': _params.catalogName
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listEnvironmentDefinitions');

    const parameters = {
      options: {
        url: '/v2/environmentdefinitions',
        method: 'GET',
        qs: query,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the environment definition from the provided catalog and offering id.
   *
   * Get the details of the environment (blueprint.yml and config.yml) from the provided catalog and offering id.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.offeringId - Catalog ID to get the list of environments defined as part of offerings.
   * @param {string} [params.catalogId] - Catalog ID to get the list of environments defined as part of offerings.
   * @param {string} [params.catalogName] - Catalog Name to get the list of environments defined as part of offerings.
   * @param {string} [params.offeringName] - Offering Name to get the list of environments defined as part of offerings.
   * @param {string} [params.offeringVersion] - Version of the offering.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Environment>>}
   */
  public getEnvironmentDefinition(params: Schematics20ApiV2.GetEnvironmentDefinitionParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Environment>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['offeringId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'catalog_id': _params.catalogId,
      'catalog_name': _params.catalogName,
      'offering_name': _params.offeringName,
      'offering_version': _params.offeringVersion,
      'offset': _params.offset,
      'limit': _params.limit
    };

    const path = {
      'offering_id': _params.offeringId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getEnvironmentDefinition');

    const parameters = {
      options: {
        url: '/v2/environmentdefinitions/{offering_id}',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get all the environment instances, in the Account.
   *
   * Get all the environment instances, in the Account, associated with a Service.
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.EnvironmentList>>}
   */
  public listEnvironment(params?: Schematics20ApiV2.ListEnvironmentParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.EnvironmentList>> {
    const _params = Object.assign({}, params);

    const query = {
      'offset': _params.offset,
      'limit': _params.limit
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listEnvironment');

    const parameters = {
      options: {
        url: '/v2/environments',
        method: 'GET',
        qs: query,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Create a new environment.
   *
   * Create a new environment.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {Environment} params.environment - Create environment.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Environment>>}
   */
  public createEnvironment(params: Schematics20ApiV2.CreateEnvironmentParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Environment>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['environment'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.environment;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'createEnvironment');

    const parameters = {
      options: {
        url: '/v2/environments',
        method: 'POST',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get the environment details.
   *
   * Get the environment details.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.environmentId - Environment Id.  Use GET /environments API to look up the order ids in your
   * IBM Cloud account.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Environment>>}
   */
  public getEnvironment(params: Schematics20ApiV2.GetEnvironmentParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Environment>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['environmentId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'profile': _params.profile
    };

    const path = {
      'environment_id': _params.environmentId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getEnvironment');

    const parameters = {
      options: {
        url: '/v2/environments/{environment_id}',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Update the environment details.
   *
   * Update the environment details.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.environmentId - Environment Id.  Use GET /environments API to look up the order ids in your
   * IBM Cloud account.
   * @param {Environment} params.environment - Update the environment details.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Environment>>}
   */
  public replaceEnvironment(params: Schematics20ApiV2.ReplaceEnvironmentParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Environment>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['environmentId', 'environment'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.environment;
    const query = {
      'profile': _params.profile
    };

    const path = {
      'environment_id': _params.environmentId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'replaceEnvironment');

    const parameters = {
      options: {
        url: '/v2/environments/{environment_id}',
        method: 'PUT',
        body,
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Delete the environment.
   *
   * Delete the environment.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.environmentId - Environment Id.  Use GET /environments API to look up the order ids in your
   * IBM Cloud account.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {boolean} [params.destroy] - Destroy the resources before deleting the environment.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>>}
   */
  public deleteEnvironment(params: Schematics20ApiV2.DeleteEnvironmentParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Empty>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['environmentId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'profile': _params.profile,
      'destroy': _params.destroy
    };

    const path = {
      'environment_id': _params.environmentId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'deleteEnvironment');

    const parameters = {
      options: {
        url: '/v2/environments/{environment_id}',
        method: 'DELETE',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Update the environment details.
   *
   * Update the environment details.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.environmentId - Environment Id.  Use GET /environments API to look up the order ids in your
   * IBM Cloud account.
   * @param {Environment} params.environment - Update the environment details.
   * @param {string} [params.profile] - Level of details returned by the get method.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Environment>>}
   */
  public updateEnvironment(params: Schematics20ApiV2.UpdateEnvironmentParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.Environment>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['environmentId', 'environment'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.environment;
    const query = {
      'profile': _params.profile
    };

    const path = {
      'environment_id': _params.environmentId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'updateEnvironment');

    const parameters = {
      options: {
        url: '/v2/environments/{environment_id}',
        method: 'PATCH',
        body,
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get current list of workspaces, created for the environment.
   *
   * Get current list of workspaces, created for the environment.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.environmentId - Environment Id.  Use GET /environments API to look up the order ids in your
   * IBM Cloud account.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CloudResourceList>>}
   */
  public listEnvironmentWorkspaces(params: Schematics20ApiV2.ListEnvironmentWorkspacesParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CloudResourceList>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['environmentId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit
    };

    const path = {
      'environment_id': _params.environmentId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listEnvironmentWorkspaces');

    const parameters = {
      options: {
        url: '/v2/environment/{environment_id}/workspaces',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Get current list of cloud resources.
   *
   * Get current list of cloud resources.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.environmentId - Environment Id.  Use GET /environments API to look up the order ids in your
   * IBM Cloud account.
   * @param {number} [params.offset] - The starting position of the item in the list of items. For example, if you have
   * three workspaces in your account, the first workspace is assigned position number 0, the second workspace is
   * assigned position number 1, and so forth. If you have 6 workspaces and you want to list the details for workspaces
   * 2-6, enter 1. To limit the number of workspaces that is returned, use the `limit` option in addition to the
   * `offset` option. Negative numbers are not supported and are ignored.
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CloudResourceList>>}
   */
  public listEnvironmentResources(params: Schematics20ApiV2.ListEnvironmentResourcesParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.CloudResourceList>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['environmentId'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'offset': _params.offset,
      'limit': _params.limit
    };

    const path = {
      'environment_id': _params.environmentId
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listEnvironmentResources');

    const parameters = {
      options: {
        url: '/v2/environment/{environment_id}/resources',
        method: 'GET',
        qs: query,
        path,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * kms
   ************************/

  /**
   * Get the KMS settings.
   *
   * Retrieve the KMS on the API endpoint that you have access. For example, if you use an API endpoint for a geography,
   * such as North America, only Schematics resource that are created in `us-south` or `us-east` are retrieved.
   * <h3>Authorization</h3> Schematics support generic authorization such as service access or platform access to the
   * action ID and the resource group. For more information, about Schematics access and permissions, see  [Schematics
   * service access roles and required permissions](/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.location - The location of the Resource.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.KMSSettings>>}
   */
  public getKmsSettings(params: Schematics20ApiV2.GetKmsSettingsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.KMSSettings>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['location'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'location': _params.location
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'getKmsSettings');

    const parameters = {
      options: {
        url: '/v2/settings/kms',
        method: 'GET',
        qs: query,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Replace the KMS settings.
   *
   * Replace or Update the KMS setting for your location, by using your private endpoint, `CRN`, primary `CRK`, and
   * secondary `CRK`. **Note** you can update the KMS settings only once. For example, if you use an API endpoint for a
   * geography, such as North America, only Schematics resource that are created in `us-south` or `us-east` are
   * retrieved.
   * <h3>Authorization</h3> Schematics support generic authorization such as service access or platform access to the
   * action ID and the resource group. For more information, about Schematics access and permissions, see  [Schematics
   * service access roles and required permissions](/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {KMSSettings} params.kmsSettings - Options to be provided with updating kms settings.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.KMSSettings>>}
   */
  public updateKmsSettings(params: Schematics20ApiV2.UpdateKmsSettingsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.KMSSettings>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['kmsSettings'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.kmsSettings;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'updateKmsSettings');

    const parameters = {
      options: {
        url: '/v2/settings/kms',
        method: 'PUT',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Discover the KMS instances.
   *
   * Lists the KMS instances of your IBM Cloud account to find your Key Protect or Hyper Protect Crypto Services by
   * using the location and encrypted scheme such as KYOK or BYOK.
   * <h3>Authorization</h3> Schematics support generic authorization such as service access or platform access to the
   * action ID and the resource group. For more information, about Schematics access and permissions, see  [Schematics
   * service access roles and required permissions](/docs/schematics?topic=schematics-access#access-roles).
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {string} params.encryptionScheme - The encryption scheme to be used.
   * @param {string} params.location - The location of the Resource.
   * @param {string} [params.resourceGroup] - The resource group (by default, fetch from all resource groups).
   * @param {number} [params.limit] - The maximum number of items that you want to list. The number must be a positive
   * integer between 1 and 2000. If no value is provided, 100 is used by default.
   * @param {string} [params.sort] - Name of the field to sort-by;  Use the '.' character to delineate sub-resources and
   * sub-fields (eg. owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending'
   * (default is ascending)   Ignore unrecognized or unsupported sort field.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.KMSDiscovery>>}
   */
  public listKms(params: Schematics20ApiV2.ListKmsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.KMSDiscovery>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['encryptionScheme', 'location'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const query = {
      'encryption_scheme': _params.encryptionScheme,
      'location': _params.location,
      'resource_group': _params.resourceGroup,
      'limit': _params.limit,
      'sort': _params.sort
    };

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listKms');

    const parameters = {
      options: {
        url: '/v2/settings/kms_instances',
        method: 'GET',
        qs: query,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /*************************
   * util
   ************************/

  /**
   * List supported Schematics locations.
   *
   * Retrieve a list of IBM Cloud locations where you can work with Schematics objects.
   *
   * @param {Object} [params] - The parameters to send to the service.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.SchematicsLocationsList>>}
   */
  public listLocations(params?: Schematics20ApiV2.ListLocationsParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.SchematicsLocationsList>> {
    const _params = Object.assign({}, params);

    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'listLocations');

    const parameters = {
      options: {
        url: '/v2/locations',
        method: 'GET',
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

  /**
   * Create metadata by parsing the template.
   *
   * Get the variable metadata from the template. This metadata can be passed in the payload during Schematics workspace
   * create or update API call.
   *
   * @param {Object} params - The parameters to send to the service.
   * @param {TemplateMetaDataRequest} params.templateMetaDataRequest - Create template metadata request.
   * @param {string} [params.xGithubToken] - The personal access token associated with your GitHub or GitLab repository,
   * required to clone the repository.
   * @param {OutgoingHttpHeaders} [params.headers] - Custom request headers
   * @returns {Promise<Schematics20ApiV2.Response<Schematics20ApiV2.TemplateMetaDataResponse>>}
   */
  public processTemplateMetaData(params: Schematics20ApiV2.ProcessTemplateMetaDataParams): Promise<Schematics20ApiV2.Response<Schematics20ApiV2.TemplateMetaDataResponse>> {
    const _params = Object.assign({}, params);
    const requiredParams = ['templateMetaDataRequest'];

    const missingParams = getMissingParams(_params, requiredParams);
    if (missingParams) {
      return Promise.reject(missingParams);
    }

    const body = _params.templateMetaDataRequest;
    const sdkHeaders = getSdkHeaders(Schematics20ApiV2.DEFAULT_SERVICE_NAME, 'v2', 'processTemplateMetaData');

    const parameters = {
      options: {
        url: '/v2/template_metadata_processor',
        method: 'POST',
        body,
      },
      defaultOptions: extend(true, {}, this.baseOptions, {
        headers: extend(true, sdkHeaders, {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
          'X-Github-token': _params.xGithubToken
        }, _params.headers),
      }),
    };

    return this.createRequest(parameters);
  };

}

/*************************
 * interfaces
 ************************/

namespace Schematics20ApiV2 {

  /** An operation response. */
  export interface Response<T = any>  {
    result: T;
    status: number;
    statusText: string;
    headers: IncomingHttpHeaders;
  }

  /** The callback for a service request. */
  export type Callback<T> = (error: any, response?: Response<T>) => void;

  /** The body of a service request that returns no response data. */
  export interface Empty { }

  /** A standard JS object, defined to avoid the limitations of `Object` and `object` */
  export interface JsonObject {
    [key: string]: any;
  }

  /*************************
   * request interfaces
   ************************/

  /** Parameters for the `getSchematicsInfo` operation. */
  export interface GetSchematicsInfoParams {
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listSchematicsAccessRules` operation. */
  export interface ListSchematicsAccessRulesParams {
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getSchematicsAccessRulesForResource` operation. */
  export interface GetSchematicsAccessRulesForResourceParams {
    /** Name of the schematics resource. */
    resourceName: string;
    /** Job command name. */
    commandName?: string;
    /** Schematics job command parameter (playbook-name, capsule-name or flow-name). */
    commandParameter?: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getSchematicsCommandNames` operation. */
  export interface GetSchematicsCommandNamesParams {
    /** Name of the schematics resource. */
    resourceName: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listWorkspaces` operation. */
  export interface ListWorkspacesParams {
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
     *  owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is
     *  ascending)   Ignore unrecognized or unsupported sort field.
     */
    sort?: string;
    /** Level of details returned by the get method. */
    profile?: ListWorkspacesConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `listWorkspaces` operation. */
  export namespace ListWorkspacesConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `createWorkspace` operation. */
  export interface CreateWorkspaceParams {
    /** Create a Workspace in your Account. */
    workspace: Workspace;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getWorkspace` operation. */
  export interface GetWorkspaceParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Level of details returned by the get method. */
    profile?: GetWorkspaceConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `getWorkspace` operation. */
  export namespace GetWorkspaceConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      SUMMARY = 'summary',
      DETAILED = 'detailed',
    }
  }

  /** Parameters for the `replaceWorkspace` operation. */
  export interface ReplaceWorkspaceParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Replace the entire Workspace definition. */
    workspace: Workspace;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `deleteWorkspace` operation. */
  export interface DeleteWorkspaceParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Equivalent to -force options in the command line. */
    force?: boolean;
    /** Auto propagate the chaange or deletion to the dependent resources. */
    propagate?: boolean;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `updateWorkspace` operation. */
  export interface UpdateWorkspaceParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Update some details in the Workspace. */
    workspace: Workspace;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listWorkspaceInputs` operation. */
  export interface ListWorkspaceInputsParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listWorkspaceOutputs` operation. */
  export interface ListWorkspaceOutputsParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `createWorkspaceTemplates` operation. */
  export interface CreateWorkspaceTemplatesParams {
    /** List of Templates. */
    templateListRequest: TemplateListRequest;
    /** The personal access token associated with your GitHub or GitLab repository, required to clone the
     *  repository.
     */
    xGithubToken?: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listTemplatesInWorkspace` operation. */
  export interface ListTemplatesInWorkspaceParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
     *  owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is
     *  ascending)   Ignore unrecognized or unsupported sort field.
     */
    sort?: string;
    /** Level of details returned by the get method. */
    profile?: ListTemplatesInWorkspaceConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `listTemplatesInWorkspace` operation. */
  export namespace ListTemplatesInWorkspaceConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `addTemplatesToWorkspace` operation. */
  export interface AddTemplatesToWorkspaceParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Add a new Template to the Workspace. */
    template: Template;
    /** The personal access token associated with your GitHub or GitLab repository, required to clone the
     *  repository.
     */
    xGithubToken?: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getTemplateInWorkspace` operation. */
  export interface GetTemplateInWorkspaceParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the  Template Ids in your
     *  Workspaces.
     */
    templateId: string;
    /** Level of details returned by the get method. */
    profile?: GetTemplateInWorkspaceConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `getTemplateInWorkspace` operation. */
  export namespace GetTemplateInWorkspaceConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      SUMMARY = 'summary',
      DETAILED = 'detailed',
    }
  }

  /** Parameters for the `replaceTemplateInWorkspace` operation. */
  export interface ReplaceTemplateInWorkspaceParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the  Template Ids in your
     *  Workspaces.
     */
    templateId: string;
    /** Replace the entire Template in the Workspace. */
    template?: Template;
    /** The personal access token associated with your GitHub or GitLab repository, required to clone the
     *  repository.
     */
    xGithubToken?: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `deleteTemplateFromWorkspace` operation. */
  export interface DeleteTemplateFromWorkspaceParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the  Template Ids in your
     *  Workspaces.
     */
    templateId: string;
    /** Equivalent to -force options in the command line. */
    force?: boolean;
    /** Auto propagate the chaange or deletion to the dependent resources. */
    propagate?: boolean;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `updateTemplateInWorkspace` operation. */
  export interface UpdateTemplateInWorkspaceParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the  Template Ids in your
     *  Workspaces.
     */
    templateId: string;
    /** Update the Template definition in the Workspace. */
    template?: Template;
    /** The personal access token associated with your GitHub or GitLab repository, required to clone the
     *  repository.
     */
    xGithubToken?: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `uploadTemplateTarInWorkspace` operation. */
  export interface UploadTemplateTarInWorkspaceParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the  Template Ids in your
     *  Workspaces.
     */
    templateId: string;
    /** Template tar file. */
    tarFile?: NodeJS.ReadableStream|Buffer;
    /** The content type of tarFile. */
    tarFileContentType?: string;
    /** The personal access token associated with your GitHub or GitLab repository, required to clone the
     *  repository.
     */
    xGithubToken?: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getTemplateReadme` operation. */
  export interface GetTemplateReadmeParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the  Template Ids in your
     *  Workspaces.
     */
    templateId: string;
    /** The type of the response: text/markdown or text/html. A character encoding can be specified by including a
     *  `charset` parameter. For example, 'text/markdown;charset=utf-8'.
     */
    accept?: GetTemplateReadmeConstants.Accept | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `getTemplateReadme` operation. */
  export namespace GetTemplateReadmeConstants {
    /** The type of the response: text/markdown or text/html. A character encoding can be specified by including a `charset` parameter. For example, 'text/markdown;charset=utf-8'. */
    export enum Accept {
      TEXT_MARKDOWN = 'text/markdown',
      TEXT_HTML = 'text/html',
    }
  }

  /** Parameters for the `getTemplateSource` operation. */
  export interface GetTemplateSourceParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the  Template Ids in your
     *  Workspaces.
     */
    templateId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listTemplateInputs` operation. */
  export interface ListTemplateInputsParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the  Template Ids in your
     *  Workspaces.
     */
    templateId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listTemplateOutputs` operation. */
  export interface ListTemplateOutputsParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the  Template Ids in your
     *  Workspaces.
     */
    templateId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listFlowsInWorkspace` operation. */
  export interface ListFlowsInWorkspaceParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
     *  owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is
     *  ascending)   Ignore unrecognized or unsupported sort field.
     */
    sort?: string;
    /** Level of details returned by the get method. */
    profile?: ListFlowsInWorkspaceConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `listFlowsInWorkspace` operation. */
  export namespace ListFlowsInWorkspaceConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `addFlowToWorkspace` operation. */
  export interface AddFlowToWorkspaceParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Add a new Flow to the Workspace. */
    templateFlow: TemplateFlow;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getFlowInWorkspace` operation. */
  export interface GetFlowInWorkspaceParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Flow Id.  Use GET /workspaces/<workspace_id>/flows API to look up the  Flow Ids in your Workspaces. */
    flowId: string;
    /** Level of details returned by the get method. */
    profile?: GetFlowInWorkspaceConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `getFlowInWorkspace` operation. */
  export namespace GetFlowInWorkspaceConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      SUMMARY = 'summary',
      DETAILED = 'detailed',
    }
  }

  /** Parameters for the `replaceFlowInWorkspace` operation. */
  export interface ReplaceFlowInWorkspaceParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Flow Id.  Use GET /workspaces/<workspace_id>/flows API to look up the  Flow Ids in your Workspaces. */
    flowId: string;
    /** Replace the entire Flow in the Workspace. */
    templateFlow?: TemplateFlow;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `deleteFlowFromWorkspace` operation. */
  export interface DeleteFlowFromWorkspaceParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Flow Id.  Use GET /workspaces/<workspace_id>/flows API to look up the  Flow Ids in your Workspaces. */
    flowId: string;
    /** Auto propagate the chaange or deletion to the dependent resources. */
    propagate?: boolean;
    /** Equivalent to -force options in the command line. */
    force?: boolean;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `updateFlowInWorkspace` operation. */
  export interface UpdateFlowInWorkspaceParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Flow Id.  Use GET /workspaces/<workspace_id>/flows API to look up the  Flow Ids in your Workspaces. */
    flowId: string;
    /** Update the Flow definition in the workspace. */
    templateFlow?: TemplateFlow;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listActions` operation. */
  export interface ListActionsParams {
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
     *  owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is
     *  ascending)   Ignore unrecognized or unsupported sort field.
     */
    sort?: string;
    /** Level of details returned by the get method. */
    profile?: ListActionsConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `listActions` operation. */
  export namespace ListActionsConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `createAction` operation. */
  export interface CreateActionParams {
    /** Create Action request. */
    action: Action;
    /** The personal access token associated with your GitHub or GitLab repository, required to clone the
     *  repository.
     */
    xGithubToken?: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getAction` operation. */
  export interface GetActionParams {
    /** Action Id.  Use GET /actions API to look up the Action Ids in your IBM Cloud account. */
    actionId: string;
    /** Level of details returned by the get method. */
    profile?: GetActionConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `getAction` operation. */
  export namespace GetActionConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      SUMMARY = 'summary',
      DETAILED = 'detailed',
    }
  }

  /** Parameters for the `deleteAction` operation. */
  export interface DeleteActionParams {
    /** Action Id.  Use GET /actions API to look up the Action Ids in your IBM Cloud account. */
    actionId: string;
    /** Equivalent to -force options in the command line. */
    force?: boolean;
    /** Auto propagate the chaange or deletion to the dependent resources. */
    propagate?: boolean;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `updateAction` operation. */
  export interface UpdateActionParams {
    /** Action Id.  Use GET /actions API to look up the Action Ids in your IBM Cloud account. */
    actionId: string;
    /** Action. */
    action: Action;
    /** The personal access token associated with your GitHub or GitLab repository, required to clone the
     *  repository.
     */
    xGithubToken?: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `uploadTemplateTarAction` operation. */
  export interface UploadTemplateTarActionParams {
    /** Action Id.  Use GET /actions API to look up the Action Ids in your IBM Cloud account. */
    actionId: string;
    /** Template tar file. */
    file?: NodeJS.ReadableStream|Buffer;
    /** The content type of file. */
    fileContentType?: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listJobs` operation. */
  export interface ListJobsParams {
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
     *  owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is
     *  ascending)   Ignore unrecognized or unsupported sort field.
     */
    sort?: string;
    /** Level of details returned by the get method. */
    profile?: ListJobsConstants.Profile | string;
    /** Name of the resource (workspace, actions or controls). */
    resource?: ListJobsConstants.Resource | string;
    /** The Resource Id. It could be an Action-id or Workspace-id. */
    resourceId?: string;
    /** Action Id. */
    actionId?: string;
    /** list jobs. */
    list?: ListJobsConstants.List | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `listJobs` operation. */
  export namespace ListJobsConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
    /** Name of the resource (workspace, actions or controls). */
    export enum Resource {
      WORKSPACE = 'workspace',
      ACTION = 'action',
    }
    /** list jobs. */
    export enum List {
      ALL = 'all',
    }
  }

  /** Parameters for the `createJob` operation. */
  export interface CreateJobParams {
    /** The IAM refresh token associated with the IBM Cloud account. */
    refreshToken: string;
    /** Create a Job Record and launch the Job. */
    job: Job;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getJob` operation. */
  export interface GetJobParams {
    /** Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account. */
    jobId: string;
    /** Level of details returned by the get method. */
    profile?: GetJobConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `getJob` operation. */
  export namespace GetJobConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      SUMMARY = 'summary',
      DETAILED = 'detailed',
    }
  }

  /** Parameters for the `updateJob` operation. */
  export interface UpdateJobParams {
    /** Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account. */
    jobId: string;
    /** The IAM refresh token associated with the IBM Cloud account. */
    refreshToken: string;
    /** Clone the Job-record, and relaunch the Job. */
    job: Job;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `deleteJob` operation. */
  export interface DeleteJobParams {
    /** Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account. */
    jobId: string;
    /** The IAM refresh token associated with the IBM Cloud account. */
    refreshToken: string;
    /** Equivalent to -force options in the command line. */
    force?: boolean;
    /** Auto propagate the chaange or deletion to the dependent resources. */
    propagate?: boolean;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listJobLogs` operation. */
  export interface ListJobLogsParams {
    /** Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account. */
    jobId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listJobStates` operation. */
  export interface ListJobStatesParams {
    /** Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account. */
    jobId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listControls` operation. */
  export interface ListControlsParams {
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
     *  owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is
     *  ascending)   Ignore unrecognized or unsupported sort field.
     */
    sort?: string;
    /** Level of details returned by the get method. */
    profile?: ListControlsConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `listControls` operation. */
  export namespace ListControlsConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `createControls` operation. */
  export interface CreateControlsParams {
    /** Register a Control. */
    controls: Controls;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getControls` operation. */
  export interface GetControlsParams {
    /** Controls Id.  Use GET /controls API to look up the Controls Ids in your IBM Cloud account. */
    controlsId: string;
    /** Level of details returned by the get method. */
    profile?: GetControlsConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `getControls` operation. */
  export namespace GetControlsConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      SUMMARY = 'summary',
      DETAILED = 'detailed',
    }
  }

  /** Parameters for the `deleteControls` operation. */
  export interface DeleteControlsParams {
    /** Controls Id.  Use GET /controls API to look up the Controls Ids in your IBM Cloud account. */
    controlsId: string;
    /** Equivalent to -force options in the command line. */
    force?: boolean;
    /** Auto propagate the chaange or deletion to the dependent resources. */
    propagate?: boolean;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `updateControls` operation. */
  export interface UpdateControlsParams {
    /** Controls Id.  Use GET /controls API to look up the Controls Ids in your IBM Cloud account. */
    controlsId: string;
    /** Update the Controls definition. */
    controls: Controls;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listCapsules` operation. */
  export interface ListCapsulesParams {
    /** Controls Id.  Use GET /controls API to look up the Controls Ids in your IBM Cloud account. */
    controlsId: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
     *  owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is
     *  ascending)   Ignore unrecognized or unsupported sort field.
     */
    sort?: string;
    /** Level of details returned by the get method. */
    profile?: ListCapsulesConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `listCapsules` operation. */
  export namespace ListCapsulesConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `createCapsule` operation. */
  export interface CreateCapsuleParams {
    /** Controls Id.  Use GET /controls API to look up the Controls Ids in your IBM Cloud account. */
    controlsId: string;
    /** Create a Policy Capsule in the Controls definition. */
    capsule: Capsule;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getCapsule` operation. */
  export interface GetCapsuleParams {
    /** Controls Id.  Use GET /controls API to look up the Controls Ids in your IBM Cloud account. */
    controlsId: string;
    /** Capsule Id.  Use GET /controls/<contorls_id>/capsules API to look up the Capsules Ids  for the Controls in
     *  your IBM Cloud account.
     */
    capsuleId: string;
    /** Level of details returned by the get method. */
    profile?: GetCapsuleConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `getCapsule` operation. */
  export namespace GetCapsuleConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      SUMMARY = 'summary',
      DETAILED = 'detailed',
    }
  }

  /** Parameters for the `deleteCapsule` operation. */
  export interface DeleteCapsuleParams {
    /** Controls Id.  Use GET /controls API to look up the Controls Ids in your IBM Cloud account. */
    controlsId: string;
    /** Capsule Id.  Use GET /controls/<contorls_id>/capsules API to look up the Capsules Ids  for the Controls in
     *  your IBM Cloud account.
     */
    capsuleId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `updateCapsule` operation. */
  export interface UpdateCapsuleParams {
    /** Controls Id.  Use GET /controls API to look up the Controls Ids in your IBM Cloud account. */
    controlsId: string;
    /** Capsule Id.  Use GET /controls/<contorls_id>/capsules API to look up the Capsules Ids  for the Controls in
     *  your IBM Cloud account.
     */
    capsuleId: string;
    /** Update the Policy Capusle. */
    capsule: Capsule;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listDatasets` operation. */
  export interface ListDatasetsParams {
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
     *  owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is
     *  ascending)   Ignore unrecognized or unsupported sort field.
     */
    sort?: string;
    /** Level of details returned by the get method. */
    profile?: ListDatasetsConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `listDatasets` operation. */
  export namespace ListDatasetsConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `createDataset` operation. */
  export interface CreateDatasetParams {
    /** Create a shared dataset. */
    dataset: Dataset;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getDataset` operation. */
  export interface GetDatasetParams {
    /** Shared dataset Id.  Use GET /datasets API to look up the Shared dataset Ids  in your IBM Cloud account. */
    datasetId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `replaceDataset` operation. */
  export interface ReplaceDatasetParams {
    /** Shared dataset Id.  Use GET /datasets API to look up the Shared dataset Ids  in your IBM Cloud account. */
    datasetId: string;
    /** Replace the shared datasets. */
    dataset: Dataset;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `deleteDataset` operation. */
  export interface DeleteDatasetParams {
    /** Shared dataset Id.  Use GET /datasets API to look up the Shared dataset Ids  in your IBM Cloud account. */
    datasetId: string;
    /** Equivalent to -force options in the command line. */
    force?: boolean;
    /** Auto propagate the chaange or deletion to the dependent resources. */
    propagate?: boolean;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `updateAtaset` operation. */
  export interface UpdateAtasetParams {
    /** Shared dataset Id.  Use GET /datasets API to look up the Shared dataset Ids  in your IBM Cloud account. */
    datasetId: string;
    /** Update the shared dataset details. */
    dataset: Dataset;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listDatasetVariables` operation. */
  export interface ListDatasetVariablesParams {
    /** Shared dataset Id.  Use GET /datasets API to look up the Shared dataset Ids  in your IBM Cloud account. */
    datasetId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getDatasetVariable` operation. */
  export interface GetDatasetVariableParams {
    /** Shared dataset Id.  Use GET /datasets API to look up the Shared dataset Ids  in your IBM Cloud account. */
    datasetId: string;
    /** Name of the variable. */
    varName: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listCredentials` operation. */
  export interface ListCredentialsParams {
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
     *  owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is
     *  ascending)   Ignore unrecognized or unsupported sort field.
     */
    sort?: string;
    /** Level of details returned by the get method. */
    profile?: ListCredentialsConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `listCredentials` operation. */
  export namespace ListCredentialsConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `createCredential` operation. */
  export interface CreateCredentialParams {
    /** Create a credential entry. */
    credentialset: Credentialset;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getCredential` operation. */
  export interface GetCredentialParams {
    /** Credentials Id.  Use GET /credentials API to look up the Credentials Ids  in your IBM Cloud account. */
    credsId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `replaceCredential` operation. */
  export interface ReplaceCredentialParams {
    /** Credentials Id.  Use GET /credentials API to look up the Credentials Ids  in your IBM Cloud account. */
    credsId: string;
    /** Replace the credential entry. */
    credentialset: Credentialset;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `deleteCredential` operation. */
  export interface DeleteCredentialParams {
    /** Credentials Id.  Use GET /credentials API to look up the Credentials Ids  in your IBM Cloud account. */
    credsId: string;
    /** Equivalent to -force options in the command line. */
    force?: boolean;
    /** Auto propagate the chaange or deletion to the dependent resources. */
    propagate?: boolean;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `updateCredential` operation. */
  export interface UpdateCredentialParams {
    /** Credentials Id.  Use GET /credentials API to look up the Credentials Ids  in your IBM Cloud account. */
    credsId: string;
    /** Update the credential entry. */
    credentialset: Credentialset;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listCredentialValues` operation. */
  export interface ListCredentialValuesParams {
    /** Credentials Id.  Use GET /credentials API to look up the Credentials Ids  in your IBM Cloud account. */
    credsId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getCredentialValue` operation. */
  export interface GetCredentialValueParams {
    /** Credentials Id.  Use GET /credentials API to look up the Credentials Ids  in your IBM Cloud account. */
    credsId: string;
    /** Name of the variable. */
    varName: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listInventories` operation. */
  export interface ListInventoriesParams {
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
     *  owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is
     *  ascending)   Ignore unrecognized or unsupported sort field.
     */
    sort?: string;
    /** Level of details returned by the get method. */
    profile?: ListInventoriesConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `listInventories` operation. */
  export namespace ListInventoriesConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `createInventory` operation. */
  export interface CreateInventoryParams {
    /** Create a Inventory definition resource. */
    inventoryResourceDefinition: InventoryResourceDefinition;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getInventory` operation. */
  export interface GetInventoryParams {
    /** Resource Inventory Id.  Use GET /inventories API to look up the Resource Inventory definition Ids  in your
     *  IBM Cloud account.
     */
    inventoryId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `replaceInventory` operation. */
  export interface ReplaceInventoryParams {
    /** Resource Inventory Id.  Use GET /inventories API to look up the Resource Inventory definition Ids  in your
     *  IBM Cloud account.
     */
    inventoryId: string;
    /** Replace the inventory definition resource. */
    inventoryResourceDefinition: InventoryResourceDefinition;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `deleteInventory` operation. */
  export interface DeleteInventoryParams {
    /** Resource Inventory Id.  Use GET /inventories API to look up the Resource Inventory definition Ids  in your
     *  IBM Cloud account.
     */
    inventoryId: string;
    /** Equivalent to -force options in the command line. */
    force?: boolean;
    /** Auto propagate the chaange or deletion to the dependent resources. */
    propagate?: boolean;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `updateInventory` operation. */
  export interface UpdateInventoryParams {
    /** Resource Inventory Id.  Use GET /inventories API to look up the Resource Inventory definition Ids  in your
     *  IBM Cloud account.
     */
    inventoryId: string;
    /** Update the resource inventory definition. */
    inventoryResourceDefinition: InventoryResourceDefinition;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listResourceQuery` operation. */
  export interface ListResourceQueryParams {
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
     *  owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is
     *  ascending)   Ignore unrecognized or unsupported sort field.
     */
    sort?: string;
    /** Level of details returned by the get method. */
    profile?: ListResourceQueryConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `listResourceQuery` operation. */
  export namespace ListResourceQueryConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `createResourceQuery` operation. */
  export interface CreateResourceQueryParams {
    /** Create a resource query definition. */
    resourceQueryDefinition: ResourceQueryDefinition;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getResourcesQuery` operation. */
  export interface GetResourcesQueryParams {
    /** Resource query Id.  Use GET /resource_query API to look up the Resource query definition Ids  in your IBM
     *  Cloud account.
     */
    queryId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `replaceResourcesQuery` operation. */
  export interface ReplaceResourcesQueryParams {
    /** Resource query Id.  Use GET /resource_query API to look up the Resource query definition Ids  in your IBM
     *  Cloud account.
     */
    queryId: string;
    /** Replace the resources query definition. */
    resourceQueryDefinition: ResourceQueryDefinition;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `executeResourceQuery` operation. */
  export interface ExecuteResourceQueryParams {
    /** Resource query Id.  Use GET /resource_query API to look up the Resource query definition Ids  in your IBM
     *  Cloud account.
     */
    queryId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `deleteResourcesQuery` operation. */
  export interface DeleteResourcesQueryParams {
    /** Resource query Id.  Use GET /resource_query API to look up the Resource query definition Ids  in your IBM
     *  Cloud account.
     */
    queryId: string;
    /** Equivalent to -force options in the command line. */
    force?: boolean;
    /** Auto propagate the chaange or deletion to the dependent resources. */
    propagate?: boolean;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getDatasetVariableValue` operation. */
  export interface GetDatasetVariableValueParams {
    /** Shared dataset Id.  Use GET /datasets API to look up the Shared dataset Ids  in your IBM Cloud account. */
    datasetId: string;
    /** Name of the variable. */
    varName: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getCredentialVariableValue` operation. */
  export interface GetCredentialVariableValueParams {
    /** Credentials Id.  Use GET /credentials API to look up the Credentials Ids  in your IBM Cloud account. */
    credsId: string;
    /** Name of the variable. */
    varName: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getInventoryVariableValue` operation. */
  export interface GetInventoryVariableValueParams {
    /** Resource Inventory Id.  Use GET /inventories API to look up the Resource Inventory definition Ids  in your
     *  IBM Cloud account.
     */
    inventoryId: string;
    /** Name of the variable. */
    varName: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getWorkspaceInputValue` operation. */
  export interface GetWorkspaceInputValueParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Name of the variable. */
    varName: string;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getWorkspaceOutputValue` operation. */
  export interface GetWorkspaceOutputValueParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Name of the variable. */
    varName: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getWorkspaceSettingsValue` operation. */
  export interface GetWorkspaceSettingsValueParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Name of the variable. */
    varName: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getWorkspaceTemplateInputValue` operation. */
  export interface GetWorkspaceTemplateInputValueParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the  Template Ids in your
     *  Workspaces.
     */
    templateId: string;
    /** Name of the variable. */
    varName: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getWorkspaceTemplateOutputValue` operation. */
  export interface GetWorkspaceTemplateOutputValueParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the  Template Ids in your
     *  Workspaces.
     */
    templateId: string;
    /** Name of the variable. */
    varName: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getWorkspaceTemplateSettingValue` operation. */
  export interface GetWorkspaceTemplateSettingValueParams {
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Template Id.  Use GET /workspaces/<workspace_id>/templates API to look up the  Template Ids in your
     *  Workspaces.
     */
    templateId: string;
    /** Name of the variable. */
    varName: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getJobWorkspaceInputValue` operation. */
  export interface GetJobWorkspaceInputValueParams {
    /** Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account. */
    jobId: string;
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Name of the variable. */
    varName: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getJobWorkspaceOutputValue` operation. */
  export interface GetJobWorkspaceOutputValueParams {
    /** Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account. */
    jobId: string;
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Name of the variable. */
    varName: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getJobWorkspaceSettingValue` operation. */
  export interface GetJobWorkspaceSettingValueParams {
    /** Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account. */
    jobId: string;
    /** Workspace Id.  Use GET /workspaces API to look up the Workspace Ids in your IBM Cloud account. */
    workspaceId: string;
    /** Name of the variable. */
    varName: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listTriggers` operation. */
  export interface ListTriggersParams {
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
     *  owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is
     *  ascending)   Ignore unrecognized or unsupported sort field.
     */
    sort?: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `createTrigger` operation. */
  export interface CreateTriggerParams {
    /** Register a Scheduling or Action Trigger with Schematics. */
    trigger: Trigger;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getTrigger` operation. */
  export interface GetTriggerParams {
    /** Id of the Schematics trigger. */
    triggerId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `replaceTrigger` operation. */
  export interface ReplaceTriggerParams {
    /** Id of the Schematics trigger. */
    triggerId: string;
    /** Replace the Schematics trigger. */
    trigger: Trigger;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `deleteTrigger` operation. */
  export interface DeleteTriggerParams {
    /** Id of the Schematics trigger. */
    triggerId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listWebhook` operation. */
  export interface ListWebhookParams {
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
     *  owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is
     *  ascending)   Ignore unrecognized or unsupported sort field.
     */
    sort?: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `createWebhook` operation. */
  export interface CreateWebhookParams {
    /** Register a Web-hook or callback (pre- & post-  actions, such as initialise, redeploy, reconfigure, refresh)
     *  with Schematics.
     */
    webHook: WebHook;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getWebhook` operation. */
  export interface GetWebhookParams {
    /** Id of the Schematics web-hook. */
    hookId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `replaceWebhook` operation. */
  export interface ReplaceWebhookParams {
    /** Id of the Schematics web-hook. */
    hookId: string;
    /** Replace the Schematics web-hook. */
    webHook: WebHook;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `deleteWebhook` operation. */
  export interface DeleteWebhookParams {
    /** Id of the Schematics web-hook. */
    hookId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getPrivateCluster` operation. */
  export interface GetPrivateClusterParams {
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `createPrivateCluster` operation. */
  export interface CreatePrivateClusterParams {
    /** Register your private cluster with Schematics to run the jobs. */
    privateCluster: PrivateCluster;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `deletePrivateCluster` operation. */
  export interface DeletePrivateClusterParams {
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listAdapter` operation. */
  export interface ListAdapterParams {
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
     *  owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is
     *  ascending)   Ignore unrecognized or unsupported sort field.
     */
    sort?: string;
    /** Level of details returned by the get method. */
    profile?: ListAdapterConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `listAdapter` operation. */
  export namespace ListAdapterConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `createAdapter` operation. */
  export interface CreateAdapterParams {
    /** Adapter Register Request. */
    adapter: Adapter;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getAdapter` operation. */
  export interface GetAdapterParams {
    /** Id of the Schematics Adapter. */
    adapterId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `replaceAdapter` operation. */
  export interface ReplaceAdapterParams {
    /** Id of the Schematics Adapter. */
    adapterId: string;
    /** Replace the Schematics Adapter definition. */
    adapter: Adapter;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `deleteAdapter` operation. */
  export interface DeleteAdapterParams {
    /** Id of the Schematics Adapter. */
    adapterId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listConnection` operation. */
  export interface ListConnectionParams {
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
     *  owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is
     *  ascending)   Ignore unrecognized or unsupported sort field.
     */
    sort?: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `createConnection` operation. */
  export interface CreateConnectionParams {
    /** Register a new connection. */
    connection: Connection;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listDatasources` operation. */
  export interface ListDatasourcesParams {
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
     *  owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is
     *  ascending)   Ignore unrecognized or unsupported sort field.
     */
    sort?: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `createDatasource` operation. */
  export interface CreateDatasourceParams {
    /** Register a datasource. */
    datasource: Datasource;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listCart` operation. */
  export interface ListCartParams {
    /** Short name of the IBM Cloud service. */
    service: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `createCartOrder` operation. */
  export interface CreateCartOrderParams {
    /** Create fulfilment job order for the cart. */
    cartOrder: CartOrder;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getCartOrder` operation. */
  export interface GetCartOrderParams {
    /** Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM Cloud account. */
    orderId: string;
    /** Level of details returned by the get method. */
    profile?: GetCartOrderConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `getCartOrder` operation. */
  export namespace GetCartOrderConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `replaceCartOrder` operation. */
  export interface ReplaceCartOrderParams {
    /** Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM Cloud account. */
    orderId: string;
    /** The name of fulfilment job operation (install, uninstall, configure, operate). */
    operation: string;
    /** Update the fulfilment job order and run the job. */
    cartOrder: CartOrder;
    /** Level of details returned by the get method. */
    profile?: ReplaceCartOrderConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `replaceCartOrder` operation. */
  export namespace ReplaceCartOrderConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `runFulfilmentOperation` operation. */
  export interface RunFulfilmentOperationParams {
    /** Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM Cloud account. */
    orderId: string;
    /** The name of fulfilment job operation (install, uninstall, configure, operate). */
    operation: string;
    /** Level of details returned by the get method. */
    profile?: RunFulfilmentOperationConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `runFulfilmentOperation` operation. */
  export namespace RunFulfilmentOperationConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `deleteCartOrder` operation. */
  export interface DeleteCartOrderParams {
    /** Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM Cloud account. */
    orderId: string;
    /** Level of details returned by the get method. */
    profile?: DeleteCartOrderConstants.Profile | string;
    /** Destroy the resources before deleting the fulfilment job order (default=true). */
    destroy?: boolean;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `deleteCartOrder` operation. */
  export namespace DeleteCartOrderConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `updateCartOrder` operation. */
  export interface UpdateCartOrderParams {
    /** Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM Cloud account. */
    orderId: string;
    /** Update the fulfilment job order. */
    updateCartOrder: UpdateCartOrder;
    /** Level of details returned by the get method. */
    profile?: UpdateCartOrderConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `updateCartOrder` operation. */
  export namespace UpdateCartOrderConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `getCartMetadata` operation. */
  export interface GetCartMetadataParams {
    /** Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM Cloud account. */
    orderId: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listCartResources` operation. */
  export interface ListCartResourcesParams {
    /** Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM Cloud account. */
    orderId: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listCartOrderJobs` operation. */
  export interface ListCartOrderJobsParams {
    /** Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM Cloud account. */
    orderId: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getCartOrderJob` operation. */
  export interface GetCartOrderJobParams {
    /** Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM Cloud account. */
    orderId: string;
    /** Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account. */
    jobId: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getCartOrderJobLog` operation. */
  export interface GetCartOrderJobLogParams {
    /** Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM Cloud account. */
    orderId: string;
    /** Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account. */
    jobId: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getCartOrderJobResources` operation. */
  export interface GetCartOrderJobResourcesParams {
    /** Fulfilment job order Id.  Use GET /cart API to look up the order ids in your IBM Cloud account. */
    orderId: string;
    /** Job Id. Use GET /jobs API to look up the Job Ids in your IBM Cloud account. */
    jobId: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listEnvironmentDefinitions` operation. */
  export interface ListEnvironmentDefinitionsParams {
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** Catalog ID to get the list of environments defined as part of offerings. */
    catalogId?: string;
    /** Catalog Name to get the list of environments defined as part of offerings. */
    catalogName?: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getEnvironmentDefinition` operation. */
  export interface GetEnvironmentDefinitionParams {
    /** Catalog ID to get the list of environments defined as part of offerings. */
    offeringId: string;
    /** Catalog ID to get the list of environments defined as part of offerings. */
    catalogId?: string;
    /** Catalog Name to get the list of environments defined as part of offerings. */
    catalogName?: string;
    /** Offering Name to get the list of environments defined as part of offerings. */
    offeringName?: string;
    /** Version of the offering. */
    offeringVersion?: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listEnvironment` operation. */
  export interface ListEnvironmentParams {
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `createEnvironment` operation. */
  export interface CreateEnvironmentParams {
    /** Create environment. */
    environment: Environment;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getEnvironment` operation. */
  export interface GetEnvironmentParams {
    /** Environment Id.  Use GET /environments API to look up the order ids in your IBM Cloud account. */
    environmentId: string;
    /** Level of details returned by the get method. */
    profile?: GetEnvironmentConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `getEnvironment` operation. */
  export namespace GetEnvironmentConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `replaceEnvironment` operation. */
  export interface ReplaceEnvironmentParams {
    /** Environment Id.  Use GET /environments API to look up the order ids in your IBM Cloud account. */
    environmentId: string;
    /** Update the environment details. */
    environment: Environment;
    /** Level of details returned by the get method. */
    profile?: ReplaceEnvironmentConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `replaceEnvironment` operation. */
  export namespace ReplaceEnvironmentConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `deleteEnvironment` operation. */
  export interface DeleteEnvironmentParams {
    /** Environment Id.  Use GET /environments API to look up the order ids in your IBM Cloud account. */
    environmentId: string;
    /** Level of details returned by the get method. */
    profile?: DeleteEnvironmentConstants.Profile | string;
    /** Destroy the resources before deleting the environment. */
    destroy?: boolean;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `deleteEnvironment` operation. */
  export namespace DeleteEnvironmentConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `updateEnvironment` operation. */
  export interface UpdateEnvironmentParams {
    /** Environment Id.  Use GET /environments API to look up the order ids in your IBM Cloud account. */
    environmentId: string;
    /** Update the environment details. */
    environment: Environment;
    /** Level of details returned by the get method. */
    profile?: UpdateEnvironmentConstants.Profile | string;
    headers?: OutgoingHttpHeaders;
  }

  /** Constants for the `updateEnvironment` operation. */
  export namespace UpdateEnvironmentConstants {
    /** Level of details returned by the get method. */
    export enum Profile {
      IDS = 'ids',
      SUMMARY = 'summary',
    }
  }

  /** Parameters for the `listEnvironmentWorkspaces` operation. */
  export interface ListEnvironmentWorkspacesParams {
    /** Environment Id.  Use GET /environments API to look up the order ids in your IBM Cloud account. */
    environmentId: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listEnvironmentResources` operation. */
  export interface ListEnvironmentResourcesParams {
    /** Environment Id.  Use GET /environments API to look up the order ids in your IBM Cloud account. */
    environmentId: string;
    /** The starting position of the item in the list of items. For example, if you have three workspaces in your
     *  account, the first workspace is assigned position number 0, the second workspace is assigned position number 1,
     *  and so forth. If you have 6 workspaces and you want to list the details for workspaces 2-6, enter 1. To limit
     *  the number of workspaces that is returned, use the `limit` option in addition to the `offset` option. Negative
     *  numbers are not supported and are ignored.
     */
    offset?: number;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `getKmsSettings` operation. */
  export interface GetKmsSettingsParams {
    /** The location of the Resource. */
    location: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `updateKmsSettings` operation. */
  export interface UpdateKmsSettingsParams {
    /** Options to be provided with updating kms settings. */
    kmsSettings: KMSSettings;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listKms` operation. */
  export interface ListKmsParams {
    /** The encryption scheme to be used. */
    encryptionScheme: string;
    /** The location of the Resource. */
    location: string;
    /** The resource group (by default, fetch from all resource groups). */
    resourceGroup?: string;
    /** The maximum number of items that you want to list. The number must be a positive integer between 1 and 2000.
     *  If no value is provided, 100 is used by default.
     */
    limit?: number;
    /** Name of the field to sort-by;  Use the '.' character to delineate sub-resources and sub-fields (eg.
     *  owner.last_name). Prepend the field with '+' or '-', indicating 'ascending' or 'descending' (default is
     *  ascending)   Ignore unrecognized or unsupported sort field.
     */
    sort?: string;
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `listLocations` operation. */
  export interface ListLocationsParams {
    headers?: OutgoingHttpHeaders;
  }

  /** Parameters for the `processTemplateMetaData` operation. */
  export interface ProcessTemplateMetaDataParams {
    /** Create template metadata request. */
    templateMetaDataRequest: TemplateMetaDataRequest;
    /** The personal access token associated with your GitHub or GitLab repository, required to clone the
     *  repository.
     */
    xGithubToken?: string;
    headers?: OutgoingHttpHeaders;
  }

  /*************************
   * model interfaces
   ************************/

  /** Complete Action details with user inputs and system generated data. */
  export interface Action {
    /** The unique name of your action. The name can be up to 128 characters long and can include alphanumeric
     *  characters, spaces, dashes, and underscores. **Example** you can use the name to stop action.
     */
    name?: string;
    /** Action description. */
    description?: string;
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** Resource-group name for an action.  By default, action is created in default resource group. */
    resource_group?: string;
    /** Action tags. */
    tags?: string[];
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** URL of the `README` file, for the source URL. */
    source_readme_url?: string;
    /** Source of templates, playbooks, or controls. */
    source?: ExternalSource;
    /** Type of source for the Template. */
    source_type?: string;
    /** Schematics job command parameter (playbook-name). */
    command_parameter?: string;
    /** Target inventory record ID, used by the action or ansible playbook. */
    inventory?: string;
    /** credentials of the Action. */
    credentials?: VariableData[];
    /** Describes a bastion resource. */
    bastion?: BastionResourceDefinition;
    /** User editable variable data and system generated reference to the value. */
    bastion_credential?: VariableData;
    /** Inventory of host and host group for the playbook in `INI` file format. For example, `"targets_ini":
     *  "[webserverhost] 172.22.192.6
     *   [dbhost]
     *   172.22.192.5"`. For more information, about an inventory host group syntax, see [Inventory host
     *  groups](/docs/schematics?topic=schematics-schematics-cli-reference#schematics-inventory-host-grps).
     */
    targets_ini?: string;
    /** Input variables for the Action. */
    inputs?: VariableData[];
    /** Output variables for the Action. */
    outputs?: VariableData[];
    /** Environment variables for the Action. */
    settings?: VariableData[];
    /** Action ID. */
    id?: string;
    /** Action Cloud Resource Name. */
    crn?: string;
    /** Action account ID. */
    account?: string;
    /** Action Playbook Source creation time. */
    source_created_at?: string;
    /** E-mail address of user who created the Action Playbook Source. */
    source_created_by?: string;
    /** The action playbook updation time. */
    source_updated_at?: string;
    /** E-mail address of user who updated the action playbook source. */
    source_updated_by?: string;
    /** Action creation time. */
    created_at?: string;
    /** E-mail address of the user who created an action. */
    created_by?: string;
    /** Action updation time. */
    updated_at?: string;
    /** E-mail address of the user who updated an action. */
    updated_by?: string;
    /** Computed state of the Action. */
    state?: ActionState;
    /** Playbook names retrieved from the respository. */
    playbook_names?: string[];
    /** System lock status. */
    sys_lock?: SystemLock;
    /** Action accepts additional properties. */
    [propName: string]: any;
  }

  /** List of Action definition response. */
  export interface ActionList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of action records. */
    actions?: ActionLite[];
    /** ActionList accepts additional properties. */
    [propName: string]: any;
  }

  /** Action summary profile with user inputs and system generated data. */
  export interface ActionLite {
    /** Action name (unique for an account). */
    name?: string;
    /** Action description. */
    description?: string;
    /** Action Id. */
    id?: string;
    /** Action Cloud Resource Name. */
    crn?: string;
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** Resource-group name for the Action.  By default, Action will be created in Default Resource Group. */
    resource_group?: string;
    /** name of the namespace. */
    namespace?: string;
    /** Action tags. */
    tags?: string[];
    /** Name of the selected playbook. */
    playbook_name?: string;
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** Computed state of the Action. */
    state?: ActionLiteState;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** Action creation time. */
    created_at?: string;
    /** Email address of user who created the action. */
    created_by?: string;
    /** Action updation time. */
    updated_at?: string;
    /** Email address of user who updated the action. */
    updated_by?: string;
    /** ActionLite accepts additional properties. */
    [propName: string]: any;
  }

  /** Computed state of the Action. */
  export interface ActionLiteState {
    /** Status of automation (workspace or action). */
    status_code?: string;
    /** Automation status message - to be displayed along with the status_code. */
    status_message?: string;
    /** ActionLiteState accepts additional properties. */
    [propName: string]: any;
  }

  /** Computed state of the Action. */
  export interface ActionState {
    /** Status of automation (workspace or action). */
    status_code?: string;
    /** Job id reference for this status. */
    status_job_id?: string;
    /** Automation status message - to be displayed along with the status_code. */
    status_message?: string;
    /** ActionState accepts additional properties. */
    [propName: string]: any;
  }

  /** Complete Schematics Adapter details provided by user and system generated. */
  export interface Adapter {
    /** Name of the Adapter. */
    adapter_name?: string;
    /** Type of external schematics adapters. */
    adapter_type?: string;
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** Resource-group id for the Adapter. */
    resource_group?: string;
    /** Adapter tags. */
    tags?: string[];
    /** Endpoint URL for the Adapter. */
    adapter_endpoint_url?: string;
    /** Service-ID to connect to the Adapter; if this is not provided, Schematics will used the IAM token of the
     *  user to connect to the Adapter.
     */
    service_id?: string;
    /** API Key for the Service ID. */
    apikey?: string;
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** True - Replace the Adapter definition, without waiting for completion of all inflight Schematics operations;
     *  False -  Block all new Schematics operations in the Account, and wait for inflight operations to complete -
     *  before changing the Adapter definition.
     */
    ignore_inflight_operations?: boolean;
    /** Id of the Adapter. */
    adapter_id?: string;
    /** Name of the user who registered the Adapter. */
    registered_by?: string;
    /** Timestamp of Adapter registration. */
    registered_at?: string;
    /** Adapter updation time. */
    updated_at?: string;
    /** Name of user who updated the Adapter definition. */
    updated_by?: string;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** Health of the adapter. */
    adapter_health?: string;
    /** Timestamp of the last health check. */
    last_health_checked_at?: string;
    /** Adapter accepts additional properties. */
    [propName: string]: any;
  }

  /** List of schematics adapter details. */
  export interface AdapterList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of external schematics adapters. */
    adapters?: Adapter[];
    /** AdapterList accepts additional properties. */
    [propName: string]: any;
  }

  /** Describes a bastion resource. */
  export interface BastionResourceDefinition {
    /** Bastion Name(Unique). */
    name?: string;
    /** Reference to the Inventory resource definition. */
    host?: string;
    /** BastionResourceDefinition accepts additional properties. */
    [propName: string]: any;
  }

  /** Blueprint definition - composed of multiple workitems used to construct an Environment. */
  export interface Blueprint {
    /** Name of the blueprint. */
    name?: string;
    /** Description of the blueprint. */
    description?: string;
    /** Source of templates, playbooks, or controls. */
    source?: ExternalSource;
    /** Inputs for the blueprint. */
    inputs?: VariableData[];
    /** Outputs from the blueprint. */
    outputs?: VariableData[];
    /** Settings used by the blueprint. */
    settings?: VariableData[];
    /** Workitems for the blueprint. */
    workitems?: WorkItem[];
    /** Order of execution for the Blueprint command. */
    flow?: Flow;
    /** Blueprint accepts additional properties. */
    [propName: string]: any;
  }

  /** User editable variable data & system generated reference to value. */
  export interface BlueprintVariableData {
    /** Name of the variable. */
    name?: string;
    /** Value for the variable or reference to the value. */
    value?: string;
    /** Reference link to the variable value By default the expression will point to self.value. */
    link?: string;
    /** BlueprintVariableData accepts additional properties. */
    [propName: string]: any;
  }

  /** Complete capsule definition record. */
  export interface Capsule {
    /** Name of the capsule. */
    name?: string;
    /** Capsule description. */
    description?: string;
    /** capsule type. */
    type?: string;
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** Policy package path. */
    package?: string;
    /** Severity. */
    severity?: number;
    /** Target inventory record ID, used to evaluate the policy. */
    inventory?: string;
    /** Id to the Trigger. */
    trigger_record_id?: string;
    /** List of Job Triggers. */
    job_triggers?: TriggerJob[];
    /** List of Scheduled Triggers. */
    scheduled_triggers?: TriggerScheduled[];
    /** Input data for the capsule. */
    inputs?: VariableData[];
    /** List of decisions. */
    decisions?: ControlsDecision[];
    /** List of escalations. */
    escalations?: ControlsEscalation[];
    /** Capsule Id. */
    id?: string;
    /** Capsule status. */
    status?: string;
    /** Controls Id. */
    controls_id?: string;
    /** Controls name. */
    controls_name?: string;
    /** Control policy creation time. */
    created_at?: string;
    /** Name of user who created the control policy. */
    created_by?: string;
    /** Control policy updation time. */
    updated_at?: string;
    /** Name of user who updated the control policy. */
    updated_by?: string;
    /** Computed state of the Controls. */
    state?: ControlsLiteState;
    /** Capsule Job data. */
    last_job_data?: JobDataCapsule;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** Capsule accepts additional properties. */
    [propName: string]: any;
  }

  /** List of Capsule definitions response. */
  export interface CapsuleList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of capsule records. */
    capsules?: CapsuleLite[];
    /** CapsuleList accepts additional properties. */
    [propName: string]: any;
  }

  /** Capsule summary profile with user inputs and system generated data. */
  export interface CapsuleLite {
    /** Capsule name (unique for an account). */
    name?: string;
    /** Capsule description. */
    description?: string;
    /** Capsule Id. */
    id?: string;
    /** Capsule Cloud Resource Name. */
    crn?: string;
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** Resource-group name for the Capsule.  By default, Capsule will be created in Default Resource Group. */
    resource_group?: string;
    /** Capsule tags. */
    tags?: string[];
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** Computed state of the Capsule. */
    state?: CapsuleLiteState;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** Capsule creation time. */
    created_at?: string;
    /** Email address of user who created the Capsule. */
    created_by?: string;
    /** Capsule updation time. */
    updated_at?: string;
    /** Email address of user who updated the Capsule. */
    updated_by?: string;
    /** CapsuleLite accepts additional properties. */
    [propName: string]: any;
  }

  /** Computed state of the Capsule. */
  export interface CapsuleLiteState {
    /** Status of automation (workspace or action). */
    status_code?: string;
    /** Automation status message - to be displayed along with the status_code. */
    status_message?: string;
    /** CapsuleLiteState accepts additional properties. */
    [propName: string]: any;
  }

  /** List of capsule evidences. */
  export interface CapsuleResultEvidences {
    /** List of resources. */
    resources?: CapsuleResultResources[];
    /** CapsuleResultEvidences accepts additional properties. */
    [propName: string]: any;
  }

  /** Resource details. */
  export interface CapsuleResultResources {
    /** Name of the resource. */
    name?: string;
    /** Type of resource. */
    type?: string;
    /** CapsuleResultResources accepts additional properties. */
    [propName: string]: any;
  }

  /** Complete Cart order details with user inputs and system generated data. */
  export interface CartOrder {
    /** Cart order name (unique for an account). */
    name: string;
    /** Cart order description. */
    description?: string;
    /** Cart order tags. */
    tags?: string[];
    cart_items?: OrderItemConfiguration[];
    /** Service short name. */
    service_name?: string;
    /** Resource-group name for the Cart order.  By default, Cart order will be created in Default Resource Group. */
    resource_group?: string;
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** User defined status of the Schematics object. */
    user_state?: CartOrderUserState;
    /** System generated Cart order Id. */
    cart_order_id?: string;
    /** Cart order CRN. */
    crn?: string;
    /** Account id. */
    account?: string;
    /** Cart order creation time. */
    created_at?: string;
    /** Email address of user who created the Cart order. */
    created_by?: string;
    /** Cart order updation time. */
    updated_at?: string;
    /** Email address of user who updated the Cart order. */
    updated_by?: string;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** Computed state of the CartOrder. */
    state?: CartOrderLiteState;
    /** CartOrder accepts additional properties. */
    [propName: string]: any;
  }

  /** List of Cart orders. */
  export interface CartOrderList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of Cart order records. */
    cart?: CartOrderLite[];
    /** CartOrderList accepts additional properties. */
    [propName: string]: any;
  }

  /** Cart order summary profile. */
  export interface CartOrderLite {
    /** Cart order name (unique for an account). */
    name: string;
    /** Cart order description. */
    description?: string;
    /** Service short name. */
    service_name?: string;
    /** Resource-group name for the Cart order.  By default, Cart order will be created in Default Resource Group. */
    resource_group?: string;
    /** Cart order tags. */
    tags?: string[];
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** System generated cart order Id. */
    id?: string;
    /** Cart order CRN. */
    crn?: string;
    /** Account id. */
    account?: string;
    /** Cart order creation time. */
    created_at?: string;
    /** Email address of user who created the Cart order. */
    created_by?: string;
    /** Cart order updation time. */
    updated_at?: string;
    /** Email address of user who updated the Cart order. */
    updated_by?: string;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** User defined status of the Schematics object. */
    user_state?: CartOrderUserState;
    /** Computed state of the CartOrder. */
    state?: CartOrderLiteState;
    /** CartOrderLite accepts additional properties. */
    [propName: string]: any;
  }

  /** Computed state of the CartOrder. */
  export interface CartOrderLiteState {
    /** Status of automation (workspace or action). */
    status_code?: string;
    /** Automation status message - to be displayed along with the status_code. */
    status_message?: string;
    /** CartOrderLiteState accepts additional properties. */
    [propName: string]: any;
  }

  /** User defined status of the Schematics object. */
  export interface CartOrderUserState {
    /** User-defined states
     *    * `Order_Create_Init` When Create Order POST API is invoked and CreateOrder process is initiated.
     *    * `Order_Create_InProgress` When CreateOrder process is in progress.
     *    * `Order_Create_Success` Repos are downloaded and underlying objects are created
     *    * `Order_Create_Failed` Failed to create CartOrder or underlying schematics objects
     *    * `Order_Fulfilment_Pending` Fulfilment operation is triggered and waiting to be picked up by orchestrator.
     *    * `Order_Fulfilment_InProgress` Actively processing fulfilment operation
     *    * `Order_Fulfilment_Success` Fulfilment successful
     *    * `Order_Fulfilment_Failed` Fulfilment failed.
     */
    state?: string;
    /** Name of the User who set the state of the Object. */
    set_by?: string;
    /** When the User who set the state of the Object. */
    set_at?: string;
    /** CartOrderUserState accepts additional properties. */
    [propName: string]: any;
  }

  /** Cloud resource data. */
  export interface CloudResource {
    /** Cloud resource id. */
    resource_id?: string;
    /** Cloud resource name. */
    cloud_resource_name?: string;
    /** Terraform cloud resource name. */
    terraform_resource_name?: string;
    /** Cloud resource CRN (if applicable). */
    crn?: string;
    /** State of the Cloud resource. */
    resource_state?: string;
    /** Cloud resource tags. */
    tags?: string[];
    /** CloudResource accepts additional properties. */
    [propName: string]: any;
  }

  /** List of cloud resources. */
  export interface CloudResourceList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of cloud resource details. */
    outputs?: CloudResource[];
    /** CloudResourceList accepts additional properties. */
    [propName: string]: any;
  }

  /** List of Schematics commands. */
  export interface CommandList {
    /** List of Schematics command names and parameters. */
    commands?: CommandListCommands[];
    /** CommandList accepts additional properties. */
    [propName: string]: any;
  }

  /** CommandListCommands. */
  export interface CommandListCommands {
    /** Schematics job command name. */
    command_name?: string;
    /** Schematics job command parameter (playbook-name, capsule-name or flow-name). */
    command_parameter?: string;
    /** CommandListCommands accepts additional properties. */
    [propName: string]: any;
  }

  /** Environment configuration item used as input for the blueprint. */
  export interface ConfigItem {
    /** Name of the environment configuration item. */
    name?: string;
    /** Description for the environment configuration item. */
    description?: string;
    /** Source of templates, playbooks, or controls. */
    source?: ExternalSource;
    /** Input variables and values for the environment configuration item. */
    inputs?: BlueprintVariableData[];
    /** ConfigItem accepts additional properties. */
    [propName: string]: any;
  }

  /** External connection definition with unique id. */
  export interface Connection {
    /** connection name (unique for an account). */
    name?: string;
    /** connection description. */
    description?: string;
    /** Resource-group id for the connection. */
    resource_group?: string;
    /** connection tags. */
    tags?: string[];
    /** Source of templates, playbooks, or controls. */
    connection_details?: ExternalSource;
    /** Secrets used to connect to external source. */
    connection_secrets?: ConnectionSecret;
    /** Generated connection id. */
    id?: string;
    /** account id. */
    account?: string;
    /** connection creation time. */
    created_at?: string;
    /** Email address of user who created the connection. */
    created_by?: string;
    /** connection updation time. */
    updated_at?: string;
    /** Email address of user who updated the connection. */
    updated_by?: string;
    /** Connection accepts additional properties. */
    [propName: string]: any;
  }

  /** List of external onnection definition. */
  export interface ConnectionList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of datasource records. */
    connections?: ConnectionLite[];
    /** ConnectionList accepts additional properties. */
    [propName: string]: any;
  }

  /** External connection definition required to connect external services. */
  export interface ConnectionLite {
    /** Connection name (unique for an account). */
    name?: string;
    /** Resource-group id for the connection. */
    resource_group?: string;
    /** connection tags. */
    tags?: string[];
    /** supported list of external services. */
    source_type?: string;
    /** Generated connection id. */
    id?: string;
    /** connection creation time. */
    created_at?: string;
    /** Email address of user who created the connection. */
    created_by?: string;
    /** connection updation time. */
    updated_at?: string;
    /** Email address of user who updated the connection. */
    updated_by?: string;
    /** ConnectionLite accepts additional properties. */
    [propName: string]: any;
  }

  /** Secrets used to connect to external source. */
  export interface ConnectionSecret {
    /** Type of the credential. */
    type?: string;
    /** Connection details to IBM Cloud COS source. */
    apikey?: ConnectionSecretApikey;
    /** ConnectionSecret accepts additional properties. */
    [propName: string]: any;
  }

  /** Connection details to IBM Cloud COS source. */
  export interface ConnectionSecretApikey {
    /** API key. */
    key?: string;
    /** ConnectionSecretApikey accepts additional properties. */
    [propName: string]: any;
  }

  /** Complete Controls definition with user input and system generated data. */
  export interface Controls {
    /** Controls name (unique for an account). */
    name?: string;
    /** Controls type. */
    type?: string;
    /** Control description. */
    description?: string;
    /** Resource-group name for the Controls. By default, controls will be created in Default Resource Group. */
    resource_group?: string;
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** Tags for the Controls definition. */
    tags?: string[];
    /** URL of the Readme file, for the source. */
    source_readme_url?: string;
    /** Source of templates, playbooks, or controls. */
    source?: ExternalSource;
    /** Type of source for the Template. */
    source_type?: string;
    /** Input variables for the Controls. */
    inputs?: VariableData[];
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** Controls Id. */
    id?: string;
    /** Controls Cloud Resource Name. */
    crn?: string;
    /** Controls Source creation time. */
    source_created_at?: string;
    /** Email address of user who created the Controls Source. */
    source_created_by?: string;
    /** Controls Source updation time. */
    source_updated_at?: string;
    /** Email address of user who updated the Controls Source. */
    source_updated_by?: string;
    /** Controls creation time. */
    created_at?: string;
    /** Name of user who created the controls. */
    created_by?: string;
    /** Controls updation time. */
    updated_at?: string;
    /** Name of user who updated the controls. */
    updated_by?: string;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** List of capsules. */
    capsules?: Capsule[];
    /** Controls accepts additional properties. */
    [propName: string]: any;
  }

  /** Policy ControlsDecision definition. */
  export interface ControlsDecision {
    /** ControlsDecision rules. */
    rule?: string;
    /** Pass value. */
    pass_value?: string;
    /** Pass expression. */
    pass_expr?: string;
    /** Evidence found in. */
    evidence_found_in?: string;
    /** ControlsDecision accepts additional properties. */
    [propName: string]: any;
  }

  /** ControlsEscalation definition. */
  export interface ControlsEscalation {
    /** ControlsEscalation details (placeholder). */
    action_id?: string;
    /** ControlsEscalation accepts additional properties. */
    [propName: string]: any;
  }

  /** List of Controls definition response. */
  export interface ControlsList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of control records. */
    controls?: ControlsLite[];
    /** ControlsList accepts additional properties. */
    [propName: string]: any;
  }

  /** Controls summary profile with user inputs and system generated data. */
  export interface ControlsLite {
    /** Controls name (unique for an account). */
    name?: string;
    /** Controls description. */
    description?: string;
    /** Controls Id. */
    id?: string;
    /** Controls Cloud Resource Name. */
    crn?: string;
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** Resource-group name for the Controls.  By default, Controls will be created in Default Resource Group. */
    resource_group?: string;
    /** Controls tags. */
    tags?: string[];
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** Computed state of the Controls. */
    state?: ControlsLiteState;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** Controls creation time. */
    created_at?: string;
    /** Email address of user who created the Controls. */
    created_by?: string;
    /** Controls updation time. */
    updated_at?: string;
    /** Email address of user who updated the Controls. */
    updated_by?: string;
    /** ControlsLite accepts additional properties. */
    [propName: string]: any;
  }

  /** Computed state of the Controls. */
  export interface ControlsLiteState {
    /** Status of automation (workspace or action). */
    status_code?: string;
    /** Automation status message - to be displayed along with the status_code. */
    status_message?: string;
    /** ControlsLiteState accepts additional properties. */
    [propName: string]: any;
  }

  /** List of credential definition response. */
  export interface CredentialList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of credential records. */
    credentials?: CredentialsetLite[];
    /** CredentialList accepts additional properties. */
    [propName: string]: any;
  }

  /** Complete Credential details. */
  export interface Credentialset {
    /** Credential name (unique for an account). */
    name?: string;
    /** Credential description. */
    description?: string;
    /** Resource-group id for the Credential. */
    resource_group?: string;
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** Credential tags. */
    tags?: string[];
    /** Local credentials. */
    data?: VariableData[];
    /** Reference to Connection ID. */
    source_connection?: string;
    /** Source of templates, playbooks, or controls. */
    source?: ExternalSource;
    /** Type of source for the Template. */
    source_type?: string;
    /** Type of link with credentials repo. */
    source_link?: string;
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** True - On successful credentials updation, propagate the change to all the dependent Schematics resource. */
    auto_propagate_change?: boolean;
    /** Replicate the data locally or not. */
    replica_enabled?: boolean;
    /** Replication frequency. */
    replica_invalidation_frequency?: string;
    /** Credential Id. */
    credential_id?: string;
    /** Account id. */
    account?: string;
    /** Credential creation time. */
    created_at?: string;
    /** Name of user who created the credential. */
    created_by?: string;
    /** Credential updation time. */
    updated_at?: string;
    /** Name of user who updated the credential. */
    updated_by?: string;
    /** List of resouce-ids (Workspace, Action, Controls) that are impacted by the change in credentials. */
    affected_resource_ids?: string[];
    /** Credentialset accepts additional properties. */
    [propName: string]: any;
  }

  /** Profile details of the credentials. */
  export interface CredentialsetLite {
    /** Credential name (unique for an account). */
    name?: string;
    /** Credential description. */
    description?: string;
    /** Credential Id. */
    credential_id?: string;
    /** Resource-group id for the Credential. */
    resource_group?: string;
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** Credential tags. */
    tags?: string[];
    /** Type of source for the Template. */
    source_type?: string;
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** Credential creation time. */
    created_at?: string;
    /** Name of user who created the credential. */
    created_by?: string;
    /** Credential updation time. */
    updated_at?: string;
    /** Name of user who updated the credential. */
    updated_by?: string;
    /** CredentialsetLite accepts additional properties. */
    [propName: string]: any;
  }

  /** Complete details of the Dataset record. */
  export interface Dataset {
    /** Shared dataset name (unique for an account). */
    name?: string;
    /** Dataset types. */
    type?: string;
    /** Shared dataset description. */
    description?: string;
    /** Resource-group id for the shared dataset. */
    resource_group?: string;
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** Shared dataset tags. */
    tags?: string[];
    /** Local shared dataset. */
    data?: VariableData[];
    /** Source of templates, playbooks, or controls. */
    source?: ExternalSource;
    /** Type of source for the Template. */
    source_type?: string;
    /** Type of link with shared dataset repo. */
    source_link?: string;
    /** URL of the Readme file, for the source. */
    source_readme_url?: string;
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** True - On successful shared dataset updation, propagate the change to all the dependent Workspaces. */
    auto_propagate_change?: boolean;
    /** Dataset Id. */
    dataset_id?: string;
    /** Account id. */
    account?: string;
    /** Dataset creation time. */
    created_at?: string;
    /** Name of user who created the shared dataset. */
    created_by?: string;
    /** Dataset updation time. */
    updated_at?: string;
    /** Name of user who updated the shared dataset. */
    updated_by?: string;
    /** List of resouce-ids (Workspace, Action, Controls) that are impacted by the change in shared dataset values. */
    affected_resource_ids?: string[];
    /** Dataset accepts additional properties. */
    [propName: string]: any;
  }

  /** List of dataset definition response. */
  export interface DatasetList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of dataset records. */
    datasets?: DatasetLite[];
    /** DatasetList accepts additional properties. */
    [propName: string]: any;
  }

  /** Summary Profile of the Dataset. */
  export interface DatasetLite {
    /** Dataset name (unique for an account). */
    name?: string;
    /** Dataset Id. */
    dataset_id?: string;
    /** Dataset types. */
    type?: string;
    /** Dataset description. */
    description?: string;
    /** Resource-group id for the shared dataset. */
    resource_group?: string;
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** Dataset tags. */
    tags?: string[];
    /** Type of source for the Template. */
    source_type?: string;
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** Dataset creation time. */
    created_at?: string;
    /** Name of user who created the shared dataset. */
    created_by?: string;
    /** Dataset updation time. */
    updated_at?: string;
    /** Name of user who updated the dataset. */
    updated_by?: string;
    /** DatasetLite accepts additional properties. */
    [propName: string]: any;
  }

  /** External datasource definition. */
  export interface Datasource {
    /** External data source name (unique for an account). */
    name?: string;
    /** data source description. */
    description?: string;
    /** Resource-group id for the data source. */
    resource_group?: string;
    /** data source tags. */
    tags?: string[];
    /** supported list of external services. */
    source_type?: string;
    /** source name or id like file name or object id. */
    data_source?: string;
    /** Named connection from settings. */
    connection?: string;
    /** Replicate the data locally or not. */
    replica_enabled?: boolean;
    /** Replication frequency. */
    replica_invalidation_frequency?: string;
    /** Generated datasource id. */
    id?: string;
    /** account id. */
    account?: string;
    /** datasource creation time. */
    created_at?: string;
    /** Email address of user who created the datasource. */
    created_by?: string;
    /** datasource updation time. */
    updated_at?: string;
    /** Email address of user who updated the datasource. */
    updated_by?: string;
    /** Datasource accepts additional properties. */
    [propName: string]: any;
  }

  /** List of external datasource definition. */
  export interface DatasourceList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of data source records. */
    datasources?: DatasourceLite[];
    /** DatasourceList accepts additional properties. */
    [propName: string]: any;
  }

  /** User editable datasource details. */
  export interface DatasourceLite {
    /** data source name (unique for an account). */
    name?: string;
    /** data source description. */
    description?: string;
    /** Resource-group id for the data source. */
    resource_group?: string;
    /** data source tags. */
    tags?: string[];
    /** source name or id like file name or object id. */
    data_source?: string;
    /** Named connection from settings. */
    connection?: string;
    /** Generated datasource id. */
    id?: string;
    /** datasource creation time. */
    created_at?: string;
    /** Email address of user who created the datasource. */
    created_by?: string;
    /** datasource updation time. */
    updated_at?: string;
    /** Email address of user who updated the datasource. */
    updated_by?: string;
    /** DatasourceLite accepts additional properties. */
    [propName: string]: any;
  }

  /** Environment details with user inputs and system generated data. */
  export interface Environment {
    /** Environment name (unique for an account). */
    name: string;
    /** Schema version. */
    schema_version?: string;
    /** Source of templates, playbooks, or controls. */
    source?: ExternalSource;
    /** Environment description. */
    description?: string;
    /** Resource-group name for the Environment.  By default, Environment will be created in Default Resource Group. */
    resource_group?: string;
    /** Environment instance tags. */
    tags?: string[];
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** Blueprint definition - composed of multiple workitems used to construct an Environment. */
    blueprint?: Blueprint;
    /** Environment configuration definition - used by the blueprint to construct an Environment. */
    config?: ConfigItem[];
    /** Input configuration for the environment instance. */
    inputs?: VariableData[];
    /** Input environment variables. */
    settings?: VariableData[];
    /** Output environment variables. */
    outputs?: VariableData[];
    /** System generated Environment Id. */
    environment_id?: string;
    /** Environment CRN. */
    crn?: string;
    /** Account id. */
    account?: string;
    /** Environment creation time. */
    created_at?: string;
    /** User who created the Environment. */
    created_by?: string;
    /** Environment updation time. */
    updated_at?: string;
    /** User who updated the Environment. */
    updated_by?: string;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** User defined status of the Environment. */
    user_state?: EnvironmentUserState;
    /** Computed state of the Environment. */
    state?: EnvironmentState;
    /** Environment accepts additional properties. */
    [propName: string]: any;
  }

  /** Catalog offering of environment kind. */
  export interface EnvironmentCatalogOfferingItem {
    /** Catalog offering item name. */
    name?: string;
    /** Catalog offering item label name. */
    label?: string;
    /** Offering Id. */
    offering_id?: string;
    short_description?: string;
    /** CRN of the catalog item. */
    crn?: string;
    /** Offering url. */
    offering_url?: string;
    /** Offering version. */
    versions?: EnvironmentCatalogOfferingItemVersions[];
    /** EnvironmentCatalogOfferingItem accepts additional properties. */
    [propName: string]: any;
  }

  /** EnvironmentCatalogOfferingItemVersions. */
  export interface EnvironmentCatalogOfferingItemVersions {
    version?: string;
    versionid?: string;
    /** EnvironmentCatalogOfferingItemVersions accepts additional properties. */
    [propName: string]: any;
  }

  /** List of Environments. */
  export interface EnvironmentList {
    /** Total number of Environment records. */
    total_count?: number;
    /** Number of Environment records returned. */
    limit: number;
    /** Skipped number of Environment records. */
    offset: number;
    /** List of Environments. */
    environments?: EnvironmentLite[];
    /** EnvironmentList accepts additional properties. */
    [propName: string]: any;
  }

  /** Environment summary profile. */
  export interface EnvironmentLite {
    /** Environment name (unique for an account). */
    name: string;
    /** Environment description. */
    description?: string;
    /** Resource-group name for the Environment.  By default, Environment will be created in Default Resource Group. */
    resource_group?: string;
    /** Environment tags. */
    tags?: string[];
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** System generated Environment Id. */
    id?: string;
    /** Environment CRN. */
    crn?: string;
    /** Account id for the Environment. */
    account?: string;
    /** Environment creation time. */
    created_at?: string;
    /** User who created the Cart order. */
    created_by?: string;
    /** Environment updation time. */
    updated_at?: string;
    /** User who updated the Cart order. */
    updated_by?: string;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** User defined status of the Environment. */
    user_state?: EnvironmentUserState;
    /** Computed state of the Environment. */
    state?: EnvironmentState;
    /** EnvironmentLite accepts additional properties. */
    [propName: string]: any;
  }

  /** User defined status of the Environment. */
  export interface EnvironmentUserState {
    /** User-defined states
     *    * `Environment_Create_Init` When Create Environment POST API is invoked and CreateEnvironment process is
     *  initiated.
     *    * `Environment_Create_InProgress` When Create Environment process is in progress.
     *    * `Environment_Create_Success` Repos are downloaded and underlying objects are created
     *    * `Environment_Create_Failed` Failed to create Environment or underlying schematics objects.
     */
    state?: string;
    /** User who set the state of the Environment. */
    set_by?: string;
    /** When the User who set the state of the Environment. */
    set_at?: string;
    /** EnvironmentUserState accepts additional properties. */
    [propName: string]: any;
  }

  /** Computed state of the Environment. */
  export interface EnvironmentState {
    /** Status of automation (workspace or action). */
    status_code?: string;
    /** Automation status message - to be displayed along with the status_code. */
    status_message?: string;
    /** EnvironmentState accepts additional properties. */
    [propName: string]: any;
  }

  /** Source of templates, playbooks, or controls. */
  export interface ExternalSource {
    /** Type of source for the Template. */
    source_type: string;
    /** The connection details to the Git source repository. */
    git?: ExternalSourceGit;
    /** The connection details to the IBM Cloud Catalog source. */
    catalog?: ExternalSourceCatalog;
    /** The connection details to the IBM Cloud Object Storage bucket. */
    cos_bucket?: ExternalSourceCosBucket;
    /** ExternalSource accepts additional properties. */
    [propName: string]: any;
  }

  /** The connection details to the IBM Cloud Catalog source. */
  export interface ExternalSourceCatalog {
    /** The name of the private catalog. */
    catalog_name?: string;
    /** The name of an offering in the IBM Cloud Catalog. */
    offering_name?: string;
    /** The version string of an offering in the IBM Cloud Catalog. */
    offering_version?: string;
    /** The type of an offering, in the IBM Cloud Catalog. */
    offering_kind?: string;
    /** The ID of an offering in the IBM Cloud Catalog. */
    offering_id?: string;
    /** The ID of an offering version the IBM Cloud Catalog. */
    offering_version_id?: string;
    /** The repository URL of an offering, in the IBM Cloud Catalog. */
    offering_repo_url?: string;
    /** ExternalSourceCatalog accepts additional properties. */
    [propName: string]: any;
  }

  /** The connection details to the IBM Cloud Object Storage bucket. */
  export interface ExternalSourceCosBucket {
    /** The COS bucket URL. */
    cos_bucket_url?: string;
    /** ExternalSourceCosBucket accepts additional properties. */
    [propName: string]: any;
  }

  /** The connection details to the Git source repository. */
  export interface ExternalSourceGit {
    /** The complete URL which is computed by the **git_repo_url**, **git_repo_folder**, and **branch**. */
    computed_git_repo_url?: string;
    /** The URL to the Git repository that can be used to clone the template. */
    git_repo_url?: string;
    /** The Personal Access Token (PAT) to connect to the Git URLs. */
    git_token?: string;
    /** The name of the folder in the Git repository, that contains the template. */
    git_repo_folder?: string;
    /** The name of the release tag that are used to fetch the Git repository. */
    git_release?: string;
    /** The name of the branch that are used to fetch the Git repository. */
    git_branch?: string;
    /** ExternalSourceGit accepts additional properties. */
    [propName: string]: any;
  }

  /** Order of execution for the Blueprint command. */
  export interface Flow {
    /** Type of Blueprint flows. */
    type?: string;
    operations?: FlowOperations[];
    /** Flow accepts additional properties. */
    [propName: string]: any;
  }

  /** FlowOperations. */
  export interface FlowOperations {
    /** List of layer names for the install command. */
    install?: string;
    /** List of layer names for the update command. */
    update?: string;
    /** List of layer names for the uninstall command. */
    uninstall?: string;
    /** List of layer names for the configure command. */
    configure?: string;
    /** FlowOperations accepts additional properties. */
    [propName: string]: any;
  }

  /** List of Input variable data record response. */
  export interface InputVariableDataList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of input variables and values. */
    inputs?: VariableData[];
    /** InputVariableDataList accepts additional properties. */
    [propName: string]: any;
  }

  /** Inventory resource definition, its credentials and bastion. */
  export interface InventoryResourceDefinition {
    /** The unique name of your Inventory resource. The name can be up to 128 characters long and can include
     *  alphanumeric characters, spaces, dashes, and underscores.
     */
    name?: string;
    /** The description of your Inventory resource. The description can be up to 2048 characters long in size. */
    description?: string;
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** Resource-group name for the Inventory resource.  By default, Action will be created in Default Resource
     *  Group.
     */
    resource_group?: string;
    /** Input inventory of host and host group for the playbook, in the `.ini` file format. */
    inventories_ini?: string;
    /** Input resource queries that is used to dynamically generate the inventory of host and host group for the
     *  playbook.
     */
    resource_queries?: string[];
    /** InventoryResourceDefinition accepts additional properties. */
    [propName: string]: any;
  }

  /** Complete inventory resource details with user inputs and system generated data. */
  export interface InventoryResourceRecord {
    /** The unique name of your Inventory.  The name can be up to 128 characters long and can include alphanumeric
     *  characters, spaces, dashes, and underscores.
     */
    name?: string;
    /** Inventory id. */
    id?: string;
    /** The description of your Inventory.  The description can be up to 2048 characters long in size. */
    description?: string;
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** Resource-group name for the Inventory definition.  By default, Action will be created in Default Resource
     *  Group.
     */
    resource_group?: string;
    /** Inventory creation time. */
    created_at?: string;
    /** Email address of user who created the Inventory. */
    created_by?: string;
    /** Inventory updation time. */
    updated_at?: string;
    /** Email address of user who updated the Inventory. */
    updated_by?: string;
    /** Input inventory of host and host group for the playbook,  in the .ini file format. */
    inventories_ini?: string;
    /** Input resource queries that is used to dynamically generate  the inventory of host and host group for the
     *  playbook.
     */
    resource_queries?: string[];
    /** InventoryResourceRecord accepts additional properties. */
    [propName: string]: any;
  }

  /** List of Inventory resource records. */
  export interface InventoryResourceRecordList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of inventory resource records. */
    inventories?: InventoryResourceRecord[];
    /** InventoryResourceRecordList accepts additional properties. */
    [propName: string]: any;
  }

  /** Variables and operations metadata of the catalog item.  Variable metadata will be fetched from the template in the repo. Operations metadata will be fetched from metadataFileName in the repo. */
  export interface ItemMetadata {
    /** Catalog item Id. */
    item_id?: string;
    /** offering Id. */
    offering_id: string;
    /** Offering kind id. */
    offering_kind_id?: string;
    /** Offering version id. */
    offering_version_id: string;
    /** Catalog item name. */
    name?: string;
    /** Catalog item description. */
    description?: string;
    /** List of supported operation. */
    operations?: string[];
    /** Input variables metadata. */
    inputs?: VariableData[];
    /** Input environment variables metadata. */
    settings?: VariableData[];
    /** Output variables metadata. */
    outputs?: VariableData[];
    /** ItemMetadata accepts additional properties. */
    [propName: string]: any;
  }

  /** Store Keeping Unit for the Item in the Cart order. */
  export interface ItemSKU {
    /** The ID of the underlying SKU object. */
    sku_id: string;
    /** SKU Type - Workspace / Ansible. */
    sku_type: string;
    /** System lock status. */
    sku_sys_lock?: SystemLock;
    /** Status of the underlying schematics objects used to fullfil CartOrder. */
    sku_user_state?: SKUUserState;
    /** ItemSKU accepts additional properties. */
    [propName: string]: any;
  }

  /** Complete Job with user inputs and system generated data. */
  export interface Job {
    /** Name of the Schematics automation resource. */
    command_object?: string;
    /** Job command object id (workspace-id, action-id). */
    command_object_id?: string;
    /** Schematics job command name. */
    command_name?: string;
    /** Schematics job command parameter (playbook-name). */
    command_parameter?: string;
    /** Command line options for the command. */
    command_options?: string[];
    /** Job inputs used by Action or Workspace. */
    inputs?: VariableData[];
    /** Environment variables used by the Job while performing Action or Workspace. */
    settings?: VariableData[];
    /** User defined tags, while running the job. */
    tags?: string[];
    /** Job ID. */
    id?: string;
    /** Job name, uniquely derived from the related Workspace or Action. */
    name?: string;
    /** The description of your job is derived from the related action or workspace.  The description can be up to
     *  2048 characters long in size.
     */
    description?: string;
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** Resource-group name derived from the related Workspace or Action. */
    resource_group?: string;
    /** Job submission time. */
    submitted_at?: string;
    /** Email address of user who submitted the job. */
    submitted_by?: string;
    /** Job start time. */
    start_at?: string;
    /** Job end time. */
    end_at?: string;
    /** Duration of job execution; example 40 sec. */
    duration?: string;
    /** Job Status. */
    status?: JobStatus;
    /** Job data. */
    data?: JobData;
    /** Describes a bastion resource. */
    bastion?: BastionResourceDefinition;
    /** Job log summary record. */
    log_summary?: JobLogSummary;
    /** Job log store URL. */
    log_store_url?: string;
    /** Job state store URL. */
    state_store_url?: string;
    /** Job results store URL. */
    results_url?: string;
    /** Job status updation timestamp. */
    updated_at?: string;
    /** Job accepts additional properties. */
    [propName: string]: any;
  }

  /** Job data. */
  export interface JobData {
    /** Type of Job. */
    job_type: string;
    /** Workspace Job data. */
    workspace_job_data?: JobDataWorkspace;
    /** Action Job data. */
    action_job_data?: JobDataAction;
    /** Controls Job data. */
    system_job_data?: JobDataSystem;
    /** Flow Job data. */
    flow_job_data?: JobDataFlow;
    /** JobData accepts additional properties. */
    [propName: string]: any;
  }

  /** Action Job data. */
  export interface JobDataAction {
    /** Flow name. */
    action_name?: string;
    /** Input variables data used by the Action Job. */
    inputs?: VariableData[];
    /** Output variables data from the Action Job. */
    outputs?: VariableData[];
    /** Environment variables used by all the templates in the Action. */
    settings?: VariableData[];
    /** Job status updation timestamp. */
    updated_at?: string;
    /** Complete inventory resource details with user inputs and system generated data. */
    inventory_record?: InventoryResourceRecord;
    /** Materialized inventory details used by the Action Job, in .ini format. */
    materialized_inventory?: string;
    /** JobDataAction accepts additional properties. */
    [propName: string]: any;
  }

  /** Capsule Job data. */
  export interface JobDataCapsule {
    /** Capsule Id. */
    capsule_id?: string;
    /** Capsule name. */
    calsule_name?: string;
    /** Input variables data used by the Controls Job. */
    inputs?: VariableData[];
    /** Results from the Capsules Job. */
    results?: JobResultCapsule[];
    /** Job status updation timestamp. */
    updated_at?: string;
    /** JobDataCapsule accepts additional properties. */
    [propName: string]: any;
  }

  /** Flow Job data. */
  export interface JobDataFlow {
    /** Flow ID. */
    flow_id?: string;
    /** Flow Name. */
    flow_name?: string;
    /** Job data used by each workitem Job. */
    workitems?: JobDataWorkItem[];
    /** Job status updation timestamp. */
    updated_at?: string;
    /** JobDataFlow accepts additional properties. */
    [propName: string]: any;
  }

  /** Controls Job data. */
  export interface JobDataSystem {
    /** Key ID for which key event is generated. */
    key_id?: string;
    /** List of the schematics resource id. */
    schematics_resource_id?: string[];
    /** Job status updation timestamp. */
    updated_at?: string;
    /** JobDataSystem accepts additional properties. */
    [propName: string]: any;
  }

  /** Template Job data. */
  export interface JobDataTemplate {
    /** Template Id. */
    template_id?: string;
    /** Template name. */
    template_name?: string;
    /** Index of the template in the Flow. */
    flow_index?: number;
    /** Job inputs used by the Templates. */
    inputs?: VariableData[];
    /** Job output from the Templates. */
    outputs?: VariableData[];
    /** Environment variables used by the template. */
    settings?: VariableData[];
    /** Job status updation timestamp. */
    updated_at?: string;
    /** JobDataTemplate accepts additional properties. */
    [propName: string]: any;
  }

  /** Environment work items. */
  export interface JobDataWorkItem {
    /** command object id. */
    command_object_id?: string;
    /** command object name. */
    command_object_name?: string;
    /** layer name. */
    layers?: string;
    /** Type of source for the Template. */
    source_type?: string;
    /** Source of templates, playbooks, or controls. */
    source?: ExternalSource;
    /** Input variables data for the workItem used in FlowJob. */
    inputs?: VariableData[];
    /** Output variables for the workItem. */
    outputs?: VariableData[];
    /** Environment variables for the workItem. */
    settings?: VariableData[];
    /** Status of the last job executed by the workitem. */
    last_job?: JobDataWorkItemLastJob;
    /** Job status updation timestamp. */
    updated_at?: string;
    /** JobDataWorkItem accepts additional properties. */
    [propName: string]: any;
  }

  /** Status of the last job executed by the workitem. */
  export interface JobDataWorkItemLastJob {
    /** Name of the Schematics automation resource. */
    command_object?: string;
    /** command object name (workspace_name/action_name). */
    command_object_name?: string;
    /** Workitem command object id, maps to workspace_id or action_id. */
    command_object_id?: string;
    /** Schematics job command name. */
    command_name?: string;
    /** Workspace job id. */
    job_id?: string;
    /** Status of Jobs. */
    job_status?: string;
    /** JobDataWorkItemLastJob accepts additional properties. */
    [propName: string]: any;
  }

  /** Workspace Job data. */
  export interface JobDataWorkspace {
    /** Workspace name. */
    workspace_name?: string;
    /** Flow Id. */
    flow_id?: string;
    /** Flow name. */
    flow_name?: string;
    /** Input variables data used by the Workspace Job. */
    inputs?: VariableData[];
    /** Output variables data from the Workspace Job. */
    outputs?: VariableData[];
    /** Environment variables used by all the templates in the Workspace. */
    settings?: VariableData[];
    /** Input / output data of the Template in the Workspace Job. */
    template_data?: JobDataTemplate[];
    /** Job status updation timestamp. */
    updated_at?: string;
    /** JobDataWorkspace accepts additional properties. */
    [propName: string]: any;
  }

  /** List of Job details. */
  export interface JobList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of job records. */
    jobs?: JobLite[];
    /** JobList accepts additional properties. */
    [propName: string]: any;
  }

  /** Job summary profile with system generated data. */
  export interface JobLite {
    /** Job ID. */
    id?: string;
    /** Job name, uniquely derived from the related Workspace or Action. */
    name?: string;
    /** Job description derived from the related Workspace or Action. */
    description?: string;
    /** Name of the Schematics automation resource. */
    command_object?: string;
    /** Job command object id (workspace-id, action-id). */
    command_object_id?: string;
    /** Schematics job command name. */
    command_name?: string;
    /** User defined tags, while running the job. */
    tags?: string[];
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** Resource-group name derived from the related Workspace or Action. */
    resource_group?: string;
    /** Job submission time. */
    submitted_at?: string;
    /** Email address of user who submitted the job. */
    submitted_by?: string;
    /** Duration of job execution; example 40 sec. */
    duration?: string;
    /** Job start time. */
    start_at?: string;
    /** Job end time. */
    end_at?: string;
    /** Job Status. */
    status?: JobStatus;
    /** Job log summary record. */
    log_summary?: JobLogSummary;
    /** Job status updation timestamp. */
    updated_at?: string;
    /** JobLite accepts additional properties. */
    [propName: string]: any;
  }

  /** Job Log details. */
  export interface JobLog {
    /** Job Id. */
    job_id?: string;
    /** Job name, uniquely derived from the related Workspace, Action or Controls. */
    job_name?: string;
    /** Job log summary record. */
    log_summary?: JobLogSummary;
    /** Format of the Log text. */
    format?: string;
    /** Log text, generated by the Job. */
    details?: string;
    /** Job status updation timestamp. */
    updated_at?: string;
    /** JobLog accepts additional properties. */
    [propName: string]: any;
  }

  /** Job log summary record. */
  export interface JobLogSummary {
    /** Workspace Id. */
    job_id?: string;
    /** Type of Job. */
    job_type?: string;
    /** Job log start timestamp. */
    log_start_at?: string;
    /** Job log update timestamp. */
    log_analyzed_till?: string;
    /** Job log elapsed time (log_analyzed_till - log_start_at). */
    elapsed_time?: number;
    /** Job log errors. */
    log_errors?: JobLogSummaryLogErrors[];
    /** Repo download Job log summary. */
    repo_download_job?: JobLogSummaryRepoDownloadJob;
    /** Workspace Job log summary. */
    workspace_job?: JobLogSummaryWorkspaceJob;
    /** Flow Job log summary. */
    flow_job?: JobLogSummaryFlowJob;
    /** Flow Job log summary. */
    action_job?: JobLogSummaryActionJob;
    /** System Job log summary. */
    system_job?: JobLogSummarySystemJob;
    /** JobLogSummary accepts additional properties. */
    [propName: string]: any;
  }

  /** Job log summary of the flow workitem. */
  export interface JobLogSummaryWorkitems {
    /** workspace ID. */
    workspace_id?: string;
    /** workspace JOB ID. */
    job_id?: string;
    /** Number of resources add. */
    resources_add?: number;
    /** Number of resources modify. */
    resources_modify?: number;
    /** Number of resources destroy. */
    resources_destroy?: number;
    /** Log url for job. */
    log_url?: string;
    /** JobLogSummaryWorkitems accepts additional properties. */
    [propName: string]: any;
  }

  /** Flow Job log summary. */
  export interface JobLogSummaryActionJob {
    /** number of targets or hosts. */
    target_count?: number;
    /** number of tasks in playbook. */
    task_count?: number;
    /** number of plays in playbook. */
    play_count?: number;
    /** Recap records. */
    recap?: JobLogSummaryActionJobRecap;
    /** JobLogSummaryActionJob accepts additional properties. */
    [propName: string]: any;
  }

  /** Recap records. */
  export interface JobLogSummaryActionJobRecap {
    /** List of target or host name. */
    target?: string[];
    /** Number of OK. */
    ok?: number;
    /** Number of changed. */
    changed?: number;
    /** Number of failed. */
    failed?: number;
    /** Number of skipped. */
    skipped?: number;
    /** Number of unreachable. */
    unreachable?: number;
    /** JobLogSummaryActionJobRecap accepts additional properties. */
    [propName: string]: any;
  }

  /** Flow Job log summary. */
  export interface JobLogSummaryFlowJob {
    /** Number of workitems completed successfully. */
    workitems_completed?: number;
    /** Number of workitems pending in the flow. */
    workitems_pending?: number;
    /** Number of workitems failed. */
    workitems_failed?: number;
    workitems?: JobLogSummaryWorkitems[];
    /** JobLogSummaryFlowJob accepts additional properties. */
    [propName: string]: any;
  }

  /** JobLogSummaryLogErrors. */
  export interface JobLogSummaryLogErrors {
    /** Error code in the Log. */
    error_code?: string;
    /** Summary error message in the log. */
    error_msg?: string;
    /** Number of occurrence. */
    error_count?: number;
    /** JobLogSummaryLogErrors accepts additional properties. */
    [propName: string]: any;
  }

  /** Repo download Job log summary. */
  export interface JobLogSummaryRepoDownloadJob {
    /** Number of files scanned. */
    scanned_file_count?: number;
    /** Number of files quarantined. */
    quarantined_file_count?: number;
    /** Detected template or data file type. */
    detected_filetype?: string;
    /** Number of inputs detected. */
    inputs_count?: string;
    /** Number of outputs detected. */
    outputs_count?: string;
    /** JobLogSummaryRepoDownloadJob accepts additional properties. */
    [propName: string]: any;
  }

  /** System Job log summary. */
  export interface JobLogSummarySystemJob {
    /** number of targets or hosts. */
    target_count?: number;
    /** Number of passed. */
    success?: number;
    /** Number of failed. */
    failed?: number;
    /** JobLogSummarySystemJob accepts additional properties. */
    [propName: string]: any;
  }

  /** Workspace Job log summary. */
  export interface JobLogSummaryWorkspaceJob {
    /** Number of resources add. */
    resources_add?: number;
    /** Number of resources modify. */
    resources_modify?: number;
    /** Number of resources destroy. */
    resources_destroy?: number;
    /** JobLogSummaryWorkspaceJob accepts additional properties. */
    [propName: string]: any;
  }

  /** Capsule Job Results. */
  export interface JobResultCapsule {
    /** Job Id. */
    job_id?: string;
    /** Job name, uniquely derived from the related Workspace, Action or Controls. */
    job_name?: string;
    /** Policy name. */
    policy?: string;
    /** Severity. */
    severity?: number;
    /** Job state. */
    job_state?: string;
    /** Job failures. */
    failures?: string[];
    /** Job passed. */
    passed?: string[];
    /** Capsule evidences. */
    evidences?: CapsuleResultEvidences[];
    /** Job status updation timestamp. */
    updated_at?: string;
    /** JobResultCapsule accepts additional properties. */
    [propName: string]: any;
  }

  /** Workspace Job state-file. */
  export interface JobStateData {
    /** Job Id. */
    job_id?: string;
    /** Job name, uniquely derived from the related Workspace and Action. */
    job_name?: string;
    /** Job state summary. */
    summary?: JobStateDataSummary[];
    /** Format of the State data (eg. tfstate). */
    format?: string;
    /** State data file. */
    details?: string;
    /** Job status updation timestamp. */
    updated_at?: string;
    /** JobStateData accepts additional properties. */
    [propName: string]: any;
  }

  /** JobStateDataSummary. */
  export interface JobStateDataSummary {
    /** State summary feature name. */
    name?: string;
    /** State summary feature type. */
    type?: string;
    /** State summary feature value. */
    value?: string;
    /** JobStateDataSummary accepts additional properties. */
    [propName: string]: any;
  }

  /** Job Status. */
  export interface JobStatus {
    /** Workspace Job Status. */
    workspace_job_status?: JobStatusWorkspace;
    /** Action Job Status. */
    action_job_status?: JobStatusAction;
    /** System Job Status. */
    system_job_status?: JobStatusSystem;
    /** Environment Flow JOB Status. */
    flow_job_status?: JobStatusFlow;
    /** JobStatus accepts additional properties. */
    [propName: string]: any;
  }

  /** Action Job Status. */
  export interface JobStatusAction {
    /** Action name. */
    action_name?: string;
    /** Status of Jobs. */
    status_code?: string;
    /** Action Job status message - to be displayed along with the action_status_code. */
    status_message?: string;
    /** Status of Resources. */
    bastion_status_code?: string;
    /** Bastion status message - to be displayed along with the bastion_status_code;. */
    bastion_status_message?: string;
    /** Status of Resources. */
    targets_status_code?: string;
    /** Aggregated status message for all target resources,  to be displayed along with the targets_status_code;. */
    targets_status_message?: string;
    /** Job status updation timestamp. */
    updated_at?: string;
    /** JobStatusAction accepts additional properties. */
    [propName: string]: any;
  }

  /** Environment Flow JOB Status. */
  export interface JobStatusFlow {
    /** flow id. */
    flow_id?: string;
    /** flow name. */
    flow_name?: string;
    /** Status of Jobs. */
    status_code?: string;
    /** Flow Job status message - to be displayed along with the status_code;. */
    status_message?: string;
    /** Environment's individual workItem status details;. */
    workitems?: JobStatusWorkitem[];
    /** Job status updation timestamp. */
    updated_at?: string;
    /** JobStatusFlow accepts additional properties. */
    [propName: string]: any;
  }

  /** schematics Resources Job Status. */
  export interface JobStatusSchematicsResources {
    /** Status of Jobs. */
    status_code?: string;
    /** system job status message. */
    status_message?: string;
    /** id for each resource which is targeted as a part of system job. */
    schematics_resource_id?: string;
    /** Job status updation timestamp. */
    updated_at?: string;
    /** JobStatusSchematicsResources accepts additional properties. */
    [propName: string]: any;
  }

  /** System Job Status. */
  export interface JobStatusSystem {
    /** System job message. */
    system_status_message?: string;
    /** Status of Jobs. */
    system_status_code?: string;
    /** job staus for each schematics resource. */
    schematics_resource_status?: JobStatusSchematicsResources[];
    /** Job status updation timestamp. */
    updated_at?: string;
    /** JobStatusSystem accepts additional properties. */
    [propName: string]: any;
  }

  /** Template Job Status. */
  export interface JobStatusTemplate {
    /** Template Id. */
    template_id?: string;
    /** Template name. */
    template_name?: string;
    /** Index of the template in the Flow. */
    flow_index?: number;
    /** Status of Jobs. */
    status_code?: string;
    /** Template job status message (eg. VPCt1_Apply_Pending, for a 'VPCt1' Template). */
    status_message?: string;
    /** Job status updation timestamp. */
    updated_at?: string;
    /** JobStatusTemplate accepts additional properties. */
    [propName: string]: any;
  }

  /** Individual workitem status info. */
  export interface JobStatusWorkitem {
    /** Workspace id. */
    workspace_id?: string;
    /** workspace name. */
    workspace_name?: string;
    /** workspace job id. */
    job_id?: string;
    /** Status of Jobs. */
    status_code?: string;
    /** workitem job status message;. */
    status_message?: string;
    /** workitem job status updation timestamp. */
    updated_at?: string;
    /** JobStatusWorkitem accepts additional properties. */
    [propName: string]: any;
  }

  /** Workspace Job Status. */
  export interface JobStatusWorkspace {
    /** Workspace name. */
    workspace_name?: string;
    /** Status of Jobs. */
    status_code?: string;
    /** Workspace job status message (eg. App1_Setup_Pending, for a 'Setup' flow in the 'App1' Workspace). */
    status_message?: string;
    /** Environment Flow JOB Status. */
    flow_status?: JobStatusFlow;
    /** Workspace Flow Template job status. */
    template_status?: JobStatusTemplate[];
    /** Job status updation timestamp. */
    updated_at?: string;
    /** JobStatusWorkspace accepts additional properties. */
    [propName: string]: any;
  }

  /** Flow Job Status. */
  export interface JobStatusWorkspaceTemplateFlow {
    /** Flow Id. */
    flow_id?: string;
    /** Flow name. */
    flow_name?: string;
    /** Status of Jobs. */
    status_code?: string;
    /** Workspace Flow job status message (eg. Setup_Apply_Pending, for a 'Setup' Flow). */
    status_message?: string;
    /** Job status updation timestamp. */
    updated_at?: string;
    /** JobStatusWorkspaceTemplateFlow accepts additional properties. */
    [propName: string]: any;
  }

  /** Discovered KMS instances. */
  export interface KMSDiscovery {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of KMS instances. */
    kms_instances?: KMSInstances[];
    /** KMSDiscovery accepts additional properties. */
    [propName: string]: any;
  }

  /** KMS Instances. */
  export interface KMSInstances {
    /** Location. */
    location?: string;
    /** Encryption schema. */
    encryption_scheme?: string;
    /** Resource groups. */
    resource_group?: string;
    /** KMS CRN. */
    kms_crn?: string;
    /** KMS Name. */
    kms_name?: string;
    /** KMS private endpoint. */
    kms_private_endpoint?: string;
    /** KMS public endpoint. */
    kms_public_endpoint?: string;
    /** List of keys. */
    keys?: KMSInstancesKeys[];
    /** KMSInstances accepts additional properties. */
    [propName: string]: any;
  }

  /** KMSInstancesKeys. */
  export interface KMSInstancesKeys {
    /** Key name. */
    name?: string;
    /** CRN of the Key. */
    crn?: string;
    /** Error message. */
    error?: string;
    /** KMSInstancesKeys accepts additional properties. */
    [propName: string]: any;
  }

  /** User defined KMS Settings details. */
  export interface KMSSettings {
    /** Location. */
    location?: string;
    /** Encryption scheme. */
    encryption_scheme?: string;
    /** Resource group. */
    resource_group?: string;
    /** Primary CRK details. */
    primary_crk?: KMSSettingsPrimaryCrk;
    /** Secondary CRK details. */
    secondary_crk?: KMSSettingsSecondaryCrk;
    /** KMSSettings accepts additional properties. */
    [propName: string]: any;
  }

  /** Primary CRK details. */
  export interface KMSSettingsPrimaryCrk {
    /** Primary KMS name. */
    kms_name?: string;
    /** Primary KMS endpoint. */
    kms_private_endpoint?: string;
    /** CRN of the Primary Key. */
    key_crn?: string;
    /** KMSSettingsPrimaryCrk accepts additional properties. */
    [propName: string]: any;
  }

  /** Secondary CRK details. */
  export interface KMSSettingsSecondaryCrk {
    /** Secondary KMS name. */
    kms_name?: string;
    /** Secondary KMS endpoint. */
    kms_private_endpoint?: string;
    /** CRN of the Secondary Key. */
    key_crn?: string;
    /** KMSSettingsSecondaryCrk accepts additional properties. */
    [propName: string]: any;
  }

  /** Catalog item configuration in the Cart order. */
  export interface OrderItemConfiguration {
    /** Catalog item name. */
    name?: string;
    /** Catalog item description. */
    description?: string;
    /** Input configuration for the order. */
    inputs?: VariableData[];
    /** Input environment variables used by order. */
    settings?: VariableData[];
    /** Output configuration of the order. */
    outputs?: VariableData[];
    /** Target cluster details to perform POC operation. */
    target?: TargetRequest;
    /** Name of the fulfilment job operations. */
    operation?: string;
    /** Additional service input data (for extensibility). */
    service_data?: ServiceVariableData[];
    /** Catalog Id. */
    catalog_id: string;
    /** offering Id. */
    offering_id: string;
    /** Account ID where catalog is created. */
    owning_account?: string;
    /** CRN of account where catalog is created. */
    owning_account_crn?: string;
    /** Offering kind id. */
    offering_kind_id?: string;
    /** Offering Target Kind. */
    offering_target_kind?: string;
    /** Offering version id. */
    offering_version_id?: string;
    /** Offering kind. */
    offering_kind?: string;
    /** Offering fulfilment kind. */
    offering_fulfilment_kind?: string;
    /** Offering version. */
    offering_version?: string;
    /** Repo URL where the provisioner can be found. */
    offering_provisioner_url?: string;
    /** SHA value of Repo URL. */
    offering_provisioner_ssh?: string;
    /** Root folder name in .tgz file. */
    offering_provisioner_working_directory?: string;
    /** Store Keeping Unit for the Item in the Cart order. */
    item_sku?: ItemSKU;
    /** OrderItemConfiguration accepts additional properties. */
    [propName: string]: any;
  }

  /** List of Output variable data record response. */
  export interface OutputVariableDataList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of output variables and values. */
    outputs?: VariableData[];
    /** OutputVariableDataList accepts additional properties. */
    [propName: string]: any;
  }

  /** Complete Private cluster details provided by user and system generated. */
  export interface PrivateCluster {
    /** Id of the remote K8s Cluster to run the Schematics Jobs. */
    cluster_id?: string;
    /** Kube Config to connect to the Cluster. */
    kube_config?: string;
    /** SchematicsJobCluster definition tags. */
    tags?: string[];
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** Name of the user who registered the remote K8s cluster. */
    registered_by?: string;
    /** Timestamp of SchematicsJobCluster registration. */
    registered_at?: string;
    /** SchematicsJobCluster updation time. */
    updated_at?: string;
    /** Name of user who updated the SchematicsJobCluster definitio. */
    updated_by?: string;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** Health of the remote Cluster. */
    cluster_health?: string;
    /** Timestamp of the last health check. */
    last_health_checked_at?: string;
    /** PrivateCluster accepts additional properties. */
    [propName: string]: any;
  }

  /** Private Cluster details response. */
  export interface PrivateClusterList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of private clusters. */
    clusters?: PrivateCluster[];
    /** PrivateClusterList accepts additional properties. */
    [propName: string]: any;
  }

  /** Describe resource query. */
  export interface ResourceQuery {
    /** Type of the query(workspaces). */
    query_type?: string;
    query_condition?: ResourceQueryParam[];
    /** List of query selection parameters. */
    query_select?: string[];
    /** ResourceQuery accepts additional properties. */
    [propName: string]: any;
  }

  /** Describe resource query definition. */
  export interface ResourceQueryDefinition {
    /** Resource type (cluster, vsi, icd, vpc). */
    type?: string;
    /** Resource query name. */
    name?: string;
    queries?: ResourceQuery[];
    /** ResourceQueryDefinition accepts additional properties. */
    [propName: string]: any;
  }

  /** Describe resource query param. */
  export interface ResourceQueryParam {
    /** Name of the resource query param. */
    name?: string;
    /** Value of the resource query param. */
    value?: string;
    /** Description of resource query param variable. */
    description?: string;
    /** ResourceQueryParam accepts additional properties. */
    [propName: string]: any;
  }

  /** Describe resource query record. */
  export interface ResourceQueryRecord {
    /** Resource type (cluster, vsi, icd, vpc). */
    type?: string;
    /** Resource query name. */
    name?: string;
    /** Resource Query id. */
    id?: string;
    /** Resource query creation time. */
    created_at?: string;
    /** Email address of user who created the Resource query. */
    created_by?: string;
    /** Resource query updation time. */
    updated_at?: string;
    /** Email address of user who updated the Resource query. */
    updated_by?: string;
    queries?: ResourceQuery[];
    /** ResourceQueryRecord accepts additional properties. */
    [propName: string]: any;
  }

  /** List of Resource query records. */
  export interface ResourceQueryRecordList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of resource query records. */
    resource_queries?: ResourceQueryRecord[];
    /** ResourceQueryRecordList accepts additional properties. */
    [propName: string]: any;
  }

  /** Describe resource query. */
  export interface ResourceQueryResponseRecord {
    response?: ResourceQueryResponseRecordResponse[];
    /** ResourceQueryResponseRecord accepts additional properties. */
    [propName: string]: any;
  }

  /** List of query output values. */
  export interface ResourceQueryResponseRecordQueryOutput {
    /** Name of the output param. */
    name?: string;
    /** value of the output param. */
    value?: string;
    /** ResourceQueryResponseRecordQueryOutput accepts additional properties. */
    [propName: string]: any;
  }

  /** ResourceQueryResponseRecordResponse. */
  export interface ResourceQueryResponseRecordResponse {
    /** Type of the query(workspaces). */
    query_type?: string;
    query_condition?: ResourceQueryParam[];
    /** List of query selection parameters. */
    query_select?: string[];
    query_output?: ResourceQueryResponseRecordQueryOutput[];
    /** ResourceQueryResponseRecordResponse accepts additional properties. */
    [propName: string]: any;
  }

  /** Status of the underlying schematics objects used to fullfil CartOrder. */
  export interface SKUUserState {
    /** State of the object. */
    state?: string;
    /** Name of the User who set the state of the Object. */
    set_by?: string;
    /** When the User who set the state of the Object. */
    set_at?: string;
    /** SKUUserState accepts additional properties. */
    [propName: string]: any;
  }

  /** Schematics access rule details. */
  export interface SchematicsAccessRule {
    /** Outcome of the access rule evaluation. */
    effect?: string;
    /** Schematics job command name. */
    command_name?: string;
    /** Schematics job command parameter (playbook-name, capsule-name or flow-name). */
    command_parameter?: string;
    /** Name of the user who is trying to perform the command. */
    principal?: string;
    /** Origin of the schematics action event. */
    origin?: string;
    /** SchematicsAccessRule accepts additional properties. */
    [propName: string]: any;
  }

  /** List of Schematics access rule details. */
  export interface SchematicsAccessRuleList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of access-rules. */
    access_rules?: SchematicsAccessRule[];
    /** SchematicsAccessRuleList accepts additional properties. */
    [propName: string]: any;
  }

  /** Details about IBM Cloud Schematics service supported template types and versions, and the supported locations. */
  export interface SchematicsInfo {
    /** Schematics version. */
    schematics_version?: string;
    /** Schematics build number. */
    schematics_build?: string;
    /** Supported locations for IBM Cloud Schematics. */
    supported_locations?: string[];
    /** Support template-types in IBM Cloud Schematics. */
    supported_templates?: JsonObject;
    /** Supported runtime components for each template-types in Schematics. */
    supported_runtimes?: JsonObject;
    /** SchematicsInfo accepts additional properties. */
    [propName: string]: any;
  }

  /** List of Locations details. */
  export interface SchematicsLocationsList {
    /** List of Locations. */
    locations?: SchematicsLocationsLite[];
    /** SchematicsLocationsList accepts additional properties. */
    [propName: string]: any;
  }

  /** individual location details. */
  export interface SchematicsLocationsLite {
    /** Geographical Region code having the data centres of IBM Cloud Schematics service. */
    region?: string;
    /** Geographical city locations having the data centres of IBM Cloud Schematics service. */
    metro?: string;
    /** Geographical continent locations code having the data centres of IBM Cloud Schematics service. */
    geography_code?: string;
    /** Geographical continent locations having the data centres of IBM Cloud Schematics service. */
    geography?: string;
    /** Country locations having the data centres of IBM Cloud Schematics service. */
    country?: string;
    /** The kind of location. */
    kind?: string;
    /** List of paired regions used by Schematics. */
    paired_region?: string[];
    /** Restricted Region. */
    restricted?: boolean;
    /** SchematicsLocationsLite accepts additional properties. */
    [propName: string]: any;
  }

  /** Runtime components for each template-types in Schematics. */
  export interface SchematicsRuntimeInfo {
    /** Runtime image name. */
    runtime_image?: string;
    /** Properties of the Runtime image. */
    runtime_properties?: JsonObject;
    /** SchematicsRuntimeInfo accepts additional properties. */
    [propName: string]: any;
  }

  /** Rule to map input param_name to output_param. */
  export interface ServiceMappingRule {
    /** Type of mapping. */
    type?: string;
    /** Input parameter name which acts as source for mapping. */
    input_param_name?: string;
    /** Output parameter name which acts as destination for mapping. */
    output_param_name?: string;
    /** ServiceMappingRule accepts additional properties. */
    [propName: string]: any;
  }

  /** User editable service variable data & system generated reference to value. */
  export interface ServiceVariableData {
    /** Name of the variable. */
    name?: string;
    /** Value for the variable or reference to the value. */
    value?: string;
    /** An user editable metadata for the variables. */
    metadata?: VariableMetadata;
    /** Service Mapping Rule. */
    mapping?: ServiceMappingRule[];
    /** ServiceVariableData accepts additional properties. */
    [propName: string]: any;
  }

  /** System lock status. */
  export interface SystemLock {
    /** Is the automation locked by a Schematic job ?. */
    sys_locked?: boolean;
    /** Name of the User who performed the job, that lead to the locking of the automation. */
    sys_locked_by?: string;
    /** When the User performed the job that lead to locking of the automation ?. */
    sys_locked_at?: string;
    /** SystemLock accepts additional properties. */
    [propName: string]: any;
  }

  /** Target cluster details to perform POC operation. */
  export interface TargetRequest {
    /** Cluster Id. */
    cluster_id?: string;
    /** Cluster name. */
    cluster_name?: string;
    /** Entitlement key. */
    entitlement_key?: JsonObject;
    /** K8s namespace. */
    namespace?: string;
    /** Cluster region. */
    region?: string;
    /** Resource group id. */
    resource_group_id?: string;
    /** TargetRequest accepts additional properties. */
    [propName: string]: any;
  }

  /** Complete Template definition with user inputs and system generated data. */
  export interface Template {
    /** Name of the template. Should be unique within a workspace. */
    name?: string;
    /** Template description. */
    description?: string;
    /** Template type.  Ex: terraform_v0.11, terraform_v0.12, ansible. */
    type?: string;
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** Type of source for the Template. */
    source_type?: string;
    /** Source of templates, playbooks, or controls. */
    source?: ExternalSource;
    /** URL of the README file, for the source. */
    source_readme_url?: string;
    /** Input variables for the Template. */
    inputs?: VariableData[];
    /** Output variables from the Template. */
    outputs?: VariableData[];
    /** Environment variables used by the template. */
    settings?: VariableData[];
    /** Target inventory record ID used by the template to deploy the resources. */
    inventory?: string;
    /** template ID generated by the system. */
    id?: string;
    /** Template Source creation time. */
    source_created_at?: string;
    /** Email address of user who created the Template Source. */
    source_created_by?: string;
    /** Template Source updation time. */
    source_updated_at?: string;
    /** Email address of user who updated the Template Source. */
    source_updated_by?: string;
    /** Template creation time. */
    created_at?: string;
    /** Email address of user who created the template. */
    created_by?: string;
    /** Template updation time. */
    updated_at?: string;
    /** Email address of user who updated the template. */
    updated_by?: string;
    /** Template Job Status. */
    status?: JobStatusTemplate;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** Template accepts additional properties. */
    [propName: string]: any;
  }

  /** Name of the template-specific command. */
  export interface TemplateCommand {
    /** Schematics job command name. */
    command?: string;
    /** Options supported by the Template Command - it will be used as command line options for Terraform, Helm,
     *  Operator engine Eg -parallelism=n  -var-file=myvarfile.
     */
    command_options?: string[];
    /** TemplateCommand accepts additional properties. */
    [propName: string]: any;
  }

  /** Complete Flow details with user inputs and system generated data. */
  export interface TemplateFlow {
    /** Name of the Flow. */
    name?: string;
    /** Version of the flow definition. Only value 'V1' is accepted. */
    version?: string;
    /** Type of flow. */
    type?: string;
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** Flow definition. */
    definition?: TemplateFlowDefinition;
    /** Id of the Flow. */
    id?: string;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** Flow creation time. */
    created_at?: string;
    /** Email address of user who created the flow. */
    created_by?: string;
    /** Flow updation time. */
    updated_at?: string;
    /** Email address of user who updated the flow. */
    updated_by?: string;
    /** Flow Job Status. */
    status?: JobStatusWorkspaceTemplateFlow;
    /** Validation summary. */
    validation_summary?: TemplateFlowValidationSummary;
    /** Validation details. */
    validation_logs?: TemplateFlowValidationLogs[];
    /** TemplateFlow accepts additional properties. */
    [propName: string]: any;
  }

  /** Flow data-flow validation status. */
  export interface TemplateFlowDataValidationStatus {
    /** Validation status of the template variable. */
    log_level?: string;
    /** Input variable name. */
    var_name?: string;
    /** Validation log message related to the template variable. */
    var_status?: string;
    /** TemplateFlowDataValidationStatus accepts additional properties. */
    [propName: string]: any;
  }

  /** Flow definition. */
  export interface TemplateFlowDefinition {
    /** Type of flow definition. */
    flow_type?: string;
    /** Flow definition id. */
    id?: string;
    /** Simple inbuilt flow defined using a list of template operations. */
    simple_flow?: TemplateFlowDefinitionSimpleFlow[];
    /** flow definition string used by an external engine (eg. NodeRed). */
    custom_flow?: string;
    /** TemplateFlowDefinition accepts additional properties. */
    [propName: string]: any;
  }

  /** TemplateFlowDefinitionSimpleFlow. */
  export interface TemplateFlowDefinitionSimpleFlow {
    /** Line number of the template-operation. */
    index?: number;
    /** Control action in the flow. */
    control?: string;
    /** Template operation in the flow. */
    template_operation?: TemplateFlowDefinitionTemplateOperation;
    /** TemplateFlowDefinitionSimpleFlow accepts additional properties. */
    [propName: string]: any;
  }

  /** Template operation in the flow. */
  export interface TemplateFlowDefinitionTemplateOperation {
    /** Condition expression that will be evaluated before performing the template command; if false, this template
     *  action is skipped to the next.
     */
    pre_condition?: string;
    /** Id of the Template picked for performing the workspace command. */
    template_id?: string;
    /** Name of the template-specific command. */
    override_command?: TemplateCommand;
    /** Condition expression that will be evaluated after performing the template command; if false, the workspace
     *  command  will be reported as Failed, and error event is triggered".
     */
    post_condition?: string;
    /** On encountering error in the workspace command - ignore (and continue to next step), or break (to stop
     *  execution), or retry (the template action, for a configurable retry count).
     */
    on_error?: string;
    /** TemplateFlowDefinitionTemplateOperation accepts additional properties. */
    [propName: string]: any;
  }

  /** List of Flow definitions response. */
  export interface TemplateFlowList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of flow records. */
    flows?: TemplateFlowLite[];
    /** TemplateFlowList accepts additional properties. */
    [propName: string]: any;
  }

  /** Flow summary profile with system generated data. */
  export interface TemplateFlowLite {
    /** Id of the Flow. */
    id?: string;
    /** Name of the Flow. */
    name?: string;
    /** Version of the flow definition. Only value 'V1' is accepted. */
    version?: string;
    /** Type of flow. */
    type?: string;
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** Flow Job Status. */
    status?: JobStatusWorkspaceTemplateFlow;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** Flow creation time. */
    created_at?: string;
    /** Email address of user who created the flow. */
    created_by?: string;
    /** TemplateFlow updation time. */
    updated_at?: string;
    /** Email address of user who updated the flow. */
    updated_by?: string;
    /** TemplateFlowLite accepts additional properties. */
    [propName: string]: any;
  }

  /** TemplateFlowValidationLogs. */
  export interface TemplateFlowValidationLogs {
    /** Line number of the flow-item. */
    flow_index?: number;
    /** Validation status of input data for the flow-item. */
    inputs_status?: TemplateFlowDataValidationStatus[];
    /** Validation status of output data for the flow-item. */
    outputs_status?: TemplateFlowDataValidationStatus[];
    /** TemplateFlowValidationLogs accepts additional properties. */
    [propName: string]: any;
  }

  /** Validation summary. */
  export interface TemplateFlowValidationSummary {
    /** Number of warnings in the flow. */
    warning_count?: number;
    /** Number of errors in the flow. */
    error_count?: number;
    /** TemplateFlowValidationSummary accepts additional properties. */
    [propName: string]: any;
  }

  /** List of Templates in a Workspace. */
  export interface TemplateList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of template records. */
    templates?: TemplateLite[];
    /** TemplateList accepts additional properties. */
    [propName: string]: any;
  }

  /** List of user-defined Template definitions. */
  export interface TemplateListRequest {
    /** List of Template definitions. */
    templates?: Template[];
    /** TemplateListRequest accepts additional properties. */
    [propName: string]: any;
  }

  /** Template summary profile with user inputs and system generated data. */
  export interface TemplateLite {
    /** Template ID generated by the system. */
    id?: string;
    /** Name of the template. Should be unique within a workspace. */
    name?: string;
    /** Template description. */
    description?: string;
    /** Template type.  Ex: terraform_v0.11, terraform_v0.12, ansible. */
    type?: string;
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** Type of source for the Template. */
    source_type?: string;
    /** Template Job Status. */
    status?: JobStatusTemplate;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** Template creation time. */
    created_at?: string;
    /** Email address of user who created the template. */
    created_by?: string;
    /** Template updation time. */
    updated_at?: string;
    /** Email address of user who updated the template. */
    updated_by?: string;
    /** TemplateLite accepts additional properties. */
    [propName: string]: any;
  }

  /** Template metadata request. */
  export interface TemplateMetaDataRequest {
    /** Region on which request should process. Applicable only on global endpoint. */
    region?: string;
    /** Template type such as **terraform**, **ansible**, **helm**, **cloudpak**, or **bash script**. */
    template_type: string;
    /** Source of templates, playbooks, or controls. */
    source: ExternalSource;
    /** Type of source for the Template. */
    source_type?: string;
    /** TemplateMetaDataRequest accepts additional properties. */
    [propName: string]: any;
  }

  /** Template metadata response. */
  export interface TemplateMetaDataResponse {
    /** The template type such as **terraform**, **ansible**, **helm**, **cloudpak**, or **bash script**. */
    type?: string;
    /** List of variables and its metadata. */
    variables: VariableData[];
    /** TemplateMetaDataResponse accepts additional properties. */
    [propName: string]: any;
  }

  /** TemplateRepoTarUploadResponse -. */
  export interface TemplateRepoTarUploadResponse {
    /** Tar file value. */
    file_value?: string;
    /** Has received tar file?. */
    has_received_file?: boolean;
    /** Template ID. */
    id?: string;
    /** TemplateRepoTarUploadResponse accepts additional properties. */
    [propName: string]: any;
  }

  /** Complete Trigger details provided by user and system generated. */
  export interface Trigger {
    /** Name of the trigger. */
    name?: string;
    /** Type of the trigger. */
    type?: string;
    /** Trigger description. */
    description?: string;
    /** Resource-group id for the Trigger. */
    resource_group?: string;
    /** The id of service ID to be associated with this Trigger. */
    service_id?: string;
    /** API Key for the Service ID. */
    apikey?: string;
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** Schematics trigger tags. */
    tags?: string[];
    /** List of Job Triggers. */
    job_triggers?: TriggerJob[];
    /** List of Scheduled Triggers. */
    scheduled_triggers?: TriggerScheduled[];
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** Id of the Schematics trigger. */
    trigger_id?: string;
    /** Name of the user who registered the Schematics trigger. */
    registered_by?: string;
    /** Timestamp of Schematics trigger registration. */
    registered_at?: string;
    /** Schematics trigger updation time. */
    updated_at?: string;
    /** Name of user who updated the Schematics trigger definition. */
    updated_by?: string;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** Timestamp of the last health check. */
    last_health_checked_at?: string;
    /** Trigger accepts additional properties. */
    [propName: string]: any;
  }

  /** Job Trigger. */
  export interface TriggerJob {
    /** Time in UTC format. */
    event?: string;
    /** Complete Job with user inputs and system generated data. */
    job?: Job;
    /** TriggerJob accepts additional properties. */
    [propName: string]: any;
  }

  /** List of trigger definitions response. */
  export interface TriggerList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of triggers. */
    triggers?: Trigger[];
    /** TriggerList accepts additional properties. */
    [propName: string]: any;
  }

  /** Scheduled Trigger. */
  export interface TriggerScheduled {
    /** frequency. */
    frequency?: string;
    /** Tinme in UTC format. */
    time?: string;
    /** Day. */
    day?: string;
    /** TriggerScheduled accepts additional properties. */
    [propName: string]: any;
  }

  /** Update Cart order details with user inputs data. */
  export interface UpdateCartOrder {
    /** Cart order name (unique for an account). */
    name?: string;
    /** Cart order description. */
    description?: string;
    /** Cart order tags. */
    tags?: string[];
    cart_items?: UpdateOrderItemConfiguration[];
    /** UpdateCartOrder accepts additional properties. */
    [propName: string]: any;
  }

  /** Update Catalog item configuration in the Cart order. */
  export interface UpdateOrderItemConfiguration {
    /** Catalog item name. */
    name?: string;
    /** Catalog item description. */
    description?: string;
    /** Input configuration for the order. */
    inputs?: VariableData[];
    /** Input environment variables used by order. */
    settings?: VariableData[];
    /** Output configuration of the order. */
    outputs?: VariableData[];
    /** Target cluster details to perform POC operation. */
    target?: TargetRequest;
    /** Name of the fulfilment job operations. */
    operation?: string;
    /** Additional service input data (for extensibility). */
    service_data?: ServiceVariableData[];
    /** UpdateOrderItemConfiguration accepts additional properties. */
    [propName: string]: any;
  }

  /** User defined status of the Schematics object. */
  export interface UserState {
    /** User-defined states
     *    * `draft` Object can be modified; can be used by Jobs run by the author, during execution
     *    * `live` Object can be modified; can be used by Jobs during execution
     *    * `locked` Object cannot be modified; can be used by Jobs during execution
     *    * `disable` Object can be modified. cannot be used by Jobs during execution.
     */
    state?: string;
    /** Name of the User who set the state of the Object. */
    set_by?: string;
    /** When the User who set the state of the Object. */
    set_at?: string;
    /** UserState accepts additional properties. */
    [propName: string]: any;
  }

  /** List of string values. */
  export interface ValueListResponse {
    /** list values. */
    values?: string[];
    /** ValueListResponse accepts additional properties. */
    [propName: string]: any;
  }

  /** String value. */
  export interface ValueResponse {
    /** value response. */
    value?: string;
    /** ValueResponse accepts additional properties. */
    [propName: string]: any;
  }

  /** User editable variable data and system generated reference to the value. */
  export interface VariableData {
    /** The name of the variable. */
    name?: string;
    /** The value for the variable or reference to the value. */
    value?: string;
    /** An user editable metadata for the variables. */
    metadata?: VariableMetadata;
    /** The reference link to the variable value By default the expression points to `self.value`. */
    link?: string;
    /** VariableData accepts additional properties. */
    [propName: string]: any;
  }

  /** List of Variable data record response. */
  export interface VariableDataList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of variables and values. */
    variables?: VariableData[];
    /** VariableDataList accepts additional properties. */
    [propName: string]: any;
  }

  /** An user editable metadata for the variables. */
  export interface VariableMetadata {
    /** Type of the variable. */
    type?: string;
    /** The list of aliases for the variable name. */
    aliases?: string[];
    /** The description of the meta data. */
    description?: string;
    /** Default value for the variable only if the override value is not specified. */
    default_value?: string;
    /** Is the variable secure or sensitive?. */
    secure?: boolean;
    /** Is the variable readonly?. */
    immutable?: boolean;
    /** If **true**, the variable is not displayed on UI or Command line. */
    hidden?: boolean;
    /** The list of possible values for this variable.  If type is **integer** or **date**, then the array of string
     *  is  converted to array of integers or date during the runtime.
     */
    options?: string[];
    /** The minimum value of the variable. Applicable for the integer type. */
    min_value?: number;
    /** The maximum value of the variable. Applicable for the integer type. */
    max_value?: number;
    /** The minimum length of the variable value. Applicable for the string type. */
    min_length?: number;
    /** The maximum length of the variable value. Applicable for the string type. */
    max_length?: number;
    /** The regex for the variable value. */
    matches?: string;
    /** The relative position of this variable in a list. */
    position?: number;
    /** The display name of the group this variable belongs to. */
    group_by?: string;
    /** The source of this meta-data. */
    source?: string;
    /** VariableMetadata accepts additional properties. */
    [propName: string]: any;
  }

  /** Complete WebHook details provided by user and system generated. */
  export interface WebHook {
    /** Schematics job command name. */
    command_name?: string;
    /** Type of the Schematics web-hook. */
    hook_type?: string;
    /** List of notification points. */
    hook_site?: string;
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** Resource-group id for the Schematics web-hook. */
    resource_group?: string;
    /** Schematics web-hook tags. */
    tags?: string[];
    /** Endpoint URL for the Schematics web-hook. */
    hook_endpoint_url?: string;
    /** Service-ID to connect to the Schematics web-hook; if this is not provided, Schematics will used the IAM
     *  token of the user to connect to the Hook.
     */
    service_id?: string;
    /** API Key for the Service ID. */
    apikey?: string;
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** True - Replace the Hook definition, without waiting for completion of all inflight Schematics operations;
     *  False - Block new Schematics operations, and wait for  the relevant inflight operations to complete - before
     *  changing the Hook definition.
     */
    ignore_inflight_operations?: boolean;
    /** Id of the Schematics web-hook. */
    hook_id?: string;
    /** Name of the user who registered the Schematics web-hook. */
    registered_by?: string;
    /** Timestamp of Schematics web-hook registration. */
    registered_at?: string;
    /** Schematics web-hook updation time. */
    updated_at?: string;
    /** Name of user who updated the Schematics web-hook definition. */
    updated_by?: string;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** Timestamp of the last health check. */
    last_health_checked_at?: string;
    /** WebHook accepts additional properties. */
    [propName: string]: any;
  }

  /** List of Web-hook details response. */
  export interface WebHookList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of webhooks. */
    hooks?: WebHook[];
    /** WebHookList accepts additional properties. */
    [propName: string]: any;
  }

  /** Workitem for the Blueprint. */
  export interface WorkItem {
    /** work item id. */
    workitem_object_id?: string;
    /** Name of the Schematics automation resource. */
    workitem_object_type?: string;
    /** Name of the workitem. */
    name?: string;
    /** Layer for the workitem. */
    layer?: string;
    /** Source of templates, playbooks, or controls. */
    source?: ExternalSource;
    /** Tags used by the workitem. */
    tags?: string;
    /** Inputs used by the workitem. */
    inputs?: BlueprintVariableData[];
    /** Outputs from the workitem. */
    outputs?: BlueprintVariableData[];
    settings?: BlueprintVariableData[];
    /** Status of the last job executed by the workitem. */
    last_job?: WorkItemLastJob;
    /** WorkItem accepts additional properties. */
    [propName: string]: any;
  }

  /** Status of the last job executed by the workitem. */
  export interface WorkItemLastJob {
    /** Name of the Schematics automation resource. */
    command_object?: string;
    /** Name of the command object id, maps to workspace_name or action_name. */
    command_object_name?: string;
    /** Workitem command object id, maps to workspace_id or action_id. */
    command_object_id?: string;
    /** Schematics job command name. */
    command_name?: string;
    /** Status of Jobs. */
    job_status?: string;
    /** WorkItemLastJob accepts additional properties. */
    [propName: string]: any;
  }

  /** Complete Workspace details with user inputs and system generated data. */
  export interface Workspace {
    /** Workspace name (unique for an account). */
    name: string;
    /** Workspace description. */
    description?: string;
    /** Resource-group name for the Workspace.  By default, workspace will be created in Default Resource Group. */
    resource_group: string;
    /** Workspace tags. */
    tags?: string[];
    /** If true, automatically destroy all resources, when the workspace is deleted. Default is false. */
    destroy_resources_on_delete?: boolean;
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location: string;
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** Schematics job command parameter (playbook-name, capsule-name or flow-name). */
    command_parameter?: string;
    /** Input variables for the Workspace. */
    inputs?: VariableData[];
    /** Output variables from the Workspace. */
    outputs?: VariableData[];
    /** Environment variables used by all the templates in the Workspace. */
    settings?: VariableData[];
    /** Workspace Id. */
    id?: string;
    /** Workspace Cloud Resource Name. */
    crn?: string;
    /** Workspace account id. */
    account?: string;
    /** Workspace creation time. */
    created_at?: string;
    /** Email address of user who created the workspace. */
    created_by?: string;
    /** Workspace updation time. */
    updated_at?: string;
    /** Email address of user who updated the workspace. */
    updated_by?: string;
    /** Computed state of the Workspace. */
    state?: WorkspaceLiteState;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** Workspace Template records. */
    templates?: Template[];
    /** Workspace accepts additional properties. */
    [propName: string]: any;
  }

  /** List of Workspace definition response. */
  export interface WorkspaceList {
    /** Total number of records. */
    total_count?: number;
    /** Number of records returned. */
    limit: number;
    /** Skipped number of records. */
    offset: number;
    /** List of workspace records. */
    workspaces?: WorkspaceLite[];
    /** WorkspaceList accepts additional properties. */
    [propName: string]: any;
  }

  /** Workspace summary profile with user inputs and system generated data. */
  export interface WorkspaceLite {
    /** Workspace name (unique for an account). */
    name?: string;
    /** Workspace description. */
    description?: string;
    /** Workspace Id. */
    id?: string;
    /** Workspace Cloud Resource Name. */
    crn?: string;
    /** List of locations supported by IBM Cloud Schematics service.  While creating your workspace or action,
     *  choose the right region, since it cannot be changed.  Note, this does not limit the location of the IBM Cloud
     *  resources, provisioned using Schematics.
     */
    location?: string;
    /** Resource-group name for the Workspace.  By default, Workspace will be created in Default Resource Group. */
    resource_group?: string;
    /** Workspace tags. */
    tags?: string[];
    /** User defined status of the Schematics object. */
    user_state?: UserState;
    /** Computed state of the Workspace. */
    state?: WorkspaceLiteState;
    /** System lock status. */
    sys_lock?: SystemLock;
    /** Workspace creation time. */
    created_at?: string;
    /** Email address of user who created the Workspace. */
    created_by?: string;
    /** Workspace updation time. */
    updated_at?: string;
    /** Email address of user who updated the Workspace. */
    updated_by?: string;
    /** WorkspaceLite accepts additional properties. */
    [propName: string]: any;
  }

  /** Computed state of the Workspace. */
  export interface WorkspaceLiteState {
    /** Status of automation (workspace or action). */
    status_code?: string;
    /** Automation status message - to be displayed along with the status_code. */
    status_message?: string;
    /** WorkspaceLiteState accepts additional properties. */
    [propName: string]: any;
  }

}

export = Schematics20ApiV2;
