pipeline {
    agent { docker 'maven:4.0.0' }
    stages {
        stage('build and test') {
            steps {
                bat 'maven -e clean install'
            }
        }
    }
}
