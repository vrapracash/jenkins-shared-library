def getAccountID(String environment){
    switch(environment) { 
        case 'dev': 
            return "116981771137"
        case 'qa':
            return "116981771137"
        case 'uat':
            return "116981771137"
        case 'pre-prod':
            return "116981771137"
        case 'prod':
            return "116981771137"
        default:
            return "nothing"
    } 
}