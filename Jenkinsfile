pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'build'
      }
    }

    stage('Backend') {
      parallel {
        stage('Backend') {
          steps {
            sh '       '
          }
        }

        stage('') {
          steps {
            sh 'unit'
          }
        }

      }
    }

    stage('Frontend') {
      steps {
        sh 'frontend'
      }
    }

    stage('Stactic Analysis') {
      steps {
        sh 'static'
      }
    }

    stage('Deploiement') {
      steps {
        sh 'deploiement'
      }
    }

  }
}