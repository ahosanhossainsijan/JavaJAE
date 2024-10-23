pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {
        stage('Clean') {
            steps {
                script {
                    bat 'mvn clean install'
                }
            }
        }

        stage('Compile') {
            steps {
                script {
                    bat 'mvn compile'
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    bat 'mvn test'
                }
            }
        }

        stage('Package') {
            steps {
                script {
                    bat 'mvn package'
                }
            }
        }
    }
}