node {
   stage('Preparation') {
      git clone git@github.com:GitHub4Adi/hellomaven.git
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