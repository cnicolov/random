pipeline {
  agent {
    label 'master'
  }
  stages {
    stage('Tests') {
      parallel {
        stage('Tests') {
          steps {
            sh './gradlew clean test'
          }
        }
        stage('ZiStage') {
          steps {
            input(message: 'r', id: 'f', ok: 'd', submitter: 'awr')
          }
        }
      }
    }
  }
  post {
    always {
      junit 'build/test-results/*.xml'
      script {
        def tr = junitTestResults()
        println tr
      }
      
      
    }
    
  }
}