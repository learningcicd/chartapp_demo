 properties([disableConcurrentBuilds(),
			parameters([
                        string(defaultValue: 'Master', description: 'K8s helm chart git branch name', name: 'git_branch', trim: true),
                        string(defaultValue: '', description: 'Docker Image Tag Ex: covidacrdemo.azurecr.io/jenkins:v.{var} ', name: 'docker_tag', trim: true)
                        ])
          ])

def glb_git_branch = '' 
def glb_docker_tag = ''


stage('Setting up jenkinsfile properties') {
    node() {    

	    if (params.git_branch) {  
	        glb_git_branch = sh(returnStdout: true, script: "echo ${params.git_branch}").trim()
	    } else {
		    glb_git_branch = 'master'
	    }
	    if (params.docker_tag) {  
	        glb_docker_tag = sh(returnStdout: true, script: "echo ${params.glb_docker_tag}").trim()
	    } else {
		    glb_docker_tag = 'covidacrdemo.azurecr.io/jenkins:v.0.0'
	    
	        
	}
}
}

// @Library("JenkinsSharedLib@master") _
///     mainLibraryPipeline {
//        git_branch = glb_customer_id
 //       docker_tag = glb_customer_subdomain
// }

