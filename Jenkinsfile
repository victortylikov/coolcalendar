pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        echo 'Build Start'
        bat 'mvn package'
      }
    }
  }
}