pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK11'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/nehjun13/restassuredapi.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run API Tests') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Publish Test Report') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }

    post {
        always {
            archiveArtifacts artifacts: 'target/surefire-reports/**', allowEmptyArchive: true
            echo '📊 Test report archived'
        }
        success {
            echo '✅ All tests passed!'
        }
        failure {
            echo '❌ Tests failed - check the report'
        }
    }
}