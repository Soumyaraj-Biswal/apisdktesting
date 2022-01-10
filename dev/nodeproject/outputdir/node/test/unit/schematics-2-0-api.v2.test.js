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

// need to import the whole package to mock getAuthenticatorFromEnvironment
const core = require('ibm-cloud-sdk-core');
const { NoAuthAuthenticator, unitTestUtils } = core;

const Schematics20ApiV2 = require('../../dist/schematics-2-0-api/v2');

const {
  getOptions,
  checkUrlAndMethod,
  checkMediaHeaders,
  expectToBePromise,
  checkUserHeader,
  checkForSuccessfulExecution,
} = unitTestUtils;

const service = {
  authenticator: new NoAuthAuthenticator(),
  url: 'https://schematics-dev.containers.appdomain.cloud',
};

const schematics20ApiService = new Schematics20ApiV2(service);

// dont actually create a request
const createRequestMock = jest.spyOn(schematics20ApiService, 'createRequest');
createRequestMock.mockImplementation(() => Promise.resolve());

// dont actually construct an authenticator
const getAuthenticatorMock = jest.spyOn(core, 'getAuthenticatorFromEnvironment');
getAuthenticatorMock.mockImplementation(() => new NoAuthAuthenticator());

afterEach(() => {
  createRequestMock.mockClear();
  getAuthenticatorMock.mockClear();
});

