pipeline {
    agent any
    stage('Build') {
        steps {
            sh 'echo "Hello World"'
            sh 'mvn clean site install"'
        }
    }
    post {
        always {
            junit 'build/reports/**/*.xml'
        }
    }
}
