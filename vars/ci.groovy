def call() {
    try {
        pipeline {
            agent {
                label 'workstation'
            }
            stages {
                stage('Compile/Build') {
                    steps {
                        script {
                            common.compile()
                        }
                    }
                }
                stage('Unit Tests') {
                    steps {
                        script {
                            common.unittests()
                        }
                    }
                }
                stage('Quality Control') {
                    steps {
                        echo 'quality control'
                    }
                }
                stage('Upload code to centralized place') {
                    steps {
                        echo 'upload'
                    }
                }
            }
            post{
                always{
                    cleanWs()
                }
        }

        }

    }

    catch(Exception e) {
        common.email("Failed")
       }


}

