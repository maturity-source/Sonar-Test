pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'build'
      }
    }

    stage('Backend') {
      parallel {
        stage('Backend') {
          steps {
            echo 'backend'
          }
        }

        stage('error') {
          steps {
            sh 'unit'
          }
        }

      }
    }

    stage('Frontend') {
      parallel {
        stage('Frontend') {
          steps {
            sh 'frontend'
          }
        }

        stage('') {
          steps {
            echo 'Frontend'
          }
        }

      }
    }

    stage('Stactic Analysis') {
      steps {
        fileExists 'pom.xml'
      }
    }

    stage('Deploiement') {
      steps {
        git(url: 'https://github.com/maturity-source/Gitmaturity4.git', branch: 'master', poll: true)
      }
    }

  }
}