pipeline {
    agent { docker 'maven:3.5.0' }
    stages {
        stage('build and test') {
            steps {
                bat 'maven -e clean install'
            }
        }
    }
}