describe('Schematics20ApiV2', () => {
  describe('the newInstance method', () => {
    test('should use defaults when options not provided', () => {
      const testInstance = Schematics20ApiV2.newInstance();

      expect(getAuthenticatorMock).toHaveBeenCalled();
      expect(testInstance.baseOptions.authenticator).toBeInstanceOf(NoAuthAuthenticator);
      expect(testInstance.baseOptions.serviceName).toBe(Schematics20ApiV2.DEFAULT_SERVICE_NAME);
      expect(testInstance.baseOptions.serviceUrl).toBe(Schematics20ApiV2.DEFAULT_SERVICE_URL);
      expect(testInstance).toBeInstanceOf(Schematics20ApiV2);
    });

    test('should set serviceName, serviceUrl, and authenticator when provided', () => {
      const options = {
        authenticator: new NoAuthAuthenticator(),
        serviceUrl: 'custom.com',
        serviceName: 'my-service',
      };

      const testInstance = Schematics20ApiV2.newInstance(options);

      expect(getAuthenticatorMock).not.toHaveBeenCalled();
      expect(testInstance.baseOptions.authenticator).toBeInstanceOf(NoAuthAuthenticator);
      expect(testInstance.baseOptions.serviceUrl).toBe('custom.com');
      expect(testInstance.baseOptions.serviceName).toBe('my-service');
      expect(testInstance).toBeInstanceOf(Schematics20ApiV2);
    });
  });
  describe('the constructor', () => {
    test('use user-given service url', () => {
      const options = {
        authenticator: new NoAuthAuthenticator(),
        serviceUrl: 'custom.com',
      };

      const testInstance = new Schematics20ApiV2(options);

      expect(testInstance.baseOptions.serviceUrl).toBe('custom.com');
    });

    test('use default service url', () => {
      const options = {
        authenticator: new NoAuthAuthenticator(),
      };

      const testInstance = new Schematics20ApiV2(options);

      expect(testInstance.baseOptions.serviceUrl).toBe(Schematics20ApiV2.DEFAULT_SERVICE_URL);
    });
  });
  describe('getSchematicsInfo', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getSchematicsInfo
        const params = {};

        const getSchematicsInfoResult = schematics20ApiService.getSchematicsInfo(params);

        // all methods should return a Promise
        expectToBePromise(getSchematicsInfoResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/info', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getSchematicsInfo(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.getSchematicsInfo({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('listSchematicsAccessRules', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listSchematicsAccessRules
        const params = {};

        const listSchematicsAccessRulesResult = schematics20ApiService.listSchematicsAccessRules(params);

        // all methods should return a Promise
        expectToBePromise(listSchematicsAccessRulesResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/access', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listSchematicsAccessRules(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.listSchematicsAccessRules({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('getSchematicsAccessRulesForResource', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getSchematicsAccessRulesForResource
        const resourceName = 'testString';
        const commandName = 'testString';
        const commandParameter = 'testString';
        const params = {
          resourceName: resourceName,
          commandName: commandName,
          commandParameter: commandParameter,
        };

        const getSchematicsAccessRulesForResourceResult = schematics20ApiService.getSchematicsAccessRulesForResource(params);

        // all methods should return a Promise
        expectToBePromise(getSchematicsAccessRulesForResourceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/access/{resource_name}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['command_name']).toEqual(commandName);
        expect(options.qs['command_parameter']).toEqual(commandParameter);
        expect(options.path['resource_name']).toEqual(resourceName);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const resourceName = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          resourceName,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getSchematicsAccessRulesForResource(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getSchematicsAccessRulesForResource({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getSchematicsAccessRulesForResourcePromise = schematics20ApiService.getSchematicsAccessRulesForResource();
        expectToBePromise(getSchematicsAccessRulesForResourcePromise);

        getSchematicsAccessRulesForResourcePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getSchematicsCommandNames', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getSchematicsCommandNames
        const resourceName = 'testString';
        const params = {
          resourceName: resourceName,
        };

        const getSchematicsCommandNamesResult = schematics20ApiService.getSchematicsCommandNames(params);

        // all methods should return a Promise
        expectToBePromise(getSchematicsCommandNamesResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/commands/{resource_name}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['resource_name']).toEqual(resourceName);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const resourceName = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          resourceName,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getSchematicsCommandNames(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getSchematicsCommandNames({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getSchematicsCommandNamesPromise = schematics20ApiService.getSchematicsCommandNames();
        expectToBePromise(getSchematicsCommandNamesPromise);

        getSchematicsCommandNamesPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listWorkspaces', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listWorkspaces
        const offset = 0;
        const limit = 1;
        const sort = 'testString';
        const profile = 'ids';
        const params = {
          offset: offset,
          limit: limit,
          sort: sort,
          profile: profile,
        };

        const listWorkspacesResult = schematics20ApiService.listWorkspaces(params);

        // all methods should return a Promise
        expectToBePromise(listWorkspacesResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['sort']).toEqual(sort);
        expect(options.qs['profile']).toEqual(profile);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listWorkspaces(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.listWorkspaces({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('createWorkspace', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // WorkspaceLiteState
      const workspaceLiteStateModel = {
        status_code: 'normal',
        status_message: 'testString',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Workspace
      const workspaceModel = {
        name: 'My Workspace',
        description: 'This workspace manages front-end micro service for production environment',
        resource_group: 'testString',
        tags: ['testString'],
        destroy_resources_on_delete: true,
        location: 'us-south',
        user_state: userStateModel,
        command_parameter: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        state: workspaceLiteStateModel,
        sys_lock: systemLockModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation createWorkspace
        const workspace = workspaceModel;
        const params = {
          workspace: workspace,
        };

        const createWorkspaceResult = schematics20ApiService.createWorkspace(params);

        // all methods should return a Promise
        expectToBePromise(createWorkspaceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(workspace);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspace = workspaceModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspace,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.createWorkspace(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.createWorkspace({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const createWorkspacePromise = schematics20ApiService.createWorkspace();
        expectToBePromise(createWorkspacePromise);

        createWorkspacePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getWorkspace', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getWorkspace
        const workspaceId = 'testString';
        const profile = 'summary';
        const params = {
          workspaceId: workspaceId,
          profile: profile,
        };

        const getWorkspaceResult = schematics20ApiService.getWorkspace(params);

        // all methods should return a Promise
        expectToBePromise(getWorkspaceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.path['workspace_id']).toEqual(workspaceId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getWorkspace(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getWorkspace({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getWorkspacePromise = schematics20ApiService.getWorkspace();
        expectToBePromise(getWorkspacePromise);

        getWorkspacePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('replaceWorkspace', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // WorkspaceLiteState
      const workspaceLiteStateModel = {
        status_code: 'normal',
        status_message: 'testString',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Workspace
      const workspaceModel = {
        name: 'My Workspace',
        description: 'This workspace manages front-end micro service for production environment',
        resource_group: 'testString',
        tags: ['testString'],
        destroy_resources_on_delete: true,
        location: 'us-south',
        user_state: userStateModel,
        command_parameter: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        state: workspaceLiteStateModel,
        sys_lock: systemLockModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation replaceWorkspace
        const workspaceId = 'testString';
        const workspace = workspaceModel;
        const params = {
          workspaceId: workspaceId,
          workspace: workspace,
        };

        const replaceWorkspaceResult = schematics20ApiService.replaceWorkspace(params);

        // all methods should return a Promise
        expectToBePromise(replaceWorkspaceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}', 'PUT');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(workspace);
        expect(options.path['workspace_id']).toEqual(workspaceId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const workspace = workspaceModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          workspace,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.replaceWorkspace(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.replaceWorkspace({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const replaceWorkspacePromise = schematics20ApiService.replaceWorkspace();
        expectToBePromise(replaceWorkspacePromise);

        replaceWorkspacePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('deleteWorkspace', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation deleteWorkspace
        const workspaceId = 'testString';
        const force = true;
        const propagate = true;
        const params = {
          workspaceId: workspaceId,
          force: force,
          propagate: propagate,
        };

        const deleteWorkspaceResult = schematics20ApiService.deleteWorkspace(params);

        // all methods should return a Promise
        expectToBePromise(deleteWorkspaceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}', 'DELETE');
        const expectedAccept = undefined;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'force', force);
        checkUserHeader(createRequestMock, 'propagate', propagate);
        expect(options.path['workspace_id']).toEqual(workspaceId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.deleteWorkspace(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.deleteWorkspace({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const deleteWorkspacePromise = schematics20ApiService.deleteWorkspace();
        expectToBePromise(deleteWorkspacePromise);

        deleteWorkspacePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('updateWorkspace', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // WorkspaceLiteState
      const workspaceLiteStateModel = {
        status_code: 'normal',
        status_message: 'testString',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Workspace
      const workspaceModel = {
        name: 'My Workspace',
        description: 'This workspace manages front-end micro service for production environment',
        resource_group: 'testString',
        tags: ['testString'],
        destroy_resources_on_delete: true,
        location: 'us-south',
        user_state: userStateModel,
        command_parameter: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        state: workspaceLiteStateModel,
        sys_lock: systemLockModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation updateWorkspace
        const workspaceId = 'testString';
        const workspace = workspaceModel;
        const params = {
          workspaceId: workspaceId,
          workspace: workspace,
        };

        const updateWorkspaceResult = schematics20ApiService.updateWorkspace(params);

        // all methods should return a Promise
        expectToBePromise(updateWorkspaceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}', 'PATCH');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(workspace);
        expect(options.path['workspace_id']).toEqual(workspaceId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const workspace = workspaceModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          workspace,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.updateWorkspace(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.updateWorkspace({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const updateWorkspacePromise = schematics20ApiService.updateWorkspace();
        expectToBePromise(updateWorkspacePromise);

        updateWorkspacePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listWorkspaceInputs', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listWorkspaceInputs
        const workspaceId = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          workspaceId: workspaceId,
          offset: offset,
          limit: limit,
        };

        const listWorkspaceInputsResult = schematics20ApiService.listWorkspaceInputs(params);

        // all methods should return a Promise
        expectToBePromise(listWorkspaceInputsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/inputs', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.path['workspace_id']).toEqual(workspaceId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listWorkspaceInputs(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.listWorkspaceInputs({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const listWorkspaceInputsPromise = schematics20ApiService.listWorkspaceInputs();
        expectToBePromise(listWorkspaceInputsPromise);

        listWorkspaceInputsPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listWorkspaceOutputs', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listWorkspaceOutputs
        const workspaceId = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          workspaceId: workspaceId,
          offset: offset,
          limit: limit,
        };

        const listWorkspaceOutputsResult = schematics20ApiService.listWorkspaceOutputs(params);

        // all methods should return a Promise
        expectToBePromise(listWorkspaceOutputsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/outputs', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.path['workspace_id']).toEqual(workspaceId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listWorkspaceOutputs(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.listWorkspaceOutputs({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const listWorkspaceOutputsPromise = schematics20ApiService.listWorkspaceOutputs();
        expectToBePromise(listWorkspaceOutputsPromise);

        listWorkspaceOutputsPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('createWorkspaceTemplates', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // JobStatusTemplate
      const jobStatusTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Template
      const templateModel = {
        name: 'vpc_terraform / helm_front_end_app_micro_service',
        description: 'This template provisions clusters in production environment',
        type: 'testString',
        user_state: userStateModel,
        source_type: 'local',
        source: externalSourceModel,
        source_readme_url: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        inventory: 'testString',
        status: jobStatusTemplateModel,
        sys_lock: systemLockModel,
        foo: 'testString',
      };

      // TemplateListRequest
      const templateListRequestModel = {
        templates: [templateModel],
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation createWorkspaceTemplates
        const templateListRequest = templateListRequestModel;
        const xGithubToken = 'testString';
        const params = {
          templateListRequest: templateListRequest,
          xGithubToken: xGithubToken,
        };

        const createWorkspaceTemplatesResult = schematics20ApiService.createWorkspaceTemplates(params);

        // all methods should return a Promise
        expectToBePromise(createWorkspaceTemplatesResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/templates', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'X-Github-token', xGithubToken);
        expect(options.body).toEqual(templateListRequest);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const templateListRequest = templateListRequestModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          templateListRequest,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.createWorkspaceTemplates(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.createWorkspaceTemplates({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const createWorkspaceTemplatesPromise = schematics20ApiService.createWorkspaceTemplates();
        expectToBePromise(createWorkspaceTemplatesPromise);

        createWorkspaceTemplatesPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listTemplatesInWorkspace', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listTemplatesInWorkspace
        const workspaceId = 'testString';
        const offset = 0;
        const limit = 1;
        const sort = 'testString';
        const profile = 'ids';
        const params = {
          workspaceId: workspaceId,
          offset: offset,
          limit: limit,
          sort: sort,
          profile: profile,
        };

        const listTemplatesInWorkspaceResult = schematics20ApiService.listTemplatesInWorkspace(params);

        // all methods should return a Promise
        expectToBePromise(listTemplatesInWorkspaceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/templates', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['sort']).toEqual(sort);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.path['workspace_id']).toEqual(workspaceId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listTemplatesInWorkspace(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.listTemplatesInWorkspace({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const listTemplatesInWorkspacePromise = schematics20ApiService.listTemplatesInWorkspace();
        expectToBePromise(listTemplatesInWorkspacePromise);

        listTemplatesInWorkspacePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('addTemplatesToWorkspace', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // JobStatusTemplate
      const jobStatusTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Template
      const templateModel = {
        name: 'vpc_terraform / helm_front_end_app_micro_service',
        description: 'This template provisions clusters in production environment',
        type: 'testString',
        user_state: userStateModel,
        source_type: 'local',
        source: externalSourceModel,
        source_readme_url: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        inventory: 'testString',
        status: jobStatusTemplateModel,
        sys_lock: systemLockModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation addTemplatesToWorkspace
        const workspaceId = 'testString';
        const template = templateModel;
        const xGithubToken = 'testString';
        const params = {
          workspaceId: workspaceId,
          template: template,
          xGithubToken: xGithubToken,
        };

        const addTemplatesToWorkspaceResult = schematics20ApiService.addTemplatesToWorkspace(params);

        // all methods should return a Promise
        expectToBePromise(addTemplatesToWorkspaceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/templates', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'X-Github-token', xGithubToken);
        expect(options.body).toEqual(template);
        expect(options.path['workspace_id']).toEqual(workspaceId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const template = templateModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          template,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.addTemplatesToWorkspace(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.addTemplatesToWorkspace({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const addTemplatesToWorkspacePromise = schematics20ApiService.addTemplatesToWorkspace();
        expectToBePromise(addTemplatesToWorkspacePromise);

        addTemplatesToWorkspacePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getTemplateInWorkspace', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getTemplateInWorkspace
        const workspaceId = 'testString';
        const templateId = 'testString';
        const profile = 'summary';
        const params = {
          workspaceId: workspaceId,
          templateId: templateId,
          profile: profile,
        };

        const getTemplateInWorkspaceResult = schematics20ApiService.getTemplateInWorkspace(params);

        // all methods should return a Promise
        expectToBePromise(getTemplateInWorkspaceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/templates/{template_id}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['template_id']).toEqual(templateId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const templateId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          templateId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getTemplateInWorkspace(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getTemplateInWorkspace({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getTemplateInWorkspacePromise = schematics20ApiService.getTemplateInWorkspace();
        expectToBePromise(getTemplateInWorkspacePromise);

        getTemplateInWorkspacePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('replaceTemplateInWorkspace', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // JobStatusTemplate
      const jobStatusTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Template
      const templateModel = {
        name: 'vpc_terraform / helm_front_end_app_micro_service',
        description: 'This template provisions clusters in production environment',
        type: 'testString',
        user_state: userStateModel,
        source_type: 'local',
        source: externalSourceModel,
        source_readme_url: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        inventory: 'testString',
        status: jobStatusTemplateModel,
        sys_lock: systemLockModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation replaceTemplateInWorkspace
        const workspaceId = 'testString';
        const templateId = 'testString';
        const template = templateModel;
        const xGithubToken = 'testString';
        const params = {
          workspaceId: workspaceId,
          templateId: templateId,
          template: template,
          xGithubToken: xGithubToken,
        };

        const replaceTemplateInWorkspaceResult = schematics20ApiService.replaceTemplateInWorkspace(params);

        // all methods should return a Promise
        expectToBePromise(replaceTemplateInWorkspaceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/templates/{template_id}', 'PUT');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'X-Github-token', xGithubToken);
        expect(options.body).toEqual(template);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['template_id']).toEqual(templateId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const templateId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          templateId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.replaceTemplateInWorkspace(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.replaceTemplateInWorkspace({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const replaceTemplateInWorkspacePromise = schematics20ApiService.replaceTemplateInWorkspace();
        expectToBePromise(replaceTemplateInWorkspacePromise);

        replaceTemplateInWorkspacePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('deleteTemplateFromWorkspace', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation deleteTemplateFromWorkspace
        const workspaceId = 'testString';
        const templateId = 'testString';
        const force = true;
        const propagate = true;
        const params = {
          workspaceId: workspaceId,
          templateId: templateId,
          force: force,
          propagate: propagate,
        };

        const deleteTemplateFromWorkspaceResult = schematics20ApiService.deleteTemplateFromWorkspace(params);

        // all methods should return a Promise
        expectToBePromise(deleteTemplateFromWorkspaceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/templates/{template_id}', 'DELETE');
        const expectedAccept = undefined;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'force', force);
        checkUserHeader(createRequestMock, 'propagate', propagate);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['template_id']).toEqual(templateId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const templateId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          templateId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.deleteTemplateFromWorkspace(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.deleteTemplateFromWorkspace({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const deleteTemplateFromWorkspacePromise = schematics20ApiService.deleteTemplateFromWorkspace();
        expectToBePromise(deleteTemplateFromWorkspacePromise);

        deleteTemplateFromWorkspacePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('updateTemplateInWorkspace', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // JobStatusTemplate
      const jobStatusTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Template
      const templateModel = {
        name: 'vpc_terraform / helm_front_end_app_micro_service',
        description: 'This template provisions clusters in production environment',
        type: 'testString',
        user_state: userStateModel,
        source_type: 'local',
        source: externalSourceModel,
        source_readme_url: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        inventory: 'testString',
        status: jobStatusTemplateModel,
        sys_lock: systemLockModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation updateTemplateInWorkspace
        const workspaceId = 'testString';
        const templateId = 'testString';
        const template = templateModel;
        const xGithubToken = 'testString';
        const params = {
          workspaceId: workspaceId,
          templateId: templateId,
          template: template,
          xGithubToken: xGithubToken,
        };

        const updateTemplateInWorkspaceResult = schematics20ApiService.updateTemplateInWorkspace(params);

        // all methods should return a Promise
        expectToBePromise(updateTemplateInWorkspaceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/templates/{template_id}', 'PATCH');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'X-Github-token', xGithubToken);
        expect(options.body).toEqual(template);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['template_id']).toEqual(templateId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const templateId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          templateId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.updateTemplateInWorkspace(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.updateTemplateInWorkspace({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const updateTemplateInWorkspacePromise = schematics20ApiService.updateTemplateInWorkspace();
        expectToBePromise(updateTemplateInWorkspacePromise);

        updateTemplateInWorkspacePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('uploadTemplateTarInWorkspace', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation uploadTemplateTarInWorkspace
        const workspaceId = 'testString';
        const templateId = 'testString';
        const tarFile = Buffer.from('This is a mock file.');
        const tarFileContentType = 'testString';
        const xGithubToken = 'testString';
        const params = {
          workspaceId: workspaceId,
          templateId: templateId,
          tarFile: tarFile,
          tarFileContentType: tarFileContentType,
          xGithubToken: xGithubToken,
        };

        const uploadTemplateTarInWorkspaceResult = schematics20ApiService.uploadTemplateTarInWorkspace(params);

        // all methods should return a Promise
        expectToBePromise(uploadTemplateTarInWorkspaceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/templates/{template_id}/content', 'PUT');
        const expectedAccept = 'application/json';
        const expectedContentType = 'multipart/form-data';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'X-Github-token', xGithubToken);
        expect(options.formData['tar_file'].data).toEqual(tarFile);
        expect(options.formData['tar_file'].contentType).toEqual(tarFileContentType);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['template_id']).toEqual(templateId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const templateId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          templateId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.uploadTemplateTarInWorkspace(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.uploadTemplateTarInWorkspace({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const uploadTemplateTarInWorkspacePromise = schematics20ApiService.uploadTemplateTarInWorkspace();
        expectToBePromise(uploadTemplateTarInWorkspacePromise);

        uploadTemplateTarInWorkspacePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getTemplateReadme', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getTemplateReadme
        const workspaceId = 'testString';
        const templateId = 'testString';
        const accept = 'text/markdown';
        const params = {
          workspaceId: workspaceId,
          templateId: templateId,
          accept: accept,
        };

        const getTemplateReadmeResult = schematics20ApiService.getTemplateReadme(params);

        // all methods should return a Promise
        expectToBePromise(getTemplateReadmeResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/templates/{template_id}/readme', 'GET');
        const expectedAccept = accept;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'Accept', accept);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['template_id']).toEqual(templateId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const templateId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          templateId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getTemplateReadme(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getTemplateReadme({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getTemplateReadmePromise = schematics20ApiService.getTemplateReadme();
        expectToBePromise(getTemplateReadmePromise);

        getTemplateReadmePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getTemplateSource', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getTemplateSource
        const workspaceId = 'testString';
        const templateId = 'testString';
        const params = {
          workspaceId: workspaceId,
          templateId: templateId,
        };

        const getTemplateSourceResult = schematics20ApiService.getTemplateSource(params);

        // all methods should return a Promise
        expectToBePromise(getTemplateSourceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/templates/{template_id}/source', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['template_id']).toEqual(templateId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const templateId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          templateId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getTemplateSource(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getTemplateSource({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getTemplateSourcePromise = schematics20ApiService.getTemplateSource();
        expectToBePromise(getTemplateSourcePromise);

        getTemplateSourcePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listTemplateInputs', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listTemplateInputs
        const workspaceId = 'testString';
        const templateId = 'testString';
        const params = {
          workspaceId: workspaceId,
          templateId: templateId,
        };

        const listTemplateInputsResult = schematics20ApiService.listTemplateInputs(params);

        // all methods should return a Promise
        expectToBePromise(listTemplateInputsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/templates/{template_id}/inputs', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['template_id']).toEqual(templateId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const templateId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          templateId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listTemplateInputs(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.listTemplateInputs({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const listTemplateInputsPromise = schematics20ApiService.listTemplateInputs();
        expectToBePromise(listTemplateInputsPromise);

        listTemplateInputsPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listTemplateOutputs', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listTemplateOutputs
        const workspaceId = 'testString';
        const templateId = 'testString';
        const params = {
          workspaceId: workspaceId,
          templateId: templateId,
        };

        const listTemplateOutputsResult = schematics20ApiService.listTemplateOutputs(params);

        // all methods should return a Promise
        expectToBePromise(listTemplateOutputsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/templates/{template_id}/outputs', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['template_id']).toEqual(templateId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const templateId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          templateId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listTemplateOutputs(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.listTemplateOutputs({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const listTemplateOutputsPromise = schematics20ApiService.listTemplateOutputs();
        expectToBePromise(listTemplateOutputsPromise);

        listTemplateOutputsPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listFlowsInWorkspace', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listFlowsInWorkspace
        const workspaceId = 'testString';
        const offset = 0;
        const limit = 1;
        const sort = 'testString';
        const profile = 'ids';
        const params = {
          workspaceId: workspaceId,
          offset: offset,
          limit: limit,
          sort: sort,
          profile: profile,
        };

        const listFlowsInWorkspaceResult = schematics20ApiService.listFlowsInWorkspace(params);

        // all methods should return a Promise
        expectToBePromise(listFlowsInWorkspaceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/flows', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['sort']).toEqual(sort);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.path['workspace_id']).toEqual(workspaceId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listFlowsInWorkspace(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.listFlowsInWorkspace({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const listFlowsInWorkspacePromise = schematics20ApiService.listFlowsInWorkspace();
        expectToBePromise(listFlowsInWorkspacePromise);

        listFlowsInWorkspacePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('addFlowToWorkspace', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // TemplateCommand
      const templateCommandModel = {
        command: 'workspace_plan',
        command_options: ['testString'],
        foo: 'testString',
      };

      // TemplateFlowDefinitionTemplateOperation
      const templateFlowDefinitionTemplateOperationModel = {
        pre_condition: 'testString',
        template_id: 'testString',
        override_command: templateCommandModel,
        post_condition: 'testString',
        on_error: 'testString',
        foo: 'testString',
      };

      // TemplateFlowDefinitionSimpleFlow
      const templateFlowDefinitionSimpleFlowModel = {
        index: 38,
        control: 'do',
        template_operation: templateFlowDefinitionTemplateOperationModel,
        foo: 'testString',
      };

      // TemplateFlowDefinition
      const templateFlowDefinitionModel = {
        flow_type: 'simple',
        id: 'testString',
        simple_flow: [templateFlowDefinitionSimpleFlowModel],
        custom_flow: 'This is a mock byte array value.',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusWorkspaceTemplateFlow
      const jobStatusWorkspaceTemplateFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // TemplateFlowValidationSummary
      const templateFlowValidationSummaryModel = {
        warning_count: 72.5,
        error_count: 72.5,
        foo: 'testString',
      };

      // TemplateFlow
      const templateFlowModel = {
        name: 'testString',
        version: 'testString',
        type: 'simple_flow',
        user_state: userStateModel,
        definition: templateFlowDefinitionModel,
        sys_lock: systemLockModel,
        status: jobStatusWorkspaceTemplateFlowModel,
        validation_summary: templateFlowValidationSummaryModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation addFlowToWorkspace
        const workspaceId = 'testString';
        const templateFlow = templateFlowModel;
        const params = {
          workspaceId: workspaceId,
          templateFlow: templateFlow,
        };

        const addFlowToWorkspaceResult = schematics20ApiService.addFlowToWorkspace(params);

        // all methods should return a Promise
        expectToBePromise(addFlowToWorkspaceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/flows', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(templateFlow);
        expect(options.path['workspace_id']).toEqual(workspaceId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const templateFlow = templateFlowModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          templateFlow,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.addFlowToWorkspace(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.addFlowToWorkspace({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const addFlowToWorkspacePromise = schematics20ApiService.addFlowToWorkspace();
        expectToBePromise(addFlowToWorkspacePromise);

        addFlowToWorkspacePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getFlowInWorkspace', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getFlowInWorkspace
        const workspaceId = 'testString';
        const flowId = 'testString';
        const profile = 'summary';
        const params = {
          workspaceId: workspaceId,
          flowId: flowId,
          profile: profile,
        };

        const getFlowInWorkspaceResult = schematics20ApiService.getFlowInWorkspace(params);

        // all methods should return a Promise
        expectToBePromise(getFlowInWorkspaceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/flows/{flow_id}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['flow_id']).toEqual(flowId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const flowId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          flowId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getFlowInWorkspace(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getFlowInWorkspace({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getFlowInWorkspacePromise = schematics20ApiService.getFlowInWorkspace();
        expectToBePromise(getFlowInWorkspacePromise);

        getFlowInWorkspacePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('replaceFlowInWorkspace', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // TemplateCommand
      const templateCommandModel = {
        command: 'workspace_plan',
        command_options: ['testString'],
        foo: 'testString',
      };

      // TemplateFlowDefinitionTemplateOperation
      const templateFlowDefinitionTemplateOperationModel = {
        pre_condition: 'testString',
        template_id: 'testString',
        override_command: templateCommandModel,
        post_condition: 'testString',
        on_error: 'testString',
        foo: 'testString',
      };

      // TemplateFlowDefinitionSimpleFlow
      const templateFlowDefinitionSimpleFlowModel = {
        index: 38,
        control: 'do',
        template_operation: templateFlowDefinitionTemplateOperationModel,
        foo: 'testString',
      };

      // TemplateFlowDefinition
      const templateFlowDefinitionModel = {
        flow_type: 'simple',
        id: 'testString',
        simple_flow: [templateFlowDefinitionSimpleFlowModel],
        custom_flow: 'This is a mock byte array value.',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusWorkspaceTemplateFlow
      const jobStatusWorkspaceTemplateFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // TemplateFlowValidationSummary
      const templateFlowValidationSummaryModel = {
        warning_count: 72.5,
        error_count: 72.5,
        foo: 'testString',
      };

      // TemplateFlow
      const templateFlowModel = {
        name: 'testString',
        version: 'testString',
        type: 'simple_flow',
        user_state: userStateModel,
        definition: templateFlowDefinitionModel,
        sys_lock: systemLockModel,
        status: jobStatusWorkspaceTemplateFlowModel,
        validation_summary: templateFlowValidationSummaryModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation replaceFlowInWorkspace
        const workspaceId = 'testString';
        const flowId = 'testString';
        const templateFlow = templateFlowModel;
        const params = {
          workspaceId: workspaceId,
          flowId: flowId,
          templateFlow: templateFlow,
        };

        const replaceFlowInWorkspaceResult = schematics20ApiService.replaceFlowInWorkspace(params);

        // all methods should return a Promise
        expectToBePromise(replaceFlowInWorkspaceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/flows/{flow_id}', 'PUT');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(templateFlow);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['flow_id']).toEqual(flowId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const flowId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          flowId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.replaceFlowInWorkspace(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.replaceFlowInWorkspace({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const replaceFlowInWorkspacePromise = schematics20ApiService.replaceFlowInWorkspace();
        expectToBePromise(replaceFlowInWorkspacePromise);

        replaceFlowInWorkspacePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('deleteFlowFromWorkspace', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation deleteFlowFromWorkspace
        const workspaceId = 'testString';
        const flowId = 'testString';
        const propagate = true;
        const force = true;
        const params = {
          workspaceId: workspaceId,
          flowId: flowId,
          propagate: propagate,
          force: force,
        };

        const deleteFlowFromWorkspaceResult = schematics20ApiService.deleteFlowFromWorkspace(params);

        // all methods should return a Promise
        expectToBePromise(deleteFlowFromWorkspaceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/flows/{flow_id}', 'DELETE');
        const expectedAccept = undefined;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'propagate', propagate);
        checkUserHeader(createRequestMock, 'force', force);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['flow_id']).toEqual(flowId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const flowId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          flowId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.deleteFlowFromWorkspace(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.deleteFlowFromWorkspace({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const deleteFlowFromWorkspacePromise = schematics20ApiService.deleteFlowFromWorkspace();
        expectToBePromise(deleteFlowFromWorkspacePromise);

        deleteFlowFromWorkspacePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('updateFlowInWorkspace', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // TemplateCommand
      const templateCommandModel = {
        command: 'workspace_plan',
        command_options: ['testString'],
        foo: 'testString',
      };

      // TemplateFlowDefinitionTemplateOperation
      const templateFlowDefinitionTemplateOperationModel = {
        pre_condition: 'testString',
        template_id: 'testString',
        override_command: templateCommandModel,
        post_condition: 'testString',
        on_error: 'testString',
        foo: 'testString',
      };

      // TemplateFlowDefinitionSimpleFlow
      const templateFlowDefinitionSimpleFlowModel = {
        index: 38,
        control: 'do',
        template_operation: templateFlowDefinitionTemplateOperationModel,
        foo: 'testString',
      };

      // TemplateFlowDefinition
      const templateFlowDefinitionModel = {
        flow_type: 'simple',
        id: 'testString',
        simple_flow: [templateFlowDefinitionSimpleFlowModel],
        custom_flow: 'This is a mock byte array value.',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusWorkspaceTemplateFlow
      const jobStatusWorkspaceTemplateFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // TemplateFlowValidationSummary
      const templateFlowValidationSummaryModel = {
        warning_count: 72.5,
        error_count: 72.5,
        foo: 'testString',
      };

      // TemplateFlow
      const templateFlowModel = {
        name: 'testString',
        version: 'testString',
        type: 'simple_flow',
        user_state: userStateModel,
        definition: templateFlowDefinitionModel,
        sys_lock: systemLockModel,
        status: jobStatusWorkspaceTemplateFlowModel,
        validation_summary: templateFlowValidationSummaryModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation updateFlowInWorkspace
        const workspaceId = 'testString';
        const flowId = 'testString';
        const templateFlow = templateFlowModel;
        const params = {
          workspaceId: workspaceId,
          flowId: flowId,
          templateFlow: templateFlow,
        };

        const updateFlowInWorkspaceResult = schematics20ApiService.updateFlowInWorkspace(params);

        // all methods should return a Promise
        expectToBePromise(updateFlowInWorkspaceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/flows/{flow_id}', 'PATCH');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(templateFlow);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['flow_id']).toEqual(flowId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const flowId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          flowId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.updateFlowInWorkspace(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.updateFlowInWorkspace({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const updateFlowInWorkspacePromise = schematics20ApiService.updateFlowInWorkspace();
        expectToBePromise(updateFlowInWorkspacePromise);

        updateFlowInWorkspacePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listActions', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listActions
        const offset = 0;
        const limit = 1;
        const sort = 'testString';
        const profile = 'ids';
        const params = {
          offset: offset,
          limit: limit,
          sort: sort,
          profile: profile,
        };

        const listActionsResult = schematics20ApiService.listActions(params);

        // all methods should return a Promise
        expectToBePromise(listActionsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/actions', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['sort']).toEqual(sort);
        expect(options.qs['profile']).toEqual(profile);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listActions(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.listActions({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('createAction', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // BastionResourceDefinition
      const bastionResourceDefinitionModel = {
        name: 'testString',
        host: 'testString',
        foo: 'testString',
      };

      // ActionState
      const actionStateModel = {
        status_code: 'normal',
        status_job_id: 'testString',
        status_message: 'testString',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Action
      const actionModel = {
        name: 'Stop Action',
        description: 'The description of your action. The description can be up to 2048 characters long in size. **Example** you can use the description to stop the targets.',
        location: 'us-south',
        resource_group: 'testString',
        tags: ['testString'],
        user_state: userStateModel,
        source_readme_url: 'testString',
        source: externalSourceModel,
        source_type: 'local',
        command_parameter: 'testString',
        inventory: 'testString',
        credentials: [variableDataModel],
        bastion: bastionResourceDefinitionModel,
        bastion_credential: variableDataModel,
        targets_ini: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        state: actionStateModel,
        sys_lock: systemLockModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation createAction
        const action = actionModel;
        const xGithubToken = 'testString';
        const params = {
          action: action,
          xGithubToken: xGithubToken,
        };

        const createActionResult = schematics20ApiService.createAction(params);

        // all methods should return a Promise
        expectToBePromise(createActionResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/actions', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'X-Github-token', xGithubToken);
        expect(options.body).toEqual(action);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const action = actionModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          action,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.createAction(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.createAction({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const createActionPromise = schematics20ApiService.createAction();
        expectToBePromise(createActionPromise);

        createActionPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getAction', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getAction
        const actionId = 'testString';
        const profile = 'summary';
        const params = {
          actionId: actionId,
          profile: profile,
        };

        const getActionResult = schematics20ApiService.getAction(params);

        // all methods should return a Promise
        expectToBePromise(getActionResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/actions/{action_id}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.path['action_id']).toEqual(actionId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const actionId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          actionId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getAction(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getAction({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getActionPromise = schematics20ApiService.getAction();
        expectToBePromise(getActionPromise);

        getActionPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('deleteAction', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation deleteAction
        const actionId = 'testString';
        const force = true;
        const propagate = true;
        const params = {
          actionId: actionId,
          force: force,
          propagate: propagate,
        };

        const deleteActionResult = schematics20ApiService.deleteAction(params);

        // all methods should return a Promise
        expectToBePromise(deleteActionResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/actions/{action_id}', 'DELETE');
        const expectedAccept = undefined;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'force', force);
        checkUserHeader(createRequestMock, 'propagate', propagate);
        expect(options.path['action_id']).toEqual(actionId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const actionId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          actionId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.deleteAction(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.deleteAction({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const deleteActionPromise = schematics20ApiService.deleteAction();
        expectToBePromise(deleteActionPromise);

        deleteActionPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('updateAction', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // BastionResourceDefinition
      const bastionResourceDefinitionModel = {
        name: 'testString',
        host: 'testString',
        foo: 'testString',
      };

      // ActionState
      const actionStateModel = {
        status_code: 'normal',
        status_job_id: 'testString',
        status_message: 'testString',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Action
      const actionModel = {
        name: 'Stop Action',
        description: 'The description of your action. The description can be up to 2048 characters long in size. **Example** you can use the description to stop the targets.',
        location: 'us-south',
        resource_group: 'testString',
        tags: ['testString'],
        user_state: userStateModel,
        source_readme_url: 'testString',
        source: externalSourceModel,
        source_type: 'local',
        command_parameter: 'testString',
        inventory: 'testString',
        credentials: [variableDataModel],
        bastion: bastionResourceDefinitionModel,
        bastion_credential: variableDataModel,
        targets_ini: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        state: actionStateModel,
        sys_lock: systemLockModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation updateAction
        const actionId = 'testString';
        const action = actionModel;
        const xGithubToken = 'testString';
        const params = {
          actionId: actionId,
          action: action,
          xGithubToken: xGithubToken,
        };

        const updateActionResult = schematics20ApiService.updateAction(params);

        // all methods should return a Promise
        expectToBePromise(updateActionResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/actions/{action_id}', 'PATCH');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'X-Github-token', xGithubToken);
        expect(options.body).toEqual(action);
        expect(options.path['action_id']).toEqual(actionId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const actionId = 'testString';
        const action = actionModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          actionId,
          action,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.updateAction(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.updateAction({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const updateActionPromise = schematics20ApiService.updateAction();
        expectToBePromise(updateActionPromise);

        updateActionPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('uploadTemplateTarAction', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation uploadTemplateTarAction
        const actionId = 'testString';
        const file = Buffer.from('This is a mock file.');
        const fileContentType = 'testString';
        const params = {
          actionId: actionId,
          file: file,
          fileContentType: fileContentType,
        };

        const uploadTemplateTarActionResult = schematics20ApiService.uploadTemplateTarAction(params);

        // all methods should return a Promise
        expectToBePromise(uploadTemplateTarActionResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/actions/{action_id}/template_repo_upload', 'PUT');
        const expectedAccept = 'application/json';
        const expectedContentType = 'multipart/form-data';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.formData['file'].data).toEqual(file);
        expect(options.formData['file'].contentType).toEqual(fileContentType);
        expect(options.path['action_id']).toEqual(actionId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const actionId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          actionId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.uploadTemplateTarAction(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.uploadTemplateTarAction({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const uploadTemplateTarActionPromise = schematics20ApiService.uploadTemplateTarAction();
        expectToBePromise(uploadTemplateTarActionPromise);

        uploadTemplateTarActionPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listJobs', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listJobs
        const offset = 0;
        const limit = 1;
        const sort = 'testString';
        const profile = 'ids';
        const resource = 'workspace';
        const resourceId = 'testString';
        const actionId = 'testString';
        const list = 'all';
        const params = {
          offset: offset,
          limit: limit,
          sort: sort,
          profile: profile,
          resource: resource,
          resourceId: resourceId,
          actionId: actionId,
          list: list,
        };

        const listJobsResult = schematics20ApiService.listJobs(params);

        // all methods should return a Promise
        expectToBePromise(listJobsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/jobs', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['sort']).toEqual(sort);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.qs['resource']).toEqual(resource);
        expect(options.qs['resource_id']).toEqual(resourceId);
        expect(options.qs['action_id']).toEqual(actionId);
        expect(options.qs['list']).toEqual(list);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listJobs(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.listJobs({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('createJob', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // JobStatusWorkitem
      const jobStatusWorkitemModel = {
        workspace_id: 'testString',
        workspace_name: 'testString',
        job_id: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusFlow
      const jobStatusFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        workitems: [jobStatusWorkitemModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusTemplate
      const jobStatusTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusWorkspace
      const jobStatusWorkspaceModel = {
        workspace_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        flow_status: jobStatusFlowModel,
        template_status: [jobStatusTemplateModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusAction
      const jobStatusActionModel = {
        action_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        bastion_status_code: 'none',
        bastion_status_message: 'testString',
        targets_status_code: 'none',
        targets_status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusSchematicsResources
      const jobStatusSchematicsResourcesModel = {
        status_code: 'job_pending',
        status_message: 'testString',
        schematics_resource_id: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusSystem
      const jobStatusSystemModel = {
        system_status_message: 'testString',
        system_status_code: 'job_pending',
        schematics_resource_status: [jobStatusSchematicsResourcesModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatus
      const jobStatusModel = {
        workspace_job_status: jobStatusWorkspaceModel,
        action_job_status: jobStatusActionModel,
        system_job_status: jobStatusSystemModel,
        flow_job_status: jobStatusFlowModel,
        foo: 'testString',
      };

      // JobDataTemplate
      const jobDataTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataWorkspace
      const jobDataWorkspaceModel = {
        workspace_name: 'testString',
        flow_id: 'testString',
        flow_name: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        template_data: [jobDataTemplateModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // InventoryResourceRecord
      const inventoryResourceRecordModel = {
        name: 'testString',
        description: 'testString',
        location: 'us-south',
        resource_group: 'testString',
        inventories_ini: 'testString',
        resource_queries: ['testString'],
        foo: 'testString',
      };

      // JobDataAction
      const jobDataActionModel = {
        action_name: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        inventory_record: inventoryResourceRecordModel,
        materialized_inventory: 'testString',
        foo: 'testString',
      };

      // JobDataSystem
      const jobDataSystemModel = {
        key_id: 'testString',
        schematics_resource_id: ['testString'],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // JobDataWorkItemLastJob
      const jobDataWorkItemLastJobModel = {
        command_object: 'workspace',
        command_object_name: 'testString',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        job_id: 'testString',
        job_status: 'job_pending',
        foo: 'testString',
      };

      // JobDataWorkItem
      const jobDataWorkItemModel = {
        command_object_id: 'testString',
        command_object_name: 'testString',
        layers: 'testString',
        source_type: 'local',
        source: externalSourceModel,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        last_job: jobDataWorkItemLastJobModel,
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataFlow
      const jobDataFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        workitems: [jobDataWorkItemModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobData
      const jobDataModel = {
        job_type: 'repo_download_job',
        workspace_job_data: jobDataWorkspaceModel,
        action_job_data: jobDataActionModel,
        system_job_data: jobDataSystemModel,
        flow_job_data: jobDataFlowModel,
        foo: 'testString',
      };

      // BastionResourceDefinition
      const bastionResourceDefinitionModel = {
        name: 'testString',
        host: 'testString',
        foo: 'testString',
      };

      // JobLogSummaryRepoDownloadJob
      const jobLogSummaryRepoDownloadJobModel = {
        foo: 'testString',
      };

      // JobLogSummaryWorkspaceJob
      const jobLogSummaryWorkspaceJobModel = {
        foo: 'testString',
      };

      // JobLogSummaryWorkitems
      const jobLogSummaryWorkitemsModel = {
        workspace_id: 'testString',
        job_id: 'testString',
        log_url: 'testString',
        foo: 'testString',
      };

      // JobLogSummaryFlowJob
      const jobLogSummaryFlowJobModel = {
        workitems: [jobLogSummaryWorkitemsModel],
        foo: 'testString',
      };

      // JobLogSummaryActionJobRecap
      const jobLogSummaryActionJobRecapModel = {
        target: ['testString'],
        ok: 72.5,
        changed: 72.5,
        failed: 72.5,
        skipped: 72.5,
        unreachable: 72.5,
        foo: 'testString',
      };

      // JobLogSummaryActionJob
      const jobLogSummaryActionJobModel = {
        recap: jobLogSummaryActionJobRecapModel,
        foo: 'testString',
      };

      // JobLogSummarySystemJob
      const jobLogSummarySystemJobModel = {
        success: 72.5,
        failed: 72.5,
        foo: 'testString',
      };

      // JobLogSummary
      const jobLogSummaryModel = {
        job_type: 'repo_download_job',
        repo_download_job: jobLogSummaryRepoDownloadJobModel,
        workspace_job: jobLogSummaryWorkspaceJobModel,
        flow_job: jobLogSummaryFlowJobModel,
        action_job: jobLogSummaryActionJobModel,
        system_job: jobLogSummarySystemJobModel,
        foo: 'testString',
      };

      // Job
      const jobModel = {
        command_object: 'workspace',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        command_parameter: 'testString',
        command_options: ['testString'],
        inputs: [variableDataModel],
        settings: [variableDataModel],
        tags: ['testString'],
        location: 'us-south',
        status: jobStatusModel,
        data: jobDataModel,
        bastion: bastionResourceDefinitionModel,
        log_summary: jobLogSummaryModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation createJob
        const refreshToken = 'testString';
        const job = jobModel;
        const params = {
          refreshToken: refreshToken,
          job: job,
        };

        const createJobResult = schematics20ApiService.createJob(params);

        // all methods should return a Promise
        expectToBePromise(createJobResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/jobs', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'refresh_token', refreshToken);
        expect(options.body).toEqual(job);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const refreshToken = 'testString';
        const job = jobModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          refreshToken,
          job,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.createJob(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.createJob({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const createJobPromise = schematics20ApiService.createJob();
        expectToBePromise(createJobPromise);

        createJobPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getJob', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getJob
        const jobId = 'testString';
        const profile = 'summary';
        const params = {
          jobId: jobId,
          profile: profile,
        };

        const getJobResult = schematics20ApiService.getJob(params);

        // all methods should return a Promise
        expectToBePromise(getJobResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/jobs/{job_id}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.path['job_id']).toEqual(jobId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const jobId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          jobId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getJob(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getJob({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getJobPromise = schematics20ApiService.getJob();
        expectToBePromise(getJobPromise);

        getJobPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('updateJob', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // JobStatusWorkitem
      const jobStatusWorkitemModel = {
        workspace_id: 'testString',
        workspace_name: 'testString',
        job_id: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusFlow
      const jobStatusFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        workitems: [jobStatusWorkitemModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusTemplate
      const jobStatusTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusWorkspace
      const jobStatusWorkspaceModel = {
        workspace_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        flow_status: jobStatusFlowModel,
        template_status: [jobStatusTemplateModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusAction
      const jobStatusActionModel = {
        action_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        bastion_status_code: 'none',
        bastion_status_message: 'testString',
        targets_status_code: 'none',
        targets_status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusSchematicsResources
      const jobStatusSchematicsResourcesModel = {
        status_code: 'job_pending',
        status_message: 'testString',
        schematics_resource_id: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusSystem
      const jobStatusSystemModel = {
        system_status_message: 'testString',
        system_status_code: 'job_pending',
        schematics_resource_status: [jobStatusSchematicsResourcesModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatus
      const jobStatusModel = {
        workspace_job_status: jobStatusWorkspaceModel,
        action_job_status: jobStatusActionModel,
        system_job_status: jobStatusSystemModel,
        flow_job_status: jobStatusFlowModel,
        foo: 'testString',
      };

      // JobDataTemplate
      const jobDataTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataWorkspace
      const jobDataWorkspaceModel = {
        workspace_name: 'testString',
        flow_id: 'testString',
        flow_name: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        template_data: [jobDataTemplateModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // InventoryResourceRecord
      const inventoryResourceRecordModel = {
        name: 'testString',
        description: 'testString',
        location: 'us-south',
        resource_group: 'testString',
        inventories_ini: 'testString',
        resource_queries: ['testString'],
        foo: 'testString',
      };

      // JobDataAction
      const jobDataActionModel = {
        action_name: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        inventory_record: inventoryResourceRecordModel,
        materialized_inventory: 'testString',
        foo: 'testString',
      };

      // JobDataSystem
      const jobDataSystemModel = {
        key_id: 'testString',
        schematics_resource_id: ['testString'],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // JobDataWorkItemLastJob
      const jobDataWorkItemLastJobModel = {
        command_object: 'workspace',
        command_object_name: 'testString',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        job_id: 'testString',
        job_status: 'job_pending',
        foo: 'testString',
      };

      // JobDataWorkItem
      const jobDataWorkItemModel = {
        command_object_id: 'testString',
        command_object_name: 'testString',
        layers: 'testString',
        source_type: 'local',
        source: externalSourceModel,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        last_job: jobDataWorkItemLastJobModel,
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataFlow
      const jobDataFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        workitems: [jobDataWorkItemModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobData
      const jobDataModel = {
        job_type: 'repo_download_job',
        workspace_job_data: jobDataWorkspaceModel,
        action_job_data: jobDataActionModel,
        system_job_data: jobDataSystemModel,
        flow_job_data: jobDataFlowModel,
        foo: 'testString',
      };

      // BastionResourceDefinition
      const bastionResourceDefinitionModel = {
        name: 'testString',
        host: 'testString',
        foo: 'testString',
      };

      // JobLogSummaryRepoDownloadJob
      const jobLogSummaryRepoDownloadJobModel = {
        foo: 'testString',
      };

      // JobLogSummaryWorkspaceJob
      const jobLogSummaryWorkspaceJobModel = {
        foo: 'testString',
      };

      // JobLogSummaryWorkitems
      const jobLogSummaryWorkitemsModel = {
        workspace_id: 'testString',
        job_id: 'testString',
        log_url: 'testString',
        foo: 'testString',
      };

      // JobLogSummaryFlowJob
      const jobLogSummaryFlowJobModel = {
        workitems: [jobLogSummaryWorkitemsModel],
        foo: 'testString',
      };

      // JobLogSummaryActionJobRecap
      const jobLogSummaryActionJobRecapModel = {
        target: ['testString'],
        ok: 72.5,
        changed: 72.5,
        failed: 72.5,
        skipped: 72.5,
        unreachable: 72.5,
        foo: 'testString',
      };

      // JobLogSummaryActionJob
      const jobLogSummaryActionJobModel = {
        recap: jobLogSummaryActionJobRecapModel,
        foo: 'testString',
      };

      // JobLogSummarySystemJob
      const jobLogSummarySystemJobModel = {
        success: 72.5,
        failed: 72.5,
        foo: 'testString',
      };

      // JobLogSummary
      const jobLogSummaryModel = {
        job_type: 'repo_download_job',
        repo_download_job: jobLogSummaryRepoDownloadJobModel,
        workspace_job: jobLogSummaryWorkspaceJobModel,
        flow_job: jobLogSummaryFlowJobModel,
        action_job: jobLogSummaryActionJobModel,
        system_job: jobLogSummarySystemJobModel,
        foo: 'testString',
      };

      // Job
      const jobModel = {
        command_object: 'workspace',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        command_parameter: 'testString',
        command_options: ['testString'],
        inputs: [variableDataModel],
        settings: [variableDataModel],
        tags: ['testString'],
        location: 'us-south',
        status: jobStatusModel,
        data: jobDataModel,
        bastion: bastionResourceDefinitionModel,
        log_summary: jobLogSummaryModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation updateJob
        const jobId = 'testString';
        const refreshToken = 'testString';
        const job = jobModel;
        const params = {
          jobId: jobId,
          refreshToken: refreshToken,
          job: job,
        };

        const updateJobResult = schematics20ApiService.updateJob(params);

        // all methods should return a Promise
        expectToBePromise(updateJobResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/jobs/{job_id}', 'PUT');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'refresh_token', refreshToken);
        expect(options.body).toEqual(job);
        expect(options.path['job_id']).toEqual(jobId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const jobId = 'testString';
        const refreshToken = 'testString';
        const job = jobModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          jobId,
          refreshToken,
          job,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.updateJob(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.updateJob({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const updateJobPromise = schematics20ApiService.updateJob();
        expectToBePromise(updateJobPromise);

        updateJobPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('deleteJob', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation deleteJob
        const jobId = 'testString';
        const refreshToken = 'testString';
        const force = true;
        const propagate = true;
        const params = {
          jobId: jobId,
          refreshToken: refreshToken,
          force: force,
          propagate: propagate,
        };

        const deleteJobResult = schematics20ApiService.deleteJob(params);

        // all methods should return a Promise
        expectToBePromise(deleteJobResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/jobs/{job_id}', 'DELETE');
        const expectedAccept = undefined;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'refresh_token', refreshToken);
        checkUserHeader(createRequestMock, 'force', force);
        checkUserHeader(createRequestMock, 'propagate', propagate);
        expect(options.path['job_id']).toEqual(jobId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const jobId = 'testString';
        const refreshToken = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          jobId,
          refreshToken,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.deleteJob(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.deleteJob({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const deleteJobPromise = schematics20ApiService.deleteJob();
        expectToBePromise(deleteJobPromise);

        deleteJobPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listJobLogs', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listJobLogs
        const jobId = 'testString';
        const params = {
          jobId: jobId,
        };

        const listJobLogsResult = schematics20ApiService.listJobLogs(params);

        // all methods should return a Promise
        expectToBePromise(listJobLogsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/jobs/{job_id}/logs', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['job_id']).toEqual(jobId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const jobId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          jobId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listJobLogs(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.listJobLogs({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const listJobLogsPromise = schematics20ApiService.listJobLogs();
        expectToBePromise(listJobLogsPromise);

        listJobLogsPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listJobStates', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listJobStates
        const jobId = 'testString';
        const params = {
          jobId: jobId,
        };

        const listJobStatesResult = schematics20ApiService.listJobStates(params);

        // all methods should return a Promise
        expectToBePromise(listJobStatesResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/jobs/{job_id}/states', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['job_id']).toEqual(jobId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const jobId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          jobId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listJobStates(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.listJobStates({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const listJobStatesPromise = schematics20ApiService.listJobStates();
        expectToBePromise(listJobStatesPromise);

        listJobStatesPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listControls', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listControls
        const offset = 0;
        const limit = 1;
        const sort = 'testString';
        const profile = 'ids';
        const params = {
          offset: offset,
          limit: limit,
          sort: sort,
          profile: profile,
        };

        const listControlsResult = schematics20ApiService.listControls(params);

        // all methods should return a Promise
        expectToBePromise(listControlsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/controls', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['sort']).toEqual(sort);
        expect(options.qs['profile']).toEqual(profile);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listControls(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.listControls({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('createControls', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusWorkitem
      const jobStatusWorkitemModel = {
        workspace_id: 'testString',
        workspace_name: 'testString',
        job_id: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusFlow
      const jobStatusFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        workitems: [jobStatusWorkitemModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusTemplate
      const jobStatusTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusWorkspace
      const jobStatusWorkspaceModel = {
        workspace_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        flow_status: jobStatusFlowModel,
        template_status: [jobStatusTemplateModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusAction
      const jobStatusActionModel = {
        action_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        bastion_status_code: 'none',
        bastion_status_message: 'testString',
        targets_status_code: 'none',
        targets_status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusSchematicsResources
      const jobStatusSchematicsResourcesModel = {
        status_code: 'job_pending',
        status_message: 'testString',
        schematics_resource_id: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusSystem
      const jobStatusSystemModel = {
        system_status_message: 'testString',
        system_status_code: 'job_pending',
        schematics_resource_status: [jobStatusSchematicsResourcesModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatus
      const jobStatusModel = {
        workspace_job_status: jobStatusWorkspaceModel,
        action_job_status: jobStatusActionModel,
        system_job_status: jobStatusSystemModel,
        flow_job_status: jobStatusFlowModel,
        foo: 'testString',
      };

      // JobDataTemplate
      const jobDataTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataWorkspace
      const jobDataWorkspaceModel = {
        workspace_name: 'testString',
        flow_id: 'testString',
        flow_name: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        template_data: [jobDataTemplateModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // InventoryResourceRecord
      const inventoryResourceRecordModel = {
        name: 'testString',
        description: 'testString',
        location: 'us-south',
        resource_group: 'testString',
        inventories_ini: 'testString',
        resource_queries: ['testString'],
        foo: 'testString',
      };

      // JobDataAction
      const jobDataActionModel = {
        action_name: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        inventory_record: inventoryResourceRecordModel,
        materialized_inventory: 'testString',
        foo: 'testString',
      };

      // JobDataSystem
      const jobDataSystemModel = {
        key_id: 'testString',
        schematics_resource_id: ['testString'],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataWorkItemLastJob
      const jobDataWorkItemLastJobModel = {
        command_object: 'workspace',
        command_object_name: 'testString',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        job_id: 'testString',
        job_status: 'job_pending',
        foo: 'testString',
      };

      // JobDataWorkItem
      const jobDataWorkItemModel = {
        command_object_id: 'testString',
        command_object_name: 'testString',
        layers: 'testString',
        source_type: 'local',
        source: externalSourceModel,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        last_job: jobDataWorkItemLastJobModel,
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataFlow
      const jobDataFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        workitems: [jobDataWorkItemModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobData
      const jobDataModel = {
        job_type: 'repo_download_job',
        workspace_job_data: jobDataWorkspaceModel,
        action_job_data: jobDataActionModel,
        system_job_data: jobDataSystemModel,
        flow_job_data: jobDataFlowModel,
        foo: 'testString',
      };

      // BastionResourceDefinition
      const bastionResourceDefinitionModel = {
        name: 'testString',
        host: 'testString',
        foo: 'testString',
      };

      // JobLogSummaryRepoDownloadJob
      const jobLogSummaryRepoDownloadJobModel = {
        foo: 'testString',
      };

      // JobLogSummaryWorkspaceJob
      const jobLogSummaryWorkspaceJobModel = {
        foo: 'testString',
      };

      // JobLogSummaryWorkitems
      const jobLogSummaryWorkitemsModel = {
        workspace_id: 'testString',
        job_id: 'testString',
        log_url: 'testString',
        foo: 'testString',
      };

      // JobLogSummaryFlowJob
      const jobLogSummaryFlowJobModel = {
        workitems: [jobLogSummaryWorkitemsModel],
        foo: 'testString',
      };

      // JobLogSummaryActionJobRecap
      const jobLogSummaryActionJobRecapModel = {
        target: ['testString'],
        ok: 72.5,
        changed: 72.5,
        failed: 72.5,
        skipped: 72.5,
        unreachable: 72.5,
        foo: 'testString',
      };

      // JobLogSummaryActionJob
      const jobLogSummaryActionJobModel = {
        recap: jobLogSummaryActionJobRecapModel,
        foo: 'testString',
      };

      // JobLogSummarySystemJob
      const jobLogSummarySystemJobModel = {
        success: 72.5,
        failed: 72.5,
        foo: 'testString',
      };

      // JobLogSummary
      const jobLogSummaryModel = {
        job_type: 'repo_download_job',
        repo_download_job: jobLogSummaryRepoDownloadJobModel,
        workspace_job: jobLogSummaryWorkspaceJobModel,
        flow_job: jobLogSummaryFlowJobModel,
        action_job: jobLogSummaryActionJobModel,
        system_job: jobLogSummarySystemJobModel,
        foo: 'testString',
      };

      // Job
      const jobModel = {
        command_object: 'workspace',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        command_parameter: 'testString',
        command_options: ['testString'],
        inputs: [variableDataModel],
        settings: [variableDataModel],
        tags: ['testString'],
        location: 'us-south',
        status: jobStatusModel,
        data: jobDataModel,
        bastion: bastionResourceDefinitionModel,
        log_summary: jobLogSummaryModel,
        foo: 'testString',
      };

      // TriggerJob
      const triggerJobModel = {
        event: 'before | after',
        job: jobModel,
        foo: 'testString',
      };

      // TriggerScheduled
      const triggerScheduledModel = {
        frequency: 'daily | weekly',
        time: 'time in UTC',
        day: 'expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday',
        foo: 'testString',
      };

      // ControlsDecision
      const controlsDecisionModel = {
        rule: 'testString',
        pass_value: 'before',
        pass_expr: '== OR != OR <= OR >= OR > OR <',
        evidence_found_in: 'rule emitting details',
        foo: 'testString',
      };

      // ControlsEscalation
      const controlsEscalationModel = {
        action_id: 'testString',
        foo: 'testString',
      };

      // ControlsLiteState
      const controlsLiteStateModel = {
        status_code: 'normal',
        status_message: 'testString',
        foo: 'testString',
      };

      // CapsuleResultResources
      const capsuleResultResourcesModel = {
        name: 'testString',
        type: 'testString',
        foo: 'testString',
      };

      // CapsuleResultEvidences
      const capsuleResultEvidencesModel = {
        resources: [capsuleResultResourcesModel],
        foo: 'testString',
      };

      // JobResultCapsule
      const jobResultCapsuleModel = {
        job_id: 'testString',
        job_name: 'testString',
        policy: 'testString',
        severity: 1,
        job_state: 'success',
        failures: ['testString'],
        passed: ['testString'],
        evidences: [capsuleResultEvidencesModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataCapsule
      const jobDataCapsuleModel = {
        capsule_id: 'testString',
        calsule_name: 'testString',
        inputs: [variableDataModel],
        results: [jobResultCapsuleModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Capsule
      const capsuleModel = {
        name: 'testString',
        description: 'testString',
        type: 'testString',
        user_state: userStateModel,
        package: 'Policy package path',
        severity: 1,
        inventory: 'testString',
        trigger_record_id: 'testString',
        job_triggers: [triggerJobModel],
        scheduled_triggers: [triggerScheduledModel],
        inputs: [variableDataModel],
        decisions: [controlsDecisionModel],
        escalations: [controlsEscalationModel],
        id: 'testString',
        status: 'testString',
        controls_id: 'testString',
        controls_name: 'testString',
        created_at: '2019-01-01T12:00:00.000Z',
        created_by: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        updated_by: 'testString',
        state: controlsLiteStateModel,
        last_job_data: jobDataCapsuleModel,
        sys_lock: systemLockModel,
        foo: 'testString',
      };

      // Controls
      const controlsModel = {
        name: 'testString',
        type: 'it_controls',
        description: 'testString',
        resource_group: 'testString',
        location: 'us-south',
        tags: ['testString'],
        source_readme_url: 'testString',
        source: externalSourceModel,
        source_type: 'local',
        inputs: [variableDataModel],
        user_state: userStateModel,
        sys_lock: systemLockModel,
        capsules: [capsuleModel],
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation createControls
        const controls = controlsModel;
        const params = {
          controls: controls,
        };

        const createControlsResult = schematics20ApiService.createControls(params);

        // all methods should return a Promise
        expectToBePromise(createControlsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/controls', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(controls);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const controls = controlsModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          controls,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.createControls(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.createControls({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const createControlsPromise = schematics20ApiService.createControls();
        expectToBePromise(createControlsPromise);

        createControlsPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getControls', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getControls
        const controlsId = 'testString';
        const profile = 'summary';
        const params = {
          controlsId: controlsId,
          profile: profile,
        };

        const getControlsResult = schematics20ApiService.getControls(params);

        // all methods should return a Promise
        expectToBePromise(getControlsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/controls/{controls_id}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.path['controls_id']).toEqual(controlsId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const controlsId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          controlsId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getControls(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getControls({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getControlsPromise = schematics20ApiService.getControls();
        expectToBePromise(getControlsPromise);

        getControlsPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('deleteControls', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation deleteControls
        const controlsId = 'testString';
        const force = true;
        const propagate = true;
        const params = {
          controlsId: controlsId,
          force: force,
          propagate: propagate,
        };

        const deleteControlsResult = schematics20ApiService.deleteControls(params);

        // all methods should return a Promise
        expectToBePromise(deleteControlsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/controls/{controls_id}', 'DELETE');
        const expectedAccept = undefined;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'force', force);
        checkUserHeader(createRequestMock, 'propagate', propagate);
        expect(options.path['controls_id']).toEqual(controlsId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const controlsId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          controlsId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.deleteControls(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.deleteControls({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const deleteControlsPromise = schematics20ApiService.deleteControls();
        expectToBePromise(deleteControlsPromise);

        deleteControlsPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('updateControls', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusWorkitem
      const jobStatusWorkitemModel = {
        workspace_id: 'testString',
        workspace_name: 'testString',
        job_id: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusFlow
      const jobStatusFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        workitems: [jobStatusWorkitemModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusTemplate
      const jobStatusTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusWorkspace
      const jobStatusWorkspaceModel = {
        workspace_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        flow_status: jobStatusFlowModel,
        template_status: [jobStatusTemplateModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusAction
      const jobStatusActionModel = {
        action_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        bastion_status_code: 'none',
        bastion_status_message: 'testString',
        targets_status_code: 'none',
        targets_status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusSchematicsResources
      const jobStatusSchematicsResourcesModel = {
        status_code: 'job_pending',
        status_message: 'testString',
        schematics_resource_id: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusSystem
      const jobStatusSystemModel = {
        system_status_message: 'testString',
        system_status_code: 'job_pending',
        schematics_resource_status: [jobStatusSchematicsResourcesModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatus
      const jobStatusModel = {
        workspace_job_status: jobStatusWorkspaceModel,
        action_job_status: jobStatusActionModel,
        system_job_status: jobStatusSystemModel,
        flow_job_status: jobStatusFlowModel,
        foo: 'testString',
      };

      // JobDataTemplate
      const jobDataTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataWorkspace
      const jobDataWorkspaceModel = {
        workspace_name: 'testString',
        flow_id: 'testString',
        flow_name: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        template_data: [jobDataTemplateModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // InventoryResourceRecord
      const inventoryResourceRecordModel = {
        name: 'testString',
        description: 'testString',
        location: 'us-south',
        resource_group: 'testString',
        inventories_ini: 'testString',
        resource_queries: ['testString'],
        foo: 'testString',
      };

      // JobDataAction
      const jobDataActionModel = {
        action_name: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        inventory_record: inventoryResourceRecordModel,
        materialized_inventory: 'testString',
        foo: 'testString',
      };

      // JobDataSystem
      const jobDataSystemModel = {
        key_id: 'testString',
        schematics_resource_id: ['testString'],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataWorkItemLastJob
      const jobDataWorkItemLastJobModel = {
        command_object: 'workspace',
        command_object_name: 'testString',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        job_id: 'testString',
        job_status: 'job_pending',
        foo: 'testString',
      };

      // JobDataWorkItem
      const jobDataWorkItemModel = {
        command_object_id: 'testString',
        command_object_name: 'testString',
        layers: 'testString',
        source_type: 'local',
        source: externalSourceModel,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        last_job: jobDataWorkItemLastJobModel,
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataFlow
      const jobDataFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        workitems: [jobDataWorkItemModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobData
      const jobDataModel = {
        job_type: 'repo_download_job',
        workspace_job_data: jobDataWorkspaceModel,
        action_job_data: jobDataActionModel,
        system_job_data: jobDataSystemModel,
        flow_job_data: jobDataFlowModel,
        foo: 'testString',
      };

      // BastionResourceDefinition
      const bastionResourceDefinitionModel = {
        name: 'testString',
        host: 'testString',
        foo: 'testString',
      };

      // JobLogSummaryRepoDownloadJob
      const jobLogSummaryRepoDownloadJobModel = {
        foo: 'testString',
      };

      // JobLogSummaryWorkspaceJob
      const jobLogSummaryWorkspaceJobModel = {
        foo: 'testString',
      };

      // JobLogSummaryWorkitems
      const jobLogSummaryWorkitemsModel = {
        workspace_id: 'testString',
        job_id: 'testString',
        log_url: 'testString',
        foo: 'testString',
      };

      // JobLogSummaryFlowJob
      const jobLogSummaryFlowJobModel = {
        workitems: [jobLogSummaryWorkitemsModel],
        foo: 'testString',
      };

      // JobLogSummaryActionJobRecap
      const jobLogSummaryActionJobRecapModel = {
        target: ['testString'],
        ok: 72.5,
        changed: 72.5,
        failed: 72.5,
        skipped: 72.5,
        unreachable: 72.5,
        foo: 'testString',
      };

      // JobLogSummaryActionJob
      const jobLogSummaryActionJobModel = {
        recap: jobLogSummaryActionJobRecapModel,
        foo: 'testString',
      };

      // JobLogSummarySystemJob
      const jobLogSummarySystemJobModel = {
        success: 72.5,
        failed: 72.5,
        foo: 'testString',
      };

      // JobLogSummary
      const jobLogSummaryModel = {
        job_type: 'repo_download_job',
        repo_download_job: jobLogSummaryRepoDownloadJobModel,
        workspace_job: jobLogSummaryWorkspaceJobModel,
        flow_job: jobLogSummaryFlowJobModel,
        action_job: jobLogSummaryActionJobModel,
        system_job: jobLogSummarySystemJobModel,
        foo: 'testString',
      };

      // Job
      const jobModel = {
        command_object: 'workspace',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        command_parameter: 'testString',
        command_options: ['testString'],
        inputs: [variableDataModel],
        settings: [variableDataModel],
        tags: ['testString'],
        location: 'us-south',
        status: jobStatusModel,
        data: jobDataModel,
        bastion: bastionResourceDefinitionModel,
        log_summary: jobLogSummaryModel,
        foo: 'testString',
      };

      // TriggerJob
      const triggerJobModel = {
        event: 'before | after',
        job: jobModel,
        foo: 'testString',
      };

      // TriggerScheduled
      const triggerScheduledModel = {
        frequency: 'daily | weekly',
        time: 'time in UTC',
        day: 'expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday',
        foo: 'testString',
      };

      // ControlsDecision
      const controlsDecisionModel = {
        rule: 'testString',
        pass_value: 'before',
        pass_expr: '== OR != OR <= OR >= OR > OR <',
        evidence_found_in: 'rule emitting details',
        foo: 'testString',
      };

      // ControlsEscalation
      const controlsEscalationModel = {
        action_id: 'testString',
        foo: 'testString',
      };

      // ControlsLiteState
      const controlsLiteStateModel = {
        status_code: 'normal',
        status_message: 'testString',
        foo: 'testString',
      };

      // CapsuleResultResources
      const capsuleResultResourcesModel = {
        name: 'testString',
        type: 'testString',
        foo: 'testString',
      };

      // CapsuleResultEvidences
      const capsuleResultEvidencesModel = {
        resources: [capsuleResultResourcesModel],
        foo: 'testString',
      };

      // JobResultCapsule
      const jobResultCapsuleModel = {
        job_id: 'testString',
        job_name: 'testString',
        policy: 'testString',
        severity: 1,
        job_state: 'success',
        failures: ['testString'],
        passed: ['testString'],
        evidences: [capsuleResultEvidencesModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataCapsule
      const jobDataCapsuleModel = {
        capsule_id: 'testString',
        calsule_name: 'testString',
        inputs: [variableDataModel],
        results: [jobResultCapsuleModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Capsule
      const capsuleModel = {
        name: 'testString',
        description: 'testString',
        type: 'testString',
        user_state: userStateModel,
        package: 'Policy package path',
        severity: 1,
        inventory: 'testString',
        trigger_record_id: 'testString',
        job_triggers: [triggerJobModel],
        scheduled_triggers: [triggerScheduledModel],
        inputs: [variableDataModel],
        decisions: [controlsDecisionModel],
        escalations: [controlsEscalationModel],
        id: 'testString',
        status: 'testString',
        controls_id: 'testString',
        controls_name: 'testString',
        created_at: '2019-01-01T12:00:00.000Z',
        created_by: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        updated_by: 'testString',
        state: controlsLiteStateModel,
        last_job_data: jobDataCapsuleModel,
        sys_lock: systemLockModel,
        foo: 'testString',
      };

      // Controls
      const controlsModel = {
        name: 'testString',
        type: 'it_controls',
        description: 'testString',
        resource_group: 'testString',
        location: 'us-south',
        tags: ['testString'],
        source_readme_url: 'testString',
        source: externalSourceModel,
        source_type: 'local',
        inputs: [variableDataModel],
        user_state: userStateModel,
        sys_lock: systemLockModel,
        capsules: [capsuleModel],
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation updateControls
        const controlsId = 'testString';
        const controls = controlsModel;
        const params = {
          controlsId: controlsId,
          controls: controls,
        };

        const updateControlsResult = schematics20ApiService.updateControls(params);

        // all methods should return a Promise
        expectToBePromise(updateControlsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/controls/{controls_id}', 'PATCH');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(controls);
        expect(options.path['controls_id']).toEqual(controlsId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const controlsId = 'testString';
        const controls = controlsModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          controlsId,
          controls,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.updateControls(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.updateControls({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const updateControlsPromise = schematics20ApiService.updateControls();
        expectToBePromise(updateControlsPromise);

        updateControlsPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listCapsules', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listCapsules
        const controlsId = 'testString';
        const offset = 0;
        const limit = 1;
        const sort = 'testString';
        const profile = 'ids';
        const params = {
          controlsId: controlsId,
          offset: offset,
          limit: limit,
          sort: sort,
          profile: profile,
        };

        const listCapsulesResult = schematics20ApiService.listCapsules(params);

        // all methods should return a Promise
        expectToBePromise(listCapsulesResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/controls/{controls_id}/capsules', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['sort']).toEqual(sort);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.path['controls_id']).toEqual(controlsId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const controlsId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          controlsId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listCapsules(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.listCapsules({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const listCapsulesPromise = schematics20ApiService.listCapsules();
        expectToBePromise(listCapsulesPromise);

        listCapsulesPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('createCapsule', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // JobStatusWorkitem
      const jobStatusWorkitemModel = {
        workspace_id: 'testString',
        workspace_name: 'testString',
        job_id: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusFlow
      const jobStatusFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        workitems: [jobStatusWorkitemModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusTemplate
      const jobStatusTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusWorkspace
      const jobStatusWorkspaceModel = {
        workspace_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        flow_status: jobStatusFlowModel,
        template_status: [jobStatusTemplateModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusAction
      const jobStatusActionModel = {
        action_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        bastion_status_code: 'none',
        bastion_status_message: 'testString',
        targets_status_code: 'none',
        targets_status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusSchematicsResources
      const jobStatusSchematicsResourcesModel = {
        status_code: 'job_pending',
        status_message: 'testString',
        schematics_resource_id: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusSystem
      const jobStatusSystemModel = {
        system_status_message: 'testString',
        system_status_code: 'job_pending',
        schematics_resource_status: [jobStatusSchematicsResourcesModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatus
      const jobStatusModel = {
        workspace_job_status: jobStatusWorkspaceModel,
        action_job_status: jobStatusActionModel,
        system_job_status: jobStatusSystemModel,
        flow_job_status: jobStatusFlowModel,
        foo: 'testString',
      };

      // JobDataTemplate
      const jobDataTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataWorkspace
      const jobDataWorkspaceModel = {
        workspace_name: 'testString',
        flow_id: 'testString',
        flow_name: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        template_data: [jobDataTemplateModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // InventoryResourceRecord
      const inventoryResourceRecordModel = {
        name: 'testString',
        description: 'testString',
        location: 'us-south',
        resource_group: 'testString',
        inventories_ini: 'testString',
        resource_queries: ['testString'],
        foo: 'testString',
      };

      // JobDataAction
      const jobDataActionModel = {
        action_name: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        inventory_record: inventoryResourceRecordModel,
        materialized_inventory: 'testString',
        foo: 'testString',
      };

      // JobDataSystem
      const jobDataSystemModel = {
        key_id: 'testString',
        schematics_resource_id: ['testString'],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // JobDataWorkItemLastJob
      const jobDataWorkItemLastJobModel = {
        command_object: 'workspace',
        command_object_name: 'testString',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        job_id: 'testString',
        job_status: 'job_pending',
        foo: 'testString',
      };

      // JobDataWorkItem
      const jobDataWorkItemModel = {
        command_object_id: 'testString',
        command_object_name: 'testString',
        layers: 'testString',
        source_type: 'local',
        source: externalSourceModel,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        last_job: jobDataWorkItemLastJobModel,
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataFlow
      const jobDataFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        workitems: [jobDataWorkItemModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobData
      const jobDataModel = {
        job_type: 'repo_download_job',
        workspace_job_data: jobDataWorkspaceModel,
        action_job_data: jobDataActionModel,
        system_job_data: jobDataSystemModel,
        flow_job_data: jobDataFlowModel,
        foo: 'testString',
      };

      // BastionResourceDefinition
      const bastionResourceDefinitionModel = {
        name: 'testString',
        host: 'testString',
        foo: 'testString',
      };

      // JobLogSummaryRepoDownloadJob
      const jobLogSummaryRepoDownloadJobModel = {
        foo: 'testString',
      };

      // JobLogSummaryWorkspaceJob
      const jobLogSummaryWorkspaceJobModel = {
        foo: 'testString',
      };

      // JobLogSummaryWorkitems
      const jobLogSummaryWorkitemsModel = {
        workspace_id: 'testString',
        job_id: 'testString',
        log_url: 'testString',
        foo: 'testString',
      };

      // JobLogSummaryFlowJob
      const jobLogSummaryFlowJobModel = {
        workitems: [jobLogSummaryWorkitemsModel],
        foo: 'testString',
      };

      // JobLogSummaryActionJobRecap
      const jobLogSummaryActionJobRecapModel = {
        target: ['testString'],
        ok: 72.5,
        changed: 72.5,
        failed: 72.5,
        skipped: 72.5,
        unreachable: 72.5,
        foo: 'testString',
      };

      // JobLogSummaryActionJob
      const jobLogSummaryActionJobModel = {
        recap: jobLogSummaryActionJobRecapModel,
        foo: 'testString',
      };

      // JobLogSummarySystemJob
      const jobLogSummarySystemJobModel = {
        success: 72.5,
        failed: 72.5,
        foo: 'testString',
      };

      // JobLogSummary
      const jobLogSummaryModel = {
        job_type: 'repo_download_job',
        repo_download_job: jobLogSummaryRepoDownloadJobModel,
        workspace_job: jobLogSummaryWorkspaceJobModel,
        flow_job: jobLogSummaryFlowJobModel,
        action_job: jobLogSummaryActionJobModel,
        system_job: jobLogSummarySystemJobModel,
        foo: 'testString',
      };

      // Job
      const jobModel = {
        command_object: 'workspace',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        command_parameter: 'testString',
        command_options: ['testString'],
        inputs: [variableDataModel],
        settings: [variableDataModel],
        tags: ['testString'],
        location: 'us-south',
        status: jobStatusModel,
        data: jobDataModel,
        bastion: bastionResourceDefinitionModel,
        log_summary: jobLogSummaryModel,
        foo: 'testString',
      };

      // TriggerJob
      const triggerJobModel = {
        event: 'before | after',
        job: jobModel,
        foo: 'testString',
      };

      // TriggerScheduled
      const triggerScheduledModel = {
        frequency: 'daily | weekly',
        time: 'time in UTC',
        day: 'expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday',
        foo: 'testString',
      };

      // ControlsDecision
      const controlsDecisionModel = {
        rule: 'testString',
        pass_value: 'before',
        pass_expr: '== OR != OR <= OR >= OR > OR <',
        evidence_found_in: 'rule emitting details',
        foo: 'testString',
      };

      // ControlsEscalation
      const controlsEscalationModel = {
        action_id: 'testString',
        foo: 'testString',
      };

      // ControlsLiteState
      const controlsLiteStateModel = {
        status_code: 'normal',
        status_message: 'testString',
        foo: 'testString',
      };

      // CapsuleResultResources
      const capsuleResultResourcesModel = {
        name: 'testString',
        type: 'testString',
        foo: 'testString',
      };

      // CapsuleResultEvidences
      const capsuleResultEvidencesModel = {
        resources: [capsuleResultResourcesModel],
        foo: 'testString',
      };

      // JobResultCapsule
      const jobResultCapsuleModel = {
        job_id: 'testString',
        job_name: 'testString',
        policy: 'testString',
        severity: 1,
        job_state: 'success',
        failures: ['testString'],
        passed: ['testString'],
        evidences: [capsuleResultEvidencesModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataCapsule
      const jobDataCapsuleModel = {
        capsule_id: 'testString',
        calsule_name: 'testString',
        inputs: [variableDataModel],
        results: [jobResultCapsuleModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Capsule
      const capsuleModel = {
        name: 'testString',
        description: 'testString',
        type: 'testString',
        user_state: userStateModel,
        package: 'Policy package path',
        severity: 1,
        inventory: 'testString',
        trigger_record_id: 'testString',
        job_triggers: [triggerJobModel],
        scheduled_triggers: [triggerScheduledModel],
        inputs: [variableDataModel],
        decisions: [controlsDecisionModel],
        escalations: [controlsEscalationModel],
        id: 'testString',
        status: 'testString',
        controls_id: 'testString',
        controls_name: 'testString',
        created_at: '2019-01-01T12:00:00.000Z',
        created_by: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        updated_by: 'testString',
        state: controlsLiteStateModel,
        last_job_data: jobDataCapsuleModel,
        sys_lock: systemLockModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation createCapsule
        const controlsId = 'testString';
        const capsule = capsuleModel;
        const params = {
          controlsId: controlsId,
          capsule: capsule,
        };

        const createCapsuleResult = schematics20ApiService.createCapsule(params);

        // all methods should return a Promise
        expectToBePromise(createCapsuleResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/controls/{controls_id}/capsules', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(capsule);
        expect(options.path['controls_id']).toEqual(controlsId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const controlsId = 'testString';
        const capsule = capsuleModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          controlsId,
          capsule,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.createCapsule(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.createCapsule({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const createCapsulePromise = schematics20ApiService.createCapsule();
        expectToBePromise(createCapsulePromise);

        createCapsulePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getCapsule', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getCapsule
        const controlsId = 'testString';
        const capsuleId = 'testString';
        const profile = 'summary';
        const params = {
          controlsId: controlsId,
          capsuleId: capsuleId,
          profile: profile,
        };

        const getCapsuleResult = schematics20ApiService.getCapsule(params);

        // all methods should return a Promise
        expectToBePromise(getCapsuleResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/controls/{controls_id}/capsules/{capsule_id}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.path['controls_id']).toEqual(controlsId);
        expect(options.path['capsule_id']).toEqual(capsuleId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const controlsId = 'testString';
        const capsuleId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          controlsId,
          capsuleId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getCapsule(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getCapsule({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getCapsulePromise = schematics20ApiService.getCapsule();
        expectToBePromise(getCapsulePromise);

        getCapsulePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('deleteCapsule', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation deleteCapsule
        const controlsId = 'testString';
        const capsuleId = 'testString';
        const params = {
          controlsId: controlsId,
          capsuleId: capsuleId,
        };

        const deleteCapsuleResult = schematics20ApiService.deleteCapsule(params);

        // all methods should return a Promise
        expectToBePromise(deleteCapsuleResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/controls/{controls_id}/capsules/{capsule_id}', 'DELETE');
        const expectedAccept = undefined;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['controls_id']).toEqual(controlsId);
        expect(options.path['capsule_id']).toEqual(capsuleId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const controlsId = 'testString';
        const capsuleId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          controlsId,
          capsuleId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.deleteCapsule(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.deleteCapsule({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const deleteCapsulePromise = schematics20ApiService.deleteCapsule();
        expectToBePromise(deleteCapsulePromise);

        deleteCapsulePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('updateCapsule', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // JobStatusWorkitem
      const jobStatusWorkitemModel = {
        workspace_id: 'testString',
        workspace_name: 'testString',
        job_id: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusFlow
      const jobStatusFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        workitems: [jobStatusWorkitemModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusTemplate
      const jobStatusTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusWorkspace
      const jobStatusWorkspaceModel = {
        workspace_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        flow_status: jobStatusFlowModel,
        template_status: [jobStatusTemplateModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusAction
      const jobStatusActionModel = {
        action_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        bastion_status_code: 'none',
        bastion_status_message: 'testString',
        targets_status_code: 'none',
        targets_status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusSchematicsResources
      const jobStatusSchematicsResourcesModel = {
        status_code: 'job_pending',
        status_message: 'testString',
        schematics_resource_id: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusSystem
      const jobStatusSystemModel = {
        system_status_message: 'testString',
        system_status_code: 'job_pending',
        schematics_resource_status: [jobStatusSchematicsResourcesModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatus
      const jobStatusModel = {
        workspace_job_status: jobStatusWorkspaceModel,
        action_job_status: jobStatusActionModel,
        system_job_status: jobStatusSystemModel,
        flow_job_status: jobStatusFlowModel,
        foo: 'testString',
      };

      // JobDataTemplate
      const jobDataTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataWorkspace
      const jobDataWorkspaceModel = {
        workspace_name: 'testString',
        flow_id: 'testString',
        flow_name: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        template_data: [jobDataTemplateModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // InventoryResourceRecord
      const inventoryResourceRecordModel = {
        name: 'testString',
        description: 'testString',
        location: 'us-south',
        resource_group: 'testString',
        inventories_ini: 'testString',
        resource_queries: ['testString'],
        foo: 'testString',
      };

      // JobDataAction
      const jobDataActionModel = {
        action_name: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        inventory_record: inventoryResourceRecordModel,
        materialized_inventory: 'testString',
        foo: 'testString',
      };

      // JobDataSystem
      const jobDataSystemModel = {
        key_id: 'testString',
        schematics_resource_id: ['testString'],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // JobDataWorkItemLastJob
      const jobDataWorkItemLastJobModel = {
        command_object: 'workspace',
        command_object_name: 'testString',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        job_id: 'testString',
        job_status: 'job_pending',
        foo: 'testString',
      };

      // JobDataWorkItem
      const jobDataWorkItemModel = {
        command_object_id: 'testString',
        command_object_name: 'testString',
        layers: 'testString',
        source_type: 'local',
        source: externalSourceModel,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        last_job: jobDataWorkItemLastJobModel,
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataFlow
      const jobDataFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        workitems: [jobDataWorkItemModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobData
      const jobDataModel = {
        job_type: 'repo_download_job',
        workspace_job_data: jobDataWorkspaceModel,
        action_job_data: jobDataActionModel,
        system_job_data: jobDataSystemModel,
        flow_job_data: jobDataFlowModel,
        foo: 'testString',
      };

      // BastionResourceDefinition
      const bastionResourceDefinitionModel = {
        name: 'testString',
        host: 'testString',
        foo: 'testString',
      };

      // JobLogSummaryRepoDownloadJob
      const jobLogSummaryRepoDownloadJobModel = {
        foo: 'testString',
      };

      // JobLogSummaryWorkspaceJob
      const jobLogSummaryWorkspaceJobModel = {
        foo: 'testString',
      };

      // JobLogSummaryWorkitems
      const jobLogSummaryWorkitemsModel = {
        workspace_id: 'testString',
        job_id: 'testString',
        log_url: 'testString',
        foo: 'testString',
      };

      // JobLogSummaryFlowJob
      const jobLogSummaryFlowJobModel = {
        workitems: [jobLogSummaryWorkitemsModel],
        foo: 'testString',
      };

      // JobLogSummaryActionJobRecap
      const jobLogSummaryActionJobRecapModel = {
        target: ['testString'],
        ok: 72.5,
        changed: 72.5,
        failed: 72.5,
        skipped: 72.5,
        unreachable: 72.5,
        foo: 'testString',
      };

      // JobLogSummaryActionJob
      const jobLogSummaryActionJobModel = {
        recap: jobLogSummaryActionJobRecapModel,
        foo: 'testString',
      };

      // JobLogSummarySystemJob
      const jobLogSummarySystemJobModel = {
        success: 72.5,
        failed: 72.5,
        foo: 'testString',
      };

      // JobLogSummary
      const jobLogSummaryModel = {
        job_type: 'repo_download_job',
        repo_download_job: jobLogSummaryRepoDownloadJobModel,
        workspace_job: jobLogSummaryWorkspaceJobModel,
        flow_job: jobLogSummaryFlowJobModel,
        action_job: jobLogSummaryActionJobModel,
        system_job: jobLogSummarySystemJobModel,
        foo: 'testString',
      };

      // Job
      const jobModel = {
        command_object: 'workspace',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        command_parameter: 'testString',
        command_options: ['testString'],
        inputs: [variableDataModel],
        settings: [variableDataModel],
        tags: ['testString'],
        location: 'us-south',
        status: jobStatusModel,
        data: jobDataModel,
        bastion: bastionResourceDefinitionModel,
        log_summary: jobLogSummaryModel,
        foo: 'testString',
      };

      // TriggerJob
      const triggerJobModel = {
        event: 'before | after',
        job: jobModel,
        foo: 'testString',
      };

      // TriggerScheduled
      const triggerScheduledModel = {
        frequency: 'daily | weekly',
        time: 'time in UTC',
        day: 'expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday',
        foo: 'testString',
      };

      // ControlsDecision
      const controlsDecisionModel = {
        rule: 'testString',
        pass_value: 'before',
        pass_expr: '== OR != OR <= OR >= OR > OR <',
        evidence_found_in: 'rule emitting details',
        foo: 'testString',
      };

      // ControlsEscalation
      const controlsEscalationModel = {
        action_id: 'testString',
        foo: 'testString',
      };

      // ControlsLiteState
      const controlsLiteStateModel = {
        status_code: 'normal',
        status_message: 'testString',
        foo: 'testString',
      };

      // CapsuleResultResources
      const capsuleResultResourcesModel = {
        name: 'testString',
        type: 'testString',
        foo: 'testString',
      };

      // CapsuleResultEvidences
      const capsuleResultEvidencesModel = {
        resources: [capsuleResultResourcesModel],
        foo: 'testString',
      };

      // JobResultCapsule
      const jobResultCapsuleModel = {
        job_id: 'testString',
        job_name: 'testString',
        policy: 'testString',
        severity: 1,
        job_state: 'success',
        failures: ['testString'],
        passed: ['testString'],
        evidences: [capsuleResultEvidencesModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataCapsule
      const jobDataCapsuleModel = {
        capsule_id: 'testString',
        calsule_name: 'testString',
        inputs: [variableDataModel],
        results: [jobResultCapsuleModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Capsule
      const capsuleModel = {
        name: 'testString',
        description: 'testString',
        type: 'testString',
        user_state: userStateModel,
        package: 'Policy package path',
        severity: 1,
        inventory: 'testString',
        trigger_record_id: 'testString',
        job_triggers: [triggerJobModel],
        scheduled_triggers: [triggerScheduledModel],
        inputs: [variableDataModel],
        decisions: [controlsDecisionModel],
        escalations: [controlsEscalationModel],
        id: 'testString',
        status: 'testString',
        controls_id: 'testString',
        controls_name: 'testString',
        created_at: '2019-01-01T12:00:00.000Z',
        created_by: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        updated_by: 'testString',
        state: controlsLiteStateModel,
        last_job_data: jobDataCapsuleModel,
        sys_lock: systemLockModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation updateCapsule
        const controlsId = 'testString';
        const capsuleId = 'testString';
        const capsule = capsuleModel;
        const params = {
          controlsId: controlsId,
          capsuleId: capsuleId,
          capsule: capsule,
        };

        const updateCapsuleResult = schematics20ApiService.updateCapsule(params);

        // all methods should return a Promise
        expectToBePromise(updateCapsuleResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/controls/{controls_id}/capsules/{capsule_id}', 'PATCH');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(capsule);
        expect(options.path['controls_id']).toEqual(controlsId);
        expect(options.path['capsule_id']).toEqual(capsuleId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const controlsId = 'testString';
        const capsuleId = 'testString';
        const capsule = capsuleModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          controlsId,
          capsuleId,
          capsule,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.updateCapsule(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.updateCapsule({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const updateCapsulePromise = schematics20ApiService.updateCapsule();
        expectToBePromise(updateCapsulePromise);

        updateCapsulePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listDatasets', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listDatasets
        const offset = 0;
        const limit = 1;
        const sort = 'testString';
        const profile = 'ids';
        const params = {
          offset: offset,
          limit: limit,
          sort: sort,
          profile: profile,
        };

        const listDatasetsResult = schematics20ApiService.listDatasets(params);

        // all methods should return a Promise
        expectToBePromise(listDatasetsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/datasets', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['sort']).toEqual(sort);
        expect(options.qs['profile']).toEqual(profile);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listDatasets(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.listDatasets({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('createDataset', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Dataset
      const datasetModel = {
        name: 'testString',
        type: 'credential',
        description: 'testString',
        resource_group: 'testString',
        location: 'us-south',
        tags: ['testString'],
        data: [variableDataModel],
        source: externalSourceModel,
        source_type: 'local',
        source_link: 'static',
        source_readme_url: 'testString',
        user_state: userStateModel,
        auto_propagate_change: true,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation createDataset
        const dataset = datasetModel;
        const params = {
          dataset: dataset,
        };

        const createDatasetResult = schematics20ApiService.createDataset(params);

        // all methods should return a Promise
        expectToBePromise(createDatasetResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/datasets', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(dataset);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const dataset = datasetModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          dataset,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.createDataset(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.createDataset({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const createDatasetPromise = schematics20ApiService.createDataset();
        expectToBePromise(createDatasetPromise);

        createDatasetPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getDataset', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getDataset
        const datasetId = 'testString';
        const params = {
          datasetId: datasetId,
        };

        const getDatasetResult = schematics20ApiService.getDataset(params);

        // all methods should return a Promise
        expectToBePromise(getDatasetResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/datasets/{dataset_id}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['dataset_id']).toEqual(datasetId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const datasetId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          datasetId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getDataset(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getDataset({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getDatasetPromise = schematics20ApiService.getDataset();
        expectToBePromise(getDatasetPromise);

        getDatasetPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('replaceDataset', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Dataset
      const datasetModel = {
        name: 'testString',
        type: 'credential',
        description: 'testString',
        resource_group: 'testString',
        location: 'us-south',
        tags: ['testString'],
        data: [variableDataModel],
        source: externalSourceModel,
        source_type: 'local',
        source_link: 'static',
        source_readme_url: 'testString',
        user_state: userStateModel,
        auto_propagate_change: true,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation replaceDataset
        const datasetId = 'testString';
        const dataset = datasetModel;
        const params = {
          datasetId: datasetId,
          dataset: dataset,
        };

        const replaceDatasetResult = schematics20ApiService.replaceDataset(params);

        // all methods should return a Promise
        expectToBePromise(replaceDatasetResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/datasets/{dataset_id}', 'PUT');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(dataset);
        expect(options.path['dataset_id']).toEqual(datasetId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const datasetId = 'testString';
        const dataset = datasetModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          datasetId,
          dataset,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.replaceDataset(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.replaceDataset({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const replaceDatasetPromise = schematics20ApiService.replaceDataset();
        expectToBePromise(replaceDatasetPromise);

        replaceDatasetPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('deleteDataset', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation deleteDataset
        const datasetId = 'testString';
        const force = true;
        const propagate = true;
        const params = {
          datasetId: datasetId,
          force: force,
          propagate: propagate,
        };

        const deleteDatasetResult = schematics20ApiService.deleteDataset(params);

        // all methods should return a Promise
        expectToBePromise(deleteDatasetResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/datasets/{dataset_id}', 'DELETE');
        const expectedAccept = undefined;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'force', force);
        checkUserHeader(createRequestMock, 'propagate', propagate);
        expect(options.path['dataset_id']).toEqual(datasetId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const datasetId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          datasetId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.deleteDataset(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.deleteDataset({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const deleteDatasetPromise = schematics20ApiService.deleteDataset();
        expectToBePromise(deleteDatasetPromise);

        deleteDatasetPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('updateAtaset', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Dataset
      const datasetModel = {
        name: 'testString',
        type: 'credential',
        description: 'testString',
        resource_group: 'testString',
        location: 'us-south',
        tags: ['testString'],
        data: [variableDataModel],
        source: externalSourceModel,
        source_type: 'local',
        source_link: 'static',
        source_readme_url: 'testString',
        user_state: userStateModel,
        auto_propagate_change: true,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation updateAtaset
        const datasetId = 'testString';
        const dataset = datasetModel;
        const params = {
          datasetId: datasetId,
          dataset: dataset,
        };

        const updateAtasetResult = schematics20ApiService.updateAtaset(params);

        // all methods should return a Promise
        expectToBePromise(updateAtasetResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/datasets/{dataset_id}', 'PATCH');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(dataset);
        expect(options.path['dataset_id']).toEqual(datasetId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const datasetId = 'testString';
        const dataset = datasetModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          datasetId,
          dataset,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.updateAtaset(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.updateAtaset({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const updateAtasetPromise = schematics20ApiService.updateAtaset();
        expectToBePromise(updateAtasetPromise);

        updateAtasetPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listDatasetVariables', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listDatasetVariables
        const datasetId = 'testString';
        const params = {
          datasetId: datasetId,
        };

        const listDatasetVariablesResult = schematics20ApiService.listDatasetVariables(params);

        // all methods should return a Promise
        expectToBePromise(listDatasetVariablesResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/datasets/{dataset_id}/variables', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['dataset_id']).toEqual(datasetId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const datasetId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          datasetId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listDatasetVariables(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.listDatasetVariables({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const listDatasetVariablesPromise = schematics20ApiService.listDatasetVariables();
        expectToBePromise(listDatasetVariablesPromise);

        listDatasetVariablesPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getDatasetVariable', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getDatasetVariable
        const datasetId = 'testString';
        const varName = 'testString';
        const params = {
          datasetId: datasetId,
          varName: varName,
        };

        const getDatasetVariableResult = schematics20ApiService.getDatasetVariable(params);

        // all methods should return a Promise
        expectToBePromise(getDatasetVariableResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/datasets/{dataset_id}/values/{var_name}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['dataset_id']).toEqual(datasetId);
        expect(options.path['var_name']).toEqual(varName);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const datasetId = 'testString';
        const varName = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          datasetId,
          varName,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getDatasetVariable(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getDatasetVariable({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getDatasetVariablePromise = schematics20ApiService.getDatasetVariable();
        expectToBePromise(getDatasetVariablePromise);

        getDatasetVariablePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listCredentials', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listCredentials
        const offset = 0;
        const limit = 1;
        const sort = 'testString';
        const profile = 'ids';
        const params = {
          offset: offset,
          limit: limit,
          sort: sort,
          profile: profile,
        };

        const listCredentialsResult = schematics20ApiService.listCredentials(params);

        // all methods should return a Promise
        expectToBePromise(listCredentialsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/credentials', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['sort']).toEqual(sort);
        expect(options.qs['profile']).toEqual(profile);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listCredentials(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.listCredentials({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('createCredential', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Credentialset
      const credentialsetModel = {
        name: 'testString',
        description: 'testString',
        resource_group: 'testString',
        location: 'us-south',
        tags: ['testString'],
        data: [variableDataModel],
        source_connection: 'testString',
        source: externalSourceModel,
        source_type: 'local',
        source_link: 'static',
        user_state: userStateModel,
        auto_propagate_change: true,
        replica_enabled: true,
        replica_invalidation_frequency: 'hourly',
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation createCredential
        const credentialset = credentialsetModel;
        const params = {
          credentialset: credentialset,
        };

        const createCredentialResult = schematics20ApiService.createCredential(params);

        // all methods should return a Promise
        expectToBePromise(createCredentialResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/credentials', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(credentialset);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const credentialset = credentialsetModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          credentialset,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.createCredential(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.createCredential({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const createCredentialPromise = schematics20ApiService.createCredential();
        expectToBePromise(createCredentialPromise);

        createCredentialPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getCredential', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getCredential
        const credsId = 'testString';
        const params = {
          credsId: credsId,
        };

        const getCredentialResult = schematics20ApiService.getCredential(params);

        // all methods should return a Promise
        expectToBePromise(getCredentialResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/credentials/{creds_id}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['creds_id']).toEqual(credsId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const credsId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          credsId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getCredential(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getCredential({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getCredentialPromise = schematics20ApiService.getCredential();
        expectToBePromise(getCredentialPromise);

        getCredentialPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('replaceCredential', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Credentialset
      const credentialsetModel = {
        name: 'testString',
        description: 'testString',
        resource_group: 'testString',
        location: 'us-south',
        tags: ['testString'],
        data: [variableDataModel],
        source_connection: 'testString',
        source: externalSourceModel,
        source_type: 'local',
        source_link: 'static',
        user_state: userStateModel,
        auto_propagate_change: true,
        replica_enabled: true,
        replica_invalidation_frequency: 'hourly',
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation replaceCredential
        const credsId = 'testString';
        const credentialset = credentialsetModel;
        const params = {
          credsId: credsId,
          credentialset: credentialset,
        };

        const replaceCredentialResult = schematics20ApiService.replaceCredential(params);

        // all methods should return a Promise
        expectToBePromise(replaceCredentialResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/credentials/{creds_id}', 'PUT');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(credentialset);
        expect(options.path['creds_id']).toEqual(credsId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const credsId = 'testString';
        const credentialset = credentialsetModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          credsId,
          credentialset,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.replaceCredential(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.replaceCredential({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const replaceCredentialPromise = schematics20ApiService.replaceCredential();
        expectToBePromise(replaceCredentialPromise);

        replaceCredentialPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('deleteCredential', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation deleteCredential
        const credsId = 'testString';
        const force = true;
        const propagate = true;
        const params = {
          credsId: credsId,
          force: force,
          propagate: propagate,
        };

        const deleteCredentialResult = schematics20ApiService.deleteCredential(params);

        // all methods should return a Promise
        expectToBePromise(deleteCredentialResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/credentials/{creds_id}', 'DELETE');
        const expectedAccept = undefined;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'force', force);
        checkUserHeader(createRequestMock, 'propagate', propagate);
        expect(options.path['creds_id']).toEqual(credsId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const credsId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          credsId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.deleteCredential(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.deleteCredential({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const deleteCredentialPromise = schematics20ApiService.deleteCredential();
        expectToBePromise(deleteCredentialPromise);

        deleteCredentialPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('updateCredential', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Credentialset
      const credentialsetModel = {
        name: 'testString',
        description: 'testString',
        resource_group: 'testString',
        location: 'us-south',
        tags: ['testString'],
        data: [variableDataModel],
        source_connection: 'testString',
        source: externalSourceModel,
        source_type: 'local',
        source_link: 'static',
        user_state: userStateModel,
        auto_propagate_change: true,
        replica_enabled: true,
        replica_invalidation_frequency: 'hourly',
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation updateCredential
        const credsId = 'testString';
        const credentialset = credentialsetModel;
        const params = {
          credsId: credsId,
          credentialset: credentialset,
        };

        const updateCredentialResult = schematics20ApiService.updateCredential(params);

        // all methods should return a Promise
        expectToBePromise(updateCredentialResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/credentials/{creds_id}', 'PATCH');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(credentialset);
        expect(options.path['creds_id']).toEqual(credsId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const credsId = 'testString';
        const credentialset = credentialsetModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          credsId,
          credentialset,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.updateCredential(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.updateCredential({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const updateCredentialPromise = schematics20ApiService.updateCredential();
        expectToBePromise(updateCredentialPromise);

        updateCredentialPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listCredentialValues', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listCredentialValues
        const credsId = 'testString';
        const params = {
          credsId: credsId,
        };

        const listCredentialValuesResult = schematics20ApiService.listCredentialValues(params);

        // all methods should return a Promise
        expectToBePromise(listCredentialValuesResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/credentials/{creds_id}/variables', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['creds_id']).toEqual(credsId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const credsId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          credsId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listCredentialValues(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.listCredentialValues({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const listCredentialValuesPromise = schematics20ApiService.listCredentialValues();
        expectToBePromise(listCredentialValuesPromise);

        listCredentialValuesPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getCredentialValue', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getCredentialValue
        const credsId = 'testString';
        const varName = 'testString';
        const params = {
          credsId: credsId,
          varName: varName,
        };

        const getCredentialValueResult = schematics20ApiService.getCredentialValue(params);

        // all methods should return a Promise
        expectToBePromise(getCredentialValueResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/credentials/{creds_id}/variables/{var_name}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['creds_id']).toEqual(credsId);
        expect(options.path['var_name']).toEqual(varName);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const credsId = 'testString';
        const varName = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          credsId,
          varName,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getCredentialValue(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getCredentialValue({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getCredentialValuePromise = schematics20ApiService.getCredentialValue();
        expectToBePromise(getCredentialValuePromise);

        getCredentialValuePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listInventories', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listInventories
        const offset = 0;
        const limit = 1;
        const sort = 'testString';
        const profile = 'ids';
        const params = {
          offset: offset,
          limit: limit,
          sort: sort,
          profile: profile,
        };

        const listInventoriesResult = schematics20ApiService.listInventories(params);

        // all methods should return a Promise
        expectToBePromise(listInventoriesResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/inventories', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['sort']).toEqual(sort);
        expect(options.qs['profile']).toEqual(profile);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listInventories(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.listInventories({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('createInventory', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // InventoryResourceDefinition
      const inventoryResourceDefinitionModel = {
        name: 'testString',
        description: 'testString',
        location: 'us-south',
        resource_group: 'testString',
        inventories_ini: 'testString',
        resource_queries: ['testString'],
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation createInventory
        const inventoryResourceDefinition = inventoryResourceDefinitionModel;
        const params = {
          inventoryResourceDefinition: inventoryResourceDefinition,
        };

        const createInventoryResult = schematics20ApiService.createInventory(params);

        // all methods should return a Promise
        expectToBePromise(createInventoryResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/inventories', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(inventoryResourceDefinition);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const inventoryResourceDefinition = inventoryResourceDefinitionModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          inventoryResourceDefinition,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.createInventory(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.createInventory({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const createInventoryPromise = schematics20ApiService.createInventory();
        expectToBePromise(createInventoryPromise);

        createInventoryPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getInventory', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getInventory
        const inventoryId = 'testString';
        const params = {
          inventoryId: inventoryId,
        };

        const getInventoryResult = schematics20ApiService.getInventory(params);

        // all methods should return a Promise
        expectToBePromise(getInventoryResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/inventories/{inventory_id}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['inventory_id']).toEqual(inventoryId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const inventoryId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          inventoryId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getInventory(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getInventory({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getInventoryPromise = schematics20ApiService.getInventory();
        expectToBePromise(getInventoryPromise);

        getInventoryPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('replaceInventory', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // InventoryResourceDefinition
      const inventoryResourceDefinitionModel = {
        name: 'testString',
        description: 'testString',
        location: 'us-south',
        resource_group: 'testString',
        inventories_ini: 'testString',
        resource_queries: ['testString'],
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation replaceInventory
        const inventoryId = 'testString';
        const inventoryResourceDefinition = inventoryResourceDefinitionModel;
        const params = {
          inventoryId: inventoryId,
          inventoryResourceDefinition: inventoryResourceDefinition,
        };

        const replaceInventoryResult = schematics20ApiService.replaceInventory(params);

        // all methods should return a Promise
        expectToBePromise(replaceInventoryResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/inventories/{inventory_id}', 'PUT');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(inventoryResourceDefinition);
        expect(options.path['inventory_id']).toEqual(inventoryId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const inventoryId = 'testString';
        const inventoryResourceDefinition = inventoryResourceDefinitionModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          inventoryId,
          inventoryResourceDefinition,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.replaceInventory(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.replaceInventory({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const replaceInventoryPromise = schematics20ApiService.replaceInventory();
        expectToBePromise(replaceInventoryPromise);

        replaceInventoryPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('deleteInventory', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation deleteInventory
        const inventoryId = 'testString';
        const force = true;
        const propagate = true;
        const params = {
          inventoryId: inventoryId,
          force: force,
          propagate: propagate,
        };

        const deleteInventoryResult = schematics20ApiService.deleteInventory(params);

        // all methods should return a Promise
        expectToBePromise(deleteInventoryResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/inventories/{inventory_id}', 'DELETE');
        const expectedAccept = undefined;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'force', force);
        checkUserHeader(createRequestMock, 'propagate', propagate);
        expect(options.path['inventory_id']).toEqual(inventoryId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const inventoryId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          inventoryId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.deleteInventory(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.deleteInventory({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const deleteInventoryPromise = schematics20ApiService.deleteInventory();
        expectToBePromise(deleteInventoryPromise);

        deleteInventoryPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('updateInventory', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // InventoryResourceDefinition
      const inventoryResourceDefinitionModel = {
        name: 'testString',
        description: 'testString',
        location: 'us-south',
        resource_group: 'testString',
        inventories_ini: 'testString',
        resource_queries: ['testString'],
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation updateInventory
        const inventoryId = 'testString';
        const inventoryResourceDefinition = inventoryResourceDefinitionModel;
        const params = {
          inventoryId: inventoryId,
          inventoryResourceDefinition: inventoryResourceDefinition,
        };

        const updateInventoryResult = schematics20ApiService.updateInventory(params);

        // all methods should return a Promise
        expectToBePromise(updateInventoryResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/inventories/{inventory_id}', 'PATCH');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(inventoryResourceDefinition);
        expect(options.path['inventory_id']).toEqual(inventoryId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const inventoryId = 'testString';
        const inventoryResourceDefinition = inventoryResourceDefinitionModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          inventoryId,
          inventoryResourceDefinition,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.updateInventory(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.updateInventory({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const updateInventoryPromise = schematics20ApiService.updateInventory();
        expectToBePromise(updateInventoryPromise);

        updateInventoryPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listResourceQuery', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listResourceQuery
        const offset = 0;
        const limit = 1;
        const sort = 'testString';
        const profile = 'ids';
        const params = {
          offset: offset,
          limit: limit,
          sort: sort,
          profile: profile,
        };

        const listResourceQueryResult = schematics20ApiService.listResourceQuery(params);

        // all methods should return a Promise
        expectToBePromise(listResourceQueryResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/resources_query', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['sort']).toEqual(sort);
        expect(options.qs['profile']).toEqual(profile);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listResourceQuery(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.listResourceQuery({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('createResourceQuery', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // ResourceQueryParam
      const resourceQueryParamModel = {
        name: 'testString',
        value: 'testString',
        description: 'testString',
        foo: 'testString',
      };

      // ResourceQuery
      const resourceQueryModel = {
        query_type: 'workspaces',
        query_condition: [resourceQueryParamModel],
        query_select: ['testString'],
        foo: 'testString',
      };

      // ResourceQueryDefinition
      const resourceQueryDefinitionModel = {
        type: 'vsi',
        name: 'testString',
        queries: [resourceQueryModel],
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation createResourceQuery
        const resourceQueryDefinition = resourceQueryDefinitionModel;
        const params = {
          resourceQueryDefinition: resourceQueryDefinition,
        };

        const createResourceQueryResult = schematics20ApiService.createResourceQuery(params);

        // all methods should return a Promise
        expectToBePromise(createResourceQueryResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/resources_query', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(resourceQueryDefinition);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const resourceQueryDefinition = resourceQueryDefinitionModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          resourceQueryDefinition,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.createResourceQuery(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.createResourceQuery({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const createResourceQueryPromise = schematics20ApiService.createResourceQuery();
        expectToBePromise(createResourceQueryPromise);

        createResourceQueryPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getResourcesQuery', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getResourcesQuery
        const queryId = 'testString';
        const params = {
          queryId: queryId,
        };

        const getResourcesQueryResult = schematics20ApiService.getResourcesQuery(params);

        // all methods should return a Promise
        expectToBePromise(getResourcesQueryResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/resources_query/{query_id}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['query_id']).toEqual(queryId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const queryId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          queryId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getResourcesQuery(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getResourcesQuery({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getResourcesQueryPromise = schematics20ApiService.getResourcesQuery();
        expectToBePromise(getResourcesQueryPromise);

        getResourcesQueryPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('replaceResourcesQuery', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // ResourceQueryParam
      const resourceQueryParamModel = {
        name: 'testString',
        value: 'testString',
        description: 'testString',
        foo: 'testString',
      };

      // ResourceQuery
      const resourceQueryModel = {
        query_type: 'workspaces',
        query_condition: [resourceQueryParamModel],
        query_select: ['testString'],
        foo: 'testString',
      };

      // ResourceQueryDefinition
      const resourceQueryDefinitionModel = {
        type: 'vsi',
        name: 'testString',
        queries: [resourceQueryModel],
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation replaceResourcesQuery
        const queryId = 'testString';
        const resourceQueryDefinition = resourceQueryDefinitionModel;
        const params = {
          queryId: queryId,
          resourceQueryDefinition: resourceQueryDefinition,
        };

        const replaceResourcesQueryResult = schematics20ApiService.replaceResourcesQuery(params);

        // all methods should return a Promise
        expectToBePromise(replaceResourcesQueryResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/resources_query/{query_id}', 'PUT');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(resourceQueryDefinition);
        expect(options.path['query_id']).toEqual(queryId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const queryId = 'testString';
        const resourceQueryDefinition = resourceQueryDefinitionModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          queryId,
          resourceQueryDefinition,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.replaceResourcesQuery(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.replaceResourcesQuery({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const replaceResourcesQueryPromise = schematics20ApiService.replaceResourcesQuery();
        expectToBePromise(replaceResourcesQueryPromise);

        replaceResourcesQueryPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('executeResourceQuery', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation executeResourceQuery
        const queryId = 'testString';
        const params = {
          queryId: queryId,
        };

        const executeResourceQueryResult = schematics20ApiService.executeResourceQuery(params);

        // all methods should return a Promise
        expectToBePromise(executeResourceQueryResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/resources_query/{query_id}', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['query_id']).toEqual(queryId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const queryId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          queryId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.executeResourceQuery(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.executeResourceQuery({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const executeResourceQueryPromise = schematics20ApiService.executeResourceQuery();
        expectToBePromise(executeResourceQueryPromise);

        executeResourceQueryPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('deleteResourcesQuery', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation deleteResourcesQuery
        const queryId = 'testString';
        const force = true;
        const propagate = true;
        const params = {
          queryId: queryId,
          force: force,
          propagate: propagate,
        };

        const deleteResourcesQueryResult = schematics20ApiService.deleteResourcesQuery(params);

        // all methods should return a Promise
        expectToBePromise(deleteResourcesQueryResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/resources_query/{query_id}', 'DELETE');
        const expectedAccept = undefined;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'force', force);
        checkUserHeader(createRequestMock, 'propagate', propagate);
        expect(options.path['query_id']).toEqual(queryId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const queryId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          queryId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.deleteResourcesQuery(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.deleteResourcesQuery({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const deleteResourcesQueryPromise = schematics20ApiService.deleteResourcesQuery();
        expectToBePromise(deleteResourcesQueryPromise);

        deleteResourcesQueryPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getDatasetVariableValue', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getDatasetVariableValue
        const datasetId = 'testString';
        const varName = 'testString';
        const params = {
          datasetId: datasetId,
          varName: varName,
        };

        const getDatasetVariableValueResult = schematics20ApiService.getDatasetVariableValue(params);

        // all methods should return a Promise
        expectToBePromise(getDatasetVariableValueResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/datasets/{dataset_id}/values/{var_name}/value', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['dataset_id']).toEqual(datasetId);
        expect(options.path['var_name']).toEqual(varName);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const datasetId = 'testString';
        const varName = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          datasetId,
          varName,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getDatasetVariableValue(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getDatasetVariableValue({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getDatasetVariableValuePromise = schematics20ApiService.getDatasetVariableValue();
        expectToBePromise(getDatasetVariableValuePromise);

        getDatasetVariableValuePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getCredentialVariableValue', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getCredentialVariableValue
        const credsId = 'testString';
        const varName = 'testString';
        const params = {
          credsId: credsId,
          varName: varName,
        };

        const getCredentialVariableValueResult = schematics20ApiService.getCredentialVariableValue(params);

        // all methods should return a Promise
        expectToBePromise(getCredentialVariableValueResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/credentials/{creds_id}/variables/{var_name}/value', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['creds_id']).toEqual(credsId);
        expect(options.path['var_name']).toEqual(varName);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const credsId = 'testString';
        const varName = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          credsId,
          varName,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getCredentialVariableValue(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getCredentialVariableValue({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getCredentialVariableValuePromise = schematics20ApiService.getCredentialVariableValue();
        expectToBePromise(getCredentialVariableValuePromise);

        getCredentialVariableValuePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getInventoryVariableValue', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getInventoryVariableValue
        const inventoryId = 'testString';
        const varName = 'testString';
        const params = {
          inventoryId: inventoryId,
          varName: varName,
        };

        const getInventoryVariableValueResult = schematics20ApiService.getInventoryVariableValue(params);

        // all methods should return a Promise
        expectToBePromise(getInventoryVariableValueResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/inventories/{inventory_id}/variables/{var_name}/value', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['inventory_id']).toEqual(inventoryId);
        expect(options.path['var_name']).toEqual(varName);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const inventoryId = 'testString';
        const varName = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          inventoryId,
          varName,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getInventoryVariableValue(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getInventoryVariableValue({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getInventoryVariableValuePromise = schematics20ApiService.getInventoryVariableValue();
        expectToBePromise(getInventoryVariableValuePromise);

        getInventoryVariableValuePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getWorkspaceInputValue', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getWorkspaceInputValue
        const workspaceId = 'testString';
        const varName = 'testString';
        const limit = 1;
        const offset = 0;
        const params = {
          workspaceId: workspaceId,
          varName: varName,
          limit: limit,
          offset: offset,
        };

        const getWorkspaceInputValueResult = schematics20ApiService.getWorkspaceInputValue(params);

        // all methods should return a Promise
        expectToBePromise(getWorkspaceInputValueResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/inputs/{var_name}/value', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['var_name']).toEqual(varName);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const varName = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          varName,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getWorkspaceInputValue(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getWorkspaceInputValue({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getWorkspaceInputValuePromise = schematics20ApiService.getWorkspaceInputValue();
        expectToBePromise(getWorkspaceInputValuePromise);

        getWorkspaceInputValuePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getWorkspaceOutputValue', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getWorkspaceOutputValue
        const workspaceId = 'testString';
        const varName = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          workspaceId: workspaceId,
          varName: varName,
          offset: offset,
          limit: limit,
        };

        const getWorkspaceOutputValueResult = schematics20ApiService.getWorkspaceOutputValue(params);

        // all methods should return a Promise
        expectToBePromise(getWorkspaceOutputValueResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/outputs/{var_name}/value', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['var_name']).toEqual(varName);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const varName = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          varName,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getWorkspaceOutputValue(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getWorkspaceOutputValue({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getWorkspaceOutputValuePromise = schematics20ApiService.getWorkspaceOutputValue();
        expectToBePromise(getWorkspaceOutputValuePromise);

        getWorkspaceOutputValuePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getWorkspaceSettingsValue', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getWorkspaceSettingsValue
        const workspaceId = 'testString';
        const varName = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          workspaceId: workspaceId,
          varName: varName,
          offset: offset,
          limit: limit,
        };

        const getWorkspaceSettingsValueResult = schematics20ApiService.getWorkspaceSettingsValue(params);

        // all methods should return a Promise
        expectToBePromise(getWorkspaceSettingsValueResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/settings/{var_name}/value', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['var_name']).toEqual(varName);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const varName = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          varName,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getWorkspaceSettingsValue(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getWorkspaceSettingsValue({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getWorkspaceSettingsValuePromise = schematics20ApiService.getWorkspaceSettingsValue();
        expectToBePromise(getWorkspaceSettingsValuePromise);

        getWorkspaceSettingsValuePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getWorkspaceTemplateInputValue', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getWorkspaceTemplateInputValue
        const workspaceId = 'testString';
        const templateId = 'testString';
        const varName = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          workspaceId: workspaceId,
          templateId: templateId,
          varName: varName,
          offset: offset,
          limit: limit,
        };

        const getWorkspaceTemplateInputValueResult = schematics20ApiService.getWorkspaceTemplateInputValue(params);

        // all methods should return a Promise
        expectToBePromise(getWorkspaceTemplateInputValueResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/templates/{template_id}/inputs/{var_name}/value', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['template_id']).toEqual(templateId);
        expect(options.path['var_name']).toEqual(varName);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const templateId = 'testString';
        const varName = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          templateId,
          varName,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getWorkspaceTemplateInputValue(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getWorkspaceTemplateInputValue({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getWorkspaceTemplateInputValuePromise = schematics20ApiService.getWorkspaceTemplateInputValue();
        expectToBePromise(getWorkspaceTemplateInputValuePromise);

        getWorkspaceTemplateInputValuePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getWorkspaceTemplateOutputValue', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getWorkspaceTemplateOutputValue
        const workspaceId = 'testString';
        const templateId = 'testString';
        const varName = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          workspaceId: workspaceId,
          templateId: templateId,
          varName: varName,
          offset: offset,
          limit: limit,
        };

        const getWorkspaceTemplateOutputValueResult = schematics20ApiService.getWorkspaceTemplateOutputValue(params);

        // all methods should return a Promise
        expectToBePromise(getWorkspaceTemplateOutputValueResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/templates/{template_id}/outputs/{var_name}/value', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['template_id']).toEqual(templateId);
        expect(options.path['var_name']).toEqual(varName);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const templateId = 'testString';
        const varName = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          templateId,
          varName,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getWorkspaceTemplateOutputValue(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getWorkspaceTemplateOutputValue({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getWorkspaceTemplateOutputValuePromise = schematics20ApiService.getWorkspaceTemplateOutputValue();
        expectToBePromise(getWorkspaceTemplateOutputValuePromise);

        getWorkspaceTemplateOutputValuePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getWorkspaceTemplateSettingValue', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getWorkspaceTemplateSettingValue
        const workspaceId = 'testString';
        const templateId = 'testString';
        const varName = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          workspaceId: workspaceId,
          templateId: templateId,
          varName: varName,
          offset: offset,
          limit: limit,
        };

        const getWorkspaceTemplateSettingValueResult = schematics20ApiService.getWorkspaceTemplateSettingValue(params);

        // all methods should return a Promise
        expectToBePromise(getWorkspaceTemplateSettingValueResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/workspaces/{workspace_id}/templates/{template_id}/settings/{var_name}/value', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['template_id']).toEqual(templateId);
        expect(options.path['var_name']).toEqual(varName);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const workspaceId = 'testString';
        const templateId = 'testString';
        const varName = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          workspaceId,
          templateId,
          varName,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getWorkspaceTemplateSettingValue(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getWorkspaceTemplateSettingValue({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getWorkspaceTemplateSettingValuePromise = schematics20ApiService.getWorkspaceTemplateSettingValue();
        expectToBePromise(getWorkspaceTemplateSettingValuePromise);

        getWorkspaceTemplateSettingValuePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getJobWorkspaceInputValue', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getJobWorkspaceInputValue
        const jobId = 'testString';
        const workspaceId = 'testString';
        const varName = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          jobId: jobId,
          workspaceId: workspaceId,
          varName: varName,
          offset: offset,
          limit: limit,
        };

        const getJobWorkspaceInputValueResult = schematics20ApiService.getJobWorkspaceInputValue(params);

        // all methods should return a Promise
        expectToBePromise(getJobWorkspaceInputValueResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/jobs/{job_id}/workspaces/{workspace_id}/inputs/{var_name}/value', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.path['job_id']).toEqual(jobId);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['var_name']).toEqual(varName);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const jobId = 'testString';
        const workspaceId = 'testString';
        const varName = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          jobId,
          workspaceId,
          varName,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getJobWorkspaceInputValue(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getJobWorkspaceInputValue({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getJobWorkspaceInputValuePromise = schematics20ApiService.getJobWorkspaceInputValue();
        expectToBePromise(getJobWorkspaceInputValuePromise);

        getJobWorkspaceInputValuePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getJobWorkspaceOutputValue', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getJobWorkspaceOutputValue
        const jobId = 'testString';
        const workspaceId = 'testString';
        const varName = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          jobId: jobId,
          workspaceId: workspaceId,
          varName: varName,
          offset: offset,
          limit: limit,
        };

        const getJobWorkspaceOutputValueResult = schematics20ApiService.getJobWorkspaceOutputValue(params);

        // all methods should return a Promise
        expectToBePromise(getJobWorkspaceOutputValueResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/jobs/{job_id}/workspaces/{workspace_id}/outputs/{var_name}/value', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.path['job_id']).toEqual(jobId);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['var_name']).toEqual(varName);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const jobId = 'testString';
        const workspaceId = 'testString';
        const varName = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          jobId,
          workspaceId,
          varName,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getJobWorkspaceOutputValue(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getJobWorkspaceOutputValue({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getJobWorkspaceOutputValuePromise = schematics20ApiService.getJobWorkspaceOutputValue();
        expectToBePromise(getJobWorkspaceOutputValuePromise);

        getJobWorkspaceOutputValuePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getJobWorkspaceSettingValue', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getJobWorkspaceSettingValue
        const jobId = 'testString';
        const workspaceId = 'testString';
        const varName = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          jobId: jobId,
          workspaceId: workspaceId,
          varName: varName,
          offset: offset,
          limit: limit,
        };

        const getJobWorkspaceSettingValueResult = schematics20ApiService.getJobWorkspaceSettingValue(params);

        // all methods should return a Promise
        expectToBePromise(getJobWorkspaceSettingValueResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/jobs/{job_id}/workspaces/{workspace_id}/settings/{var_name}/value', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.path['job_id']).toEqual(jobId);
        expect(options.path['workspace_id']).toEqual(workspaceId);
        expect(options.path['var_name']).toEqual(varName);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const jobId = 'testString';
        const workspaceId = 'testString';
        const varName = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          jobId,
          workspaceId,
          varName,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getJobWorkspaceSettingValue(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getJobWorkspaceSettingValue({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getJobWorkspaceSettingValuePromise = schematics20ApiService.getJobWorkspaceSettingValue();
        expectToBePromise(getJobWorkspaceSettingValuePromise);

        getJobWorkspaceSettingValuePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listTriggers', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listTriggers
        const offset = 0;
        const limit = 1;
        const sort = 'testString';
        const params = {
          offset: offset,
          limit: limit,
          sort: sort,
        };

        const listTriggersResult = schematics20ApiService.listTriggers(params);

        // all methods should return a Promise
        expectToBePromise(listTriggersResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/triggers', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['sort']).toEqual(sort);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listTriggers(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.listTriggers({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('createTrigger', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // JobStatusWorkitem
      const jobStatusWorkitemModel = {
        workspace_id: 'testString',
        workspace_name: 'testString',
        job_id: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusFlow
      const jobStatusFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        workitems: [jobStatusWorkitemModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusTemplate
      const jobStatusTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusWorkspace
      const jobStatusWorkspaceModel = {
        workspace_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        flow_status: jobStatusFlowModel,
        template_status: [jobStatusTemplateModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusAction
      const jobStatusActionModel = {
        action_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        bastion_status_code: 'none',
        bastion_status_message: 'testString',
        targets_status_code: 'none',
        targets_status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusSchematicsResources
      const jobStatusSchematicsResourcesModel = {
        status_code: 'job_pending',
        status_message: 'testString',
        schematics_resource_id: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusSystem
      const jobStatusSystemModel = {
        system_status_message: 'testString',
        system_status_code: 'job_pending',
        schematics_resource_status: [jobStatusSchematicsResourcesModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatus
      const jobStatusModel = {
        workspace_job_status: jobStatusWorkspaceModel,
        action_job_status: jobStatusActionModel,
        system_job_status: jobStatusSystemModel,
        flow_job_status: jobStatusFlowModel,
        foo: 'testString',
      };

      // JobDataTemplate
      const jobDataTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataWorkspace
      const jobDataWorkspaceModel = {
        workspace_name: 'testString',
        flow_id: 'testString',
        flow_name: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        template_data: [jobDataTemplateModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // InventoryResourceRecord
      const inventoryResourceRecordModel = {
        name: 'testString',
        description: 'testString',
        location: 'us-south',
        resource_group: 'testString',
        inventories_ini: 'testString',
        resource_queries: ['testString'],
        foo: 'testString',
      };

      // JobDataAction
      const jobDataActionModel = {
        action_name: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        inventory_record: inventoryResourceRecordModel,
        materialized_inventory: 'testString',
        foo: 'testString',
      };

      // JobDataSystem
      const jobDataSystemModel = {
        key_id: 'testString',
        schematics_resource_id: ['testString'],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // JobDataWorkItemLastJob
      const jobDataWorkItemLastJobModel = {
        command_object: 'workspace',
        command_object_name: 'testString',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        job_id: 'testString',
        job_status: 'job_pending',
        foo: 'testString',
      };

      // JobDataWorkItem
      const jobDataWorkItemModel = {
        command_object_id: 'testString',
        command_object_name: 'testString',
        layers: 'testString',
        source_type: 'local',
        source: externalSourceModel,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        last_job: jobDataWorkItemLastJobModel,
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataFlow
      const jobDataFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        workitems: [jobDataWorkItemModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobData
      const jobDataModel = {
        job_type: 'repo_download_job',
        workspace_job_data: jobDataWorkspaceModel,
        action_job_data: jobDataActionModel,
        system_job_data: jobDataSystemModel,
        flow_job_data: jobDataFlowModel,
        foo: 'testString',
      };

      // BastionResourceDefinition
      const bastionResourceDefinitionModel = {
        name: 'testString',
        host: 'testString',
        foo: 'testString',
      };

      // JobLogSummaryRepoDownloadJob
      const jobLogSummaryRepoDownloadJobModel = {
        foo: 'testString',
      };

      // JobLogSummaryWorkspaceJob
      const jobLogSummaryWorkspaceJobModel = {
        foo: 'testString',
      };

      // JobLogSummaryWorkitems
      const jobLogSummaryWorkitemsModel = {
        workspace_id: 'testString',
        job_id: 'testString',
        log_url: 'testString',
        foo: 'testString',
      };

      // JobLogSummaryFlowJob
      const jobLogSummaryFlowJobModel = {
        workitems: [jobLogSummaryWorkitemsModel],
        foo: 'testString',
      };

      // JobLogSummaryActionJobRecap
      const jobLogSummaryActionJobRecapModel = {
        target: ['testString'],
        ok: 72.5,
        changed: 72.5,
        failed: 72.5,
        skipped: 72.5,
        unreachable: 72.5,
        foo: 'testString',
      };

      // JobLogSummaryActionJob
      const jobLogSummaryActionJobModel = {
        recap: jobLogSummaryActionJobRecapModel,
        foo: 'testString',
      };

      // JobLogSummarySystemJob
      const jobLogSummarySystemJobModel = {
        success: 72.5,
        failed: 72.5,
        foo: 'testString',
      };

      // JobLogSummary
      const jobLogSummaryModel = {
        job_type: 'repo_download_job',
        repo_download_job: jobLogSummaryRepoDownloadJobModel,
        workspace_job: jobLogSummaryWorkspaceJobModel,
        flow_job: jobLogSummaryFlowJobModel,
        action_job: jobLogSummaryActionJobModel,
        system_job: jobLogSummarySystemJobModel,
        foo: 'testString',
      };

      // Job
      const jobModel = {
        command_object: 'workspace',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        command_parameter: 'testString',
        command_options: ['testString'],
        inputs: [variableDataModel],
        settings: [variableDataModel],
        tags: ['testString'],
        location: 'us-south',
        status: jobStatusModel,
        data: jobDataModel,
        bastion: bastionResourceDefinitionModel,
        log_summary: jobLogSummaryModel,
        foo: 'testString',
      };

      // TriggerJob
      const triggerJobModel = {
        event: 'before | after',
        job: jobModel,
        foo: 'testString',
      };

      // TriggerScheduled
      const triggerScheduledModel = {
        frequency: 'daily | weekly',
        time: 'time in UTC',
        day: 'expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday',
        foo: 'testString',
      };

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Trigger
      const triggerModel = {
        name: 'testString',
        type: 'action',
        description: 'testString',
        resource_group: 'testString',
        service_id: 'This is a mock byte array value.',
        apikey: 'This is a mock byte array value.',
        location: 'us-south',
        tags: ['testString'],
        job_triggers: [triggerJobModel],
        scheduled_triggers: [triggerScheduledModel],
        user_state: userStateModel,
        sys_lock: systemLockModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation createTrigger
        const trigger = triggerModel;
        const params = {
          trigger: trigger,
        };

        const createTriggerResult = schematics20ApiService.createTrigger(params);

        // all methods should return a Promise
        expectToBePromise(createTriggerResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/triggers', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(trigger);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const trigger = triggerModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          trigger,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.createTrigger(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.createTrigger({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const createTriggerPromise = schematics20ApiService.createTrigger();
        expectToBePromise(createTriggerPromise);

        createTriggerPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getTrigger', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getTrigger
        const triggerId = 'testString';
        const params = {
          triggerId: triggerId,
        };

        const getTriggerResult = schematics20ApiService.getTrigger(params);

        // all methods should return a Promise
        expectToBePromise(getTriggerResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/triggers/{trigger_id}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['trigger_id']).toEqual(triggerId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const triggerId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          triggerId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getTrigger(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getTrigger({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getTriggerPromise = schematics20ApiService.getTrigger();
        expectToBePromise(getTriggerPromise);

        getTriggerPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('replaceTrigger', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // JobStatusWorkitem
      const jobStatusWorkitemModel = {
        workspace_id: 'testString',
        workspace_name: 'testString',
        job_id: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusFlow
      const jobStatusFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        workitems: [jobStatusWorkitemModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusTemplate
      const jobStatusTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        status_code: 'job_pending',
        status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusWorkspace
      const jobStatusWorkspaceModel = {
        workspace_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        flow_status: jobStatusFlowModel,
        template_status: [jobStatusTemplateModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusAction
      const jobStatusActionModel = {
        action_name: 'testString',
        status_code: 'job_pending',
        status_message: 'testString',
        bastion_status_code: 'none',
        bastion_status_message: 'testString',
        targets_status_code: 'none',
        targets_status_message: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusSchematicsResources
      const jobStatusSchematicsResourcesModel = {
        status_code: 'job_pending',
        status_message: 'testString',
        schematics_resource_id: 'testString',
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatusSystem
      const jobStatusSystemModel = {
        system_status_message: 'testString',
        system_status_code: 'job_pending',
        schematics_resource_status: [jobStatusSchematicsResourcesModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobStatus
      const jobStatusModel = {
        workspace_job_status: jobStatusWorkspaceModel,
        action_job_status: jobStatusActionModel,
        system_job_status: jobStatusSystemModel,
        flow_job_status: jobStatusFlowModel,
        foo: 'testString',
      };

      // JobDataTemplate
      const jobDataTemplateModel = {
        template_id: 'testString',
        template_name: 'testString',
        flow_index: 38,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataWorkspace
      const jobDataWorkspaceModel = {
        workspace_name: 'testString',
        flow_id: 'testString',
        flow_name: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        template_data: [jobDataTemplateModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // InventoryResourceRecord
      const inventoryResourceRecordModel = {
        name: 'testString',
        description: 'testString',
        location: 'us-south',
        resource_group: 'testString',
        inventories_ini: 'testString',
        resource_queries: ['testString'],
        foo: 'testString',
      };

      // JobDataAction
      const jobDataActionModel = {
        action_name: 'testString',
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        inventory_record: inventoryResourceRecordModel,
        materialized_inventory: 'testString',
        foo: 'testString',
      };

      // JobDataSystem
      const jobDataSystemModel = {
        key_id: 'testString',
        schematics_resource_id: ['testString'],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // JobDataWorkItemLastJob
      const jobDataWorkItemLastJobModel = {
        command_object: 'workspace',
        command_object_name: 'testString',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        job_id: 'testString',
        job_status: 'job_pending',
        foo: 'testString',
      };

      // JobDataWorkItem
      const jobDataWorkItemModel = {
        command_object_id: 'testString',
        command_object_name: 'testString',
        layers: 'testString',
        source_type: 'local',
        source: externalSourceModel,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        last_job: jobDataWorkItemLastJobModel,
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobDataFlow
      const jobDataFlowModel = {
        flow_id: 'testString',
        flow_name: 'testString',
        workitems: [jobDataWorkItemModel],
        updated_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // JobData
      const jobDataModel = {
        job_type: 'repo_download_job',
        workspace_job_data: jobDataWorkspaceModel,
        action_job_data: jobDataActionModel,
        system_job_data: jobDataSystemModel,
        flow_job_data: jobDataFlowModel,
        foo: 'testString',
      };

      // BastionResourceDefinition
      const bastionResourceDefinitionModel = {
        name: 'testString',
        host: 'testString',
        foo: 'testString',
      };

      // JobLogSummaryRepoDownloadJob
      const jobLogSummaryRepoDownloadJobModel = {
        foo: 'testString',
      };

      // JobLogSummaryWorkspaceJob
      const jobLogSummaryWorkspaceJobModel = {
        foo: 'testString',
      };

      // JobLogSummaryWorkitems
      const jobLogSummaryWorkitemsModel = {
        workspace_id: 'testString',
        job_id: 'testString',
        log_url: 'testString',
        foo: 'testString',
      };

      // JobLogSummaryFlowJob
      const jobLogSummaryFlowJobModel = {
        workitems: [jobLogSummaryWorkitemsModel],
        foo: 'testString',
      };

      // JobLogSummaryActionJobRecap
      const jobLogSummaryActionJobRecapModel = {
        target: ['testString'],
        ok: 72.5,
        changed: 72.5,
        failed: 72.5,
        skipped: 72.5,
        unreachable: 72.5,
        foo: 'testString',
      };

      // JobLogSummaryActionJob
      const jobLogSummaryActionJobModel = {
        recap: jobLogSummaryActionJobRecapModel,
        foo: 'testString',
      };

      // JobLogSummarySystemJob
      const jobLogSummarySystemJobModel = {
        success: 72.5,
        failed: 72.5,
        foo: 'testString',
      };

      // JobLogSummary
      const jobLogSummaryModel = {
        job_type: 'repo_download_job',
        repo_download_job: jobLogSummaryRepoDownloadJobModel,
        workspace_job: jobLogSummaryWorkspaceJobModel,
        flow_job: jobLogSummaryFlowJobModel,
        action_job: jobLogSummaryActionJobModel,
        system_job: jobLogSummarySystemJobModel,
        foo: 'testString',
      };

      // Job
      const jobModel = {
        command_object: 'workspace',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        command_parameter: 'testString',
        command_options: ['testString'],
        inputs: [variableDataModel],
        settings: [variableDataModel],
        tags: ['testString'],
        location: 'us-south',
        status: jobStatusModel,
        data: jobDataModel,
        bastion: bastionResourceDefinitionModel,
        log_summary: jobLogSummaryModel,
        foo: 'testString',
      };

      // TriggerJob
      const triggerJobModel = {
        event: 'before | after',
        job: jobModel,
        foo: 'testString',
      };

      // TriggerScheduled
      const triggerScheduledModel = {
        frequency: 'daily | weekly',
        time: 'time in UTC',
        day: 'expected values : 1-7 comments:required for weekly 1: Monday - 7: Sunday',
        foo: 'testString',
      };

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Trigger
      const triggerModel = {
        name: 'testString',
        type: 'action',
        description: 'testString',
        resource_group: 'testString',
        service_id: 'This is a mock byte array value.',
        apikey: 'This is a mock byte array value.',
        location: 'us-south',
        tags: ['testString'],
        job_triggers: [triggerJobModel],
        scheduled_triggers: [triggerScheduledModel],
        user_state: userStateModel,
        sys_lock: systemLockModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation replaceTrigger
        const triggerId = 'testString';
        const trigger = triggerModel;
        const params = {
          triggerId: triggerId,
          trigger: trigger,
        };

        const replaceTriggerResult = schematics20ApiService.replaceTrigger(params);

        // all methods should return a Promise
        expectToBePromise(replaceTriggerResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/triggers/{trigger_id}', 'PUT');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(trigger);
        expect(options.path['trigger_id']).toEqual(triggerId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const triggerId = 'testString';
        const trigger = triggerModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          triggerId,
          trigger,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.replaceTrigger(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.replaceTrigger({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const replaceTriggerPromise = schematics20ApiService.replaceTrigger();
        expectToBePromise(replaceTriggerPromise);

        replaceTriggerPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('deleteTrigger', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation deleteTrigger
        const triggerId = 'testString';
        const params = {
          triggerId: triggerId,
        };

        const deleteTriggerResult = schematics20ApiService.deleteTrigger(params);

        // all methods should return a Promise
        expectToBePromise(deleteTriggerResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/triggers/{trigger_id}', 'DELETE');
        const expectedAccept = undefined;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['trigger_id']).toEqual(triggerId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const triggerId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          triggerId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.deleteTrigger(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.deleteTrigger({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const deleteTriggerPromise = schematics20ApiService.deleteTrigger();
        expectToBePromise(deleteTriggerPromise);

        deleteTriggerPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listWebhook', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listWebhook
        const offset = 0;
        const limit = 1;
        const sort = 'testString';
        const params = {
          offset: offset,
          limit: limit,
          sort: sort,
        };

        const listWebhookResult = schematics20ApiService.listWebhook(params);

        // all methods should return a Promise
        expectToBePromise(listWebhookResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/hooks', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['sort']).toEqual(sort);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listWebhook(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.listWebhook({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('createWebhook', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // WebHook
      const webHookModel = {
        command_name: 'workspace_plan',
        hook_type: 'hook',
        hook_site: 'before',
        location: 'us-south',
        resource_group: 'testString',
        tags: ['testString'],
        hook_endpoint_url: 'testString',
        service_id: 'testString',
        apikey: 'testString',
        user_state: userStateModel,
        ignore_inflight_operations: true,
        sys_lock: systemLockModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation createWebhook
        const webHook = webHookModel;
        const params = {
          webHook: webHook,
        };

        const createWebhookResult = schematics20ApiService.createWebhook(params);

        // all methods should return a Promise
        expectToBePromise(createWebhookResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/hooks', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(webHook);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const webHook = webHookModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          webHook,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.createWebhook(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.createWebhook({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const createWebhookPromise = schematics20ApiService.createWebhook();
        expectToBePromise(createWebhookPromise);

        createWebhookPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getWebhook', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getWebhook
        const hookId = 'testString';
        const params = {
          hookId: hookId,
        };

        const getWebhookResult = schematics20ApiService.getWebhook(params);

        // all methods should return a Promise
        expectToBePromise(getWebhookResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/hooks/{hook_id}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['hook_id']).toEqual(hookId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const hookId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          hookId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getWebhook(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getWebhook({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getWebhookPromise = schematics20ApiService.getWebhook();
        expectToBePromise(getWebhookPromise);

        getWebhookPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('replaceWebhook', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // WebHook
      const webHookModel = {
        command_name: 'workspace_plan',
        hook_type: 'hook',
        hook_site: 'before',
        location: 'us-south',
        resource_group: 'testString',
        tags: ['testString'],
        hook_endpoint_url: 'testString',
        service_id: 'testString',
        apikey: 'testString',
        user_state: userStateModel,
        ignore_inflight_operations: true,
        sys_lock: systemLockModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation replaceWebhook
        const hookId = 'testString';
        const webHook = webHookModel;
        const params = {
          hookId: hookId,
          webHook: webHook,
        };

        const replaceWebhookResult = schematics20ApiService.replaceWebhook(params);

        // all methods should return a Promise
        expectToBePromise(replaceWebhookResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/hooks/{hook_id}', 'PUT');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(webHook);
        expect(options.path['hook_id']).toEqual(hookId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const hookId = 'testString';
        const webHook = webHookModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          hookId,
          webHook,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.replaceWebhook(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.replaceWebhook({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const replaceWebhookPromise = schematics20ApiService.replaceWebhook();
        expectToBePromise(replaceWebhookPromise);

        replaceWebhookPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('deleteWebhook', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation deleteWebhook
        const hookId = 'testString';
        const params = {
          hookId: hookId,
        };

        const deleteWebhookResult = schematics20ApiService.deleteWebhook(params);

        // all methods should return a Promise
        expectToBePromise(deleteWebhookResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/hooks/{hook_id}', 'DELETE');
        const expectedAccept = undefined;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['hook_id']).toEqual(hookId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const hookId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          hookId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.deleteWebhook(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.deleteWebhook({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const deleteWebhookPromise = schematics20ApiService.deleteWebhook();
        expectToBePromise(deleteWebhookPromise);

        deleteWebhookPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getPrivateCluster', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getPrivateCluster
        const params = {};

        const getPrivateClusterResult = schematics20ApiService.getPrivateCluster(params);

        // all methods should return a Promise
        expectToBePromise(getPrivateClusterResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/private_clusters', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getPrivateCluster(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.getPrivateCluster({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('createPrivateCluster', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // PrivateCluster
      const privateClusterModel = {
        cluster_id: 'testString',
        kube_config: 'testString',
        tags: ['testString'],
        user_state: userStateModel,
        registered_by: 'testString',
        registered_at: '2019-01-01T12:00:00.000Z',
        updated_at: '2019-01-01T12:00:00.000Z',
        updated_by: 'testString',
        sys_lock: systemLockModel,
        cluster_health: 'active',
        last_health_checked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation createPrivateCluster
        const privateCluster = privateClusterModel;
        const params = {
          privateCluster: privateCluster,
        };

        const createPrivateClusterResult = schematics20ApiService.createPrivateCluster(params);

        // all methods should return a Promise
        expectToBePromise(createPrivateClusterResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/private_clusters', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(privateCluster);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const privateCluster = privateClusterModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          privateCluster,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.createPrivateCluster(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.createPrivateCluster({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const createPrivateClusterPromise = schematics20ApiService.createPrivateCluster();
        expectToBePromise(createPrivateClusterPromise);

        createPrivateClusterPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('deletePrivateCluster', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation deletePrivateCluster
        const params = {};

        const deletePrivateClusterResult = schematics20ApiService.deletePrivateCluster(params);

        // all methods should return a Promise
        expectToBePromise(deletePrivateClusterResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/private_clusters', 'DELETE');
        const expectedAccept = undefined;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.deletePrivateCluster(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.deletePrivateCluster({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('listAdapter', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listAdapter
        const offset = 0;
        const limit = 1;
        const sort = 'testString';
        const profile = 'ids';
        const params = {
          offset: offset,
          limit: limit,
          sort: sort,
          profile: profile,
        };

        const listAdapterResult = schematics20ApiService.listAdapter(params);

        // all methods should return a Promise
        expectToBePromise(listAdapterResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/adapters', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['sort']).toEqual(sort);
        expect(options.qs['profile']).toEqual(profile);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listAdapter(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.listAdapter({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('createAdapter', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Adapter
      const adapterModel = {
        adapter_name: 'testString',
        adapter_type: 'scm_adapter',
        location: 'us-south',
        resource_group: 'testString',
        tags: ['testString'],
        adapter_endpoint_url: 'testString',
        service_id: 'testString',
        apikey: 'testString',
        user_state: userStateModel,
        ignore_inflight_operations: true,
        adapter_id: 'testString',
        registered_by: 'testString',
        registered_at: '2019-01-01T12:00:00.000Z',
        updated_at: '2019-01-01T12:00:00.000Z',
        updated_by: 'testString',
        sys_lock: systemLockModel,
        adapter_health: 'active',
        last_health_checked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation createAdapter
        const adapter = adapterModel;
        const params = {
          adapter: adapter,
        };

        const createAdapterResult = schematics20ApiService.createAdapter(params);

        // all methods should return a Promise
        expectToBePromise(createAdapterResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/adapters', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(adapter);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const adapter = adapterModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          adapter,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.createAdapter(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.createAdapter({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const createAdapterPromise = schematics20ApiService.createAdapter();
        expectToBePromise(createAdapterPromise);

        createAdapterPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getAdapter', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getAdapter
        const adapterId = 'testString';
        const params = {
          adapterId: adapterId,
        };

        const getAdapterResult = schematics20ApiService.getAdapter(params);

        // all methods should return a Promise
        expectToBePromise(getAdapterResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/adapters/{adapter_id}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['adapter_id']).toEqual(adapterId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const adapterId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          adapterId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getAdapter(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getAdapter({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getAdapterPromise = schematics20ApiService.getAdapter();
        expectToBePromise(getAdapterPromise);

        getAdapterPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('replaceAdapter', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // UserState
      const userStateModel = {
        state: 'draft',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // Adapter
      const adapterModel = {
        adapter_name: 'testString',
        adapter_type: 'scm_adapter',
        location: 'us-south',
        resource_group: 'testString',
        tags: ['testString'],
        adapter_endpoint_url: 'testString',
        service_id: 'testString',
        apikey: 'testString',
        user_state: userStateModel,
        ignore_inflight_operations: true,
        adapter_id: 'testString',
        registered_by: 'testString',
        registered_at: '2019-01-01T12:00:00.000Z',
        updated_at: '2019-01-01T12:00:00.000Z',
        updated_by: 'testString',
        sys_lock: systemLockModel,
        adapter_health: 'active',
        last_health_checked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation replaceAdapter
        const adapterId = 'testString';
        const adapter = adapterModel;
        const params = {
          adapterId: adapterId,
          adapter: adapter,
        };

        const replaceAdapterResult = schematics20ApiService.replaceAdapter(params);

        // all methods should return a Promise
        expectToBePromise(replaceAdapterResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/adapters/{adapter_id}', 'PUT');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(adapter);
        expect(options.path['adapter_id']).toEqual(adapterId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const adapterId = 'testString';
        const adapter = adapterModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          adapterId,
          adapter,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.replaceAdapter(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.replaceAdapter({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const replaceAdapterPromise = schematics20ApiService.replaceAdapter();
        expectToBePromise(replaceAdapterPromise);

        replaceAdapterPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('deleteAdapter', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation deleteAdapter
        const adapterId = 'testString';
        const params = {
          adapterId: adapterId,
        };

        const deleteAdapterResult = schematics20ApiService.deleteAdapter(params);

        // all methods should return a Promise
        expectToBePromise(deleteAdapterResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/adapters/{adapter_id}', 'DELETE');
        const expectedAccept = undefined;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['adapter_id']).toEqual(adapterId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const adapterId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          adapterId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.deleteAdapter(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.deleteAdapter({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const deleteAdapterPromise = schematics20ApiService.deleteAdapter();
        expectToBePromise(deleteAdapterPromise);

        deleteAdapterPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listConnection', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listConnection
        const offset = 0;
        const limit = 1;
        const sort = 'testString';
        const params = {
          offset: offset,
          limit: limit,
          sort: sort,
        };

        const listConnectionResult = schematics20ApiService.listConnection(params);

        // all methods should return a Promise
        expectToBePromise(listConnectionResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/connections', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['sort']).toEqual(sort);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listConnection(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.listConnection({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('createConnection', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // ConnectionSecretApikey
      const connectionSecretApikeyModel = {
        key: 'testString',
        foo: 'testString',
      };

      // ConnectionSecret
      const connectionSecretModel = {
        type: 'apikey',
        apikey: connectionSecretApikeyModel,
        foo: 'testString',
      };

      // Connection
      const connectionModel = {
        name: 'testString',
        description: 'testString',
        resource_group: 'testString',
        tags: ['testString'],
        connection_details: externalSourceModel,
        connection_secrets: connectionSecretModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation createConnection
        const connection = connectionModel;
        const params = {
          connection: connection,
        };

        const createConnectionResult = schematics20ApiService.createConnection(params);

        // all methods should return a Promise
        expectToBePromise(createConnectionResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/connections', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(connection);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const connection = connectionModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          connection,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.createConnection(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.createConnection({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const createConnectionPromise = schematics20ApiService.createConnection();
        expectToBePromise(createConnectionPromise);

        createConnectionPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listDatasources', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listDatasources
        const offset = 0;
        const limit = 1;
        const sort = 'testString';
        const params = {
          offset: offset,
          limit: limit,
          sort: sort,
        };

        const listDatasourcesResult = schematics20ApiService.listDatasources(params);

        // all methods should return a Promise
        expectToBePromise(listDatasourcesResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/datasources', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['sort']).toEqual(sort);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listDatasources(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.listDatasources({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('createDatasource', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // Datasource
      const datasourceModel = {
        name: 'testString',
        description: 'testString',
        resource_group: 'testString',
        tags: ['testString'],
        source_type: 'git',
        data_source: 'testString',
        connection: 'testString',
        replica_enabled: true,
        replica_invalidation_frequency: 'hourly',
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation createDatasource
        const datasource = datasourceModel;
        const params = {
          datasource: datasource,
        };

        const createDatasourceResult = schematics20ApiService.createDatasource(params);

        // all methods should return a Promise
        expectToBePromise(createDatasourceResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/datasources', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(datasource);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const datasource = datasourceModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          datasource,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.createDatasource(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.createDatasource({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const createDatasourcePromise = schematics20ApiService.createDatasource();
        expectToBePromise(createDatasourcePromise);

        createDatasourcePromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listCart', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listCart
        const service = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          service: service,
          offset: offset,
          limit: limit,
        };

        const listCartResult = schematics20ApiService.listCart(params);

        // all methods should return a Promise
        expectToBePromise(listCartResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/cart', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['service']).toEqual(service);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const service = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          service,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listCart(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.listCart({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const listCartPromise = schematics20ApiService.listCart();
        expectToBePromise(listCartPromise);

        listCartPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('createCartOrder', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // TargetRequest
      const targetRequestModel = {
        cluster_id: 'testString',
        cluster_name: 'testString',
        entitlement_key: { foo: 'bar' },
        namespace: 'testString',
        region: 'testString',
        resource_group_id: 'testString',
        foo: 'testString',
      };

      // ServiceMappingRule
      const serviceMappingRuleModel = {
        type: 'testString',
        input_param_name: 'testString',
        output_param_name: 'testString',
        foo: 'testString',
      };

      // ServiceVariableData
      const serviceVariableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        mapping: [serviceMappingRuleModel],
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // SKUUserState
      const skuUserStateModel = {
        state: 'testString',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // ItemSKU
      const itemSkuModel = {
        sku_id: 'testString',
        sku_type: 'testString',
        sku_sys_lock: systemLockModel,
        sku_user_state: skuUserStateModel,
        foo: 'testString',
      };

      // OrderItemConfiguration
      const orderItemConfigurationModel = {
        name: 'AWS Satellite',
        description: 'Create satellite location in AWS',
        inputs: [variableDataModel],
        settings: [variableDataModel],
        outputs: [variableDataModel],
        target: targetRequestModel,
        operation: 'install',
        service_data: [serviceVariableDataModel],
        catalog_id: 'testString',
        offering_id: 'testString',
        owning_account: 'testString',
        owning_account_crn: 'testString',
        offering_kind_id: 'testString',
        offering_target_kind: 'testString',
        offering_version_id: 'testString',
        offering_kind: 'testString',
        offering_fulfilment_kind: 'testString',
        offering_version: 'testString',
        offering_provisioner_url: 'testString',
        offering_provisioner_ssh: 'testString',
        offering_provisioner_working_directory: 'testString',
        item_sku: itemSkuModel,
        foo: 'testString',
      };

      // CartOrderUserState
      const cartOrderUserStateModel = {
        state: 'Order_Create_Init',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // CartOrderLiteState
      const cartOrderLiteStateModel = {
        status_code: 'normal',
        status_message: 'testString',
        foo: 'testString',
      };

      // CartOrder
      const cartOrderModel = {
        name: 'MySatelliteLocation',
        description: 'Creates satellite location in AWS',
        tags: ['testString'],
        cart_items: [orderItemConfigurationModel],
        service_name: 'SatelliteLocation',
        resource_group: 'testString',
        location: 'us-south',
        user_state: cartOrderUserStateModel,
        sys_lock: systemLockModel,
        state: cartOrderLiteStateModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation createCartOrder
        const cartOrder = cartOrderModel;
        const params = {
          cartOrder: cartOrder,
        };

        const createCartOrderResult = schematics20ApiService.createCartOrder(params);

        // all methods should return a Promise
        expectToBePromise(createCartOrderResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/cart', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(cartOrder);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const cartOrder = cartOrderModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          cartOrder,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.createCartOrder(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.createCartOrder({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const createCartOrderPromise = schematics20ApiService.createCartOrder();
        expectToBePromise(createCartOrderPromise);

        createCartOrderPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getCartOrder', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getCartOrder
        const orderId = 'testString';
        const profile = 'ids';
        const params = {
          orderId: orderId,
          profile: profile,
        };

        const getCartOrderResult = schematics20ApiService.getCartOrder(params);

        // all methods should return a Promise
        expectToBePromise(getCartOrderResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/cart/{order_id}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.path['order_id']).toEqual(orderId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const orderId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          orderId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getCartOrder(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getCartOrder({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getCartOrderPromise = schematics20ApiService.getCartOrder();
        expectToBePromise(getCartOrderPromise);

        getCartOrderPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('replaceCartOrder', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // TargetRequest
      const targetRequestModel = {
        cluster_id: 'testString',
        cluster_name: 'testString',
        entitlement_key: { foo: 'bar' },
        namespace: 'testString',
        region: 'testString',
        resource_group_id: 'testString',
        foo: 'testString',
      };

      // ServiceMappingRule
      const serviceMappingRuleModel = {
        type: 'testString',
        input_param_name: 'testString',
        output_param_name: 'testString',
        foo: 'testString',
      };

      // ServiceVariableData
      const serviceVariableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        mapping: [serviceMappingRuleModel],
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // SKUUserState
      const skuUserStateModel = {
        state: 'testString',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // ItemSKU
      const itemSkuModel = {
        sku_id: 'testString',
        sku_type: 'testString',
        sku_sys_lock: systemLockModel,
        sku_user_state: skuUserStateModel,
        foo: 'testString',
      };

      // OrderItemConfiguration
      const orderItemConfigurationModel = {
        name: 'AWS Satellite',
        description: 'Create satellite location in AWS',
        inputs: [variableDataModel],
        settings: [variableDataModel],
        outputs: [variableDataModel],
        target: targetRequestModel,
        operation: 'install',
        service_data: [serviceVariableDataModel],
        catalog_id: 'testString',
        offering_id: 'testString',
        owning_account: 'testString',
        owning_account_crn: 'testString',
        offering_kind_id: 'testString',
        offering_target_kind: 'testString',
        offering_version_id: 'testString',
        offering_kind: 'testString',
        offering_fulfilment_kind: 'testString',
        offering_version: 'testString',
        offering_provisioner_url: 'testString',
        offering_provisioner_ssh: 'testString',
        offering_provisioner_working_directory: 'testString',
        item_sku: itemSkuModel,
        foo: 'testString',
      };

      // CartOrderUserState
      const cartOrderUserStateModel = {
        state: 'Order_Create_Init',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // CartOrderLiteState
      const cartOrderLiteStateModel = {
        status_code: 'normal',
        status_message: 'testString',
        foo: 'testString',
      };

      // CartOrder
      const cartOrderModel = {
        name: 'MySatelliteLocation',
        description: 'Creates satellite location in AWS',
        tags: ['testString'],
        cart_items: [orderItemConfigurationModel],
        service_name: 'SatelliteLocation',
        resource_group: 'testString',
        location: 'us-south',
        user_state: cartOrderUserStateModel,
        sys_lock: systemLockModel,
        state: cartOrderLiteStateModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation replaceCartOrder
        const orderId = 'testString';
        const operation = '0';
        const cartOrder = cartOrderModel;
        const profile = 'ids';
        const params = {
          orderId: orderId,
          operation: operation,
          cartOrder: cartOrder,
          profile: profile,
        };

        const replaceCartOrderResult = schematics20ApiService.replaceCartOrder(params);

        // all methods should return a Promise
        expectToBePromise(replaceCartOrderResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/cart/{order_id}', 'PUT');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(cartOrder);
        expect(options.qs['operation']).toEqual(operation);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.path['order_id']).toEqual(orderId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const orderId = 'testString';
        const operation = '0';
        const cartOrder = cartOrderModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          orderId,
          operation,
          cartOrder,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.replaceCartOrder(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.replaceCartOrder({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const replaceCartOrderPromise = schematics20ApiService.replaceCartOrder();
        expectToBePromise(replaceCartOrderPromise);

        replaceCartOrderPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('runFulfilmentOperation', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation runFulfilmentOperation
        const orderId = 'testString';
        const operation = '0';
        const profile = 'ids';
        const params = {
          orderId: orderId,
          operation: operation,
          profile: profile,
        };

        const runFulfilmentOperationResult = schematics20ApiService.runFulfilmentOperation(params);

        // all methods should return a Promise
        expectToBePromise(runFulfilmentOperationResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/cart/{order_id}', 'POST');
        const expectedAccept = undefined;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['operation']).toEqual(operation);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.path['order_id']).toEqual(orderId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const orderId = 'testString';
        const operation = '0';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          orderId,
          operation,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.runFulfilmentOperation(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.runFulfilmentOperation({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const runFulfilmentOperationPromise = schematics20ApiService.runFulfilmentOperation();
        expectToBePromise(runFulfilmentOperationPromise);

        runFulfilmentOperationPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('deleteCartOrder', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation deleteCartOrder
        const orderId = 'testString';
        const profile = 'ids';
        const destroy = 0;
        const params = {
          orderId: orderId,
          profile: profile,
          destroy: destroy,
        };

        const deleteCartOrderResult = schematics20ApiService.deleteCartOrder(params);

        // all methods should return a Promise
        expectToBePromise(deleteCartOrderResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/cart/{order_id}', 'DELETE');
        const expectedAccept = undefined;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.qs['destroy']).toEqual(destroy);
        expect(options.path['order_id']).toEqual(orderId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const orderId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          orderId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.deleteCartOrder(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.deleteCartOrder({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const deleteCartOrderPromise = schematics20ApiService.deleteCartOrder();
        expectToBePromise(deleteCartOrderPromise);

        deleteCartOrderPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('updateCartOrder', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // TargetRequest
      const targetRequestModel = {
        cluster_id: 'testString',
        cluster_name: 'testString',
        entitlement_key: { foo: 'bar' },
        namespace: 'testString',
        region: 'testString',
        resource_group_id: 'testString',
        foo: 'testString',
      };

      // ServiceMappingRule
      const serviceMappingRuleModel = {
        type: 'testString',
        input_param_name: 'testString',
        output_param_name: 'testString',
        foo: 'testString',
      };

      // ServiceVariableData
      const serviceVariableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        mapping: [serviceMappingRuleModel],
        foo: 'testString',
      };

      // UpdateOrderItemConfiguration
      const updateOrderItemConfigurationModel = {
        name: 'AWS Satellite',
        description: 'Create satellite location in AWS',
        inputs: [variableDataModel],
        settings: [variableDataModel],
        outputs: [variableDataModel],
        target: targetRequestModel,
        operation: 'install',
        service_data: [serviceVariableDataModel],
        foo: 'testString',
      };

      // UpdateCartOrder
      const updateCartOrderModel = {
        name: 'MySatelliteLocation',
        description: 'Creates satellite location in AWS',
        tags: ['testString'],
        cart_items: [updateOrderItemConfigurationModel],
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation updateCartOrder
        const orderId = 'testString';
        const updateCartOrder = updateCartOrderModel;
        const profile = 'ids';
        const params = {
          orderId: orderId,
          updateCartOrder: updateCartOrder,
          profile: profile,
        };

        const updateCartOrderResult = schematics20ApiService.updateCartOrder(params);

        // all methods should return a Promise
        expectToBePromise(updateCartOrderResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/cart/{order_id}', 'PATCH');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(updateCartOrder);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.path['order_id']).toEqual(orderId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const orderId = 'testString';
        const updateCartOrder = updateCartOrderModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          orderId,
          updateCartOrder,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.updateCartOrder(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.updateCartOrder({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const updateCartOrderPromise = schematics20ApiService.updateCartOrder();
        expectToBePromise(updateCartOrderPromise);

        updateCartOrderPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getCartMetadata', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getCartMetadata
        const orderId = 'testString';
        const params = {
          orderId: orderId,
        };

        const getCartMetadataResult = schematics20ApiService.getCartMetadata(params);

        // all methods should return a Promise
        expectToBePromise(getCartMetadataResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/cart/{order_id}/metadata', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.path['order_id']).toEqual(orderId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const orderId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          orderId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getCartMetadata(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getCartMetadata({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getCartMetadataPromise = schematics20ApiService.getCartMetadata();
        expectToBePromise(getCartMetadataPromise);

        getCartMetadataPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listCartResources', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listCartResources
        const orderId = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          orderId: orderId,
          offset: offset,
          limit: limit,
        };

        const listCartResourcesResult = schematics20ApiService.listCartResources(params);

        // all methods should return a Promise
        expectToBePromise(listCartResourcesResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/cart/{order_id}/resources', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.path['order_id']).toEqual(orderId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const orderId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          orderId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listCartResources(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.listCartResources({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const listCartResourcesPromise = schematics20ApiService.listCartResources();
        expectToBePromise(listCartResourcesPromise);

        listCartResourcesPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listCartOrderJobs', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listCartOrderJobs
        const orderId = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          orderId: orderId,
          offset: offset,
          limit: limit,
        };

        const listCartOrderJobsResult = schematics20ApiService.listCartOrderJobs(params);

        // all methods should return a Promise
        expectToBePromise(listCartOrderJobsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/cart/{order_id}/jobs', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.path['order_id']).toEqual(orderId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const orderId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          orderId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listCartOrderJobs(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.listCartOrderJobs({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const listCartOrderJobsPromise = schematics20ApiService.listCartOrderJobs();
        expectToBePromise(listCartOrderJobsPromise);

        listCartOrderJobsPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getCartOrderJob', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getCartOrderJob
        const orderId = 'testString';
        const jobId = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          orderId: orderId,
          jobId: jobId,
          offset: offset,
          limit: limit,
        };

        const getCartOrderJobResult = schematics20ApiService.getCartOrderJob(params);

        // all methods should return a Promise
        expectToBePromise(getCartOrderJobResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/cart/{order_id}/jobs/{job_id}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.path['order_id']).toEqual(orderId);
        expect(options.path['job_id']).toEqual(jobId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const orderId = 'testString';
        const jobId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          orderId,
          jobId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getCartOrderJob(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getCartOrderJob({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getCartOrderJobPromise = schematics20ApiService.getCartOrderJob();
        expectToBePromise(getCartOrderJobPromise);

        getCartOrderJobPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getCartOrderJobLog', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getCartOrderJobLog
        const orderId = 'testString';
        const jobId = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          orderId: orderId,
          jobId: jobId,
          offset: offset,
          limit: limit,
        };

        const getCartOrderJobLogResult = schematics20ApiService.getCartOrderJobLog(params);

        // all methods should return a Promise
        expectToBePromise(getCartOrderJobLogResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/cart/{order_id}/jobs/{job_id}/logs', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.path['order_id']).toEqual(orderId);
        expect(options.path['job_id']).toEqual(jobId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const orderId = 'testString';
        const jobId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          orderId,
          jobId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getCartOrderJobLog(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getCartOrderJobLog({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getCartOrderJobLogPromise = schematics20ApiService.getCartOrderJobLog();
        expectToBePromise(getCartOrderJobLogPromise);

        getCartOrderJobLogPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getCartOrderJobResources', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getCartOrderJobResources
        const orderId = 'testString';
        const jobId = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          orderId: orderId,
          jobId: jobId,
          offset: offset,
          limit: limit,
        };

        const getCartOrderJobResourcesResult = schematics20ApiService.getCartOrderJobResources(params);

        // all methods should return a Promise
        expectToBePromise(getCartOrderJobResourcesResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/cart/{order_id}/jobs/{job_id}/resources', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.path['order_id']).toEqual(orderId);
        expect(options.path['job_id']).toEqual(jobId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const orderId = 'testString';
        const jobId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          orderId,
          jobId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getCartOrderJobResources(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getCartOrderJobResources({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getCartOrderJobResourcesPromise = schematics20ApiService.getCartOrderJobResources();
        expectToBePromise(getCartOrderJobResourcesPromise);

        getCartOrderJobResourcesPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listEnvironmentDefinitions', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listEnvironmentDefinitions
        const offset = 0;
        const limit = 1;
        const catalogId = 'testString';
        const catalogName = 'testString';
        const params = {
          offset: offset,
          limit: limit,
          catalogId: catalogId,
          catalogName: catalogName,
        };

        const listEnvironmentDefinitionsResult = schematics20ApiService.listEnvironmentDefinitions(params);

        // all methods should return a Promise
        expectToBePromise(listEnvironmentDefinitionsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/environmentdefinitions', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['catalog_id']).toEqual(catalogId);
        expect(options.qs['catalog_name']).toEqual(catalogName);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listEnvironmentDefinitions(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.listEnvironmentDefinitions({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('getEnvironmentDefinition', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getEnvironmentDefinition
        const offeringId = 'testString';
        const catalogId = 'testString';
        const catalogName = 'testString';
        const offeringName = 'testString';
        const offeringVersion = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          offeringId: offeringId,
          catalogId: catalogId,
          catalogName: catalogName,
          offeringName: offeringName,
          offeringVersion: offeringVersion,
          offset: offset,
          limit: limit,
        };

        const getEnvironmentDefinitionResult = schematics20ApiService.getEnvironmentDefinition(params);

        // all methods should return a Promise
        expectToBePromise(getEnvironmentDefinitionResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/environmentdefinitions/{offering_id}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['catalog_id']).toEqual(catalogId);
        expect(options.qs['catalog_name']).toEqual(catalogName);
        expect(options.qs['offering_name']).toEqual(offeringName);
        expect(options.qs['offering_version']).toEqual(offeringVersion);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.path['offering_id']).toEqual(offeringId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const offeringId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          offeringId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getEnvironmentDefinition(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getEnvironmentDefinition({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getEnvironmentDefinitionPromise = schematics20ApiService.getEnvironmentDefinition();
        expectToBePromise(getEnvironmentDefinitionPromise);

        getEnvironmentDefinitionPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listEnvironment', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listEnvironment
        const offset = 0;
        const limit = 1;
        const params = {
          offset: offset,
          limit: limit,
        };

        const listEnvironmentResult = schematics20ApiService.listEnvironment(params);

        // all methods should return a Promise
        expectToBePromise(listEnvironmentResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/environments', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listEnvironment(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.listEnvironment({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('createEnvironment', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // BlueprintVariableData
      const blueprintVariableDataModel = {
        name: 'testString',
        value: 'testString',
        foo: 'testString',
      };

      // WorkItemLastJob
      const workItemLastJobModel = {
        command_object: 'workspace',
        command_object_name: 'testString',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        job_status: 'job_pending',
        foo: 'testString',
      };

      // WorkItem
      const workItemModel = {
        workitem_object_id: 'testString',
        workitem_object_type: 'workspace',
        name: 'testString',
        layer: 'testString',
        source: externalSourceModel,
        tags: 'testString',
        inputs: [blueprintVariableDataModel],
        outputs: [blueprintVariableDataModel],
        settings: [blueprintVariableDataModel],
        last_job: workItemLastJobModel,
        foo: 'testString',
      };

      // FlowOperations
      const flowOperationsModel = {
        install: 'testString',
        update: 'testString',
        uninstall: 'testString',
        configure: 'testString',
        foo: 'testString',
      };

      // Flow
      const flowModel = {
        type: 'testString',
        operations: [flowOperationsModel],
        foo: 'testString',
      };

      // Blueprint
      const blueprintModel = {
        name: 'testString',
        description: 'testString',
        source: externalSourceModel,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        workitems: [workItemModel],
        flow: flowModel,
        foo: 'testString',
      };

      // ConfigItem
      const configItemModel = {
        name: 'testString',
        description: 'testString',
        source: externalSourceModel,
        inputs: [blueprintVariableDataModel],
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // EnvironmentUserState
      const environmentUserStateModel = {
        state: 'Environment_Create_Init',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // EnvironmentState
      const environmentStateModel = {
        status_code: 'normal',
        status_message: 'testString',
        foo: 'testString',
      };

      // Environment
      const environmentModel = {
        name: 'Toronto Dev Environtment',
        schema_version: '1.0',
        source: externalSourceModel,
        description: 'Deploys dev environtment instance in Toronto Region',
        resource_group: 'Default',
        tags: ['testString'],
        location: 'us-south',
        blueprint: blueprintModel,
        config: [configItemModel],
        inputs: [variableDataModel],
        settings: [variableDataModel],
        outputs: [variableDataModel],
        sys_lock: systemLockModel,
        user_state: environmentUserStateModel,
        state: environmentStateModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation createEnvironment
        const environment = environmentModel;
        const params = {
          environment: environment,
        };

        const createEnvironmentResult = schematics20ApiService.createEnvironment(params);

        // all methods should return a Promise
        expectToBePromise(createEnvironmentResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/environments', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(environment);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const environment = environmentModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          environment,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.createEnvironment(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.createEnvironment({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const createEnvironmentPromise = schematics20ApiService.createEnvironment();
        expectToBePromise(createEnvironmentPromise);

        createEnvironmentPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getEnvironment', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getEnvironment
        const environmentId = 'testString';
        const profile = 'ids';
        const params = {
          environmentId: environmentId,
          profile: profile,
        };

        const getEnvironmentResult = schematics20ApiService.getEnvironment(params);

        // all methods should return a Promise
        expectToBePromise(getEnvironmentResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/environments/{environment_id}', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.path['environment_id']).toEqual(environmentId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const environmentId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          environmentId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getEnvironment(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getEnvironment({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getEnvironmentPromise = schematics20ApiService.getEnvironment();
        expectToBePromise(getEnvironmentPromise);

        getEnvironmentPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('replaceEnvironment', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // BlueprintVariableData
      const blueprintVariableDataModel = {
        name: 'testString',
        value: 'testString',
        foo: 'testString',
      };

      // WorkItemLastJob
      const workItemLastJobModel = {
        command_object: 'workspace',
        command_object_name: 'testString',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        job_status: 'job_pending',
        foo: 'testString',
      };

      // WorkItem
      const workItemModel = {
        workitem_object_id: 'testString',
        workitem_object_type: 'workspace',
        name: 'testString',
        layer: 'testString',
        source: externalSourceModel,
        tags: 'testString',
        inputs: [blueprintVariableDataModel],
        outputs: [blueprintVariableDataModel],
        settings: [blueprintVariableDataModel],
        last_job: workItemLastJobModel,
        foo: 'testString',
      };

      // FlowOperations
      const flowOperationsModel = {
        install: 'testString',
        update: 'testString',
        uninstall: 'testString',
        configure: 'testString',
        foo: 'testString',
      };

      // Flow
      const flowModel = {
        type: 'testString',
        operations: [flowOperationsModel],
        foo: 'testString',
      };

      // Blueprint
      const blueprintModel = {
        name: 'testString',
        description: 'testString',
        source: externalSourceModel,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        workitems: [workItemModel],
        flow: flowModel,
        foo: 'testString',
      };

      // ConfigItem
      const configItemModel = {
        name: 'testString',
        description: 'testString',
        source: externalSourceModel,
        inputs: [blueprintVariableDataModel],
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // EnvironmentUserState
      const environmentUserStateModel = {
        state: 'Environment_Create_Init',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // EnvironmentState
      const environmentStateModel = {
        status_code: 'normal',
        status_message: 'testString',
        foo: 'testString',
      };

      // Environment
      const environmentModel = {
        name: 'Toronto Dev Environtment',
        schema_version: '1.0',
        source: externalSourceModel,
        description: 'Deploys dev environtment instance in Toronto Region',
        resource_group: 'Default',
        tags: ['testString'],
        location: 'us-south',
        blueprint: blueprintModel,
        config: [configItemModel],
        inputs: [variableDataModel],
        settings: [variableDataModel],
        outputs: [variableDataModel],
        sys_lock: systemLockModel,
        user_state: environmentUserStateModel,
        state: environmentStateModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation replaceEnvironment
        const environmentId = 'testString';
        const environment = environmentModel;
        const profile = 'ids';
        const params = {
          environmentId: environmentId,
          environment: environment,
          profile: profile,
        };

        const replaceEnvironmentResult = schematics20ApiService.replaceEnvironment(params);

        // all methods should return a Promise
        expectToBePromise(replaceEnvironmentResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/environments/{environment_id}', 'PUT');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(environment);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.path['environment_id']).toEqual(environmentId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const environmentId = 'testString';
        const environment = environmentModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          environmentId,
          environment,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.replaceEnvironment(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.replaceEnvironment({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const replaceEnvironmentPromise = schematics20ApiService.replaceEnvironment();
        expectToBePromise(replaceEnvironmentPromise);

        replaceEnvironmentPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('deleteEnvironment', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation deleteEnvironment
        const environmentId = 'testString';
        const profile = 'ids';
        const destroy = 0;
        const params = {
          environmentId: environmentId,
          profile: profile,
          destroy: destroy,
        };

        const deleteEnvironmentResult = schematics20ApiService.deleteEnvironment(params);

        // all methods should return a Promise
        expectToBePromise(deleteEnvironmentResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/environments/{environment_id}', 'DELETE');
        const expectedAccept = undefined;
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.qs['destroy']).toEqual(destroy);
        expect(options.path['environment_id']).toEqual(environmentId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const environmentId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          environmentId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.deleteEnvironment(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.deleteEnvironment({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const deleteEnvironmentPromise = schematics20ApiService.deleteEnvironment();
        expectToBePromise(deleteEnvironmentPromise);

        deleteEnvironmentPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('updateEnvironment', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // VariableMetadata
      const variableMetadataModel = {
        type: 'boolean',
        aliases: ['testString'],
        description: 'testString',
        default_value: 'testString',
        secure: true,
        immutable: true,
        hidden: true,
        options: ['testString'],
        min_value: 38,
        max_value: 38,
        min_length: 38,
        max_length: 38,
        matches: 'testString',
        position: 38,
        group_by: 'testString',
        source: 'testString',
        foo: 'testString',
      };

      // VariableData
      const variableDataModel = {
        name: 'testString',
        value: 'testString',
        metadata: variableMetadataModel,
        foo: 'testString',
      };

      // BlueprintVariableData
      const blueprintVariableDataModel = {
        name: 'testString',
        value: 'testString',
        foo: 'testString',
      };

      // WorkItemLastJob
      const workItemLastJobModel = {
        command_object: 'workspace',
        command_object_name: 'testString',
        command_object_id: 'testString',
        command_name: 'workspace_plan',
        job_status: 'job_pending',
        foo: 'testString',
      };

      // WorkItem
      const workItemModel = {
        workitem_object_id: 'testString',
        workitem_object_type: 'workspace',
        name: 'testString',
        layer: 'testString',
        source: externalSourceModel,
        tags: 'testString',
        inputs: [blueprintVariableDataModel],
        outputs: [blueprintVariableDataModel],
        settings: [blueprintVariableDataModel],
        last_job: workItemLastJobModel,
        foo: 'testString',
      };

      // FlowOperations
      const flowOperationsModel = {
        install: 'testString',
        update: 'testString',
        uninstall: 'testString',
        configure: 'testString',
        foo: 'testString',
      };

      // Flow
      const flowModel = {
        type: 'testString',
        operations: [flowOperationsModel],
        foo: 'testString',
      };

      // Blueprint
      const blueprintModel = {
        name: 'testString',
        description: 'testString',
        source: externalSourceModel,
        inputs: [variableDataModel],
        outputs: [variableDataModel],
        settings: [variableDataModel],
        workitems: [workItemModel],
        flow: flowModel,
        foo: 'testString',
      };

      // ConfigItem
      const configItemModel = {
        name: 'testString',
        description: 'testString',
        source: externalSourceModel,
        inputs: [blueprintVariableDataModel],
        foo: 'testString',
      };

      // SystemLock
      const systemLockModel = {
        sys_locked: true,
        sys_locked_by: 'testString',
        sys_locked_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // EnvironmentUserState
      const environmentUserStateModel = {
        state: 'Environment_Create_Init',
        set_by: 'testString',
        set_at: '2019-01-01T12:00:00.000Z',
        foo: 'testString',
      };

      // EnvironmentState
      const environmentStateModel = {
        status_code: 'normal',
        status_message: 'testString',
        foo: 'testString',
      };

      // Environment
      const environmentModel = {
        name: 'Toronto Dev Environtment',
        schema_version: '1.0',
        source: externalSourceModel,
        description: 'Deploys dev environtment instance in Toronto Region',
        resource_group: 'Default',
        tags: ['testString'],
        location: 'us-south',
        blueprint: blueprintModel,
        config: [configItemModel],
        inputs: [variableDataModel],
        settings: [variableDataModel],
        outputs: [variableDataModel],
        sys_lock: systemLockModel,
        user_state: environmentUserStateModel,
        state: environmentStateModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation updateEnvironment
        const environmentId = 'testString';
        const environment = environmentModel;
        const profile = 'ids';
        const params = {
          environmentId: environmentId,
          environment: environment,
          profile: profile,
        };

        const updateEnvironmentResult = schematics20ApiService.updateEnvironment(params);

        // all methods should return a Promise
        expectToBePromise(updateEnvironmentResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/environments/{environment_id}', 'PATCH');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(environment);
        expect(options.qs['profile']).toEqual(profile);
        expect(options.path['environment_id']).toEqual(environmentId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const environmentId = 'testString';
        const environment = environmentModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          environmentId,
          environment,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.updateEnvironment(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.updateEnvironment({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const updateEnvironmentPromise = schematics20ApiService.updateEnvironment();
        expectToBePromise(updateEnvironmentPromise);

        updateEnvironmentPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listEnvironmentWorkspaces', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listEnvironmentWorkspaces
        const environmentId = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          environmentId: environmentId,
          offset: offset,
          limit: limit,
        };

        const listEnvironmentWorkspacesResult = schematics20ApiService.listEnvironmentWorkspaces(params);

        // all methods should return a Promise
        expectToBePromise(listEnvironmentWorkspacesResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/environment/{environment_id}/workspaces', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.path['environment_id']).toEqual(environmentId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const environmentId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          environmentId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listEnvironmentWorkspaces(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.listEnvironmentWorkspaces({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const listEnvironmentWorkspacesPromise = schematics20ApiService.listEnvironmentWorkspaces();
        expectToBePromise(listEnvironmentWorkspacesPromise);

        listEnvironmentWorkspacesPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listEnvironmentResources', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listEnvironmentResources
        const environmentId = 'testString';
        const offset = 0;
        const limit = 1;
        const params = {
          environmentId: environmentId,
          offset: offset,
          limit: limit,
        };

        const listEnvironmentResourcesResult = schematics20ApiService.listEnvironmentResources(params);

        // all methods should return a Promise
        expectToBePromise(listEnvironmentResourcesResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/environment/{environment_id}/resources', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['offset']).toEqual(offset);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.path['environment_id']).toEqual(environmentId);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const environmentId = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          environmentId,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listEnvironmentResources(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.listEnvironmentResources({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const listEnvironmentResourcesPromise = schematics20ApiService.listEnvironmentResources();
        expectToBePromise(listEnvironmentResourcesPromise);

        listEnvironmentResourcesPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('getKmsSettings', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation getKmsSettings
        const location = 'testString';
        const params = {
          location: location,
        };

        const getKmsSettingsResult = schematics20ApiService.getKmsSettings(params);

        // all methods should return a Promise
        expectToBePromise(getKmsSettingsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/kms', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['location']).toEqual(location);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const location = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          location,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.getKmsSettings(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.getKmsSettings({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const getKmsSettingsPromise = schematics20ApiService.getKmsSettings();
        expectToBePromise(getKmsSettingsPromise);

        getKmsSettingsPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('updateKmsSettings', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // KMSSettingsPrimaryCrk
      const kmsSettingsPrimaryCrkModel = {
        kms_name: 'testString',
        kms_private_endpoint: 'testString',
        key_crn: 'testString',
        foo: 'testString',
      };

      // KMSSettingsSecondaryCrk
      const kmsSettingsSecondaryCrkModel = {
        kms_name: 'testString',
        kms_private_endpoint: 'testString',
        key_crn: 'testString',
        foo: 'testString',
      };

      // KMSSettings
      const kmsSettingsModel = {
        location: 'testString',
        encryption_scheme: 'testString',
        resource_group: 'testString',
        primary_crk: kmsSettingsPrimaryCrkModel,
        secondary_crk: kmsSettingsSecondaryCrkModel,
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation updateKmsSettings
        const kmsSettings = kmsSettingsModel;
        const params = {
          kmsSettings: kmsSettings,
        };

        const updateKmsSettingsResult = schematics20ApiService.updateKmsSettings(params);

        // all methods should return a Promise
        expectToBePromise(updateKmsSettingsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/kms', 'PUT');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.body).toEqual(kmsSettings);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const kmsSettings = kmsSettingsModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          kmsSettings,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.updateKmsSettings(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.updateKmsSettings({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const updateKmsSettingsPromise = schematics20ApiService.updateKmsSettings();
        expectToBePromise(updateKmsSettingsPromise);

        updateKmsSettingsPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listKms', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listKms
        const encryptionScheme = 'testString';
        const location = 'testString';
        const resourceGroup = 'testString';
        const limit = 1;
        const sort = 'testString';
        const params = {
          encryptionScheme: encryptionScheme,
          location: location,
          resourceGroup: resourceGroup,
          limit: limit,
          sort: sort,
        };

        const listKmsResult = schematics20ApiService.listKms(params);

        // all methods should return a Promise
        expectToBePromise(listKmsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/settings/kms_instances', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        expect(options.qs['encryption_scheme']).toEqual(encryptionScheme);
        expect(options.qs['location']).toEqual(location);
        expect(options.qs['resource_group']).toEqual(resourceGroup);
        expect(options.qs['limit']).toEqual(limit);
        expect(options.qs['sort']).toEqual(sort);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const encryptionScheme = 'testString';
        const location = 'testString';
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          encryptionScheme,
          location,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listKms(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.listKms({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const listKmsPromise = schematics20ApiService.listKms();
        expectToBePromise(listKmsPromise);

        listKmsPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
  describe('listLocations', () => {
    describe('positive tests', () => {
      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation listLocations
        const params = {};

        const listLocationsResult = schematics20ApiService.listLocations(params);

        // all methods should return a Promise
        expectToBePromise(listLocationsResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/locations', 'GET');
        const expectedAccept = 'application/json';
        const expectedContentType = undefined;
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.listLocations(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });

      test('should not have any problems when no parameters are passed in', () => {
        // invoke the method with no parameters
        schematics20ApiService.listLocations({});
        checkForSuccessfulExecution(createRequestMock);
      });
    });
  });
  describe('processTemplateMetaData', () => {
    describe('positive tests', () => {
      // Request models needed by this operation.

      // ExternalSourceGit
      const externalSourceGitModel = {
        computed_git_repo_url: 'testString',
        git_repo_url: 'testString',
        git_token: 'testString',
        git_repo_folder: 'testString',
        git_release: 'testString',
        git_branch: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCatalog
      const externalSourceCatalogModel = {
        catalog_name: 'testString',
        offering_name: 'testString',
        offering_version: 'testString',
        offering_kind: 'testString',
        offering_id: 'testString',
        offering_version_id: 'testString',
        offering_repo_url: 'testString',
        foo: 'testString',
      };

      // ExternalSourceCosBucket
      const externalSourceCosBucketModel = {
        cos_bucket_url: 'testString',
        foo: 'testString',
      };

      // ExternalSource
      const externalSourceModel = {
        source_type: 'local',
        git: externalSourceGitModel,
        catalog: externalSourceCatalogModel,
        cos_bucket: externalSourceCosBucketModel,
        foo: 'testString',
      };

      // TemplateMetaDataRequest
      const templateMetaDataRequestModel = {
        region: 'testString',
        template_type: 'testString',
        source: externalSourceModel,
        source_type: 'local',
        foo: 'testString',
      };

      test('should pass the right params to createRequest', () => {
        // Construct the params object for operation processTemplateMetaData
        const templateMetaDataRequest = templateMetaDataRequestModel;
        const xGithubToken = 'testString';
        const params = {
          templateMetaDataRequest: templateMetaDataRequest,
          xGithubToken: xGithubToken,
        };

        const processTemplateMetaDataResult = schematics20ApiService.processTemplateMetaData(params);

        // all methods should return a Promise
        expectToBePromise(processTemplateMetaDataResult);

        // assert that create request was called
        expect(createRequestMock).toHaveBeenCalledTimes(1);

        const options = getOptions(createRequestMock);

        checkUrlAndMethod(options, '/v2/template_metadata_processor', 'POST');
        const expectedAccept = 'application/json';
        const expectedContentType = 'application/json';
        checkMediaHeaders(createRequestMock, expectedAccept, expectedContentType);
        checkUserHeader(createRequestMock, 'X-Github-token', xGithubToken);
        expect(options.body).toEqual(templateMetaDataRequest);
      });

      test('should prioritize user-given headers', () => {
        // parameters
        const templateMetaDataRequest = templateMetaDataRequestModel;
        const userAccept = 'fake/accept';
        const userContentType = 'fake/contentType';
        const params = {
          templateMetaDataRequest,
          headers: {
            Accept: userAccept,
            'Content-Type': userContentType,
          },
        };

        schematics20ApiService.processTemplateMetaData(params);
        checkMediaHeaders(createRequestMock, userAccept, userContentType);
      });
    });

    describe('negative tests', () => {
      test('should enforce required parameters', async done => {
        let err;
        try {
          await schematics20ApiService.processTemplateMetaData({});
        } catch (e) {
          err = e;
        }

        expect(err.message).toMatch(/Missing required parameters/);
        done();
      });

      test('should reject promise when required params are not given', done => {
        const processTemplateMetaDataPromise = schematics20ApiService.processTemplateMetaData();
        expectToBePromise(processTemplateMetaDataPromise);

        processTemplateMetaDataPromise.catch(err => {
          expect(err.message).toMatch(/Missing required parameters/);
          done();
        });
      });
    });
  });
});
