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
          agent any
          steps {
            sh 'mvn --version'
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

        stage('error') {
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