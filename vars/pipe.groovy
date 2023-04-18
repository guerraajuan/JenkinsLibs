def call(Map param){
    pipeline {
        agent any

        stages {
            stage('Saludo') {
                steps {
                    echo "-------------------------------------------"
                    echo "Hola: ${param.nombre}" 
                    echo "Termina Saludo"
                    echo "-------------------------------------------"
                    
                }
            }
            stage('Despedida') {
                steps {
                    echo "-------------------------------------------"
                    echo "Chao:  ${param.apellido}"
                    echo "Termina Despedida"
                    echo "-------------------------------------------"
                    
                }
            }
        }
    }
}