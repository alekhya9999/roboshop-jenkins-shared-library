def compile(){
    if(app_lang == "nodejs"){
        sh 'npm install'
    }
    if(app_lang == "maven"){
        sh 'mvn package'
    }
}

def unittests(){
    if(app_lang == "nodejs"){
        sh 'npm test || true'

    }
    if(app_lang == "maven"){
        sh 'mvn test'
    }

    if(app_lang == "python"){
        sh 'python3 -m unittest'
    }
}
def email(email_note) {
    println email_note
}