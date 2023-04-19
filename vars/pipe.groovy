def call(Map param){
    pipeline {
        agent any

        stages {
            stage('Saludo') {
                steps {
                    saludo(param.nombre)
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

def saludo(nombre){
    def nameList = [
        'Juan',
        'Jose',
        'Carlos',
        'Francisco',
        'Pedro'

    ]
    if (nombre in nameList){
        echo "---comienza saludo desde funcion----------------------------------------"
        echo "Hola: ${nombre}" 
        echo "-----Termina saludo desde funcion---------------------------------------"

    }
    else echo"Su nombre no se encuentra disponible en el listado $nameList"
}