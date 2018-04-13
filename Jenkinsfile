pipeline {
    agent any {
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
                    sh 'sbt "release with-default"'
                }
            }
        }
    }
}