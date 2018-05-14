node {
   stage('Preparation') {
      checkout scm
   }
   stage('Build') {
      sh 'mvn compile'
   }
   stage('Unit tests') {
      sh 'mvn test'
   }
   stage('Package') {
      sh 'mvn package'
   }
}
