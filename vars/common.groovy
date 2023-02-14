def compile(){
    if(app_lang == "nodejs"){
        sh 'npm install'
    }
    if(app_lang == "maven"){
        sh 'mvn package'
    }
}
def unittests() {
    if (app_lang == "nodejs") {
        try {
            sh 'npm test'
        }
        catch (Exception e) {
            email("unit tests failed")
        }

    }
    if(app_lang == "mave n"){
        sh 'mvn test'
    }

    if(app_lang == "pytho n"){
        sh 'python3 -m unittest'
    }
  }

def email(email_note){
    println email_note
 }


