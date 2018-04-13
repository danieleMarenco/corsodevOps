pipeline {
    anget any {
        stages {
            stage('release') {
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