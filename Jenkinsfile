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
      parallel {
        stage('Stactic Analysis') {
          steps {
            fileExists 'pom.xml'
          }
        }

        stage('jacoco') {
          steps {
            jacoco(buildOverBuild: true, changeBuildStatus: true, classPattern: '\'target/classes\'', minimumMethodCoverage: '80', minimumLineCoverage: '80', minimumInstructionCoverage: '80', minimumComplexityCoverage: '80', minimumClassCoverage: '80', minimumBranchCoverage: '70', maximumMethodCoverage: '100', maximumLineCoverage: '100', maximumComplexityCoverage: '100', maximumClassCoverage: '100', maximumBranchCoverage: '100', deltaLineCoverage: '80', deltaMethodCoverage: '80')
          }
        }

      }
    }

    stage('Deploiement') {
      parallel {
        stage('Deploiement') {
          steps {
            git(url: 'https://github.com/maturity-source/Gitmaturity4.git', branch: 'master', poll: true)
          }
        }

        stage('error') {
          steps {
            echo 'commencement'
          }
        }

      }
    }

    stage('build') {
      steps {
        git(url: 'https://github.com/maturity-source/Gitmaturity4.git', branch: 'master')
        sh 'jenkins/build.bat'
      }
    }

  }
}