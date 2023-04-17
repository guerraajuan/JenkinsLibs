def call(){
    pipeline {
        agent any

        stages {
            stage('Paso 1') {
                steps {
                    echo "Hola" 
                    
                }
            }
            stage('Paso 2') {
                steps {
                    echo "Chao"
                    
                }
            }
        }
    }
}