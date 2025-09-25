pipeline {
    agent any
    tools {
        maven 'Default'
    }
    stages {
        stage('checking') {
            steps {
                git branch:'master', url: 'https://github.com/mikmetro/otp1_course'
            }
        }

        stage ('build') {
            steps {
                sh "mvn clean install"
            }
        }

        stage('Test') {
            steps {
                sh "mvn test"
            }
        }
        stage('Code Coverage') {
            steps {
                sh "mvn jacoco:report"
            }
        }
        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('Publish Coverage Report') {
            steps {
                recordCoverage(tools: [[parser: 'JACOCO']],
                            sourceCodeRetention: 'LAST_BUILD',
                            sourceDirectories: [[path: 'plugin/src/main/java']])
            }
        }
    }
}