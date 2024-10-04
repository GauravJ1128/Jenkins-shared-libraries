def call(String ImageNmae, String ImageTag, String DockerHubUser){
  withCredentials([usernamePassword(credentialsId: "DockerHub-cred",
                passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
                sh "docker image tag notes-app:latest ${env.dockerHubUser}/notes-app:latest"
                sh "docker push ${DockerHubUser}/${ImageNmae}:${ImageTag}"
                }
}
