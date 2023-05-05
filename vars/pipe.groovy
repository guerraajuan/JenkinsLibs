def call(Map param){
    pipeline {
        agent any

        stages {
            stage('Saludo') {
                steps {
                    echo "-------------------------------------------"
                    echo "Hola: ${param.nombre}" 
                    echo "Edad: ${param.edad}" 
                    echo "Termina Saludo sin ajuste"
                    echo "agrego desde github"
                    echo "-------------------------------------------"
                    script {
                      def output = new helpers.Output()
                      output.SaludoNombre(param.nombre)
                    }
                    
                }
            }
            stage('Despedida') {
                steps {
                    echo "-------------------------------------------"
                    echo "Chao:  ${param.apellido}"
                    echo "Termina Despedida"
                    echo "-------------------------------------------"
                    figlet "FIN DE PIPELINE"
                    
                }
            }
        }
    }
}
