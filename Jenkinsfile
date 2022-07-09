pipeline {
    agent any
    tools{
        maven 'maven_3_5_0'
    }
    stages{
        stage('Build Maven'){
            steps {
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/vishalbhatt001/dev-automation']]])
                sh 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps {
                sh 'docker build -t vishallovejava/devops-integration .'
            }
        
         }
         stage('Push image to docker hub'){
            steps {
                withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                    sh 'docker login -u vishallovejava -p ${dockerhubpwd}'
                  }
                  sh 'docker push vishallovejava/devops-integration'
            }
        
         }
    }
    
}