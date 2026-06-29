pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Repository cloned by Jenkins'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t student-result-app .'
            }
        }

        stage('Run Container') {
            steps {
                sh 'docker run --rm student-result-app'
            }
        }
    }
}