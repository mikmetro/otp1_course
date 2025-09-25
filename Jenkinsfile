pipeline {
    agent any
    tools {
        maven 'Maven3'
    }
    stages {
        stage('checking') {
            steps {
                git branch:'master', url: 'https://github.com/mikmetro/otp1_course'
            }
        }

        stage ('build') {
            steps {
                mvn clean install
            }
        }

        stage('Test') {
            steps {
                mvn test
            }
        }
        stage('Code Coverage') {
            steps {
                mvn jacoco:report
            }
        }
        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('Publish Coverage Report') {
            steps {
                jacoco()
            }
        }
    }
}