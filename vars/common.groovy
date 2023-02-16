def compile(){
    if(app_lang == "nodejs"){
        sh 'npm install'
        sh 'env'
    }
    if(app_lang == "maven"){
        sh 'mvn package'
    }
        if(app_lang == "golang"){
        sh  ' go mod init dispatch || true'
        sh  'go get'
        sh  'go build'
    }
}
def unittests() {
    if (app_lang == "nodejs") {
            sh 'npm test '
        }
    }
    if(app_lang == "maven"){
        sh 'mvn test'
    }
    if(app_lang == "python"){
        sh 'python3 -m unittest'
    }
    if(app_lang == "golang"){
    sh 'go test'
}
    def email(email_note) {
        mail bcc: '', body: "job failed -${JOB_BASE_NAME}\\n Jenkins URL - ${JOB_URL}", cc: '',
                from: 'asri42080@gmail.com', replyTo: '', subject: "jenkins job failed -${JOB_BASE_NAME}", to: 'asri42080@gmail.com'
    }




