
Schematics version:
--------
// schematicversions
       schematicsService
    .getSchematicsVersion({})
    .then(schematicsVersion => {
      console.log(schematicsVersion.result)
    })
    .catch(err => {
      console.warn(err);
    });

      // begin-list_actions

      schematicsService.listActions({})
      .then(res => {
        console.log(JSON.stringify(res.result, null, 2));
      })
      .catch(err => {
        console.warn(err)
      });

    // end-list_actions

create:
 // begin-create_action
 
 const params = {
    name:"workspacetestline",
    description:"short description",
    location:"us",
    resource_group:"Default",
    tags:["env:prod", "mytest"],
    source:{
        'git':
        {
            'git_repo_url':"https://github.com/akhiljain23/cli-demo"
        }
    }

};

schematicsService.createAction(params)
  .then(res => {
    console.log(JSON.stringify(res.result, null, 2));
  })
  .catch(err => {
    console.warn(err)
  });

// end-create_action

list action:

         // begin-get_action
 
         const params = {
            actionId: 'us.ACTION.workspacetestline.978eed9a',
          };
      
          schematicsService.getAction(params)
            .then(res => {
              console.log(JSON.stringify(res.result, null, 2));
            })
            .catch(err => {
              console.warn(err)
            });
      
          // end-get_action

               // begin-update_action
 
     const params = {
        actionId: 'us.ACTION.workspacetestline.978eed9a',
        xGithubToken: 'testString',
        description:"Updated new short description"
      };
  
      schematicsService.updateAction(params)
        .then(res => {
          console.log(JSON.stringify(res.result, null, 2));
        })
        .catch(err => {
          console.warn(err)
        });
  
      // end-update_action


     

        // begin-list_jobs
        const params = {
            resource:"actions",
           actionId: 'us.ACTION.workspacetestline.978eed9a'
         };
    
        schematicsService.listJobs(params)
          .then(res => {
            console.log(JSON.stringify(res.result, null, 2));
          })
          .catch(err => {
            console.warn(err)
          });
    
        // end-list_jobs

        Not working:
        -----------
   // begin-create_job
 
   const params = {"refreshToken":"testString",
   "commandObject":"action",
   "commandObjectId":'us.ACTION.workspacetestline.978eed9a',
   "commandName":"ansible_playbook_run",
   "commandParameter":"aj.yml"
  };

  schematicsService.createJob(params)
    .then(res => {
      console.log(JSON.stringify(res.result, null, 2));
    })
    .catch(err => {
      console.warn(err)
    });

  // end-create_job

  -----

  // begin-create_job
 
const params = {"refreshToken":"testString",
"commandObject":"action",
"commandObjectId":'us.ACTION.workspacetestline.978eed9a',
"commandName":"ansible_playbook_run",
"commandParameter":"aj.yml"
};

schematicsService.createJob(params)
 .then(res => {
   console.log(JSON.stringify(res.result, null, 2));
 })
 .catch(err => {
   console.warn(err)
 });

// end-create_job




            // begin-list_job_logs
 
     const params = {
        jobId: 'us.JOB.workspacetestline.2efb077e'
      };
  
      schematicsService.listJobLogs(params)
        .then(res => {
          console.log(JSON.stringify(res.result, null, 2));
        })
        .catch(err => {
          console.warn(err)
        });
  
      // end-list_job_logs


      Update a Job:

     // begin-update_job
 
     const params = {
        refreshToken: 'testString',
        jobId: 'us.JOB.workspacetestline1-msk.4c8de7f3',
        description: "Very Huge short description",
      };
  
      schematicsService.replaceJob(params)
        .then(res => {
          console.log(JSON.stringify(res.result, null, 2));
        })
        .catch(err => {
          console.warn(err)
        });
  
      // end-update_job







