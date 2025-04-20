// Không dùng call()

def build(String imageName, String tag) {
    sh "echo Building image ${imageName}:${tag}"
    // sh "docker build -t ${imageName}:${tag} ."
}

def push(String imageName, String tag) {
    sh "echo Pushing image ${imageName}:${tag}"
    // sh "docker push ${imageName}:${tag}"
}
