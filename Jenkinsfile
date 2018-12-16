pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        echo 'Build Start'
        bat 'mvn package && start /min java -jar target/spring-boot-sample-0.0.1-SNAPSHOT.jar'
      }
    }
  }
}