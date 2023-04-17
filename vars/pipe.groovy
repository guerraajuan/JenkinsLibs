def call(Map param){
    pipeline {
        agent any

        stages {
            stage('Saludo') {
                steps {
                    echo "Hola: " + param.nombre 
                    
                }
            }
            stage('Despedida') {
                steps {
                    echo "Chao: "+ param.apellido
                    
                }
            }
        }
    }
}