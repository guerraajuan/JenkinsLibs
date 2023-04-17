def call(Map params ){
    pipeline {
        agent any

        stages {
            stage('Paso 1') {
                steps {
                    echo "Hola:"+ params.nombre
                    
                }
            }
            stage('Paso 2') {
                steps {
                    echo "Tu apellido es:" + params.apellido
                    
                }
            }
        }
    }
}