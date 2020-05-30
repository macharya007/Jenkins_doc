pipeline {
    agent any
    stages {
        stage('One') {
            steps {
                echo "Hi, this is my first component of my pipeline project"
            }
        }
        stage('Two') {
            steps {
                input("Do you want to proceed?")
                steps{
               echo "Thanks for confirmation,proceeding!!!"
                }
            }
            
        }
        stage('Three')
        {
           steps {
                when {
                    //not {
                         branch "master"
                   // } 
                }
                steps {
                    echo "Hello here, in stage three!!!"
                }
            }
        }
        stage('Four')
        {
            parallel {
                stage('Unit Test') {
                    steps {
                        echo "Running Unit esting"
                    }
                }
                stage('Integration Test') {
                    agent {
                        docker {
                            reuseNode false
                            image 'ubuntu'
                        }
                    }
                    steps {
                        echo "Running Integration test..."
                    }

                }
            }
        }
    }
}