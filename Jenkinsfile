pipeline {
    agent any
    stages {
        stage('Checkout SCM') {
            steps{
                sh 'git checkout ${BRANCH_NAME}'
            }
        }
        stage('Release') {
            when{ branch 'master' }
            environment {
                DOCKER_REPOSITORY = 'danielemarenco94'
            }
            steps{
                withCredentials([usernamePassword(credentialsId: 'docker', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
                    sh 'docker login -u ${USERNAME} -p ${PASSWORD}'
                }
                sshagent (credentials: ['GitHub']){
                    sh 'sbt "release with-defaults"'
                }
            }
        }
    }
    post {
        always {
            deleteDir()
        }
    }
}