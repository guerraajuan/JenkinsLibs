def call(Map param){
    pipeline {
        agent any

        stages {
            stage('Saludo') {
                steps {
                    echo "-------------------------------------------"
                    echo "Comienza Saludo desde test"
                    echo "Hola: " + param.nombre 
                    echo "Termina Saludo"
                    echo "-------------------------------------------"
                    
                }
            }
            stage('Despedida') {
                steps {
                    echo "-------------------------------------------"
                    echo "Comienza Despedida desde test"
                    echo "Chao: "+ param.apellido
                    echo "Termina Saludo"
                    echo "-------------------------------------------"
                    
                }
            }
        }
    }
}