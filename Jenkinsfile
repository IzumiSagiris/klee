pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }

        stage('Deploy') {
            when {
                expression {
                  currentBuild.result == null || currentBuild.result == 'SUCCESS'
                      }
                  }
        steps {
            sh 'cp ./target/klee-0.0.1-SNAPSHOT.jar .'
            sh 'chmod +x deploy.sh'
            sh './deploy.sh'
              }
        }
    }
}
