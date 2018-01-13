
pipeline {

  agent {
    label 'master'
  }

  stages {
    stage('Tests') {
      steps {
        sh './gradlew clean test'
      }
    }
  }

  post {
    always {
      junit testResults: 'build/test-results/*.xml'

      script {
        def tr = junitTestResults()
        println tr
      }
    }
  }
}
