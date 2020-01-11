pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        git(url: 'https://github.com/maturity-source/GitMaturity1.git', branch: 'master')
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
            readFile 'pom.xml'
          }
        }

      }
    }

    stage('Frontend') {
      parallel {
        stage('Frontend') {
          steps {
            pwd(tmp: true)
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