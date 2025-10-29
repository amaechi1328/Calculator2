pipeline {
    agent any
    stages {
        stage("Checkout") {
            steps {
                git url: 'https://github.com/amaechi1328/Calculator2.git', branch: 'master'
            }
        }
        stage("Compile") {
            steps {
                bat "mvn clean compile"
            }
        }
        stage('Unit Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}