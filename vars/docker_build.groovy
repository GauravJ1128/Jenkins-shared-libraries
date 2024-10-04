def call(string ImageName, string ImageTag, string DockerHubUser){
  sh "docker build -t ${DockerHubUser}/${ImageName}:$(ImageTag) ."  
}
