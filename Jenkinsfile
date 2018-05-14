node {
   stage('Preparation') {
      checkout scm
   }
   stage('Build') {
      mvn compile
   }
   stage('Unit tests') {
      mvn test
   }
   stage('Package') {
      mvn package
   }
}
