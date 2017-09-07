pipeline {
    agent any
    post {
        always {
            junit 'build/reports/**/*.xml'
        }
    }
}
