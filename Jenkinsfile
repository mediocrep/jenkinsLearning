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
      post {
        always {
          junit 'target/surefire-reports/*.xml'
        }

      }
      steps {
        sh '# mvn test'
        echo '${b}'
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