// vars/standardBuild.groovy

def call(Closure body) {
    def config = [:]

    // Cho phép truyền tham số từ block gọi trong Jenkinsfile
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    node {
        stage('Preparation') {
            echo "Môi trường build: ${config.environment}"
        }

        docker.image(config.environment).inside {
            stage('Main Build') {
                echo "Thực thi script chính..."
                sh config.mainScript
            }

            stage('Post Build') {
                echo "Thực thi post-script..."
                sh config.postScript
            }
        }
    }
}
