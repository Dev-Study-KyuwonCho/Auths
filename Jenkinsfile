pipeline {
  agent {label "tutorial"}
  stages {
    stage('Hello') {
      steps {
        echo "hello from Jenkinsfile"
      }
    }
    stage(bugfix-branch) {
      when {
        branch "bugfix/*"
      }
      steps {
        sh '''
          cat README.md
        '''
      }
    }
    stage('PR') {
      when {
        branch 'PR/*'
      }
      steps {
        echo 'this only runs for the PRs'
      }
    }
  }
}
