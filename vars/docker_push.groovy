def call(String ImageNmae, String ImageTag, String DockerHubUser){
  withCredentials([usernamePassword(credentialsId: "DockerHub-cred", passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
                sh "docker login -u ${DockerHubUser} -p ${DockerHubPass}"
                }
                sh "docker push ${DockerHubUser}/${ImageNmae}:${ImageTag}"
}
