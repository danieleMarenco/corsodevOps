pipeline {
    anget any {
        stages {
            stage('Checkout SCM') {
                steps{
                    checkout scm
                }
            }
            stage('Release') {
                when{ branch 'master' }
                environment {
                    DOCKER_REPOSITORY = 'danielemarenco94'
                }
                steps{
                    sh 'sbt release'
                }
            }
        }
    }
}