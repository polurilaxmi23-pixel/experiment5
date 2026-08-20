pipeline {
  agent any
    stages {
    stage('compile') {
      steps {
        sh'javac HelloWorld.java'
        }
  }
stage('run') {
  step {
    sh.java'HelloWorld'
      }
}
}
}
