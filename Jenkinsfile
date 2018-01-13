
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
    junit testResults: 'build/test-results/*.xml'

    script {
      def tr = junitTestResults()
      println tr
    }
  }
}
