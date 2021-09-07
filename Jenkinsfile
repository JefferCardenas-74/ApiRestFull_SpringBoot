<<<<<<< HEAD
pipeline {  
    agent any
    options {
      timestamps()
    }

    environment {
      PATH_SONAR = tool"sonarqube-scanner"
      TO = "jesus.matiz@ingeneo.com.co"
    }    

    stages {
        stage('Build') {
            steps {
              echo "Building..."
              // sh 'mvn clean install -DskipTests'
            }
        } 
    }
    post {
      success {
        echo "Generando reporte"
        emailext body: "He recibido la nueva actualización",
        subject: "${env.JOB_NAME} | build: ${env.BUILD_NUMBER} - RECIBIDO",
        to: "${TO}",
        recipientProviders: [[$class: 'CulpritsRecipientProvider'], [$class: 'RequesterRecipientProvider']]
      }
    }
}
=======
pipeline {  
    agent any
    options {
      timestamps()
    }

    environment {
      PATH_SONAR = tool"sonarqube-scanner"
      TO = "jesus.matiz@ingeneo.com.co"
    }    

    stages {
        stage('Build') {
            steps {
              echo "Building..."
              // sh 'mvn clean install -DskipTests'
            }
        } 
    }
    post {
      success {
        echo "Generando reporte"
        emailext body: "He recibido la nueva actualización",
        subject: "${env.JOB_NAME} | build: ${env.BUILD_NUMBER} - RECIBIDO",
        to: "${TO}",
        recipientProviders: [[$class: 'CulpritsRecipientProvider'], [$class: 'RequesterRecipientProvider']]
      }
    }
}
>>>>>>> 33fccd2d3c23cfa5a5fe5575b59b6d494c49c03b
