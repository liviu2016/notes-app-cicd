pipeline {
  agent any
    
  tools {nodejs "nodeJS"}
    
  stages {
        
    stage('Git') {
      steps {
        git 'https://github.com/liviu2016/notes-app-cicd/'
      }
    }
     
    stage('Build') {
      steps {
        sh 'npm install'
         sh '<<Build Command>>'
      }
    }  
    
            
    stage('Test') {
      steps {
        sh 'node test'
      }
    }
  }
}
