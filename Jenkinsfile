pipeline {
    agent { docker 'maven:4.0.0' }
    stages {
        stage('build and test') {
            steps {
                sh 'maven -e clean install'
            }
        }
    }
}
