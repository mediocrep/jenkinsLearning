pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        sh '# mvn -B -DskipTests clean package'
      }
    }

    stage('test') {
      environment {
        b = 'bbb'
      }
      steps {
        sh '# mvn test'
        echo '${b}'
      }
      post {
        always {
          junit 'target/surefire-reports/*.xml'
        }
      }
    }

    stage('deliver') {
      steps {
        sh '# ./jenkins/scripts/deliver.sh'
      }
    }

  }
  environment {
    a = 'aaa'
  }
}