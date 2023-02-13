def compile(){
    if(app_lang == "nodejs"){
        sh 'npm install'
    }
    if(app_lang == "maven"){
        sh 'mvn package'
    }

    if(app_lang == "golang") {
        sh 'go mod init '
              sh  'go get '
              sh  'go build'
    }
}