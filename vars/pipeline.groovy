def call(String nombre ){
    pipeline {
        agent any

        stages {
            stage('Paso 1') {
                steps {
                    echo "Hola: ${nombre}" 
                    
                }
            }
            stage('Paso 2') {
                steps {
                    echo "Tu apellido es: ${nombre}"
                    
                }
            }
        }
    }
}